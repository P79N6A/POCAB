package com.bnpp.galaxy.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "job_report") // TODO Change or use default?
public class JobReport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // TODO Which strategy?
    @Column
    private Long id;

    @Column
    private Long JobId;

    /**
     * Identifiant du batch de lancement du traitement
     */
    @Column(nullable = false)
    private long refComtpeRendu; // TODO ID ? A supprimer?

    /**
     * Identifiant du flux source (nom de fichier, identifiant de message...)
     */
    @Column(name = "reffluxs")
    private String reffluxs;

    /**
     * Identifiant du flux cible (nom de fichier, identifiant de message...)
     */
    @Column(name = "reffluxt")
    private String reffluxt;

    /**
     * Statut du traitement
     */
    @Column(name = "statut")
    private JobReportStatus statut;

    /**
     * Date et heure de début du traitement
     */
    @Column(name = "startDate")
    private Date startDate;

    /**
     * Date et heure de fin du traitement
     */
    @Column(name = "endDate")
    private Date endDate;

    /**
     * Nombre de lignes reçues
     */
    @Column(name = "recepLigne")
    private Long recepLigne;

    /**
     * Nombre de lignes traitées
     */
    @Column(name = "traitLine")
    private Long traitLine;

    /**
     * Nombre de lignes transmises
     */
    @Column(name = "transLine")
    private Long transLine;

    /**
     * Nombre de lignes en erreur
     */
    @Column(name = "nbrLineError")
    private Long nbrLineError;

    /**
     * Nombre de champs mappés
     */
    @Column(name = "mapField")
    private Long mapField;

    /**
     * Nombre de champs filtrés
     */
    @Column(name = "filterField")
    private Long filterField;

    /**
     * Nombre de champs transcodés
     */
    @Column(name = "transcField")
    private Long transcField;

    /**
     * Détail de l'erreur. Dans le cas d'une erreur de transformation, l'erreur est détaillée pour chaque ligne en erreur
     */
    @OneToMany(mappedBy = "report") // TODO Confirm options
    private List<JobReportErrorDetail> errorDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getRefComtpeRendu() {
        return refComtpeRendu;
    }

    public void setRefComtpeRendu(long refComtpeRendu) {
        this.refComtpeRendu = refComtpeRendu;
    }

    public String getReffluxs() {
        return reffluxs;
    }

    public Long getJobId() {
		return JobId;
	}

	public void setJobId(Long jobId) {
		JobId = jobId;
	}

	public void setReffluxs(String reffluxs) {
        this.reffluxs = reffluxs;
    }

    public String getReffluxt() {
        return reffluxt;
    }

    public void setReffluxt(String reffluxt) {
        this.reffluxt = reffluxt;
    }

	public JobReportStatus getStatut() {
		return statut;
	}

	public void setStatut(JobReportStatus statut) {
		this.statut = statut;
	}

	public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getRecepLigne() {
        return recepLigne;
    }

    public void setRecepLigne(Long recepLigne) {
        this.recepLigne = recepLigne;
    }

    public Long getTraitLine() {
        return traitLine;
    }

    public void setTraitLine(Long traitLine) {
        this.traitLine = traitLine;
    }

    public Long getTransLine() {
        return transLine;
    }

    public void setTransLine(Long transLine) {
        this.transLine = transLine;
    }

    public Long getNbrLineError() {
        return nbrLineError;
    }

    public void setNbrLineError(Long nbrLineError) {
        this.nbrLineError = nbrLineError;
    }

    public Long getMapField() {
        return mapField;
    }

    public void setMapField(Long mapField) {
        this.mapField = mapField;
    }

    public Long getFilterField() {
        return filterField;
    }

    public void setFilterField(Long filterField) {
        this.filterField = filterField;
    }

    public Long getTranscField() {
        return transcField;
    }

    public void setTranscField(Long transcField) {
        this.transcField = transcField;
    }

    public List<JobReportErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<JobReportErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }
}
