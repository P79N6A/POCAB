package com.bnpp.galaxy.gxt.app.configuration.batch;

import com.bnpp.galaxy.dto.IssueManDto;
import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.gxt.app.utils.FileResourceUtils;
import com.bnpp.galaxy.gxt.app.utils.MessageHeaderBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sophis.instrument.Ratings;
import net.sophis.sophis.gxml.dataexchange.ImportMarketDataMessage;
import org.fpml._2005.fpml_4_2.MessageHeader;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.support.CompositeItemProcessor;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@EnableBatchProcessing
public class IssueManBatchConfiguration {

    private final JobExecutionListener gxtJobExecutionListener;
    private final ObjectMapper objectMapper;
    private final ItemProcessor<?, JsonNode> commonProcessor;
    private final StepBuilderFactory stepBuilders;
    private final JobBuilderFactory jobBuilders;
    private final Step commonEndStep;

    public IssueManBatchConfiguration(JobExecutionListener gxtJobExecutionListener,
                                      @Qualifier("jsonFlattenerMapper") ObjectMapper objectMapper,
                                      @Qualifier("commonProcessor") ItemProcessor<?, JsonNode> commonProcessor,
                                      StepBuilderFactory stepBuilders, JobBuilderFactory jobBuilders, Step commonEndStep) {
        this.gxtJobExecutionListener = gxtJobExecutionListener;
        this.objectMapper = objectMapper;
        this.commonProcessor = commonProcessor;
        this.stepBuilders = stepBuilders;
        this.jobBuilders = jobBuilders;
        this.commonEndStep = commonEndStep;
    }

    @Bean
    public Job issueManJob() {
        return jobBuilders.get("issueManJob")
                .incrementer(new RunIdIncrementer())
                .start(initIssueManStep())
                .next(issueManStep(null))
                .next(commonEndStep)
                .listener(gxtJobExecutionListener)
                .build();
    }

    @Bean
    @JobScope
    public Step initIssueManStep() {
        return stepBuilders.get(("initIssueManStep"))
                .tasklet(initIssueManTasklet(null))
                .build();
    }

    @Bean
    @JobScope
    public Tasklet initIssueManTasklet(@Value("#{jobExecution}") JobExecution jobExecution) {
        return (StepContribution contribution, ChunkContext chunkContext) -> {
            ImportMarketDataMessage message = new ImportMarketDataMessage();
            MessageHeader messageHeader = new MessageHeaderBuilder()
                    .messageId("001")
                    .sendBy("MAN")
                    .sendTo("SOPHIS")
                    .creationTimeStamp("2005-09-19T13:52:00")
                    .build();

            message.setHeader(messageHeader);

            jobExecution.getExecutionContext().put(Constants.In_MEMORY_BATCH_STORE, message);
            return RepeatStatus.FINISHED;
        };
    }

    @Bean
    @JobScope
    public Step issueManStep(@Value("#{jobExecution}") JobExecution jobExecution) {
        return stepBuilders
                .get("issueManStep")
                .<IssueManDto, Ratings>chunk(50)
                .reader(multipleIssueManReader(null))
                .processor(issueManProcessor())
                .writer(items -> {
                    ImportMarketDataMessage message = (ImportMarketDataMessage) jobExecution.getExecutionContext()
                            .get(Constants.In_MEMORY_BATCH_STORE);
                    message.getRatings().addAll(items);
                }).build();
    }

    @Bean
    @StepScope
    public MultiResourceItemReader<IssueManDto> multipleIssueManReader(@Value("#{jobParameters[files]}") String filePath) {
        MultiResourceItemReader<IssueManDto> resourceItemReader = new MultiResourceItemReader<>();
        resourceItemReader.setResources(FileResourceUtils.getResourcesFromFilepath(filePath));
        resourceItemReader.setDelegate(issueManItemReader(null, null));
        return resourceItemReader;
    }

    @Bean
    @StepScope
    public FlatFileItemReader<IssueManDto> issueManItemReader(@Value("#{jobParameters[rowOffset]}") Long rowOffset,
                                                              @Value("#{jobParameters[separator]}") String separator) {
        FlatFileItemReader<IssueManDto> reader = new FlatFileItemReader<>();
        reader.setName("issueManReader");
        reader.setLinesToSkip(Math.toIntExact(rowOffset));
        reader.setLineMapper(new IssueManLineMapper(separator));
        return reader;
    }

    @Bean
    @JobScope
    public ItemProcessor<IssueManDto, Ratings> issueManProcessor() {
        CompositeItemProcessor<IssueManDto, Ratings> processor = new CompositeItemProcessor<>();
        processor.setDelegates(Arrays.asList(commonProcessor, issueManPostProcessor()));
        return processor;
    }

    @Bean
    @JobScope
    public ItemProcessor<JsonNode, Ratings> issueManPostProcessor() {
        return item -> objectMapper.convertValue(item, Ratings.class);
    }

    private final class IssueManLineMapper implements LineMapper<IssueManDto> {

        private String separator;

        IssueManLineMapper(String separator) {
            this.separator = separator;
        }

        @Override
        public IssueManDto mapLine(String line, int lineNumber) {
            if (lineNumber == 1) {
                return null;
            }
            String[] fields = line.split(separator);
            IssueManDto issueManDto = new IssueManDto();

            issueManDto.setIsin(fields[0]);
            issueManDto.setLibelle(fields[1]);
            issueManDto.setMan(fields[2]);
            issueManDto.setMans2(fields[3]);
            issueManDto.setRatingDate(fields[4]);

            return issueManDto;
        }

    }

}
