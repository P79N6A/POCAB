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
import javax.xml.bind.annotation.XmlType;


/**
 * Adresse Postale
 * 
 * <p>Classe Java pour PostalAddressType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unstruc" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Structed" type="{}StructuredPostalAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = {
    "unstruc",
    "structed"
})
public class PostalAddressType {

    @XmlElement(name = "Unstruc")
    protected List<String> unstruc;
    @XmlElement(name = "Structed")
    protected StructuredPostalAddress structed;

    /**
     * Gets the value of the unstruc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unstruc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnstruc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnstruc() {
        if (unstruc == null) {
            unstruc = new ArrayList<String>();
        }
        return this.unstruc;
    }

    /**
     * Obtient la valeur de la propri�t� structed.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPostalAddress }
     *     
     */
    public StructuredPostalAddress getStructed() {
        return structed;
    }

    /**
     * D�finit la valeur de la propri�t� structed.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPostalAddress }
     *     
     */
    public void setStructed(StructuredPostalAddress value) {
        this.structed = value;
    }

}
