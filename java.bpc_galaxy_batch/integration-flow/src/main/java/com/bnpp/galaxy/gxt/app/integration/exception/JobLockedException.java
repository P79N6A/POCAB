package com.bnpp.galaxy.gxt.app.integration.exception;

public class JobLockedException extends IntegrationRuntimeException {
    public JobLockedException(String jobName) {
        super(String.format("%s Job instance is locked", jobName));
    }

}
