//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Taux de change entre deux devises
 * 
 * <p>Classe Java pour SLNV1CurrencyExchange complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1CurrencyExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitCurr" type="{}CurrencyCodeSLN"/>
 *         &lt;element name="QuotdCurr" type="{}CurrencyCodeSLN"/>
 *         &lt;element name="ExchngeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FixngDateTime" type="{}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1CurrencyExchange", propOrder = {
    "unitCurr",
    "quotdCurr",
    "exchngeRate",
    "fixngDateTime"
})
public class SLNV1CurrencyExchange {

    @XmlElement(name = "UnitCurr", required = true)
    protected String unitCurr;
    @XmlElement(name = "QuotdCurr", required = true)
    protected String quotdCurr;
    @XmlElement(name = "ExchngeRate", required = true)
    protected BigDecimal exchngeRate;
    @XmlElement(name = "FixngDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fixngDateTime;

    /**
     * Obtient la valeur de la propri�t� unitCurr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCurr() {
        return unitCurr;
    }

    /**
     * D�finit la valeur de la propri�t� unitCurr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCurr(String value) {
        this.unitCurr = value;
    }

    /**
     * Obtient la valeur de la propri�t� quotdCurr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotdCurr() {
        return quotdCurr;
    }

    /**
     * D�finit la valeur de la propri�t� quotdCurr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotdCurr(String value) {
        this.quotdCurr = value;
    }

    /**
     * Obtient la valeur de la propri�t� exchngeRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchngeRate() {
        return exchngeRate;
    }

    /**
     * D�finit la valeur de la propri�t� exchngeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchngeRate(BigDecimal value) {
        this.exchngeRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� fixngDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixngDateTime() {
        return fixngDateTime;
    }

    /**
     * D�finit la valeur de la propri�t� fixngDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFixngDateTime(XMLGregorianCalendar value) {
        this.fixngDateTime = value;
    }

}
