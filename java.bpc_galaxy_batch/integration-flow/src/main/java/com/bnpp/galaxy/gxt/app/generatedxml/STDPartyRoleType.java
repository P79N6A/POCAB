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
 * NE PLUS UTILISER
 * 
 * <p>Classe Java pour STDPartyRoleType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDPartyRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrtyIdntfctn" type="{}STDUniqueIdentifierType"/>
 *         &lt;element name="Role" type="{}RoleCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDPartyRoleType", propOrder = {
    "prtyIdntfctn",
    "role"
})
public class STDPartyRoleType {

    @XmlElement(name = "PrtyIdntfctn", required = true)
    protected String prtyIdntfctn;
    @XmlElement(name = "Role", required = true)
    protected String role;

    /**
     * Obtient la valeur de la propri�t� prtyIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtyIdntfctn() {
        return prtyIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� prtyIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtyIdntfctn(String value) {
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

}
