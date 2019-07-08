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
 * NE PLUS UTILISER - Donn�es sur l'�venement en input
 * 
 * <p>Classe Java pour STDV3InitiatingEventInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDV3InitiatingEventInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitiatngEvtCtgory" type="{}EventTypeCode" minOccurs="0"/>
 *         &lt;element name="InputChnnl" type="{}CommunicationChannelCode" minOccurs="0"/>
 *         &lt;element name="EventInputDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="EvtEffctveDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
 *         &lt;element name="User" type="{}STDV3UserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDV3InitiatingEventInputType", propOrder = {
    "initiatngEvtCtgory",
    "inputChnnl",
    "eventInputDate",
    "evtEffctveDate",
    "origin",
    "user"
})
public class STDV3InitiatingEventInputType {

    @XmlElement(name = "InitiatngEvtCtgory")
    protected String initiatngEvtCtgory;
    @XmlElement(name = "InputChnnl")
    protected String inputChnnl;
    @XmlElement(name = "EventInputDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventInputDate;
    @XmlElement(name = "EvtEffctveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtEffctveDate;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "User")
    protected STDV3UserType user;

    /**
     * Obtient la valeur de la propri�t� initiatngEvtCtgory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatngEvtCtgory() {
        return initiatngEvtCtgory;
    }

    /**
     * D�finit la valeur de la propri�t� initiatngEvtCtgory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatngEvtCtgory(String value) {
        this.initiatngEvtCtgory = value;
    }

    /**
     * Obtient la valeur de la propri�t� inputChnnl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputChnnl() {
        return inputChnnl;
    }

    /**
     * D�finit la valeur de la propri�t� inputChnnl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputChnnl(String value) {
        this.inputChnnl = value;
    }

    /**
     * Obtient la valeur de la propri�t� eventInputDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventInputDate() {
        return eventInputDate;
    }

    /**
     * D�finit la valeur de la propri�t� eventInputDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventInputDate(XMLGregorianCalendar value) {
        this.eventInputDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� evtEffctveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtEffctveDate() {
        return evtEffctveDate;
    }

    /**
     * D�finit la valeur de la propri�t� evtEffctveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtEffctveDate(XMLGregorianCalendar value) {
        this.evtEffctveDate = value;
    }

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
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link STDV3UserType }
     *     
     */
    public STDV3UserType getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link STDV3UserType }
     *     
     */
    public void setUser(STDV3UserType value) {
        this.user = value;
    }

}
