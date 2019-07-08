package com.bnpp.galaxy.gxt.app.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("gxt.proxy")
@Data
public class ProxyProperties {

    private String host;
    private int port;
    private boolean use;
    private String user;
    private String password;

}
