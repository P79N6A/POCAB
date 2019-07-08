package com.bnpp.galaxy.gxt.app.report;

import com.bnpp.galaxy.entities.JobReport;
import com.bnpp.galaxy.entities.JobReportErrorDetail;
import com.bnpp.galaxy.entities.JobReportErrorType;
import com.bnpp.galaxy.gxt.app.engine.report.AbstractGxtMessagingProcess;
import com.bnpp.galaxy.gxt.app.engine.report.ItemErrorMessagingProcessing;
import org.springframework.messaging.Message;

import java.util.ArrayList;
import java.util.List;

public class ErrorUpdate implements updateRepport<Message<AbstractGxtMessagingProcess>, JobReport> {

    List<JobReportErrorDetail> errorDetails;

    @Override
    public void update(Message<AbstractGxtMessagingProcess> message, JobReport jobReport) {
        ItemErrorMessagingProcessing errorItem = (ItemErrorMessagingProcessing) message.getPayload();

        JobReportErrorDetail errorDetails = new JobReportErrorDetail();
        errorDetails.setReport(jobReport);
        errorDetails.setData(errorItem.getItem());
        errorDetails.setErrorMessage(errorItem.getMessageError());

        switch (message.getPayload().getLevel()) {
            case ITEM_TRANSCO_ERROR:
                errorDetails.setErrorType(JobReportErrorType.TRANSCODIFICATION);
                break;

            case ITEM_MAPPING_ERROR:
                errorDetails.setErrorType(JobReportErrorType.MAPPING);
                break;

            case ITEM_FILTER_ERROR:
                errorDetails.setErrorType(JobReportErrorType.FILTER);
                break;

            case ITEM_ENRICHER_ERROR:
                errorDetails.setErrorType(JobReportErrorType.ENRICHMENT);
                break;

            default:
                break;
        }

        if (jobReport.getErrorDetails() == null || jobReport.getErrorDetails().isEmpty()) {
            List<JobReportErrorDetail> listErrorDetails = new ArrayList<>();
            listErrorDetails.add(errorDetails);
            jobReport.setErrorDetails(listErrorDetails);
        } else {
            jobReport.getErrorDetails().add(errorDetails);
        }
    }

}
