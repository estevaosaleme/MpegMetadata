//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpegv._2010.ct;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import org.iso.mpeg.mpeg7._2004.DoubleMatrixType;


/**
 * <p>Java class for ConversionLUTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionLUTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RGB2XYZ_LUT" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *         &lt;element name="RGBScalar_Max" type="{urn:mpeg:mpeg7:schema:2004}doubleVector"/>
 *         &lt;element name="Offset_Value" type="{urn:mpeg:mpeg7:schema:2004}doubleVector"/>
 *         &lt;element name="Gain_Offset_Gamma" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *         &lt;element name="InverseLUT" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionLUTType", propOrder = {
    "rgb2XYZLUT",
    "rgbScalarMax",
    "offsetValue",
    "gainOffsetGamma",
    "inverseLUT"
})
public class ConversionLUTType {

    @XmlElement(name = "RGB2XYZ_LUT", required = true)
    protected DoubleMatrixType rgb2XYZLUT;
    @XmlList
    @XmlElement(name = "RGBScalar_Max", type = Double.class)
    protected List<Double> rgbScalarMax;
    @XmlList
    @XmlElement(name = "Offset_Value", type = Double.class)
    protected List<Double> offsetValue;
    @XmlElement(name = "Gain_Offset_Gamma", required = true)
    protected DoubleMatrixType gainOffsetGamma;
    @XmlElement(name = "InverseLUT", required = true)
    protected DoubleMatrixType inverseLUT;

    /**
     * Gets the value of the rgb2XYZLUT property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getRGB2XYZLUT() {
        return rgb2XYZLUT;
    }

    /**
     * Sets the value of the rgb2XYZLUT property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setRGB2XYZLUT(DoubleMatrixType value) {
        this.rgb2XYZLUT = value;
    }

    /**
     * Gets the value of the rgbScalarMax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgbScalarMax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRGBScalarMax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRGBScalarMax() {
        if (rgbScalarMax == null) {
            rgbScalarMax = new ArrayList<Double>();
        }
        return this.rgbScalarMax;
    }

    /**
     * Gets the value of the offsetValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOffsetValue() {
        if (offsetValue == null) {
            offsetValue = new ArrayList<Double>();
        }
        return this.offsetValue;
    }

    /**
     * Gets the value of the gainOffsetGamma property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getGainOffsetGamma() {
        return gainOffsetGamma;
    }

    /**
     * Sets the value of the gainOffsetGamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setGainOffsetGamma(DoubleMatrixType value) {
        this.gainOffsetGamma = value;
    }

    /**
     * Gets the value of the inverseLUT property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getInverseLUT() {
        return inverseLUT;
    }

    /**
     * Sets the value of the inverseLUT property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setInverseLUT(DoubleMatrixType value) {
        this.inverseLUT = value;
    }

}
