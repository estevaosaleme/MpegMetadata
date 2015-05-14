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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotionActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotionActivityType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualDType">
 *       &lt;sequence>
 *         &lt;element name="Intensity">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}unsigned3">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DominantDirection" type="{urn:mpeg:mpeg7:schema:2004}unsigned3" minOccurs="0"/>
 *         &lt;element name="SpatialDistributionParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="numOfShortRuns" use="required" type="{urn:mpeg:mpeg7:schema:2004}unsigned6" />
 *                 &lt;attribute name="numOfMediumRuns" use="required" type="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
 *                 &lt;attribute name="numOfLongRuns" use="required" type="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpatialLocalizationParams" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Vector4">
 *                     &lt;simpleType>
 *                       &lt;restriction>
 *                         &lt;simpleType>
 *                           &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
 *                         &lt;/simpleType>
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Vector16">
 *                     &lt;simpleType>
 *                       &lt;restriction>
 *                         &lt;simpleType>
 *                           &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
 *                         &lt;/simpleType>
 *                         &lt;length value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Vector64">
 *                     &lt;simpleType>
 *                       &lt;restriction>
 *                         &lt;simpleType>
 *                           &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
 *                         &lt;/simpleType>
 *                         &lt;length value="64"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Vector256">
 *                     &lt;simpleType>
 *                       &lt;restriction>
 *                         &lt;simpleType>
 *                           &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
 *                         &lt;/simpleType>
 *                         &lt;length value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TemporalParams" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned6" />
 *               &lt;/simpleType>
 *               &lt;length value="5"/>
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
@XmlType(name = "MotionActivityType", propOrder = {
    "intensity",
    "dominantDirection",
    "spatialDistributionParams",
    "spatialLocalizationParams",
    "temporalParams"
})
public class MotionActivityType
    extends VisualDType
{

    @XmlElement(name = "Intensity")
    protected int intensity;
    @XmlElement(name = "DominantDirection")
    protected Integer dominantDirection;
    @XmlElement(name = "SpatialDistributionParams")
    protected MotionActivityType.SpatialDistributionParams spatialDistributionParams;
    @XmlElement(name = "SpatialLocalizationParams")
    protected MotionActivityType.SpatialLocalizationParams spatialLocalizationParams;
    @XmlList
    @XmlElement(name = "TemporalParams", type = Integer.class)
    protected List<Integer> temporalParams;

    /**
     * Gets the value of the intensity property.
     * 
     */
    public int getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     */
    public void setIntensity(int value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the dominantDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDominantDirection() {
        return dominantDirection;
    }

    /**
     * Sets the value of the dominantDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDominantDirection(Integer value) {
        this.dominantDirection = value;
    }

    /**
     * Gets the value of the spatialDistributionParams property.
     * 
     * @return
     *     possible object is
     *     {@link MotionActivityType.SpatialDistributionParams }
     *     
     */
    public MotionActivityType.SpatialDistributionParams getSpatialDistributionParams() {
        return spatialDistributionParams;
    }

    /**
     * Sets the value of the spatialDistributionParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotionActivityType.SpatialDistributionParams }
     *     
     */
    public void setSpatialDistributionParams(MotionActivityType.SpatialDistributionParams value) {
        this.spatialDistributionParams = value;
    }

    /**
     * Gets the value of the spatialLocalizationParams property.
     * 
     * @return
     *     possible object is
     *     {@link MotionActivityType.SpatialLocalizationParams }
     *     
     */
    public MotionActivityType.SpatialLocalizationParams getSpatialLocalizationParams() {
        return spatialLocalizationParams;
    }

    /**
     * Sets the value of the spatialLocalizationParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotionActivityType.SpatialLocalizationParams }
     *     
     */
    public void setSpatialLocalizationParams(MotionActivityType.SpatialLocalizationParams value) {
        this.spatialLocalizationParams = value;
    }

    /**
     * Gets the value of the temporalParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getTemporalParams() {
        if (temporalParams == null) {
            temporalParams = new ArrayList<Integer>();
        }
        return this.temporalParams;
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
     *       &lt;attribute name="numOfShortRuns" use="required" type="{urn:mpeg:mpeg7:schema:2004}unsigned6" />
     *       &lt;attribute name="numOfMediumRuns" use="required" type="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
     *       &lt;attribute name="numOfLongRuns" use="required" type="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpatialDistributionParams {

        @XmlAttribute(name = "numOfShortRuns", required = true)
        protected int numOfShortRuns;
        @XmlAttribute(name = "numOfMediumRuns", required = true)
        protected int numOfMediumRuns;
        @XmlAttribute(name = "numOfLongRuns", required = true)
        protected int numOfLongRuns;

        /**
         * Gets the value of the numOfShortRuns property.
         * 
         */
        public int getNumOfShortRuns() {
            return numOfShortRuns;
        }

        /**
         * Sets the value of the numOfShortRuns property.
         * 
         */
        public void setNumOfShortRuns(int value) {
            this.numOfShortRuns = value;
        }

        /**
         * Gets the value of the numOfMediumRuns property.
         * 
         */
        public int getNumOfMediumRuns() {
            return numOfMediumRuns;
        }

        /**
         * Sets the value of the numOfMediumRuns property.
         * 
         */
        public void setNumOfMediumRuns(int value) {
            this.numOfMediumRuns = value;
        }

        /**
         * Gets the value of the numOfLongRuns property.
         * 
         */
        public int getNumOfLongRuns() {
            return numOfLongRuns;
        }

        /**
         * Sets the value of the numOfLongRuns property.
         * 
         */
        public void setNumOfLongRuns(int value) {
            this.numOfLongRuns = value;
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
     *       &lt;choice>
     *         &lt;element name="Vector4">
     *           &lt;simpleType>
     *             &lt;restriction>
     *               &lt;simpleType>
     *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
     *               &lt;/simpleType>
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Vector16">
     *           &lt;simpleType>
     *             &lt;restriction>
     *               &lt;simpleType>
     *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
     *               &lt;/simpleType>
     *               &lt;length value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Vector64">
     *           &lt;simpleType>
     *             &lt;restriction>
     *               &lt;simpleType>
     *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
     *               &lt;/simpleType>
     *               &lt;length value="64"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Vector256">
     *           &lt;simpleType>
     *             &lt;restriction>
     *               &lt;simpleType>
     *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned3" />
     *               &lt;/simpleType>
     *               &lt;length value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vector4",
        "vector16",
        "vector64",
        "vector256"
    })
    public static class SpatialLocalizationParams {

        @XmlList
        @XmlElement(name = "Vector4", type = Integer.class)
        protected List<Integer> vector4;
        @XmlList
        @XmlElement(name = "Vector16", type = Integer.class)
        protected List<Integer> vector16;
        @XmlList
        @XmlElement(name = "Vector64", type = Integer.class)
        protected List<Integer> vector64;
        @XmlList
        @XmlElement(name = "Vector256", type = Integer.class)
        protected List<Integer> vector256;

        /**
         * Gets the value of the vector4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vector4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVector4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getVector4() {
            if (vector4 == null) {
                vector4 = new ArrayList<Integer>();
            }
            return this.vector4;
        }

        /**
         * Gets the value of the vector16 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vector16 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVector16().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getVector16() {
            if (vector16 == null) {
                vector16 = new ArrayList<Integer>();
            }
            return this.vector16;
        }

        /**
         * Gets the value of the vector64 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vector64 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVector64().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getVector64() {
            if (vector64 == null) {
                vector64 = new ArrayList<Integer>();
            }
            return this.vector64;
        }

        /**
         * Gets the value of the vector256 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vector256 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVector256().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getVector256() {
            if (vector256 == null) {
                vector256 = new ArrayList<Integer>();
            }
            return this.vector256;
        }

    }

}