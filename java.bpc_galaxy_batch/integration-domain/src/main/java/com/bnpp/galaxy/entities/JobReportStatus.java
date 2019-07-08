package com.bnpp.galaxy.entities;

import com.bnpp.galaxy.gxt.app.engine.report.ReportMessagingStatus;


/**
 * TODO Use a boolean if only two values
 */
public enum JobReportStatus {

    /**
     * The order of the status values is significant because it can be used to
     * aggregate a set of status values - the result should be the maximum value.
     * Since COMPLETED is first in the order, only if all elements of an execution
     * are COMPLETED will the aggregate status be COMPLETED. A running execution is
     * expected to move from STARTING to STARTED to COMPLETED (through the order
     * defined by {@link #upgradeTo(BatchStatus)}). Higher values than STARTED
     * signify more serious failure. ABANDONED is used for steps that have finished
     * processing, but were not successful, and where they should be skipped on a
     * restart (so FAILED is the wrong status).
     */
    COMPLETED("Completed"),
    STARTING("Starting"),
    STARTED("Started"),
    STOPPING("Stopping"),
    STOPPED("Stopped"),
    FAILED("Failed"),
    ABANDONED("Abandoned"),
    UNKNOWN("Unknown");

    private final String status;

    JobReportStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static JobReportStatus buildJobReportStatus(ReportMessagingStatus reportMessagingStatus) {
        switch (reportMessagingStatus) {
            case COMPLETED:
                return COMPLETED;
            case STARTING:
                return STARTING;
            case STARTED:
                return STARTED;
            case STOPPING:
                return STOPPING;
            case STOPPED:
                return STOPPED;
            case FAILED:
                return FAILED;
            case ABANDONED:
                return ABANDONED;
            case UNKNOWN:
                return UNKNOWN;
        }
        return UNKNOWN;
    }
}
