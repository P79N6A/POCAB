package com.bnpp.galaxy.gxt.app.configuration.batch.refcours;

import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sophis.quotation.QuotationsByInstrument;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
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

import com.bnpp.galaxy.gxt.app.generatedxml.FixingType;
import com.bnpp.galaxy.gxt.app.utils.FileResourceUtils;

@Configuration
@EnableBatchProcessing
public class TxcBatchConfiguration {

    private final JobExecutionListener                       gxtJobExecutionListener;
    private final ObjectMapper                               objectMapper;
    private final ItemProcessor<?, JsonNode>                 commonProcessor;
    private final StepBuilderFactory                         stepBuilders;
    private final JobBuilderFactory                          jobBuilders;
    private final Step                                       refcoursCommonStartStep;
    private final ItemWriter<QuotationsByInstrument> refCoursCommonWriter;
    private final Step                                       commonEndStep;
    private final Jaxb2Marshaller                            readerMarshaller;

    public TxcBatchConfiguration(JobExecutionListener gxtJobExecutionListener,
                                 @Qualifier("jsonFlattenerMapper") ObjectMapper objectMapper,
                                 @Qualifier("commonProcessor") ItemProcessor<?, JsonNode> commonProcessor,
                                 StepBuilderFactory stepBuilders, JobBuilderFactory jobBuilders, Step refcoursCommonStartStep,
                                 ItemWriter<QuotationsByInstrument> refCoursCommonWriter,
                                 Step commonEndStep, Jaxb2Marshaller readerMarshaller) {
        this.gxtJobExecutionListener = gxtJobExecutionListener;
        this.objectMapper = objectMapper;
        this.commonProcessor = commonProcessor;
        this.stepBuilders = stepBuilders;
        this.jobBuilders = jobBuilders;
        this.refcoursCommonStartStep = refcoursCommonStartStep;
        this.refCoursCommonWriter = refCoursCommonWriter;
        this.commonEndStep = commonEndStep;
        this.readerMarshaller = readerMarshaller;
    }

    @Bean
    public Job txcJob() {
        return jobBuilders.get("txcJob")
                          .incrementer(new RunIdIncrementer())
                          .start(refcoursCommonStartStep)
                          .next(txcStep())
                          .next(commonEndStep)
                          .listener(gxtJobExecutionListener)
                          .build();
    }

    @Bean
    @JobScope
    public Step txcStep() {
        return stepBuilders.get("txcStep")
                .<FixingType, QuotationsByInstrument>chunk(10)
                .reader(multipleTxcReader(null))
                .processor(txcItemProcessor())
                .writer(refCoursCommonWriter)
                .build();
    }

    @Bean
    @JobScope
    public MultiResourceItemReader<FixingType> multipleTxcReader(@Value("#{jobParameters[files]}") String filePath) {
        MultiResourceItemReader<FixingType> resourceItemReader = new MultiResourceItemReader<>();
        resourceItemReader.setResources(FileResourceUtils.getResourcesFromFilepath(filePath));
        resourceItemReader.setDelegate(txcItemReader());
        return resourceItemReader;
    }

    @Bean
    public StaxEventItemReader<FixingType> txcItemReader() {
        StaxEventItemReader<FixingType> staxEventItemReader = new StaxEventItemReader<>();
        staxEventItemReader.setName("txcItemReader");
        staxEventItemReader.setFragmentRootElementName("Fixing");
        staxEventItemReader.setUnmarshaller(readerMarshaller);
        return staxEventItemReader;
    }

    @Bean
    @JobScope
    public ItemProcessor<FixingType, QuotationsByInstrument> txcItemProcessor() {
        CompositeItemProcessor<FixingType, QuotationsByInstrument> processor = new CompositeItemProcessor<>();
        processor.setDelegates(Arrays.asList(commonProcessor, txcPostProcessor()));
        return processor;
    }

    @Bean
    public ItemProcessor<JsonNode, QuotationsByInstrument> txcPostProcessor() {
        return item -> objectMapper.convertValue(item, QuotationsByInstrument.class);
    }

}
