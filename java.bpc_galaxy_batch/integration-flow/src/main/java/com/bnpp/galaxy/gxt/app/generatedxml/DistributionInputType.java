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
 * INPUT =
 * 
 * <p>Classe Java pour DistributionInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DistributionInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="UndrlyngIdntfctn" type="{}UnderlyingIdentificationInputType" minOccurs="0"/>
 *         &lt;element name="DistrbtnRnk" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutstdngRate" type="{}PercentageRate" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="DistrbtnRate" type="{}PercentageRate" minOccurs="0"/>
 *           &lt;element name="DistrbtnAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *           &lt;element name="UnitNumb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionInputType", propOrder = {
    "undrlyngIdntfctn",
    "distrbtnRnk",
    "outstdngRate",
    "distrbtnRate",
    "distrbtnAmnt",
    "unitNumb"
})
public class DistributionInputType {

    @XmlElement(name = "UndrlyngIdntfctn")
    protected UnderlyingIdentificationInputType undrlyngIdntfctn;
    @XmlElement(name = "DistrbtnRnk")
    protected String distrbtnRnk;
    @XmlElement(name = "OutstdngRate")
    protected PercentageRate outstdngRate;
    @XmlElement(name = "DistrbtnRate")
    protected PercentageRate distrbtnRate;
    @XmlElement(name = "DistrbtnAmnt")
    protected CurrencyAndAmount distrbtnAmnt;
    @XmlElement(name = "UnitNumb")
    protected Double unitNumb;

    /**
     * Obtient la valeur de la propri�t� undrlyngIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingIdentificationInputType }
     *     
     */
    public UnderlyingIdentificationInputType getUndrlyngIdntfctn() {
        return undrlyngIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� undrlyngIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingIdentificationInputType }
     *     
     */
    public void setUndrlyngIdntfctn(UnderlyingIdentificationInputType value) {
        this.undrlyngIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� distrbtnRnk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrbtnRnk() {
        return distrbtnRnk;
    }

    /**
     * D�finit la valeur de la propri�t� distrbtnRnk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrbtnRnk(String value) {
        this.distrbtnRnk = value;
    }

    /**
     * Obtient la valeur de la propri�t� outstdngRate.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRate }
     *     
     */
    public PercentageRate getOutstdngRate() {
        return outstdngRate;
    }

    /**
     * D�finit la valeur de la propri�t� outstdngRate.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRate }
     *     
     */
    public void setOutstdngRate(PercentageRate value) {
        this.outstdngRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� distrbtnRate.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRate }
     *     
     */
    public PercentageRate getDistrbtnRate() {
        return distrbtnRate;
    }

    /**
     * D�finit la valeur de la propri�t� distrbtnRate.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRate }
     *     
     */
    public void setDistrbtnRate(PercentageRate value) {
        this.distrbtnRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� distrbtnAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDistrbtnAmnt() {
        return distrbtnAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� distrbtnAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDistrbtnAmnt(CurrencyAndAmount value) {
        this.distrbtnAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� unitNumb.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitNumb() {
        return unitNumb;
    }

    /**
     * D�finit la valeur de la propri�t� unitNumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitNumb(Double value) {
        this.unitNumb = value;
    }

}
