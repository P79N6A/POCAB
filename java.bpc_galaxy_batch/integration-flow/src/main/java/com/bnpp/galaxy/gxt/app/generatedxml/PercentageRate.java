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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * NE PLUS UTILISER - Rapport exprim� en pourcentage (remplac� par STDPercentageType)
 * 
 * <p>Classe Java pour PercentageRate complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PercentageRate">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>NumberDecType">
 *       &lt;attribute name="RateBase" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRate", propOrder = {
    "value"
})
public class PercentageRate {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "RateBase", required = true)
    protected BigInteger rateBase;

    /**
     * NE PAS UTILISER - Permet de limiter la taille des Nombres D�cimaux dans les complex types
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� rateBase.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateBase() {
        return rateBase;
    }

    /**
     * D�finit la valeur de la propri�t� rateBase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateBase(BigInteger value) {
        this.rateBase = value;
    }

}
