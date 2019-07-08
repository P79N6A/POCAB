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
 * NE PLUS UTILISER - Identification compte et coordonn�es bancaires
 * 
 * <p>Classe Java pour STDV2BankAccountIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDV2BankAccountIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CntryOfResdnce" type="{}CountryCode" minOccurs="0"/>
 *         &lt;element name="IBANChckDgit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CheckDigit">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIB" type="{}RIBIdentifier" minOccurs="0"/>
 *         &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType" minOccurs="0"/>
 *         &lt;element name="AltrnteIdntfctn" type="{}STDIdentificationType" minOccurs="0"/>
 *         &lt;element name="BIC" type="{}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="BnkAgncyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BnkAcctHoldr" minOccurs="0">
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
@XmlType(name = "STDV2BankAccountIdentificationType", propOrder = {
    "cntryOfResdnce",
    "ibanChckDgit",
    "rib",
    "flatBBAN",
    "altrnteIdntfctn",
    "bic",
    "bnkAgncyName",
    "bnkAcctHoldr"
})
public class STDV2BankAccountIdentificationType {

    @XmlElement(name = "CntryOfResdnce")
    protected String cntryOfResdnce;
    @XmlElement(name = "IBANChckDgit")
    protected String ibanChckDgit;
    @XmlElement(name = "RIB")
    protected RIBIdentifier rib;
    @XmlElement(name = "FlatBBAN")
    protected String flatBBAN;
    @XmlElement(name = "AltrnteIdntfctn")
    protected STDIdentificationType altrnteIdntfctn;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "BnkAgncyName")
    protected String bnkAgncyName;
    @XmlElement(name = "BnkAcctHoldr")
    protected String bnkAcctHoldr;

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
     * Obtient la valeur de la propri�t� rib.
     * 
     * @return
     *     possible object is
     *     {@link RIBIdentifier }
     *     
     */
    public RIBIdentifier getRIB() {
        return rib;
    }

    /**
     * D�finit la valeur de la propri�t� rib.
     * 
     * @param value
     *     allowed object is
     *     {@link RIBIdentifier }
     *     
     */
    public void setRIB(RIBIdentifier value) {
        this.rib = value;
    }

    /**
     * Obtient la valeur de la propri�t� flatBBAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatBBAN() {
        return flatBBAN;
    }

    /**
     * D�finit la valeur de la propri�t� flatBBAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatBBAN(String value) {
        this.flatBBAN = value;
    }

    /**
     * Obtient la valeur de la propri�t� altrnteIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link STDIdentificationType }
     *     
     */
    public STDIdentificationType getAltrnteIdntfctn() {
        return altrnteIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� altrnteIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link STDIdentificationType }
     *     
     */
    public void setAltrnteIdntfctn(STDIdentificationType value) {
        this.altrnteIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� bic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * D�finit la valeur de la propri�t� bic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Obtient la valeur de la propri�t� bnkAgncyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkAgncyName() {
        return bnkAgncyName;
    }

    /**
     * D�finit la valeur de la propri�t� bnkAgncyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkAgncyName(String value) {
        this.bnkAgncyName = value;
    }

    /**
     * Obtient la valeur de la propri�t� bnkAcctHoldr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkAcctHoldr() {
        return bnkAcctHoldr;
    }

    /**
     * D�finit la valeur de la propri�t� bnkAcctHoldr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkAcctHoldr(String value) {
        this.bnkAcctHoldr = value;
    }

}
