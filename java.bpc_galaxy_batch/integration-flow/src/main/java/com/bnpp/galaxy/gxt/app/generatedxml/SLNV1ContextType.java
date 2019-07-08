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
 * Bloc qui d�crit le context d'un objet (remplace STDV2ContextType)
 * 
 * <p>Classe Java pour SLNV1ContextType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1ContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{}ApplicationComponentCodeSLN" minOccurs="0"/>
 *         &lt;element name="CreatnDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="CreatnUser" type="{}SLNV1UserType" minOccurs="0"/>
 *         &lt;element name="UpdtDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="UpdtUser" type="{}SLNV1UserType" minOccurs="0"/>
 *         &lt;element name="ClosureDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="CREIdentifier" type="{}STDLongIndentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1ContextType", propOrder = {
    "origin",
    "creatnDate",
    "creatnUser",
    "updtDate",
    "updtUser",
    "closureDate",
    "creIdentifier"
})
public class SLNV1ContextType {

    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "CreatnDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creatnDate;
    @XmlElement(name = "CreatnUser")
    protected SLNV1UserType creatnUser;
    @XmlElement(name = "UpdtDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updtDate;
    @XmlElement(name = "UpdtUser")
    protected SLNV1UserType updtUser;
    @XmlElement(name = "ClosureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closureDate;
    @XmlElement(name = "CREIdentifier")
    protected String creIdentifier;

    /**
     * Obtient la valeur de la propri�t� origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * D�finit la valeur de la propri�t� origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Obtient la valeur de la propri�t� creatnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatnDate() {
        return creatnDate;
    }

    /**
     * D�finit la valeur de la propri�t� creatnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatnDate(XMLGregorianCalendar value) {
        this.creatnDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� creatnUser.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1UserType }
     *     
     */
    public SLNV1UserType getCreatnUser() {
        return creatnUser;
    }

    /**
     * D�finit la valeur de la propri�t� creatnUser.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1UserType }
     *     
     */
    public void setCreatnUser(SLNV1UserType value) {
        this.creatnUser = value;
    }

    /**
     * Obtient la valeur de la propri�t� updtDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdtDate() {
        return updtDate;
    }

    /**
     * D�finit la valeur de la propri�t� updtDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdtDate(XMLGregorianCalendar value) {
        this.updtDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� updtUser.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1UserType }
     *     
     */
    public SLNV1UserType getUpdtUser() {
        return updtUser;
    }

    /**
     * D�finit la valeur de la propri�t� updtUser.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1UserType }
     *     
     */
    public void setUpdtUser(SLNV1UserType value) {
        this.updtUser = value;
    }

    /**
     * Obtient la valeur de la propri�t� closureDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosureDate() {
        return closureDate;
    }

    /**
     * D�finit la valeur de la propri�t� closureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosureDate(XMLGregorianCalendar value) {
        this.closureDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� creIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREIdentifier() {
        return creIdentifier;
    }

    /**
     * D�finit la valeur de la propri�t� creIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREIdentifier(String value) {
        this.creIdentifier = value;
    }

}
