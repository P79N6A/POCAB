package com.bnpp.galaxy.gxt.app.batch.listeners;

import lombok.extern.slf4j.Slf4j;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

import com.bnpp.galaxy.gxt.app.engine.pojo.GXTExecutionsFonctionalFailsDetails;

@Component
@Slf4j
public class InterceptingJobExecution implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {

		String inputFile = jobExecution.getJobParameters().getString("files");
		String classType = jobExecution.getJobParameters().getString("InputJavaType");
		int i = inputFile.lastIndexOf('.');
		String prefix = inputFile.substring(0, i);
		String suffix = inputFile.substring(i);

		GXTExecutionsFonctionalFailsDetails<Object> executionsFonctionalFailsDetails = new GXTExecutionsFonctionalFailsDetails<>();
		executionsFonctionalFailsDetails.setInputName(prefix);
		executionsFonctionalFailsDetails.setInputExtension(suffix);
		executionsFonctionalFailsDetails.setClassType(classType);
		jobExecution.getExecutionContext().put("failedGxtExecution", executionsFonctionalFailsDetails);
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		log.info("Intercepting Job Excution - After Job!");
	}

}