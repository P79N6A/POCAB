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
 * NE PLUS UTILISER - Frais - Remplac� par STDFeeType
 * 
 * <p>Classe Java pour FeesType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FeesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{}FeesCode"/>
 *         &lt;element name="BaseAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Status" type="{}FeesStatusCode"/>
 *         &lt;element name="DerogtnId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Rate" type="{}PercentageRate" minOccurs="0"/>
 *         &lt;element name="Amnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="RateType" type="{}RateTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeesType", propOrder = {
    "code",
    "baseAmnt",
    "status",
    "derogtnId",
    "rate",
    "amnt",
    "rateType"
})
public class FeesType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "BaseAmnt")
    protected CurrencyAndAmount baseAmnt;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "DerogtnId")
    protected String derogtnId;
    @XmlElement(name = "Rate")
    protected PercentageRate rate;
    @XmlElement(name = "Amnt")
    protected CurrencyAndAmount amnt;
    @XmlElement(name = "RateType")
    protected String rateType;

    /**
     * Obtient la valeur de la propri�t� code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * D�finit la valeur de la propri�t� code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propri�t� baseAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getBaseAmnt() {
        return baseAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� baseAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setBaseAmnt(CurrencyAndAmount value) {
        this.baseAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� derogtnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerogtnId() {
        return derogtnId;
    }

    /**
     * D�finit la valeur de la propri�t� derogtnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerogtnId(String value) {
        this.derogtnId = value;
    }

    /**
     * Obtient la valeur de la propri�t� rate.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRate }
     *     
     */
    public PercentageRate getRate() {
        return rate;
    }

    /**
     * D�finit la valeur de la propri�t� rate.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRate }
     *     
     */
    public void setRate(PercentageRate value) {
        this.rate = value;
    }

    /**
     * Obtient la valeur de la propri�t� amnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmnt() {
        return amnt;
    }

    /**
     * D�finit la valeur de la propri�t� amnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmnt(CurrencyAndAmount value) {
        this.amnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� rateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * D�finit la valeur de la propri�t� rateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

}
