//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SummaryPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryPreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;element name="SummaryType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>summaryComponentType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2004}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SummaryTheme" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>TextualType">
 *                 &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2004}preferenceValueType" default="10" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SummaryDuration" type="{urn:mpeg:mpeg7:schema:2004}mediaDurationType" minOccurs="0"/>
 *         &lt;element name="MinSummaryDuration" type="{urn:mpeg:mpeg7:schema:2004}mediaDurationType" minOccurs="0"/>
 *         &lt;element name="MaxSummaryDuration" type="{urn:mpeg:mpeg7:schema:2004}mediaDurationType" minOccurs="0"/>
 *         &lt;element name="NumOfKeyFrames" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MinNumOfKeyFrames" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxNumOfKeyFrames" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumOfChars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MinNumOfChars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxNumOfChars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2004}preferenceValueType" default="10" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryPreferencesType", propOrder = {
    "summaryType",
    "summaryTheme",
    "summaryDuration",
    "minSummaryDuration",
    "maxSummaryDuration",
    "numOfKeyFrames",
    "minNumOfKeyFrames",
    "maxNumOfKeyFrames",
    "numOfChars",
    "minNumOfChars",
    "maxNumOfChars"
})
public class SummaryPreferencesType
    extends DSType
{

    @XmlElement(name = "SummaryType")
    protected List<SummaryPreferencesType.SummaryType> summaryType;
    @XmlElement(name = "SummaryTheme")
    protected List<SummaryPreferencesType.SummaryTheme> summaryTheme;
    @XmlElement(name = "SummaryDuration")
    protected String summaryDuration;
    @XmlElement(name = "MinSummaryDuration")
    protected String minSummaryDuration;
    @XmlElement(name = "MaxSummaryDuration")
    protected String maxSummaryDuration;
    @XmlElement(name = "NumOfKeyFrames")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numOfKeyFrames;
    @XmlElement(name = "MinNumOfKeyFrames")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minNumOfKeyFrames;
    @XmlElement(name = "MaxNumOfKeyFrames")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxNumOfKeyFrames;
    @XmlElement(name = "NumOfChars")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numOfChars;
    @XmlElement(name = "MinNumOfChars")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minNumOfChars;
    @XmlElement(name = "MaxNumOfChars")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxNumOfChars;
    @XmlAttribute(name = "preferenceValue")
    protected Integer preferenceValue;

    /**
     * Gets the value of the summaryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryPreferencesType.SummaryType }
     * 
     * 
     */
    public List<SummaryPreferencesType.SummaryType> getSummaryType() {
        if (summaryType == null) {
            summaryType = new ArrayList<SummaryPreferencesType.SummaryType>();
        }
        return this.summaryType;
    }

    /**
     * Gets the value of the summaryTheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryTheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryPreferencesType.SummaryTheme }
     * 
     * 
     */
    public List<SummaryPreferencesType.SummaryTheme> getSummaryTheme() {
        if (summaryTheme == null) {
            summaryTheme = new ArrayList<SummaryPreferencesType.SummaryTheme>();
        }
        return this.summaryTheme;
    }

    /**
     * Gets the value of the summaryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryDuration() {
        return summaryDuration;
    }

    /**
     * Sets the value of the summaryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryDuration(String value) {
        this.summaryDuration = value;
    }

    /**
     * Gets the value of the minSummaryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinSummaryDuration() {
        return minSummaryDuration;
    }

    /**
     * Sets the value of the minSummaryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinSummaryDuration(String value) {
        this.minSummaryDuration = value;
    }

    /**
     * Gets the value of the maxSummaryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSummaryDuration() {
        return maxSummaryDuration;
    }

    /**
     * Sets the value of the maxSummaryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSummaryDuration(String value) {
        this.maxSummaryDuration = value;
    }

    /**
     * Gets the value of the numOfKeyFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfKeyFrames() {
        return numOfKeyFrames;
    }

    /**
     * Sets the value of the numOfKeyFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfKeyFrames(BigInteger value) {
        this.numOfKeyFrames = value;
    }

    /**
     * Gets the value of the minNumOfKeyFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumOfKeyFrames() {
        return minNumOfKeyFrames;
    }

    /**
     * Sets the value of the minNumOfKeyFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumOfKeyFrames(BigInteger value) {
        this.minNumOfKeyFrames = value;
    }

    /**
     * Gets the value of the maxNumOfKeyFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumOfKeyFrames() {
        return maxNumOfKeyFrames;
    }

    /**
     * Sets the value of the maxNumOfKeyFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumOfKeyFrames(BigInteger value) {
        this.maxNumOfKeyFrames = value;
    }

    /**
     * Gets the value of the numOfChars property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfChars() {
        return numOfChars;
    }

    /**
     * Sets the value of the numOfChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfChars(BigInteger value) {
        this.numOfChars = value;
    }

    /**
     * Gets the value of the minNumOfChars property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumOfChars() {
        return minNumOfChars;
    }

    /**
     * Sets the value of the minNumOfChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumOfChars(BigInteger value) {
        this.minNumOfChars = value;
    }

    /**
     * Gets the value of the maxNumOfChars property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumOfChars() {
        return maxNumOfChars;
    }

    /**
     * Sets the value of the maxNumOfChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumOfChars(BigInteger value) {
        this.maxNumOfChars = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>TextualType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2004}preferenceValueType" default="10" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SummaryTheme
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>summaryComponentType">
     *       &lt;attribute name="preferenceValue" type="{urn:mpeg:mpeg7:schema:2004}preferenceValueType" default="10" />
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
    public static class SummaryType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "preferenceValue")
        protected Integer preferenceValue;

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
