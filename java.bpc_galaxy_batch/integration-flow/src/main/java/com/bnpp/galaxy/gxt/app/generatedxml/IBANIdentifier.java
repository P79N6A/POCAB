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
 * L'IBAN (International Bank Account Number) identifie de mani�re unique un compte client chez un interm�diaire financier dans un cadre international. Standard ISO 13616.
 * 
 * <p>Classe Java pour IBANIdentifier complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IBANIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CntryOfResdnce" type="{}CountryCode"/>
 *         &lt;element name="IBANChckDgit">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CheckDigit">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BBAN" type="{}BBANIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBANIdentifier", propOrder = {
    "cntryOfResdnce",
    "ibanChckDgit",
    "bban"
})
public class IBANIdentifier {

    @XmlElement(name = "CntryOfResdnce", required = true)
    protected String cntryOfResdnce;
    @XmlElement(name = "IBANChckDgit", required = true)
    protected String ibanChckDgit;
    @XmlElement(name = "BBAN", required = true)
    protected BBANIdentifier bban;

    /**
     * Obtient la valeur de la propri�t� cntryOfResdnce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntryOfResdnce() {
        return cntryOfResdnce;
    }

    /**
     * D�finit la valeur de la propri�t� cntryOfResdnce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntryOfResdnce(String value) {
        this.cntryOfResdnce = value;
    }

    /**
     * Obtient la valeur de la propri�t� ibanChckDgit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANChckDgit() {
        return ibanChckDgit;
    }

    /**
     * D�finit la valeur de la propri�t� ibanChckDgit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANChckDgit(String value) {
        this.ibanChckDgit = value;
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

}
