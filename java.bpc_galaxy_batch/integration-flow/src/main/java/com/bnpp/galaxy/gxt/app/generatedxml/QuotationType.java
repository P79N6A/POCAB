//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Objet : Cours
 * 
 * <p>Classe Java pour QuotationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="QuotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotatnIdntfctn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="SecurtyIdntfctn">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="ISIN" type="{}ISINIdentifier" minOccurs="0"/>
 *                                 &lt;element name="OthrIdntfctn" type="{}AlternateFinancialInstrumentIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="PlaceOfListng" type="{}MICIdentifier" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;element name="FutIdntfctn">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="MarktIdntfctn" type="{}MICIdentifier"/>
 *                               &lt;element name="CntrctName" type="{}Name"/>
 *                               &lt;element name="ExpiryDate" type="{}ISODateTime"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OptIdntfctn">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="MarktIdntfctn" type="{}MICIdentifier"/>
 *                               &lt;element name="CntrctName" type="{}Name"/>
 *                               &lt;element name="CntrctVrsNumb">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="3"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ExpiryDate" type="{}ISODateTime"/>
 *                               &lt;element name="OptType" type="{}OptionTypeCode"/>
 *                               &lt;element name="ExrcisePrice" type="{}Price"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="ValdtyDate" type="{}ISODate"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="QuotatnStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status" type="{}QuotationStatusCode"/>
 *                   &lt;element name="EffctveDate" type="{}ISODate" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InitiatngEvt" type="{}STDInitiatingEventType" minOccurs="0"/>
 *         &lt;element name="Mesure">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SharePrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *                             &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
 *                             &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BondPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Yield" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="ISMAYield" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="YieldToMaturty" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="NetMargn" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="NetDuratn" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="NetModifDuratn" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="WeightdAvrgeLife" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="OutstdngAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *                             &lt;element name="AccredIntrstRate" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="TradeDateAccredIntrst" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="CumDvdndIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *                             &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="MidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *                             &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
 *                             &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DebtPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Yield" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="ISMAYield" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="YieldToMaturty" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="NetMargn" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="NetDuratn" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="NetModifDuratn" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="WeightdAvrgeLife" type="{}DecimalNumber" minOccurs="0"/>
 *                             &lt;element name="OutstdngAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *                             &lt;element name="AccredIntrstRate" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="TradeDateAccredIntrst" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="CumDvdndIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *                             &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="MidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *                             &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="CashBillRate" type="{}PercentageRate" minOccurs="0"/>
 *                             &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
 *                             &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OptFutPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AskPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="BidPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="HighPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="LowPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="OpeningPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="ClosngPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="IndctvePrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="SettlmntPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
 *                             &lt;element name="TradngOpenIntrst" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
 *                             &lt;element name="MarktOpenIntrst" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
 *                             &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
 *                             &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *                             &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IndexPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HighPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="LowPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="OpeningPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="ClosngPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="MarktPrice" type="{}Price" minOccurs="0"/>
 *                             &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Provdr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProvdr" type="{}ProviderCode"/>
 *                   &lt;element name="ProvdrTimeStamp" type="{}ISODateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Anmly" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Srce">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="LineValue">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProvdrAnmlyType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProvdrAnmlyDesc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="200"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Trget">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TagName">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TagValue">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FailReasn">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Desc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cntxt" type="{}DataContextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotationType", propOrder = {
    "quotatnIdntfctn",
    "quotatnStatus",
    "initiatngEvt",
    "mesure",
    "provdr",
    "anmly",
    "cntxt"
})
@XmlRootElement(name = "Quotation")
public class QuotationType {

    @XmlElement(name = "QuotatnIdntfctn", required = true)
    protected QuotationType.QuotatnIdntfctn quotatnIdntfctn;
    @XmlElement(name = "QuotatnStatus", required = true)
    protected QuotationType.QuotatnStatus quotatnStatus;
    @XmlElement(name = "InitiatngEvt")
    protected STDInitiatingEventType initiatngEvt;
    @XmlElement(name = "Mesure", required = true)
    protected QuotationType.Mesure mesure;
    @XmlElement(name = "Provdr", required = true)
    protected QuotationType.Provdr provdr;
    @XmlElement(name = "Anmly")
    protected List<QuotationType.Anmly> anmly;
    @XmlElement(name = "Cntxt", required = true)
    protected DataContextType cntxt;

