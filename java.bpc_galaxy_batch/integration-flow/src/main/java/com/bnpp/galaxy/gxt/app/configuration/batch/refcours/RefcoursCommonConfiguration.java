package com.bnpp.galaxy.gxt.app.configuration.batch.refcours;

import java.util.Collections;
import java.util.List;

import net.sophis.quotation.Quotations;
import net.sophis.quotation.QuotationsByInstrument;
import net.sophis.sophis.gxml.dataexchange.ImportMessage;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.gxt.app.utils.MessageHeaderBuilder;

@Configuration
public class RefcoursCommonConfiguration {

    private final StepBuilderFactory stepBuilders;

    public RefcoursCommonConfiguration(StepBuilderFactory stepBuilders) {
        this.stepBuilders = stepBuilders;
    }

    @Bean
    @JobScope
    public Step refcoursCommonStartStep() {
        return stepBuilders.get(("refcoursCommonStartStep"))
                           .tasklet(initCoursTasklet(null))
                           .build();
    }

    @Bean
    @JobScope
    public Tasklet initCoursTasklet(@Value("#{jobExecution}") JobExecution jobExecution) {
        return (StepContribution contribution, ChunkContext chunkContext) -> {
            ImportMessage message = new ImportMessage();

            List<Quotations> quotationsList = message.getQuotations();
            Quotations quotations = new Quotations();
            quotationsList.add(quotations);

            message.setHeader(new MessageHeaderBuilder().build());
            message.setQuotations(Collections.singletonList(quotations));

            jobExecution.getExecutionContext().put(Constants.In_MEMORY_BATCH_STORE, message);
            return RepeatStatus.FINISHED;
        };
    }

    @Bean
    @JobScope
    public ItemWriter<QuotationsByInstrument> refCoursCommonWriter(@Value("#{jobExecution}") JobExecution jobExecution) {
        return items -> {
            ImportMessage importMessage = (ImportMessage) jobExecution.getExecutionContext()
                                                                      .get(Constants.In_MEMORY_BATCH_STORE);
            List<Quotations> quotations = importMessage.getQuotations();
            quotations.get(quotations.size() - 1).getQuotationsByInstrument().addAll(items);
        };
    }

}
