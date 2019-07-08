package com.bnpp.galaxy.gxt.app.batch.processors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bnpp.galaxy.gxt.app.batch.enricher.ResourceAwareItem;
import com.bnpp.galaxy.gxt.app.engine.core.json.JsonGXTEngineTarget;

@Component
@JobScope
public class JsonConverterItemProcessor implements ItemProcessor<Object, JsonGXTEngineTarget> {
    private final ObjectMapper objectMapper;
    private final String       partnershipName;

    public JsonConverterItemProcessor(ObjectMapper objectMapper, @Value("#{jobExecution}") JobExecution jobExecution) {
        this.objectMapper = objectMapper;
        this.partnershipName = jobExecution.getJobParameters().getString("partnershipName");
    }

    @Override
    public JsonGXTEngineTarget process(Object item) {
        String resource = null;
        if (item instanceof ResourceAwareItem) {
            resource = ((ResourceAwareItem) item).getResource();
            item = ((ResourceAwareItem) item).getItem();
        }
        JsonNode jsonNode = objectMapper.convertValue(item, JsonNode.class);

        return new JsonGXTEngineTarget(jsonNode, partnershipName, resource);
    }

}
