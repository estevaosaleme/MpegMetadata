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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametricMotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametricMotionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualDType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CoordRef">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                   &lt;attribute name="spatialRef" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="CoordDef">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="originX" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                   &lt;attribute name="originY" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="MediaDuration" type="{urn:mpeg:mpeg7:schema:2004}MediaIncrDurationType"/>
 *         &lt;element name="Parameters">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}floatVector">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="motionModel" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="translational"/>
 *             &lt;enumeration value="rotationOrScaling"/>
 *             &lt;enumeration value="affine"/>
 *             &lt;enumeration value="perspective"/>
 *             &lt;enumeration value="quadratic"/>
 *           &lt;/restriction>
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
@XmlType(name = "ParametricMotionType", propOrder = {
    "coordRef",
    "coordDef",
    "mediaDuration",
    "parameters"
})
public class ParametricMotionType
    extends VisualDType
{

    @XmlElement(name = "CoordRef")
    protected ParametricMotionType.CoordRef coordRef;
    @XmlElement(name = "CoordDef")
    protected ParametricMotionType.CoordDef coordDef;
    @XmlElement(name = "MediaDuration", required = true)
    protected MediaIncrDurationType mediaDuration;
    @XmlList
    @XmlElement(name = "Parameters", type = Float.class)
    protected List<Float> parameters;
    @XmlAttribute(name = "motionModel", required = true)
    protected String motionModel;

    /**
     * Gets the value of the coordRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametricMotionType.CoordRef }
     *     
     */
    public ParametricMotionType.CoordRef getCoordRef() {
        return coordRef;
    }

    /**
     * Sets the value of the coordRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametricMotionType.CoordRef }
     *     
     */
    public void setCoordRef(ParametricMotionType.CoordRef value) {
        this.coordRef = value;
    }

    /**
     * Gets the value of the coordDef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametricMotionType.CoordDef }
     *     
     */
    public ParametricMotionType.CoordDef getCoordDef() {
        return coordDef;
    }

    /**
     * Sets the value of the coordDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametricMotionType.CoordDef }
     *     
     */
    public void setCoordDef(ParametricMotionType.CoordDef value) {
        this.coordDef = value;
    }

    /**
     * Gets the value of the mediaDuration property.
     * 
     * @return
     *     possible object is
     *     {@link MediaIncrDurationType }
     *     
     */
    public MediaIncrDurationType getMediaDuration() {
        return mediaDuration;
    }

    /**
     * Sets the value of the mediaDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaIncrDurationType }
     *     
     */
    public void setMediaDuration(MediaIncrDurationType value) {
        this.mediaDuration = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Float>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the motionModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionModel() {
        return motionModel;
    }

    /**
     * Sets the value of the motionModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionModel(String value) {
        this.motionModel = value;
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
     *       &lt;attribute name="originX" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="originY" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoordDef {

        @XmlAttribute(name = "originX", required = true)
        protected float originX;
        @XmlAttribute(name = "originY", required = true)
        protected float originY;

        /**
         * Gets the value of the originX property.
         * 
         */
        public float getOriginX() {
            return originX;
        }

        /**
         * Sets the value of the originX property.
         * 
         */
        public void setOriginX(float value) {
            this.originX = value;
        }

        /**
         * Gets the value of the originY property.
         * 
         */
        public float getOriginY() {
            return originY;
        }

        /**
         * Sets the value of the originY property.
         * 
         */
        public void setOriginY(float value) {
            this.originY = value;
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
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="spatialRef" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoordRef {

        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;
        @XmlAttribute(name = "spatialRef", required = true)
        protected boolean spatialRef;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRef(Object value) {
            this.ref = value;
        }

        /**
         * Gets the value of the spatialRef property.
         * 
         */
        public boolean isSpatialRef() {
            return spatialRef;
        }

        /**
         * Sets the value of the spatialRef property.
         * 
         */
        public void setSpatialRef(boolean value) {
            this.spatialRef = value;
        }

    }

}
