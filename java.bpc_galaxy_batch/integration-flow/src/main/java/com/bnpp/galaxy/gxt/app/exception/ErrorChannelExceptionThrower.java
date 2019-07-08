package com.bnpp.galaxy.gxt.app.exception;

public class ErrorChannelExceptionThrower implements GxtExceptionThrower<ErrorChannelException, GxtBuisnessException> {

	@Override
	public void throwException(ErrorChannelException source)  throws GxtBuisnessException {		
		throw new GxtBuisnessException(source.getMessage(), ErrorEnum.NO_CHANNEL); 		
	}

}
