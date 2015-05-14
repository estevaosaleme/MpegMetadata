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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrderingKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderingKeyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}HeaderType">
 *       &lt;sequence>
 *         &lt;element name="Selector">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="xpath" type="{urn:mpeg:mpeg7:schema:2004}xPathSelectorType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Field" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="xpath" type="{urn:mpeg:mpeg7:schema:2004}xPathFieldType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="semantics" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="direction" default="descending">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="descending"/>
 *             &lt;enumeration value="ascending"/>
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
@XmlType(name = "OrderingKeyType", propOrder = {
    "selector",
    "field"
})
public class OrderingKeyType
    extends HeaderType
{

    @XmlElement(name = "Selector", required = true)
    protected OrderingKeyType.Selector selector;
    @XmlElement(name = "Field", required = true)
    protected List<OrderingKeyType.Field> field;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "semantics")
    protected String semantics;
    @XmlAttribute(name = "direction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingKeyType.Selector }
     *     
     */
    public OrderingKeyType.Selector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingKeyType.Selector }
     *     
     */
    public void setSelector(OrderingKeyType.Selector value) {
        this.selector = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderingKeyType.Field }
     * 
     * 
     */
    public List<OrderingKeyType.Field> getField() {
        if (field == null) {
            field = new ArrayList<OrderingKeyType.Field>();
        }
        return this.field;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the semantics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemantics() {
        return semantics;
    }

    /**
     * Sets the value of the semantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemantics(String value) {
        this.semantics = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        if (direction == null) {
            return "descending";
        } else {
            return direction;
        }
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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
     *       &lt;attribute name="xpath" type="{urn:mpeg:mpeg7:schema:2004}xPathFieldType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Field {

        @XmlAttribute(name = "xpath")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String xpath;

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
     *       &lt;attribute name="xpath" type="{urn:mpeg:mpeg7:schema:2004}xPathSelectorType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Selector {

        @XmlAttribute(name = "xpath")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String xpath;

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

    }

}
