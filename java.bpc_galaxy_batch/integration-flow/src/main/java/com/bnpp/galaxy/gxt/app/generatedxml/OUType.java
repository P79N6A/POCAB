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
 * OrganizationalUnit - El�ment d'une structure
 * 
 * <p>Classe Java pour OUType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OUType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OUId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{}Name"/>
 *         &lt;element name="HierarchRnk">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnrNetwrkUnit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adrs" type="{}PostalAddressType" minOccurs="0"/>
 *         &lt;element name="Phone" type="{}PhoneAddressType" minOccurs="0"/>
 *         &lt;element name="EMail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FaxAdrs" type="{}PhoneAddressType" minOccurs="0"/>
 *         &lt;element name="Person" type="{}PersonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OUType", propOrder = {
    "ouId",
    "name",
    "hierarchRnk",
    "partnrNetwrkUnit",
    "adrs",
    "phone",
    "eMail",
    "faxAdrs",
    "person"
})
public class OUType {

    @XmlElement(name = "OUId", required = true)
    protected String ouId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "HierarchRnk", required = true)
    protected String hierarchRnk;
    @XmlElement(name = "PartnrNetwrkUnit", required = true)
    protected String partnrNetwrkUnit;
    @XmlElement(name = "Adrs")
    protected PostalAddressType adrs;
    @XmlElement(name = "Phone")
    protected PhoneAddressType phone;
    @XmlElement(name = "EMail")
    protected String eMail;
    @XmlElement(name = "FaxAdrs")
    protected PhoneAddressType faxAdrs;
    @XmlElement(name = "Person")
    protected PersonType person;

    /**
     * Obtient la valeur de la propri�t� ouId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUId() {
        return ouId;
    }

    /**
     * D�finit la valeur de la propri�t� ouId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUId(String value) {
        this.ouId = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� hierarchRnk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchRnk() {
        return hierarchRnk;
    }

    /**
     * D�finit la valeur de la propri�t� hierarchRnk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchRnk(String value) {
        this.hierarchRnk = value;
    }

    /**
     * Obtient la valeur de la propri�t� partnrNetwrkUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnrNetwrkUnit() {
        return partnrNetwrkUnit;
    }

    /**
     * D�finit la valeur de la propri�t� partnrNetwrkUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnrNetwrkUnit(String value) {
        this.partnrNetwrkUnit = value;
    }

    /**
     * Obtient la valeur de la propri�t� adrs.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getAdrs() {
        return adrs;
    }

    /**
     * D�finit la valeur de la propri�t� adrs.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setAdrs(PostalAddressType value) {
        this.adrs = value;
    }

    /**
     * Obtient la valeur de la propri�t� phone.
     * 
     * @return
     *     possible object is
     *     {@link PhoneAddressType }
     *     
     */
    public PhoneAddressType getPhone() {
        return phone;
    }

    /**
     * D�finit la valeur de la propri�t� phone.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneAddressType }
     *     
     */
    public void setPhone(PhoneAddressType value) {
        this.phone = value;
    }

    /**
     * Obtient la valeur de la propri�t� eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * D�finit la valeur de la propri�t� eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Obtient la valeur de la propri�t� faxAdrs.
     * 
     * @return
     *     possible object is
     *     {@link PhoneAddressType }
     *     
     */
    public PhoneAddressType getFaxAdrs() {
        return faxAdrs;
    }

    /**
     * D�finit la valeur de la propri�t� faxAdrs.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneAddressType }
     *     
     */
    public void setFaxAdrs(PhoneAddressType value) {
        this.faxAdrs = value;
    }

    /**
     * Obtient la valeur de la propri�t� person.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * D�finit la valeur de la propri�t� person.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

}
