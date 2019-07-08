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
 * Gestion de tous les types de fr�quence (remplace notamment le type simple SplitIndicatorCode)
 * 
 * <p>Classe Java pour SLNV1FrequencyDataType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1FrequencyDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FqcyType" type="{}FrequencyTypeCodeSLN"/>
 *         &lt;element name="PrdType" type="{}PeriodTypeCodeSLN" minOccurs="0"/>
 *         &lt;element name="SpecifPrdType" type="{}SpecificPeriodTypeCodeSLN" minOccurs="0"/>
 *         &lt;element name="PrdTimesNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1FrequencyDataType", propOrder = {
    "fqcyType",
    "prdType",
    "specifPrdType",
    "prdTimesNumb"
})
public class SLNV1FrequencyDataType {

    @XmlElement(name = "FqcyType", required = true)
    protected String fqcyType;
    @XmlElement(name = "PrdType")
    protected String prdType;
    @XmlElement(name = "SpecifPrdType")
    protected String specifPrdType;
    @XmlElement(name = "PrdTimesNumb")
    protected BigInteger prdTimesNumb;

    /**
     * Obtient la valeur de la propri�t� fqcyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFqcyType() {
        return fqcyType;
    }

    /**
     * D�finit la valeur de la propri�t� fqcyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFqcyType(String value) {
        this.fqcyType = value;
    }

    /**
     * Obtient la valeur de la propri�t� prdType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdType() {
        return prdType;
    }

    /**
     * D�finit la valeur de la propri�t� prdType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdType(String value) {
        this.prdType = value;
    }

    /**
     * Obtient la valeur de la propri�t� specifPrdType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifPrdType() {
        return specifPrdType;
    }

    /**
     * D�finit la valeur de la propri�t� specifPrdType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecifPrdType(String value) {
        this.specifPrdType = value;
    }

    /**
     * Obtient la valeur de la propri�t� prdTimesNumb.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrdTimesNumb() {
        return prdTimesNumb;
    }

    /**
     * D�finit la valeur de la propri�t� prdTimesNumb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrdTimesNumb(BigInteger value) {
        this.prdTimesNumb = value;
    }

}
