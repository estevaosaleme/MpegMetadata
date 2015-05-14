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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraMotionSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraMotionSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaTime" type="{urn:mpeg:mpeg7:schema:2004}MediaTimeType"/>
 *         &lt;element name="FocusOfExpansion" type="{urn:mpeg:mpeg7:schema:2004}FocusOfExpansionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraMotionSegmentType", propOrder = {
    "mediaTime",
    "focusOfExpansion"
})
@XmlSeeAlso({
    MixtureCameraMotionSegmentType.class,
    NonMixtureCameraMotionSegmentType.class
})
public abstract class CameraMotionSegmentType {

    @XmlElement(name = "MediaTime", required = true)
    protected MediaTimeType mediaTime;
    @XmlElement(name = "FocusOfExpansion")
    protected FocusOfExpansionType focusOfExpansion;

    /**
     * Gets the value of the mediaTime property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTimeType }
     *     
     */
    public MediaTimeType getMediaTime() {
        return mediaTime;
    }

    /**
     * Sets the value of the mediaTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTimeType }
     *     
     */
    public void setMediaTime(MediaTimeType value) {
        this.mediaTime = value;
    }

    /**
     * Gets the value of the focusOfExpansion property.
     * 
     * @return
     *     possible object is
     *     {@link FocusOfExpansionType }
     *     
     */
    public FocusOfExpansionType getFocusOfExpansion() {
        return focusOfExpansion;
    }

    /**
     * Sets the value of the focusOfExpansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOfExpansionType }
     *     
     */
    public void setFocusOfExpansion(FocusOfExpansionType value) {
        this.focusOfExpansion = value;
    }

}
