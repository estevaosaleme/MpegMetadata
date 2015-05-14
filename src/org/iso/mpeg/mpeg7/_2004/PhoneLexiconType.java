//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneLexiconType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneLexiconType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}LexiconType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{urn:mpeg:mpeg7:schema:2004}PhoneType" maxOccurs="65536"/>
 *       &lt;/sequence>
 *       &lt;attribute name="phoneticAlphabet" type="{urn:mpeg:mpeg7:schema:2004}phoneticAlphabetType" default="sampa" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneLexiconType", propOrder = {
    "token"
})
public class PhoneLexiconType
    extends LexiconType
{

    @XmlElement(name = "Token", required = true)
    protected List<String> token;
    @XmlAttribute(name = "phoneticAlphabet")
    protected PhoneticAlphabetType phoneticAlphabet;

    /**
     * Gets the value of the token property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the token property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToken() {
        if (token == null) {
            token = new ArrayList<String>();
        }
        return this.token;
    }

    /**
     * Gets the value of the phoneticAlphabet property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneticAlphabetType }
     *     
     */
    public PhoneticAlphabetType getPhoneticAlphabet() {
        if (phoneticAlphabet == null) {
            return PhoneticAlphabetType.SAMPA;
        } else {
            return phoneticAlphabet;
        }
    }

    /**
     * Sets the value of the phoneticAlphabet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneticAlphabetType }
     *     
     */
    public void setPhoneticAlphabet(PhoneticAlphabetType value) {
        this.phoneticAlphabet = value;
    }

}