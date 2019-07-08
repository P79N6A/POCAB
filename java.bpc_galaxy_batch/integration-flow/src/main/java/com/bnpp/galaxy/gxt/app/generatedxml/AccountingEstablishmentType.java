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
 * Etablissement comptable - Entit� qui doit produire un bilan et un compte de r�sultat
 * 
 * <p>Classe Java pour AccountingEstablishmentType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccountingEstablishmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccntngEstblshmntCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccntngEstblshmntName" type="{}Name" minOccurs="0"/>
 *         &lt;element name="AccntngEstblshmntCntry" type="{}CountryCode" minOccurs="0"/>
 *         &lt;element name="AccntngEstblshmntType" type="{}AccountingEstablishmentTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingEstablishmentType", propOrder = {
    "accntngEstblshmntCode",
    "accntngEstblshmntName",
    "accntngEstblshmntCntry",
    "accntngEstblshmntType"
})
public class AccountingEstablishmentType {

    @XmlElement(name = "AccntngEstblshmntCode", required = true)
    protected String accntngEstblshmntCode;
    @XmlElement(name = "AccntngEstblshmntName")
    protected String accntngEstblshmntName;
    @XmlElement(name = "AccntngEstblshmntCntry")
    protected String accntngEstblshmntCntry;
    @XmlElement(name = "AccntngEstblshmntType")
    protected String accntngEstblshmntType;

    /**
     * Obtient la valeur de la propri�t� accntngEstblshmntCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntngEstblshmntCode() {
        return accntngEstblshmntCode;
    }

    /**
     * D�finit la valeur de la propri�t� accntngEstblshmntCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntngEstblshmntCode(String value) {
        this.accntngEstblshmntCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accntngEstblshmntName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntngEstblshmntName() {
        return accntngEstblshmntName;
    }

    /**
     * D�finit la valeur de la propri�t� accntngEstblshmntName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntngEstblshmntName(String value) {
        this.accntngEstblshmntName = value;
    }

    /**
     * Obtient la valeur de la propri�t� accntngEstblshmntCntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntngEstblshmntCntry() {
        return accntngEstblshmntCntry;
    }

    /**
     * D�finit la valeur de la propri�t� accntngEstblshmntCntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntngEstblshmntCntry(String value) {
        this.accntngEstblshmntCntry = value;
    }

    /**
     * Obtient la valeur de la propri�t� accntngEstblshmntType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntngEstblshmntType() {
        return accntngEstblshmntType;
    }

    /**
     * D�finit la valeur de la propri�t� accntngEstblshmntType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntngEstblshmntType(String value) {
        this.accntngEstblshmntType = value;
    }

}
