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
 * NE PLUS UTILISER
 * 
 * <p>Classe Java pour STD2InitiatingEventType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STD2InitiatingEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitiatngEvtCtgory" type="{}EventTypeCode"/>
 *         &lt;element name="IntrnlEvtIndic" type="{}YesNoIndicator"/>
 *         &lt;element name="IntlEvt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="IntrnlRef" type="{}STD2OtherIdentifierType"/>
 *                   &lt;element name="ExtrnlRef" type="{}STD2ExternalIdentifierType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OthrEvt" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="IntrnlRef" type="{}STD2OtherIdentifierType"/>
 *                   &lt;element name="ExtrnlRef" type="{}STD2ExternalIdentifierType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InputChnnl" type="{}CommunicationChannelCode" minOccurs="0"/>
 *         &lt;element name="EventInputDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="User" type="{}STD2UserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STD2InitiatingEventType", propOrder = {
    "initiatngEvtCtgory",
    "intrnlEvtIndic",
    "intlEvt",
    "othrEvt",
    "inputChnnl",
    "eventInputDate",
    "user"
})
public class STD2InitiatingEventType {

    @XmlElement(name = "InitiatngEvtCtgory", required = true)
    protected String initiatngEvtCtgory;
    @XmlElement(name = "IntrnlEvtIndic", required = true)
    protected String intrnlEvtIndic;
    @XmlElement(name = "IntlEvt")
    protected STD2InitiatingEventType.IntlEvt intlEvt;
    @XmlElement(name = "OthrEvt")
    protected List<STD2InitiatingEventType.OthrEvt> othrEvt;
    @XmlElement(name = "InputChnnl")
    protected String inputChnnl;
    @XmlElement(name = "EventInputDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventInputDate;
    @XmlElement(name = "User")
    protected STD2UserType user;

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
     * Obtient la valeur de la propri�t� intrnlEvtIndic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrnlEvtIndic() {
        return intrnlEvtIndic;
    }

    /**
     * D�finit la valeur de la propri�t� intrnlEvtIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrnlEvtIndic(String value) {
        this.intrnlEvtIndic = value;
    }

    /**
     * Obtient la valeur de la propri�t� intlEvt.
     * 
     * @return
     *     possible object is
     *     {@link STD2InitiatingEventType.IntlEvt }
     *     
     */
    public STD2InitiatingEventType.IntlEvt getIntlEvt() {
        return intlEvt;
    }

    /**
     * D�finit la valeur de la propri�t� intlEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link STD2InitiatingEventType.IntlEvt }
     *     
     */
    public void setIntlEvt(STD2InitiatingEventType.IntlEvt value) {
        this.intlEvt = value;
    }

    /**
     * Gets the value of the othrEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STD2InitiatingEventType.OthrEvt }
     * 
     * 
     */
    public List<STD2InitiatingEventType.OthrEvt> getOthrEvt() {
        if (othrEvt == null) {
            othrEvt = new ArrayList<STD2InitiatingEventType.OthrEvt>();
        }
        return this.othrEvt;
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
     *     {@link STD2UserType }
     *     
     */
    public STD2UserType getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link STD2UserType }
     *     
     */
    public void setUser(STD2UserType value) {
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
     *       &lt;choice>
     *         &lt;element name="IntrnlRef" type="{}STD2OtherIdentifierType"/>
     *         &lt;element name="ExtrnlRef" type="{}STD2ExternalIdentifierType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intrnlRef",
        "extrnlRef"
    })
    public static class IntlEvt {

        @XmlElement(name = "IntrnlRef")
        protected STD2OtherIdentifierType intrnlRef;
        @XmlElement(name = "ExtrnlRef")
        protected STD2ExternalIdentifierType extrnlRef;

        /**
         * Obtient la valeur de la propri�t� intrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STD2OtherIdentifierType }
         *     
         */
        public STD2OtherIdentifierType getIntrnlRef() {
            return intrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� intrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STD2OtherIdentifierType }
         *     
         */
        public void setIntrnlRef(STD2OtherIdentifierType value) {
            this.intrnlRef = value;
        }

        /**
         * Obtient la valeur de la propri�t� extrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STD2ExternalIdentifierType }
         *     
         */
        public STD2ExternalIdentifierType getExtrnlRef() {
            return extrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� extrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STD2ExternalIdentifierType }
         *     
         */
        public void setExtrnlRef(STD2ExternalIdentifierType value) {
            this.extrnlRef = value;
        }

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
     *       &lt;choice>
     *         &lt;element name="IntrnlRef" type="{}STD2OtherIdentifierType"/>
     *         &lt;element name="ExtrnlRef" type="{}STD2ExternalIdentifierType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intrnlRef",
        "extrnlRef"
    })
    public static class OthrEvt {

        @XmlElement(name = "IntrnlRef")
        protected STD2OtherIdentifierType intrnlRef;
        @XmlElement(name = "ExtrnlRef")
        protected STD2ExternalIdentifierType extrnlRef;

        /**
         * Obtient la valeur de la propri�t� intrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STD2OtherIdentifierType }
         *     
         */
        public STD2OtherIdentifierType getIntrnlRef() {
            return intrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� intrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STD2OtherIdentifierType }
         *     
         */
        public void setIntrnlRef(STD2OtherIdentifierType value) {
            this.intrnlRef = value;
        }

        /**
         * Obtient la valeur de la propri�t� extrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STD2ExternalIdentifierType }
         *     
         */
        public STD2ExternalIdentifierType getExtrnlRef() {
            return extrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� extrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STD2ExternalIdentifierType }
         *     
         */
        public void setExtrnlRef(STD2ExternalIdentifierType value) {
            this.extrnlRef = value;
        }

    }

}
