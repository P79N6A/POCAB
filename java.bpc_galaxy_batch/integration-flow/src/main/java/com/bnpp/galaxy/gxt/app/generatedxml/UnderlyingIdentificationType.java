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
 * NE PLUS UTILISER - Identifiant du Titre ou du Fond (Interne ou G�n�ral) servant de support au contrat
 * 
 * <p>Classe Java pour UnderlyingIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ISIN" type="{}ISINIdentifier"/>
 *           &lt;element name="OthrIdntfctn" type="{}AlternateFinancialInstrumentIdentification"/>
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
@XmlType(name = "UnderlyingIdentificationType", propOrder = {
    "isin",
    "othrIdntfctn",
    "placeOfListng"
})
public class UnderlyingIdentificationType {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OthrIdntfctn")
    protected AlternateFinancialInstrumentIdentification othrIdntfctn;
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
     *     {@link AlternateFinancialInstrumentIdentification }
     *     
     */
    public AlternateFinancialInstrumentIdentification getOthrIdntfctn() {
        return othrIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� othrIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateFinancialInstrumentIdentification }
     *     
     */
    public void setOthrIdntfctn(AlternateFinancialInstrumentIdentification value) {
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
