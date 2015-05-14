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
 * <p>Java class for AnalyticEditedVideoSegmentSpatioTemporalDecompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticEditedVideoSegmentSpatioTemporalDecompositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SpatioTemporalSegmentDecompositionType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="EditedMovingRegion" type="{urn:mpeg:mpeg7:schema:2004}EditedMovingRegionType"/>
 *         &lt;element name="EditedMovingRegionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticEditedVideoSegmentSpatioTemporalDecompositionType", propOrder = {
    "editedMovingRegionOrEditedMovingRegionRef"
})
public class AnalyticEditedVideoSegmentSpatioTemporalDecompositionType
    extends SpatioTemporalSegmentDecompositionType
{

    @XmlElements({
        @XmlElement(name = "EditedMovingRegion", type = EditedMovingRegionType.class),
        @XmlElement(name = "EditedMovingRegionRef", type = ReferenceType.class)
    })
    protected List<Object> editedMovingRegionOrEditedMovingRegionRef;

    /**
     * Gets the value of the editedMovingRegionOrEditedMovingRegionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editedMovingRegionOrEditedMovingRegionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditedMovingRegionOrEditedMovingRegionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditedMovingRegionType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getEditedMovingRegionOrEditedMovingRegionRef() {
        if (editedMovingRegionOrEditedMovingRegionRef == null) {
            editedMovingRegionOrEditedMovingRegionRef = new ArrayList<Object>();
        }
        return this.editedMovingRegionOrEditedMovingRegionRef;
    }

}