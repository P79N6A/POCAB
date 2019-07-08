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
 * NE PLUS UTILISER - Type complexe pour les frais (INPUT)
 * 
 * <p>Classe Java pour STDFeeInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDFeeInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{}FeesCode" minOccurs="0"/>
 *         &lt;element name="BaseAmnt" type="{}STDCurrencyAndAmountType" minOccurs="0"/>
 *         &lt;element name="Status" type="{}FeesStatusCode" minOccurs="0"/>
 *         &lt;element name="DerogtnId" type="{}STDIdentifierType" minOccurs="0"/>
 *         &lt;element name="Rate" type="{}STDPercentageType" minOccurs="0"/>
 *         &lt;element name="Amnt" type="{}STDCurrencyAndAmountType" minOccurs="0"/>
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
@XmlType(name = "STDFeeInputType", propOrder = {
    "code",
    "baseAmnt",
    "status",
    "derogtnId",
    "rate",
    "amnt",
    "rateType"
})
public class STDFeeInputType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "BaseAmnt")
    protected STDCurrencyAndAmountType baseAmnt;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "DerogtnId")
    protected String derogtnId;
    @XmlElement(name = "Rate")
    protected STDPercentageType rate;
    @XmlElement(name = "Amnt")
    protected STDCurrencyAndAmountType amnt;
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
     *     {@link STDCurrencyAndAmountType }
     *     
     */
    public STDCurrencyAndAmountType getBaseAmnt() {
        return baseAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� baseAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link STDCurrencyAndAmountType }
     *     
     */
    public void setBaseAmnt(STDCurrencyAndAmountType value) {
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
     *     {@link STDPercentageType }
     *     
     */
    public STDPercentageType getRate() {
        return rate;
    }

    /**
     * D�finit la valeur de la propri�t� rate.
     * 
     * @param value
     *     allowed object is
     *     {@link STDPercentageType }
     *     
     */
    public void setRate(STDPercentageType value) {
        this.rate = value;
    }

    /**
     * Obtient la valeur de la propri�t� amnt.
     * 
     * @return
     *     possible object is
     *     {@link STDCurrencyAndAmountType }
     *     
     */
    public STDCurrencyAndAmountType getAmnt() {
        return amnt;
    }

    /**
     * D�finit la valeur de la propri�t� amnt.
     * 
     * @param value
     *     allowed object is
     *     {@link STDCurrencyAndAmountType }
     *     
     */
    public void setAmnt(STDCurrencyAndAmountType value) {
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
