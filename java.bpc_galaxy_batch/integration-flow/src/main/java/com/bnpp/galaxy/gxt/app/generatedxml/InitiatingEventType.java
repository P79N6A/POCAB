//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * NE PLUS UTILISER - Evenement d�clencheur
 * 
 * <p>Classe Java pour InitiatingEventType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InitiatingEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitiatngEvtCtgory" type="{}EventTypeCode"/>
 *         &lt;element name="Ref" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtrnlRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrtyIdntfctn" type="{}PartyIdentificationType" minOccurs="0"/>
 *                   &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
 *                   &lt;element name="Idntfctn" type="{}IdentificationInformation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
 *         &lt;element name="InputChnnl" type="{}CommunicationChannelCode" minOccurs="0"/>
 *         &lt;element name="EventInputDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="User" type="{}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiatingEventType", propOrder = {
    "initiatngEvtCtgory",
    "ref",
    "extrnlRef",
    "origin",
    "inputChnnl",
    "eventInputDate",
    "user"
})
public class InitiatingEventType {

    @XmlElement(name = "InitiatngEvtCtgory", required = true)
    protected String initiatngEvtCtgory;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "ExtrnlRef")
    protected List<InitiatingEventType.ExtrnlRef> extrnlRef;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "InputChnnl")
    protected String inputChnnl;
    @XmlElement(name = "EventInputDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventInputDate;
    @XmlElement(name = "User")
    protected User user;

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
     * Obtient la valeur de la propri�t� ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * D�finit la valeur de la propri�t� ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the extrnlRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrnlRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrnlRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitiatingEventType.ExtrnlRef }
     * 
     * 
     */
    public List<InitiatingEventType.ExtrnlRef> getExtrnlRef() {
        if (extrnlRef == null) {
            extrnlRef = new ArrayList<InitiatingEventType.ExtrnlRef>();
        }
        return this.extrnlRef;
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
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PrtyIdntfctn" type="{}PartyIdentificationType" minOccurs="0"/>
     *         &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
     *         &lt;element name="Idntfctn" type="{}IdentificationInformation" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prtyIdntfctn",
        "role",
        "idntfctn"
    })
    public static class ExtrnlRef {

        @XmlElement(name = "PrtyIdntfctn")
        protected PartyIdentificationType prtyIdntfctn;
        @XmlElement(name = "Role")
        protected String role;
        @XmlElement(name = "Idntfctn")
        protected IdentificationInformation idntfctn;

        /**
         * Obtient la valeur de la propri�t� prtyIdntfctn.
         * 
         * @return
         *     possible object is
         *     {@link PartyIdentificationType }
         *     
         */
        public PartyIdentificationType getPrtyIdntfctn() {
            return prtyIdntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� prtyIdntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyIdentificationType }
         *     
         */
        public void setPrtyIdntfctn(PartyIdentificationType value) {
            this.prtyIdntfctn = value;
        }

        /**
         * Obtient la valeur de la propri�t� role.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * D�finit la valeur de la propri�t� role.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Obtient la valeur de la propri�t� idntfctn.
         * 
         * @return
         *     possible object is
         *     {@link IdentificationInformation }
         *     
         */
        public IdentificationInformation getIdntfctn() {
            return idntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� idntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentificationInformation }
         *     
         */
        public void setIdntfctn(IdentificationInformation value) {
            this.idntfctn = value;
        }

    }

}
