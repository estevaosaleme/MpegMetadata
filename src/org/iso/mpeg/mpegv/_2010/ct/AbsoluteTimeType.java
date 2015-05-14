//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpegv._2010.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbsoluteTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsoluteTimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-CT-NS}TimeStampType">
 *       &lt;attribute name="absTimeScheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="absTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteTimeType")
public class AbsoluteTimeType
    extends TimeStampType
{

    @XmlAttribute(name = "absTimeScheme")
    protected String absTimeScheme;
    @XmlAttribute(name = "absTime")
    protected String absTime;

    /**
     * Gets the value of the absTimeScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsTimeScheme() {
        return absTimeScheme;
    }

    /**
     * Sets the value of the absTimeScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsTimeScheme(String value) {
        this.absTimeScheme = value;
    }

    /**
     * Gets the value of the absTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsTime() {
        return absTime;
    }

    /**
     * Sets the value of the absTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsTime(String value) {
        this.absTime = value;
    }

}
