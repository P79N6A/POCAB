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
 * INPUT = PaymentArrangementType
 * 
 * <p>Classe Java pour PaymentArrangementInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentArrangementInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Status" type="{}PaymentArrangementStatusCode" minOccurs="0"/>
 *         &lt;element name="SettlmntMode" type="{}SettlementModeCode" minOccurs="0"/>
 *         &lt;element name="Acct" type="{}AccountIdentificationInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentArrangementInputType", propOrder = {
    "status",
    "settlmntMode",
    "acct"
})
public class PaymentArrangementInputType {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SettlmntMode")
    protected String settlmntMode;
    @XmlElement(name = "Acct")
    protected AccountIdentificationInputType acct;

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
     * Obtient la valeur de la propri�t� settlmntMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlmntMode() {
        return settlmntMode;
    }

    /**
     * D�finit la valeur de la propri�t� settlmntMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlmntMode(String value) {
        this.settlmntMode = value;
    }

    /**
     * Obtient la valeur de la propri�t� acct.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationInputType }
     *     
     */
    public AccountIdentificationInputType getAcct() {
        return acct;
    }

    /**
     * D�finit la valeur de la propri�t� acct.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationInputType }
     *     
     */
    public void setAcct(AccountIdentificationInputType value) {
        this.acct = value;
    }

}
