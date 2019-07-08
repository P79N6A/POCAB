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
 * Donn�es contexte de publication des objets port�s par un pivot (Remplace STDFilePublicationDataType)
 * 
 * <p>Classe Java pour SLNV1FilePublicationDataType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1FilePublicationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileIdntfctn" type="{}SLNV1IdentificationType" minOccurs="0"/>
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
@XmlType(name = "SLNV1FilePublicationDataType", propOrder = {
    "fileIdntfctn",
    "creatnDate"
})
public class SLNV1FilePublicationDataType {

    @XmlElement(name = "FileIdntfctn")
    protected SLNV1IdentificationType fileIdntfctn;
    @XmlElement(name = "CreatnDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creatnDate;

    /**
     * Obtient la valeur de la propri�t� fileIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1IdentificationType }
     *     
     */
    public SLNV1IdentificationType getFileIdntfctn() {
        return fileIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� fileIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1IdentificationType }
     *     
     */
    public void setFileIdntfctn(SLNV1IdentificationType value) {
        this.fileIdntfctn = value;
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

}
