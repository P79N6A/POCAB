package com.bnpp.galaxy.gxt.app.batch.listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.SkipListener;
import org.springframework.beans.factory.annotation.Value;

import com.bnpp.galaxy.gxt.app.engine.pojo.GXTExecution;
import com.bnpp.galaxy.gxt.app.engine.pojo.GXTExecutionsFonctionalFailsDetails;

public class GxtSkipListener<T, S> implements SkipListener<T, S> {

	@Value("#{jobExecution}")
	private JobExecution jobExecution;

	@Override
	public void onSkipInRead(final Throwable t) {
		// custom logic
	}

	@Override
	@SuppressWarnings("unchecked")
	public void onSkipInProcess(final T itemThatFailed, final Throwable t) {
		GXTExecutionsFonctionalFailsDetails<T> gxtExecutions = (GXTExecutionsFonctionalFailsDetails<T>) jobExecution
				.getExecutionContext().get("failedGxtExecution");
		gxtExecutions.getGXTExecutionsDetails().add(new GXTExecution<T>(null, itemThatFailed));
		// TODO add cause in place of null
	}

	@Override
	public void onSkipInWrite(final S itemThatFailed, final Throwable t) {
		// custom logic
	}

}