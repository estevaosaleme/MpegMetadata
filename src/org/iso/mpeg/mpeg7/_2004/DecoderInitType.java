//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecoderInitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecoderInitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchemaReference" type="{urn:mpeg:mpeg7:schema:2004}SchemaReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="InitialDescription" type="{urn:mpeg:mpeg7:schema:2004}AccessUnitType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="systemsProfileLevelIndication" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecoderInitType", propOrder = {
    "schemaReference",
    "initialDescription"
})
public class DecoderInitType {

    @XmlElement(name = "SchemaReference", required = true)
    protected List<SchemaReferenceType> schemaReference;
    @XmlElement(name = "InitialDescription")
    protected AccessUnitType initialDescription;
    @XmlAttribute(name = "systemsProfileLevelIndication", required = true)
    protected BigDecimal systemsProfileLevelIndication;

    /**
     * Gets the value of the schemaReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemaReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemaReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemaReferenceType }
     * 
     * 
     */
    public List<SchemaReferenceType> getSchemaReference() {
        if (schemaReference == null) {
            schemaReference = new ArrayList<SchemaReferenceType>();
        }
        return this.schemaReference;
    }

    /**
     * Gets the value of the initialDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AccessUnitType }
     *     
     */
    public AccessUnitType getInitialDescription() {
        return initialDescription;
    }

    /**
     * Sets the value of the initialDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessUnitType }
     *     
     */
    public void setInitialDescription(AccessUnitType value) {
        this.initialDescription = value;
    }

    /**
     * Gets the value of the systemsProfileLevelIndication property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSystemsProfileLevelIndication() {
        return systemsProfileLevelIndication;
    }

    /**
     * Sets the value of the systemsProfileLevelIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSystemsProfileLevelIndication(BigDecimal value) {
        this.systemsProfileLevelIndication = value;
    }

}
