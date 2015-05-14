//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StereoscopicVideoConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StereoscopicVideoConversionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="From2DTo3DStereoscopic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ParallaxType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Positive"/>
 *                         &lt;enumeration value="Negative"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DepthRange" type="{urn:mpeg:mpeg7:schema:2001}zeroToOneType"/>
 *                   &lt;element name="MaxDelayedFrame" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="From3DStereoscopicTo2D" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LeftRightInterVideo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Left"/>
 *                         &lt;enumeration value="Right"/>
 *                         &lt;enumeration value="Intermediate"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "StereoscopicVideoConversionType", propOrder = {
    "from2DTo3DStereoscopic",
    "from3DStereoscopicTo2D"
})
public class StereoscopicVideoConversionType
    extends DIABaseType
{

    @XmlElement(name = "From2DTo3DStereoscopic")
    protected StereoscopicVideoConversionType.From2DTo3DStereoscopic from2DTo3DStereoscopic;
    @XmlElement(name = "From3DStereoscopicTo2D")
    protected StereoscopicVideoConversionType.From3DStereoscopicTo2D from3DStereoscopicTo2D;

    /**
     * Gets the value of the from2DTo3DStereoscopic property.
     * 
     * @return
     *     possible object is
     *     {@link StereoscopicVideoConversionType.From2DTo3DStereoscopic }
     *     
     */
    public StereoscopicVideoConversionType.From2DTo3DStereoscopic getFrom2DTo3DStereoscopic() {
        return from2DTo3DStereoscopic;
    }

    /**
     * Sets the value of the from2DTo3DStereoscopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link StereoscopicVideoConversionType.From2DTo3DStereoscopic }
     *     
     */
    public void setFrom2DTo3DStereoscopic(StereoscopicVideoConversionType.From2DTo3DStereoscopic value) {
        this.from2DTo3DStereoscopic = value;
    }

    /**
     * Gets the value of the from3DStereoscopicTo2D property.
     * 
     * @return
     *     possible object is
     *     {@link StereoscopicVideoConversionType.From3DStereoscopicTo2D }
     *     
     */
    public StereoscopicVideoConversionType.From3DStereoscopicTo2D getFrom3DStereoscopicTo2D() {
        return from3DStereoscopicTo2D;
    }

    /**
     * Sets the value of the from3DStereoscopicTo2D property.
     * 
     * @param value
     *     allowed object is
     *     {@link StereoscopicVideoConversionType.From3DStereoscopicTo2D }
     *     
     */
    public void setFrom3DStereoscopicTo2D(StereoscopicVideoConversionType.From3DStereoscopicTo2D value) {
        this.from3DStereoscopicTo2D = value;
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
     *         &lt;element name="ParallaxType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Positive"/>
     *               &lt;enumeration value="Negative"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DepthRange" type="{urn:mpeg:mpeg7:schema:2001}zeroToOneType"/>
     *         &lt;element name="MaxDelayedFrame" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "parallaxType",
        "depthRange",
        "maxDelayedFrame"
    })
    public static class From2DTo3DStereoscopic {

        @XmlElement(name = "ParallaxType", required = true)
        protected String parallaxType;
        @XmlElement(name = "DepthRange")
        protected float depthRange;
        @XmlElement(name = "MaxDelayedFrame")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxDelayedFrame;

        /**
         * Gets the value of the parallaxType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParallaxType() {
            return parallaxType;
        }

        /**
         * Sets the value of the parallaxType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParallaxType(String value) {
            this.parallaxType = value;
        }

        /**
         * Gets the value of the depthRange property.
         * 
         */
        public float getDepthRange() {
            return depthRange;
        }

        /**
         * Sets the value of the depthRange property.
         * 
         */
        public void setDepthRange(float value) {
            this.depthRange = value;
        }

        /**
         * Gets the value of the maxDelayedFrame property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxDelayedFrame() {
            return maxDelayedFrame;
        }

        /**
         * Sets the value of the maxDelayedFrame property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxDelayedFrame(BigInteger value) {
            this.maxDelayedFrame = value;
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
     *         &lt;element name="LeftRightInterVideo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Left"/>
     *               &lt;enumeration value="Right"/>
     *               &lt;enumeration value="Intermediate"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "leftRightInterVideo"
    })
    public static class From3DStereoscopicTo2D {

        @XmlElement(name = "LeftRightInterVideo", required = true)
        protected String leftRightInterVideo;

        /**
         * Gets the value of the leftRightInterVideo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeftRightInterVideo() {
            return leftRightInterVideo;
        }

        /**
         * Sets the value of the leftRightInterVideo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeftRightInterVideo(String value) {
            this.leftRightInterVideo = value;
        }

    }

}
