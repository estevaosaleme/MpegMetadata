//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package org.iso.mpeg.mpegv._2010.scdv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XminValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="XmaxValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="YminValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="YmaxValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ZminValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ZmaxValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeType", propOrder = {
    "xminValue",
    "xmaxValue",
    "yminValue",
    "ymaxValue",
    "zminValue",
    "zmaxValue"
})
public class RangeType {

    @XmlElement(name = "XminValue")
    protected float xminValue;
    @XmlElement(name = "XmaxValue")
    protected float xmaxValue;
    @XmlElement(name = "YminValue")
    protected float yminValue;
    @XmlElement(name = "YmaxValue")
    protected float ymaxValue;
    @XmlElement(name = "ZminValue")
    protected float zminValue;
    @XmlElement(name = "ZmaxValue")
    protected float zmaxValue;

    /**
     * Gets the value of the xminValue property.
     * 
     */
    public float getXminValue() {
        return xminValue;
    }

    /**
     * Sets the value of the xminValue property.
     * 
     */
    public void setXminValue(float value) {
        this.xminValue = value;
    }

    /**
     * Gets the value of the xmaxValue property.
     * 
     */
    public float getXmaxValue() {
        return xmaxValue;
    }

    /**
     * Sets the value of the xmaxValue property.
     * 
     */
    public void setXmaxValue(float value) {
        this.xmaxValue = value;
    }

    /**
     * Gets the value of the yminValue property.
     * 
     */
    public float getYminValue() {
        return yminValue;
    }

    /**
     * Sets the value of the yminValue property.
     * 
     */
    public void setYminValue(float value) {
        this.yminValue = value;
    }

    /**
     * Gets the value of the ymaxValue property.
     * 
     */
    public float getYmaxValue() {
        return ymaxValue;
    }

    /**
     * Sets the value of the ymaxValue property.
     * 
     */
    public void setYmaxValue(float value) {
        this.ymaxValue = value;
    }

    /**
     * Gets the value of the zminValue property.
     * 
     */
    public float getZminValue() {
        return zminValue;
    }

    /**
     * Sets the value of the zminValue property.
     * 
     */
    public void setZminValue(float value) {
        this.zminValue = value;
    }

    /**
     * Gets the value of the zmaxValue property.
     * 
     */
    public float getZmaxValue() {
        return zmaxValue;
    }

    /**
     * Sets the value of the zmaxValue property.
     * 
     */
    public void setZmaxValue(float value) {
        this.zmaxValue = value;
    }

}
