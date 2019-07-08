package com.bnpp.galaxy.gxt.app.mail;

import com.bnpp.galaxy.gxt.app.template.CompiledTemplate;
import org.junit.Test;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MailBrokerTest {

    @Test
    public void testSendToSingleSubject() {
        // Just test that delegates to other method
        MailBroker broker = spy(new MailBroker(mock(JavaMailSender.class), null));
        CompiledTemplate tpl = mock(CompiledTemplate.class);

        broker.send("recipient@localhost.test", "test subject", tpl);

        verify(broker, times(1)).send(new String[]{"recipient@localhost.test"}, "test subject", tpl);
    }

    @Test
    public void testMailSent() {
        // Just test an email was sent to the sender, does not actually test the message is correctly build by the MimeMessagePreparator
        // Spring's MimeMessagePreparator is indeed tricky to mock (no public getter methods), and our usage is trivial
        JavaMailSender sender = mock(JavaMailSender.class);
        MailBroker broker = new MailBroker(sender, null);

        broker.send((String[]) null, null, null);

        verify(sender, times(1)).send(any(MimeMessagePreparator.class));
    }

}
