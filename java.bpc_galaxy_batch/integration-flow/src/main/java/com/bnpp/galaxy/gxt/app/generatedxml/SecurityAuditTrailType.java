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
 * Piste d'Audit (�l�ments concat�n�s)
 * 
 * <p>Classe Java pour SecurityAuditTrailType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SecurityAuditTrailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginSrce" type="{}ApplicationCode"/>
 *         &lt;element name="CreatnDate" type="{}ISODateTime"/>
 *         &lt;element name="ChronoNumbType" type="{}IdentifierTypeCode"/>
 *         &lt;element name="ChronoNumbIssuer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChronoNumb">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element name="FileID">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="100"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="LineID">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="100"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;element name="OpeRef" type="{}Reference"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="User" type="{}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityAuditTrailType", propOrder = {
    "originSrce",
    "creatnDate",
    "chronoNumbType",
    "chronoNumbIssuer",
    "chronoNumb",
    "user"
})
public class SecurityAuditTrailType {

    @XmlElement(name = "OriginSrce", required = true)
    protected String originSrce;
    @XmlElement(name = "CreatnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creatnDate;
    @XmlElement(name = "ChronoNumbType", required = true)
    protected String chronoNumbType;
    @XmlElement(name = "ChronoNumbIssuer", required = true)
    protected String chronoNumbIssuer;
    @XmlElement(name = "ChronoNumb", required = true)
    protected SecurityAuditTrailType.ChronoNumb chronoNumb;
    @XmlElement(name = "User")
    protected User user;

    /**
     * Obtient la valeur de la propri�t� originSrce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginSrce() {
        return originSrce;
    }

    /**
     * D�finit la valeur de la propri�t� originSrce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginSrce(String value) {
        this.originSrce = value;
    }

    /**
     * Obtient la valeur de la propri�t� creatnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatnDate() {
        return creatnDate;
    }

    /**
     * D�finit la valeur de la propri�t� creatnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatnDate(XMLGregorianCalendar value) {
        this.creatnDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� chronoNumbType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChronoNumbType() {
        return chronoNumbType;
    }

    /**
     * D�finit la valeur de la propri�t� chronoNumbType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChronoNumbType(String value) {
        this.chronoNumbType = value;
    }

    /**
     * Obtient la valeur de la propri�t� chronoNumbIssuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChronoNumbIssuer() {
        return chronoNumbIssuer;
    }

    /**
     * D�finit la valeur de la propri�t� chronoNumbIssuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChronoNumbIssuer(String value) {
        this.chronoNumbIssuer = value;
    }

    /**
     * Obtient la valeur de la propri�t� chronoNumb.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuditTrailType.ChronoNumb }
     *     
     */
    public SecurityAuditTrailType.ChronoNumb getChronoNumb() {
        return chronoNumb;
    }

    /**
     * D�finit la valeur de la propri�t� chronoNumb.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuditTrailType.ChronoNumb }
     *     
     */
    public void setChronoNumb(SecurityAuditTrailType.ChronoNumb value) {
        this.chronoNumb = value;
    }

    /**
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
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
     *         &lt;sequence>
     *           &lt;element name="FileID">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;maxLength value="100"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="LineID">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;maxLength value="100"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *         &lt;/sequence>
     *         &lt;element name="OpeRef" type="{}Reference"/>
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
        "fileID",
        "lineID",
        "opeRef"
    })
    public static class ChronoNumb {

        @XmlElement(name = "FileID")
        protected String fileID;
        @XmlElement(name = "LineID")
        protected String lineID;
        @XmlElement(name = "OpeRef")
        protected String opeRef;

        /**
         * Obtient la valeur de la propri�t� fileID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileID() {
            return fileID;
        }

        /**
         * D�finit la valeur de la propri�t� fileID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileID(String value) {
            this.fileID = value;
        }

        /**
         * Obtient la valeur de la propri�t� lineID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineID() {
            return lineID;
        }

        /**
         * D�finit la valeur de la propri�t� lineID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineID(String value) {
            this.lineID = value;
        }

        /**
         * Obtient la valeur de la propri�t� opeRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpeRef() {
            return opeRef;
        }

        /**
         * D�finit la valeur de la propri�t� opeRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpeRef(String value) {
            this.opeRef = value;
        }

    }

}
