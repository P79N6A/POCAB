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
 * Relev� d'Identit� Bancaire - Forme Fran�aise du BBAN
 * 
 * <p>Classe Java pour RIBIdentifier complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RIBIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BnkCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BrnchCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Idntfctn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIBChckDgit">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CheckDigit">
 *               &lt;length value="2"/>
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
@XmlType(name = "RIBIdentifier", propOrder = {
    "bnkCode",
    "brnchCode",
    "idntfctn",
    "ribChckDgit"
})
public class RIBIdentifier {

    @XmlElement(name = "BnkCode", required = true)
    protected String bnkCode;
    @XmlElement(name = "BrnchCode", required = true)
    protected String brnchCode;
    @XmlElement(name = "Idntfctn", required = true)
    protected String idntfctn;
    @XmlElement(name = "RIBChckDgit", required = true)
    protected String ribChckDgit;

    /**
     * Obtient la valeur de la propri�t� bnkCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkCode() {
        return bnkCode;
    }

    /**
     * D�finit la valeur de la propri�t� bnkCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkCode(String value) {
        this.bnkCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� brnchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchCode() {
        return brnchCode;
    }

    /**
     * D�finit la valeur de la propri�t� brnchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnchCode(String value) {
        this.brnchCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� idntfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntfctn() {
        return idntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� idntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdntfctn(String value) {
        this.idntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� ribChckDgit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIBChckDgit() {
        return ribChckDgit;
    }

    /**
     * D�finit la valeur de la propri�t� ribChckDgit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIBChckDgit(String value) {
        this.ribChckDgit = value;
    }

}
