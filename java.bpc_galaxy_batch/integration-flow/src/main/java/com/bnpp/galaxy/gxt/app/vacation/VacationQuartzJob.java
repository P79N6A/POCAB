package com.bnpp.galaxy.gxt.app.vacation;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.file.filters.FileListFilter;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.integration.support.utils.IntegrationUtils;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.bnpp.galaxy.gxt.app.configuration.Channels.INBOUND_CHANNEL;

/**
 * Quartz job that read files from vacation directory and send them as payload of {@link Message Messages} to the
 * inbound channel
 */
@Component
public class VacationQuartzJob implements Job {

    final static String PARAM_PARTNERSHIP_NAME = "partnershipName";

    private final Logger logger = LogManager.getLogger(getClass());

    private IntegrationProperties integrationProperties;
    private MessageBuilderFactory messageBuilderFactory;
    private PartnershipService partnershipService;
    private MessageChannel channel;
    private FileListFilter<File> fileListFilter;

    // Use setter injection instead of constructor injection as Quartz require a default no-arg constructor
    public VacationQuartzJob() {

    }

    @Autowired
    public void setIntegrationProperties(IntegrationProperties integrationProperties) {
        this.integrationProperties = integrationProperties;
    }

    @Autowired
    @Qualifier(IntegrationUtils.INTEGRATION_MESSAGE_BUILDER_FACTORY_BEAN_NAME)
    public void setMessageBuilderFactory(MessageBuilderFactory messageBuilderFactory) {
        this.messageBuilderFactory = messageBuilderFactory;
    }

    @Autowired
    public void setPartnershipService(PartnershipService partnershipService) {
        this.partnershipService = partnershipService;
    }

    @Autowired
    @Qualifier(INBOUND_CHANNEL)
    public void setChannel(MessageChannel channel) {
        this.channel = channel;
    }

    @Autowired
    @Qualifier("vacationInboundChannelFileListFilter")
    public void setFileListFilter(FileListFilter<File> fileListFilter) {
        this.fileListFilter = fileListFilter;
    }

    private IntegrationProperties.In.Vacation config() {
        return integrationProperties.getIn().getVacation();
    }

    private Predicate<Path> buildFileFilter(PartnershipSettings settings) {
        Pattern pattern = Objects.requireNonNull(settings.getInputFilenamePattern(), "Input filename pattern");

        return path -> Files.isRegularFile(path)
                && pattern.matcher(path.getFileName().toString()).find();
    }

    private Message<?> buildOutboundMessage(List<Path> files, PartnershipSettings partnership) {
        return messageBuilderFactory.withPayload(files)
                .setHeader(Constants.PARTNERSHIP_HEADER, partnership)
                .setHeader(Constants.VACATION_HEADER, true)
                .build();
    }

    // Ugly code just to delegate to app-wide files filter
    private List<Path> filterFiles(List<Path> files) {
        File[] array = new File[files.size()];

        for (int i = 0; i < files.size(); i++) {
            array[i] = files.get(i).toFile();
        }

        List<File> filtered = fileListFilter.filterFiles(array);

        return filtered.stream().map(File::toPath).collect(Collectors.toList());
    }

    private boolean checkExecutable(String partnershipName) {
        if (partnershipService.isHold(partnershipName)) {
            logger.warn("Could not run vacation job due to HOLD flag for partnership: {}", partnershipName);
            return false;
        }

        if (partnershipService.isLocked(partnershipName)) {
            logger.warn("Could not run vacation job due to LOCK flag for partnership: {}", partnershipName);
            return false;
        }

        return true;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Path vacationDirectory = Objects.requireNonNull(config().getDirectory(), "vacation directory");
        JobDataMap data = context.getMergedJobDataMap();
        String partnershipName = data.getString(PARAM_PARTNERSHIP_NAME);

        if (!checkExecutable(partnershipName)) {
            return;
        }

        PartnershipSettings settings = partnershipService.findPartnershipSettingsByName(partnershipName);
        Predicate<Path> filter = buildFileFilter(settings);

        logger.info("Running vacation job for partnership {} from {}", partnershipName, vacationDirectory);

        if (!Files.isDirectory(vacationDirectory)) {
            if (config().isAutoCreateDirectory()) {
                try {
                    Files.createDirectories(vacationDirectory);
                } catch (IOException e) {
                    throw new JobExecutionException(e);
                }
            } else {
                logger.error("Unable to run vacation job - vacation directory does not exist: {}", vacationDirectory);
                return;
            }
        }

        List<Path> files;

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(vacationDirectory, filter::test)) {
            files = StreamSupport.stream(stream.spliterator(), false).collect(Collectors.toList());

            files = filterFiles(files);
        } catch (UncheckedIOException e) {
            throw new JobExecutionException(e.getCause());
        } catch (IOException e) {
            throw new JobExecutionException(e);
        }

        if (files.isEmpty()) {
            logger.info("No files found for partnership vacation {} from {}", partnershipName, vacationDirectory);
        } else {
            Message<?> message = buildOutboundMessage(files, settings);

            logger.info("Found {} files for partnership vacation {} from {}, sending message to integration flow with payload: {}",
                    files.size(), partnershipName, vacationDirectory, files);

            channel.send(message);
        }
    }

}
