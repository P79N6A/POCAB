//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.18 � 12:56:08 AM CEST 
//


package com.bnpp.galaxy.gxt.app.generatedxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tiers partenaires et type de role - intervenants de distribution, d�l�gation de gestion
 * 
 * <p>Classe Java pour PartnerAgreementType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PartnerAgreementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollectnMode" type="{}CollectionModeCode"/>
 *         &lt;element name="Agrmnt" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AgrmntType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PartnrPrty">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Role" type="{}RoleCode"/>
 *                             &lt;element name="Id" type="{}PartyIdentifier"/>
 *                             &lt;element name="ReciprclCmpny" type="{}Reference" minOccurs="0"/>
 *                             &lt;element name="Netwrk" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PartnrNetwrkUnit" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerAgreementType", propOrder = {
    "collectnMode",
    "agrmnt"
})
public class PartnerAgreementType {

    @XmlElement(name = "CollectnMode", required = true)
    protected String collectnMode;
    @XmlElement(name = "Agrmnt", required = true)
    protected List<PartnerAgreementType.Agrmnt> agrmnt;

    /**
     * Obtient la valeur de la propri�t� collectnMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectnMode() {
        return collectnMode;
    }

    /**
     * D�finit la valeur de la propri�t� collectnMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectnMode(String value) {
        this.collectnMode = value;
    }

    /**
     * Gets the value of the agrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerAgreementType.Agrmnt }
     * 
     * 
     */
    public List<PartnerAgreementType.Agrmnt> getAgrmnt() {
        if (agrmnt == null) {
            agrmnt = new ArrayList<PartnerAgreementType.Agrmnt>();
        }
        return this.agrmnt;
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
     *         &lt;element name="AgrmntType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PartnrPrty">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Role" type="{}RoleCode"/>
     *                   &lt;element name="Id" type="{}PartyIdentifier"/>
     *                   &lt;element name="ReciprclCmpny" type="{}Reference" minOccurs="0"/>
     *                   &lt;element name="Netwrk" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PartnrNetwrkUnit" minOccurs="0">
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
        "agrmntType",
        "partnrPrty"
    })
    public static class Agrmnt {

        @XmlElement(name = "AgrmntType", required = true)
        protected String agrmntType;
        @XmlElement(name = "PartnrPrty", required = true)
        protected PartnerAgreementType.Agrmnt.PartnrPrty partnrPrty;

        /**
         * Obtient la valeur de la propri�t� agrmntType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgrmntType() {
            return agrmntType;
        }

        /**
         * D�finit la valeur de la propri�t� agrmntType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgrmntType(String value) {
            this.agrmntType = value;
        }

        /**
         * Obtient la valeur de la propri�t� partnrPrty.
         * 
         * @return
         *     possible object is
         *     {@link PartnerAgreementType.Agrmnt.PartnrPrty }
         *     
         */
        public PartnerAgreementType.Agrmnt.PartnrPrty getPartnrPrty() {
            return partnrPrty;
        }

        /**
         * D�finit la valeur de la propri�t� partnrPrty.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerAgreementType.Agrmnt.PartnrPrty }
         *     
         */
        public void setPartnrPrty(PartnerAgreementType.Agrmnt.PartnrPrty value) {
            this.partnrPrty = value;
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
         *         &lt;element name="Role" type="{}RoleCode"/>
         *         &lt;element name="Id" type="{}PartyIdentifier"/>
         *         &lt;element name="ReciprclCmpny" type="{}Reference" minOccurs="0"/>
         *         &lt;element name="Netwrk" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PartnrNetwrkUnit" minOccurs="0">
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
            "role",
            "id",
            "reciprclCmpny",
            "netwrk",
            "partnrNetwrkUnit"
        })
        public static class PartnrPrty {

            @XmlElement(name = "Role", required = true)
            protected String role;
            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "ReciprclCmpny")
            protected String reciprclCmpny;
            @XmlElement(name = "Netwrk")
            protected String netwrk;
            @XmlElement(name = "PartnrNetwrkUnit")
            protected String partnrNetwrkUnit;

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
             * Obtient la valeur de la propri�t� reciprclCmpny.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReciprclCmpny() {
                return reciprclCmpny;
            }

            /**
             * D�finit la valeur de la propri�t� reciprclCmpny.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReciprclCmpny(String value) {
                this.reciprclCmpny = value;
            }

            /**
             * Obtient la valeur de la propri�t� netwrk.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNetwrk() {
                return netwrk;
            }

            /**
             * D�finit la valeur de la propri�t� netwrk.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNetwrk(String value) {
                this.netwrk = value;
            }

            /**
             * Obtient la valeur de la propri�t� partnrNetwrkUnit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartnrNetwrkUnit() {
                return partnrNetwrkUnit;
            }

            /**
             * D�finit la valeur de la propri�t� partnrNetwrkUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartnrNetwrkUnit(String value) {
                this.partnrNetwrkUnit = value;
            }

        }

    }

}
