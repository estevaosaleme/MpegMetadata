//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpegv._2010.sev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="directionH" type="{urn:mpeg:mpeg-v:2010:01-SEV-NS}MoveTowardAngleType" default="0" />
 *       &lt;attribute name="directionV" type="{urn:mpeg:mpeg-v:2010:01-SEV-NS}MoveTowardAngleType" default="0" />
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollideType")
public class CollideType {

    @XmlAttribute(name = "directionH")
    protected Integer directionH;
    @XmlAttribute(name = "directionV")
    protected Integer directionV;
    @XmlAttribute(name = "speed")
    protected Float speed;

    /**
     * Gets the value of the directionH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDirectionH() {
        if (directionH == null) {
            return  0;
        } else {
            return directionH;
        }
    }

    /**
     * Sets the value of the directionH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectionH(Integer value) {
        this.directionH = value;
    }

    /**
     * Gets the value of the directionV property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDirectionV() {
        if (directionV == null) {
            return  0;
        } else {
            return directionV;
        }
    }

    /**
     * Sets the value of the directionV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectionV(Integer value) {
        this.directionV = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

}
