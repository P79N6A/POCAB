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
 * NE PLUS UTILISER - Identifiant d'un compte bancaire (IBAN/RIB/BIC/Domiciliation, ..)
 * 
 * <p>Classe Java pour STDBankAccountIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDBankAccountIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IBAN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CntryOfResdnce" type="{}CountryCode" minOccurs="0"/>
 *                   &lt;element name="IBANChckDgit" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{}CheckDigit">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BBAN">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="RIB" type="{}RIBIdentifier"/>
 *                             &lt;element name="CordintaBnccria" type="{}CoordinataBancariaIdentifier"/>
 *                             &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType"/>
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
@XmlType(name = "STDBankAccountIdentificationType", propOrder = {
    "iban",
    "altrnteIdntfctn"
})
public class STDBankAccountIdentificationType {

    @XmlElement(name = "IBAN")
    protected STDBankAccountIdentificationType.IBAN iban;
    @XmlElement(name = "AltrnteIdntfctn")
    protected IdentificationInformation altrnteIdntfctn;

    /**
     * Obtient la valeur de la propri�t� iban.
     * 
     * @return
     *     possible object is
     *     {@link STDBankAccountIdentificationType.IBAN }
     *     
     */
    public STDBankAccountIdentificationType.IBAN getIBAN() {
        return iban;
    }

    /**
     * D�finit la valeur de la propri�t� iban.
     * 
     * @param value
     *     allowed object is
     *     {@link STDBankAccountIdentificationType.IBAN }
     *     
     */
    public void setIBAN(STDBankAccountIdentificationType.IBAN value) {
        this.iban = value;
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
     *         &lt;element name="CntryOfResdnce" type="{}CountryCode" minOccurs="0"/>
     *         &lt;element name="IBANChckDgit" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{}CheckDigit">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BBAN">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="RIB" type="{}RIBIdentifier"/>
     *                   &lt;element name="CordintaBnccria" type="{}CoordinataBancariaIdentifier"/>
     *                   &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType"/>
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
        @XmlElement(name = "BBAN", required = true)
        protected STDBankAccountIdentificationType.IBAN.BBAN bban;
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
         *     {@link STDBankAccountIdentificationType.IBAN.BBAN }
         *     
         */
        public STDBankAccountIdentificationType.IBAN.BBAN getBBAN() {
            return bban;
        }

        /**
         * D�finit la valeur de la propri�t� bban.
         * 
         * @param value
         *     allowed object is
         *     {@link STDBankAccountIdentificationType.IBAN.BBAN }
         *     
         */
        public void setBBAN(STDBankAccountIdentificationType.IBAN.BBAN value) {
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
         *       &lt;choice>
         *         &lt;element name="RIB" type="{}RIBIdentifier"/>
         *         &lt;element name="CordintaBnccria" type="{}CoordinataBancariaIdentifier"/>
         *         &lt;element name="FlatBBAN" type="{}STDFlatBBANIdentifierType"/>
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
            "cordintaBnccria",
            "flatBBAN"
        })
        public static class BBAN {

            @XmlElement(name = "RIB")
            protected RIBIdentifier rib;
            @XmlElement(name = "CordintaBnccria")
            protected CoordinataBancariaIdentifier cordintaBnccria;
            @XmlElement(name = "FlatBBAN")
            protected String flatBBAN;

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
             * Obtient la valeur de la propri�t� cordintaBnccria.
             * 
             * @return
             *     possible object is
             *     {@link CoordinataBancariaIdentifier }
             *     
             */
            public CoordinataBancariaIdentifier getCordintaBnccria() {
                return cordintaBnccria;
            }

            /**
             * D�finit la valeur de la propri�t� cordintaBnccria.
             * 
             * @param value
             *     allowed object is
             *     {@link CoordinataBancariaIdentifier }
             *     
             */
            public void setCordintaBnccria(CoordinataBancariaIdentifier value) {
                this.cordintaBnccria = value;
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

        }

    }

}
