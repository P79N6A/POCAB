package com.bnpp.galaxy.gxt.app.batch.listeners;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import com.bnpp.galaxy.gxt.app.configuration.GatewayConfiguration.GxtMassagingGateway;
import com.bnpp.galaxy.gxt.app.engine.report.CountMessagingProcessing;
import com.bnpp.galaxy.gxt.app.engine.report.InfoMessagingProcessing;
import com.bnpp.galaxy.gxt.app.engine.report.MessadingTypeEnum;
import com.bnpp.galaxy.gxt.app.engine.report.ReportMessagingStatus;
import com.bnpp.galaxy.gxt.app.engine.report.StatusJobMessagingProessing;

public class StepExecutionListener extends StepExecutionListenerSupport {

	@Autowired
	private GxtMassagingGateway gateway;
	
	@Override
	public void beforeStep(StepExecution stepExecution) {

	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		
		InfoMessagingProcessing info = new InfoMessagingProcessing();
		info.setJobId(stepExecution.getJobExecutionId());
		info.setLevel(MessadingTypeEnum.INFO);	
		
		stepExecution.getStatus();
		
		info.setReffluxs(stepExecution.getJobExecution().getJobParameters().getParameters().get("realName").toString());
		info.setReffluxt("");
		info.setStartDate(stepExecution.getStartTime());
		info.setEndDate(stepExecution.getEndTime());
		info.setStatut(getJobStatut(stepExecution.getStatus()));
		gateway.send(info);
		
		CountMessagingProcessing count = new CountMessagingProcessing();
		count.setJobId(stepExecution.getJobExecutionId());
		count.setLevel(MessadingTypeEnum.ITEM_READER_COUNT);
		count.setCount(stepExecution.getReadCount());
		gateway.send(count);
		
		StatusJobMessagingProessing statusJob = new StatusJobMessagingProessing();
		statusJob.setJobId(stepExecution.getJobExecutionId());
		statusJob.setLevel(MessadingTypeEnum.FLAG_END_JOB);
		gateway.send(statusJob);

		return ExitStatus.COMPLETED;
	}
	
	private ReportMessagingStatus getJobStatut(BatchStatus statut) {

		switch (statut) {
		case COMPLETED :  
			return ReportMessagingStatus.COMPLETED;
			
		case STARTING :  
			return ReportMessagingStatus.STARTING;
			
		case STARTED :  
			return ReportMessagingStatus.STARTED;
			
		case STOPPING :  
			return ReportMessagingStatus.STOPPING;
			
		case STOPPED :  
			return ReportMessagingStatus.STOPPED;
			
		case FAILED :  
			return ReportMessagingStatus.FAILED;
			
		case ABANDONED :  
			return ReportMessagingStatus.ABANDONED;
			
		case UNKNOWN :  
			return ReportMessagingStatus.UNKNOWN;
		}
		return ReportMessagingStatus.UNKNOWN;
	}

}
