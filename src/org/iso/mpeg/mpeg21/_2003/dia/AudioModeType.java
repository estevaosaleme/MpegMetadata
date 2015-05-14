//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioModeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioModeType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;attribute name="samplingFrequency" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="bitsPerSample" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioModeType")
public class AudioModeType
    extends DIABaseType
{

    @XmlAttribute(name = "samplingFrequency")
    protected Float samplingFrequency;
    @XmlAttribute(name = "bitsPerSample")
    protected BigInteger bitsPerSample;

    /**
     * Gets the value of the samplingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSamplingFrequency() {
        return samplingFrequency;
    }

    /**
     * Sets the value of the samplingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSamplingFrequency(Float value) {
        this.samplingFrequency = value;
    }

    /**
     * Gets the value of the bitsPerSample property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBitsPerSample() {
        return bitsPerSample;
    }

    /**
     * Sets the value of the bitsPerSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBitsPerSample(BigInteger value) {
        this.bitsPerSample = value;
    }

}
