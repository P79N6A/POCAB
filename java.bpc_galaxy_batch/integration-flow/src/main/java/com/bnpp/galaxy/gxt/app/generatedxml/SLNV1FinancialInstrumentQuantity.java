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
 * Quantit� d'un instrument financier
 * 
 * <p>Classe Java pour SLNV1FinancialInstrumentQuantity complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1FinancialInstrumentQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FaceAmnt" type="{}SLNV1CurrencyAndAmountType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1FinancialInstrumentQuantity", propOrder = {
    "qty",
    "faceAmnt"
})
public class SLNV1FinancialInstrumentQuantity {

    @XmlElement(name = "Qty")
    protected Double qty;
    @XmlElement(name = "FaceAmnt")
    protected SLNV1CurrencyAndAmountType faceAmnt;

    /**
     * Obtient la valeur de la propri�t� qty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQty() {
        return qty;
    }

    /**
     * D�finit la valeur de la propri�t� qty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQty(Double value) {
        this.qty = value;
    }

    /**
     * Obtient la valeur de la propri�t� faceAmnt.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1CurrencyAndAmountType }
     *     
     */
    public SLNV1CurrencyAndAmountType getFaceAmnt() {
        return faceAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� faceAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1CurrencyAndAmountType }
     *     
     */
    public void setFaceAmnt(SLNV1CurrencyAndAmountType value) {
        this.faceAmnt = value;
    }

}
