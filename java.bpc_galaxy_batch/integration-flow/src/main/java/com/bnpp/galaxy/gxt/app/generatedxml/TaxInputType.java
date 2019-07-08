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
 * NE PLUS UTILISER - INPUT = TaxType
 * 
 * <p>Classe Java pour TaxInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaxInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="TaxType" type="{}TaxTypeCode" minOccurs="0"/>
 *         &lt;element name="BaseAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Rate" type="{}PercentageRate" minOccurs="0"/>
 *         &lt;element name="Amnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInputType", propOrder = {
    "taxType",
    "baseAmnt",
    "rate",
    "amnt"
})
public class TaxInputType {

    @XmlElement(name = "TaxType")
    protected String taxType;
    @XmlElement(name = "BaseAmnt")
    protected CurrencyAndAmount baseAmnt;
    @XmlElement(name = "Rate")
    protected PercentageRate rate;
    @XmlElement(name = "Amnt")
    protected CurrencyAndAmount amnt;

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

}
