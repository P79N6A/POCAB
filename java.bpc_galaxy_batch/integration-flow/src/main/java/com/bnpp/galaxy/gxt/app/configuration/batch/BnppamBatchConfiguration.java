package com.bnpp.galaxy.gxt.app.configuration.batch;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.dto.BnppamDto;
import com.bnpp.galaxy.gxt.app.batch.listeners.DefaultListener;
import com.bnpp.galaxy.gxt.app.engine.core.GXTEngine;
import com.bnpp.galaxy.gxt.app.utils.FileResourceUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.PassThroughLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.FileSystemResource;

import java.nio.file.Path;

@Configuration
@EnableBatchProcessing
@PropertySource("classpath:integration.properties")
public class BnppamBatchConfiguration {

    @Autowired
    protected StepBuilderFactory stepBuilders;

    @Autowired
    protected JobBuilderFactory jobBuilders;

    @Autowired
    protected GXTEngine gxtEngine;

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    protected IntegrationProperties integrationProperties;

    protected Path getBatchOutDirectory() {
        return integrationProperties.getOut().getDirectory();
    }

    @Bean
    public Job bnppamJob() {
        return jobBuilders
                .get("bnppamJob")
                .incrementer(new RunIdIncrementer())
                .start(xlsStep())
                .build();
    }

    @Bean
    public Step xlsStep() {
        return stepBuilders
                .get("xlsStep")
                .<BnppamDto, String>chunk(50)
                .reader(multipleBnppamReader(null))
                .processor(processXls())
                .writer(excelToCsvWriter())
                .listener(new DefaultListener())
                .build();
    }

    @Bean
    @StepScope
    public MultiResourceItemReader<BnppamDto> multipleBnppamReader(@Value("#{jobParameters[files]}") String filePath) {
        MultiResourceItemReader<BnppamDto> resourceItemReader = new MultiResourceItemReader<>();
        resourceItemReader.setResources(FileResourceUtils.getResourcesFromFilepath(filePath));
        resourceItemReader.setDelegate(bnppamItemReader(null, null));
        return resourceItemReader;
    }

    @Bean
    @StepScope
    public PoiItemReader<BnppamDto> bnppamItemReader(@Value("#{jobParameters[rowOffset]}") Long rowOffset,
                                                     @Value("#{jobParameters[columnOffset]}") Long columnOffset) {
        PoiItemReader<BnppamDto> reader = new PoiItemReader<>();
        reader.setLinesToSkip(Math.toIntExact(rowOffset));
        reader.setColumnsToSkip(Math.toIntExact(columnOffset));
        reader.setRowMapper(new BnppamRowMapper());
        return reader;
    }

    @Bean
    public ItemProcessor<BnppamDto, String> processXls() {
        return item -> String.join(System.lineSeparator(), item.toString());
    }

    @Bean
    public FlatFileItemWriter<String> excelToCsvWriter() {
        return new FlatFileItemWriterBuilder<String>()
                .name("excelToCsvWriter")
                .resource(new FileSystemResource(getBatchOutDirectory().resolve("excel_out.csv").toFile()))
                .lineAggregator(new PassThroughLineAggregator<>())
                .build();
    }

    private final class BnppamRowMapper implements RowMapper<BnppamDto> {

        @Override
        public BnppamDto mapRow(RowSet rs) {
            BnppamDto bnppamDto = new BnppamDto();

            if (rs.getCurrentRow() == null) {
                return null;
            }

            String quantity = rs.getColumnValue(8);
            String price = rs.getColumnValue(9);
            String interetAccrue = rs.getColumnValue(10);
            String brutAmount = rs.getColumnValue(11);
            String courtageAmount = rs.getColumnValue(12);
            String netAmount = rs.getColumnValue(13);

            bnppamDto.setAssetCategoryLevel(rs.getColumnValue(0));
            bnppamDto.setCodePortfolio(rs.getColumnValue(1));
            bnppamDto.setOperationDate(rs.getColumnValue(2));
            bnppamDto.setValueDate(rs.getColumnValue(3));
            bnppamDto.setExecutionDate(rs.getColumnValue(4));
            bnppamDto.setCodeIsin(rs.getColumnValue(5));
            bnppamDto.setCurrencySettle(rs.getColumnValue(6));
            bnppamDto.setSideBs(rs.getColumnValue(7));
            bnppamDto.setQuantity(quantity.isEmpty() ? null : Double.valueOf(quantity));
            bnppamDto.setPrice(price.isEmpty() ? null : Double.valueOf(price));
            bnppamDto.setInteretAccrue(interetAccrue.isEmpty() ? null : Double.valueOf(interetAccrue));
            bnppamDto.setBrutAmount(brutAmount.isEmpty() ? null : Double.valueOf(brutAmount));
            bnppamDto.setCourtageAmount(courtageAmount.isEmpty() ? null : Double.valueOf(courtageAmount));
            bnppamDto.setNetAmount(netAmount.isEmpty() ? null : Double.valueOf(netAmount));
            bnppamDto.setContrapartie(rs.getColumnValue(14));
            bnppamDto.setContrapartieLibel(rs.getColumnValue(15));
            bnppamDto.setReference(rs.getColumnValue(16));
            bnppamDto.setComment(rs.getColumnValue(17));

            return bnppamDto;
        }
    }

}
