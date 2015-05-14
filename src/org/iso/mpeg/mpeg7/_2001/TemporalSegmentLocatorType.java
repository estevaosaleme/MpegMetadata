//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg7._2001;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemporalSegmentLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporalSegmentLocatorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}MediaLocatorType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="MediaTime" type="{urn:mpeg:mpeg7:schema:2001}MediaTimeType"/>
 *         &lt;element name="BytePosition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="offset" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalSegmentLocatorType", propOrder = {
    "mediaTime",
    "bytePosition"
})
public class TemporalSegmentLocatorType
    extends MediaLocatorType
{

    @XmlElement(name = "MediaTime")
    protected MediaTimeType mediaTime;
    @XmlElement(name = "BytePosition")
    protected TemporalSegmentLocatorType.BytePosition bytePosition;

    /**
     * Gets the value of the mediaTime property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTimeType }
     *     
     */
    public MediaTimeType getMediaTime() {
        return mediaTime;
    }

    /**
     * Sets the value of the mediaTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTimeType }
     *     
     */
    public void setMediaTime(MediaTimeType value) {
        this.mediaTime = value;
    }

    /**
     * Gets the value of the bytePosition property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalSegmentLocatorType.BytePosition }
     *     
     */
    public TemporalSegmentLocatorType.BytePosition getBytePosition() {
        return bytePosition;
    }

    /**
     * Sets the value of the bytePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalSegmentLocatorType.BytePosition }
     *     
     */
    public void setBytePosition(TemporalSegmentLocatorType.BytePosition value) {
        this.bytePosition = value;
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
     *       &lt;attribute name="offset" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BytePosition {

        @XmlAttribute(name = "offset", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger offset;
        @XmlAttribute(name = "length")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger length;

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffset(BigInteger value) {
            this.offset = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLength(BigInteger value) {
            this.length = value;
        }

    }

}
