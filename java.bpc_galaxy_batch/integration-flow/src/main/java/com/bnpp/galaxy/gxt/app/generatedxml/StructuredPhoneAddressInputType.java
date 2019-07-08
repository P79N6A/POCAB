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
 * INPUT = StructuredPhoneAddress
 * 
 * <p>Classe Java pour StructuredPhoneAddressInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StructuredPhoneAddressInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="CntryIdntfctn" type="{}CountryCode" minOccurs="0"/>
 *         &lt;element name="AreaIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubscrIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtnsnIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPhoneAddressInputType", propOrder = {
    "cntryIdntfctn",
    "areaIdntfctn",
    "subscrIdntfctn",
    "extnsnIdntfctn"
})
public class StructuredPhoneAddressInputType {

    @XmlElement(name = "CntryIdntfctn")
    protected String cntryIdntfctn;
    @XmlElement(name = "AreaIdntfctn")
    protected String areaIdntfctn;
    @XmlElement(name = "SubscrIdntfctn")
    protected String subscrIdntfctn;
    @XmlElement(name = "ExtnsnIdntfctn")
    protected String extnsnIdntfctn;

    /**
     * Obtient la valeur de la propri�t� cntryIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntryIdntfctn() {
        return cntryIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� cntryIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntryIdntfctn(String value) {
        this.cntryIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� areaIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaIdntfctn() {
        return areaIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� areaIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaIdntfctn(String value) {
        this.areaIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� subscrIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscrIdntfctn() {
        return subscrIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� subscrIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscrIdntfctn(String value) {
        this.subscrIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� extnsnIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnsnIdntfctn() {
        return extnsnIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� extnsnIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtnsnIdntfctn(String value) {
        this.extnsnIdntfctn = value;
    }

}
