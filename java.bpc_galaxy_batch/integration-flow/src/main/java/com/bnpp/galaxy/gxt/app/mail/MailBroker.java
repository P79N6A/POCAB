package com.bnpp.galaxy.gxt.app.mail;

import com.bnpp.galaxy.gxt.app.configuration.MailConfigurationProperties;
import com.bnpp.galaxy.gxt.app.template.CompiledTemplate;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import java.util.Optional;

/**
 * Mail broker that uses Spring's {@link JavaMailSender} to send email messages based on default application configuration.
 */
public class MailBroker {

    /**
     * Preparator that may set further properties on a mail message using provided {@link MimeMessageHelper}.
     */
    @FunctionalInterface
    interface MessagePreparator {
        /**
         * Configure a mail message using provided {@link MimeMessageHelper}
         *
         * @param mimeMessageHelper The Spring's helper
         * @throws MessagingException If an error occur
         */
        void prepare(MimeMessageHelper mimeMessageHelper) throws MessagingException;
    }

    private final JavaMailSender mailSender;
    private final MailConfigurationProperties config;

    public MailBroker(JavaMailSender mailSender, MailConfigurationProperties config) {
        this.mailSender = mailSender;
        this.config = config;
    }

    /**
     * Send an email message
     *
     * @param to                    Recipient
     * @param subject               Subject
     * @param body                  Body
     * @param additionalPreparators Optional preparators
     * @see MessagePreparator
     * @see #send(String[], String, CompiledTemplate, MessagePreparator...)
     */
    public void send(String to, String subject, CompiledTemplate body, MessagePreparator... additionalPreparators) throws MailException {
        send(new String[]{to}, subject, body, additionalPreparators);
    }

    /**
     * Send an email message
     *
     * @param to                    Recipients
     * @param subject               Subject
     * @param body                  Body
     * @param additionalPreparators Optional preparators
     * @see MessagePreparator
     */
    public void send(String[] to, String subject, CompiledTemplate body, MessagePreparator... additionalPreparators) throws MailException {
        mailSender.send(mimeMessage -> {
            MimeMessageHelper h = new MimeMessageHelper(mimeMessage, true);
            MailConfigurationProperties.From from = config.getFrom();

            Optional<String> html = body.getHtml();
            Optional<String> text = body.getPlainText();

            if (from.getName().isPresent()) {
                h.setFrom(from.getAddress(), from.getName().get());
            } else {
                h.setFrom(from.getAddress());
            }

            h.setTo(to);
            h.setSubject(subject);

            if (html.isPresent() && text.isPresent()) {
                h.setText(text.get(), html.get());
            } else if (html.isPresent()) {
                h.setText(html.get(), true);
            } else if (text.isPresent()) {
                h.setText(text.get());
            } else {
                throw new IllegalStateException("Empty email body is not allowed");
            }

            for (MessagePreparator additionalPreparator : additionalPreparators) {
                additionalPreparator.prepare(h);
            }
        });
    }

}
