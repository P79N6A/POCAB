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
 * Bloc d'identification du distributeur (remplace STDV3PartnerPartyType)
 * 
 * <p>Classe Java pour SLNV1PartnerPartyType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1PartnerPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrtyIdntfctn" type="{}SLNV1ObjectIdentificationType"/>
 *         &lt;element name="Role" type="{}RoleCodeSLN"/>
 *         &lt;element name="Netwrk" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnrNetwrkUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
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
@XmlType(name = "SLNV1PartnerPartyType", propOrder = {
    "prtyIdntfctn",
    "role",
    "netwrk",
    "partnrNetwrkUnit"
})
public class SLNV1PartnerPartyType {

    @XmlElement(name = "PrtyIdntfctn", required = true)
    protected SLNV1ObjectIdentificationType prtyIdntfctn;
    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "Netwrk")
    protected String netwrk;
    @XmlElement(name = "PartnrNetwrkUnit")
    protected String partnrNetwrkUnit;

    /**
     * Obtient la valeur de la propri�t� prtyIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1ObjectIdentificationType }
     *     
     */
    public SLNV1ObjectIdentificationType getPrtyIdntfctn() {
        return prtyIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� prtyIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1ObjectIdentificationType }
     *     
     */
    public void setPrtyIdntfctn(SLNV1ObjectIdentificationType value) {
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
     * Obtient la valeur de la propri�t� netwrk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwrk() {
        return netwrk;
    }

    /**
     * D�finit la valeur de la propri�t� netwrk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwrk(String value) {
        this.netwrk = value;
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

}
