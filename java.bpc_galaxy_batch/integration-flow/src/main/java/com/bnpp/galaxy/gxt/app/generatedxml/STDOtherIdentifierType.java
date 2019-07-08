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
 * <p>Classe Java pour STDOtherIdentifierType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDOtherIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{}STDIdentifierType"/>
 *         &lt;element name="Scheme" type="{}SchemeCode"/>
 *         &lt;element name="Applctn" type="{}ApplicationCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDOtherIdentifierType", propOrder = {
    "id",
    "scheme",
    "applctn"
})
public class STDOtherIdentifierType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Scheme", required = true)
    protected String scheme;
    @XmlElement(name = "Applctn")
    protected String applctn;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� scheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * D�finit la valeur de la propri�t� scheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

    /**
     * Obtient la valeur de la propri�t� applctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplctn() {
        return applctn;
    }

    /**
     * D�finit la valeur de la propri�t� applctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplctn(String value) {
        this.applctn = value;
    }

}
