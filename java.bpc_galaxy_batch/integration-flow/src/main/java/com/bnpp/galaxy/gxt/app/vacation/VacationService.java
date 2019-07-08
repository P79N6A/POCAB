package com.bnpp.galaxy.gxt.app.vacation;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Service that automatically schedules Quartz job based on {@link com.bnpp.galaxy.entities.Partnership
 * Partnerships} configuration.
 *
 * @implNote Job is schedules at application startup then on each Partnership change (done through the application)
 */
@Service
public class VacationService {

    private static final String VACATION_JOB_NAME = "VacationJob";
    private static final String VACATION_TRIGGER_NAME_FORMAT = "VacationJobTrigger_%s";

    private final Logger logger = LogManager.getLogger(getClass());

    private final PartnershipService partnershipService;
    private final Scheduler scheduler;
    private final IntegrationProperties integrationProperties;

    public VacationService(PartnershipService partnershipService,
                           Scheduler scheduler,
                           IntegrationProperties integrationProperties) {
        this.partnershipService = partnershipService;
        this.scheduler = scheduler;
        this.integrationProperties = integrationProperties;
    }

    public boolean hasVacationRule(PartnershipSettings partnership) {
        // TODO optimize
        return hasVacationRule(partnershipService.findPartnershipByName(partnership.getName()));
    }

    boolean hasVacationRule(Partnership partnership) {
        return StringUtils.hasLength(partnership.getCronVacationRule());
    }

    public void schedule() throws SchedulerException {
        if (isDisabled()) {
            logger.error("Trying to schedule vacation job but service is disabled. Call to schedule() has no effect.");
            return;
        }

        JobDetail job = createJob();
        JobKey jobKey = job.getKey();
        Class<? extends Job> jobClass = job.getJobClass();
        Set<Trigger> triggers = buildTriggers(job);

        logger.info("Scheduling vacation job with {} triggers: {}", triggers.size(), triggers);

        if (scheduler.deleteJob(jobKey)) {
            int currentTriggersCount = scheduler.getTriggersOfJob(jobKey).size();

            logger.info("Deleted currently registered job {}: {} with {} triggers", jobClass, jobKey, currentTriggersCount);
        }

        if (triggers.isEmpty()) {
            logger.warn("Could not schedule job {}: {} with no trigger", jobClass, jobKey);
        } else {
            scheduler.scheduleJob(job, triggers, true);

            logger.info("Successfully scheduled job {}: {} with {} triggers", jobClass, jobKey, triggers.size());
        }
    }

    boolean isDisabled() {
        return getVacationDirectory() == null;
    }

    private JobDetail createJob() {
        return JobBuilder.newJob(VacationQuartzJob.class)
                .withIdentity(VACATION_JOB_NAME)
                .build();
    }

    private Set<Trigger> buildTriggers(JobDetail job) {
        return partnershipService.getAllPartnerships()
                .stream()
                .filter(this::hasVacationRule)
                .filter(this::isExecutable)
                .map(partnership -> {
                    String triggerName = String.format(VACATION_TRIGGER_NAME_FORMAT, partnership.getName());
                    String rule = partnership.getCronVacationRule();
                    CronScheduleBuilder schedule = CronScheduleBuilder.cronSchedule(rule);

                    return TriggerBuilder.newTrigger()
                            .forJob(job)
                            .withIdentity(triggerName)
                            .withSchedule(schedule)
                            .usingJobData(VacationQuartzJob.PARAM_PARTNERSHIP_NAME,
                                    partnership.getName())
                            .build();
                })
                .collect(Collectors.toSet());
    }

    private boolean isExecutable(Partnership partnership) {
        if (partnershipService.isHold(partnership.getName())) {
            return false;
        }

        return partnershipService.isLockable(partnership.getName());
    }

    private Path getVacationDirectory() {
        return integrationProperties.getIn().getVacation().getDirectory();
    }

}
