package com.bnpp.galaxy.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OWN_T_PARTNERSHIP_SETTINGS")
public class Partnership implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8780169486696994863L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", unique = true)
    private String name;

    @Column(name = "INPUTFILENAMEPATTERN", unique = true)
    private String inputFilenamePattern;

    @Column(name = "INPUTFILETYPE")
    @Enumerated(EnumType.STRING)
    private PartnershipType inputFileType;

    @Column(name = "JOBNAME", unique = true)
    private String jobName;

    @Column(name = "EXECUTIONLOCK")
    private String executionLock;

    @Column(name = "HOLD")
    private boolean hold;

    @Column(name = "CONFIGFILENAME")
    private String configFile;

    @Column(name = "JOLTCONFIGFILENAME")
    private String joltConfigFile;

    @Column(name = "CRONVACATIONRULE")
    private String cronVacationRule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInputFilenamePattern() {
        return inputFilenamePattern;
    }

    public void setInputFilenamePattern(String inputFilenamePattern) {
        this.inputFilenamePattern = inputFilenamePattern;
    }

    public PartnershipType getInputFileType() {
        return inputFileType;
    }

    public void setInputFileType(PartnershipType inputFileType) {
        this.inputFileType = inputFileType;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getExecutionLock() {
        return executionLock;
    }

    public void setExecutionLock(String executionLock) {
        this.executionLock = executionLock;
    }

    public boolean isHold() {
        return hold;
    }

    public void setHold(boolean hold) {
        this.hold = hold;
    }

    public String getConfigFile() {
        return configFile;
    }

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    public String getJoltConfigFile() {
        return joltConfigFile;
    }

    public void setJoltConfigFile(String joltConfigFile) {
        this.joltConfigFile = joltConfigFile;
    }

    public String getCronVacationRule() {
        return cronVacationRule;
    }

    public void setCronVacationRule(String cronVacationRule) {
        this.cronVacationRule = cronVacationRule;
    }
}
