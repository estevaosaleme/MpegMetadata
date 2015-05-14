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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StillRegionSpatialDecompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StillRegionSpatialDecompositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SpatialSegmentDecompositionType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="StillRegion" type="{urn:mpeg:mpeg7:schema:2004}StillRegionType"/>
 *         &lt;element name="StillRegionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StillRegionSpatialDecompositionType", propOrder = {
    "stillRegionOrStillRegionRef"
})
public class StillRegionSpatialDecompositionType
    extends SpatialSegmentDecompositionType
{

    @XmlElements({
        @XmlElement(name = "StillRegion", type = StillRegionType.class),
        @XmlElement(name = "StillRegionRef", type = ReferenceType.class)
    })
    protected List<Object> stillRegionOrStillRegionRef;

    /**
     * Gets the value of the stillRegionOrStillRegionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stillRegionOrStillRegionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStillRegionOrStillRegionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StillRegionType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getStillRegionOrStillRegionRef() {
        if (stillRegionOrStillRegionRef == null) {
            stillRegionOrStillRegionRef = new ArrayList<Object>();
        }
        return this.stillRegionOrStillRegionRef;
    }

}
