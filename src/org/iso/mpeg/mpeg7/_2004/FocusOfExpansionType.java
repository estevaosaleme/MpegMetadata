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
 * <p>Java class for FocusOfExpansionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FocusOfExpansionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HorizontalPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="VerticalPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusOfExpansionType", propOrder = {
    "horizontalPosition",
    "verticalPosition"
})
public class FocusOfExpansionType {

    @XmlElement(name = "HorizontalPosition")
    protected float horizontalPosition;
    @XmlElement(name = "VerticalPosition")
    protected float verticalPosition;

    /**
     * Gets the value of the horizontalPosition property.
     * 
     */
    public float getHorizontalPosition() {
        return horizontalPosition;
    }

    /**
     * Sets the value of the horizontalPosition property.
     * 
     */
    public void setHorizontalPosition(float value) {
        this.horizontalPosition = value;
    }

    /**
     * Gets the value of the verticalPosition property.
     * 
     */
    public float getVerticalPosition() {
        return verticalPosition;
    }

    /**
     * Sets the value of the verticalPosition property.
     * 
     */
    public void setVerticalPosition(float value) {
        this.verticalPosition = value;
    }

}
