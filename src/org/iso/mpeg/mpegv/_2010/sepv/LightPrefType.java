//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package org.iso.mpeg.mpegv._2010.sepv;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.iso.mpeg.mpegv._2010.cidl.UserSensoryPreferenceBaseType;


/**
 * <p>Java class for LightPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LightPrefType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}UserSensoryPreferenceBaseType">
 *       &lt;sequence>
 *         &lt;element name="UnfavorableColor" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}colorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="maxIntensity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="unit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightPrefType", propOrder = {
    "unfavorableColor"
})
@XmlSeeAlso({
    FlashPrefType.class
})
public class LightPrefType
    extends UserSensoryPreferenceBaseType
{

    @XmlElementRef(name = "UnfavorableColor", namespace = "urn:mpeg:mpeg-v:2010:01-SEPV-NS", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> unfavorableColor;
    @XmlAttribute(name = "maxIntensity")
    protected BigInteger maxIntensity;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the unfavorableColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unfavorableColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnfavorableColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getUnfavorableColor() {
        if (unfavorableColor == null) {
            unfavorableColor = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.unfavorableColor;
    }

    /**
     * Gets the value of the maxIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIntensity() {
        return maxIntensity;
    }

    /**
     * Sets the value of the maxIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIntensity(BigInteger value) {
        this.maxIntensity = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}