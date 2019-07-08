package com.bnpp.galaxy.gxt.app.report;

import com.bnpp.galaxy.entities.JobReport;
import com.bnpp.galaxy.gxt.app.engine.report.AbstractGxtMessagingProcess;
import com.bnpp.galaxy.gxt.app.engine.report.MessadingTypeEnum;
import net.sf.jasperreports.engine.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class GxtManagerMessagingHandler {

    private static final Logger LOGGER = Logger.getLogger(GxtManagerMessagingHandler.class);

    @Autowired
    com.bnpp.galaxy.repositories.JobReportRepository JobReportRepository;

    @ServiceActivator
    public void handle(Message<AbstractGxtMessagingProcess> message) {
        try {

            CacheExecution myCacheError = CacheExecution.getInstance();

            boolean isKeyJobPresent = myCacheError.getCache().containsKey(message.getPayload().getJobId());

            if (!isKeyJobPresent) {
                JobReport jobReport = new JobReport();
                jobReport.setJobId(message.getPayload().getJobId());
                myCacheError.getCache().put(message.getPayload().getJobId(), jobReport);
            }

            updateJobReport(message, myCacheError.getCache().get(message.getPayload().getJobId()));

        } catch (Exception e) {
            LOGGER.error(e.getStackTrace());

        }
    }

    private void updateJobReport(Message<AbstractGxtMessagingProcess> message, JobReport jobReport) {

        MessadingTypeEnum levelMessaging = message.getPayload().getLevel();

        switch (levelMessaging) {
            case INFO:
                updateInfo(message, jobReport);
                break;

            // ligne en erreur de transcodification
            case ITEM_TRANSCO_ERROR:
                // ligne en erreur de transcodification
            case ITEM_MAPPING_ERROR:
                // ligne en erreur de transcodification
            case ITEM_FILTER_ERROR:
                // ligne en erreur d'enrichissement
            case ITEM_ENRICHER_ERROR: {
                updateError(message, jobReport);
                break;
            }

            // nombre de champ mappé
            case FIELD_MAPPING_COUNT:
                // nombre de champ mappé
            case FIELD_FILTER_COUNT:
                // nombre de champ mappé
            case FIELD_TRANSCO_COUNT:
                // Nombre de ligne traité
            case ITEM_READER_COUNT:
                CountUpdate countUpdate = new CountUpdate();
                countUpdate.update(message, jobReport);
                break;

            /**
             * Erreur d'écriture TODO **
             */
            case ITEM_WRITER_ERROR:
                break;

            // terminaison du job
            case FLAG_END_JOB:
                compileRepport(jobReport);
                break;

            // autres
            case OTHER:
                break;
        }

    }

    private void updateInfo(Message<AbstractGxtMessagingProcess> message, JobReport jobReport) {
        InfoUpdate infoUpdate = new InfoUpdate();
        infoUpdate.update(message, jobReport);
    }

    private void updateError(Message<AbstractGxtMessagingProcess> message, JobReport jobReport) {
        ErrorUpdate errorUpdate = new ErrorUpdate();
        errorUpdate.update(message, jobReport);
    }

    /**
     * Traitement effectué en fin de job
     * B17, Y5, D4
     *
     * @param jobReport
     * @throws JRException
     */
    private void compileRepport(JobReport jobReport) {
        /**
         * TODO
         */
        System.out.println(jobReport.toString());
        // JobReportRepository.save(jobReport);

        InputStream testJrxmlStream = getClass().getResourceAsStream("/JobRepport.jrxml");
        JasperReport jasperReport;
        try {
            jasperReport = JasperCompileManager.compileReport(testJrxmlStream);

            // Parameters for report
            Map<String, Object> param = new HashMap<>();

            param.put("JobId", jobReport.getJobId());
            param.put("reffluxs", jobReport.getReffluxs());
            param.put("reffluxt", jobReport.getReffluxt());
            param.put("statut", jobReport.getStatut().toString());
            param.put("startDate", jobReport.getStartDate());
            param.put("endDate", jobReport.getEndDate());

            // DataSource
            // This is simple example, no database.
            // then using empty datasource.
            JRDataSource dataSource = new JREmptyDataSource();

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, dataSource);

            // Export to PDF.
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Batch/output/repport.pdf");

            System.out.println("Done!");
        } catch (JRException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
