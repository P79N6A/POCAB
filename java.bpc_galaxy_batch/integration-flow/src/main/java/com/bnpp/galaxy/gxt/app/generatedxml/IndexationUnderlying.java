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
 * Sous jacent d'une indexation
 * 
 * <p>Classe Java pour IndexationUnderlying complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IndexationUnderlying">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndexatnType" type="{}IndexationTypeCode"/>
 *         &lt;element name="OthrIdntfctn" type="{}IdentificationInformation"/>
 *         &lt;element name="Name" type="{}Name" minOccurs="0"/>
 *         &lt;element name="CntryOfIssue" type="{}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexationUnderlying", propOrder = {
    "indexatnType",
    "othrIdntfctn",
    "name",
    "cntryOfIssue"
})
public class IndexationUnderlying {

    @XmlElement(name = "IndexatnType", required = true)
    protected String indexatnType;
    @XmlElement(name = "OthrIdntfctn", required = true)
    protected IdentificationInformation othrIdntfctn;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CntryOfIssue")
    protected String cntryOfIssue;

    /**
     * Obtient la valeur de la propri�t� indexatnType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexatnType() {
        return indexatnType;
    }

    /**
     * D�finit la valeur de la propri�t� indexatnType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexatnType(String value) {
        this.indexatnType = value;
    }

    /**
     * Obtient la valeur de la propri�t� othrIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation }
     *     
     */
    public IdentificationInformation getOthrIdntfctn() {
        return othrIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� othrIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation }
     *     
     */
    public void setOthrIdntfctn(IdentificationInformation value) {
        this.othrIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� cntryOfIssue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntryOfIssue() {
        return cntryOfIssue;
    }

    /**
     * D�finit la valeur de la propri�t� cntryOfIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntryOfIssue(String value) {
        this.cntryOfIssue = value;
    }

}
