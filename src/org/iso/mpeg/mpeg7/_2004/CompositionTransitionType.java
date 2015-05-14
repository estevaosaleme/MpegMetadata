//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositionTransitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositionTransitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AnalyticTransitionType">
 *       &lt;attribute name="compositionType">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                 &lt;enumeration value="create"/>
 *                 &lt;enumeration value="delete"/>
 *                 &lt;enumeration value="change"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termAliasReferenceType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termURIReferenceType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
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
@XmlType(name = "CompositionTransitionType")
public class CompositionTransitionType
    extends AnalyticTransitionType
{

    @XmlAttribute(name = "compositionType")
    protected String compositionType;

    /**
     * Gets the value of the compositionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositionType() {
        return compositionType;
    }

    /**
     * Sets the value of the compositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositionType(String value) {
        this.compositionType = value;
    }

}