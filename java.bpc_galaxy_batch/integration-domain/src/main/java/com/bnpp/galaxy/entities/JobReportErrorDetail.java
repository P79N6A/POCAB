package com.bnpp.galaxy.entities;

import javax.persistence.*;

@Entity
@Table(name = "job_report_error_detail") // TODO Change or use default?
public class    JobReportErrorDetail {

    @Id
    @GeneratedValue // TODO Which strategy?
    @Column
    private Long id;

    /**
     * Owner report
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "JobId", nullable = false)
    private JobReport report;

    /**
     * Message du type d'erreur
     */
    @Column
    private JobReportErrorType errorType;

    /**
     * Identifiant de la ligne en erreur
     */
    @Column
    private String refLine;

    /**
     * Contenu de la ligne en erreur
     */
    @Column
    private String data;

    /**
     * Message d'erreur
     */
    @Column
    private String errorMessage;

    // TODO Autres champs ?
    //
    // Ajout d’une table contenant la liste des lignes en erreurs,
    // cette table contiendra 4 colonnes : Identifiant de la ligne,
    // contenu de la ligne, message d’erreur de mapping, transcodficaition,
    // filtre ou enrichissement, identifiant du compte rendu. "


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobReport getReport() {
        return report;
    }

    public void setReport(JobReport report) {
        this.report = report;
    }

    public String getRefLine() {
        return refLine;
    }

    public void setRefLine(String refLine) {
        this.refLine = refLine;
    }

    public String getData() {
        return data;
    }

	public JobReportErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(JobReportErrorType errorType) {
		this.errorType = errorType;
	}

	public void setData(String data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
