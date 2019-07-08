package com.bnpp.galaxy.services.partnership.impl;

import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;

import java.util.regex.Pattern;

public abstract class AbstractPartnerSettings implements PartnershipSettings {

    private final String name;
    private final Pattern pattern;
    private final String jobName;
    private final String joltConfigFile;
    private final String executionLock;

    protected AbstractPartnerSettings(String name, Pattern pattern, String jobName, String joltConfigFile, String executionLock) {
        this.name = name;
        this.pattern = pattern;
        this.jobName = jobName;
        this.joltConfigFile = joltConfigFile;
        this.executionLock = executionLock;
    }

    public String getName() {
        return name;
    }

    public Pattern getInputFilenamePattern() {
        return pattern;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJoltConfigFile() {
        return joltConfigFile;
    }

    protected abstract static class Builder<B extends Builder<B, S>, S extends AbstractPartnerSettings> {
        protected String name;
        protected Pattern pattern;
        protected String jobName;
        protected String joltConfigFile;
        protected String executionLock;

        abstract public S build();

        @SuppressWarnings("unchecked")
        protected B _this() {
            return (B) this;
        }

        public B name(String name) {
            this.name = name;
            return _this();
        }

        public B pattern(Pattern pattern) {
            this.pattern = pattern;
            return _this();
        }

        public B pattern(String pattern) {
            this.pattern = pattern == null ? null : Pattern.compile(pattern);
            return _this();
        }

        public B jobName(String jobName) {
            this.jobName = jobName;
            return _this();
        }

        public B joltConfigFile(String joltConfigFile) {
            this.joltConfigFile = joltConfigFile;
            return _this();
        }

        public B executionLock(String executionLock) {
            this.executionLock = executionLock;
            return _this();
        }

        public B partnership(Partnership partnership) {
            return name(partnership.getName())
                    .pattern(partnership.getInputFilenamePattern())
                    .jobName(partnership.getJobName())
                    .joltConfigFile(partnership.getJoltConfigFile()).executionLock(partnership.getExecutionLock());
        }

    }

}
