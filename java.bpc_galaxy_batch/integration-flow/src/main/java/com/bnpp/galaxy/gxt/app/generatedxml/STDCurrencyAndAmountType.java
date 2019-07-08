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
 * NE PLUS UTILISER - Montant + devise associ�e
 * 
 * <p>Classe Java pour STDCurrencyAndAmountType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDCurrencyAndAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Curr" type="{}CurrencyCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDCurrencyAndAmountType", propOrder = {
    "amnt",
    "curr"
})
public class STDCurrencyAndAmountType {

    @XmlElement(name = "Amnt")
    protected double amnt;
    @XmlElement(name = "Curr", required = true)
    protected String curr;

    /**
     * Obtient la valeur de la propri�t� amnt.
     * 
     */
    public double getAmnt() {
        return amnt;
    }

    /**
     * D�finit la valeur de la propri�t� amnt.
     * 
     */
    public void setAmnt(double value) {
        this.amnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� curr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurr() {
        return curr;
    }

    /**
     * D�finit la valeur de la propri�t� curr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurr(String value) {
        this.curr = value;
    }

}
