package com.bnpp.galaxy.gxt.app.configuration.batch.refcours;

import com.bnpp.galaxy.dto.ManuelDto;
import com.bnpp.galaxy.gxt.app.utils.FileResourceUtils;
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
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.support.CompositeItemProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@EnableBatchProcessing
public class ManuelBatchConfiguration {

    private final JobExecutionListener gxtJobExecutionListener;
    private final ObjectMapper objectMapper;
    private final ItemProcessor<?, JsonNode> commonProcessor;
    private final StepBuilderFactory stepBuilders;
    private final JobBuilderFactory jobBuilders;
    private final Step refcoursCommonStartStep;
    private final ItemWriter<QuotationsByInstrument> refCoursCommonWriter;
    private final Step commonEndStep;

    public ManuelBatchConfiguration(JobExecutionListener gxtJobExecutionListener,
                                    @Qualifier("jsonFlattenerMapper") ObjectMapper objectMapper,
                                    @Qualifier("commonProcessor") ItemProcessor<?, JsonNode> commonProcessor,
                                    StepBuilderFactory stepBuilders, JobBuilderFactory jobBuilders, Step refcoursCommonStartStep,
                                    ItemWriter<QuotationsByInstrument> refCoursCommonWriter,
                                    Step commonEndStep) {
        this.gxtJobExecutionListener = gxtJobExecutionListener;
        this.objectMapper = objectMapper;
        this.commonProcessor = commonProcessor;
        this.stepBuilders = stepBuilders;
        this.jobBuilders = jobBuilders;
        this.refcoursCommonStartStep = refcoursCommonStartStep;
        this.refCoursCommonWriter = refCoursCommonWriter;
        this.commonEndStep = commonEndStep;
    }

    @Bean
    public Job manuelJob() {
        return jobBuilders.get("manuelJob")
                .incrementer(new RunIdIncrementer())
                .start(refcoursCommonStartStep)
                .next(manuelStep())
                .next(commonEndStep)
                .listener(gxtJobExecutionListener)
                .build();
    }

    @Bean
    @JobScope
    public Step manuelStep() {
        return stepBuilders.get("manuelStep")
                .<ManuelDto, QuotationsByInstrument>chunk(10)
                .reader(multipleManuelReader(null))
                .processor(manuelItemProcessor())
                .writer(refCoursCommonWriter)
                .build();
    }

    @Bean
    @JobScope
    public MultiResourceItemReader<ManuelDto> multipleManuelReader(@Value("#{jobParameters[files]}") String filePath) {
        MultiResourceItemReader<ManuelDto> resourceItemReader = new MultiResourceItemReader<>();
        resourceItemReader.setResources(FileResourceUtils.getResourcesFromFilepath(filePath));
        resourceItemReader.setDelegate(manuelItemReader());
        return resourceItemReader;
    }

    @Bean
    @JobScope
    public FlatFileItemReader<ManuelDto> manuelItemReader() {
        FlatFileItemReader<ManuelDto> reader = new FlatFileItemReader<>();
        reader.setName("manuelItemReader");
        reader.setLinesToSkip(Math.toIntExact(1L));
        reader.setLineMapper(new ManuelLineMapper(";"));
        return reader;
    }

    @Bean
    @JobScope
    public ItemProcessor<ManuelDto, QuotationsByInstrument> manuelItemProcessor() {
        CompositeItemProcessor<ManuelDto, QuotationsByInstrument> processor = new CompositeItemProcessor<>();
        processor.setDelegates(Arrays.asList(commonProcessor, manuelPostProcessor()));
        return processor;
    }

    @Bean
    public ItemProcessor<JsonNode, QuotationsByInstrument> manuelPostProcessor() {
        return item -> objectMapper.convertValue(item, QuotationsByInstrument.class);
    }

    private final class ManuelLineMapper implements LineMapper<ManuelDto> {

        private String separator;

        ManuelLineMapper(String separator) {
            this.separator = separator;
        }

        @Override
        public ManuelDto mapLine(String line, int lineNumber) {
            if (lineNumber == 1) {
                return null;
            }
            String[] fields = line.split(separator);
            ManuelDto manuelDto = new ManuelDto();

            manuelDto.setIndex1(fields[0]);
            manuelDto.setIndex2(fields[1]);
            manuelDto.setIndex3(fields[2]);
            manuelDto.setIndex4(fields[3]);
            manuelDto.setIndex5(fields[4]);
            manuelDto.setIndex6(fields[5]);
            manuelDto.setIndex7(fields[6]);
            manuelDto.setIndex8(fields[7]);
            manuelDto.setIndex9(fields[8]);
            manuelDto.setIndex10(fields[9]);
            manuelDto.setIndex11(fields[10]);

            return manuelDto;
        }

    }

}
