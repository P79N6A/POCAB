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
 * NE PLUS UTILISER - Information permettant d'identifier une entit�, comme un Tiers ou un Compte
 * 
 * <p>Classe Java pour IdentificationInformation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificationInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idntfctn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Issuer" type="{}IssuerCode"/>
 *         &lt;element name="Schme" type="{}SchemeCode"/>
 *         &lt;element name="SchmeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationInformation", propOrder = {
    "idntfctn",
    "issuer",
    "schme",
    "schmeName",
    "subIdntfctn"
})
public class IdentificationInformation {

    @XmlElement(name = "Idntfctn", required = true)
    protected String idntfctn;
    @XmlElement(name = "Issuer", required = true)
    protected String issuer;
    @XmlElement(name = "Schme", required = true)
    protected String schme;
    @XmlElement(name = "SchmeName")
    protected String schmeName;
    @XmlElement(name = "SubIdntfctn")
    protected String subIdntfctn;

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
     * Obtient la valeur de la propri�t� schmeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeName() {
        return schmeName;
    }

    /**
     * D�finit la valeur de la propri�t� schmeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchmeName(String value) {
        this.schmeName = value;
    }

    /**
     * Obtient la valeur de la propri�t� subIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubIdntfctn() {
        return subIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� subIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIdntfctn(String value) {
        this.subIdntfctn = value;
    }

}
