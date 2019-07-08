
package com.bnpp.galaxy.gxt.app.generatedxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Type d'objet Taux De Change (Fixing)
 *
 * <p>Classe Java pour FixingType complex type.
 *
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="FixingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FixngIdntfctn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="UnitCurr" type="{}CurrencyCode"/>
 *                   &lt;element name="QuotdCurr" type="{}CurrencyCode"/>
 *                   &lt;element name="PlaceOfListng" type="{}MICIdentifier"/>
 *                   &lt;element name="ValdtyDate" type="{}ISODate"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FixngStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status" type="{}FixingStatusCode"/>
 *                   &lt;element name="EffctveDate" type="{}ISODate" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InitiatngEvt" type="{}STDInitiatingEventType" minOccurs="0"/>
 *         &lt;element name="Mesure">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExchngeRateValue">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ask" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="Bid" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="Opening" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="High" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="Low" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="Closng" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="ExchngeRate" type="{}BaseOneRate"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Provdr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProvdr" type="{}ProviderCode"/>
 *                   &lt;element name="ProvdrTimeStamp" type="{}ISODateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Anmly" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Srce">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="LineValue">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProvdrAnmlyType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProvdrAnmlyDesc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Trget">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TagName">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TagValue">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FailReasn">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Desc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cntxt" type="{}DataContextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixingType", propOrder = {
        "fixngIdntfctn",
        "fixngStatus",
        "initiatngEvt",
        "mesure",
        "provdr",
        "anmly",
        "cntxt"
})
@XmlRootElement(name = "Fixing")
public class FixingType {

    @XmlElement(name = "FixngIdntfctn", required = true)
    protected FixingType.FixngIdntfctn fixngIdntfctn;
    @XmlElement(name = "FixngStatus", required = true)
    protected FixingType.FixngStatus   fixngStatus;
    @XmlElement(name = "InitiatngEvt")
    protected STDInitiatingEventType   initiatngEvt;
    @XmlElement(name = "Mesure", required = true)
    protected FixingType.Mesure        mesure;
    @XmlElement(name = "Provdr", required = true)
    protected FixingType.Provdr        provdr;
    @XmlElement(name = "Anmly")
    protected List<FixingType.Anmly>   anmly;
    @XmlElement(name = "Cntxt", required = true)
    protected DataContextType          cntxt;

