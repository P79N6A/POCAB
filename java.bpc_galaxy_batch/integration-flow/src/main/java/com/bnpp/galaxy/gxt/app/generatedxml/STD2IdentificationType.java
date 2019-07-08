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
 * NE PLUS UTILISER
 * 
 * <p>Classe Java pour STD2IdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STD2IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntrnlIdntfctn" type="{}STD2UniqueIdentifierType"/>
 *         &lt;element name="OthrIntrnlIdntfctn" type="{}STD2OtherIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtrnlIdntfctn" type="{}STD2ExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STD2IdentificationType", propOrder = {
    "intrnlIdntfctn",
    "othrIntrnlIdntfctn",
    "extrnlIdntfctn"
})
public class STD2IdentificationType {

    @XmlElement(name = "IntrnlIdntfctn", required = true)
    protected STD2UniqueIdentifierType intrnlIdntfctn;
    @XmlElement(name = "OthrIntrnlIdntfctn")
    protected List<STD2OtherIdentifierType> othrIntrnlIdntfctn;
    @XmlElement(name = "ExtrnlIdntfctn")
    protected List<STD2ExternalIdentifierType> extrnlIdntfctn;

    /**
     * Obtient la valeur de la propri�t� intrnlIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link STD2UniqueIdentifierType }
     *     
     */
    public STD2UniqueIdentifierType getIntrnlIdntfctn() {
        return intrnlIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� intrnlIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link STD2UniqueIdentifierType }
     *     
     */
    public void setIntrnlIdntfctn(STD2UniqueIdentifierType value) {
        this.intrnlIdntfctn = value;
    }

    /**
     * Gets the value of the othrIntrnlIdntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrIntrnlIdntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIntrnlIdntfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STD2OtherIdentifierType }
     * 
     * 
     */
    public List<STD2OtherIdentifierType> getOthrIntrnlIdntfctn() {
        if (othrIntrnlIdntfctn == null) {
            othrIntrnlIdntfctn = new ArrayList<STD2OtherIdentifierType>();
        }
        return this.othrIntrnlIdntfctn;
    }

    /**
     * Gets the value of the extrnlIdntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrnlIdntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrnlIdntfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STD2ExternalIdentifierType }
     * 
     * 
     */
    public List<STD2ExternalIdentifierType> getExtrnlIdntfctn() {
        if (extrnlIdntfctn == null) {
            extrnlIdntfctn = new ArrayList<STD2ExternalIdentifierType>();
        }
        return this.extrnlIdntfctn;
    }

}
