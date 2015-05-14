//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpaceFrequencyGraphType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpaceFrequencyGraphType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}ViewDecompositionType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="View" type="{urn:mpeg:mpeg7:schema:2004}SpaceFrequencyViewType"/>
 *           &lt;element name="ViewRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="SpaceChild" type="{urn:mpeg:mpeg7:schema:2004}SpaceFrequencyGraphType"/>
 *           &lt;element name="SpaceChildRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="FrequencyChild" type="{urn:mpeg:mpeg7:schema:2004}SpaceFrequencyGraphType"/>
 *           &lt;element name="FrequencyChildRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="branching" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceFrequencyGraphType", propOrder = {
    "view",
    "viewRef",
    "spaceChildOrSpaceChildRef",
    "frequencyChildOrFrequencyChildRef"
})
public class SpaceFrequencyGraphType
    extends ViewDecompositionType
{

    @XmlElement(name = "View")
    protected SpaceFrequencyViewType view;
    @XmlElement(name = "ViewRef")
    protected ReferenceType viewRef;
    @XmlElements({
        @XmlElement(name = "SpaceChild", type = SpaceFrequencyGraphType.class),
        @XmlElement(name = "SpaceChildRef", type = ReferenceType.class)
    })
    protected List<Object> spaceChildOrSpaceChildRef;
    @XmlElements({
        @XmlElement(name = "FrequencyChild", type = SpaceFrequencyGraphType.class),
        @XmlElement(name = "FrequencyChildRef", type = ReferenceType.class)
    })
    protected List<Object> frequencyChildOrFrequencyChildRef;
    @XmlAttribute(name = "branching", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger branching;

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link SpaceFrequencyViewType }
     *     
     */
    public SpaceFrequencyViewType getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpaceFrequencyViewType }
     *     
     */
    public void setView(SpaceFrequencyViewType value) {
        this.view = value;
    }

    /**
     * Gets the value of the viewRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getViewRef() {
        return viewRef;
    }

    /**
     * Sets the value of the viewRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setViewRef(ReferenceType value) {
        this.viewRef = value;
    }

    /**
     * Gets the value of the spaceChildOrSpaceChildRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaceChildOrSpaceChildRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpaceChildOrSpaceChildRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceFrequencyGraphType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getSpaceChildOrSpaceChildRef() {
        if (spaceChildOrSpaceChildRef == null) {
            spaceChildOrSpaceChildRef = new ArrayList<Object>();
        }
        return this.spaceChildOrSpaceChildRef;
    }

    /**
     * Gets the value of the frequencyChildOrFrequencyChildRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencyChildOrFrequencyChildRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencyChildOrFrequencyChildRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceFrequencyGraphType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getFrequencyChildOrFrequencyChildRef() {
        if (frequencyChildOrFrequencyChildRef == null) {
            frequencyChildOrFrequencyChildRef = new ArrayList<Object>();
        }
        return this.frequencyChildOrFrequencyChildRef;
    }

    /**
     * Gets the value of the branching property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBranching() {
        return branching;
    }

    /**
     * Sets the value of the branching property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBranching(BigInteger value) {
        this.branching = value;
    }

}
