//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabletType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabletType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserInteractionInputSupportBaseType">
 *       &lt;sequence>
 *         &lt;element name="Tablet" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}GenericPenType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabletType", propOrder = {
    "tablet"
})
public class TabletType
    extends UserInteractionInputSupportBaseType
{

    @XmlElement(name = "Tablet", required = true)
    protected GenericPenType tablet;

    /**
     * Gets the value of the tablet property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPenType }
     *     
     */
    public GenericPenType getTablet() {
        return tablet;
    }

    /**
     * Sets the value of the tablet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPenType }
     *     
     */
    public void setTablet(GenericPenType value) {
        this.tablet = value;
    }

}
