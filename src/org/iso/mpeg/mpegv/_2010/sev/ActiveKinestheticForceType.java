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
 * <p>Java class for ActiveKinestheticForceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveKinestheticForceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fx" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="fy" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="fz" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="tx" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ty" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="tz" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveKinestheticForceType")
public class ActiveKinestheticForceType {

    @XmlAttribute(name = "fx")
    protected Float fx;
    @XmlAttribute(name = "fy")
    protected Float fy;
    @XmlAttribute(name = "fz")
    protected Float fz;
    @XmlAttribute(name = "tx")
    protected Float tx;
    @XmlAttribute(name = "ty")
    protected Float ty;
    @XmlAttribute(name = "tz")
    protected Float tz;

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFx() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFx(Float value) {
        this.fx = value;
    }

    /**
     * Gets the value of the fy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFy() {
        return fy;
    }

    /**
     * Sets the value of the fy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFy(Float value) {
        this.fy = value;
    }

    /**
     * Gets the value of the fz property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFz() {
        return fz;
    }

    /**
     * Sets the value of the fz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFz(Float value) {
        this.fz = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTx(Float value) {
        this.tx = value;
    }

    /**
     * Gets the value of the ty property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTy() {
        return ty;
    }

    /**
     * Sets the value of the ty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTy(Float value) {
        this.ty = value;
    }

    /**
     * Gets the value of the tz property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTz() {
        return tz;
    }

    /**
     * Sets the value of the tz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTz(Float value) {
        this.tz = value;
    }

}
