package com.bnpp.galaxy.gxt.app.exception;


public enum ErrorEnum {
	/** Pas de route pour ce fichier */
	NO_CHANNEL("01", "Aucune route définie pour ce fichier."),

	/** Fichier non valide */
	NO_VALID_FILTER_FILE("02", "Le format de ce fichier n'est pas valide."),

	TECHNICAL("998", "Exception Technique."),
	
	NO_DEFINED("999", "Exception non définie.");

	private String code;
	private String libelle;

	private ErrorEnum(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

}
