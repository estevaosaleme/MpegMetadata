//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GofGopFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GofGopFeatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descriptor" type="{urn:mpeg:mpeg7:schema:2004}VisualDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="aggregation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Average"/>
 *             &lt;enumeration value="Median"/>
 *             &lt;enumeration value="SplitMerge"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GofGopFeatureType", propOrder = {
    "descriptor"
})
public class GofGopFeatureType {

    @XmlElement(name = "Descriptor", required = true)
    protected VisualDType descriptor;
    @XmlAttribute(name = "aggregation")
    protected String aggregation;

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link VisualDType }
     *     
     */
    public VisualDType getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualDType }
     *     
     */
    public void setDescriptor(VisualDType value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregation(String value) {
        this.aggregation = value;
    }

}
