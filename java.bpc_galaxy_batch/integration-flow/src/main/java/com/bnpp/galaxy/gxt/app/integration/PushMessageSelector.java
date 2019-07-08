package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.gxt.app.vacation.VacationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

/**
 * Message selector that conditionally accepts messages from 'push' input. Messages from vacation are always accepted.
 * Unaccepted messages will typically be processed later by vacation.
 */
@Component
public class PushMessageSelector implements MessageSelector {

    private final Logger logger = LogManager.getLogger(getClass());

    private final VacationService vacationService;
    private final IntegrationProperties integrationProperties;

    public PushMessageSelector(VacationService vacationService, IntegrationProperties integrationProperties) {
        this.vacationService = vacationService;
        this.integrationProperties = integrationProperties;
    }

    private IntegrationProperties.In.Push.IgnoreIfVacation getBehavior() {
        return integrationProperties.getIn().getPush().getIgnoreIfVacation();
    }

    @Override
    public boolean accept(Message<?> message) {
        HeadersReader h = HeadersReader.of(message);

        // Message issued from vacation, always accept
        if (h.isVacation()) {
            return true;
        }

        IntegrationProperties.In.Push.IgnoreIfVacation behavior = getBehavior();
        Class<?> clazz = behavior.getDeclaringClass();
        boolean ignore;

        switch (behavior) {
            case NEVER:
                ignore = false;
                break;
            case ALWAYS:
                ignore = vacationService.hasVacationRule(h.getPartnership());
                break;
            case AUTO:
                Path pushDirectory = integrationProperties.getIn().getPush().getDirectory().normalize();
                Path vacationDirectory = integrationProperties.getIn().getVacation().getDirectory().normalize();

                ignore = pushDirectory.equals(vacationDirectory) && vacationService.hasVacationRule(h.getPartnership());
                break;
            default:
                // Should never happen
                logger.error("Invalid configuration property value: {} for enumeration {}", behavior, clazz);
                ignore = false;
                break;
        }

        if (ignore) {
            logger.info("Waiting vacation for input message due to configured behavior ({}.{}): {}", clazz, behavior, message);
        }

        return !ignore;
    }
}
