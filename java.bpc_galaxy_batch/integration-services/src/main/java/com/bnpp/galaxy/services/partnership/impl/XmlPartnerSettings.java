package com.bnpp.galaxy.services.partnership.impl;

import java.util.regex.Pattern;

public class XmlPartnerSettings extends AbstractPartnerSettings {

    private final String xsd;

    protected XmlPartnerSettings(String name, Pattern pattern, String jobName, String joltConfigFile, String xsd, String executionLock) {
        super(name, pattern, jobName, joltConfigFile, executionLock);
        this.xsd = xsd;
    }

    public String getXsd() {
        return xsd;
    }

    public static final class XmlPartnerSettingsBuilder extends AbstractPartnerSettings.Builder<XmlPartnerSettingsBuilder, XmlPartnerSettings> {

        private String xsd;

        public XmlPartnerSettingsBuilder xsd(String xsd) {
            this.xsd = xsd;
            return this;
        }

        @Override
        public XmlPartnerSettings build() {
            return new XmlPartnerSettings(name, pattern, jobName, joltConfigFile, xsd, executionLock);
        }

    }

}