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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleViewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="16">
 *         &lt;element name="IsVisible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Descriptor" type="{urn:mpeg:mpeg7:schema:2004}VisualDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fixedViewsFlag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleViewType", propOrder = {
    "isVisibleAndDescriptor"
})
public class MultipleViewType {

    @XmlElements({
        @XmlElement(name = "IsVisible", required = true, type = Boolean.class),
        @XmlElement(name = "Descriptor", required = true, type = VisualDType.class)
    })
    protected List<Object> isVisibleAndDescriptor;
    @XmlAttribute(name = "fixedViewsFlag", required = true)
    protected boolean fixedViewsFlag;

    /**
     * Gets the value of the isVisibleAndDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isVisibleAndDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsVisibleAndDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * {@link VisualDType }
     * 
     * 
     */
    public List<Object> getIsVisibleAndDescriptor() {
        if (isVisibleAndDescriptor == null) {
            isVisibleAndDescriptor = new ArrayList<Object>();
        }
        return this.isVisibleAndDescriptor;
    }

    /**
     * Gets the value of the fixedViewsFlag property.
     * 
     */
    public boolean isFixedViewsFlag() {
        return fixedViewsFlag;
    }

    /**
     * Sets the value of the fixedViewsFlag property.
     * 
     */
    public void setFixedViewsFlag(boolean value) {
        this.fixedViewsFlag = value;
    }

}