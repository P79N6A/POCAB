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
 * NE PLUS UTILISER - Evenement d�clencheur avec la date d'effet de l'�v�nement
 * 
 * <p>Classe Java pour STDV2InitiatingEventType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDV2InitiatingEventType">
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
 *                   &lt;element name="IntrnlRef" type="{}STDIdentificationInformationType"/>
 *                   &lt;element name="ExtrnlRef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationType"/>
 *                               &lt;element name="Role" type="{}RoleCode"/>
 *                             &lt;/sequence>
 *                             &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                   &lt;element name="IntrnlRef" type="{}STDIdentificationInformationType"/>
 *                   &lt;element name="ExtrnlRef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationType"/>
 *                               &lt;element name="Role" type="{}RoleCode"/>
 *                             &lt;/sequence>
 *                             &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InputChnnl" type="{}CommunicationChannelCode" minOccurs="0"/>
 *         &lt;element name="EventInputDate" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="EvtEffctveDate" type="{}ISODateTime" minOccurs="0"/>
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
@XmlType(name = "STDV2InitiatingEventType", propOrder = {
    "initiatngEvtCtgory",
    "intrnlEvtIndic",
    "intlEvt",
    "othrEvt",
    "inputChnnl",
    "eventInputDate",
    "evtEffctveDate",
    "user"
})
public class STDV2InitiatingEventType {

