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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScalableColorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScalableColorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualDType">
 *       &lt;sequence>
 *         &lt;element name="Coeff" type="{urn:mpeg:mpeg7:schema:2004}integerVector"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numOfCoeff" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="16"/>
 *             &lt;enumeration value="32"/>
 *             &lt;enumeration value="64"/>
 *             &lt;enumeration value="128"/>
 *             &lt;enumeration value="256"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="numOfBitplanesDiscarded" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="6"/>
 *             &lt;enumeration value="8"/>
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
@XmlType(name = "ScalableColorType", propOrder = {
    "coeff"
})
public class ScalableColorType
    extends VisualDType
{

    @XmlList
    @XmlElement(name = "Coeff", required = true)
    protected List<BigInteger> coeff;
    @XmlAttribute(name = "numOfCoeff", required = true)
    protected BigInteger numOfCoeff;
    @XmlAttribute(name = "numOfBitplanesDiscarded", required = true)
    protected BigInteger numOfBitplanesDiscarded;

    /**
     * Gets the value of the coeff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coeff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoeff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getCoeff() {
        if (coeff == null) {
            coeff = new ArrayList<BigInteger>();
        }
        return this.coeff;
    }

    /**
     * Gets the value of the numOfCoeff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfCoeff() {
        return numOfCoeff;
    }

    /**
     * Sets the value of the numOfCoeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfCoeff(BigInteger value) {
        this.numOfCoeff = value;
    }

    /**
     * Gets the value of the numOfBitplanesDiscarded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfBitplanesDiscarded() {
        return numOfBitplanesDiscarded;
    }

    /**
     * Sets the value of the numOfBitplanesDiscarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfBitplanesDiscarded(BigInteger value) {
        this.numOfBitplanesDiscarded = value;
    }

}
