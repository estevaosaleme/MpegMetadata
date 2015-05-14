//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpatialMaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpatialMaskType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}MaskType">
 *       &lt;sequence>
 *         &lt;element name="SubRegion" type="{urn:mpeg:mpeg7:schema:2004}RegionLocatorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialMaskType", propOrder = {
    "subRegion"
})
public class SpatialMaskType
    extends MaskType
{

    @XmlElement(name = "SubRegion", required = true)
    protected List<RegionLocatorType> subRegion;

    /**
     * Gets the value of the subRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionLocatorType }
     * 
     * 
     */
    public List<RegionLocatorType> getSubRegion() {
        if (subRegion == null) {
            subRegion = new ArrayList<RegionLocatorType>();
        }
        return this.subRegion;
    }

}
