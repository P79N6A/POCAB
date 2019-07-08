package com.bnpp.galaxy.gxt.app.configuration.batch;

import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;
import org.fpml._2005.fpml_4_2.Message;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.support.JobRegistryBeanPostProcessor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.CompositeItemProcessor;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.bnpp.galaxy.gxt.app.batch.enricher.ResourceAwareItem;
import com.bnpp.galaxy.gxt.app.batch.enricher.RootlessStaxEventItemWriter;
import com.bnpp.galaxy.gxt.app.batch.processors.GXTEngineItemProcessor;
import com.bnpp.galaxy.gxt.app.batch.processors.JsonConverterItemProcessor;
import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.gxt.app.engine.configuration.GXTEngineConfigurationPreloader;
import com.bnpp.galaxy.gxt.app.engine.core.GXTEngine;
import com.bnpp.galaxy.gxt.app.engine.core.json.JsonGXTEngineTarget;

@Configuration
public class BatchGeneralConfiguration {

    private final GXTEngine<JsonGXTEngineTarget>  gxtEngine;
    private final JsonConverterItemProcessor      jsonConverterItemProcessor;
    private final GXTEngineConfigurationPreloader loader;
    private final Jaxb2Marshaller                 marshaller;
    private final StepBuilderFactory              stepBuilders;

    public BatchGeneralConfiguration(GXTEngine<JsonGXTEngineTarget> gxtEngine,
                                     JsonConverterItemProcessor jsonConverterItemProcessor,
                                     GXTEngineConfigurationPreloader loader,
                                     @Qualifier("writerMarshaller") Jaxb2Marshaller marshaller,
                                     StepBuilderFactory stepBuilders) {
        this.gxtEngine = gxtEngine;
        this.jsonConverterItemProcessor = jsonConverterItemProcessor;
        this.loader = loader;
        this.marshaller = marshaller;
        this.stepBuilders = stepBuilders;
    }

    @Bean
    public JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor(JobRegistry jobRegistry) {
        JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor = new JobRegistryBeanPostProcessor();
        jobRegistryBeanPostProcessor.setJobRegistry(jobRegistry);
        return jobRegistryBeanPostProcessor;
    }

    @Bean
    @JobScope
    public ItemProcessor<?, JsonNode> commonProcessor() {
        CompositeItemProcessor<?, JsonNode> processor = new CompositeItemProcessor<>();
        processor.setDelegates(Arrays.asList(
                // Convert the object into a JSON as Engine is designed to process only JSON nodes
                jsonConverterItemProcessor,
                // Run Engine on JSONized input value
                new GXTEngineItemProcessor<>(gxtEngine),
                // Get the JSON from GXT output
                processGxtOutput()
        ));
        return processor;
    }

    @Bean
    public ItemProcessor<JsonGXTEngineTarget, ?> processGxtOutput() {
        return jsonGXTEngineTarget -> jsonGXTEngineTarget.getResource() == null
                ? jsonGXTEngineTarget.getSource()
                : new ResourceAwareItem<>(jsonGXTEngineTarget.getSource(), jsonGXTEngineTarget.getResource());
    }

    @Bean
    @JobScope
    public Step commonEndStep(@Value("#{jobExecution}") JobExecution jobExecution) {
        return stepBuilders.get("commonEndStep")
                .<Message, Message>chunk(1)
                .reader(() -> {
                    Message message = (Message) jobExecution.getExecutionContext().get(Constants.In_MEMORY_BATCH_STORE);
                    jobExecution.getExecutionContext().put(Constants.In_MEMORY_BATCH_STORE, null);
                    return message;
                })
                .writer(commonWriter(null))
                .build();
    }

    @Bean(destroyMethod="")
    @JobScope
    public StaxEventItemWriter<Message> commonWriter(@Value("#{jobParameters[outputFile]}") String outputFile) {
        StaxEventItemWriter<Message> itemWriter = new RootlessStaxEventItemWriter<>();
        itemWriter.setName("commonWriter");
        itemWriter.setMarshaller(marshaller);
        itemWriter.setResource(new FileSystemResource(outputFile));
        itemWriter.setRootTagName("");
        itemWriter.setOverwriteOutput(true);
        return itemWriter;
    }

    @Bean
    public JobExecutionListener gxtJobExecutionListener() {
        return new JobExecutionListener() {
            @Override
            public void beforeJob(JobExecution jobExecution) {
                loader.preload(jobExecution.getJobParameters().getString("partnershipName"));
            }

            @Override
            public void afterJob(JobExecution jobExecution) {
                loader.unload(jobExecution.getJobParameters().getString("partnershipName"));
            }
        };
    }

}
