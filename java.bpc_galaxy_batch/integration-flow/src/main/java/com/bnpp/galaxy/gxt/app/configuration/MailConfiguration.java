package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.gxt.app.mail.MailBroker;
import com.bnpp.galaxy.gxt.app.mail.MailService;
import com.bnpp.galaxy.gxt.app.template.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
@EnableConfigurationProperties(MailConfigurationProperties.class) 
public class MailConfiguration {

    @Autowired
    private TemplateService templateService;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private MailConfigurationProperties mailProperties;

    @Bean
    public MailService mailService() {
        return new MailService(mailBroker(), templateService, mailProperties);
    }

    @Bean
    public MailBroker mailBroker() {
        return new MailBroker(mailSender, mailProperties);
    }

}
