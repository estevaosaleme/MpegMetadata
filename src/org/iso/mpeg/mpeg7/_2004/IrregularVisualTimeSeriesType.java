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
 * <p>Java class for IrregularVisualTimeSeriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrregularVisualTimeSeriesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualTimeSeriesType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Descriptor" type="{urn:mpeg:mpeg7:schema:2004}VisualDType"/>
 *         &lt;element name="Interval" type="{urn:mpeg:mpeg7:schema:2004}unsigned32"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrregularVisualTimeSeriesType", propOrder = {
    "descriptorAndInterval"
})
public class IrregularVisualTimeSeriesType
    extends VisualTimeSeriesType
{

    @XmlElements({
        @XmlElement(name = "Descriptor", required = true, type = VisualDType.class),
        @XmlElement(name = "Interval", required = true, type = Long.class)
    })
    protected List<Object> descriptorAndInterval;

    /**
     * Gets the value of the descriptorAndInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptorAndInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptorAndInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualDType }
     * {@link Long }
     * 
     * 
     */
    public List<Object> getDescriptorAndInterval() {
        if (descriptorAndInterval == null) {
            descriptorAndInterval = new ArrayList<Object>();
        }
        return this.descriptorAndInterval;
    }

}
