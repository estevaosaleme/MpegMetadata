//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioSignatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioSignatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AudioDSType">
 *       &lt;sequence>
 *         &lt;element name="Flatness" type="{urn:mpeg:mpeg7:schema:2004}AudioSpectrumFlatnessType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioSignatureType", propOrder = {
    "flatness"
})
public class AudioSignatureType
    extends AudioDSType
{

    @XmlElement(name = "Flatness", required = true)
    protected AudioSpectrumFlatnessType flatness;

    /**
     * Gets the value of the flatness property.
     * 
     * @return
     *     possible object is
     *     {@link AudioSpectrumFlatnessType }
     *     
     */
    public AudioSpectrumFlatnessType getFlatness() {
        return flatness;
    }

    /**
     * Sets the value of the flatness property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSpectrumFlatnessType }
     *     
     */
    public void setFlatness(AudioSpectrumFlatnessType value) {
        this.flatness = value;
    }

}
