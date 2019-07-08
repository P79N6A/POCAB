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
 * Type de la taxe (remplace STDTaxType)
 * 
 * <p>Classe Java pour SLNV1TaxType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1TaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxType" type="{}TaxTypeCodeSLN"/>
 *         &lt;element name="BaseAmnt" type="{}SLNV1CurrencyAndAmountType"/>
 *         &lt;element name="Rate" type="{}STDPercentageType"/>
 *         &lt;element name="Amnt" type="{}SLNV1CurrencyAndAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1TaxType", propOrder = {
    "taxType",
    "baseAmnt",
    "rate",
    "amnt"
})
public class SLNV1TaxType {

    @XmlElement(name = "TaxType", required = true)
    protected String taxType;
    @XmlElement(name = "BaseAmnt", required = true)
    protected SLNV1CurrencyAndAmountType baseAmnt;
    @XmlElement(name = "Rate", required = true)
    protected STDPercentageType rate;
    @XmlElement(name = "Amnt", required = true)
    protected SLNV1CurrencyAndAmountType amnt;

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
     *     {@link SLNV1CurrencyAndAmountType }
     *     
     */
    public SLNV1CurrencyAndAmountType getBaseAmnt() {
        return baseAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� baseAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1CurrencyAndAmountType }
     *     
     */
    public void setBaseAmnt(SLNV1CurrencyAndAmountType value) {
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
     *     {@link SLNV1CurrencyAndAmountType }
     *     
     */
    public SLNV1CurrencyAndAmountType getAmnt() {
        return amnt;
    }

    /**
     * D�finit la valeur de la propri�t� amnt.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1CurrencyAndAmountType }
     *     
     */
    public void setAmnt(SLNV1CurrencyAndAmountType value) {
        this.amnt = value;
    }

}
