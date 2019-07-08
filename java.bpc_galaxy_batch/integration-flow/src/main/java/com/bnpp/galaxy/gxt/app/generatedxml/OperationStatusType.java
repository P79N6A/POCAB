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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * NE PLUS UTILISER - Statut d'une op�ration financi�re
 * 
 * <p>Classe Java pour OperationStatusType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperationStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{}OperationStatusCode"/>
 *         &lt;element name="EffctveDate" type="{}ISODateTime"/>
 *         &lt;element name="StatusReasnCode" type="{}EventTypeCode" minOccurs="0"/>
 *         &lt;element name="PrevStatus" type="{}OperationStatusCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationStatusType", propOrder = {
    "status",
    "effctveDate",
    "statusReasnCode",
    "prevStatus"
})
public class OperationStatusType {

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "EffctveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effctveDate;
    @XmlElement(name = "StatusReasnCode")
    protected String statusReasnCode;
    @XmlElement(name = "PrevStatus")
    protected String prevStatus;

    /**
     * Obtient la valeur de la propri�t� status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� effctveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffctveDate() {
        return effctveDate;
    }

    /**
     * D�finit la valeur de la propri�t� effctveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffctveDate(XMLGregorianCalendar value) {
        this.effctveDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� statusReasnCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReasnCode() {
        return statusReasnCode;
    }

    /**
     * D�finit la valeur de la propri�t� statusReasnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReasnCode(String value) {
        this.statusReasnCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� prevStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevStatus() {
        return prevStatus;
    }

    /**
     * D�finit la valeur de la propri�t� prevStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevStatus(String value) {
        this.prevStatus = value;
    }

}
