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
 * INPUT = PhoneLocationType
 * 
 * <p>Classe Java pour PhoneLocationInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PhoneLocationInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="PhoneAdrsId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhoneAdrsType" type="{}PhoneAddressTypeCode" minOccurs="0"/>
 *         &lt;element name="PhoneAdrs" type="{}PhoneAddressInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneLocationInputType", propOrder = {
    "phoneAdrsId",
    "phoneAdrsType",
    "phoneAdrs"
})
public class PhoneLocationInputType {

    @XmlElement(name = "PhoneAdrsId")
    protected String phoneAdrsId;
    @XmlElement(name = "PhoneAdrsType")
    protected String phoneAdrsType;
    @XmlElement(name = "PhoneAdrs")
    protected PhoneAddressInputType phoneAdrs;

    /**
     * Obtient la valeur de la propri�t� phoneAdrsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAdrsId() {
        return phoneAdrsId;
    }

    /**
     * D�finit la valeur de la propri�t� phoneAdrsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAdrsId(String value) {
        this.phoneAdrsId = value;
    }

    /**
     * Obtient la valeur de la propri�t� phoneAdrsType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAdrsType() {
        return phoneAdrsType;
    }

    /**
     * D�finit la valeur de la propri�t� phoneAdrsType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAdrsType(String value) {
        this.phoneAdrsType = value;
    }

    /**
     * Obtient la valeur de la propri�t� phoneAdrs.
     * 
     * @return
     *     possible object is
     *     {@link PhoneAddressInputType }
     *     
     */
    public PhoneAddressInputType getPhoneAdrs() {
        return phoneAdrs;
    }

    /**
     * D�finit la valeur de la propri�t� phoneAdrs.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneAddressInputType }
     *     
     */
    public void setPhoneAdrs(PhoneAddressInputType value) {
        this.phoneAdrs = value;
    }

}
