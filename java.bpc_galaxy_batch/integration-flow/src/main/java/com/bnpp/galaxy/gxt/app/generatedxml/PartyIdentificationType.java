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
 * NE PLUS UTILISER - Identification d'un tiers
 * 
 * <p>Classe Java pour PartyIdentificationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Id" type="{}PartyIdentifier"/>
 *         &lt;element name="ShardRegstryPrtyIdntfctn" type="{}IdentificationInformation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationType", propOrder = {
    "id",
    "shardRegstryPrtyIdntfctn"
})
public class PartyIdentificationType {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ShardRegstryPrtyIdntfctn")
    protected IdentificationInformation shardRegstryPrtyIdntfctn;

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
     * Obtient la valeur de la propri�t� shardRegstryPrtyIdntfctn.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation }
     *     
     */
    public IdentificationInformation getShardRegstryPrtyIdntfctn() {
        return shardRegstryPrtyIdntfctn;
    }

    /**
     * D�finit la valeur de la propri�t� shardRegstryPrtyIdntfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation }
     *     
     */
    public void setShardRegstryPrtyIdntfctn(IdentificationInformation value) {
        this.shardRegstryPrtyIdntfctn = value;
    }

}
