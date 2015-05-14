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
 * <p>Java class for VideoSegmentMediaSourceDecompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSegmentMediaSourceDecompositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}MediaSourceSegmentDecompositionType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="VideoSegment" type="{urn:mpeg:mpeg7:schema:2004}VideoSegmentType"/>
 *         &lt;element name="VideoSegmentRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSegmentMediaSourceDecompositionType", propOrder = {
    "videoSegmentOrVideoSegmentRef"
})
public class VideoSegmentMediaSourceDecompositionType
    extends MediaSourceSegmentDecompositionType
{

    @XmlElements({
        @XmlElement(name = "VideoSegment", type = VideoSegmentType.class),
        @XmlElement(name = "VideoSegmentRef", type = ReferenceType.class)
    })
    protected List<Object> videoSegmentOrVideoSegmentRef;

    /**
     * Gets the value of the videoSegmentOrVideoSegmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoSegmentOrVideoSegmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoSegmentOrVideoSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoSegmentType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getVideoSegmentOrVideoSegmentRef() {
        if (videoSegmentOrVideoSegmentRef == null) {
            videoSegmentOrVideoSegmentRef = new ArrayList<Object>();
        }
        return this.videoSegmentOrVideoSegmentRef;
    }

}