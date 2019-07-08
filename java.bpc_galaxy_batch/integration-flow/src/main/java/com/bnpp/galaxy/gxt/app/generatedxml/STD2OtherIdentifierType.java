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
 * NE PLUS UTILISER
 * 
 * <p>Classe Java pour STD2OtherIdentifierType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STD2OtherIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idntfctn" type="{}STDIdentifierType"/>
 *         &lt;element name="VersId" type="{}STDIdentifierType" minOccurs="0"/>
 *         &lt;element name="Scheme" type="{}SchemeCode" minOccurs="0"/>
 *         &lt;element name="Applctn" type="{}ApplicationCode" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{}IssuerCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STD2OtherIdentifierType", propOrder = {
    "idntfctn",
    "versId",
    "scheme",
    "applctn",
    "issuer"
})
public class STD2OtherIdentifierType {

    @XmlElement(name = "Idntfctn", required = true)
    protected String idntfctn;
    @XmlElement(name = "VersId")
    protected String versId;
    @XmlElement(name = "Scheme")
    protected String scheme;
    @XmlElement(name = "Applctn")
    protected String applctn;
    @XmlElement(name = "Issuer")
    protected String issuer;

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
     * Obtient la valeur de la propri�t� versId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersId() {
        return versId;
    }

    /**
     * D�finit la valeur de la propri�t� versId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersId(String value) {
        this.versId = value;
    }

    /**
     * Obtient la valeur de la propri�t� scheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * D�finit la valeur de la propri�t� scheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

    /**
     * Obtient la valeur de la propri�t� applctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplctn() {
        return applctn;
    }

    /**
     * D�finit la valeur de la propri�t� applctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplctn(String value) {
        this.applctn = value;
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

}
