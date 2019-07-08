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
 * Type permettant de g�r�r les donn�es d'un produit pouvant �tre r�f�renc�es dans diff�rents pivots
 * 
 * <p>Classe Java pour SLNV1ProductSharedDataType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1ProductSharedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PdctIdntfctn" type="{}SLNV1ObjectIdentificationType"/>
 *         &lt;element name="InsActvty" type="{}InsuranceActivityCodeSLN" minOccurs="0"/>
 *         &lt;element name="PdctFam" type="{}ProductFamilyCodeSLN" minOccurs="0"/>
 *         &lt;element name="LegalSchme" type="{}LegalSchemeCodeSLN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1ProductSharedDataType", propOrder = {
    "pdctIdntfctn",
    "insActvty",
    "pdctFam",
    "legalSchme"
})
public class SLNV1ProductSharedDataType {

    @XmlElement(name = "PdctIdntfctn", required = true)
    protected SLNV1ObjectIdentificationType pdctIdntfctn;
    @XmlElement(name = "InsActvty")
    protected String insActvty;
    @XmlElement(name = "PdctFam")
    protected String pdctFam;
    @XmlElement(name = "LegalSchme")
    protected String legalSchme;

    /**
     * Obtient la valeur de la propri�t� pdctIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1ObjectIdentificationType }
     *     
     */
    public SLNV1ObjectIdentificationType getPdctIdntfctn() {
        return pdctIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� pdctIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1ObjectIdentificationType }
     *     
     */
    public void setPdctIdntfctn(SLNV1ObjectIdentificationType value) {
        this.pdctIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� insActvty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsActvty() {
        return insActvty;
    }

    /**
     * D�finit la valeur de la propri�t� insActvty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsActvty(String value) {
        this.insActvty = value;
    }

    /**
     * Obtient la valeur de la propri�t� pdctFam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctFam() {
        return pdctFam;
    }

    /**
     * D�finit la valeur de la propri�t� pdctFam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctFam(String value) {
        this.pdctFam = value;
    }

    /**
     * Obtient la valeur de la propri�t� legalSchme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalSchme() {
        return legalSchme;
    }

    /**
     * D�finit la valeur de la propri�t� legalSchme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalSchme(String value) {
        this.legalSchme = value;
    }

}
