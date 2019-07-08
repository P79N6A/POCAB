package com.bnpp.galaxy.services.partnership;

import org.springframework.batch.core.JobParametersBuilder;

import java.util.regex.Pattern;

public interface PartnershipSettings {

	/**
	 * @return the name of the partner (BNPPAM, ...)
	 */
	String getName();

	/**
	 * @return
	 */
	Pattern getInputFilenamePattern();

	/**
	 * @return the name of the job to be launched for this partner
	 */
	String getJobName();

	/**
	 * @return the jolt configuration file
	 */
	String getJoltConfigFile();

	default boolean isLockedJob() {
		return false;
	};

	/**
	 * Configure the job parameters regarding the partner configuration data
	 *
	 * @param jobParametersBuilder
	 */
	default void configureJobParameters(JobParametersBuilder jobParametersBuilder) {

	}

}
