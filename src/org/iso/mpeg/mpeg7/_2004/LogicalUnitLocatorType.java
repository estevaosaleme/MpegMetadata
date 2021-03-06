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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LogicalUnitLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalUnitLocatorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="LogicalUnit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SubUnit" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unit" use="required" type="{urn:mpeg:mpeg7:schema:2004}termReferenceType" />
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReferenceUnit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SubUnit" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{urn:mpeg:mpeg7:schema:2004}referenceGrp"/>
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
@XmlType(name = "LogicalUnitLocatorType", propOrder = {
    "logicalUnitOrReferenceUnit"
})
public class LogicalUnitLocatorType
    extends MediaLocatorType
{

    @XmlElements({
        @XmlElement(name = "LogicalUnit", type = LogicalUnitLocatorType.LogicalUnit.class),
        @XmlElement(name = "ReferenceUnit", type = LogicalUnitLocatorType.ReferenceUnit.class)
    })
    protected List<Object> logicalUnitOrReferenceUnit;

    /**
     * Gets the value of the logicalUnitOrReferenceUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalUnitOrReferenceUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalUnitOrReferenceUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalUnitLocatorType.LogicalUnit }
     * {@link LogicalUnitLocatorType.ReferenceUnit }
     * 
     * 
     */
    public List<Object> getLogicalUnitOrReferenceUnit() {
        if (logicalUnitOrReferenceUnit == null) {
            logicalUnitOrReferenceUnit = new ArrayList<Object>();
        }
        return this.logicalUnitOrReferenceUnit;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SubUnit" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="unit" use="required" type="{urn:mpeg:mpeg7:schema:2004}termReferenceType" />
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subUnit"
    })
    public static class LogicalUnit {

        @XmlElement(name = "SubUnit")
        protected List<MediaLocatorType> subUnit;
        @XmlAttribute(name = "unit", required = true)
        protected String unit;
        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * Gets the value of the subUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaLocatorType }
         * 
         * 
         */
        public List<MediaLocatorType> getSubUnit() {
            if (subUnit == null) {
                subUnit = new ArrayList<MediaLocatorType>();
            }
            return this.subUnit;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SubUnit" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{urn:mpeg:mpeg7:schema:2004}referenceGrp"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subUnit"
    })
    public static class ReferenceUnit {

        @XmlElement(name = "SubUnit")
        protected List<MediaLocatorType> subUnit;
        @XmlAttribute(name = "idref")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object idref;
        @XmlAttribute(name = "xpath")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String xpath;
        @XmlAttribute(name = "href")
        @XmlSchemaType(name = "anyURI")
        protected String href;

        /**
         * Gets the value of the subUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaLocatorType }
         * 
         * 
         */
        public List<MediaLocatorType> getSubUnit() {
            if (subUnit == null) {
                subUnit = new ArrayList<MediaLocatorType>();
            }
            return this.subUnit;
        }

        /**
         * Gets the value of the idref property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getIdref() {
            return idref;
        }

        /**
         * Sets the value of the idref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setIdref(Object value) {
            this.idref = value;
        }

        /**
         * Gets the value of the xpath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXpath() {
            return xpath;
        }

        /**
         * Sets the value of the xpath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXpath(String value) {
            this.xpath = value;
        }

        /**
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

    }

}
