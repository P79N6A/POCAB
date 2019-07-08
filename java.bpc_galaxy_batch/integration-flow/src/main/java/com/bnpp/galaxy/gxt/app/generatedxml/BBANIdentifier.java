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
 * Le BBAN (Basic Bank Account Number) identifie de mani�re unique un compte client chez un interm�diaire financier dans le cadre d'un syt�me de num�rotation national.
 * 
 * <p>Classe Java pour BBANIdentifier complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BBANIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RIB" type="{}RIBIdentifier"/>
 *         &lt;element name="CordintaBncria" type="{}CoordinataBancariaIdentifier"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BBANIdentifier", propOrder = {
    "rib",
    "cordintaBncria"
})
public class BBANIdentifier {

    @XmlElement(name = "RIB")
    protected RIBIdentifier rib;
    @XmlElement(name = "CordintaBncria")
    protected CoordinataBancariaIdentifier cordintaBncria;

    /**
     * Obtient la valeur de la propri�t� rib.
     * 
     * @return
     *     possible object is
     *     {@link RIBIdentifier }
     *     
     */
    public RIBIdentifier getRIB() {
        return rib;
    }

    /**
     * D�finit la valeur de la propri�t� rib.
     * 
     * @param value
     *     allowed object is
     *     {@link RIBIdentifier }
     *     
     */
    public void setRIB(RIBIdentifier value) {
        this.rib = value;
    }

    /**
     * Obtient la valeur de la propri�t� cordintaBncria.
     * 
     * @return
     *     possible object is
     *     {@link CoordinataBancariaIdentifier }
     *     
     */
    public CoordinataBancariaIdentifier getCordintaBncria() {
        return cordintaBncria;
    }

    /**
     * D�finit la valeur de la propri�t� cordintaBncria.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinataBancariaIdentifier }
     *     
     */
    public void setCordintaBncria(CoordinataBancariaIdentifier value) {
        this.cordintaBncria = value;
    }

}
