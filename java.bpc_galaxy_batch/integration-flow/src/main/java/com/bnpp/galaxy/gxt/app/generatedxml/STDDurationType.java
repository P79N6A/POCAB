//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * quantit� d'une dur�e + l'unit� de la dur�e : A UTILISER POUR LES NOUVEAUX PIVOTS
 * 
 * <p>Classe Java pour STDDurationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDDurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DuratnQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DuratnUnit" type="{}TimeUnitCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDDurationType", propOrder = {
    "duratnQty",
    "duratnUnit"
})
public class STDDurationType {

    @XmlElement(name = "DuratnQty", required = true)
    protected BigInteger duratnQty;
    @XmlElement(name = "DuratnUnit", required = true)
    protected String duratnUnit;

    /**
     * Obtient la valeur de la propri�t� duratnQty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuratnQty() {
        return duratnQty;
    }

    /**
     * D�finit la valeur de la propri�t� duratnQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuratnQty(BigInteger value) {
        this.duratnQty = value;
    }

    /**
     * Obtient la valeur de la propri�t� duratnUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuratnUnit() {
        return duratnUnit;
    }

    /**
     * D�finit la valeur de la propri�t� duratnUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuratnUnit(String value) {
        this.duratnUnit = value;
    }

}
