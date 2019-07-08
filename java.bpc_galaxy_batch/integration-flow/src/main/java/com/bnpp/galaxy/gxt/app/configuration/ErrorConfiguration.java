package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.gxt.app.exception.ErrorChannelException;
import com.bnpp.galaxy.gxt.app.exception.ErrorChannelExceptionThrower;
import com.bnpp.galaxy.gxt.app.exception.GxtBuisnessException;
import com.bnpp.galaxy.gxt.app.exception.GxtExceptionThrower;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorConfiguration {
	@Bean
	public synchronized GxtExceptionThrower<ErrorChannelException, GxtBuisnessException> createChannelExceptionToExceptionThrower() {
		return new ErrorChannelExceptionThrower();

	}
}
