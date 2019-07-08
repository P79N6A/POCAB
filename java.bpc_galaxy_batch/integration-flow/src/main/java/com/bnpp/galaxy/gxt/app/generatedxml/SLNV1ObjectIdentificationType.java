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
 * Bloc standard d'identification d'un objet ( client, tiers, op�ration) (remplace STDObjectIdentificationType)
 * 
 * <p>Classe Java pour SLNV1ObjectIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SLNV1ObjectIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainIdntfctn" type="{}SLNV1IdentificationType"/>
 *         &lt;element name="AddIdntfctn" type="{}SLNV1IdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLNV1ObjectIdentificationType", propOrder = {
    "mainIdntfctn",
    "addIdntfctn"
})
public class SLNV1ObjectIdentificationType {

    @XmlElement(name = "MainIdntfctn", required = true)
    protected SLNV1IdentificationType mainIdntfctn;
    @XmlElement(name = "AddIdntfctn")
    protected List<SLNV1IdentificationType> addIdntfctn;

    /**
     * Obtient la valeur de la propri�t� mainIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link SLNV1IdentificationType }
     *     
     */
    public SLNV1IdentificationType getMainIdntfctn() {
        return mainIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� mainIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link SLNV1IdentificationType }
     *     
     */
    public void setMainIdntfctn(SLNV1IdentificationType value) {
        this.mainIdntfctn = value;
    }

    /**
     * Gets the value of the addIdntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addIdntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddIdntfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLNV1IdentificationType }
     * 
     * 
     */
    public List<SLNV1IdentificationType> getAddIdntfctn() {
        if (addIdntfctn == null) {
            addIdntfctn = new ArrayList<SLNV1IdentificationType>();
        }
        return this.addIdntfctn;
    }

}
