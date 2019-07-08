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
 * Identification d'un contrat d'Epargne
 * 
 * <p>Classe Java pour SavingsPolicyIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SavingsPolicyIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idntfctn" type="{}IdentificationInformation"/>
 *         &lt;element name="VrsId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtrnlRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrtyIdntfctn" type="{}PartyIdentificationType"/>
 *                   &lt;element name="Role" type="{}RoleCode"/>
 *                   &lt;element name="Idntfctn" type="{}IdentificationInformation"/>
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
@XmlType(name = "SavingsPolicyIdentificationType", propOrder = {
    "idntfctn",
    "vrsId",
    "extrnlRef"
})
public class SavingsPolicyIdentificationType {

    @XmlElement(name = "Idntfctn", required = true)
    protected IdentificationInformation idntfctn;
    @XmlElement(name = "VrsId")
    protected String vrsId;
    @XmlElement(name = "ExtrnlRef")
    protected List<SavingsPolicyIdentificationType.ExtrnlRef> extrnlRef;

    /**
     * Obtient la valeur de la propri�t� idntfctn.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation }
     *     
     */
    public IdentificationInformation getIdntfctn() {
        return idntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� idntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation }
     *     
     */
    public void setIdntfctn(IdentificationInformation value) {
        this.idntfctn = value;
    }

    /**
     * Obtient la valeur de la propri�t� vrsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsId() {
        return vrsId;
    }

    /**
     * D�finit la valeur de la propri�t� vrsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsId(String value) {
        this.vrsId = value;
    }

    /**
     * Gets the value of the extrnlRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrnlRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrnlRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavingsPolicyIdentificationType.ExtrnlRef }
     * 
     * 
     */
    public List<SavingsPolicyIdentificationType.ExtrnlRef> getExtrnlRef() {
        if (extrnlRef == null) {
            extrnlRef = new ArrayList<SavingsPolicyIdentificationType.ExtrnlRef>();
        }
        return this.extrnlRef;
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
     *         &lt;element name="PrtyIdntfctn" type="{}PartyIdentificationType"/>
     *         &lt;element name="Role" type="{}RoleCode"/>
     *         &lt;element name="Idntfctn" type="{}IdentificationInformation"/>
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
        "prtyIdntfctn",
        "role",
        "idntfctn"
    })
    public static class ExtrnlRef {

        @XmlElement(name = "PrtyIdntfctn", required = true)
        protected PartyIdentificationType prtyIdntfctn;
        @XmlElement(name = "Role", required = true)
        protected String role;
        @XmlElement(name = "Idntfctn", required = true)
        protected IdentificationInformation idntfctn;

        /**
         * Obtient la valeur de la propri�t� prtyIdntfctn.
         * 
         * @return
         *     possible object is
         *     {@link PartyIdentificationType }
         *     
         */
        public PartyIdentificationType getPrtyIdntfctn() {
            return prtyIdntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� prtyIdntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyIdentificationType }
         *     
         */
        public void setPrtyIdntfctn(PartyIdentificationType value) {
            this.prtyIdntfctn = value;
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

        /**
         * Obtient la valeur de la propri�t� idntfctn.
         * 
         * @return
         *     possible object is
         *     {@link IdentificationInformation }
         *     
         */
        public IdentificationInformation getIdntfctn() {
            return idntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� idntfctn.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentificationInformation }
         *     
         */
        public void setIdntfctn(IdentificationInformation value) {
            this.idntfctn = value;
        }

    }

}