    /**
     * Obtient la valeur de la propri�t� quotatnIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link QuotationType.QuotatnIdntfctn }
     *     
     */
    public QuotationType.QuotatnIdntfctn getQuotatnIdntfctn() {
        return quotatnIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� quotatnIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType.QuotatnIdntfctn }
     *     
     */
    public void setQuotatnIdntfctn(QuotationType.QuotatnIdntfctn value) {
        this.quotatnIdntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� quotatnStatus.
     * 
     * @return
     *     possible object is
     *     {@link QuotationType.QuotatnStatus }
     *     
     */
    public QuotationType.QuotatnStatus getQuotatnStatus() {
        return quotatnStatus;
    }

    /**
     * D�finit la valeur de la propri�t� quotatnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType.QuotatnStatus }
     *     
     */
    public void setQuotatnStatus(QuotationType.QuotatnStatus value) {
        this.quotatnStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� initiatngEvt.
     * 
     * @return
     *     possible object is
     *     {@link STDInitiatingEventType }
     *     
     */
    public STDInitiatingEventType getInitiatngEvt() {
        return initiatngEvt;
    }

    /**
     * D�finit la valeur de la propri�t� initiatngEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link STDInitiatingEventType }
     *     
     */
    public void setInitiatngEvt(STDInitiatingEventType value) {
        this.initiatngEvt = value;
    }

    /**
     * Obtient la valeur de la propri�t� mesure.
     * 
     * @return
     *     possible object is
     *     {@link QuotationType.Mesure }
     *     
     */
    public QuotationType.Mesure getMesure() {
        return mesure;
    }

    /**
     * D�finit la valeur de la propri�t� mesure.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType.Mesure }
     *     
     */
    public void setMesure(QuotationType.Mesure value) {
        this.mesure = value;
    }

    /**
     * Obtient la valeur de la propri�t� provdr.
     * 
     * @return
     *     possible object is
     *     {@link QuotationType.Provdr }
     *     
     */
    public QuotationType.Provdr getProvdr() {
        return provdr;
    }

    /**
     * D�finit la valeur de la propri�t� provdr.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType.Provdr }
     *     
     */
    public void setProvdr(QuotationType.Provdr value) {
        this.provdr = value;
    }

    /**
     * Gets the value of the anmly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anmly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnmly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotationType.Anmly }
     * 
     * 
     */
    public List<QuotationType.Anmly> getAnmly() {
        if (anmly == null) {
            anmly = new ArrayList<QuotationType.Anmly>();
        }
        return this.anmly;
    }

    /**
     * Obtient la valeur de la propri�t� cntxt.
     * 
     * @return
     *     possible object is
     *     {@link DataContextType }
     *     
     */
    public DataContextType getCntxt() {
        return cntxt;
    }

    /**
     * D�finit la valeur de la propri�t� cntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link DataContextType }
     *     
     */
    public void setCntxt(DataContextType value) {
        this.cntxt = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Srce">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="LineValue">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProvdrAnmlyType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProvdrAnmlyDesc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="200"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Trget">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TagName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TagValue">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FailReasn">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Desc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "srce",
        "trget"
    })
    public static class Anmly {

        @XmlElement(name = "Srce", required = true)
        protected QuotationType.Anmly.Srce srce;
        @XmlElement(name = "Trget", required = true)
        protected QuotationType.Anmly.Trget trget;

        /**
         * Obtient la valeur de la propri�t� srce.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Anmly.Srce }
         *     
         */
        public QuotationType.Anmly.Srce getSrce() {
            return srce;
        }

        /**
         * D�finit la valeur de la propri�t� srce.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Anmly.Srce }
         *     
         */
        public void setSrce(QuotationType.Anmly.Srce value) {
            this.srce = value;
        }

        /**
         * Obtient la valeur de la propri�t� trget.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Anmly.Trget }
         *     
         */
        public QuotationType.Anmly.Trget getTrget() {
            return trget;
        }

        /**
         * D�finit la valeur de la propri�t� trget.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Anmly.Trget }
         *     
         */
        public void setTrget(QuotationType.Anmly.Trget value) {
            this.trget = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="LineValue">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProvdrAnmlyType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProvdrAnmlyDesc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="200"/>
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
        @XmlType(name = "", propOrder = {
            "lineNumb",
            "lineValue",
            "provdrAnmlyType",
            "provdrAnmlyDesc"
        })
        public static class Srce {

            @XmlElement(name = "LineNumb")
            protected BigInteger lineNumb;
            @XmlElement(name = "LineValue", required = true)
            protected String lineValue;
            @XmlElement(name = "ProvdrAnmlyType", required = true)
            protected String provdrAnmlyType;
            @XmlElement(name = "ProvdrAnmlyDesc", required = true)
            protected String provdrAnmlyDesc;

            /**
             * Obtient la valeur de la propri�t� lineNumb.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLineNumb() {
                return lineNumb;
            }

            /**
             * D�finit la valeur de la propri�t� lineNumb.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLineNumb(BigInteger value) {
                this.lineNumb = value;
            }

            /**
             * Obtient la valeur de la propri�t� lineValue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineValue() {
                return lineValue;
            }

            /**
             * D�finit la valeur de la propri�t� lineValue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineValue(String value) {
                this.lineValue = value;
            }

            /**
             * Obtient la valeur de la propri�t� provdrAnmlyType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvdrAnmlyType() {
                return provdrAnmlyType;
            }

            /**
             * D�finit la valeur de la propri�t� provdrAnmlyType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvdrAnmlyType(String value) {
                this.provdrAnmlyType = value;
            }

            /**
             * Obtient la valeur de la propri�t� provdrAnmlyDesc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvdrAnmlyDesc() {
                return provdrAnmlyDesc;
            }

            /**
             * D�finit la valeur de la propri�t� provdrAnmlyDesc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvdrAnmlyDesc(String value) {
                this.provdrAnmlyDesc = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TagName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TagValue">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FailReasn">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Desc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="500"/>
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
        @XmlType(name = "", propOrder = {
            "tagName",
            "tagValue",
            "failReasn",
            "desc"
        })
        public static class Trget {

            @XmlElement(name = "TagName", required = true)
            protected String tagName;
            @XmlElement(name = "TagValue", required = true)
            protected String tagValue;
            @XmlElement(name = "FailReasn", required = true)
            protected String failReasn;
            @XmlElement(name = "Desc", required = true)
            protected String desc;

            /**
             * Obtient la valeur de la propri�t� tagName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTagName() {
                return tagName;
            }

            /**
             * D�finit la valeur de la propri�t� tagName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTagName(String value) {
                this.tagName = value;
            }

            /**
             * Obtient la valeur de la propri�t� tagValue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTagValue() {
                return tagValue;
            }

            /**
             * D�finit la valeur de la propri�t� tagValue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTagValue(String value) {
                this.tagValue = value;
            }

            /**
             * Obtient la valeur de la propri�t� failReasn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFailReasn() {
                return failReasn;
            }

            /**
             * D�finit la valeur de la propri�t� failReasn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFailReasn(String value) {
                this.failReasn = value;
            }

            /**
             * Obtient la valeur de la propri�t� desc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesc() {
                return desc;
            }

            /**
             * D�finit la valeur de la propri�t� desc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesc(String value) {
                this.desc = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="SharePrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
     *                   &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
     *                   &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BondPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Yield" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="ISMAYield" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="YieldToMaturty" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="NetMargn" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="NetDuratn" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="NetModifDuratn" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="WeightdAvrgeLife" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="OutstdngAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
     *                   &lt;element name="AccredIntrstRate" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="TradeDateAccredIntrst" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="CumDvdndIndic" type="{}YesNoIndicator" minOccurs="0"/>
     *                   &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="MidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
     *                   &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
     *                   &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DebtPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Yield" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="ISMAYield" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="YieldToMaturty" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="NetMargn" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="NetDuratn" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="NetModifDuratn" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="WeightdAvrgeLife" type="{}DecimalNumber" minOccurs="0"/>
     *                   &lt;element name="OutstdngAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
     *                   &lt;element name="AccredIntrstRate" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="TradeDateAccredIntrst" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="CumDvdndIndic" type="{}YesNoIndicator" minOccurs="0"/>
     *                   &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="MidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
     *                   &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="CashBillRate" type="{}PercentageRate" minOccurs="0"/>
     *                   &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
     *                   &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OptFutPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AskPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="BidPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="HighPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="LowPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="OpeningPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="ClosngPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="IndctvePrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="SettlmntPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
     *                   &lt;element name="TradngOpenIntrst" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
     *                   &lt;element name="MarktOpenIntrst" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
     *                   &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
     *                   &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
     *                   &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IndexPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HighPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="LowPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="OpeningPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="ClosngPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="MarktPrice" type="{}Price" minOccurs="0"/>
     *                   &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sharePrice",
        "bondPrice",
        "debtPrice",
        "optFutPrice",
        "indexPrice"
    })
    public static class Mesure {

        @XmlElement(name = "SharePrice")
        protected QuotationType.Mesure.SharePrice sharePrice;
        @XmlElement(name = "BondPrice")
        protected QuotationType.Mesure.BondPrice bondPrice;
        @XmlElement(name = "DebtPrice")
        protected QuotationType.Mesure.DebtPrice debtPrice;
        @XmlElement(name = "OptFutPrice")
        protected QuotationType.Mesure.OptFutPrice optFutPrice;
        @XmlElement(name = "IndexPrice")
        protected QuotationType.Mesure.IndexPrice indexPrice;

        /**
         * Obtient la valeur de la propri�t� sharePrice.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Mesure.SharePrice }
         *     
         */
        public QuotationType.Mesure.SharePrice getSharePrice() {
            return sharePrice;
        }

        /**
         * D�finit la valeur de la propri�t� sharePrice.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Mesure.SharePrice }
         *     
         */
        public void setSharePrice(QuotationType.Mesure.SharePrice value) {
            this.sharePrice = value;
        }

        /**
         * Obtient la valeur de la propri�t� bondPrice.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Mesure.BondPrice }
         *     
         */
        public QuotationType.Mesure.BondPrice getBondPrice() {
            return bondPrice;
        }

        /**
         * D�finit la valeur de la propri�t� bondPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Mesure.BondPrice }
         *     
         */
        public void setBondPrice(QuotationType.Mesure.BondPrice value) {
            this.bondPrice = value;
        }

        /**
         * Obtient la valeur de la propri�t� debtPrice.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Mesure.DebtPrice }
         *     
         */
        public QuotationType.Mesure.DebtPrice getDebtPrice() {
            return debtPrice;
        }

        /**
         * D�finit la valeur de la propri�t� debtPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Mesure.DebtPrice }
         *     
         */
        public void setDebtPrice(QuotationType.Mesure.DebtPrice value) {
            this.debtPrice = value;
        }

        /**
         * Obtient la valeur de la propri�t� optFutPrice.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Mesure.OptFutPrice }
         *     
         */
        public QuotationType.Mesure.OptFutPrice getOptFutPrice() {
            return optFutPrice;
        }

        /**
         * D�finit la valeur de la propri�t� optFutPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Mesure.OptFutPrice }
         *     
         */
        public void setOptFutPrice(QuotationType.Mesure.OptFutPrice value) {
            this.optFutPrice = value;
        }

        /**
         * Obtient la valeur de la propri�t� indexPrice.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.Mesure.IndexPrice }
         *     
         */
        public QuotationType.Mesure.IndexPrice getIndexPrice() {
            return indexPrice;
        }

        /**
         * D�finit la valeur de la propri�t� indexPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.Mesure.IndexPrice }
         *     
         */
        public void setIndexPrice(QuotationType.Mesure.IndexPrice value) {
            this.indexPrice = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Yield" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="ISMAYield" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="YieldToMaturty" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="NetMargn" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="NetDuratn" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="NetModifDuratn" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="WeightdAvrgeLife" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="OutstdngAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
         *         &lt;element name="AccredIntrstRate" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="TradeDateAccredIntrst" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="CumDvdndIndic" type="{}YesNoIndicator" minOccurs="0"/>
         *         &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="MidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
         *         &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
         *         &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "yield",
            "ismaYield",
            "yieldToMaturty",
            "netMargn",
            "netDuratn",
            "netModifDuratn",
            "weightdAvrgeLife",
            "outstdngAmnt",
            "accredIntrstRate",
            "tradeDateAccredIntrst",
            "cumDvdndIndic",
            "askPrice",
            "bidPrice",
            "midPrice",
            "highPrice",
            "lowPrice",
            "openingPrice",
            "closngPrice",
            "indctvePrice",
            "tradePrice",
            "priceChnge",
            "trnvrQty",
            "trnvrAmnt",
            "bdfRefRate",
            "priceExprssn",
            "srceOfPrice"
        })
        public static class BondPrice {

            @XmlElement(name = "Yield")
            protected PercentageRate yield;
            @XmlElement(name = "ISMAYield")
            protected PercentageRate ismaYield;
            @XmlElement(name = "YieldToMaturty")
            protected PercentageRate yieldToMaturty;
            @XmlElement(name = "NetMargn")
            protected DecimalNumber netMargn;
            @XmlElement(name = "NetDuratn")
            protected DecimalNumber netDuratn;
            @XmlElement(name = "NetModifDuratn")
            protected DecimalNumber netModifDuratn;
            @XmlElement(name = "WeightdAvrgeLife")
            protected DecimalNumber weightdAvrgeLife;
            @XmlElement(name = "OutstdngAmnt")
            protected CurrencyAndAmount outstdngAmnt;
            @XmlElement(name = "AccredIntrstRate")
            protected PercentageRate accredIntrstRate;
            @XmlElement(name = "TradeDateAccredIntrst")
            protected PercentageRate tradeDateAccredIntrst;
            @XmlElement(name = "CumDvdndIndic")
            protected String cumDvdndIndic;
            @XmlElement(name = "AskPrice")
            protected List<Price> askPrice;
            @XmlElement(name = "BidPrice")
            protected List<Price> bidPrice;
            @XmlElement(name = "MidPrice")
            protected List<Price> midPrice;
            @XmlElement(name = "HighPrice")
            protected List<Price> highPrice;
            @XmlElement(name = "LowPrice")
            protected List<Price> lowPrice;
            @XmlElement(name = "OpeningPrice")
            protected List<Price> openingPrice;
            @XmlElement(name = "ClosngPrice")
            protected List<Price> closngPrice;
            @XmlElement(name = "IndctvePrice")
            protected List<Price> indctvePrice;
            @XmlElement(name = "TradePrice")
            protected List<Price> tradePrice;
            @XmlElement(name = "PriceChnge")
            protected BaseOneRate priceChnge;
            @XmlElement(name = "TrnvrQty")
            protected List<FinancialInstrumentQuantity> trnvrQty;
            @XmlElement(name = "TrnvrAmnt")
            protected CurrencyAndAmount trnvrAmnt;
            @XmlElement(name = "BDFRefRate")
            protected PercentageRate bdfRefRate;
            @XmlElement(name = "PriceExprssn")
            protected String priceExprssn;
            @XmlElement(name = "SrceOfPrice")
            protected IdentificationInformation srceOfPrice;

            /**
             * Obtient la valeur de la propri�t� yield.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getYield() {
                return yield;
            }

            /**
             * D�finit la valeur de la propri�t� yield.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setYield(PercentageRate value) {
                this.yield = value;
            }

            /**
             * Obtient la valeur de la propri�t� ismaYield.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getISMAYield() {
                return ismaYield;
            }

            /**
             * D�finit la valeur de la propri�t� ismaYield.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setISMAYield(PercentageRate value) {
                this.ismaYield = value;
            }

            /**
             * Obtient la valeur de la propri�t� yieldToMaturty.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getYieldToMaturty() {
                return yieldToMaturty;
            }

            /**
             * D�finit la valeur de la propri�t� yieldToMaturty.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setYieldToMaturty(PercentageRate value) {
                this.yieldToMaturty = value;
            }

            /**
             * Obtient la valeur de la propri�t� netMargn.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getNetMargn() {
                return netMargn;
            }

            /**
             * D�finit la valeur de la propri�t� netMargn.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setNetMargn(DecimalNumber value) {
                this.netMargn = value;
            }

            /**
             * Obtient la valeur de la propri�t� netDuratn.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getNetDuratn() {
                return netDuratn;
            }

            /**
             * D�finit la valeur de la propri�t� netDuratn.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setNetDuratn(DecimalNumber value) {
                this.netDuratn = value;
            }

            /**
             * Obtient la valeur de la propri�t� netModifDuratn.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getNetModifDuratn() {
                return netModifDuratn;
            }

            /**
             * D�finit la valeur de la propri�t� netModifDuratn.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setNetModifDuratn(DecimalNumber value) {
                this.netModifDuratn = value;
            }

            /**
             * Obtient la valeur de la propri�t� weightdAvrgeLife.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getWeightdAvrgeLife() {
                return weightdAvrgeLife;
            }

            /**
             * D�finit la valeur de la propri�t� weightdAvrgeLife.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setWeightdAvrgeLife(DecimalNumber value) {
                this.weightdAvrgeLife = value;
            }

            /**
             * Obtient la valeur de la propri�t� outstdngAmnt.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public CurrencyAndAmount getOutstdngAmnt() {
                return outstdngAmnt;
            }

            /**
             * D�finit la valeur de la propri�t� outstdngAmnt.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public void setOutstdngAmnt(CurrencyAndAmount value) {
                this.outstdngAmnt = value;
            }

            /**
             * Obtient la valeur de la propri�t� accredIntrstRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getAccredIntrstRate() {
                return accredIntrstRate;
            }

            /**
             * D�finit la valeur de la propri�t� accredIntrstRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setAccredIntrstRate(PercentageRate value) {
                this.accredIntrstRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� tradeDateAccredIntrst.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getTradeDateAccredIntrst() {
                return tradeDateAccredIntrst;
            }

            /**
             * D�finit la valeur de la propri�t� tradeDateAccredIntrst.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setTradeDateAccredIntrst(PercentageRate value) {
                this.tradeDateAccredIntrst = value;
            }

            /**
             * Obtient la valeur de la propri�t� cumDvdndIndic.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCumDvdndIndic() {
                return cumDvdndIndic;
            }

            /**
             * D�finit la valeur de la propri�t� cumDvdndIndic.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCumDvdndIndic(String value) {
                this.cumDvdndIndic = value;
            }

            /**
             * Gets the value of the askPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the askPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAskPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getAskPrice() {
                if (askPrice == null) {
                    askPrice = new ArrayList<Price>();
                }
                return this.askPrice;
            }

            /**
             * Gets the value of the bidPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bidPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBidPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getBidPrice() {
                if (bidPrice == null) {
                    bidPrice = new ArrayList<Price>();
                }
                return this.bidPrice;
            }

            /**
             * Gets the value of the midPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the midPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMidPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getMidPrice() {
                if (midPrice == null) {
                    midPrice = new ArrayList<Price>();
                }
                return this.midPrice;
            }

            /**
             * Gets the value of the highPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the highPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHighPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getHighPrice() {
                if (highPrice == null) {
                    highPrice = new ArrayList<Price>();
                }
                return this.highPrice;
            }

            /**
             * Gets the value of the lowPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lowPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLowPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getLowPrice() {
                if (lowPrice == null) {
                    lowPrice = new ArrayList<Price>();
                }
                return this.lowPrice;
            }

            /**
             * Gets the value of the openingPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the openingPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOpeningPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getOpeningPrice() {
                if (openingPrice == null) {
                    openingPrice = new ArrayList<Price>();
                }
                return this.openingPrice;
            }

            /**
             * Gets the value of the closngPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the closngPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClosngPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getClosngPrice() {
                if (closngPrice == null) {
                    closngPrice = new ArrayList<Price>();
                }
                return this.closngPrice;
            }

            /**
             * Gets the value of the indctvePrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the indctvePrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndctvePrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getIndctvePrice() {
                if (indctvePrice == null) {
                    indctvePrice = new ArrayList<Price>();
                }
                return this.indctvePrice;
            }

            /**
             * Gets the value of the tradePrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tradePrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTradePrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getTradePrice() {
                if (tradePrice == null) {
                    tradePrice = new ArrayList<Price>();
                }
                return this.tradePrice;
            }

            /**
             * Obtient la valeur de la propri�t� priceChnge.
             * 
             * @return
             *     possible object is
             *     {@link BaseOneRate }
             *     
             */
            public BaseOneRate getPriceChnge() {
                return priceChnge;
            }

            /**
             * D�finit la valeur de la propri�t� priceChnge.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseOneRate }
             *     
             */
            public void setPriceChnge(BaseOneRate value) {
                this.priceChnge = value;
            }

            /**
             * Gets the value of the trnvrQty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trnvrQty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrnvrQty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FinancialInstrumentQuantity }
             * 
             * 
             */
            public List<FinancialInstrumentQuantity> getTrnvrQty() {
                if (trnvrQty == null) {
                    trnvrQty = new ArrayList<FinancialInstrumentQuantity>();
                }
                return this.trnvrQty;
            }

            /**
             * Obtient la valeur de la propri�t� trnvrAmnt.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public CurrencyAndAmount getTrnvrAmnt() {
                return trnvrAmnt;
            }

            /**
             * D�finit la valeur de la propri�t� trnvrAmnt.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public void setTrnvrAmnt(CurrencyAndAmount value) {
                this.trnvrAmnt = value;
            }

            /**
             * Obtient la valeur de la propri�t� bdfRefRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getBDFRefRate() {
                return bdfRefRate;
            }

            /**
             * D�finit la valeur de la propri�t� bdfRefRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setBDFRefRate(PercentageRate value) {
                this.bdfRefRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� priceExprssn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceExprssn() {
                return priceExprssn;
            }

            /**
             * D�finit la valeur de la propri�t� priceExprssn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceExprssn(String value) {
                this.priceExprssn = value;
            }

            /**
             * Obtient la valeur de la propri�t� srceOfPrice.
             * 
             * @return
             *     possible object is
             *     {@link IdentificationInformation }
             *     
             */
            public IdentificationInformation getSrceOfPrice() {
                return srceOfPrice;
            }

            /**
             * D�finit la valeur de la propri�t� srceOfPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link IdentificationInformation }
             *     
             */
            public void setSrceOfPrice(IdentificationInformation value) {
                this.srceOfPrice = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Yield" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="ISMAYield" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="YieldToMaturty" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="NetMargn" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="NetDuratn" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="NetModifDuratn" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="WeightdAvrgeLife" type="{}DecimalNumber" minOccurs="0"/>
         *         &lt;element name="OutstdngAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
         *         &lt;element name="AccredIntrstRate" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="TradeDateAccredIntrst" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="CumDvdndIndic" type="{}YesNoIndicator" minOccurs="0"/>
         *         &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="MidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
         *         &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="CashBillRate" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
         *         &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "yield",
            "ismaYield",
            "yieldToMaturty",
            "netMargn",
            "netDuratn",
            "netModifDuratn",
            "weightdAvrgeLife",
            "outstdngAmnt",
            "accredIntrstRate",
            "tradeDateAccredIntrst",
            "cumDvdndIndic",
            "askPrice",
            "bidPrice",
            "midPrice",
            "highPrice",
            "lowPrice",
            "openingPrice",
            "closngPrice",
            "indctvePrice",
            "tradePrice",
            "priceChnge",
            "trnvrQty",
            "trnvrAmnt",
            "bdfRefRate",
            "cashBillRate",
            "priceExprssn",
            "srceOfPrice"
        })
        public static class DebtPrice {

            @XmlElement(name = "Yield")
            protected PercentageRate yield;
            @XmlElement(name = "ISMAYield")
            protected PercentageRate ismaYield;
            @XmlElement(name = "YieldToMaturty")
            protected PercentageRate yieldToMaturty;
            @XmlElement(name = "NetMargn")
            protected DecimalNumber netMargn;
            @XmlElement(name = "NetDuratn")
            protected DecimalNumber netDuratn;
            @XmlElement(name = "NetModifDuratn")
            protected DecimalNumber netModifDuratn;
            @XmlElement(name = "WeightdAvrgeLife")
            protected DecimalNumber weightdAvrgeLife;
            @XmlElement(name = "OutstdngAmnt")
            protected CurrencyAndAmount outstdngAmnt;
            @XmlElement(name = "AccredIntrstRate")
            protected PercentageRate accredIntrstRate;
            @XmlElement(name = "TradeDateAccredIntrst")
            protected PercentageRate tradeDateAccredIntrst;
            @XmlElement(name = "CumDvdndIndic")
            protected String cumDvdndIndic;
            @XmlElement(name = "AskPrice")
            protected List<Price> askPrice;
            @XmlElement(name = "BidPrice")
            protected List<Price> bidPrice;
            @XmlElement(name = "MidPrice")
            protected List<Price> midPrice;
            @XmlElement(name = "HighPrice")
            protected List<Price> highPrice;
            @XmlElement(name = "LowPrice")
            protected List<Price> lowPrice;
            @XmlElement(name = "OpeningPrice")
            protected List<Price> openingPrice;
            @XmlElement(name = "ClosngPrice")
            protected List<Price> closngPrice;
            @XmlElement(name = "IndctvePrice")
            protected List<Price> indctvePrice;
            @XmlElement(name = "TradePrice")
            protected List<Price> tradePrice;
            @XmlElement(name = "PriceChnge")
            protected BaseOneRate priceChnge;
            @XmlElement(name = "TrnvrQty")
            protected List<FinancialInstrumentQuantity> trnvrQty;
            @XmlElement(name = "TrnvrAmnt")
            protected CurrencyAndAmount trnvrAmnt;
            @XmlElement(name = "BDFRefRate")
            protected PercentageRate bdfRefRate;
            @XmlElement(name = "CashBillRate")
            protected PercentageRate cashBillRate;
            @XmlElement(name = "PriceExprssn")
            protected String priceExprssn;
            @XmlElement(name = "SrceOfPrice")
            protected IdentificationInformation srceOfPrice;

            /**
             * Obtient la valeur de la propri�t� yield.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getYield() {
                return yield;
            }

            /**
             * D�finit la valeur de la propri�t� yield.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setYield(PercentageRate value) {
                this.yield = value;
            }

            /**
             * Obtient la valeur de la propri�t� ismaYield.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getISMAYield() {
                return ismaYield;
            }

            /**
             * D�finit la valeur de la propri�t� ismaYield.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setISMAYield(PercentageRate value) {
                this.ismaYield = value;
            }

            /**
             * Obtient la valeur de la propri�t� yieldToMaturty.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getYieldToMaturty() {
                return yieldToMaturty;
            }

            /**
             * D�finit la valeur de la propri�t� yieldToMaturty.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setYieldToMaturty(PercentageRate value) {
                this.yieldToMaturty = value;
            }

            /**
             * Obtient la valeur de la propri�t� netMargn.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getNetMargn() {
                return netMargn;
            }

            /**
             * D�finit la valeur de la propri�t� netMargn.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setNetMargn(DecimalNumber value) {
                this.netMargn = value;
            }

            /**
             * Obtient la valeur de la propri�t� netDuratn.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getNetDuratn() {
                return netDuratn;
            }

            /**
             * D�finit la valeur de la propri�t� netDuratn.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setNetDuratn(DecimalNumber value) {
                this.netDuratn = value;
            }

            /**
             * Obtient la valeur de la propri�t� netModifDuratn.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getNetModifDuratn() {
                return netModifDuratn;
            }

            /**
             * D�finit la valeur de la propri�t� netModifDuratn.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setNetModifDuratn(DecimalNumber value) {
                this.netModifDuratn = value;
            }

            /**
             * Obtient la valeur de la propri�t� weightdAvrgeLife.
             * 
             * @return
             *     possible object is
             *     {@link DecimalNumber }
             *     
             */
            public DecimalNumber getWeightdAvrgeLife() {
                return weightdAvrgeLife;
            }

            /**
             * D�finit la valeur de la propri�t� weightdAvrgeLife.
             * 
             * @param value
             *     allowed object is
             *     {@link DecimalNumber }
             *     
             */
            public void setWeightdAvrgeLife(DecimalNumber value) {
                this.weightdAvrgeLife = value;
            }

            /**
             * Obtient la valeur de la propri�t� outstdngAmnt.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public CurrencyAndAmount getOutstdngAmnt() {
                return outstdngAmnt;
            }

            /**
             * D�finit la valeur de la propri�t� outstdngAmnt.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public void setOutstdngAmnt(CurrencyAndAmount value) {
                this.outstdngAmnt = value;
            }

            /**
             * Obtient la valeur de la propri�t� accredIntrstRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getAccredIntrstRate() {
                return accredIntrstRate;
            }

            /**
             * D�finit la valeur de la propri�t� accredIntrstRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setAccredIntrstRate(PercentageRate value) {
                this.accredIntrstRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� tradeDateAccredIntrst.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getTradeDateAccredIntrst() {
                return tradeDateAccredIntrst;
            }

            /**
             * D�finit la valeur de la propri�t� tradeDateAccredIntrst.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setTradeDateAccredIntrst(PercentageRate value) {
                this.tradeDateAccredIntrst = value;
            }

            /**
             * Obtient la valeur de la propri�t� cumDvdndIndic.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCumDvdndIndic() {
                return cumDvdndIndic;
            }

            /**
             * D�finit la valeur de la propri�t� cumDvdndIndic.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCumDvdndIndic(String value) {
                this.cumDvdndIndic = value;
            }

            /**
             * Gets the value of the askPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the askPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAskPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getAskPrice() {
                if (askPrice == null) {
                    askPrice = new ArrayList<Price>();
                }
                return this.askPrice;
            }

            /**
             * Gets the value of the bidPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bidPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBidPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getBidPrice() {
                if (bidPrice == null) {
                    bidPrice = new ArrayList<Price>();
                }
                return this.bidPrice;
            }

            /**
             * Gets the value of the midPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the midPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMidPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getMidPrice() {
                if (midPrice == null) {
                    midPrice = new ArrayList<Price>();
                }
                return this.midPrice;
            }

            /**
             * Gets the value of the highPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the highPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHighPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getHighPrice() {
                if (highPrice == null) {
                    highPrice = new ArrayList<Price>();
                }
                return this.highPrice;
            }

            /**
             * Gets the value of the lowPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lowPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLowPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getLowPrice() {
                if (lowPrice == null) {
                    lowPrice = new ArrayList<Price>();
                }
                return this.lowPrice;
            }

            /**
             * Gets the value of the openingPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the openingPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOpeningPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getOpeningPrice() {
                if (openingPrice == null) {
                    openingPrice = new ArrayList<Price>();
                }
                return this.openingPrice;
            }

            /**
             * Gets the value of the closngPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the closngPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClosngPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getClosngPrice() {
                if (closngPrice == null) {
                    closngPrice = new ArrayList<Price>();
                }
                return this.closngPrice;
            }

            /**
             * Gets the value of the indctvePrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the indctvePrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndctvePrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getIndctvePrice() {
                if (indctvePrice == null) {
                    indctvePrice = new ArrayList<Price>();
                }
                return this.indctvePrice;
            }

            /**
             * Gets the value of the tradePrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tradePrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTradePrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getTradePrice() {
                if (tradePrice == null) {
                    tradePrice = new ArrayList<Price>();
                }
                return this.tradePrice;
            }

            /**
             * Obtient la valeur de la propri�t� priceChnge.
             * 
             * @return
             *     possible object is
             *     {@link BaseOneRate }
             *     
             */
            public BaseOneRate getPriceChnge() {
                return priceChnge;
            }

            /**
             * D�finit la valeur de la propri�t� priceChnge.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseOneRate }
             *     
             */
            public void setPriceChnge(BaseOneRate value) {
                this.priceChnge = value;
            }

            /**
             * Gets the value of the trnvrQty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trnvrQty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrnvrQty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FinancialInstrumentQuantity }
             * 
             * 
             */
            public List<FinancialInstrumentQuantity> getTrnvrQty() {
                if (trnvrQty == null) {
                    trnvrQty = new ArrayList<FinancialInstrumentQuantity>();
                }
                return this.trnvrQty;
            }

            /**
             * Obtient la valeur de la propri�t� trnvrAmnt.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public CurrencyAndAmount getTrnvrAmnt() {
                return trnvrAmnt;
            }

            /**
             * D�finit la valeur de la propri�t� trnvrAmnt.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public void setTrnvrAmnt(CurrencyAndAmount value) {
                this.trnvrAmnt = value;
            }

            /**
             * Obtient la valeur de la propri�t� bdfRefRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getBDFRefRate() {
                return bdfRefRate;
            }

            /**
             * D�finit la valeur de la propri�t� bdfRefRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setBDFRefRate(PercentageRate value) {
                this.bdfRefRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� cashBillRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getCashBillRate() {
                return cashBillRate;
            }

            /**
             * D�finit la valeur de la propri�t� cashBillRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setCashBillRate(PercentageRate value) {
                this.cashBillRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� priceExprssn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceExprssn() {
                return priceExprssn;
            }

            /**
             * D�finit la valeur de la propri�t� priceExprssn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceExprssn(String value) {
                this.priceExprssn = value;
            }

            /**
             * Obtient la valeur de la propri�t� srceOfPrice.
             * 
             * @return
             *     possible object is
             *     {@link IdentificationInformation }
             *     
             */
            public IdentificationInformation getSrceOfPrice() {
                return srceOfPrice;
            }

            /**
             * D�finit la valeur de la propri�t� srceOfPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link IdentificationInformation }
             *     
             */
            public void setSrceOfPrice(IdentificationInformation value) {
                this.srceOfPrice = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="HighPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="LowPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="OpeningPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="ClosngPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="MarktPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "highPrice",
            "lowPrice",
            "openingPrice",
            "closngPrice",
            "marktPrice",
            "priceChnge"
        })
        public static class IndexPrice {

            @XmlElement(name = "HighPrice")
            protected Price highPrice;
            @XmlElement(name = "LowPrice")
            protected Price lowPrice;
            @XmlElement(name = "OpeningPrice")
            protected Price openingPrice;
            @XmlElement(name = "ClosngPrice")
            protected Price closngPrice;
            @XmlElement(name = "MarktPrice")
            protected Price marktPrice;
            @XmlElement(name = "PriceChnge")
            protected BaseOneRate priceChnge;

            /**
             * Obtient la valeur de la propri�t� highPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getHighPrice() {
                return highPrice;
            }

            /**
             * D�finit la valeur de la propri�t� highPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setHighPrice(Price value) {
                this.highPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� lowPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getLowPrice() {
                return lowPrice;
            }

            /**
             * D�finit la valeur de la propri�t� lowPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setLowPrice(Price value) {
                this.lowPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� openingPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getOpeningPrice() {
                return openingPrice;
            }

            /**
             * D�finit la valeur de la propri�t� openingPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setOpeningPrice(Price value) {
                this.openingPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� closngPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getClosngPrice() {
                return closngPrice;
            }

            /**
             * D�finit la valeur de la propri�t� closngPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setClosngPrice(Price value) {
                this.closngPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� marktPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getMarktPrice() {
                return marktPrice;
            }

            /**
             * D�finit la valeur de la propri�t� marktPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setMarktPrice(Price value) {
                this.marktPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� priceChnge.
             * 
             * @return
             *     possible object is
             *     {@link BaseOneRate }
             *     
             */
            public BaseOneRate getPriceChnge() {
                return priceChnge;
            }

            /**
             * D�finit la valeur de la propri�t� priceChnge.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseOneRate }
             *     
             */
            public void setPriceChnge(BaseOneRate value) {
                this.priceChnge = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AskPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="BidPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="HighPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="LowPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="OpeningPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="ClosngPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="IndctvePrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="SettlmntPrice" type="{}Price" minOccurs="0"/>
         *         &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="TradngOpenIntrst" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
         *         &lt;element name="MarktOpenIntrst" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
         *         &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" minOccurs="0"/>
         *         &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
         *         &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "askPrice",
            "bidPrice",
            "highPrice",
            "lowPrice",
            "openingPrice",
            "closngPrice",
            "indctvePrice",
            "settlmntPrice",
            "priceChnge",
            "tradngOpenIntrst",
            "marktOpenIntrst",
            "trnvrQty",
            "trnvrAmnt",
            "bdfRefRate"
        })
        public static class OptFutPrice {

            @XmlElement(name = "AskPrice")
            protected Price askPrice;
            @XmlElement(name = "BidPrice")
            protected Price bidPrice;
            @XmlElement(name = "HighPrice")
            protected Price highPrice;
            @XmlElement(name = "LowPrice")
            protected Price lowPrice;
            @XmlElement(name = "OpeningPrice")
            protected Price openingPrice;
            @XmlElement(name = "ClosngPrice")
            protected Price closngPrice;
            @XmlElement(name = "IndctvePrice")
            protected Price indctvePrice;
            @XmlElement(name = "SettlmntPrice")
            protected Price settlmntPrice;
            @XmlElement(name = "PriceChnge")
            protected BaseOneRate priceChnge;
            @XmlElement(name = "TradngOpenIntrst")
            protected FinancialInstrumentQuantity tradngOpenIntrst;
            @XmlElement(name = "MarktOpenIntrst")
            protected FinancialInstrumentQuantity marktOpenIntrst;
            @XmlElement(name = "TrnvrQty")
            protected FinancialInstrumentQuantity trnvrQty;
            @XmlElement(name = "TrnvrAmnt")
            protected CurrencyAndAmount trnvrAmnt;
            @XmlElement(name = "BDFRefRate")
            protected PercentageRate bdfRefRate;

            /**
             * Obtient la valeur de la propri�t� askPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getAskPrice() {
                return askPrice;
            }

            /**
             * D�finit la valeur de la propri�t� askPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setAskPrice(Price value) {
                this.askPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� bidPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getBidPrice() {
                return bidPrice;
            }

            /**
             * D�finit la valeur de la propri�t� bidPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setBidPrice(Price value) {
                this.bidPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� highPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getHighPrice() {
                return highPrice;
            }

            /**
             * D�finit la valeur de la propri�t� highPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setHighPrice(Price value) {
                this.highPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� lowPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getLowPrice() {
                return lowPrice;
            }

            /**
             * D�finit la valeur de la propri�t� lowPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setLowPrice(Price value) {
                this.lowPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� openingPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getOpeningPrice() {
                return openingPrice;
            }

            /**
             * D�finit la valeur de la propri�t� openingPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setOpeningPrice(Price value) {
                this.openingPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� closngPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getClosngPrice() {
                return closngPrice;
            }

            /**
             * D�finit la valeur de la propri�t� closngPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setClosngPrice(Price value) {
                this.closngPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� indctvePrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getIndctvePrice() {
                return indctvePrice;
            }

            /**
             * D�finit la valeur de la propri�t� indctvePrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setIndctvePrice(Price value) {
                this.indctvePrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� settlmntPrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getSettlmntPrice() {
                return settlmntPrice;
            }

            /**
             * D�finit la valeur de la propri�t� settlmntPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setSettlmntPrice(Price value) {
                this.settlmntPrice = value;
            }

            /**
             * Obtient la valeur de la propri�t� priceChnge.
             * 
             * @return
             *     possible object is
             *     {@link BaseOneRate }
             *     
             */
            public BaseOneRate getPriceChnge() {
                return priceChnge;
            }

            /**
             * D�finit la valeur de la propri�t� priceChnge.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseOneRate }
             *     
             */
            public void setPriceChnge(BaseOneRate value) {
                this.priceChnge = value;
            }

            /**
             * Obtient la valeur de la propri�t� tradngOpenIntrst.
             * 
             * @return
             *     possible object is
             *     {@link FinancialInstrumentQuantity }
             *     
             */
            public FinancialInstrumentQuantity getTradngOpenIntrst() {
                return tradngOpenIntrst;
            }

            /**
             * D�finit la valeur de la propri�t� tradngOpenIntrst.
             * 
             * @param value
             *     allowed object is
             *     {@link FinancialInstrumentQuantity }
             *     
             */
            public void setTradngOpenIntrst(FinancialInstrumentQuantity value) {
                this.tradngOpenIntrst = value;
            }

            /**
             * Obtient la valeur de la propri�t� marktOpenIntrst.
             * 
             * @return
             *     possible object is
             *     {@link FinancialInstrumentQuantity }
             *     
             */
            public FinancialInstrumentQuantity getMarktOpenIntrst() {
                return marktOpenIntrst;
            }

            /**
             * D�finit la valeur de la propri�t� marktOpenIntrst.
             * 
             * @param value
             *     allowed object is
             *     {@link FinancialInstrumentQuantity }
             *     
             */
            public void setMarktOpenIntrst(FinancialInstrumentQuantity value) {
                this.marktOpenIntrst = value;
            }

            /**
             * Obtient la valeur de la propri�t� trnvrQty.
             * 
             * @return
             *     possible object is
             *     {@link FinancialInstrumentQuantity }
             *     
             */
            public FinancialInstrumentQuantity getTrnvrQty() {
                return trnvrQty;
            }

            /**
             * D�finit la valeur de la propri�t� trnvrQty.
             * 
             * @param value
             *     allowed object is
             *     {@link FinancialInstrumentQuantity }
             *     
             */
            public void setTrnvrQty(FinancialInstrumentQuantity value) {
                this.trnvrQty = value;
            }

            /**
             * Obtient la valeur de la propri�t� trnvrAmnt.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public CurrencyAndAmount getTrnvrAmnt() {
                return trnvrAmnt;
            }

            /**
             * D�finit la valeur de la propri�t� trnvrAmnt.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public void setTrnvrAmnt(CurrencyAndAmount value) {
                this.trnvrAmnt = value;
            }

            /**
             * Obtient la valeur de la propri�t� bdfRefRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getBDFRefRate() {
                return bdfRefRate;
            }

            /**
             * D�finit la valeur de la propri�t� bdfRefRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setBDFRefRate(PercentageRate value) {
                this.bdfRefRate = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AskPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="BidPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="HighPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="LowPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="OpeningPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ClosngPrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="IndctvePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TradePrice" type="{}Price" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="PriceChnge" type="{}BaseOneRate" minOccurs="0"/>
         *         &lt;element name="TrnvrQty" type="{}FinancialInstrumentQuantity" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TrnvrAmnt" type="{}CurrencyAndAmount" minOccurs="0"/>
         *         &lt;element name="BDFRefRate" type="{}PercentageRate" minOccurs="0"/>
         *         &lt;element name="PriceExprssn" type="{}PriceExpressionCode" minOccurs="0"/>
         *         &lt;element name="SrceOfPrice" type="{}IdentificationInformation" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "askPrice",
            "bidPrice",
            "highPrice",
            "lowPrice",
            "openingPrice",
            "closngPrice",
            "indctvePrice",
            "tradePrice",
            "priceChnge",
            "trnvrQty",
            "trnvrAmnt",
            "bdfRefRate",
            "priceExprssn",
            "srceOfPrice"
        })
        public static class SharePrice {

            @XmlElement(name = "AskPrice")
            protected List<Price> askPrice;
            @XmlElement(name = "BidPrice")
            protected List<Price> bidPrice;
            @XmlElement(name = "HighPrice")
            protected List<Price> highPrice;
            @XmlElement(name = "LowPrice")
            protected List<Price> lowPrice;
            @XmlElement(name = "OpeningPrice")
            protected List<Price> openingPrice;
            @XmlElement(name = "ClosngPrice")
            protected List<Price> closngPrice;
            @XmlElement(name = "IndctvePrice")
            protected List<Price> indctvePrice;
            @XmlElement(name = "TradePrice")
            protected List<Price> tradePrice;
            @XmlElement(name = "PriceChnge")
            protected BaseOneRate priceChnge;
            @XmlElement(name = "TrnvrQty")
            protected List<FinancialInstrumentQuantity> trnvrQty;
            @XmlElement(name = "TrnvrAmnt")
            protected CurrencyAndAmount trnvrAmnt;
            @XmlElement(name = "BDFRefRate")
            protected PercentageRate bdfRefRate;
            @XmlElement(name = "PriceExprssn")
            protected String priceExprssn;
            @XmlElement(name = "SrceOfPrice")
            protected IdentificationInformation srceOfPrice;

            /**
             * Gets the value of the askPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the askPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAskPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getAskPrice() {
                if (askPrice == null) {
                    askPrice = new ArrayList<Price>();
                }
                return this.askPrice;
            }

            /**
             * Gets the value of the bidPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bidPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBidPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getBidPrice() {
                if (bidPrice == null) {
                    bidPrice = new ArrayList<Price>();
                }
                return this.bidPrice;
            }

            /**
             * Gets the value of the highPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the highPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHighPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getHighPrice() {
                if (highPrice == null) {
                    highPrice = new ArrayList<Price>();
                }
                return this.highPrice;
            }

            /**
             * Gets the value of the lowPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lowPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLowPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getLowPrice() {
                if (lowPrice == null) {
                    lowPrice = new ArrayList<Price>();
                }
                return this.lowPrice;
            }

            /**
             * Gets the value of the openingPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the openingPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOpeningPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getOpeningPrice() {
                if (openingPrice == null) {
                    openingPrice = new ArrayList<Price>();
                }
                return this.openingPrice;
            }

            /**
             * Gets the value of the closngPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the closngPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClosngPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getClosngPrice() {
                if (closngPrice == null) {
                    closngPrice = new ArrayList<Price>();
                }
                return this.closngPrice;
            }

            /**
             * Gets the value of the indctvePrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the indctvePrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndctvePrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getIndctvePrice() {
                if (indctvePrice == null) {
                    indctvePrice = new ArrayList<Price>();
                }
                return this.indctvePrice;
            }

            /**
             * Gets the value of the tradePrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tradePrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTradePrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Price }
             * 
             * 
             */
            public List<Price> getTradePrice() {
                if (tradePrice == null) {
                    tradePrice = new ArrayList<Price>();
                }
                return this.tradePrice;
            }

            /**
             * Obtient la valeur de la propri�t� priceChnge.
             * 
             * @return
             *     possible object is
             *     {@link BaseOneRate }
             *     
             */
            public BaseOneRate getPriceChnge() {
                return priceChnge;
            }

            /**
             * D�finit la valeur de la propri�t� priceChnge.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseOneRate }
             *     
             */
            public void setPriceChnge(BaseOneRate value) {
                this.priceChnge = value;
            }

            /**
             * Gets the value of the trnvrQty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trnvrQty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrnvrQty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FinancialInstrumentQuantity }
             * 
             * 
             */
            public List<FinancialInstrumentQuantity> getTrnvrQty() {
                if (trnvrQty == null) {
                    trnvrQty = new ArrayList<FinancialInstrumentQuantity>();
                }
                return this.trnvrQty;
            }

            /**
             * Obtient la valeur de la propri�t� trnvrAmnt.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public CurrencyAndAmount getTrnvrAmnt() {
                return trnvrAmnt;
            }

            /**
             * D�finit la valeur de la propri�t� trnvrAmnt.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAndAmount }
             *     
             */
            public void setTrnvrAmnt(CurrencyAndAmount value) {
                this.trnvrAmnt = value;
            }

            /**
             * Obtient la valeur de la propri�t� bdfRefRate.
             * 
             * @return
             *     possible object is
             *     {@link PercentageRate }
             *     
             */
            public PercentageRate getBDFRefRate() {
                return bdfRefRate;
            }

            /**
             * D�finit la valeur de la propri�t� bdfRefRate.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentageRate }
             *     
             */
            public void setBDFRefRate(PercentageRate value) {
                this.bdfRefRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� priceExprssn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceExprssn() {
                return priceExprssn;
            }

            /**
             * D�finit la valeur de la propri�t� priceExprssn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceExprssn(String value) {
                this.priceExprssn = value;
            }

            /**
             * Obtient la valeur de la propri�t� srceOfPrice.
             * 
             * @return
             *     possible object is
             *     {@link IdentificationInformation }
             *     
             */
            public IdentificationInformation getSrceOfPrice() {
                return srceOfPrice;
            }

            /**
             * D�finit la valeur de la propri�t� srceOfPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link IdentificationInformation }
             *     
             */
            public void setSrceOfPrice(IdentificationInformation value) {
                this.srceOfPrice = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DataProvdr" type="{}ProviderCode"/>
     *         &lt;element name="ProvdrTimeStamp" type="{}ISODateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataProvdr",
        "provdrTimeStamp"
    })
    public static class Provdr {

        @XmlElement(name = "DataProvdr", required = true)
        protected String dataProvdr;
        @XmlElement(name = "ProvdrTimeStamp", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar provdrTimeStamp;

        /**
         * Obtient la valeur de la propri�t� dataProvdr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataProvdr() {
            return dataProvdr;
        }

        /**
         * D�finit la valeur de la propri�t� dataProvdr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataProvdr(String value) {
            this.dataProvdr = value;
        }

        /**
         * Obtient la valeur de la propri�t� provdrTimeStamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProvdrTimeStamp() {
            return provdrTimeStamp;
        }

        /**
         * D�finit la valeur de la propri�t� provdrTimeStamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setProvdrTimeStamp(XMLGregorianCalendar value) {
            this.provdrTimeStamp = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="SecurtyIdntfctn">
     *               &lt;complexType>
     *                 &lt;complexContent>
     *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     &lt;sequence>
     *                       &lt;element name="ISIN" type="{}ISINIdentifier" minOccurs="0"/>
     *                       &lt;element name="OthrIdntfctn" type="{}AlternateFinancialInstrumentIdentification" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;/sequence>
     *                   &lt;/restriction>
     *                 &lt;/complexContent>
     *               &lt;/complexType>
     *             &lt;/element>
     *             &lt;element name="PlaceOfListng" type="{}MICIdentifier" minOccurs="0"/>
     *           &lt;/sequence>
     *           &lt;element name="FutIdntfctn">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="MarktIdntfctn" type="{}MICIdentifier"/>
     *                     &lt;element name="CntrctName" type="{}Name"/>
     *                     &lt;element name="ExpiryDate" type="{}ISODateTime"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="OptIdntfctn">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="MarktIdntfctn" type="{}MICIdentifier"/>
     *                     &lt;element name="CntrctName" type="{}Name"/>
     *                     &lt;element name="CntrctVrsNumb">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="3"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ExpiryDate" type="{}ISODateTime"/>
     *                     &lt;element name="OptType" type="{}OptionTypeCode"/>
     *                     &lt;element name="ExrcisePrice" type="{}Price"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="ValdtyDate" type="{}ISODate"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "securtyIdntfctn",
        "placeOfListng",
        "futIdntfctn",
        "optIdntfctn",
        "valdtyDate"
    })
    public static class QuotatnIdntfctn {

        @XmlElement(name = "SecurtyIdntfctn")
        protected QuotationType.QuotatnIdntfctn.SecurtyIdntfctn securtyIdntfctn;
        @XmlElement(name = "PlaceOfListng")
        protected String placeOfListng;
        @XmlElement(name = "FutIdntfctn")
        protected QuotationType.QuotatnIdntfctn.FutIdntfctn futIdntfctn;
        @XmlElement(name = "OptIdntfctn")
        protected QuotationType.QuotatnIdntfctn.OptIdntfctn optIdntfctn;
        @XmlElement(name = "ValdtyDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valdtyDate;

        /**
         * Obtient la valeur de la propri�t� securtyIdntfctn.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.QuotatnIdntfctn.SecurtyIdntfctn }
         *     
         */
        public QuotationType.QuotatnIdntfctn.SecurtyIdntfctn getSecurtyIdntfctn() {
            return securtyIdntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� securtyIdntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.QuotatnIdntfctn.SecurtyIdntfctn }
         *     
         */
        public void setSecurtyIdntfctn(QuotationType.QuotatnIdntfctn.SecurtyIdntfctn value) {
            this.securtyIdntfctn = value;
        }

        /**
         * Obtient la valeur de la propri�t� placeOfListng.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceOfListng() {
            return placeOfListng;
        }

        /**
         * D�finit la valeur de la propri�t� placeOfListng.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceOfListng(String value) {
            this.placeOfListng = value;
        }

        /**
         * Obtient la valeur de la propri�t� futIdntfctn.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.QuotatnIdntfctn.FutIdntfctn }
         *     
         */
        public QuotationType.QuotatnIdntfctn.FutIdntfctn getFutIdntfctn() {
            return futIdntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� futIdntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.QuotatnIdntfctn.FutIdntfctn }
         *     
         */
        public void setFutIdntfctn(QuotationType.QuotatnIdntfctn.FutIdntfctn value) {
            this.futIdntfctn = value;
        }

        /**
         * Obtient la valeur de la propri�t� optIdntfctn.
         * 
         * @return
         *     possible object is
         *     {@link QuotationType.QuotatnIdntfctn.OptIdntfctn }
         *     
         */
        public QuotationType.QuotatnIdntfctn.OptIdntfctn getOptIdntfctn() {
            return optIdntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� optIdntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link QuotationType.QuotatnIdntfctn.OptIdntfctn }
         *     
         */
        public void setOptIdntfctn(QuotationType.QuotatnIdntfctn.OptIdntfctn value) {
            this.optIdntfctn = value;
        }

        /**
         * Obtient la valeur de la propri�t� valdtyDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValdtyDate() {
            return valdtyDate;
        }

        /**
         * D�finit la valeur de la propri�t� valdtyDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValdtyDate(XMLGregorianCalendar value) {
            this.valdtyDate = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MarktIdntfctn" type="{}MICIdentifier"/>
         *         &lt;element name="CntrctName" type="{}Name"/>
         *         &lt;element name="ExpiryDate" type="{}ISODateTime"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "marktIdntfctn",
            "cntrctName",
            "expiryDate"
        })
        public static class FutIdntfctn {

            @XmlElement(name = "MarktIdntfctn", required = true)
            protected String marktIdntfctn;
            @XmlElement(name = "CntrctName", required = true)
            protected String cntrctName;
            @XmlElement(name = "ExpiryDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar expiryDate;

            /**
             * Obtient la valeur de la propri�t� marktIdntfctn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarktIdntfctn() {
                return marktIdntfctn;
            }

            /**
             * D�finit la valeur de la propri�t� marktIdntfctn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarktIdntfctn(String value) {
                this.marktIdntfctn = value;
            }

            /**
             * Obtient la valeur de la propri�t� cntrctName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCntrctName() {
                return cntrctName;
            }

            /**
             * D�finit la valeur de la propri�t� cntrctName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCntrctName(String value) {
                this.cntrctName = value;
            }

            /**
             * Obtient la valeur de la propri�t� expiryDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpiryDate() {
                return expiryDate;
            }

            /**
             * D�finit la valeur de la propri�t� expiryDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpiryDate(XMLGregorianCalendar value) {
                this.expiryDate = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MarktIdntfctn" type="{}MICIdentifier"/>
         *         &lt;element name="CntrctName" type="{}Name"/>
         *         &lt;element name="CntrctVrsNumb">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExpiryDate" type="{}ISODateTime"/>
         *         &lt;element name="OptType" type="{}OptionTypeCode"/>
         *         &lt;element name="ExrcisePrice" type="{}Price"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "marktIdntfctn",
            "cntrctName",
            "cntrctVrsNumb",
            "expiryDate",
            "optType",
            "exrcisePrice"
        })
        public static class OptIdntfctn {

            @XmlElement(name = "MarktIdntfctn", required = true)
            protected String marktIdntfctn;
            @XmlElement(name = "CntrctName", required = true)
            protected String cntrctName;
            @XmlElement(name = "CntrctVrsNumb", required = true)
            protected String cntrctVrsNumb;
            @XmlElement(name = "ExpiryDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar expiryDate;
            @XmlElement(name = "OptType", required = true)
            protected String optType;
            @XmlElement(name = "ExrcisePrice", required = true)
            protected Price exrcisePrice;

            /**
             * Obtient la valeur de la propri�t� marktIdntfctn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarktIdntfctn() {
                return marktIdntfctn;
            }

            /**
             * D�finit la valeur de la propri�t� marktIdntfctn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarktIdntfctn(String value) {
                this.marktIdntfctn = value;
            }

            /**
             * Obtient la valeur de la propri�t� cntrctName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCntrctName() {
                return cntrctName;
            }

            /**
             * D�finit la valeur de la propri�t� cntrctName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCntrctName(String value) {
                this.cntrctName = value;
            }

            /**
             * Obtient la valeur de la propri�t� cntrctVrsNumb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCntrctVrsNumb() {
                return cntrctVrsNumb;
            }

            /**
             * D�finit la valeur de la propri�t� cntrctVrsNumb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCntrctVrsNumb(String value) {
                this.cntrctVrsNumb = value;
            }

            /**
             * Obtient la valeur de la propri�t� expiryDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpiryDate() {
                return expiryDate;
            }

            /**
             * D�finit la valeur de la propri�t� expiryDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpiryDate(XMLGregorianCalendar value) {
                this.expiryDate = value;
            }

            /**
             * Obtient la valeur de la propri�t� optType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptType() {
                return optType;
            }

            /**
             * D�finit la valeur de la propri�t� optType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptType(String value) {
                this.optType = value;
            }

            /**
             * Obtient la valeur de la propri�t� exrcisePrice.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getExrcisePrice() {
                return exrcisePrice;
            }

            /**
             * D�finit la valeur de la propri�t� exrcisePrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setExrcisePrice(Price value) {
                this.exrcisePrice = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ISIN" type="{}ISINIdentifier" minOccurs="0"/>
         *         &lt;element name="OthrIdntfctn" type="{}AlternateFinancialInstrumentIdentification" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "isin",
            "othrIdntfctn"
        })
        public static class SecurtyIdntfctn {

            @XmlElement(name = "ISIN")
            protected String isin;
            @XmlElement(name = "OthrIdntfctn")
            protected List<AlternateFinancialInstrumentIdentification> othrIdntfctn;

            /**
             * Obtient la valeur de la propri�t� isin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISIN() {
                return isin;
            }

            /**
             * D�finit la valeur de la propri�t� isin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISIN(String value) {
                this.isin = value;
            }

            /**
             * Gets the value of the othrIdntfctn property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the othrIdntfctn property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOthrIdntfctn().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AlternateFinancialInstrumentIdentification }
             * 
             * 
             */
            public List<AlternateFinancialInstrumentIdentification> getOthrIdntfctn() {
                if (othrIdntfctn == null) {
                    othrIdntfctn = new ArrayList<AlternateFinancialInstrumentIdentification>();
                }
                return this.othrIdntfctn;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Status" type="{}QuotationStatusCode"/>
     *         &lt;element name="EffctveDate" type="{}ISODate" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status",
        "effctveDate"
    })
    public static class QuotatnStatus {

        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "EffctveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effctveDate;

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

    }

}
