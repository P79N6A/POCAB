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
 * INPUT = PhoneAddressType
 * 
 * <p>Classe Java pour PhoneAddressInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PhoneAddressInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unstruc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Structed" type="{}StructuredPhoneAddressInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneAddressInputType", propOrder = {
    "unstruc",
    "structed"
})
public class PhoneAddressInputType {

    @XmlElement(name = "Unstruc")
    protected String unstruc;
    @XmlElement(name = "Structed")
    protected StructuredPhoneAddressInputType structed;

    /**
     * Obtient la valeur de la propri�t� unstruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnstruc() {
        return unstruc;
    }

    /**
     * D�finit la valeur de la propri�t� unstruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnstruc(String value) {
        this.unstruc = value;
    }

    /**
     * Obtient la valeur de la propri�t� structed.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPhoneAddressInputType }
     *     
     */
    public StructuredPhoneAddressInputType getStructed() {
        return structed;
    }

    /**
     * D�finit la valeur de la propri�t� structed.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPhoneAddressInputType }
     *     
     */
    public void setStructed(StructuredPhoneAddressInputType value) {
        this.structed = value;
    }

}
