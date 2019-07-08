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
 * INPUT = EMailLocationType
 * 
 * <p>Classe Java pour EMailLocationInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EMailLocationInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="EMailAdrsId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMailAdrsType" type="{}EmailAddressTypeCode" minOccurs="0"/>
 *         &lt;element name="EMail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
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
@XmlType(name = "EMailLocationInputType", propOrder = {
    "eMailAdrsId",
    "eMailAdrsType",
    "eMail"
})
public class EMailLocationInputType {

    @XmlElement(name = "EMailAdrsId")
    protected String eMailAdrsId;
    @XmlElement(name = "EMailAdrsType")
    protected String eMailAdrsType;
    @XmlElement(name = "EMail")
    protected String eMail;

    /**
     * Obtient la valeur de la propri�t� eMailAdrsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAdrsId() {
        return eMailAdrsId;
    }

    /**
     * D�finit la valeur de la propri�t� eMailAdrsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAdrsId(String value) {
        this.eMailAdrsId = value;
    }

    /**
     * Obtient la valeur de la propri�t� eMailAdrsType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAdrsType() {
        return eMailAdrsType;
    }

    /**
     * D�finit la valeur de la propri�t� eMailAdrsType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAdrsType(String value) {
        this.eMailAdrsType = value;
    }

    /**
     * Obtient la valeur de la propri�t� eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * D�finit la valeur de la propri�t� eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
