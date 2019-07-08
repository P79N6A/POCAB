/**
 *
 */
package com.bnpp.galaxy.dto;

import lombok.Data;

/**
 * @author c59635
 *
 */

@Data
public class GXTConfiguesDTO implements java.io.Serializable {

	private static final long serialVersionUID = 8564789501907475893L;
	private int id;

	private String libelle;

	private int fluxPrevToRecycleLimit;
	private int fluxPrevToSkipLimit;

	private Boolean actif;

}
