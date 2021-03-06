//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg7._2001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreationPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreationPreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}DSType">
 *       &lt;sequence>
 *         &lt;element name="Title" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2001>TitleType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Creator" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2001}CreatorType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Keyword" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2001>TextualType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2001}PlaceType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DatePeriod" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2001}TimeType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tool" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2001}TermUseType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreationPreferencesType", propOrder = {
    "title",
    "creator",
    "keyword",
    "location",
    "datePeriod",
    "tool"
})
public class CreationPreferencesType
    extends DSType
{

    @XmlElement(name = "Title")
    protected List<CreationPreferencesType.Title> title;
    @XmlElement(name = "Creator")
    protected List<CreationPreferencesType.Creator> creator;
    @XmlElement(name = "Keyword")
    protected List<CreationPreferencesType.Keyword> keyword;
    @XmlElement(name = "Location")
    protected List<CreationPreferencesType.Location> location;
    @XmlElement(name = "DatePeriod")
    protected List<CreationPreferencesType.DatePeriod> datePeriod;
    @XmlElement(name = "Tool")
    protected List<CreationPreferencesType.Tool> tool;
    @XmlAttribute(name = "preferenceValue")
    protected Integer preferenceValue;

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationPreferencesType.Title }
     * 
     * 
     */
    public List<CreationPreferencesType.Title> getTitle() {
        if (title == null) {
            title = new ArrayList<CreationPreferencesType.Title>();
        }
        return this.title;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationPreferencesType.Creator }
     * 
     * 
     */
    public List<CreationPreferencesType.Creator> getCreator() {
        if (creator == null) {
            creator = new ArrayList<CreationPreferencesType.Creator>();
        }
        return this.creator;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationPreferencesType.Keyword }
     * 
     * 
     */
    public List<CreationPreferencesType.Keyword> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<CreationPreferencesType.Keyword>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationPreferencesType.Location }
     * 
     * 
     */
    public List<CreationPreferencesType.Location> getLocation() {
        if (location == null) {
            location = new ArrayList<CreationPreferencesType.Location>();
        }
        return this.location;
    }

    /**
     * Gets the value of the datePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationPreferencesType.DatePeriod }
     * 
     * 
     */
    public List<CreationPreferencesType.DatePeriod> getDatePeriod() {
        if (datePeriod == null) {
            datePeriod = new ArrayList<CreationPreferencesType.DatePeriod>();
        }
        return this.datePeriod;
    }

    /**
     * Gets the value of the tool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationPreferencesType.Tool }
     * 
     * 
     */
    public List<CreationPreferencesType.Tool> getTool() {
        if (tool == null) {
            tool = new ArrayList<CreationPreferencesType.Tool>();
        }
        return this.tool;
    }

    /**
     * Gets the value of the preferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPreferenceValue() {
        if (preferenceValue == null) {
            return  10;
        } else {
            return preferenceValue;
        }
    }

    /**
     * Sets the value of the preferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreferenceValue(Integer value) {
        this.preferenceValue = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}CreatorType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Creator
        extends CreatorType
    {

        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

        /**
         * Gets the value of the preferenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPreferenceValue() {
            if (preferenceValue == null) {
                return  10;
            } else {
                return preferenceValue;
            }
        }

        /**
         * Sets the value of the preferenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPreferenceValue(Integer value) {
            this.preferenceValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}TimeType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DatePeriod
        extends TimeType
    {

        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

        /**
         * Gets the value of the preferenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPreferenceValue() {
            if (preferenceValue == null) {
                return  10;
            } else {
                return preferenceValue;
            }
        }

        /**
         * Sets the value of the preferenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPreferenceValue(Integer value) {
            this.preferenceValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2001>TextualType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Keyword
        extends TextualType
    {

        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

        /**
         * Gets the value of the preferenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPreferenceValue() {
            if (preferenceValue == null) {
                return  10;
            } else {
                return preferenceValue;
            }
        }

        /**
         * Sets the value of the preferenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPreferenceValue(Integer value) {
            this.preferenceValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}PlaceType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Location
        extends PlaceType
    {

        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

        /**
         * Gets the value of the preferenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPreferenceValue() {
            if (preferenceValue == null) {
                return  10;
            } else {
                return preferenceValue;
            }
        }

        /**
         * Sets the value of the preferenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPreferenceValue(Integer value) {
            this.preferenceValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2001>TitleType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Title
        extends TitleType
    {

        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

        /**
         * Gets the value of the preferenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPreferenceValue() {
            if (preferenceValue == null) {
                return  10;
            } else {
                return preferenceValue;
            }
        }

        /**
         * Sets the value of the preferenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPreferenceValue(Integer value) {
            this.preferenceValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}TermUseType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2001}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tool
        extends TermUseType
    {

        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

        /**
         * Gets the value of the preferenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPreferenceValue() {
            if (preferenceValue == null) {
                return  10;
            } else {
                return preferenceValue;
            }
        }

        /**
         * Sets the value of the preferenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPreferenceValue(Integer value) {
            this.preferenceValue = value;
        }

    }

}
