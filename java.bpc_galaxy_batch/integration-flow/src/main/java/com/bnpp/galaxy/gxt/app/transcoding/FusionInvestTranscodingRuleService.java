package com.bnpp.galaxy.gxt.app.transcoding;

import com.bnpp.galaxy.entities.TranscodingRule;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class FusionInvestTranscodingRuleService implements TranscodingRuleService {

    private final RestTemplate restTemplate;
    private final FusionInvestProperties properties;

    public FusionInvestTranscodingRuleService(RestTemplate restTemplate, FusionInvestProperties properties) {
        this.restTemplate = restTemplate;
        this.properties = properties;
    }

    public List<TranscodingRule> getAllTranscodingRules() {
        String request = properties.getTranscoding().getEndpoint();
        ResponseEntity<List<TranscodingRule>> response = restTemplate.exchange(
                request,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TranscodingRule>>() {
                });
        if (response.getStatusCode().isError()) {
            throw FusionInvestNotReachableException.forRequest(request, response);
        }
        return response.getBody();
    }

    @Override
    public TranscodingRule getTranscodingRule(String source) throws TranscodingRuleNotFoundException {
        String request = properties.getTranscoding().getEndpoint();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(request) // TODO: how the endpoint is build?
                .queryParam("name", source);
        ResponseEntity<TranscodingRule> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<TranscodingRule>() {
                });
        if (response.getStatusCode().isError()) {
            throw FusionInvestNotReachableException.forRequest(request, response);
        }

        TranscodingRule rule = response.getBody();

        if (rule == null || StringUtils.isEmpty(rule.getSource())) {
            throw new TranscodingRuleNotFoundException("Transcoding rule not found: " + source);
        }

        return rule;
    }

}
