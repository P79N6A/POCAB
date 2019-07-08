//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Information permettant d'identifier un objet avec une version (produit, accord de distribution et �ventuellement contrat, etc) (remplace STDIdentificationWithVersionType)
 * 
 * <p>Classe Java pour SLNV1IdentificationWithVersionType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1IdentificationWithVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idntfctn" type="{}STDIdentifierType"/>
 *         &lt;element name="Issuer" type="{}IssuerCodeSLN"/>
 *         &lt;element name="Schme" type="{}SchemeCodeSLN"/>
 *         &lt;element name="VrsId" type="{}STDIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1IdentificationWithVersionType", propOrder = {
    "idntfctn",
    "issuer",
    "schme",
    "vrsId"
})
public class SLNV1IdentificationWithVersionType {

    @XmlElement(name = "Idntfctn", required = true)
    protected String idntfctn;
    @XmlElement(name = "Issuer", required = true)
    protected String issuer;
    @XmlElement(name = "Schme", required = true)
    protected String schme;
    @XmlElement(name = "VrsId")
    protected String vrsId;

    /**
     * Obtient la valeur de la propri�t� idntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntfctn() {
        return idntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� idntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdntfctn(String value) {
        this.idntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� issuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * D�finit la valeur de la propri�t� issuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Obtient la valeur de la propri�t� schme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchme() {
        return schme;
    }

    /**
     * D�finit la valeur de la propri�t� schme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchme(String value) {
        this.schme = value;
    }

    /**
     * Obtient la valeur de la propri�t� vrsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsId() {
        return vrsId;
    }

    /**
     * D�finit la valeur de la propri�t� vrsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsId(String value) {
        this.vrsId = value;
    }

}
