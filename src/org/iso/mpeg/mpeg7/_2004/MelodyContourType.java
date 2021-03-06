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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MelodyContourType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MelodyContourType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AudioDSType">
 *       &lt;sequence>
 *         &lt;element name="Contour" type="{urn:mpeg:mpeg7:schema:2004}contourType"/>
 *         &lt;element name="Beat" type="{urn:mpeg:mpeg7:schema:2004}beatType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MelodyContourType", propOrder = {
    "contour",
    "beat"
})
public class MelodyContourType
    extends AudioDSType
{

    @XmlList
    @XmlElement(name = "Contour", type = Integer.class)
    protected List<Integer> contour;
    @XmlList
    @XmlElement(name = "Beat", required = true)
    protected List<BigInteger> beat;

    /**
     * Gets the value of the contour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getContour() {
        if (contour == null) {
            contour = new ArrayList<Integer>();
        }
        return this.contour;
    }

    /**
     * Gets the value of the beat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getBeat() {
        if (beat == null) {
            beat = new ArrayList<BigInteger>();
        }
        return this.beat;
    }

}
