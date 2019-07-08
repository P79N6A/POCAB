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
 * Identification domestique ou propri�taire d'un instrument financier
 * 
 * <p>Classe Java pour AlternateFinancialInstrumentIdentification complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlternateFinancialInstrumentIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DomstcIdntfctnSrce" type="{}CountryCode"/>
 *           &lt;element name="PprtaryIdntfctnSrce">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="100"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Idntfctn">
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
@XmlType(name = "AlternateFinancialInstrumentIdentification", propOrder = {
    "domstcIdntfctnSrce",
    "pprtaryIdntfctnSrce",
    "idntfctn"
})
public class AlternateFinancialInstrumentIdentification {

    @XmlElement(name = "DomstcIdntfctnSrce")
    protected String domstcIdntfctnSrce;
    @XmlElement(name = "PprtaryIdntfctnSrce")
    protected String pprtaryIdntfctnSrce;
    @XmlElement(name = "Idntfctn", required = true)
    protected String idntfctn;

    /**
     * Obtient la valeur de la propri�t� domstcIdntfctnSrce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomstcIdntfctnSrce() {
        return domstcIdntfctnSrce;
    }

    /**
     * D�finit la valeur de la propri�t� domstcIdntfctnSrce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomstcIdntfctnSrce(String value) {
        this.domstcIdntfctnSrce = value;
    }

    /**
     * Obtient la valeur de la propri�t� pprtaryIdntfctnSrce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPprtaryIdntfctnSrce() {
        return pprtaryIdntfctnSrce;
    }

    /**
     * D�finit la valeur de la propri�t� pprtaryIdntfctnSrce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPprtaryIdntfctnSrce(String value) {
        this.pprtaryIdntfctnSrce = value;
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

}
