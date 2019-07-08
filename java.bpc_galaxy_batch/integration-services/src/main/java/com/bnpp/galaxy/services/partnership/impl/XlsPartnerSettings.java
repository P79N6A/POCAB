package com.bnpp.galaxy.services.partnership.impl;

import org.springframework.batch.core.JobParametersBuilder;

import java.util.regex.Pattern;

public class XlsPartnerSettings extends AbstractPartnerSettings {

    private final int rowOffset;
    private final int columnOffset;

    protected XlsPartnerSettings(String name, Pattern pattern, String jobName, String joltConfigFile, int rowOffset, int columnOffset, String executionLock) {
        super(name, pattern, jobName, joltConfigFile, executionLock);
        this.rowOffset = rowOffset;
        this.columnOffset = columnOffset;
    }

    public int getRowOffset() {
        return rowOffset;
    }

    public int getColumnOffset() {
        return columnOffset;
    }

    @Override
    public void configureJobParameters(JobParametersBuilder jobParametersBuilder) {
        jobParametersBuilder.addLong("rowOffset", (long) rowOffset);
        jobParametersBuilder.addLong("columnOffset", (long) columnOffset);
    }

    public static final class XlsPartnerSettingsBuilder extends AbstractPartnerSettings.Builder<XlsPartnerSettingsBuilder, XlsPartnerSettings> {

        private int rowOffset;
        private int columnOffset;

        public XlsPartnerSettingsBuilder rowOffset(int rowOffset) {
            this.rowOffset = rowOffset;
            return this;
        }

        public XlsPartnerSettingsBuilder columnOffset(int columnOffset) {
            this.columnOffset = columnOffset;
            return this;
        }

        public XlsPartnerSettings build() {
            return new XlsPartnerSettings(name,
                                          pattern,
                                          jobName, joltConfigFile, rowOffset, columnOffset, executionLock);
        }

    }

}
