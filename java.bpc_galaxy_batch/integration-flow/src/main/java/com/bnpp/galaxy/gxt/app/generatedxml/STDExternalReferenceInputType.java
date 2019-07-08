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
 * NE PLUS UTILISER - INPUt = STDExternalReferenceType
 * 
 * <p>Classe Java pour STDExternalReferenceInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDExternalReferenceInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="PrtyIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
 *         &lt;element name="Role" type="{}RoleCode" minOccurs="0"/>
 *         &lt;element name="Idntfctn" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="PartyScheme" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "STDExternalReferenceInputType", propOrder = {
    "prtyIdntfctn",
    "role",
    "idntfctn",
    "partyScheme"
})
public class STDExternalReferenceInputType {

    @XmlElement(name = "PrtyIdntfctn")
    protected STDIdentificationInformationInputType prtyIdntfctn;
    @XmlElement(name = "Role")
    protected String role;
    @XmlElement(name = "Idntfctn")
    protected String idntfctn;
    @XmlElement(name = "PartyScheme")
    protected String partyScheme;

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
     * Obtient la valeur de la propri�t� idntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntfctn() {
        return idntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� idntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdntfctn(String value) {
        this.idntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� partyScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyScheme() {
        return partyScheme;
    }

    /**
     * D�finit la valeur de la propri�t� partyScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyScheme(String value) {
        this.partyScheme = value;
    }

}
