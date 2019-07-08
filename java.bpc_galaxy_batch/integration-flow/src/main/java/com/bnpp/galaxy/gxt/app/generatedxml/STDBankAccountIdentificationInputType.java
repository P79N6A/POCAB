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
 * NE PLUS UTILISER - INPUT=STDBankAccountIdentificationType
 * 
 * <p>Classe Java pour STDBankAccountIdentificationInputType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDBankAccountIdentificationInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="IBAN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="CntryOfResdnce" type="{}CountryCode" minOccurs="0"/>
 *                   &lt;element name="IBANChckDgit" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{}CheckDigit">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BBAN" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice minOccurs="0">
 *                             &lt;element name="RIB" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="BnkCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BrnchCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Idntfctn" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RIBChckDgit" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{}CheckDigit">
 *                                             &lt;length value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CordintaBncria" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="CBChckDgit" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{}CheckDigit">
 *                                             &lt;length value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BnkCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BrnchCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Idntfctn" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="12"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType" minOccurs="0"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BIC" type="{}BICIdentifier" minOccurs="0"/>
 *                   &lt;element name="BnkngAcctBnk" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BnkngAcctHoldr" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AltrnteIdntfctn" type="{}STDIdentificationInformationInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDBankAccountIdentificationInputType", propOrder = {
    "iban",
    "altrnteIdntfctn"
})
public class STDBankAccountIdentificationInputType {

    @XmlElement(name = "IBAN")
    protected STDBankAccountIdentificationInputType.IBAN iban;
    @XmlElement(name = "AltrnteIdntfctn")
    protected STDIdentificationInformationInputType altrnteIdntfctn;

    /**
     * Obtient la valeur de la propri�t� iban.
     * 
     * @return
     *     possible object is
     *     {@link STDBankAccountIdentificationInputType.IBAN }
     *     
     */
    public STDBankAccountIdentificationInputType.IBAN getIBAN() {
        return iban;
    }

    /**
     * D�finit la valeur de la propri�t� iban.
     * 
     * @param value
     *     allowed object is
     *     {@link STDBankAccountIdentificationInputType.IBAN }
     *     
     */
    public void setIBAN(STDBankAccountIdentificationInputType.IBAN value) {
        this.iban = value;
    }

