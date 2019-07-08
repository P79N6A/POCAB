//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * INPUT = NaturalPersonType
 * 
 * <p>Classe Java pour NaturalPersonInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NaturalPersonInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Title" type="{}TitleCode" minOccurs="0"/>
 *         &lt;element name="LastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}Name">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BrthName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FrstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}Name">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UsdName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}Name">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BrthDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="BrthPlace" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="TownName" type="{}TownNameType" minOccurs="0"/>
 *                   &lt;element name="Cntry" type="{}CountryCode" minOccurs="0"/>
 *                   &lt;element name="TownCode" type="{}INSEECommuneCode" minOccurs="0"/>
 *                   &lt;element name="BrthArea" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="BrthAreaType" type="{}AreaTypeCode" minOccurs="0"/>
 *                             &lt;element name="BrthAreaCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BrthAreaName" type="{}Name" minOccurs="0"/>
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
 *         &lt;element name="MaritalStatus" type="{}MaritalStatusCode" minOccurs="0"/>
 *         &lt;element name="Nation" type="{}CountryCode" minOccurs="0"/>
 *         &lt;element name="GendrIndic" type="{}GenderIndicatorCode" minOccurs="0"/>
 *         &lt;element name="DeathDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="DeathNotceReciptDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="VIPIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="VIPCode" type="{}VIPCode" minOccurs="0"/>
 *         &lt;element name="RetirAgeForsen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturalPersonInputType", propOrder = {
    "title",
    "lastName",
    "brthName",
    "frstName",
    "usdName",
    "brthDate",
    "brthPlace",
    "maritalStatus",
    "nation",
    "gendrIndic",
    "deathDate",
    "deathNotceReciptDate",
    "childCount",
    "vipIndic",
    "vipCode",
    "retirAgeForsen"
})
public class NaturalPersonInputType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "BrthName")
    protected String brthName;
    @XmlElement(name = "FrstName")
    protected String frstName;
    @XmlElement(name = "UsdName")
    protected String usdName;
    @XmlElement(name = "BrthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar brthDate;
    @XmlElement(name = "BrthPlace")
    protected NaturalPersonInputType.BrthPlace brthPlace;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "Nation")
    protected String nation;
    @XmlElement(name = "GendrIndic")
    protected String gendrIndic;
    @XmlElement(name = "DeathDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deathDate;
    @XmlElement(name = "DeathNotceReciptDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deathNotceReciptDate;
    @XmlElement(name = "ChildCount")
    protected BigInteger childCount;
    @XmlElement(name = "VIPIndic")
    protected String vipIndic;
    @XmlElement(name = "VIPCode")
    protected String vipCode;
    @XmlElement(name = "RetirAgeForsen")
    protected BigInteger retirAgeForsen;

    /**
     * Obtient la valeur de la propri�t� title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * D�finit la valeur de la propri�t� title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propri�t� lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * D�finit la valeur de la propri�t� lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtient la valeur de la propri�t� brthName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrthName() {
        return brthName;
    }

    /**
     * D�finit la valeur de la propri�t� brthName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrthName(String value) {
        this.brthName = value;
    }

    /**
     * Obtient la valeur de la propri�t� frstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstName() {
        return frstName;
    }

    /**
     * D�finit la valeur de la propri�t� frstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstName(String value) {
        this.frstName = value;
    }

    /**
     * Obtient la valeur de la propri�t� usdName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsdName() {
        return usdName;
    }

    /**
     * D�finit la valeur de la propri�t� usdName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsdName(String value) {
        this.usdName = value;
    }

    /**
     * Obtient la valeur de la propri�t� brthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBrthDate() {
        return brthDate;
    }

    /**
     * D�finit la valeur de la propri�t� brthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBrthDate(XMLGregorianCalendar value) {
        this.brthDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� brthPlace.
     * 
     * @return
     *     possible object is
     *     {@link NaturalPersonInputType.BrthPlace }
     *     
     */
    public NaturalPersonInputType.BrthPlace getBrthPlace() {
        return brthPlace;
    }

    /**
     * D�finit la valeur de la propri�t� brthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalPersonInputType.BrthPlace }
     *     
     */
    public void setBrthPlace(NaturalPersonInputType.BrthPlace value) {
        this.brthPlace = value;
    }

    /**
     * Obtient la valeur de la propri�t� maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * D�finit la valeur de la propri�t� maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� nation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * D�finit la valeur de la propri�t� nation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * Obtient la valeur de la propri�t� gendrIndic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGendrIndic() {
        return gendrIndic;
    }

    /**
     * D�finit la valeur de la propri�t� gendrIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGendrIndic(String value) {
        this.gendrIndic = value;
    }

    /**
     * Obtient la valeur de la propri�t� deathDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    /**
     * D�finit la valeur de la propri�t� deathDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathDate(XMLGregorianCalendar value) {
        this.deathDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� deathNotceReciptDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathNotceReciptDate() {
        return deathNotceReciptDate;
    }

    /**
     * D�finit la valeur de la propri�t� deathNotceReciptDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathNotceReciptDate(XMLGregorianCalendar value) {
        this.deathNotceReciptDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� childCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildCount() {
        return childCount;
    }

    /**
     * D�finit la valeur de la propri�t� childCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildCount(BigInteger value) {
        this.childCount = value;
    }

    /**
     * Obtient la valeur de la propri�t� vipIndic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPIndic() {
        return vipIndic;
    }

    /**
     * D�finit la valeur de la propri�t� vipIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPIndic(String value) {
        this.vipIndic = value;
    }

    /**
     * Obtient la valeur de la propri�t� vipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPCode() {
        return vipCode;
    }

    /**
     * D�finit la valeur de la propri�t� vipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPCode(String value) {
        this.vipCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� retirAgeForsen.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetirAgeForsen() {
        return retirAgeForsen;
    }

    /**
     * D�finit la valeur de la propri�t� retirAgeForsen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetirAgeForsen(BigInteger value) {
        this.retirAgeForsen = value;
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
     *         &lt;element name="TownName" type="{}TownNameType" minOccurs="0"/>
     *         &lt;element name="Cntry" type="{}CountryCode" minOccurs="0"/>
     *         &lt;element name="TownCode" type="{}INSEECommuneCode" minOccurs="0"/>
     *         &lt;element name="BrthArea" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="BrthAreaType" type="{}AreaTypeCode" minOccurs="0"/>
     *                   &lt;element name="BrthAreaCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BrthAreaName" type="{}Name" minOccurs="0"/>
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "townName",
        "cntry",
        "townCode",
        "brthArea"
    })
    public static class BrthPlace {

        @XmlElement(name = "TownName")
        protected String townName;
        @XmlElement(name = "Cntry")
        protected String cntry;
        @XmlElement(name = "TownCode")
        protected String townCode;
        @XmlElement(name = "BrthArea")
        protected NaturalPersonInputType.BrthPlace.BrthArea brthArea;

        /**
         * Obtient la valeur de la propri�t� townName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTownName() {
            return townName;
        }

        /**
         * D�finit la valeur de la propri�t� townName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTownName(String value) {
            this.townName = value;
        }

        /**
         * Obtient la valeur de la propri�t� cntry.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCntry() {
            return cntry;
        }

        /**
         * D�finit la valeur de la propri�t� cntry.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCntry(String value) {
            this.cntry = value;
        }

        /**
         * Obtient la valeur de la propri�t� townCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTownCode() {
            return townCode;
        }

        /**
         * D�finit la valeur de la propri�t� townCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTownCode(String value) {
            this.townCode = value;
        }

        /**
         * Obtient la valeur de la propri�t� brthArea.
         * 
         * @return
         *     possible object is
         *     {@link NaturalPersonInputType.BrthPlace.BrthArea }
         *     
         */
        public NaturalPersonInputType.BrthPlace.BrthArea getBrthArea() {
            return brthArea;
        }

        /**
         * D�finit la valeur de la propri�t� brthArea.
         * 
         * @param value
         *     allowed object is
         *     {@link NaturalPersonInputType.BrthPlace.BrthArea }
         *     
         */
        public void setBrthArea(NaturalPersonInputType.BrthPlace.BrthArea value) {
            this.brthArea = value;
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
         *         &lt;element name="BrthAreaType" type="{}AreaTypeCode" minOccurs="0"/>
         *         &lt;element name="BrthAreaCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BrthAreaName" type="{}Name" minOccurs="0"/>
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
            "brthAreaType",
            "brthAreaCode",
            "brthAreaName"
        })
        public static class BrthArea {

            @XmlElement(name = "BrthAreaType")
            protected String brthAreaType;
            @XmlElement(name = "BrthAreaCode")
            protected String brthAreaCode;
            @XmlElement(name = "BrthAreaName")
            protected String brthAreaName;

            /**
             * Obtient la valeur de la propri�t� brthAreaType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrthAreaType() {
                return brthAreaType;
            }

            /**
             * D�finit la valeur de la propri�t� brthAreaType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrthAreaType(String value) {
                this.brthAreaType = value;
            }

            /**
             * Obtient la valeur de la propri�t� brthAreaCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrthAreaCode() {
                return brthAreaCode;
            }

            /**
             * D�finit la valeur de la propri�t� brthAreaCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrthAreaCode(String value) {
                this.brthAreaCode = value;
            }

            /**
             * Obtient la valeur de la propri�t� brthAreaName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrthAreaName() {
                return brthAreaName;
            }

            /**
             * D�finit la valeur de la propri�t� brthAreaName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrthAreaName(String value) {
                this.brthAreaName = value;
            }

        }

    }

}
