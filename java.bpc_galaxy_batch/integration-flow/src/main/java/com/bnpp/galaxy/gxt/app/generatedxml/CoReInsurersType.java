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
 * Informations et montants d'op�ration li�es aux accords de Co- ou de R�assurance
 * 
 * <p>Classe Java pour Co-ReInsurersType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Co-ReInsurersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Co-ReInsPrty">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{}PartyIdentifier"/>
 *                   &lt;element name="Role" type="{}RoleCode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IdCo-ReInsAgrmnt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Mode" type="{}AgreementTypeCode"/>
 *                   &lt;element name="Ref">
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
 *         &lt;element name="ShareAmnt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="Quote-Share" type="{}PercentageRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Co-ReInsurersType", propOrder = {
    "coReInsPrty",
    "idCoReInsAgrmnt",
    "shareAmnt",
    "quoteShare"
})
public class CoReInsurersType {

    @XmlElement(name = "Co-ReInsPrty", required = true)
    protected CoReInsurersType.CoReInsPrty coReInsPrty;
    @XmlElement(name = "IdCo-ReInsAgrmnt", required = true)
    protected CoReInsurersType.IdCoReInsAgrmnt idCoReInsAgrmnt;
    @XmlElement(name = "ShareAmnt", required = true)
    protected CurrencyAndAmount shareAmnt;
    @XmlElement(name = "Quote-Share")
    protected PercentageRate quoteShare;

    /**
     * Obtient la valeur de la propri�t� coReInsPrty.
     * 
     * @return
     *     possible object is
     *     {@link CoReInsurersType.CoReInsPrty }
     *     
     */
    public CoReInsurersType.CoReInsPrty getCoReInsPrty() {
        return coReInsPrty;
    }

    /**
     * D�finit la valeur de la propri�t� coReInsPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link CoReInsurersType.CoReInsPrty }
     *     
     */
    public void setCoReInsPrty(CoReInsurersType.CoReInsPrty value) {
        this.coReInsPrty = value;
    }

    /**
     * Obtient la valeur de la propri�t� idCoReInsAgrmnt.
     * 
     * @return
     *     possible object is
     *     {@link CoReInsurersType.IdCoReInsAgrmnt }
     *     
     */
    public CoReInsurersType.IdCoReInsAgrmnt getIdCoReInsAgrmnt() {
        return idCoReInsAgrmnt;
    }

    /**
     * D�finit la valeur de la propri�t� idCoReInsAgrmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CoReInsurersType.IdCoReInsAgrmnt }
     *     
     */
    public void setIdCoReInsAgrmnt(CoReInsurersType.IdCoReInsAgrmnt value) {
        this.idCoReInsAgrmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� shareAmnt.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getShareAmnt() {
        return shareAmnt;
    }

    /**
     * D�finit la valeur de la propri�t� shareAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setShareAmnt(CurrencyAndAmount value) {
        this.shareAmnt = value;
    }

    /**
     * Obtient la valeur de la propri�t� quoteShare.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRate }
     *     
     */
    public PercentageRate getQuoteShare() {
        return quoteShare;
    }

    /**
     * D�finit la valeur de la propri�t� quoteShare.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRate }
     *     
     */
    public void setQuoteShare(PercentageRate value) {
        this.quoteShare = value;
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
     *         &lt;element name="Id" type="{}PartyIdentifier"/>
     *         &lt;element name="Role" type="{}RoleCode"/>
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
        "id",
        "role"
    })
    public static class CoReInsPrty {

        @XmlElement(name = "Id", required = true)
        protected String id;
        @XmlElement(name = "Role", required = true)
        protected String role;

        /**
         * Obtient la valeur de la propri�t� id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * D�finit la valeur de la propri�t� id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtient la valeur de la propri�t� role.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * D�finit la valeur de la propri�t� role.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
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
     *         &lt;element name="Mode" type="{}AgreementTypeCode"/>
     *         &lt;element name="Ref">
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
        "mode",
        "ref"
    })
    public static class IdCoReInsAgrmnt {

        @XmlElement(name = "Mode", required = true)
        protected String mode;
        @XmlElement(name = "Ref", required = true)
        protected String ref;

        /**
         * Obtient la valeur de la propri�t� mode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMode() {
            return mode;
        }

        /**
         * D�finit la valeur de la propri�t� mode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMode(String value) {
            this.mode = value;
        }

        /**
         * Obtient la valeur de la propri�t� ref.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * D�finit la valeur de la propri�t� ref.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }

}
