package com.bnpp.galaxy.gxt.app.exception;

@SuppressWarnings("serial")
public class ErrorChannelException extends GxtBuisnessException {
	/**
	 * Constructeur des exceptions de type {@link ErrorEnum}.NO_CHANNEL
	 */
	public ErrorChannelException() {
		super(ErrorEnum.NO_CHANNEL);
  	}
	
	/**
	 * Constructeur des exceptions de type {@link ErrorEnum}.NO_CHANNEL avec 
	 * le paramètre de la requete engendrant cette exception. 
	 * @param cause la date engendrant cette exception.
	 */
	public ErrorChannelException(String cause) {
		super(cause, ErrorEnum.NO_CHANNEL);
	}
}
