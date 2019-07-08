package com.bnpp.galaxy.services.partnership.impl;

import org.springframework.batch.core.JobParametersBuilder;

import java.util.regex.Pattern;

public class CsvPartnerSettings extends AbstractPartnerSettings {

    private int rowOffset;
    private String separator;

    protected CsvPartnerSettings(String name, Pattern pattern, String jobName, String joltConfigFile, int rowOffset, String separator, String executionLock) {
        super(name, pattern, jobName, joltConfigFile, executionLock);
        this.rowOffset = rowOffset;
        this.separator = separator;
    }

    public int getRowOffset() {
        return rowOffset;
    }

    public String getSeparator() {
        return separator;
    }

    @Override
    public void configureJobParameters(JobParametersBuilder jobParametersBuilder) {
        jobParametersBuilder.addLong("rowOffset", (long) rowOffset);
        jobParametersBuilder.addString("separator", separator);
    }

    public static final class Builder extends AbstractPartnerSettings.Builder<CsvPartnerSettings.Builder, CsvPartnerSettings> {

        private int rowOffset;
        private String separator;

        public CsvPartnerSettings.Builder rowOffset(int rowOffset) {
            this.rowOffset = rowOffset;
            return this;
        }

        public CsvPartnerSettings.Builder separator(String separator) {
            this.separator = separator;
            return this;
        }

        public CsvPartnerSettings build() {
            return new CsvPartnerSettings(name, pattern, jobName, joltConfigFile, rowOffset, separator, executionLock);
        }

    }

}
