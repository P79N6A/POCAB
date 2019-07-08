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
 * Identifiant d'un Compte
 * 
 * <p>Classe Java pour AccountIdentification complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccountIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IBAN" type="{}IBANIdentifier" minOccurs="0"/>
 *         &lt;element name="BBAN" type="{}BBANIdentifier" minOccurs="0"/>
 *         &lt;element name="AltrnteIdntfctn" type="{}IdentificationInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification", propOrder = {
    "iban",
    "bban",
    "altrnteIdntfctn"
})
public class AccountIdentification {

    @XmlElement(name = "IBAN")
    protected IBANIdentifier iban;
    @XmlElement(name = "BBAN")
    protected BBANIdentifier bban;
    @XmlElement(name = "AltrnteIdntfctn")
    protected IdentificationInformation altrnteIdntfctn;

    /**
     * Obtient la valeur de la propri�t� iban.
     * 
     * @return
     *     possible object is
     *     {@link IBANIdentifier }
     *     
     */
    public IBANIdentifier getIBAN() {
        return iban;
    }

    /**
     * D�finit la valeur de la propri�t� iban.
     * 
     * @param value
     *     allowed object is
     *     {@link IBANIdentifier }
     *     
     */
    public void setIBAN(IBANIdentifier value) {
        this.iban = value;
    }

    /**
     * Obtient la valeur de la propri�t� bban.
     * 
     * @return
     *     possible object is
     *     {@link BBANIdentifier }
     *     
     */
    public BBANIdentifier getBBAN() {
        return bban;
    }

    /**
     * D�finit la valeur de la propri�t� bban.
     * 
     * @param value
     *     allowed object is
     *     {@link BBANIdentifier }
     *     
     */
    public void setBBAN(BBANIdentifier value) {
        this.bban = value;
    }

    /**
     * Obtient la valeur de la propri�t� altrnteIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation }
     *     
     */
    public IdentificationInformation getAltrnteIdntfctn() {
        return altrnteIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� altrnteIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation }
     *     
     */
    public void setAltrnteIdntfctn(IdentificationInformation value) {
        this.altrnteIdntfctn = value;
    }

}
