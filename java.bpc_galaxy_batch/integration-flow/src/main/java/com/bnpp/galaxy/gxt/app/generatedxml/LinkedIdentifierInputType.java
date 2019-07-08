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
 * INPUT = LinkedIdentifierType
 * 
 * <p>Classe Java pour LinkedIdentifierInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinkedIdentifierInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="IdntfctnMode" type="{}IdentifierTypeCode" minOccurs="0"/>
 *         &lt;element name="Id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SlipRef" type="{}Reference" minOccurs="0"/>
 *           &lt;element name="DocRef" type="{}Reference" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedIdentifierInputType", propOrder = {
    "idntfctnMode",
    "id",
    "slipRef",
    "docRef"
})
public class LinkedIdentifierInputType {

    @XmlElement(name = "IdntfctnMode")
    protected String idntfctnMode;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SlipRef")
    protected String slipRef;
    @XmlElement(name = "DocRef")
    protected String docRef;

    /**
     * Obtient la valeur de la propri�t� idntfctnMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntfctnMode() {
        return idntfctnMode;
    }

    /**
     * D�finit la valeur de la propri�t� idntfctnMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdntfctnMode(String value) {
        this.idntfctnMode = value;
    }

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
     * Obtient la valeur de la propri�t� slipRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipRef() {
        return slipRef;
    }

    /**
     * D�finit la valeur de la propri�t� slipRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipRef(String value) {
        this.slipRef = value;
    }

    /**
     * Obtient la valeur de la propri�t� docRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRef() {
        return docRef;
    }

    /**
     * D�finit la valeur de la propri�t� docRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRef(String value) {
        this.docRef = value;
    }

}
