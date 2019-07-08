package com.bnpp.galaxy.gxt.app.configuration;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties(ProxyProperties.class)
public class RestConfiguration {

    private final Logger          log = LogManager.getLogger(getClass());
    private final ProxyProperties proxyProperties;

    public RestConfiguration(ProxyProperties proxyProperties) {
        this.proxyProperties = proxyProperties;
    }

    @Bean
    public RestTemplate restTemplate() {

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

        // TODO: scope of proxy (application, ...)
        if (proxyProperties.isUse()) {

            if (StringUtils.isEmpty(proxyProperties.getUser()) || StringUtils.isEmpty(proxyProperties.getPassword())) {
                log.warn("Using proxy but no credentials are provided");
            }

            HttpHost target = new HttpHost(proxyProperties.getHost(), proxyProperties.getPort(), "http");
            CredentialsProvider credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(
                    new AuthScope(target.getHostName(), target.getPort()),
                    new UsernamePasswordCredentials(proxyProperties.getUser(), proxyProperties.getPassword()));

            HttpHost proxy = new HttpHost(proxyProperties.getHost(), proxyProperties.getPort());
            CloseableHttpClient httpclient = HttpClients.custom()
                    .setProxy(proxy)
                    .setDefaultCredentialsProvider(credsProvider)
                    .build();

            requestFactory.setHttpClient(httpclient);

        }

        return new RestTemplate(requestFactory);
    }

}
