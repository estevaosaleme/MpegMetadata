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
 * <p>Java class for ViewSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}ViewDecompositionType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="View" type="{urn:mpeg:mpeg7:schema:2004}ViewType"/>
 *         &lt;element name="ViewRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *       &lt;attribute name="setProperty">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                 &lt;enumeration value="space"/>
 *                 &lt;enumeration value="frequency"/>
 *                 &lt;enumeration value="subband"/>
 *                 &lt;enumeration value="uniformSubband"/>
 *                 &lt;enumeration value="wavelet"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termAliasReferenceType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termURIReferenceType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewSetType", propOrder = {
    "viewOrViewRef"
})
public class ViewSetType
    extends ViewDecompositionType
{

    @XmlElements({
        @XmlElement(name = "View", type = ViewType.class),
        @XmlElement(name = "ViewRef", type = ReferenceType.class)
    })
    protected List<Object> viewOrViewRef;
    @XmlAttribute(name = "setProperty")
    protected String setProperty;

    /**
     * Gets the value of the viewOrViewRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewOrViewRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewOrViewRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getViewOrViewRef() {
        if (viewOrViewRef == null) {
            viewOrViewRef = new ArrayList<Object>();
        }
        return this.viewOrViewRef;
    }

    /**
     * Gets the value of the setProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetProperty() {
        return setProperty;
    }

    /**
     * Sets the value of the setProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetProperty(String value) {
        this.setProperty = value;
    }

}
