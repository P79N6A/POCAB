package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.gxt.app.exception.ErrorChannelException;
import com.bnpp.galaxy.gxt.app.exception.ErrorChannelHandler;
import com.bnpp.galaxy.gxt.app.exception.GxtBuisnessException;
import com.bnpp.galaxy.gxt.app.exception.GxtExceptionThrower;
import com.bnpp.galaxy.gxt.app.integration.FileMessageToProcessedFileInfoTransformer;
import com.bnpp.galaxy.gxt.app.integration.FilesToJobRequestTransformer;
import com.bnpp.galaxy.gxt.app.integration.InboundChannelFileListFilter;
import com.bnpp.galaxy.gxt.app.integration.ProcessedFileInfoHandler;
import com.bnpp.galaxy.services.GXTConfiguesService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.integration.launch.JobLaunchingMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.endpoint.SourcePollingChannelAdapter;
import org.springframework.integration.file.FileLocker;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.locking.NioFileLocker;
import org.springframework.messaging.MessageChannel;

import javax.annotation.PostConstruct;
import java.io.File;


@Configuration
@EnableIntegration
@PropertySource("classpath:integration.properties")
@EnableConfigurationProperties(IntegrationProperties.class)
@IntegrationComponentScan("com.bnpp.galaxy.gxt.app.configuration")
public class IntegrationConfiguration {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    @Qualifier("errorChannel")
    private PublishSubscribeChannel errorChannel;

    @Autowired
    private GxtExceptionThrower<ErrorChannelException, GxtBuisnessException> errorChannelToGxtxceptionThrower;

    @Autowired
    private GXTConfiguesService gxtConfiguesService;

    @Autowired
    private IntegrationProperties integrationProperties;

    private IntegrationProperties.In.Vacation vacationConfig() {
        return integrationProperties.getIn().getVacation();
    }

    private IntegrationProperties.In.Push watcherConfig() {
        return integrationProperties.getIn().getPush();
    }

    @PostConstruct
    public void loadActiveConfig() {
        // CachableInfo.activeConfig = gxtConfiguesService.getActifConfig();
        // TODO: Business Logic
        return;
    }

    @Bean(Channels.INBOUND_CHANNEL)
    public MessageChannel inboundChannel() {
        return new DirectChannel();
    }

    @Bean
    public InboundChannelFileListFilter watcherInboundChannelFileListFilter() {
        IntegrationProperties.Filter filter = watcherConfig().getFilter();

        return new InboundChannelFileListFilter(filter.getFilename(), filter.getAge(), filter.getIsEndOfFile());
    }

    @Bean
    public InboundChannelFileListFilter vacationInboundChannelFileListFilter() {
        IntegrationProperties.Filter filter = vacationConfig().getFilter();

        return new InboundChannelFileListFilter(filter.getFilename(), filter.getAge(), filter.getIsEndOfFile());
    }

    @Bean
    @Order
    public ApplicationRunner inboundChannelStarter(SourcePollingChannelAdapter channelAdapter) {
        return args -> {
            logger.info("Starting InboundChannelAdapter: {}", channelAdapter);
            channelAdapter.start();
        };
    }

    @Bean
    @InboundChannelAdapter(channel = Channels.INBOUND_CHANNEL, poller = @Poller(fixedDelay = IntegrationProperties.In.Push.Poller.DELAY_SPEL), autoStartup = "false")
    public MessageSource<File> fileReadingMessageSource() {
        FileReadingMessageSource source = new FileReadingMessageSource();

        source.setAutoCreateDirectory(watcherConfig().isAutoCreateDirectory());
        source.setDirectory(watcherConfig().getDirectory().toFile());
        source.setFilter(watcherInboundChannelFileListFilter());
        source.setLocker(fileLocker());
        return source;
    }

    @Bean
    public FileLocker fileLocker() {
        return new NioFileLocker();
    }

    @Bean
    public IntegrationFlow jobLauncherFlow() {
        return IntegrationFlows.from(Channels.JOB_CHANNEL).wireTap("archiveBefore")
                .transform(fileMessageToJobRequestTransformer()).handle(jobLaunchingMessageHandler(null))
                .wireTap("archiveAfter").wireTap("purgeAfter")
                // .transform(fileMessageToProcessedFileInfo())
                // .handle(fileProcessor())
                .get();
    }

    @Bean
    public IntegrationFlow archiveBeforeFlow() {
        return IntegrationFlows.from("archiveBefore").handle("integrationArchiveService", "archiveBefore").get();
    }

    @Bean
    public IntegrationFlow archiveAfterFlow() {
        return IntegrationFlows.from("archiveAfter").handle("integrationArchiveService", "archiveAfter").get();
    }

    @Bean
    public IntegrationFlow purgeAfterFlow() {
        return IntegrationFlows.from("purgeAfter").handle("integrationCleaningService", "purgeAfter").get();
    }

    @Bean
    public ErrorChannelHandler errorChannelHandler() {
        return new ErrorChannelHandler();
    }

    @Bean
    public IntegrationFlow errorHandlingFlow() {
        return IntegrationFlows.from(errorChannel).handle(errorChannelHandler()).get();
    }

    @Bean
    public FilesToJobRequestTransformer fileMessageToJobRequestTransformer() {
        return new FilesToJobRequestTransformer();
    }

    @Bean
    JobLaunchingMessageHandler jobLaunchingMessageHandler(JobLauncher jobLauncher) {
        return new JobLaunchingMessageHandler(jobLauncher);
    }

    @Bean
    public FileMessageToProcessedFileInfoTransformer fileMessageToProcessedFileInfo() {
        return new FileMessageToProcessedFileInfoTransformer();
    }

    @Bean
    public ProcessedFileInfoHandler fileProcessor() {
        return new ProcessedFileInfoHandler();
    }

}
