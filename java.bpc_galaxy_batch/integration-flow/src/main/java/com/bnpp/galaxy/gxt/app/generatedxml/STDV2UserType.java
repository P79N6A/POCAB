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
 * NE PLUS UTILISER - Bloc d'identification de l'utilisateur
 * 
 * <p>Classe Java pour STDV2UserType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="STDV2UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{}STDIdentificationType" minOccurs="0"/>
 *         &lt;element name="Login" type="{}STDIdentificationType" minOccurs="0"/>
 *         &lt;element name="Name" type="{}Name" minOccurs="0"/>
 *         &lt;element name="Role" type="{}UserRoleCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STDV2UserType", propOrder = {
    "userId",
    "login",
    "name",
    "role"
})
public class STDV2UserType {

    @XmlElement(name = "UserId")
    protected STDIdentificationType userId;
    @XmlElement(name = "Login")
    protected STDIdentificationType login;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Role")
    protected String role;

    /**
     * Obtient la valeur de la propri�t� userId.
     * 
     * @return
     *     possible object is
     *     {@link STDIdentificationType }
     *     
     */
    public STDIdentificationType getUserId() {
        return userId;
    }

    /**
     * D�finit la valeur de la propri�t� userId.
     * 
     * @param value
     *     allowed object is
     *     {@link STDIdentificationType }
     *     
     */
    public void setUserId(STDIdentificationType value) {
        this.userId = value;
    }

    /**
     * Obtient la valeur de la propri�t� login.
     * 
     * @return
     *     possible object is
     *     {@link STDIdentificationType }
     *     
     */
    public STDIdentificationType getLogin() {
        return login;
    }

    /**
     * D�finit la valeur de la propri�t� login.
     * 
     * @param value
     *     allowed object is
     *     {@link STDIdentificationType }
     *     
     */
    public void setLogin(STDIdentificationType value) {
        this.login = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
