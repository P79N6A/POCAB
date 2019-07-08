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
 * Tiers impliqu� dans les moeyns de paiements compens�s sur le SIT
 * 
 * <p>Classe Java pour SITAgent complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SITAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SITPrtyType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SITBnkCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BrnchCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SITIdntfctn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{}Name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SITAgent", propOrder = {
    "sitPrtyType",
    "sitBnkCode",
    "brnchCode",
    "sitIdntfctn",
    "name"
})
public class SITAgent {

    @XmlElement(name = "SITPrtyType", required = true)
    protected String sitPrtyType;
    @XmlElement(name = "SITBnkCode", required = true)
    protected String sitBnkCode;
    @XmlElement(name = "BrnchCode")
    protected String brnchCode;
    @XmlElement(name = "SITIdntfctn", required = true)
    protected String sitIdntfctn;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Obtient la valeur de la propri�t� sitPrtyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITPrtyType() {
        return sitPrtyType;
    }

    /**
     * D�finit la valeur de la propri�t� sitPrtyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITPrtyType(String value) {
        this.sitPrtyType = value;
    }

    /**
     * Obtient la valeur de la propri�t� sitBnkCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITBnkCode() {
        return sitBnkCode;
    }

    /**
     * D�finit la valeur de la propri�t� sitBnkCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITBnkCode(String value) {
        this.sitBnkCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� brnchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchCode() {
        return brnchCode;
    }

    /**
     * D�finit la valeur de la propri�t� brnchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnchCode(String value) {
        this.brnchCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� sitIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITIdntfctn() {
        return sitIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� sitIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITIdntfctn(String value) {
        this.sitIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
