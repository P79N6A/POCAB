package com.bnpp.galaxy.gxt.app.report;

import com.bnpp.galaxy.entities.JobReport;
import com.bnpp.galaxy.entities.JobReportStatus;
import com.bnpp.galaxy.gxt.app.engine.report.AbstractGxtMessagingProcess;
import com.bnpp.galaxy.gxt.app.engine.report.InfoMessagingProcessing;
import org.springframework.messaging.Message;

public class InfoUpdate implements updateRepport<Message<AbstractGxtMessagingProcess>, JobReport> {

    @Override
    public void update(Message<AbstractGxtMessagingProcess> message, JobReport jobReport) {
        InfoMessagingProcessing info = (InfoMessagingProcessing) message.getPayload();

        jobReport.setReffluxs(info.getReffluxs());
        jobReport.setReffluxt(info.getReffluxt());
        jobReport.setStatut(JobReportStatus.buildJobReportStatus(info.getStatut()));
        jobReport.setStartDate(info.getStartDate());
        jobReport.setEndDate(info.getEndDate());

    }
}
