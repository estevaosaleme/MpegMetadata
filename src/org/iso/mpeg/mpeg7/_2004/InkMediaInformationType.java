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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InkMediaInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InkMediaInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;element name="InputDevice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Device" type="{urn:mpeg:mpeg7:schema:2004}TermUseType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="xWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="yWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="resolutionX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="resolutionY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="resolutionZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="resolutionP" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="resolutionS" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WritingFieldLayout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RegionLocator" type="{urn:mpeg:mpeg7:schema:2004}RegionLocatorType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="fieldIDList">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}ID" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OverlaidMedia" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="OverlaidMediaLocator" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
 *                     &lt;element name="OverlaidMediaRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *                   &lt;/choice>
 *                   &lt;element name="MediaRegionLocator" type="{urn:mpeg:mpeg7:schema:2004}RegionLocatorType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="fieldIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                 &lt;attribute name="translationX" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *                 &lt;attribute name="translationY" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *                 &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}float" default="0.0" />
 *                 &lt;attribute name="scaleX" type="{http://www.w3.org/2001/XMLSchema}float" default="1.0" />
 *                 &lt;attribute name="scaleY" type="{http://www.w3.org/2001/XMLSchema}float" default="1.0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Brush" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
 *                   &lt;element name="Color" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
 *                   &lt;element name="Shape" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
 *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Param" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Handedness" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="left"/>
 *               &lt;enumeration value="right"/>
 *               &lt;enumeration value="others"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Style" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                   &lt;enumeration value="printed"/>
 *                   &lt;enumeration value="cursive"/>
 *                   &lt;enumeration value="drawing"/>
 *                   &lt;enumeration value="mixed"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termAliasReferenceType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termURIReferenceType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
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
@XmlType(name = "InkMediaInformationType", propOrder = {
    "inputDevice",
    "writingFieldLayout",
    "overlaidMedia",
    "brush",
    "param",
    "handedness",
    "style"
})
public class InkMediaInformationType
    extends DSType
{

    @XmlElement(name = "InputDevice")
    protected InkMediaInformationType.InputDevice inputDevice;
    @XmlElement(name = "WritingFieldLayout")
    protected InkMediaInformationType.WritingFieldLayout writingFieldLayout;
    @XmlElement(name = "OverlaidMedia")
    protected List<InkMediaInformationType.OverlaidMedia> overlaidMedia;
    @XmlElement(name = "Brush")
    protected List<InkMediaInformationType.Brush> brush;
    @XmlElement(name = "Param")
    protected List<InkMediaInformationType.Param> param;
    @XmlElement(name = "Handedness")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handedness;
    @XmlElement(name = "Style")
    protected String style;

    /**
     * Gets the value of the inputDevice property.
     * 
     * @return
     *     possible object is
     *     {@link InkMediaInformationType.InputDevice }
     *     
     */
    public InkMediaInformationType.InputDevice getInputDevice() {
        return inputDevice;
    }

    /**
     * Sets the value of the inputDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InkMediaInformationType.InputDevice }
     *     
     */
    public void setInputDevice(InkMediaInformationType.InputDevice value) {
        this.inputDevice = value;
    }

    /**
     * Gets the value of the writingFieldLayout property.
     * 
     * @return
     *     possible object is
     *     {@link InkMediaInformationType.WritingFieldLayout }
     *     
     */
    public InkMediaInformationType.WritingFieldLayout getWritingFieldLayout() {
        return writingFieldLayout;
    }

    /**
     * Sets the value of the writingFieldLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link InkMediaInformationType.WritingFieldLayout }
     *     
     */
    public void setWritingFieldLayout(InkMediaInformationType.WritingFieldLayout value) {
        this.writingFieldLayout = value;
    }

    /**
     * Gets the value of the overlaidMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overlaidMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlaidMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InkMediaInformationType.OverlaidMedia }
     * 
     * 
     */
    public List<InkMediaInformationType.OverlaidMedia> getOverlaidMedia() {
        if (overlaidMedia == null) {
            overlaidMedia = new ArrayList<InkMediaInformationType.OverlaidMedia>();
        }
        return this.overlaidMedia;
    }

    /**
     * Gets the value of the brush property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brush property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrush().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InkMediaInformationType.Brush }
     * 
     * 
     */
    public List<InkMediaInformationType.Brush> getBrush() {
        if (brush == null) {
            brush = new ArrayList<InkMediaInformationType.Brush>();
        }
        return this.brush;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InkMediaInformationType.Param }
     * 
     * 
     */
    public List<InkMediaInformationType.Param> getParam() {
        if (param == null) {
            param = new ArrayList<InkMediaInformationType.Param>();
        }
        return this.param;
    }

    /**
     * Gets the value of the handedness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandedness() {
        return handedness;
    }

    /**
     * Sets the value of the handedness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandedness(String value) {
        this.handedness = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
     *         &lt;element name="Color" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
     *         &lt;element name="Shape" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
     *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "color",
        "shape",
        "size"
    })
    public static class Brush {

        @XmlElement(name = "Name")
        protected TermUseType name;
        @XmlElement(name = "Color")
        protected TermUseType color;
        @XmlElement(name = "Shape")
        protected TermUseType shape;
        @XmlElement(name = "Size")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger size;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link TermUseType }
         *     
         */
        public TermUseType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link TermUseType }
         *     
         */
        public void setName(TermUseType value) {
            this.name = value;
        }

        /**
         * Gets the value of the color property.
         * 
         * @return
         *     possible object is
         *     {@link TermUseType }
         *     
         */
        public TermUseType getColor() {
            return color;
        }

        /**
         * Sets the value of the color property.
         * 
         * @param value
         *     allowed object is
         *     {@link TermUseType }
         *     
         */
        public void setColor(TermUseType value) {
            this.color = value;
        }

        /**
         * Gets the value of the shape property.
         * 
         * @return
         *     possible object is
         *     {@link TermUseType }
         *     
         */
        public TermUseType getShape() {
            return shape;
        }

        /**
         * Sets the value of the shape property.
         * 
         * @param value
         *     allowed object is
         *     {@link TermUseType }
         *     
         */
        public void setShape(TermUseType value) {
            this.shape = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSize(BigInteger value) {
            this.size = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Device" type="{urn:mpeg:mpeg7:schema:2004}TermUseType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="xWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="yWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="resolutionX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="resolutionY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="resolutionZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="resolutionP" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="resolutionS" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "device"
    })
    public static class InputDevice {

        @XmlElement(name = "Device", required = true)
        protected TermUseType device;
        @XmlAttribute(name = "xWidth")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger xWidth;
        @XmlAttribute(name = "yWidth")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger yWidth;
        @XmlAttribute(name = "resolutionX")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger resolutionX;
        @XmlAttribute(name = "resolutionY")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger resolutionY;
        @XmlAttribute(name = "resolutionZ")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger resolutionZ;
        @XmlAttribute(name = "resolutionP")
        protected BigInteger resolutionP;
        @XmlAttribute(name = "resolutionS")
        protected BigInteger resolutionS;

        /**
         * Gets the value of the device property.
         * 
         * @return
         *     possible object is
         *     {@link TermUseType }
         *     
         */
        public TermUseType getDevice() {
            return device;
        }

        /**
         * Sets the value of the device property.
         * 
         * @param value
         *     allowed object is
         *     {@link TermUseType }
         *     
         */
        public void setDevice(TermUseType value) {
            this.device = value;
        }

        /**
         * Gets the value of the xWidth property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getXWidth() {
            return xWidth;
        }

        /**
         * Sets the value of the xWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setXWidth(BigInteger value) {
            this.xWidth = value;
        }

        /**
         * Gets the value of the yWidth property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getYWidth() {
            return yWidth;
        }

        /**
         * Sets the value of the yWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setYWidth(BigInteger value) {
            this.yWidth = value;
        }

        /**
         * Gets the value of the resolutionX property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolutionX() {
            return resolutionX;
        }

        /**
         * Sets the value of the resolutionX property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolutionX(BigInteger value) {
            this.resolutionX = value;
        }

        /**
         * Gets the value of the resolutionY property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolutionY() {
            return resolutionY;
        }

        /**
         * Sets the value of the resolutionY property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolutionY(BigInteger value) {
            this.resolutionY = value;
        }

        /**
         * Gets the value of the resolutionZ property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolutionZ() {
            return resolutionZ;
        }

        /**
         * Sets the value of the resolutionZ property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolutionZ(BigInteger value) {
            this.resolutionZ = value;
        }

        /**
         * Gets the value of the resolutionP property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolutionP() {
            return resolutionP;
        }

        /**
         * Sets the value of the resolutionP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolutionP(BigInteger value) {
            this.resolutionP = value;
        }

        /**
         * Gets the value of the resolutionS property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolutionS() {
            return resolutionS;
        }

        /**
         * Sets the value of the resolutionS property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolutionS(BigInteger value) {
            this.resolutionS = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="OverlaidMediaLocator" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
     *           &lt;element name="OverlaidMediaRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
     *         &lt;/choice>
     *         &lt;element name="MediaRegionLocator" type="{urn:mpeg:mpeg7:schema:2004}RegionLocatorType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="fieldIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="translationX" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
     *       &lt;attribute name="translationY" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
     *       &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}float" default="0.0" />
     *       &lt;attribute name="scaleX" type="{http://www.w3.org/2001/XMLSchema}float" default="1.0" />
     *       &lt;attribute name="scaleY" type="{http://www.w3.org/2001/XMLSchema}float" default="1.0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overlaidMediaLocator",
        "overlaidMediaRef",
        "mediaRegionLocator"
    })
    public static class OverlaidMedia {

        @XmlElement(name = "OverlaidMediaLocator")
        protected MediaLocatorType overlaidMediaLocator;
        @XmlElement(name = "OverlaidMediaRef")
        protected ReferenceType overlaidMediaRef;
        @XmlElement(name = "MediaRegionLocator")
        protected RegionLocatorType mediaRegionLocator;
        @XmlAttribute(name = "fieldIDRef")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object fieldIDRef;
        @XmlAttribute(name = "translationX")
        protected BigInteger translationX;
        @XmlAttribute(name = "translationY")
        protected BigInteger translationY;
        @XmlAttribute(name = "rotation")
        protected Float rotation;
        @XmlAttribute(name = "scaleX")
        protected Float scaleX;
        @XmlAttribute(name = "scaleY")
        protected Float scaleY;

        /**
         * Gets the value of the overlaidMediaLocator property.
         * 
         * @return
         *     possible object is
         *     {@link MediaLocatorType }
         *     
         */
        public MediaLocatorType getOverlaidMediaLocator() {
            return overlaidMediaLocator;
        }

        /**
         * Sets the value of the overlaidMediaLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaLocatorType }
         *     
         */
        public void setOverlaidMediaLocator(MediaLocatorType value) {
            this.overlaidMediaLocator = value;
        }

        /**
         * Gets the value of the overlaidMediaRef property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceType }
         *     
         */
        public ReferenceType getOverlaidMediaRef() {
            return overlaidMediaRef;
        }

        /**
         * Sets the value of the overlaidMediaRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceType }
         *     
         */
        public void setOverlaidMediaRef(ReferenceType value) {
            this.overlaidMediaRef = value;
        }

        /**
         * Gets the value of the mediaRegionLocator property.
         * 
         * @return
         *     possible object is
         *     {@link RegionLocatorType }
         *     
         */
        public RegionLocatorType getMediaRegionLocator() {
            return mediaRegionLocator;
        }

        /**
         * Sets the value of the mediaRegionLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegionLocatorType }
         *     
         */
        public void setMediaRegionLocator(RegionLocatorType value) {
            this.mediaRegionLocator = value;
        }

        /**
         * Gets the value of the fieldIDRef property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFieldIDRef() {
            return fieldIDRef;
        }

        /**
         * Sets the value of the fieldIDRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFieldIDRef(Object value) {
            this.fieldIDRef = value;
        }

        /**
         * Gets the value of the translationX property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTranslationX() {
            if (translationX == null) {
                return new BigInteger("0");
            } else {
                return translationX;
            }
        }

        /**
         * Sets the value of the translationX property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTranslationX(BigInteger value) {
            this.translationX = value;
        }

        /**
         * Gets the value of the translationY property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTranslationY() {
            if (translationY == null) {
                return new BigInteger("0");
            } else {
                return translationY;
            }
        }

        /**
         * Sets the value of the translationY property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTranslationY(BigInteger value) {
            this.translationY = value;
        }

        /**
         * Gets the value of the rotation property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public float getRotation() {
            if (rotation == null) {
                return  0.0F;
            } else {
                return rotation;
            }
        }

        /**
         * Sets the value of the rotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setRotation(Float value) {
            this.rotation = value;
        }

        /**
         * Gets the value of the scaleX property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public float getScaleX() {
            if (scaleX == null) {
                return  1.0F;
            } else {
                return scaleX;
            }
        }

        /**
         * Sets the value of the scaleX property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setScaleX(Float value) {
            this.scaleX = value;
        }

        /**
         * Gets the value of the scaleY property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public float getScaleY() {
            if (scaleY == null) {
                return  1.0F;
            } else {
                return scaleY;
            }
        }

        /**
         * Sets the value of the scaleY property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setScaleY(Float value) {
            this.scaleY = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Param {

        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "value")
        protected String value;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RegionLocator" type="{urn:mpeg:mpeg7:schema:2004}RegionLocatorType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="fieldIDList">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}ID" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "regionLocator"
    })
    public static class WritingFieldLayout {

        @XmlElement(name = "RegionLocator", required = true)
        protected RegionLocatorType regionLocator;
        @XmlAttribute(name = "fieldIDList")
        //@XmlID
        protected List<String> fieldIDList;

        /**
         * Gets the value of the regionLocator property.
         * 
         * @return
         *     possible object is
         *     {@link RegionLocatorType }
         *     
         */
        public RegionLocatorType getRegionLocator() {
            return regionLocator;
        }

        /**
         * Sets the value of the regionLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegionLocatorType }
         *     
         */
        public void setRegionLocator(RegionLocatorType value) {
            this.regionLocator = value;
        }

        /**
         * Gets the value of the fieldIDList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fieldIDList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFieldIDList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFieldIDList() {
            if (fieldIDList == null) {
                fieldIDList = new ArrayList<String>();
            }
            return this.fieldIDList;
        }

    }

}