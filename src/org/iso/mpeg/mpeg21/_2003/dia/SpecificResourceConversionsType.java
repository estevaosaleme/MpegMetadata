//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificResourceConversionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificResourceConversionsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="Object" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}ResourceConversionType">
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/extension>
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
@XmlType(name = "SpecificResourceConversionsType", propOrder = {
    "object"
})
public class SpecificResourceConversionsType
    extends DIABaseType
{

    @XmlElement(name = "Object")
    protected List<SpecificResourceConversionsType.Object> object;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificResourceConversionsType.Object }
     * 
     * 
     */
    public List<SpecificResourceConversionsType.Object> getObject() {
        if (object == null) {
            object = new ArrayList<SpecificResourceConversionsType.Object>();
        }
        return this.object;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}ResourceConversionType">
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Object
        extends ResourceConversionType
    {

        @XmlAttribute(name = "target", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String target;

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

    }

}
