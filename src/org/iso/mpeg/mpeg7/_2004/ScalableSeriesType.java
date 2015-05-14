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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScalableSeriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScalableSeriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Scaling" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="numOfElements" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="totalNumOfSamples" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScalableSeriesType", propOrder = {
    "scaling"
})
@XmlSeeAlso({
    SeriesOfScalarType.class,
    SeriesOfVectorType.class
})
public abstract class ScalableSeriesType {

    @XmlElement(name = "Scaling")
    protected List<ScalableSeriesType.Scaling> scaling;
    @XmlAttribute(name = "totalNumOfSamples", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalNumOfSamples;

    /**
     * Gets the value of the scaling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScalableSeriesType.Scaling }
     * 
     * 
     */
    public List<ScalableSeriesType.Scaling> getScaling() {
        if (scaling == null) {
            scaling = new ArrayList<ScalableSeriesType.Scaling>();
        }
        return this.scaling;
    }

    /**
     * Gets the value of the totalNumOfSamples property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumOfSamples() {
        return totalNumOfSamples;
    }

    /**
     * Sets the value of the totalNumOfSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumOfSamples(BigInteger value) {
        this.totalNumOfSamples = value;
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
     *       &lt;attribute name="ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="numOfElements" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Scaling {

        @XmlAttribute(name = "ratio", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger ratio;
        @XmlAttribute(name = "numOfElements", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numOfElements;

        /**
         * Gets the value of the ratio property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRatio() {
            return ratio;
        }

        /**
         * Sets the value of the ratio property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRatio(BigInteger value) {
            this.ratio = value;
        }

        /**
         * Gets the value of the numOfElements property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumOfElements() {
            return numOfElements;
        }

        /**
         * Sets the value of the numOfElements property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumOfElements(BigInteger value) {
            this.numOfElements = value;
        }

    }

}
