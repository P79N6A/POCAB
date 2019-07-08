package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.gxt.app.transcoding.FusionInvestProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Read FusionInvest properties from application.properties
 */
@EnableConfigurationProperties(FusionInvestProperties.class)
@Configuration
public class FusionInvestConfiguration {

}
