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
 * NE PLUS UTILISER - INPUT =STDInitiatingEventType
 * 
 * <p>Classe Java pour STDInitiatingEventInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDInitiatingEventInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitiatngEvtCtgory" type="{}EventTypeCode" minOccurs="0"/>
 *         &lt;element name="IntrnlEvtIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="IntlEvt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="IntrnlRef" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
 *                   &lt;element name="ExtrnlRef" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Id" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
 *                               &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
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
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="IntrnlRef" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
 *                   &lt;element name="ExtrnlRef" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
 *                               &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
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
 *         &lt;element name="User" type="{}UserInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDInitiatingEventInputType", propOrder = {
    "initiatngEvtCtgory",
    "intrnlEvtIndic",
    "intlEvt",
    "othrEvt",
    "inputChnnl",
    "eventInputDate",
    "user"
})
public class STDInitiatingEventInputType {

    @XmlElement(name = "InitiatngEvtCtgory")
    protected String initiatngEvtCtgory;
    @XmlElement(name = "IntrnlEvtIndic")
    protected String intrnlEvtIndic;
    @XmlElement(name = "IntlEvt")
    protected STDInitiatingEventInputType.IntlEvt intlEvt;
    @XmlElement(name = "OthrEvt")
    protected List<STDInitiatingEventInputType.OthrEvt> othrEvt;
    @XmlElement(name = "InputChnnl")
    protected String inputChnnl;
    @XmlElement(name = "EventInputDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventInputDate;
    @XmlElement(name = "User")
    protected UserInputType user;

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
     *     {@link STDInitiatingEventInputType.IntlEvt }
     *     
     */
    public STDInitiatingEventInputType.IntlEvt getIntlEvt() {
        return intlEvt;
    }

    /**
     * D�finit la valeur de la propri�t� intlEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link STDInitiatingEventInputType.IntlEvt }
     *     
     */
    public void setIntlEvt(STDInitiatingEventInputType.IntlEvt value) {
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
     * {@link STDInitiatingEventInputType.OthrEvt }
     * 
     * 
     */
    public List<STDInitiatingEventInputType.OthrEvt> getOthrEvt() {
        if (othrEvt == null) {
            othrEvt = new ArrayList<STDInitiatingEventInputType.OthrEvt>();
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
     *     {@link UserInputType }
     *     
     */
    public UserInputType getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInputType }
     *     
     */
    public void setUser(UserInputType value) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="IntrnlRef" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
     *         &lt;element name="ExtrnlRef" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="Id" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
     *                     &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
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
        protected STDIdentificationInformationInputType intrnlRef;
        @XmlElement(name = "ExtrnlRef")
        protected STDInitiatingEventInputType.IntlEvt.ExtrnlRef extrnlRef;

        /**
         * Obtient la valeur de la propri�t� intrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDIdentificationInformationInputType }
         *     
         */
        public STDIdentificationInformationInputType getIntrnlRef() {
            return intrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� intrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDIdentificationInformationInputType }
         *     
         */
        public void setIntrnlRef(STDIdentificationInformationInputType value) {
            this.intrnlRef = value;
        }

        /**
         * Obtient la valeur de la propri�t� extrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDInitiatingEventInputType.IntlEvt.ExtrnlRef }
         *     
         */
        public STDInitiatingEventInputType.IntlEvt.ExtrnlRef getExtrnlRef() {
            return extrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� extrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDInitiatingEventInputType.IntlEvt.ExtrnlRef }
         *     
         */
        public void setExtrnlRef(STDInitiatingEventInputType.IntlEvt.ExtrnlRef value) {
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="Id" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
         *           &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
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

            @XmlElement(name = "Id")
            protected String id;
            @XmlElement(name = "PrtyIdntfctn")
            protected STDIdentificationInformationInputType prtyIdntfctn;
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
             *     {@link STDIdentificationInformationInputType }
             *     
             */
            public STDIdentificationInformationInputType getPrtyIdntfctn() {
                return prtyIdntfctn;
            }

            /**
             * D�finit la valeur de la propri�t� prtyIdntfctn.
             * 
             * @param value
             *     allowed object is
             *     {@link STDIdentificationInformationInputType }
             *     
             */
            public void setPrtyIdntfctn(STDIdentificationInformationInputType value) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="IntrnlRef" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
     *         &lt;element name="ExtrnlRef" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
     *                     &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
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
        protected STDIdentificationInformationInputType intrnlRef;
        @XmlElement(name = "ExtrnlRef")
        protected STDInitiatingEventInputType.OthrEvt.ExtrnlRef extrnlRef;

        /**
         * Obtient la valeur de la propri�t� intrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDIdentificationInformationInputType }
         *     
         */
        public STDIdentificationInformationInputType getIntrnlRef() {
            return intrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� intrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDIdentificationInformationInputType }
         *     
         */
        public void setIntrnlRef(STDIdentificationInformationInputType value) {
            this.intrnlRef = value;
        }

        /**
         * Obtient la valeur de la propri�t� extrnlRef.
         * 
         * @return
         *     possible object is
         *     {@link STDInitiatingEventInputType.OthrEvt.ExtrnlRef }
         *     
         */
        public STDInitiatingEventInputType.OthrEvt.ExtrnlRef getExtrnlRef() {
            return extrnlRef;
        }

        /**
         * D�finit la valeur de la propri�t� extrnlRef.
         * 
         * @param value
         *     allowed object is
         *     {@link STDInitiatingEventInputType.OthrEvt.ExtrnlRef }
         *     
         */
        public void setExtrnlRef(STDInitiatingEventInputType.OthrEvt.ExtrnlRef value) {
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
         *         &lt;element name="Id" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
         *           &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
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

            @XmlElement(name = "Id")
            protected String id;
            @XmlElement(name = "PrtyIdntfctn")
            protected STDIdentificationInformationInputType prtyIdntfctn;
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
             *     {@link STDIdentificationInformationInputType }
             *     
             */
            public STDIdentificationInformationInputType getPrtyIdntfctn() {
                return prtyIdntfctn;
            }

            /**
             * D�finit la valeur de la propri�t� prtyIdntfctn.
             * 
             * @param value
             *     allowed object is
             *     {@link STDIdentificationInformationInputType }
             *     
             */
            public void setPrtyIdntfctn(STDIdentificationInformationInputType value) {
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
