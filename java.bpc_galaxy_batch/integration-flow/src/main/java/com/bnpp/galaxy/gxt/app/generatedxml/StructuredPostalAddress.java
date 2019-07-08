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
 * Adresse structur�e d'un Tiers
 * 
 * <p>Classe Java pour StructuredPostalAddress complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StructuredPostalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetBldngIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NamedPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BldngName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BldngIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POBox" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Loclity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostCodeIdntfctn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}TownNameType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CdexIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="Cdex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cntry" type="{}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPostalAddress", propOrder = {
    "title",
    "streetBldngIdntfctn",
    "streetName",
    "namedPlace",
    "bldngName",
    "bldngIdntfctn",
    "poBox",
    "loclity",
    "postCodeIdntfctn",
    "townName",
    "cdexIndic",
    "cdex",
    "cntry"
})
public class StructuredPostalAddress {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "StreetBldngIdntfctn")
    protected String streetBldngIdntfctn;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "NamedPlace")
    protected String namedPlace;
    @XmlElement(name = "BldngName")
    protected String bldngName;
    @XmlElement(name = "BldngIdntfctn")
    protected String bldngIdntfctn;
    @XmlElement(name = "POBox")
    protected String poBox;
    @XmlElement(name = "Loclity")
    protected String loclity;
    @XmlElement(name = "PostCodeIdntfctn")
    protected String postCodeIdntfctn;
    @XmlElement(name = "TownName")
    protected String townName;
    @XmlElement(name = "CdexIndic")
    protected String cdexIndic;
    @XmlElement(name = "Cdex")
    protected String cdex;
    @XmlElement(name = "Cntry")
    protected String cntry;

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
     * Obtient la valeur de la propri�t� streetBldngIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetBldngIdntfctn() {
        return streetBldngIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� streetBldngIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetBldngIdntfctn(String value) {
        this.streetBldngIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * D�finit la valeur de la propri�t� streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtient la valeur de la propri�t� namedPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedPlace() {
        return namedPlace;
    }

    /**
     * D�finit la valeur de la propri�t� namedPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedPlace(String value) {
        this.namedPlace = value;
    }

    /**
     * Obtient la valeur de la propri�t� bldngName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldngName() {
        return bldngName;
    }

    /**
     * D�finit la valeur de la propri�t� bldngName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldngName(String value) {
        this.bldngName = value;
    }

    /**
     * Obtient la valeur de la propri�t� bldngIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldngIdntfctn() {
        return bldngIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� bldngIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldngIdntfctn(String value) {
        this.bldngIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� poBox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * D�finit la valeur de la propri�t� poBox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Obtient la valeur de la propri�t� loclity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoclity() {
        return loclity;
    }

    /**
     * D�finit la valeur de la propri�t� loclity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoclity(String value) {
        this.loclity = value;
    }

    /**
     * Obtient la valeur de la propri�t� postCodeIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCodeIdntfctn() {
        return postCodeIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� postCodeIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCodeIdntfctn(String value) {
        this.postCodeIdntfctn = value;
    }

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
     * Obtient la valeur de la propri�t� cdexIndic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdexIndic() {
        return cdexIndic;
    }

    /**
     * D�finit la valeur de la propri�t� cdexIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdexIndic(String value) {
        this.cdexIndic = value;
    }

    /**
     * Obtient la valeur de la propri�t� cdex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdex() {
        return cdex;
    }

    /**
     * D�finit la valeur de la propri�t� cdex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdex(String value) {
        this.cdex = value;
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

}
