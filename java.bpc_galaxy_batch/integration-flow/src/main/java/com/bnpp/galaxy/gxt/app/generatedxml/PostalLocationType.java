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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Bloc Adresse
 * 
 * <p>Classe Java pour PostalLocationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PostalLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostAdrsId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostAdrsValdtyIndic" type="{}PostalAddressValidityIndicatorCode" minOccurs="0"/>
 *         &lt;element name="PostAdrsValdtyDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="PostAdrsUse" type="{}PostalAddressUseCode"/>
 *         &lt;element name="PostAdrs" type="{}PostalAddressType"/>
 *         &lt;element name="MailRecipint" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MailRecipintRest" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
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
@XmlType(name = "PostalLocationType", propOrder = {
    "postAdrsId",
    "postAdrsValdtyIndic",
    "postAdrsValdtyDate",
    "postAdrsUse",
    "postAdrs",
    "mailRecipint",
    "mailRecipintRest"
})
public class PostalLocationType {

    @XmlElement(name = "PostAdrsId", required = true)
    protected String postAdrsId;
    @XmlElement(name = "PostAdrsValdtyIndic")
    protected String postAdrsValdtyIndic;
    @XmlElement(name = "PostAdrsValdtyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postAdrsValdtyDate;
    @XmlElement(name = "PostAdrsUse", required = true)
    protected String postAdrsUse;
    @XmlElement(name = "PostAdrs", required = true)
    protected PostalAddressType postAdrs;
    @XmlElement(name = "MailRecipint")
    protected String mailRecipint;
    @XmlElement(name = "MailRecipintRest")
    protected String mailRecipintRest;

    /**
     * Obtient la valeur de la propri�t� postAdrsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAdrsId() {
        return postAdrsId;
    }

    /**
     * D�finit la valeur de la propri�t� postAdrsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAdrsId(String value) {
        this.postAdrsId = value;
    }

    /**
     * Obtient la valeur de la propri�t� postAdrsValdtyIndic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAdrsValdtyIndic() {
        return postAdrsValdtyIndic;
    }

    /**
     * D�finit la valeur de la propri�t� postAdrsValdtyIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAdrsValdtyIndic(String value) {
        this.postAdrsValdtyIndic = value;
    }

    /**
     * Obtient la valeur de la propri�t� postAdrsValdtyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostAdrsValdtyDate() {
        return postAdrsValdtyDate;
    }

    /**
     * D�finit la valeur de la propri�t� postAdrsValdtyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostAdrsValdtyDate(XMLGregorianCalendar value) {
        this.postAdrsValdtyDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� postAdrsUse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAdrsUse() {
        return postAdrsUse;
    }

    /**
     * D�finit la valeur de la propri�t� postAdrsUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAdrsUse(String value) {
        this.postAdrsUse = value;
    }

    /**
     * Obtient la valeur de la propri�t� postAdrs.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getPostAdrs() {
        return postAdrs;
    }

    /**
     * D�finit la valeur de la propri�t� postAdrs.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setPostAdrs(PostalAddressType value) {
        this.postAdrs = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailRecipint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailRecipint() {
        return mailRecipint;
    }

    /**
     * D�finit la valeur de la propri�t� mailRecipint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailRecipint(String value) {
        this.mailRecipint = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailRecipintRest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailRecipintRest() {
        return mailRecipintRest;
    }

    /**
     * D�finit la valeur de la propri�t� mailRecipintRest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailRecipintRest(String value) {
        this.mailRecipintRest = value;
    }

}
