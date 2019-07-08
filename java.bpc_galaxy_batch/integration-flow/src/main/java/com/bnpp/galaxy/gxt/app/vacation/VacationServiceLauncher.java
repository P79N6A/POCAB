package com.bnpp.galaxy.gxt.app.vacation;

import com.bnpp.galaxy.services.partnership.PartnershipEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.SchedulerException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order // That only declares order for the ApplicationRunner interface, not for the @EventListener methods
public class VacationServiceLauncher implements ApplicationRunner {

    private final Logger logger = LogManager.getLogger(getClass());

    private final VacationService vacationService;

    public VacationServiceLauncher(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (vacationService.isDisabled()) {
            logger.warn("VacationService is disabled, no Quartz job will be scheduled on startup nor Partnership events. Set vacation directory to enable.");
            return;
        }

        logger.info("VacationService is enabled, Quartz job will be scheduled on startup and Partnership events.");

        vacationService.schedule();
    }

    @EventListener
    public void afterPartnershipsSave(PartnershipEvent.AfterSave event) {
        if (vacationService.isDisabled()) {
            return;
        }

        try {
            vacationService.schedule();
        } catch (SchedulerException e) {
            logger.error("Unable to reschedule Quartz job after partnership change {}", event, e);
        }
    }

    @EventListener
    public void afterPartnershipsDelete(PartnershipEvent.AfterDelete event) {
        if (vacationService.isDisabled()) {
            return;
        }

        try {
            vacationService.schedule();
        } catch (SchedulerException e) {
            logger.error("Unable to reschedule Quartz job after partnership deletion {}", event, e);
        }
    }
}