    /**
     * Obtient la valeur de la propri�t� fixngIdntfctn.
     *
     * @return possible object is {@link FixingType.FixngIdntfctn }
     */
    public FixingType.FixngIdntfctn getFixngIdntfctn() {
        return fixngIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� fixngIdntfctn.
     *
     * @param value allowed object is {@link FixingType.FixngIdntfctn }
     */
    public void setFixngIdntfctn(FixingType.FixngIdntfctn value) {
        this.fixngIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� fixngStatus.
     *
     * @return possible object is {@link FixingType.FixngStatus }
     */
    public FixingType.FixngStatus getFixngStatus() {
        return fixngStatus;
    }

    /**
     * D�finit la valeur de la propri�t� fixngStatus.
     *
     * @param value allowed object is {@link FixingType.FixngStatus }
     */
    public void setFixngStatus(FixingType.FixngStatus value) {
        this.fixngStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� initiatngEvt.
     *
     * @return possible object is {@link STDInitiatingEventType }
     */
    public STDInitiatingEventType getInitiatngEvt() {
        return initiatngEvt;
    }

    /**
     * D�finit la valeur de la propri�t� initiatngEvt.
     *
     * @param value allowed object is {@link STDInitiatingEventType }
     */
    public void setInitiatngEvt(STDInitiatingEventType value) {
        this.initiatngEvt = value;
    }

    /**
     * Obtient la valeur de la propri�t� mesure.
     *
     * @return possible object is {@link FixingType.Mesure }
     */
    public FixingType.Mesure getMesure() {
        return mesure;
    }

    /**
     * D�finit la valeur de la propri�t� mesure.
     *
     * @param value allowed object is {@link FixingType.Mesure }
     */
    public void setMesure(FixingType.Mesure value) {
        this.mesure = value;
    }

    /**
     * Obtient la valeur de la propri�t� provdr.
     *
     * @return possible object is {@link FixingType.Provdr }
     */
    public FixingType.Provdr getProvdr() {
        return provdr;
    }

    /**
     * D�finit la valeur de la propri�t� provdr.
     *
     * @param value allowed object is {@link FixingType.Provdr }
     */
    public void setProvdr(FixingType.Provdr value) {
        this.provdr = value;
    }

    /**
     * Gets the value of the anmly property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the anmly property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnmly().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FixingType.Anmly }
     */
    public List<FixingType.Anmly> getAnmly() {
        if (anmly == null) {
            anmly = new ArrayList<FixingType.Anmly>();
        }
        return this.anmly;
    }

    /**
     * Obtient la valeur de la propri�t� cntxt.
     *
     * @return possible object is {@link DataContextType }
     */
    public DataContextType getCntxt() {
        return cntxt;
    }

    /**
     * D�finit la valeur de la propri�t� cntxt.
     *
     * @param value allowed object is {@link DataContextType }
     */
    public void setCntxt(DataContextType value) {
        this.cntxt = value;
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
     *         &lt;element name="Srce">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="LineValue">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProvdrAnmlyType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProvdrAnmlyDesc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Trget">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TagName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TagValue">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FailReasn">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Desc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "srce",
            "trget"
    })
    public static class Anmly {

        @XmlElement(name = "Srce", required = true)
        protected FixingType.Anmly.Srce  srce;
        @XmlElement(name = "Trget", required = true)
        protected FixingType.Anmly.Trget trget;

        /**
         * Obtient la valeur de la propri�t� srce.
         *
         * @return possible object is {@link FixingType.Anmly.Srce }
         */
        public FixingType.Anmly.Srce getSrce() {
            return srce;
        }

        /**
         * D�finit la valeur de la propri�t� srce.
         *
         * @param value allowed object is {@link FixingType.Anmly.Srce }
         */
        public void setSrce(FixingType.Anmly.Srce value) {
            this.srce = value;
        }

        /**
         * Obtient la valeur de la propri�t� trget.
         *
         * @return possible object is {@link FixingType.Anmly.Trget }
         */
        public FixingType.Anmly.Trget getTrget() {
            return trget;
        }

        /**
         * D�finit la valeur de la propri�t� trget.
         *
         * @param value allowed object is {@link FixingType.Anmly.Trget }
         */
        public void setTrget(FixingType.Anmly.Trget value) {
            this.trget = value;
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
         *         &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="LineValue">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProvdrAnmlyType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProvdrAnmlyDesc">
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
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "lineNumb",
                "lineValue",
                "provdrAnmlyType",
                "provdrAnmlyDesc"
        })
        public static class Srce {

            @XmlElement(name = "LineNumb")
            protected BigInteger lineNumb;
            @XmlElement(name = "LineValue", required = true)
            protected String     lineValue;
            @XmlElement(name = "ProvdrAnmlyType", required = true)
            protected String     provdrAnmlyType;
            @XmlElement(name = "ProvdrAnmlyDesc", required = true)
            protected String     provdrAnmlyDesc;

            /**
             * Obtient la valeur de la propri�t� lineNumb.
             *
             * @return possible object is {@link BigInteger }
             */
            public BigInteger getLineNumb() {
                return lineNumb;
            }

            /**
             * D�finit la valeur de la propri�t� lineNumb.
             *
             * @param value allowed object is {@link BigInteger }
             */
            public void setLineNumb(BigInteger value) {
                this.lineNumb = value;
            }

            /**
             * Obtient la valeur de la propri�t� lineValue.
             *
             * @return possible object is {@link String }
             */
            public String getLineValue() {
                return lineValue;
            }

            /**
             * D�finit la valeur de la propri�t� lineValue.
             *
             * @param value allowed object is {@link String }
             */
            public void setLineValue(String value) {
                this.lineValue = value;
            }

            /**
             * Obtient la valeur de la propri�t� provdrAnmlyType.
             *
             * @return possible object is {@link String }
             */
            public String getProvdrAnmlyType() {
                return provdrAnmlyType;
            }

            /**
             * D�finit la valeur de la propri�t� provdrAnmlyType.
             *
             * @param value allowed object is {@link String }
             */
            public void setProvdrAnmlyType(String value) {
                this.provdrAnmlyType = value;
            }

            /**
             * Obtient la valeur de la propri�t� provdrAnmlyDesc.
             *
             * @return possible object is {@link String }
             */
            public String getProvdrAnmlyDesc() {
                return provdrAnmlyDesc;
            }

            /**
             * D�finit la valeur de la propri�t� provdrAnmlyDesc.
             *
             * @param value allowed object is {@link String }
             */
            public void setProvdrAnmlyDesc(String value) {
                this.provdrAnmlyDesc = value;
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
         *       &lt;sequence>
         *         &lt;element name="TagName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TagValue">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FailReasn">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Desc">
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
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "tagName",
                "tagValue",
                "failReasn",
                "desc"
        })
        public static class Trget {

            @XmlElement(name = "TagName", required = true)
            protected String tagName;
            @XmlElement(name = "TagValue", required = true)
            protected String tagValue;
            @XmlElement(name = "FailReasn", required = true)
            protected String failReasn;
            @XmlElement(name = "Desc", required = true)
            protected String desc;

            /**
             * Obtient la valeur de la propri�t� tagName.
             *
             * @return possible object is {@link String }
             */
            public String getTagName() {
                return tagName;
            }

            /**
             * D�finit la valeur de la propri�t� tagName.
             *
             * @param value allowed object is {@link String }
             */
            public void setTagName(String value) {
                this.tagName = value;
            }

            /**
             * Obtient la valeur de la propri�t� tagValue.
             *
             * @return possible object is {@link String }
             */
            public String getTagValue() {
                return tagValue;
            }

            /**
             * D�finit la valeur de la propri�t� tagValue.
             *
             * @param value allowed object is {@link String }
             */
            public void setTagValue(String value) {
                this.tagValue = value;
            }

            /**
             * Obtient la valeur de la propri�t� failReasn.
             *
             * @return possible object is {@link String }
             */
            public String getFailReasn() {
                return failReasn;
            }

            /**
             * D�finit la valeur de la propri�t� failReasn.
             *
             * @param value allowed object is {@link String }
             */
            public void setFailReasn(String value) {
                this.failReasn = value;
            }

            /**
             * Obtient la valeur de la propri�t� desc.
             *
             * @return possible object is {@link String }
             */
            public String getDesc() {
                return desc;
            }

            /**
             * D�finit la valeur de la propri�t� desc.
             *
             * @param value allowed object is {@link String }
             */
            public void setDesc(String value) {
                this.desc = value;
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
     *       &lt;all>
     *         &lt;element name="UnitCurr" type="{}CurrencyCode"/>
     *         &lt;element name="QuotdCurr" type="{}CurrencyCode"/>
     *         &lt;element name="PlaceOfListng" type="{}MICIdentifier"/>
     *         &lt;element name="ValdtyDate" type="{}ISODate"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class FixngIdntfctn {

        @XmlElement(name = "UnitCurr", required = true)
        protected String               unitCurr;
        @XmlElement(name = "QuotdCurr", required = true)
        protected String               quotdCurr;
        @XmlElement(name = "PlaceOfListng", required = true)
        protected String               placeOfListng;
        @XmlElement(name = "ValdtyDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valdtyDate;

        /**
         * Obtient la valeur de la propri�t� unitCurr.
         *
         * @return possible object is {@link String }
         */
        public String getUnitCurr() {
            return unitCurr;
        }

        /**
         * D�finit la valeur de la propri�t� unitCurr.
         *
         * @param value allowed object is {@link String }
         */
        public void setUnitCurr(String value) {
            this.unitCurr = value;
        }

        /**
         * Obtient la valeur de la propri�t� quotdCurr.
         *
         * @return possible object is {@link String }
         */
        public String getQuotdCurr() {
            return quotdCurr;
        }

        /**
         * D�finit la valeur de la propri�t� quotdCurr.
         *
         * @param value allowed object is {@link String }
         */
        public void setQuotdCurr(String value) {
            this.quotdCurr = value;
        }

        /**
         * Obtient la valeur de la propri�t� placeOfListng.
         *
         * @return possible object is {@link String }
         */
        public String getPlaceOfListng() {
            return placeOfListng;
        }

        /**
         * D�finit la valeur de la propri�t� placeOfListng.
         *
         * @param value allowed object is {@link String }
         */
        public void setPlaceOfListng(String value) {
            this.placeOfListng = value;
        }

        /**
         * Obtient la valeur de la propri�t� valdtyDate.
         *
         * @return possible object is {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getValdtyDate() {
            return valdtyDate;
        }

        /**
         * D�finit la valeur de la propri�t� valdtyDate.
         *
         * @param value allowed object is {@link XMLGregorianCalendar }
         */
        public void setValdtyDate(XMLGregorianCalendar value) {
            this.valdtyDate = value;
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
     *       &lt;sequence>
     *         &lt;element name="Status" type="{}FixingStatusCode"/>
     *         &lt;element name="EffctveDate" type="{}ISODate" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "status",
            "effctveDate"
    })
    public static class FixngStatus {

        @XmlElement(name = "Status", required = true)
        protected String               status;
        @XmlElement(name = "EffctveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effctveDate;

        /**
         * Obtient la valeur de la propri�t� status.
         *
         * @return possible object is {@link String }
         */
        public String getStatus() {
            return status;
        }

        /**
         * D�finit la valeur de la propri�t� status.
         *
         * @param value allowed object is {@link String }
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Obtient la valeur de la propri�t� effctveDate.
         *
         * @return possible object is {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getEffctveDate() {
            return effctveDate;
        }

        /**
         * D�finit la valeur de la propri�t� effctveDate.
         *
         * @param value allowed object is {@link XMLGregorianCalendar }
         */
        public void setEffctveDate(XMLGregorianCalendar value) {
            this.effctveDate = value;
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
     *       &lt;sequence>
     *         &lt;element name="ExchngeRateValue">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ask" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="Bid" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="Opening" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="High" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="Low" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="Closng" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="ExchngeRate" type="{}BaseOneRate"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "exchngeRateValue"
    })
    public static class Mesure {

        @XmlElement(name = "ExchngeRateValue", required = true)
        protected FixingType.Mesure.ExchngeRateValue exchngeRateValue;

        /**
         * Obtient la valeur de la propri�t� exchngeRateValue.
         *
         * @return possible object is {@link FixingType.Mesure.ExchngeRateValue }
         */
        public FixingType.Mesure.ExchngeRateValue getExchngeRateValue() {
            return exchngeRateValue;
        }

        /**
         * D�finit la valeur de la propri�t� exchngeRateValue.
         *
         * @param value allowed object is {@link FixingType.Mesure.ExchngeRateValue }
         */
        public void setExchngeRateValue(FixingType.Mesure.ExchngeRateValue value) {
            this.exchngeRateValue = value;
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
         *         &lt;element name="Ask" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="Bid" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="Opening" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="High" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="Low" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="Closng" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="ExchngeRate" type="{}BaseOneRate"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "ask",
                "bid",
                "opening",
                "high",
                "low",
                "closng",
                "priceChnge",
                "exchngeRate"
        })
        public static class ExchngeRateValue {

            @XmlElement(name = "Ask")
            protected BaseOneRate ask;
            @XmlElement(name = "Bid")
            protected BaseOneRate bid;
            @XmlElement(name = "Opening")
            protected BaseOneRate opening;
            @XmlElement(name = "High")
            protected BaseOneRate high;
            @XmlElement(name = "Low")
            protected BaseOneRate low;
            @XmlElement(name = "Closng")
            protected BaseOneRate closng;
            @XmlElement(name = "PriceChnge")
            protected BaseOneRate priceChnge;
            @XmlElement(name = "ExchngeRate", required = true)
            protected BaseOneRate exchngeRate;

            /**
             * Obtient la valeur de la propri�t� ask.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getAsk() {
                return ask;
            }

            /**
             * D�finit la valeur de la propri�t� ask.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setAsk(BaseOneRate value) {
                this.ask = value;
            }

            /**
             * Obtient la valeur de la propri�t� bid.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getBid() {
                return bid;
            }

            /**
             * D�finit la valeur de la propri�t� bid.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setBid(BaseOneRate value) {
                this.bid = value;
            }

            /**
             * Obtient la valeur de la propri�t� opening.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getOpening() {
                return opening;
            }

            /**
             * D�finit la valeur de la propri�t� opening.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setOpening(BaseOneRate value) {
                this.opening = value;
            }

            /**
             * Obtient la valeur de la propri�t� high.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getHigh() {
                return high;
            }

            /**
             * D�finit la valeur de la propri�t� high.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setHigh(BaseOneRate value) {
                this.high = value;
            }

            /**
             * Obtient la valeur de la propri�t� low.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getLow() {
                return low;
            }

            /**
             * D�finit la valeur de la propri�t� low.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setLow(BaseOneRate value) {
                this.low = value;
            }

            /**
             * Obtient la valeur de la propri�t� closng.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getClosng() {
                return closng;
            }

            /**
             * D�finit la valeur de la propri�t� closng.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setClosng(BaseOneRate value) {
                this.closng = value;
            }

            /**
             * Obtient la valeur de la propri�t� priceChnge.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getPriceChnge() {
                return priceChnge;
            }

            /**
             * D�finit la valeur de la propri�t� priceChnge.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setPriceChnge(BaseOneRate value) {
                this.priceChnge = value;
            }

            /**
             * Obtient la valeur de la propri�t� exchngeRate.
             *
             * @return possible object is {@link BaseOneRate }
             */
            public BaseOneRate getExchngeRate() {
                return exchngeRate;
            }

            /**
             * D�finit la valeur de la propri�t� exchngeRate.
             *
             * @param value allowed object is {@link BaseOneRate }
             */
            public void setExchngeRate(BaseOneRate value) {
                this.exchngeRate = value;
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
     *       &lt;sequence>
     *         &lt;element name="DataProvdr" type="{}ProviderCode"/>
     *         &lt;element name="ProvdrTimeStamp" type="{}ISODateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dataProvdr",
            "provdrTimeStamp"
    })
    public static class Provdr {

        @XmlElement(name = "DataProvdr", required = true)
        protected String               dataProvdr;
        @XmlElement(name = "ProvdrTimeStamp", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar provdrTimeStamp;

        /**
         * Obtient la valeur de la propri�t� dataProvdr.
         *
         * @return possible object is {@link String }
         */
        public String getDataProvdr() {
            return dataProvdr;
        }

        /**
         * D�finit la valeur de la propri�t� dataProvdr.
         *
         * @param value allowed object is {@link String }
         */
        public void setDataProvdr(String value) {
            this.dataProvdr = value;
        }

        /**
         * Obtient la valeur de la propri�t� provdrTimeStamp.
         *
         * @return possible object is {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getProvdrTimeStamp() {
            return provdrTimeStamp;
        }

        /**
         * D�finit la valeur de la propri�t� provdrTimeStamp.
         *
         * @param value allowed object is {@link XMLGregorianCalendar }
         */
        public void setProvdrTimeStamp(XMLGregorianCalendar value) {
            this.provdrTimeStamp = value;
        }

    }

}
