//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GammaDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GammaDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}ContinuousDistributionType">
 *       &lt;sequence>
 *         &lt;element name="Theta" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *         &lt;element name="Shape" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GammaDistributionType", propOrder = {
    "theta",
    "shape"
})
public class GammaDistributionType
    extends ContinuousDistributionType
{

    @XmlElement(name = "Theta", required = true)
    protected DoubleMatrixType theta;
    @XmlElement(name = "Shape", required = true)
    protected DoubleMatrixType shape;

    /**
     * Gets the value of the theta property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getTheta() {
        return theta;
    }

    /**
     * Sets the value of the theta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setTheta(DoubleMatrixType value) {
        this.theta = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setShape(DoubleMatrixType value) {
        this.shape = value;
    }

}
