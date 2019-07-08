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
 * NE PLUS UTILISER - Bloc standard d'identification d'un objet avec version ( produit, accord de distribution, etc)
 * 
 * <p>Classe Java pour STDObjectIdentificationWithVersionType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDObjectIdentificationWithVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniquedntfctn" type="{}STDIdentificationWithVersionType"/>
 *         &lt;element name="AddIdntfctn" type="{}STDIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDObjectIdentificationWithVersionType", propOrder = {
    "uniquedntfctn",
    "addIdntfctn"
})
public class STDObjectIdentificationWithVersionType {

    @XmlElement(name = "Uniquedntfctn", required = true)
    protected STDIdentificationWithVersionType uniquedntfctn;
    @XmlElement(name = "AddIdntfctn")
    protected List<STDIdentificationType> addIdntfctn;

    /**
     * Obtient la valeur de la propri�t� uniquedntfctn.
     * 
     * @return
     *     possible object is
     *     {@link STDIdentificationWithVersionType }
     *     
     */
    public STDIdentificationWithVersionType getUniquedntfctn() {
        return uniquedntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� uniquedntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link STDIdentificationWithVersionType }
     *     
     */
    public void setUniquedntfctn(STDIdentificationWithVersionType value) {
        this.uniquedntfctn = value;
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
     * {@link STDIdentificationType }
     * 
     * 
     */
    public List<STDIdentificationType> getAddIdntfctn() {
        if (addIdntfctn == null) {
            addIdntfctn = new ArrayList<STDIdentificationType>();
        }
        return this.addIdntfctn;
    }

}
