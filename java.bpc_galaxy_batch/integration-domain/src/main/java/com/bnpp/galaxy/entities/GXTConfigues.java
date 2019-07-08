/**
 *
 */
package com.bnpp.galaxy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author c59635
 *
 */

@Entity
@Table(name = "OWN_T_GXT_CONFIGS")

public class GXTConfigues implements java.io.Serializable {

	private static final long serialVersionUID = -1997794848527553185L;
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "LIBELLE")
	private String libelle;

	@Column(name = "LINES_TO_RECYCLE_LIMIT")
	private int fluxPrevToRecycleLimit;

	@Column(name = "LINES_TO_SKIP_LIMIT")
	private int fluxPrevToSkipLimit;

	@Column(name = "ACTIF")
	private Boolean actif;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getFluxPrevToRecycleLimit() {
		return fluxPrevToRecycleLimit;
	}

	public void setFluxPrevToRecycleLimit(int fluxPrevToRecycleLimit) {
		this.fluxPrevToRecycleLimit = fluxPrevToRecycleLimit;
	}

	public int getFluxPrevToSkipLimit() {
		return fluxPrevToSkipLimit;
	}

	public void setFluxPrevToSkipLimit(int fluxPrevToSkipLimit) {
		this.fluxPrevToSkipLimit = fluxPrevToSkipLimit;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}
}
