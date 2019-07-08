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
 * NE PLUS UTILISER - INPUT = UnderlyingIdentificationType
 * 
 * <p>Classe Java pour UnderlyingIdentificationInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingIdentificationInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ISIN" type="{}ISINIdentifier" minOccurs="0"/>
 *           &lt;element name="OthrIdntfctn" type="{}AlternateFinancialInstrumentIdentificationInputType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="PlaceOfListng" type="{}MICIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingIdentificationInputType", propOrder = {
    "isin",
    "othrIdntfctn",
    "placeOfListng"
})
public class UnderlyingIdentificationInputType {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OthrIdntfctn")
    protected AlternateFinancialInstrumentIdentificationInputType othrIdntfctn;
    @XmlElement(name = "PlaceOfListng")
    protected String placeOfListng;

    /**
     * Obtient la valeur de la propri�t� isin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * D�finit la valeur de la propri�t� isin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Obtient la valeur de la propri�t� othrIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link AlternateFinancialInstrumentIdentificationInputType }
     *     
     */
    public AlternateFinancialInstrumentIdentificationInputType getOthrIdntfctn() {
        return othrIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� othrIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateFinancialInstrumentIdentificationInputType }
     *     
     */
    public void setOthrIdntfctn(AlternateFinancialInstrumentIdentificationInputType value) {
        this.othrIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� placeOfListng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfListng() {
        return placeOfListng;
    }

    /**
     * D�finit la valeur de la propri�t� placeOfListng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfListng(String value) {
        this.placeOfListng = value;
    }

}
