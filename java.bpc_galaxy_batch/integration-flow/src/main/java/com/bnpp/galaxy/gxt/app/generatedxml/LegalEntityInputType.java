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
 * INPUT =LegalEntityInputType
 * 
 * <p>Classe Java pour LegalEntityInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LegalEntityInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="CorprteName" type="{}Name" minOccurs="0"/>
 *         &lt;element name="LegalForm" type="{}LegalFormCode" minOccurs="0"/>
 *         &lt;element name="LegalRegstrtn" type="{}STDIdentificationInformationInputType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegstrtnDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="CmpnyCreatnDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="CmpnyCaptl" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="RegstrtnCntry" type="{}CountryCode" minOccurs="0"/>
 *         &lt;element name="RegstrtnTown" type="{}TownNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEntityInputType", propOrder = {
    "corprteName",
    "legalForm",
    "legalRegstrtn",
    "regstrtnDate",
    "cmpnyCreatnDate",
    "cmpnyCaptl",
    "regstrtnCntry",
    "regstrtnTown"
})
public class LegalEntityInputType {

    @XmlElement(name = "CorprteName")
    protected String corprteName;
    @XmlElement(name = "LegalForm")
    protected String legalForm;
    @XmlElement(name = "LegalRegstrtn")
    protected List<STDIdentificationInformationInputType> legalRegstrtn;
    @XmlElement(name = "RegstrtnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regstrtnDate;
    @XmlElement(name = "CmpnyCreatnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cmpnyCreatnDate;
    @XmlElement(name = "CmpnyCaptl")
    protected CurrencyAndAmount cmpnyCaptl;
    @XmlElement(name = "RegstrtnCntry")
    protected String regstrtnCntry;
    @XmlElement(name = "RegstrtnTown")
    protected String regstrtnTown;

    /**
     * Obtient la valeur de la propri�t� corprteName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorprteName() {
        return corprteName;
    }

    /**
     * D�finit la valeur de la propri�t� corprteName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorprteName(String value) {
        this.corprteName = value;
    }

    /**
     * Obtient la valeur de la propri�t� legalForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * D�finit la valeur de la propri�t� legalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the legalRegstrtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalRegstrtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalRegstrtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STDIdentificationInformationInputType }
     * 
     * 
     */
    public List<STDIdentificationInformationInputType> getLegalRegstrtn() {
        if (legalRegstrtn == null) {
            legalRegstrtn = new ArrayList<STDIdentificationInformationInputType>();
        }
        return this.legalRegstrtn;
    }

    /**
     * Obtient la valeur de la propri�t� regstrtnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegstrtnDate() {
        return regstrtnDate;
    }

    /**
     * D�finit la valeur de la propri�t� regstrtnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegstrtnDate(XMLGregorianCalendar value) {
        this.regstrtnDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� cmpnyCreatnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCmpnyCreatnDate() {
        return cmpnyCreatnDate;
    }

    /**
     * D�finit la valeur de la propri�t� cmpnyCreatnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCmpnyCreatnDate(XMLGregorianCalendar value) {
        this.cmpnyCreatnDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� cmpnyCaptl.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getCmpnyCaptl() {
        return cmpnyCaptl;
    }

    /**
     * D�finit la valeur de la propri�t� cmpnyCaptl.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setCmpnyCaptl(CurrencyAndAmount value) {
        this.cmpnyCaptl = value;
    }

    /**
     * Obtient la valeur de la propri�t� regstrtnCntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegstrtnCntry() {
        return regstrtnCntry;
    }

    /**
     * D�finit la valeur de la propri�t� regstrtnCntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegstrtnCntry(String value) {
        this.regstrtnCntry = value;
    }

    /**
     * Obtient la valeur de la propri�t� regstrtnTown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegstrtnTown() {
        return regstrtnTown;
    }

    /**
     * D�finit la valeur de la propri�t� regstrtnTown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegstrtnTown(String value) {
        this.regstrtnTown = value;
    }

}
