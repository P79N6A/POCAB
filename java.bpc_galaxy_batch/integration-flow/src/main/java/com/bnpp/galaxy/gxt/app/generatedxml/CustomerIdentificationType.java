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
 * Bloc d'idenfication du client (incluant souscripteur, b�n�ficiaire...)
 * 
 * <p>Classe Java pour CustomerIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OthrIdntfctn" type="{}IdentificationInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DuplctnLinkngId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
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
@XmlType(name = "CustomerIdentificationType", propOrder = {
    "id",
    "othrIdntfctn",
    "duplctnLinkngId"
})
public class CustomerIdentificationType {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "OthrIdntfctn")
    protected List<IdentificationInformation> othrIdntfctn;
    @XmlElement(name = "DuplctnLinkngId")
    protected String duplctnLinkngId;

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
     * Gets the value of the othrIdntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrIdntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIdntfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationInformation }
     * 
     * 
     */
    public List<IdentificationInformation> getOthrIdntfctn() {
        if (othrIdntfctn == null) {
            othrIdntfctn = new ArrayList<IdentificationInformation>();
        }
        return this.othrIdntfctn;
    }

    /**
     * Obtient la valeur de la propri�t� duplctnLinkngId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplctnLinkngId() {
        return duplctnLinkngId;
    }

    /**
     * D�finit la valeur de la propri�t� duplctnLinkngId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplctnLinkngId(String value) {
        this.duplctnLinkngId = value;
    }

}
