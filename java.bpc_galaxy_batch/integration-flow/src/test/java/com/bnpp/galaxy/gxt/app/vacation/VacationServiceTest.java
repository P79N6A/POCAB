package com.bnpp.galaxy.gxt.app.vacation;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import org.junit.Before;
import org.junit.Test;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.springframework.test.util.ReflectionTestUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class VacationServiceTest {

    private static final String MOCK_CRON_EXPR = "*/20 * * * * ?";

    private static int mockPartnershipsCount = 0;

    @Before
    public void initialize() {
        mockPartnershipsCount = 0;
    }

    @Test
    public void testHasVacationRuleForPartnershipWithoutIntegrationRule() {
        VacationService vacationService = new VacationService(null, null, null);
        Partnership partnership = createMockPartnership();

        assertThat(vacationService.hasVacationRule(partnership)).isFalse();
    }

    private static Partnership createMockPartnership() {
        return createMockPartnership(null);
    }

    private static Partnership createMockPartnership(String vacationRule) {
        Partnership partnership = new Partnership();

        partnership.setName("MOCK" + mockPartnershipsCount++);
        partnership.setInputFilenamePattern("^$");
        partnership.setCronVacationRule(vacationRule);

        return partnership;
    }

    @Test
    public void testHasVacationRuleForPartnershipWithEmptyIntegrationRule() {
        VacationService vacationService = new VacationService(null, null, null);
        Partnership partnership = createMockPartnership(null);

        assertThat(vacationService.hasVacationRule(partnership)).isFalse();
    }

    @Test
    public void testHasVacationRuleForPartnershipWithEmptyIntegrationRule2() {
        VacationService vacationService = new VacationService(null, null, null);
        Partnership partnership = createMockPartnership("");

        assertThat(vacationService.hasVacationRule(partnership)).isFalse();
    }

    @Test
    public void testHasVacationRuleForPartnershipWithCronIntegrationRule() {
        VacationService vacationService = new VacationService(null, null, null);
        Partnership partnership = createMockPartnership(MOCK_CRON_EXPR);

        assertThat(vacationService.hasVacationRule(partnership)).isTrue();
    }

    @Test
    public void testCreateJob() {
        VacationService vacationService = new VacationService(null, null, null);
        JobDetail job = ReflectionTestUtils.invokeMethod(vacationService, "createJob");

        assertThat(job).isNotNull();
        assertThat(job.getKey()).isNotNull();
    }

    @Test
    public void testBuildTriggers() {
        PartnershipService partnershipService = mock(PartnershipService.class);
        VacationService vacationService = new VacationService(partnershipService, null, null);

        // Create reusable job
        JobDetail job = ReflectionTestUtils.invokeMethod(vacationService, "createJob");
        Supplier<Set<Trigger>> invoker = () -> ReflectionTestUtils.invokeMethod(vacationService, "buildTriggers", job);

        // Size of 0
        when(partnershipService.getAllPartnerships()).thenReturn(Collections.emptyList());

        assertThat(invoker.get()).hasSize(0);

        // Size of 0
        when(partnershipService.getAllPartnerships()).thenReturn(Collections.singletonList(
                createMockPartnership()
        ));

        assertThat(invoker.get()).hasSize(0);

        // Size of 1
        when(partnershipService.getAllPartnerships()).thenReturn(Collections.singletonList(
                createMockPartnership(MOCK_CRON_EXPR)
        ));

        assertThat(invoker.get()).hasSize(1);

        // Size of 1
        when(partnershipService.getAllPartnerships()).thenReturn(Arrays.asList(
                createMockPartnership(),
                createMockPartnership(MOCK_CRON_EXPR)
        ));

        assertThat(invoker.get()).hasSize(1);

        // Size of 2
        when(partnershipService.getAllPartnerships()).thenReturn(Arrays.asList(
                createMockPartnership(MOCK_CRON_EXPR),
                createMockPartnership(MOCK_CRON_EXPR)
        ));

        assertThat(invoker.get()).hasSize(2);
    }

    @Test
    public void testGetVacationDirectory() {
        Path expected = Paths.get("./mockpath");
        IntegrationProperties props = new IntegrationProperties();
        VacationService vacationService = new VacationService(null, null, props);

        props.getIn().getVacation().setDirectory(expected);

        Path vacationDirectory = ReflectionTestUtils.invokeMethod(vacationService, "getVacationDirectory");

        assertThat(vacationDirectory).isEqualTo(expected);
    }

    @Test
    public void testNotDisabled() {
        VacationService mock = mockingVacationDirectory(Paths.get("./mockfile"));

        assertThat(mock.isDisabled()).isFalse();
    }

    private VacationService mockingVacationDirectory(Path mockPath) {
        return new VacationService(null, null, propsForPath(mockPath));
    }

    private IntegrationProperties propsForPath(Path mockPath) {
        IntegrationProperties props = new IntegrationProperties();

        props.getIn().getVacation().setDirectory(mockPath);

        return props;
    }

    @Test
    public void testDisabled() {
        VacationService mock = mockingVacationDirectory(null);

        assertThat(mock.isDisabled()).isTrue();
    }

    @Test
    public void testSchedulerNotCalled() {
        PartnershipService partnershipService = mock(PartnershipService.class);
        Scheduler scheduler = mock(Scheduler.class);
        VacationService vacationService = new VacationService(partnershipService, scheduler, propsForPath(null));

        when(partnershipService.getAllPartnerships()).thenReturn(Collections.emptyList());

        try {
            vacationService.schedule();

            verify(scheduler, never()).scheduleJob(any(JobDetail.class), anySet(), anyBoolean());
        } catch (SchedulerException e) {
            fail("Unable to test", e);
        }
    }

    @Test
    public void testSchedulerCalled() {
        PartnershipService partnershipService = mock(PartnershipService.class);
        Scheduler scheduler = mock(Scheduler.class);
        VacationService vacationService = new VacationService(partnershipService, scheduler, propsForPath(Paths.get("/fake")));

        when(partnershipService.getAllPartnerships()).thenReturn(Arrays.asList(
                createMockPartnership(MOCK_CRON_EXPR),
                createMockPartnership(MOCK_CRON_EXPR)
        ));

        JobDetail job = ReflectionTestUtils.invokeMethod(vacationService, "createJob");
        Set<Trigger> triggers = ReflectionTestUtils.invokeMethod(vacationService, "buildTriggers", job);

        // Not an actual test assertion, as that is tested above
        // Just give an indication to compiler
        assert job != null;
        assert triggers != null;

        try {
            vacationService.schedule();

            verify(scheduler, times(1)).scheduleJob(job, triggers, true);
        } catch (SchedulerException e) {
            fail("Unable to test", e);
        }
    }

}
