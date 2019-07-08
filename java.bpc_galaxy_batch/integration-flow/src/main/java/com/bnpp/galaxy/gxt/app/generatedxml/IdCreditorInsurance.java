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
 * Identifiant d'un Sinistre ADE
 * 
 * <p>Classe Java pour IdCreditorInsurance complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdCreditorInsurance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortflioCode" type="{}PortfolioCode"/>
 *         &lt;element name="IdCntrct" type="{}Reference"/>
 *         &lt;element name="IdEvt" type="{}Reference"/>
 *         &lt;element name="IdAgrmnt" type="{}Reference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdCreditorInsurance", propOrder = {
    "portflioCode",
    "idCntrct",
    "idEvt",
    "idAgrmnt"
})
public class IdCreditorInsurance {

    @XmlElement(name = "PortflioCode", required = true)
    protected String portflioCode;
    @XmlElement(name = "IdCntrct", required = true)
    protected String idCntrct;
    @XmlElement(name = "IdEvt", required = true)
    protected String idEvt;
    @XmlElement(name = "IdAgrmnt", required = true)
    protected String idAgrmnt;

    /**
     * Obtient la valeur de la propri�t� portflioCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortflioCode() {
        return portflioCode;
    }

    /**
     * D�finit la valeur de la propri�t� portflioCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortflioCode(String value) {
        this.portflioCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� idCntrct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCntrct() {
        return idCntrct;
    }

    /**
     * D�finit la valeur de la propri�t� idCntrct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCntrct(String value) {
        this.idCntrct = value;
    }

    /**
     * Obtient la valeur de la propri�t� idEvt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEvt() {
        return idEvt;
    }

    /**
     * D�finit la valeur de la propri�t� idEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEvt(String value) {
        this.idEvt = value;
    }

    /**
     * Obtient la valeur de la propri�t� idAgrmnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAgrmnt() {
        return idAgrmnt;
    }

    /**
     * D�finit la valeur de la propri�t� idAgrmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAgrmnt(String value) {
        this.idAgrmnt = value;
    }

}
