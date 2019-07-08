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
 * Avance sur contrat
 * 
 * <p>Classe Java pour SavingsLoanType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SavingsLoanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SavngsLoanId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SavngsPolIdntfctn" type="{}SavingsPolicyIdentificationType"/>
 *         &lt;element name="FrstLoanIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{}ISODate"/>
 *         &lt;element name="EndDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="TermDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="CaptlAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TotAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="InstllmntAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="InstllmntQty" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="InstllmntFqcy" type="{}CurrencyAndAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SavingsLoanType", propOrder = {
    "savngsLoanId",
    "status",
    "savngsPolIdntfctn",
    "frstLoanIndic",
    "startDate",
    "endDate",
    "termDate",
    "captlAmnt",
    "totAmnt",
    "instllmntAmnt",
    "instllmntQty",
    "instllmntFqcy"
})
public class SavingsLoanType {

    @XmlElement(name = "SavngsLoanId", required = true)
    protected String savngsLoanId;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "SavngsPolIdntfctn", required = true)
    protected SavingsPolicyIdentificationType savngsPolIdntfctn;
    @XmlElement(name = "FrstLoanIndic")
    protected String frstLoanIndic;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "TermDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termDate;
    @XmlElement(name = "CaptlAmnt")
    protected CurrencyAndAmount captlAmnt;
    @XmlElement(name = "TotAmnt")
    protected CurrencyAndAmount totAmnt;
    @XmlElement(name = "InstllmntAmnt")
    protected CurrencyAndAmount instllmntAmnt;
    @XmlElement(name = "InstllmntQty")
    protected CurrencyAndAmount instllmntQty;
    @XmlElement(name = "InstllmntFqcy")
    protected CurrencyAndAmount instllmntFqcy;

    /**
     * Obtient la valeur de la propri�t� savngsLoanId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavngsLoanId() {
        return savngsLoanId;
    }

    /**
     * D�finit la valeur de la propri�t� savngsLoanId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavngsLoanId(String value) {
        this.savngsLoanId = value;
    }

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
     * Obtient la valeur de la propri�t� savngsPolIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link SavingsPolicyIdentificationType }
     *     
     */
    public SavingsPolicyIdentificationType getSavngsPolIdntfctn() {
        return savngsPolIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� savngsPolIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsPolicyIdentificationType }
     *     
     */
    public void setSavngsPolIdntfctn(SavingsPolicyIdentificationType value) {
        this.savngsPolIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� frstLoanIndic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstLoanIndic() {
        return frstLoanIndic;
    }

    /**
     * D�finit la valeur de la propri�t� frstLoanIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstLoanIndic(String value) {
        this.frstLoanIndic = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * D�finit la valeur de la propri�t� endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� termDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermDate() {
        return termDate;
    }

    /**
     * D�finit la valeur de la propri�t� termDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermDate(XMLGregorianCalendar value) {
        this.termDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� captlAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getCaptlAmnt() {
        return captlAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� captlAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setCaptlAmnt(CurrencyAndAmount value) {
        this.captlAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� totAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTotAmnt() {
        return totAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� totAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTotAmnt(CurrencyAndAmount value) {
        this.totAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� instllmntAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInstllmntAmnt() {
        return instllmntAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� instllmntAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setInstllmntAmnt(CurrencyAndAmount value) {
        this.instllmntAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� instllmntQty.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInstllmntQty() {
        return instllmntQty;
    }

    /**
     * D�finit la valeur de la propri�t� instllmntQty.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setInstllmntQty(CurrencyAndAmount value) {
        this.instllmntQty = value;
    }

    /**
     * Obtient la valeur de la propri�t� instllmntFqcy.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInstllmntFqcy() {
        return instllmntFqcy;
    }

    /**
     * D�finit la valeur de la propri�t� instllmntFqcy.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setInstllmntFqcy(CurrencyAndAmount value) {
        this.instllmntFqcy = value;
    }

}