    @XmlElement(name = "InitiatngEvtCtgory", required = true)
    protected String initiatngEvtCtgory;
    @XmlElement(name = "IntrnlEvtIndic", required = true)
    protected String intrnlEvtIndic;
    @XmlElement(name = "IntlEvt")
    protected STDV2InitiatingEventType.IntlEvt intlEvt;
    @XmlElement(name = "OthrEvt")
    protected List<STDV2InitiatingEventType.OthrEvt> othrEvt;
    @XmlElement(name = "InputChnnl")
    protected String inputChnnl;
    @XmlElement(name = "EventInputDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventInputDate;
    @XmlElement(name = "EvtEffctveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtEffctveDate;
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
     *     {@link STDV2InitiatingEventType.IntlEvt }
     *     
     */
    public STDV2InitiatingEventType.IntlEvt getIntlEvt() {
        return intlEvt;
    }

    /**
     * D�finit la valeur de la propri�t� intlEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link STDV2InitiatingEventType.IntlEvt }
     *     
     */
    public void setIntlEvt(STDV2InitiatingEventType.IntlEvt value) {
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
     * {@link STDV2InitiatingEventType.OthrEvt }
     * 
     * 
     */
    public List<STDV2InitiatingEventType.OthrEvt> getOthrEvt() {
        if (othrEvt == null) {
            othrEvt = new ArrayList<STDV2InitiatingEventType.OthrEvt>();
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
     *       &lt;choice>
     *         &lt;element name="IntrnlRef" type="{}STDIdentificationInformationType"/>
     *         &lt;element name="ExtrnlRef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationType"/>
     *                     &lt;element name="Role" type="{}RoleCode"/>
     *                   &lt;/sequence>
     *                   &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        protected STDIdentificationInformationType intrnlRef;
        @XmlElement(name = "ExtrnlRef")
        protected STDV2InitiatingEventType.IntlEvt.ExtrnlRef extrnlRef;

        /**
         * Obtient la valeur de la propri�t� intrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDIdentificationInformationType }
         *     
         */
        public STDIdentificationInformationType getIntrnlRef() {
            return intrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� intrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDIdentificationInformationType }
         *     
         */
        public void setIntrnlRef(STDIdentificationInformationType value) {
            this.intrnlRef = value;
        }

        /**
         * Obtient la valeur de la propri�t� extrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDV2InitiatingEventType.IntlEvt.ExtrnlRef }
         *     
         */
        public STDV2InitiatingEventType.IntlEvt.ExtrnlRef getExtrnlRef() {
            return extrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� extrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDV2InitiatingEventType.IntlEvt.ExtrnlRef }
         *     
         */
        public void setExtrnlRef(STDV2InitiatingEventType.IntlEvt.ExtrnlRef value) {
            this.extrnlRef = value;
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
         *         &lt;element name="Id">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationType"/>
         *           &lt;element name="Role" type="{}RoleCode"/>
         *         &lt;/sequence>
         *         &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
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
            "id",
            "prtyIdntfctn",
            "role",
            "origin"
        })
        public static class ExtrnlRef {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "PrtyIdntfctn")
            protected STDIdentificationInformationType prtyIdntfctn;
            @XmlElement(name = "Role")
            protected String role;
            @XmlElement(name = "Origin")
            protected String origin;

            /**
             * Obtient la valeur de la propri�t� id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * D�finit la valeur de la propri�t� id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propri�t� prtyIdntfctn.
             * 
             * @return
             *     possible object is
             *     {@link STDIdentificationInformationType }
             *     
             */
            public STDIdentificationInformationType getPrtyIdntfctn() {
                return prtyIdntfctn;
            }

            /**
             * D�finit la valeur de la propri�t� prtyIdntfctn.
             * 
             * @param value
             *     allowed object is
             *     {@link STDIdentificationInformationType }
             *     
             */
            public void setPrtyIdntfctn(STDIdentificationInformationType value) {
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
     *         &lt;element name="IntrnlRef" type="{}STDIdentificationInformationType"/>
     *         &lt;element name="ExtrnlRef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationType"/>
     *                     &lt;element name="Role" type="{}RoleCode"/>
     *                   &lt;/sequence>
     *                   &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        protected STDIdentificationInformationType intrnlRef;
        @XmlElement(name = "ExtrnlRef")
        protected STDV2InitiatingEventType.OthrEvt.ExtrnlRef extrnlRef;

        /**
         * Obtient la valeur de la propri�t� intrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDIdentificationInformationType }
         *     
         */
        public STDIdentificationInformationType getIntrnlRef() {
            return intrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� intrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDIdentificationInformationType }
         *     
         */
        public void setIntrnlRef(STDIdentificationInformationType value) {
            this.intrnlRef = value;
        }

        /**
         * Obtient la valeur de la propri�t� extrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDV2InitiatingEventType.OthrEvt.ExtrnlRef }
         *     
         */
        public STDV2InitiatingEventType.OthrEvt.ExtrnlRef getExtrnlRef() {
            return extrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� extrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDV2InitiatingEventType.OthrEvt.ExtrnlRef }
         *     
         */
        public void setExtrnlRef(STDV2InitiatingEventType.OthrEvt.ExtrnlRef value) {
            this.extrnlRef = value;
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
         *         &lt;element name="Id">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationType"/>
         *           &lt;element name="Role" type="{}RoleCode"/>
         *         &lt;/sequence>
         *         &lt;element name="Origin" type="{}ApplicationCode" minOccurs="0"/>
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
            "id",
            "prtyIdntfctn",
            "role",
            "origin"
        })
        public static class ExtrnlRef {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "PrtyIdntfctn")
            protected STDIdentificationInformationType prtyIdntfctn;
            @XmlElement(name = "Role")
            protected String role;
            @XmlElement(name = "Origin")
            protected String origin;

            /**
             * Obtient la valeur de la propri�t� id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * D�finit la valeur de la propri�t� id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propri�t� prtyIdntfctn.
             * 
             * @return
             *     possible object is
             *     {@link STDIdentificationInformationType }
             *     
             */
            public STDIdentificationInformationType getPrtyIdntfctn() {
                return prtyIdntfctn;
            }

            /**
             * D�finit la valeur de la propri�t� prtyIdntfctn.
             * 
             * @param value
             *     allowed object is
             *     {@link STDIdentificationInformationType }
             *     
             */
            public void setPrtyIdntfctn(STDIdentificationInformationType value) {
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

        }

    }

}
