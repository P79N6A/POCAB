package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class JobFinder {

    private final JobRegistry jobRegistry;

    public JobFinder(JobRegistry jobRegistry) {
        this.jobRegistry = jobRegistry;
    }

    public Job findJob(PartnershipSettings partnershipSettings) {
        Assert.notNull(partnershipSettings, () -> "partnershipSettings is null");
        Assert.notNull(partnershipSettings.getJobName(), () -> "partnershipSettings jobName is null");
        try {
            return jobRegistry.getJob(partnershipSettings.getJobName());
        } catch (NoSuchJobException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
