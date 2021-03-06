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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundModelStatePathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoundModelStatePathType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AudioDSType">
 *       &lt;sequence>
 *         &lt;element name="StatePath" type="{urn:mpeg:mpeg7:schema:2004}AudioLLDScalarType"/>
 *         &lt;element name="SoundModelRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundModelStatePathType", propOrder = {
    "statePath",
    "soundModelRef"
})
public class SoundModelStatePathType
    extends AudioDSType
{

    @XmlElement(name = "StatePath", required = true)
    protected AudioLLDScalarType statePath;
    @XmlElement(name = "SoundModelRef", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String soundModelRef;

    /**
     * Gets the value of the statePath property.
     * 
     * @return
     *     possible object is
     *     {@link AudioLLDScalarType }
     *     
     */
    public AudioLLDScalarType getStatePath() {
        return statePath;
    }

    /**
     * Sets the value of the statePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioLLDScalarType }
     *     
     */
    public void setStatePath(AudioLLDScalarType value) {
        this.statePath = value;
    }

    /**
     * Gets the value of the soundModelRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoundModelRef() {
        return soundModelRef;
    }

    /**
     * Sets the value of the soundModelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoundModelRef(String value) {
        this.soundModelRef = value;
    }

}
