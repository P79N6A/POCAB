package com.bnpp.galaxy.gxt.app.configuration.batch.refcours;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sophis.quotation.Quotations;
import net.sophis.quotation.QuotationsByInstrument;
import net.sophis.sophis.gxml.dataexchange.ImportMessage;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.support.CompositeItemProcessor;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.bnpp.galaxy.gxt.app.batch.enricher.CustomMultiResourceItemReader;
import com.bnpp.galaxy.gxt.app.batch.enricher.ResourceAwareItem;
import com.bnpp.galaxy.gxt.app.batch.listeners.GxtSkipListener;
import com.bnpp.galaxy.gxt.app.batch.listeners.InterceptingJobExecution;
import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.gxt.app.generatedxml.QuotationType;
import com.bnpp.galaxy.gxt.app.utils.FileResourceUtils;

import static com.bnpp.galaxy.gxt.app.common.utils.Constants.BATCH_CURRENT_RESOURCE;

@Configuration
@EnableBatchProcessing
public class CoursBatchConfiguration {

    private final InterceptingJobExecution   interceptingJobExecution;
    private final JobExecutionListener       gxtJobExecutionListener;
    private final ObjectMapper               objectMapper;
    private final ItemProcessor<?, JsonNode> commonProcessor;
    private final StepBuilderFactory         stepBuilders;
    private final JobBuilderFactory          jobBuilders;
    private final Step                       refcoursCommonStartStep;
    private final Step                       commonEndStep;
    private final Jaxb2Marshaller            readerMarshaller;

    public CoursBatchConfiguration(InterceptingJobExecution interceptingJobExecution,
                                   JobExecutionListener gxtJobExecutionListener,
                                   @Qualifier("jsonFlattenerMapper") ObjectMapper objectMapper,
                                   @Qualifier("commonProcessor") ItemProcessor<?, JsonNode> commonProcessor,
                                   StepBuilderFactory stepBuilders, JobBuilderFactory jobBuilders, Step refcoursCommonStartStep,
                                   Step commonEndStep, Jaxb2Marshaller readerMarshaller) {
        this.interceptingJobExecution = interceptingJobExecution;
        this.gxtJobExecutionListener = gxtJobExecutionListener;
        this.objectMapper = objectMapper;
        this.commonProcessor = commonProcessor;
        this.stepBuilders = stepBuilders;
        this.jobBuilders = jobBuilders;
        this.refcoursCommonStartStep = refcoursCommonStartStep;
        this.commonEndStep = commonEndStep;
        this.readerMarshaller = readerMarshaller;
    }

    @Bean
    public Job coursJob() {
        return jobBuilders.get("coursJob")
                          .incrementer(new RunIdIncrementer())
                          .start(refcoursCommonStartStep)
                          .next(coursStep())
                          .next(commonEndStep)
                          .listener(gxtJobExecutionListener)
                          .listener(interceptingJobExecution)
                          .build();
    }

    @Bean
    @JobScope
    public Step coursStep() {
        return stepBuilders.get("coursStep")
                .<ResourceAwareItem<QuotationType>, ResourceAwareItem<QuotationsByInstrument>>chunk(10)
                .reader(multipleCoursReader(null))
                .processor(coursItemProcessor())
                .writer(coursMultiWriter(null))
                .faultTolerant()
                .listener(GxtSkipListener.class)
                .build();
    }

    @Bean
    @JobScope
    public CustomMultiResourceItemReader<QuotationType> multipleCoursReader(@Value("#{jobParameters[files]}") String filePath) {
        MultiResourceItemReader<QuotationType> resourceItemReader = new MultiResourceItemReader<>();
        resourceItemReader.setResources(FileResourceUtils.getResourcesFromFilepath(filePath));
        resourceItemReader.setDelegate(coursItemReader());
        return new CustomMultiResourceItemReader<>(resourceItemReader);
    }

    @Bean
    @JobScope
    public ItemProcessor<ResourceAwareItem<QuotationType>, ResourceAwareItem<QuotationsByInstrument>> coursItemProcessor() {
        CompositeItemProcessor<ResourceAwareItem<QuotationType>, ResourceAwareItem<QuotationsByInstrument>> processor = new CompositeItemProcessor<>();
        processor.setDelegates(Arrays.asList(commonProcessor, coursPostProcessor()));
        return processor;
    }

    @Bean
    public StaxEventItemReader<QuotationType> coursItemReader() {
        StaxEventItemReader<QuotationType> staxEventItemReader = new StaxEventItemReader<>();
        staxEventItemReader.setName("coursItemReader");
        staxEventItemReader.setFragmentRootElementName("Quotation");
        staxEventItemReader.setUnmarshaller(readerMarshaller);
        return staxEventItemReader;
    }

    @Bean
    public ItemProcessor<ResourceAwareItem<JsonNode>, ResourceAwareItem<QuotationsByInstrument>> coursPostProcessor() {
        return item -> new ResourceAwareItem<>(objectMapper.convertValue(item.getItem(), QuotationsByInstrument.class), item
                .getResource());
    }

    @Bean
    @JobScope
    public ItemWriter<ResourceAwareItem<QuotationsByInstrument>> coursMultiWriter(@Value("#{jobExecution}") JobExecution jobExecution) {
        return items -> {
            ExecutionContext executionContext = jobExecution.getExecutionContext();
            ImportMessage importMessage = (ImportMessage) executionContext.get(Constants.In_MEMORY_BATCH_STORE);
            List<Quotations> quotations = importMessage.getQuotations();
            String currentResource = (String) executionContext.get(BATCH_CURRENT_RESOURCE);
            for (ResourceAwareItem<QuotationsByInstrument> item : items) {
                if (currentResource == null) {
                    currentResource = item.getResource();
                } else if (!currentResource.equals(item.getResource())) {
                    currentResource = item.getResource();
                    quotations.add(new Quotations());
                }
                quotations.get(quotations.size() - 1).getQuotationsByInstrument().add(item.getItem());
            }
            executionContext.put(BATCH_CURRENT_RESOURCE, currentResource);
        };
    }

}
