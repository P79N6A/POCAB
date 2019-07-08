package com.bnpp.galaxy.gxt.app.exception;

public class TechnicalExceptionThrower implements GxtExceptionThrower<TechnicalException, GxtBuisnessException> {

	@Override
	public void throwException(TechnicalException source)  throws GxtBuisnessException {		
		throw new GxtBuisnessException(source.getMessage(), ErrorEnum.NO_CHANNEL); 		
	}

}
