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
 * Pour exprimer les taux : pourcentage, pourmillage: A utiliser pour les nouveaux pivots au lie de PercentageRate et BaseOnRate
 * 
 * <p>Classe Java pour STDPercentageType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDPercentageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDPercentageType", propOrder = {
    "rate",
    "base"
})
public class STDPercentageType {

    @XmlElement(name = "Rate")
    protected double rate;
    @XmlElement(name = "Base", required = true)
    protected BigInteger base;

    /**
     * Obtient la valeur de la propri�t� rate.
     * 
     */
    public double getRate() {
        return rate;
    }

    /**
     * D�finit la valeur de la propri�t� rate.
     * 
     */
    public void setRate(double value) {
        this.rate = value;
    }

    /**
     * Obtient la valeur de la propri�t� base.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBase() {
        return base;
    }

    /**
     * D�finit la valeur de la propri�t� base.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBase(BigInteger value) {
        this.base = value;
    }

}
