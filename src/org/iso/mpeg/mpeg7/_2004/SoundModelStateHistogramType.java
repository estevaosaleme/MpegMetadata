//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundModelStateHistogramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoundModelStateHistogramType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AudioDType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="StateRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="RelativeFrequency" type="{urn:mpeg:mpeg7:schema:2004}nonNegativeReal"/>
 *         &lt;/sequence>
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
@XmlType(name = "SoundModelStateHistogramType", propOrder = {
    "stateRefAndRelativeFrequency",
    "soundModelRef"
})
public class SoundModelStateHistogramType
    extends AudioDType
{

    @XmlElements({
        @XmlElement(name = "StateRef", required = true, type = String.class),
        @XmlElement(name = "RelativeFrequency", required = true, type = Double.class)
    })
    protected List<Serializable> stateRefAndRelativeFrequency;
    @XmlElement(name = "SoundModelRef", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String soundModelRef;

    /**
     * Gets the value of the stateRefAndRelativeFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateRefAndRelativeFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateRefAndRelativeFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Double }
     * 
     * 
     */
    public List<Serializable> getStateRefAndRelativeFrequency() {
        if (stateRefAndRelativeFrequency == null) {
            stateRefAndRelativeFrequency = new ArrayList<Serializable>();
        }
        return this.stateRefAndRelativeFrequency;
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
