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
 * NE PLUS UTILISER - Quantit� d'un instrument financier (remplac� par SLNV1FinancialInstrumentQuantity)
 * 
 * <p>Classe Java pour FinancialInstrumentQuantity complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Unit" type="{}DecimalNumber"/>
 *         &lt;element name="FaceAmnt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="AmrtsdValue" type="{}CurrencyAndAmount"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity", propOrder = {
    "unit",
    "faceAmnt",
    "amrtsdValue"
})
public class FinancialInstrumentQuantity {

    @XmlElement(name = "Unit")
    protected DecimalNumber unit;
    @XmlElement(name = "FaceAmnt")
    protected CurrencyAndAmount faceAmnt;
    @XmlElement(name = "AmrtsdValue")
    protected CurrencyAndAmount amrtsdValue;

    /**
     * Obtient la valeur de la propri�t� unit.
     * 
     * @return
     *     possible object is
     *     {@link DecimalNumber }
     *     
     */
    public DecimalNumber getUnit() {
        return unit;
    }

    /**
     * D�finit la valeur de la propri�t� unit.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalNumber }
     *     
     */
    public void setUnit(DecimalNumber value) {
        this.unit = value;
    }

    /**
     * Obtient la valeur de la propri�t� faceAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getFaceAmnt() {
        return faceAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� faceAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setFaceAmnt(CurrencyAndAmount value) {
        this.faceAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� amrtsdValue.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmrtsdValue() {
        return amrtsdValue;
    }

    /**
     * D�finit la valeur de la propri�t� amrtsdValue.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmrtsdValue(CurrencyAndAmount value) {
        this.amrtsdValue = value;
    }

}
