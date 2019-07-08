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
 * NE PLUS UTILISER - Type de la taxe
 * 
 * <p>Classe Java pour STDTaxType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxType" type="{}TaxTypeCode"/>
 *         &lt;element name="BaseAmnt" type="{}STDCurrencyAndAmountType"/>
 *         &lt;element name="Rate" type="{}STDPercentageType"/>
 *         &lt;element name="Amnt" type="{}STDCurrencyAndAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDTaxType", propOrder = {
    "taxType",
    "baseAmnt",
    "rate",
    "amnt"
})
public class STDTaxType {

    @XmlElement(name = "TaxType", required = true)
    protected String taxType;
    @XmlElement(name = "BaseAmnt", required = true)
    protected STDCurrencyAndAmountType baseAmnt;
    @XmlElement(name = "Rate", required = true)
    protected STDPercentageType rate;
    @XmlElement(name = "Amnt", required = true)
    protected STDCurrencyAndAmountType amnt;

    /**
     * Obtient la valeur de la propri�t� taxType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * D�finit la valeur de la propri�t� taxType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
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

}
