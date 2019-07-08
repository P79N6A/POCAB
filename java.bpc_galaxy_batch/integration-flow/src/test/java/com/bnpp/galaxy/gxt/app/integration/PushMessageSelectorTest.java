package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.gxt.app.vacation.VacationService;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.junit.Test;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PushMessageSelectorTest {

    @Test
    public void testReturnsTrueForVacation() {
        Message<Object> message = MessageBuilder
                .withPayload(new Object())
                .setHeader(Constants.VACATION_HEADER, true)
                .build();
        PushMessageSelector selector = new PushMessageSelector(mock(VacationService.class), mock(IntegrationProperties.class));

        assertThat(selector.accept(message)).isTrue();
    }

    @Test
    public void testReturnsTrueForNeverBehavior() {
        Message<Object> message = MessageBuilder
                .withPayload(new Object())
                .setHeader(Constants.VACATION_HEADER, false)
                .build();
        IntegrationProperties props = new IntegrationProperties();
        PushMessageSelector selector = new PushMessageSelector(mock(VacationService.class), props);

        props.getIn().getPush().setIgnoreIfVacation(IntegrationProperties.In.Push.IgnoreIfVacation.NEVER);

        assertThat(selector.accept(message)).isTrue();
    }

    @Test
    public void testReturnsTrueForAlwaysBehavior() {
        Message<Object> message = MessageBuilder
                .withPayload(new Object())
                .setHeader(Constants.VACATION_HEADER, false)
                .setHeader(Constants.PARTNERSHIP_HEADER, mock(PartnershipSettings.class))
                .build();
        IntegrationProperties props = new IntegrationProperties();
        VacationService vacationService = mock(VacationService.class);
        PushMessageSelector selector = new PushMessageSelector(vacationService, props);

        props.getIn().getPush().setIgnoreIfVacation(IntegrationProperties.In.Push.IgnoreIfVacation.ALWAYS);

        when(vacationService.hasVacationRule(any(PartnershipSettings.class))).thenReturn(true);
        assertThat(selector.accept(message)).isFalse();

        when(vacationService.hasVacationRule(any(PartnershipSettings.class))).thenReturn(false);
        assertThat(selector.accept(message)).isTrue();
    }

    @Test
    public void testReturnsTrueForAutoBehavior() {
        Message<Object> message = MessageBuilder
                .withPayload(new Object())
                .setHeader(Constants.VACATION_HEADER, false)
                .setHeader(Constants.PARTNERSHIP_HEADER, mock(PartnershipSettings.class))
                .build();
        IntegrationProperties props = new IntegrationProperties();
        VacationService vacationService = mock(VacationService.class);
        PushMessageSelector selector = new PushMessageSelector(vacationService, props);

        props.getIn().getPush().setIgnoreIfVacation(IntegrationProperties.In.Push.IgnoreIfVacation.AUTO);

        // Case 1: unique directory + vacation rule ==> expect false
        props.getIn().getPush().setDirectory(Paths.get("./test"));
        props.getIn().getVacation().setDirectory(Paths.get("./test"));
        when(vacationService.hasVacationRule(any(PartnershipSettings.class))).thenReturn(true);
        assertThat(selector.accept(message)).isFalse();

        // Case 2: different directories + vacation rule ==> expect true
        props.getIn().getPush().setDirectory(Paths.get("./test1"));
        props.getIn().getVacation().setDirectory(Paths.get("./test2"));
        when(vacationService.hasVacationRule(any(PartnershipSettings.class))).thenReturn(true);
        assertThat(selector.accept(message)).isTrue();

        // Case 3: unique directory + NO vacation rule ==> expect true
        props.getIn().getPush().setDirectory(Paths.get("./test"));
        props.getIn().getVacation().setDirectory(Paths.get("./test"));
        when(vacationService.hasVacationRule(any(PartnershipSettings.class))).thenReturn(false);
        assertThat(selector.accept(message)).isTrue();

        // Case 2: different directories + NO vacation rule ==> expect true
        props.getIn().getPush().setDirectory(Paths.get("./test1"));
        props.getIn().getVacation().setDirectory(Paths.get("./test2"));
        when(vacationService.hasVacationRule(any(PartnershipSettings.class))).thenReturn(false);
        assertThat(selector.accept(message)).isTrue();
    }

}
