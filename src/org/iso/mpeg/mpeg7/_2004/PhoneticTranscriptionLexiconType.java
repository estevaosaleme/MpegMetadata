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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PhoneticTranscriptionLexiconType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneticTranscriptionLexiconType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}HeaderType">
 *       &lt;sequence>
 *         &lt;element name="Token" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>WordType">
 *                 &lt;attribute name="phoneticTranscription" use="required">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}PhoneType" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute name="phoneticAlphabet" type="{urn:mpeg:mpeg7:schema:2004}phoneticAlphabetType" default="sampa" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneticTranscriptionLexiconType", propOrder = {
    "token"
})
public class PhoneticTranscriptionLexiconType
    extends HeaderType
{

    @XmlElement(name = "Token", required = true)
    protected List<PhoneticTranscriptionLexiconType.Token> token;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
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
     * {@link PhoneticTranscriptionLexiconType.Token }
     * 
     * 
     */
    public List<PhoneticTranscriptionLexiconType.Token> getToken() {
        if (token == null) {
            token = new ArrayList<PhoneticTranscriptionLexiconType.Token>();
        }
        return this.token;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>WordType">
     *       &lt;attribute name="phoneticTranscription" use="required">
     *         &lt;simpleType>
     *           &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}PhoneType" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Token {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "phoneticTranscription", required = true)
        protected List<String> phoneticTranscription;
        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String lang;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the phoneticTranscription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneticTranscription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneticTranscription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPhoneticTranscription() {
            if (phoneticTranscription == null) {
                phoneticTranscription = new ArrayList<String>();
            }
            return this.phoneticTranscription;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

    }

}