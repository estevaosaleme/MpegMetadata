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
 * <p>Java class for AudioVisualSegmentSpatioTemporalDecompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualSegmentSpatioTemporalDecompositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SpatioTemporalSegmentDecompositionType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="AudioVisualRegion" type="{urn:mpeg:mpeg7:schema:2004}AudioVisualRegionType"/>
 *         &lt;element name="AudioVisualRegionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualSegmentSpatioTemporalDecompositionType", propOrder = {
    "audioVisualRegionOrAudioVisualRegionRef"
})
public class AudioVisualSegmentSpatioTemporalDecompositionType
    extends SpatioTemporalSegmentDecompositionType
{

    @XmlElements({
        @XmlElement(name = "AudioVisualRegion", type = AudioVisualRegionType.class),
        @XmlElement(name = "AudioVisualRegionRef", type = ReferenceType.class)
    })
    protected List<Object> audioVisualRegionOrAudioVisualRegionRef;

    /**
     * Gets the value of the audioVisualRegionOrAudioVisualRegionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualRegionOrAudioVisualRegionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualRegionOrAudioVisualRegionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVisualRegionType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getAudioVisualRegionOrAudioVisualRegionRef() {
        if (audioVisualRegionOrAudioVisualRegionRef == null) {
            audioVisualRegionOrAudioVisualRegionRef = new ArrayList<Object>();
        }
        return this.audioVisualRegionOrAudioVisualRegionRef;
    }

}
