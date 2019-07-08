package com.bnpp.galaxy.gxt.app.exception;

public class TechnicalException extends GxtBuisnessException {
	/**
	 * Constructeur des exceptions de type {@link ErrorEnum}.NO_CHANNEL
	 */
	public TechnicalException() {
		super(ErrorEnum.TECHNICAL);
  	}
	
	/**
	 * Constructeur des exceptions de type {@link ErrorEnum}.TECHNICAL avec 
	 * le paramètre de la requete engendrant cette exception. 
	 * @param cause la date engendrant cette exception.
	 */
	public TechnicalException(String cause) {
		super(cause, ErrorEnum.TECHNICAL);
	}
}
