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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShapeVariationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeVariationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualDType">
 *       &lt;sequence>
 *         &lt;element name="StaticShapeVariation">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned4" />
 *               &lt;/simpleType>
 *               &lt;length value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DynamicShapeVariation">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned4" />
 *               &lt;/simpleType>
 *               &lt;length value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatisticalVariation">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned4" />
 *               &lt;/simpleType>
 *               &lt;length value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeVariationType", propOrder = {
    "staticShapeVariation",
    "dynamicShapeVariation",
    "statisticalVariation"
})
public class ShapeVariationType
    extends VisualDType
{

    @XmlList
    @XmlElement(name = "StaticShapeVariation", type = Integer.class)
    protected List<Integer> staticShapeVariation;
    @XmlList
    @XmlElement(name = "DynamicShapeVariation", type = Integer.class)
    protected List<Integer> dynamicShapeVariation;
    @XmlList
    @XmlElement(name = "StatisticalVariation", type = Integer.class)
    protected List<Integer> statisticalVariation;

    /**
     * Gets the value of the staticShapeVariation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticShapeVariation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticShapeVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getStaticShapeVariation() {
        if (staticShapeVariation == null) {
            staticShapeVariation = new ArrayList<Integer>();
        }
        return this.staticShapeVariation;
    }

    /**
     * Gets the value of the dynamicShapeVariation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicShapeVariation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicShapeVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDynamicShapeVariation() {
        if (dynamicShapeVariation == null) {
            dynamicShapeVariation = new ArrayList<Integer>();
        }
        return this.dynamicShapeVariation;
    }

    /**
     * Gets the value of the statisticalVariation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticalVariation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticalVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getStatisticalVariation() {
        if (statisticalVariation == null) {
            statisticalVariation = new ArrayList<Integer>();
        }
        return this.statisticalVariation;
    }

}
