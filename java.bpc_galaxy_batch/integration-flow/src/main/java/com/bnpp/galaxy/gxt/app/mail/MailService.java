package com.bnpp.galaxy.gxt.app.mail;

import com.bnpp.galaxy.gxt.app.configuration.MailConfigurationProperties;
import com.bnpp.galaxy.gxt.app.template.CompiledTemplate;
import com.bnpp.galaxy.gxt.app.template.TemplateService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.concurrent.Future;

/**
 * Main entry point to send mail messages through the application
 */
public class MailService {
    private final MailBroker broker;
    private final TemplateService templateService;
    private final MailConfigurationProperties config;

    public MailService(MailBroker broker, TemplateService templateService, MailConfigurationProperties config) {
        this.broker = broker;
        this.templateService = templateService;
        this.config = config;
    }

    /**
     * Send an email to the predefined technical account, using "test" template as contents
     *
     * @param errorDetails The error details (will appear in mail body)
     */
    @Async
    public Future<Void> sendReportingError(String errorDetails) {
        CompiledTemplate body = templateService.getTest(errorDetails);

        broker.send(config.getReporting().getRecipient(), "Automatic alert on batch error", body);

        return AsyncResult.forValue(null);
    }

    /**
     * Send an email to all technical account and supervisors, using "test" template as contents
     *
     * @param errorDetails The error details (will appear in mail body)
     */
    @Async
    public Future<Void> sendTestToEverybody(String errorDetails) {
        CompiledTemplate body = templateService.getTest(errorDetails);
        String[] to = {"recipient1@localhost.local", "recipient2@localhost.local"};
        String[] cc = {"recipient3@localhost.local", "recipient4@localhost.local"};
        String[] bcc = {"recipient5@localhost.local", "recipient6@localhost.local"};

        broker.send(to, "Automatic alert on batch error", body, m -> {
            m.setCc(cc);
            m.setBcc(bcc);
        });

        return AsyncResult.forValue(null);
    }

}
