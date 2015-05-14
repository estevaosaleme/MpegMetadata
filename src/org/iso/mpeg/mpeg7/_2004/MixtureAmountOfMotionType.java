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
 * <p>Java class for MixtureAmountOfMotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MixtureAmountOfMotionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackLeft" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="TrackRight" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="BoomDown" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="BoomUp" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="DollyForward" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="DollyBackward" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="PanLeft" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="PanRight" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="TiltDown" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="TiltUp" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="RollClockwise" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="RollAnticlockwise" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="ZoomIn" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *         &lt;element name="ZoomOut" type="{urn:mpeg:mpeg7:schema:2004}unsigned11" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MixtureAmountOfMotionType", propOrder = {
    "trackLeft",
    "trackRight",
    "boomDown",
    "boomUp",
    "dollyForward",
    "dollyBackward",
    "panLeft",
    "panRight",
    "tiltDown",
    "tiltUp",
    "rollClockwise",
    "rollAnticlockwise",
    "zoomIn",
    "zoomOut"
})
public class MixtureAmountOfMotionType {

    @XmlElement(name = "TrackLeft")
    protected Integer trackLeft;
    @XmlElement(name = "TrackRight")
    protected Integer trackRight;
    @XmlElement(name = "BoomDown")
    protected Integer boomDown;
    @XmlElement(name = "BoomUp")
    protected Integer boomUp;
    @XmlElement(name = "DollyForward")
    protected Integer dollyForward;
    @XmlElement(name = "DollyBackward")
    protected Integer dollyBackward;
    @XmlElement(name = "PanLeft")
    protected Integer panLeft;
    @XmlElement(name = "PanRight")
    protected Integer panRight;
    @XmlElement(name = "TiltDown")
    protected Integer tiltDown;
    @XmlElement(name = "TiltUp")
    protected Integer tiltUp;
    @XmlElement(name = "RollClockwise")
    protected Integer rollClockwise;
    @XmlElement(name = "RollAnticlockwise")
    protected Integer rollAnticlockwise;
    @XmlElement(name = "ZoomIn")
    protected Integer zoomIn;
    @XmlElement(name = "ZoomOut")
    protected Integer zoomOut;

    /**
     * Gets the value of the trackLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackLeft() {
        return trackLeft;
    }

    /**
     * Sets the value of the trackLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackLeft(Integer value) {
        this.trackLeft = value;
    }

    /**
     * Gets the value of the trackRight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackRight() {
        return trackRight;
    }

    /**
     * Sets the value of the trackRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackRight(Integer value) {
        this.trackRight = value;
    }

    /**
     * Gets the value of the boomDown property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoomDown() {
        return boomDown;
    }

    /**
     * Sets the value of the boomDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoomDown(Integer value) {
        this.boomDown = value;
    }

    /**
     * Gets the value of the boomUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoomUp() {
        return boomUp;
    }

    /**
     * Sets the value of the boomUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoomUp(Integer value) {
        this.boomUp = value;
    }

    /**
     * Gets the value of the dollyForward property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDollyForward() {
        return dollyForward;
    }

    /**
     * Sets the value of the dollyForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDollyForward(Integer value) {
        this.dollyForward = value;
    }

    /**
     * Gets the value of the dollyBackward property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDollyBackward() {
        return dollyBackward;
    }

    /**
     * Sets the value of the dollyBackward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDollyBackward(Integer value) {
        this.dollyBackward = value;
    }

    /**
     * Gets the value of the panLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPanLeft() {
        return panLeft;
    }

    /**
     * Sets the value of the panLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPanLeft(Integer value) {
        this.panLeft = value;
    }

    /**
     * Gets the value of the panRight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPanRight() {
        return panRight;
    }

    /**
     * Sets the value of the panRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPanRight(Integer value) {
        this.panRight = value;
    }

    /**
     * Gets the value of the tiltDown property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTiltDown() {
        return tiltDown;
    }

    /**
     * Sets the value of the tiltDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTiltDown(Integer value) {
        this.tiltDown = value;
    }

    /**
     * Gets the value of the tiltUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTiltUp() {
        return tiltUp;
    }

    /**
     * Sets the value of the tiltUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTiltUp(Integer value) {
        this.tiltUp = value;
    }

    /**
     * Gets the value of the rollClockwise property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRollClockwise() {
        return rollClockwise;
    }

    /**
     * Sets the value of the rollClockwise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRollClockwise(Integer value) {
        this.rollClockwise = value;
    }

    /**
     * Gets the value of the rollAnticlockwise property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRollAnticlockwise() {
        return rollAnticlockwise;
    }

    /**
     * Sets the value of the rollAnticlockwise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRollAnticlockwise(Integer value) {
        this.rollAnticlockwise = value;
    }

    /**
     * Gets the value of the zoomIn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZoomIn() {
        return zoomIn;
    }

    /**
     * Sets the value of the zoomIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoomIn(Integer value) {
        this.zoomIn = value;
    }

    /**
     * Gets the value of the zoomOut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZoomOut() {
        return zoomOut;
    }

    /**
     * Sets the value of the zoomOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoomOut(Integer value) {
        this.zoomOut = value;
    }

}
