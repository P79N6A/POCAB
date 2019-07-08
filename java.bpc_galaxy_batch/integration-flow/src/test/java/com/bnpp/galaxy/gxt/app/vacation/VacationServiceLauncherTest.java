package com.bnpp.galaxy.gxt.app.vacation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class VacationServiceLauncherTest {

    @Test
    public void testRun() {
        VacationService vacationService = mock(VacationService.class);
        VacationServiceLauncher launcher = new VacationServiceLauncher(vacationService);

        when(vacationService.isDisabled()).thenReturn(false);

        try {
            launcher.run(null);
            verify(vacationService, times(1)).schedule();
        } catch (Exception e) {
            fail("Test failed to run", e);
        }
    }

    @Test
    public void testNotRun() {
        VacationService vacationService = mock(VacationService.class);
        VacationServiceLauncher launcher = new VacationServiceLauncher(vacationService);

        when(vacationService.isDisabled()).thenReturn(true);

        try {
            launcher.run(null);
            verify(vacationService, never()).schedule();
        } catch (Exception e) {
            fail("Test failed to run", e);
        }
    }

    @Test
    public void testAfterPartnershipsSave() {
        VacationService vacationService = mock(VacationService.class);
        VacationServiceLauncher launcher = new VacationServiceLauncher(vacationService);

        when(vacationService.isDisabled()).thenReturn(false);

        try {
            launcher.afterPartnershipsSave(null);
            verify(vacationService, times(1)).schedule();
        } catch (Exception e) {
            fail("Test failed to run", e);
        }
    }

    @Test
    public void testNotAfterPartnershipsSave() {
        VacationService vacationService = mock(VacationService.class);
        VacationServiceLauncher launcher = new VacationServiceLauncher(vacationService);

        when(vacationService.isDisabled()).thenReturn(true);

        try {
            launcher.afterPartnershipsSave(null);
            verify(vacationService, never()).schedule();
        } catch (Exception e) {
            fail("Test failed to run", e);
        }
    }

    @Test
    public void testAfterPartnershipsDelete() {
        VacationService vacationService = mock(VacationService.class);
        VacationServiceLauncher launcher = new VacationServiceLauncher(vacationService);

        when(vacationService.isDisabled()).thenReturn(false);

        try {
            launcher.afterPartnershipsDelete(null);
            verify(vacationService, times(1)).schedule();
        } catch (Exception e) {
            fail("Test failed to run", e);
        }
    }

    @Test
    public void testNotAfterPartnershipsDelete() {
        VacationService vacationService = mock(VacationService.class);
        VacationServiceLauncher launcher = new VacationServiceLauncher(vacationService);

        when(vacationService.isDisabled()).thenReturn(true);

        try {
            launcher.afterPartnershipsDelete(null);
            verify(vacationService, never()).schedule();
        } catch (Exception e) {
            fail("Test failed to run", e);
        }
    }

}
