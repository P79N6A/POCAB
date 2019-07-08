
package com.bnpp.galaxy.gxt.app.generatedxml;

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
 * <p>Classe Java pour anonymous complex type.
 *
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fixing" type="{}FixingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmptyFileIndic" type="{}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="FileIdntfctn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Idntfctn" type="{}IdentificationInformation" minOccurs="0"/>
 *                   &lt;element name="CreatnDate" type="{}ISODateTime" minOccurs="0"/>
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
        "fixing",
        "emptyFileIndic",
        "fileIdntfctn"
})
@XmlRootElement(name = "FixingEvent")
public class FixingEvent {

    @XmlElement(name = "Fixing")
    protected List<FixingType> fixing;
    @XmlElement(name = "EmptyFileIndic")
    protected String emptyFileIndic;
    @XmlElement(name = "FileIdntfctn")
    protected FixingEvent.FileIdntfctn fileIdntfctn;

    /**
     * Gets the value of the fixing property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixing property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixing().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixingType }
     *
     *
     */
    public List<FixingType> getFixing() {
        if (fixing == null) {
            fixing = new ArrayList<FixingType>();
        }
        return this.fixing;
    }

    /**
     * Obtient la valeur de la propriete emptyFileIndic.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmptyFileIndic() {
        return emptyFileIndic;
    }

    /**
     * Definit la valeur de la propriete emptyFileIndic.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmptyFileIndic(String value) {
        this.emptyFileIndic = value;
    }

    /**
     * Obtient la valeur de la propriete fileIdntfctn.
     *
     * @return
     *     possible object is
     *     {@link FixingEvent.FileIdntfctn }
     *
     */
    public FixingEvent.FileIdntfctn getFileIdntfctn() {
        return fileIdntfctn;
    }

    /**
     * Definit la valeur de la propriete fileIdntfctn.
     *
     * @param value
     *     allowed object is
     *     {@link FixingEvent.FileIdntfctn }
     *
     */
    public void setFileIdntfctn(FixingEvent.FileIdntfctn value) {
        this.fileIdntfctn = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     *
     * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Idntfctn" type="{}IdentificationInformation" minOccurs="0"/>
     *         &lt;element name="CreatnDate" type="{}ISODateTime" minOccurs="0"/>
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
            "idntfctn",
            "creatnDate"
    })
    public static class FileIdntfctn {

        @XmlElement(name = "Idntfctn")
        protected IdentificationInformation idntfctn;
        @XmlElement(name = "CreatnDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creatnDate;

        /**
         * Obtient la valeur de la propriete idntfctn.
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
         * Definit la valeur de la propriete idntfctn.
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
         * Obtient la valeur de la propriete creatnDate.
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
         * Definit la valeur de la propriete creatnDate.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setCreatnDate(XMLGregorianCalendar value) {
            this.creatnDate = value;
        }

    }

}