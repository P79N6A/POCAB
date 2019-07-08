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
 * Valeur d'un prix
 * 
 * <p>Classe Java pour SLNV1PriceValue complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1PriceValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Rate" type="{}STDPercentageType"/>
 *         &lt;element name="Amnt" type="{}SLNV1CurrencyAndAmountType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1PriceValue", propOrder = {
    "rate",
    "amnt"
})
public class SLNV1PriceValue {

    @XmlElement(name = "Rate")
    protected STDPercentageType rate;
    @XmlElement(name = "Amnt")
    protected SLNV1CurrencyAndAmountType amnt;

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
