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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescriptionMetadata" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}DescriptionMetadataType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Description" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIADescriptionType"/>
 *           &lt;element name="Reference" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ReferenceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descriptionMetadata",
    "descriptionOrReference"
})
@XmlRootElement(name = "DIA")
public class DIA {

    @XmlElement(name = "DescriptionMetadata")
    protected DescriptionMetadataType descriptionMetadata;
    @XmlElements({
        @XmlElement(name = "Description", type = DIADescriptionType.class),
        @XmlElement(name = "Reference", type = ReferenceType.class)
    })
    protected List<Object> descriptionOrReference;

    /**
     * Gets the value of the descriptionMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionMetadataType }
     *     
     */
    public DescriptionMetadataType getDescriptionMetadata() {
        return descriptionMetadata;
    }

    /**
     * Sets the value of the descriptionMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionMetadataType }
     *     
     */
    public void setDescriptionMetadata(DescriptionMetadataType value) {
        this.descriptionMetadata = value;
    }

    /**
     * Gets the value of the descriptionOrReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOrReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOrReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DIADescriptionType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getDescriptionOrReference() {
        if (descriptionOrReference == null) {
            descriptionOrReference = new ArrayList<Object>();
        }
        return this.descriptionOrReference;
    }

}
