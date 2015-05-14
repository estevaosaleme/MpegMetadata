//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package org.iso.mpeg.mpegv._2010.dcdv;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclineCapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InclineCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="maxPitchAngle" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}InclineAngleType" />
 *       &lt;attribute name="maxYawAngle" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}InclineAngleType" />
 *       &lt;attribute name="maxRollAngle" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}InclineAngleType" />
 *       &lt;attribute name="maxPitchSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxYawSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxRollSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="speedUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="maxPitchAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxYawAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxRollAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="accelUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="pitchAngleLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="yawAngleLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="rollAngleLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="pitchSpeedLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="yawSpeedLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="rollSpeedLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="pitchAccelLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="yawAccelLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="rollAccelLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclineCapabilityType")
public class InclineCapabilityType {

    @XmlAttribute(name = "maxPitchAngle")
    protected Integer maxPitchAngle;
    @XmlAttribute(name = "maxYawAngle")
    protected Integer maxYawAngle;
    @XmlAttribute(name = "maxRollAngle")
    protected Integer maxRollAngle;
    @XmlAttribute(name = "maxPitchSpeed")
    protected Float maxPitchSpeed;
    @XmlAttribute(name = "maxYawSpeed")
    protected Float maxYawSpeed;
    @XmlAttribute(name = "maxRollSpeed")
    protected Float maxRollSpeed;
    @XmlAttribute(name = "speedUnit")
    protected String speedUnit;
    @XmlAttribute(name = "maxPitchAccel")
    protected Float maxPitchAccel;
    @XmlAttribute(name = "maxYawAccel")
    protected Float maxYawAccel;
    @XmlAttribute(name = "maxRollAccel")
    protected Float maxRollAccel;
    @XmlAttribute(name = "accelUnit")
    protected String accelUnit;
    @XmlAttribute(name = "pitchAngleLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pitchAngleLevels;
    @XmlAttribute(name = "yawAngleLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger yawAngleLevels;
    @XmlAttribute(name = "rollAngleLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rollAngleLevels;
    @XmlAttribute(name = "pitchSpeedLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pitchSpeedLevels;
    @XmlAttribute(name = "yawSpeedLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger yawSpeedLevels;
    @XmlAttribute(name = "rollSpeedLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rollSpeedLevels;
    @XmlAttribute(name = "pitchAccelLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pitchAccelLevels;
    @XmlAttribute(name = "yawAccelLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger yawAccelLevels;
    @XmlAttribute(name = "rollAccelLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rollAccelLevels;

    /**
     * Gets the value of the maxPitchAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPitchAngle() {
        return maxPitchAngle;
    }

    /**
     * Sets the value of the maxPitchAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPitchAngle(Integer value) {
        this.maxPitchAngle = value;
    }

    /**
     * Gets the value of the maxYawAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxYawAngle() {
        return maxYawAngle;
    }

    /**
     * Sets the value of the maxYawAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxYawAngle(Integer value) {
        this.maxYawAngle = value;
    }

    /**
     * Gets the value of the maxRollAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRollAngle() {
        return maxRollAngle;
    }

    /**
     * Sets the value of the maxRollAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRollAngle(Integer value) {
        this.maxRollAngle = value;
    }

    /**
     * Gets the value of the maxPitchSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPitchSpeed() {
        return maxPitchSpeed;
    }

    /**
     * Sets the value of the maxPitchSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPitchSpeed(Float value) {
        this.maxPitchSpeed = value;
    }

    /**
     * Gets the value of the maxYawSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxYawSpeed() {
        return maxYawSpeed;
    }

    /**
     * Sets the value of the maxYawSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxYawSpeed(Float value) {
        this.maxYawSpeed = value;
    }

    /**
     * Gets the value of the maxRollSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRollSpeed() {
        return maxRollSpeed;
    }

    /**
     * Sets the value of the maxRollSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxRollSpeed(Float value) {
        this.maxRollSpeed = value;
    }

    /**
     * Gets the value of the speedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedUnit() {
        return speedUnit;
    }

    /**
     * Sets the value of the speedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedUnit(String value) {
        this.speedUnit = value;
    }

    /**
     * Gets the value of the maxPitchAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPitchAccel() {
        return maxPitchAccel;
    }

    /**
     * Sets the value of the maxPitchAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPitchAccel(Float value) {
        this.maxPitchAccel = value;
    }

    /**
     * Gets the value of the maxYawAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxYawAccel() {
        return maxYawAccel;
    }

    /**
     * Sets the value of the maxYawAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxYawAccel(Float value) {
        this.maxYawAccel = value;
    }

    /**
     * Gets the value of the maxRollAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRollAccel() {
        return maxRollAccel;
    }

    /**
     * Sets the value of the maxRollAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxRollAccel(Float value) {
        this.maxRollAccel = value;
    }

    /**
     * Gets the value of the accelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccelUnit() {
        return accelUnit;
    }

    /**
     * Sets the value of the accelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccelUnit(String value) {
        this.accelUnit = value;
    }

    /**
     * Gets the value of the pitchAngleLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPitchAngleLevels() {
        return pitchAngleLevels;
    }

    /**
     * Sets the value of the pitchAngleLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPitchAngleLevels(BigInteger value) {
        this.pitchAngleLevels = value;
    }

    /**
     * Gets the value of the yawAngleLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYawAngleLevels() {
        return yawAngleLevels;
    }

    /**
     * Sets the value of the yawAngleLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYawAngleLevels(BigInteger value) {
        this.yawAngleLevels = value;
    }

    /**
     * Gets the value of the rollAngleLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRollAngleLevels() {
        return rollAngleLevels;
    }

    /**
     * Sets the value of the rollAngleLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRollAngleLevels(BigInteger value) {
        this.rollAngleLevels = value;
    }

    /**
     * Gets the value of the pitchSpeedLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPitchSpeedLevels() {
        return pitchSpeedLevels;
    }

    /**
     * Sets the value of the pitchSpeedLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPitchSpeedLevels(BigInteger value) {
        this.pitchSpeedLevels = value;
    }

    /**
     * Gets the value of the yawSpeedLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYawSpeedLevels() {
        return yawSpeedLevels;
    }

    /**
     * Sets the value of the yawSpeedLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYawSpeedLevels(BigInteger value) {
        this.yawSpeedLevels = value;
    }

    /**
     * Gets the value of the rollSpeedLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRollSpeedLevels() {
        return rollSpeedLevels;
    }

    /**
     * Sets the value of the rollSpeedLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRollSpeedLevels(BigInteger value) {
        this.rollSpeedLevels = value;
    }

    /**
     * Gets the value of the pitchAccelLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPitchAccelLevels() {
        return pitchAccelLevels;
    }

    /**
     * Sets the value of the pitchAccelLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPitchAccelLevels(BigInteger value) {
        this.pitchAccelLevels = value;
    }

    /**
     * Gets the value of the yawAccelLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYawAccelLevels() {
        return yawAccelLevels;
    }

    /**
     * Sets the value of the yawAccelLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYawAccelLevels(BigInteger value) {
        this.yawAccelLevels = value;
    }

    /**
     * Gets the value of the rollAccelLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRollAccelLevels() {
        return rollAccelLevels;
    }

    /**
     * Sets the value of the rollAccelLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRollAccelLevels(BigInteger value) {
        this.rollAccelLevels = value;
    }

}
