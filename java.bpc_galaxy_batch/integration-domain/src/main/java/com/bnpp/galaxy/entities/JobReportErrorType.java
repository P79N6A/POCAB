package com.bnpp.galaxy.entities;

public enum JobReportErrorType {

    TRANSCODIFICATION("Erreur de transcodification"),
    MAPPING("Erreur de mapping"),
    FILTER("Erreur de filtrage"),
    ENRICHMENT("Erreur d'enrichissement");

    private final String message;

    JobReportErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
