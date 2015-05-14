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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StructuredAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredAnnotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Who" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WhatObject" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WhatAction" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Where" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="When" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Why" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="How" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAnnotationType", propOrder = {
    "who",
    "whatObject",
    "whatAction",
    "where",
    "when",
    "why",
    "how"
})
public class StructuredAnnotationType {

    @XmlElement(name = "Who")
    protected List<TermUseType> who;
    @XmlElement(name = "WhatObject")
    protected List<TermUseType> whatObject;
    @XmlElement(name = "WhatAction")
    protected List<TermUseType> whatAction;
    @XmlElement(name = "Where")
    protected List<TermUseType> where;
    @XmlElement(name = "When")
    protected List<TermUseType> when;
    @XmlElement(name = "Why")
    protected List<TermUseType> why;
    @XmlElement(name = "How")
    protected List<TermUseType> how;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the who property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the who property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWho().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getWho() {
        if (who == null) {
            who = new ArrayList<TermUseType>();
        }
        return this.who;
    }

    /**
     * Gets the value of the whatObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whatObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhatObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getWhatObject() {
        if (whatObject == null) {
            whatObject = new ArrayList<TermUseType>();
        }
        return this.whatObject;
    }

    /**
     * Gets the value of the whatAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whatAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhatAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getWhatAction() {
        if (whatAction == null) {
            whatAction = new ArrayList<TermUseType>();
        }
        return this.whatAction;
    }

    /**
     * Gets the value of the where property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the where property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhere().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getWhere() {
        if (where == null) {
            where = new ArrayList<TermUseType>();
        }
        return this.where;
    }

    /**
     * Gets the value of the when property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the when property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getWhen() {
        if (when == null) {
            when = new ArrayList<TermUseType>();
        }
        return this.when;
    }

    /**
     * Gets the value of the why property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the why property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getWhy() {
        if (why == null) {
            why = new ArrayList<TermUseType>();
        }
        return this.why;
    }

    /**
     * Gets the value of the how property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the how property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermUseType }
     * 
     * 
     */
    public List<TermUseType> getHow() {
        if (how == null) {
            how = new ArrayList<TermUseType>();
        }
        return this.how;
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
