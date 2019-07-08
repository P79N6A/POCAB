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
 * INPUT = WebLocationType
 * 
 * <p>Classe Java pour WebLocationInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WebLocationInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="WebAdrsId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WebAdrsType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="URLAdrs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
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
@XmlType(name = "WebLocationInputType", propOrder = {
    "webAdrsId",
    "webAdrsType",
    "urlAdrs"
})
public class WebLocationInputType {

    @XmlElement(name = "WebAdrsId")
    protected String webAdrsId;
    @XmlElement(name = "WebAdrsType")
    protected String webAdrsType;
    @XmlElement(name = "URLAdrs")
    protected String urlAdrs;

    /**
     * Obtient la valeur de la propri�t� webAdrsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAdrsId() {
        return webAdrsId;
    }

    /**
     * D�finit la valeur de la propri�t� webAdrsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAdrsId(String value) {
        this.webAdrsId = value;
    }

    /**
     * Obtient la valeur de la propri�t� webAdrsType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAdrsType() {
        return webAdrsType;
    }

    /**
     * D�finit la valeur de la propri�t� webAdrsType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAdrsType(String value) {
        this.webAdrsType = value;
    }

    /**
     * Obtient la valeur de la propri�t� urlAdrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdrs() {
        return urlAdrs;
    }

    /**
     * D�finit la valeur de la propri�t� urlAdrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdrs(String value) {
        this.urlAdrs = value;
    }

}
