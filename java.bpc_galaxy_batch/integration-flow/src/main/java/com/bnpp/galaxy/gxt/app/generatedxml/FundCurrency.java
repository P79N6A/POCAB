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
 * Devises du fonds : le cas �ch�ant, devise de valorisation, devise de publication de la VL, devise de cotation
 * 
 * <p>Classe Java pour FundCurrency complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FundCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Curr" type="{}CurrencyCode"/>
 *         &lt;element name="Usge" type="{}FundCurrencyUsage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundCurrency", propOrder = {
    "curr",
    "usge"
})
public class FundCurrency {

    @XmlElement(name = "Curr", required = true)
    protected String curr;
    @XmlElement(name = "Usge", required = true)
    protected String usge;

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

    /**
     * Obtient la valeur de la propri�t� usge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsge() {
        return usge;
    }

    /**
     * D�finit la valeur de la propri�t� usge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsge(String value) {
        this.usge = value;
    }

}