    /**
     * Obtient la valeur de la propri�t� altrnteIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link STDIdentificationInformationInputType }
     *     
     */
    public STDIdentificationInformationInputType getAltrnteIdntfctn() {
        return altrnteIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� altrnteIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link STDIdentificationInformationInputType }
     *     
     */
    public void setAltrnteIdntfctn(STDIdentificationInformationInputType value) {
        this.altrnteIdntfctn = value;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="CntryOfResdnce" type="{}CountryCode" minOccurs="0"/>
     *         &lt;element name="IBANChckDgit" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{}CheckDigit">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BBAN" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice minOccurs="0">
     *                   &lt;element name="RIB" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="BnkCode" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BrnchCode" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Idntfctn" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="RIBChckDgit" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{}CheckDigit">
     *                                   &lt;length value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CordintaBncria" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="CBChckDgit" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{}CheckDigit">
     *                                   &lt;length value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BnkCode" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BrnchCode" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Idntfctn" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="12"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType" minOccurs="0"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BIC" type="{}BICIdentifier" minOccurs="0"/>
     *         &lt;element name="BnkngAcctBnk" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BnkngAcctHoldr" minOccurs="0">
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
    @XmlType(name = "", propOrder = {
        "cntryOfResdnce",
        "ibanChckDgit",
        "bban",
        "bic",
        "bnkngAcctBnk",
        "bnkngAcctHoldr"
    })
    public static class IBAN {

        @XmlElement(name = "CntryOfResdnce")
        protected String cntryOfResdnce;
        @XmlElement(name = "IBANChckDgit")
        protected String ibanChckDgit;
        @XmlElement(name = "BBAN")
        protected STDBankAccountIdentificationInputType.IBAN.BBAN bban;
        @XmlElement(name = "BIC")
        protected String bic;
        @XmlElement(name = "BnkngAcctBnk")
        protected String bnkngAcctBnk;
        @XmlElement(name = "BnkngAcctHoldr")
        protected String bnkngAcctHoldr;

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
         *     {@link STDBankAccountIdentificationInputType.IBAN.BBAN }
         *     
         */
        public STDBankAccountIdentificationInputType.IBAN.BBAN getBBAN() {
            return bban;
        }

        /**
         * D�finit la valeur de la propri�t� bban.
         * 
         * @param value
         *     allowed object is
         *     {@link STDBankAccountIdentificationInputType.IBAN.BBAN }
         *     
         */
        public void setBBAN(STDBankAccountIdentificationInputType.IBAN.BBAN value) {
            this.bban = value;
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
         * Obtient la valeur de la propri�t� bnkngAcctBnk.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBnkngAcctBnk() {
            return bnkngAcctBnk;
        }

        /**
         * D�finit la valeur de la propri�t� bnkngAcctBnk.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBnkngAcctBnk(String value) {
            this.bnkngAcctBnk = value;
        }

        /**
         * Obtient la valeur de la propri�t� bnkngAcctHoldr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBnkngAcctHoldr() {
            return bnkngAcctHoldr;
        }

        /**
         * D�finit la valeur de la propri�t� bnkngAcctHoldr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBnkngAcctHoldr(String value) {
            this.bnkngAcctHoldr = value;
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
         *       &lt;choice minOccurs="0">
         *         &lt;element name="RIB" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="BnkCode" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BrnchCode" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Idntfctn" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="RIBChckDgit" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{}CheckDigit">
         *                         &lt;length value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CordintaBncria" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="CBChckDgit" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{}CheckDigit">
         *                         &lt;length value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BnkCode" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BrnchCode" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Idntfctn" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="12"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType" minOccurs="0"/>
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
            "rib",
            "cordintaBncria",
            "flatBBAN"
        })
        public static class BBAN {

            @XmlElement(name = "RIB")
            protected STDBankAccountIdentificationInputType.IBAN.BBAN.RIB rib;
            @XmlElement(name = "CordintaBncria")
            protected STDBankAccountIdentificationInputType.IBAN.BBAN.CordintaBncria cordintaBncria;
            @XmlElement(name = "FlatBBAN")
            protected String flatBBAN;

            /**
             * Obtient la valeur de la propri�t� rib.
             * 
             * @return
             *     possible object is
             *     {@link STDBankAccountIdentificationInputType.IBAN.BBAN.RIB }
             *     
             */
            public STDBankAccountIdentificationInputType.IBAN.BBAN.RIB getRIB() {
                return rib;
            }

            /**
             * D�finit la valeur de la propri�t� rib.
             * 
             * @param value
             *     allowed object is
             *     {@link STDBankAccountIdentificationInputType.IBAN.BBAN.RIB }
             *     
             */
            public void setRIB(STDBankAccountIdentificationInputType.IBAN.BBAN.RIB value) {
                this.rib = value;
            }

            /**
             * Obtient la valeur de la propri�t� cordintaBncria.
             * 
             * @return
             *     possible object is
             *     {@link STDBankAccountIdentificationInputType.IBAN.BBAN.CordintaBncria }
             *     
             */
            public STDBankAccountIdentificationInputType.IBAN.BBAN.CordintaBncria getCordintaBncria() {
                return cordintaBncria;
            }

            /**
             * D�finit la valeur de la propri�t� cordintaBncria.
             * 
             * @param value
             *     allowed object is
             *     {@link STDBankAccountIdentificationInputType.IBAN.BBAN.CordintaBncria }
             *     
             */
            public void setCordintaBncria(STDBankAccountIdentificationInputType.IBAN.BBAN.CordintaBncria value) {
                this.cordintaBncria = value;
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
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="CBChckDgit" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{}CheckDigit">
             *               &lt;length value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BnkCode" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BrnchCode" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Idntfctn" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="12"/>
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
                "cbChckDgit",
                "bnkCode",
                "brnchCode",
                "idntfctn"
            })
            public static class CordintaBncria {

                @XmlElement(name = "CBChckDgit")
                protected String cbChckDgit;
                @XmlElement(name = "BnkCode")
                protected String bnkCode;
                @XmlElement(name = "BrnchCode")
                protected String brnchCode;
                @XmlElement(name = "Idntfctn")
                protected String idntfctn;

                /**
                 * Obtient la valeur de la propri�t� cbChckDgit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBChckDgit() {
                    return cbChckDgit;
                }

                /**
                 * D�finit la valeur de la propri�t� cbChckDgit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBChckDgit(String value) {
                    this.cbChckDgit = value;
                }

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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="BnkCode" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BrnchCode" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Idntfctn" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="RIBChckDgit" minOccurs="0">
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
            @XmlType(name = "", propOrder = {
                "bnkCode",
                "brnchCode",
                "idntfctn",
                "ribChckDgit"
            })
            public static class RIB {

                @XmlElement(name = "BnkCode")
                protected String bnkCode;
                @XmlElement(name = "BrnchCode")
                protected String brnchCode;
                @XmlElement(name = "Idntfctn")
                protected String idntfctn;
                @XmlElement(name = "RIBChckDgit")
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

        }

    }

}
