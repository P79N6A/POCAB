package com.bnpp.galaxy.gxt.app.exception;

@SuppressWarnings("serial")
public class GxtBuisnessException extends Exception {

	/** L'erreur de type {@link ErrorEnum} associee a l'exception. */
	private ErrorEnum err;

	/** Le paramètre provoquant l'erreur. */
	private String param;

	/**
	 * Methode permettant de faire passer le message d'erreur.
	 * 
	 * @param message le message de complement d'exception.
	 */
	public GxtBuisnessException(String message) {
		super(message);
	}

	public GxtBuisnessException(Throwable cause) {
		super(cause);
	}

	public GxtBuisnessException(ErrorEnum err) {
		super(err.getLibelle());
		this.err = err;
	}

	public GxtBuisnessException(String cause, ErrorEnum err) {
		super(err.getLibelle());
		this.err = err;
		this.param = cause;
		
		sendMail();
	}

	public String getParam() {
		return param;
	}

	public void setParam(String cause) {
		this.param = cause;
	}

	public ErrorEnum getErr() {
		return err;
	}

	public void setErr(ErrorEnum err) {
		this.err = err;
	}
	
	
	private void sendMail() {
		
	}

	private static GxtBuisnessException build(ErrorEnum err) {
		return build(null, err);
	}

	/**
	 * Creation d'une exception de base typé grace a {@link ErrorEnum}.
	 * 
	 * @param err {@link ErrorEnum} associee a l'exception.
	 * @return Une {@link GxtBuisnessException} correspondant a l'{@link ErrorEnum}.
	 */
	public static GxtBuisnessException create(ErrorEnum err) {
		return build(err);
	}

	private static GxtBuisnessException build(String cause, ErrorEnum err) {
		if (ErrorEnum.NO_CHANNEL.equals(err)) {
			return new ErrorChannelException(cause);
		}
		if (ErrorEnum.TECHNICAL.equals(err)) {
			return new TechnicalException(cause);
		}

		return new GxtBuisnessException(cause, err);
	}
}
