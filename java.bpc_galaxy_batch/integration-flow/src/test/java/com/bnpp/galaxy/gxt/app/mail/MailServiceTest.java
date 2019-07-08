package com.bnpp.galaxy.gxt.app.mail;

import com.bnpp.galaxy.gxt.app.configuration.MailConfigurationProperties;
import com.bnpp.galaxy.gxt.app.template.CompiledTemplate;
import com.bnpp.galaxy.gxt.app.template.TemplateService;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MailServiceTest {

    @Test
    public void testSendReportingError() {
        TemplateService tplSvc = mock(TemplateService.class);
        MailBroker broker = mock(MailBroker.class);
        MailConfigurationProperties props = new MailConfigurationProperties();
        MailService mailService = new MailService(broker, tplSvc, props);
        CompiledTemplate tpl = new CompiledTemplate("html", "plainText");

        props.getReporting().setRecipient("mock-recipient@localhost.test");
        when(tplSvc.getTest(anyString())).thenReturn(tpl);

        mailService.sendReportingError("unusedvalue");

        verify(broker, times(1)).send("mock-recipient@localhost.test", "Automatic alert on batch error", tpl);
    }

    @Test
    public void testSendTestToEverybody() {
        TemplateService tplSvc = mock(TemplateService.class);
        MailBroker broker = mock(MailBroker.class);
        MailConfigurationProperties props = new MailConfigurationProperties();
        MailService mailService = new MailService(broker, tplSvc, props);
        CompiledTemplate tpl = new CompiledTemplate("html", "plainText");

        props.getReporting().setRecipient("mock-recipient@localhost.test");
        when(tplSvc.getTest(anyString())).thenReturn(tpl);

        mailService.sendTestToEverybody("unusedvalue");

        verify(broker, times(1)).send(
                eq(new String[]{"recipient1@localhost.local", "recipient2@localhost.local"}),
                eq("Automatic alert on batch error"),
                same(tpl),
                any(MailBroker.MessagePreparator.class)
        );
    }

}
