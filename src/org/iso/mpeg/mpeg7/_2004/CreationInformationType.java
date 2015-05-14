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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;element name="Creation" type="{urn:mpeg:mpeg7:schema:2004}CreationType"/>
 *         &lt;element name="Classification" type="{urn:mpeg:mpeg7:schema:2004}ClassificationType" minOccurs="0"/>
 *         &lt;element name="RelatedMaterial" type="{urn:mpeg:mpeg7:schema:2004}RelatedMaterialType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreationInformationType", propOrder = {
    "creation",
    "classification",
    "relatedMaterial"
})
public class CreationInformationType
    extends DSType
{

    @XmlElement(name = "Creation", required = true)
    protected CreationType creation;
    @XmlElement(name = "Classification")
    protected ClassificationType classification;
    @XmlElement(name = "RelatedMaterial")
    protected List<RelatedMaterialType> relatedMaterial;

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link CreationType }
     *     
     */
    public CreationType getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationType }
     *     
     */
    public void setCreation(CreationType value) {
        this.creation = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType }
     *     
     */
    public ClassificationType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType }
     *     
     */
    public void setClassification(ClassificationType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the relatedMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedMaterialType }
     * 
     * 
     */
    public List<RelatedMaterialType> getRelatedMaterial() {
        if (relatedMaterial == null) {
            relatedMaterial = new ArrayList<RelatedMaterialType>();
        }
        return this.relatedMaterial;
    }

}
