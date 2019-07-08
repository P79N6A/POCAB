package com.bnpp.galaxy.controller;

import com.bnpp.galaxy.config.properties.PresProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/application")
public class ApiController {

    private PresProperties presProperties;

    public ApiController(PresProperties presProperties) {
        this.presProperties = presProperties;
    }

    @GetMapping("/version")
    public String applicationVersion() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = presProperties.getUrl().getHost() + presProperties.getUrl().getApi().getApplicationVersion();
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);

        return response.getBody();
    }
}
