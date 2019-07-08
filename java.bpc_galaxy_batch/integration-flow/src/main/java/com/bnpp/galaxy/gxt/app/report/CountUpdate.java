package com.bnpp.galaxy.gxt.app.report;

import com.bnpp.galaxy.entities.JobReport;
import com.bnpp.galaxy.gxt.app.engine.report.AbstractGxtMessagingProcess;
import com.bnpp.galaxy.gxt.app.engine.report.CountMessagingProcessing;
import com.bnpp.galaxy.gxt.app.engine.report.MessadingTypeEnum;
import org.springframework.messaging.Message;

import java.util.function.BiConsumer;

public class CountUpdate implements updateRepport<Message<AbstractGxtMessagingProcess>, JobReport> {

    BiConsumer<JobReport, Long> jobRepportConsumeRecepLigne = JobReport::setRecepLigne;
    BiConsumer<JobReport, Long> jobRepportConsumeMapField = JobReport::setMapField;
    BiConsumer<JobReport, Long> jobRepportConsumeFilterField = JobReport::setFilterField;
    BiConsumer<JobReport, Long> jobRepportConsumeTranscField = JobReport::setTranscField;

    @Override
    public void update(Message<AbstractGxtMessagingProcess> message, JobReport jobReport) {

        CountMessagingProcessing count = (CountMessagingProcessing) message.getPayload();
        MessadingTypeEnum type = count.getLevel();

        switch (type) {

            case ITEM_READER_COUNT:
                jobRepportConsumeRecepLigne.accept(jobReport, count.getCount());
                break;

            case FIELD_MAPPING_COUNT:
                jobRepportConsumeMapField.accept(jobReport, count.getCount());
                break;

            case FIELD_FILTER_COUNT:
                jobRepportConsumeFilterField.accept(jobReport, count.getCount());
                break;

            case FIELD_TRANSCO_COUNT:
                jobRepportConsumeTranscField.accept(jobReport, count.getCount());
                break;

            default:
                break;
        }

    }

}
