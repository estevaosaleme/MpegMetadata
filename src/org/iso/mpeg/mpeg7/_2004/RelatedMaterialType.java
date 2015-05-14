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
 * <p>Java class for RelatedMaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedMaterialType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;element name="DisseminationFormat" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{urn:mpeg:mpeg7:schema:2004}TermUseType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="MediaLocator" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
 *           &lt;element name="MediaInformation" type="{urn:mpeg:mpeg7:schema:2004}MediaInformationType"/>
 *           &lt;element name="MediaInformationRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CreationInformation" type="{urn:mpeg:mpeg7:schema:2004}CreationInformationType"/>
 *           &lt;element name="CreationInformationRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="UsageInformation" type="{urn:mpeg:mpeg7:schema:2004}UsageInformationType"/>
 *           &lt;element name="UsageInformationRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedMaterialType", propOrder = {
    "disseminationFormat",
    "materialType",
    "mediaLocator",
    "mediaInformation",
    "mediaInformationRef",
    "creationInformation",
    "creationInformationRef",
    "usageInformation",
    "usageInformationRef"
})
public class RelatedMaterialType
    extends DSType
{

    @XmlElement(name = "DisseminationFormat")
    protected ControlledTermUseType disseminationFormat;
    @XmlElement(name = "MaterialType")
    protected TermUseType materialType;
    @XmlElement(name = "MediaLocator")
    protected MediaLocatorType mediaLocator;
    @XmlElement(name = "MediaInformation")
    protected MediaInformationType mediaInformation;
    @XmlElement(name = "MediaInformationRef")
    protected ReferenceType mediaInformationRef;
    @XmlElement(name = "CreationInformation")
    protected CreationInformationType creationInformation;
    @XmlElement(name = "CreationInformationRef")
    protected ReferenceType creationInformationRef;
    @XmlElement(name = "UsageInformation")
    protected UsageInformationType usageInformation;
    @XmlElement(name = "UsageInformationRef")
    protected ReferenceType usageInformationRef;

    /**
     * Gets the value of the disseminationFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledTermUseType }
     *     
     */
    public ControlledTermUseType getDisseminationFormat() {
        return disseminationFormat;
    }

    /**
     * Sets the value of the disseminationFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledTermUseType }
     *     
     */
    public void setDisseminationFormat(ControlledTermUseType value) {
        this.disseminationFormat = value;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link TermUseType }
     *     
     */
    public TermUseType getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUseType }
     *     
     */
    public void setMaterialType(TermUseType value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the mediaLocator property.
     * 
     * @return
     *     possible object is
     *     {@link MediaLocatorType }
     *     
     */
    public MediaLocatorType getMediaLocator() {
        return mediaLocator;
    }

    /**
     * Sets the value of the mediaLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaLocatorType }
     *     
     */
    public void setMediaLocator(MediaLocatorType value) {
        this.mediaLocator = value;
    }

    /**
     * Gets the value of the mediaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MediaInformationType }
     *     
     */
    public MediaInformationType getMediaInformation() {
        return mediaInformation;
    }

    /**
     * Sets the value of the mediaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaInformationType }
     *     
     */
    public void setMediaInformation(MediaInformationType value) {
        this.mediaInformation = value;
    }

    /**
     * Gets the value of the mediaInformationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getMediaInformationRef() {
        return mediaInformationRef;
    }

    /**
     * Sets the value of the mediaInformationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setMediaInformationRef(ReferenceType value) {
        this.mediaInformationRef = value;
    }

    /**
     * Gets the value of the creationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreationInformationType }
     *     
     */
    public CreationInformationType getCreationInformation() {
        return creationInformation;
    }

    /**
     * Sets the value of the creationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationInformationType }
     *     
     */
    public void setCreationInformation(CreationInformationType value) {
        this.creationInformation = value;
    }

    /**
     * Gets the value of the creationInformationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCreationInformationRef() {
        return creationInformationRef;
    }

    /**
     * Sets the value of the creationInformationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCreationInformationRef(ReferenceType value) {
        this.creationInformationRef = value;
    }

    /**
     * Gets the value of the usageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link UsageInformationType }
     *     
     */
    public UsageInformationType getUsageInformation() {
        return usageInformation;
    }

    /**
     * Sets the value of the usageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageInformationType }
     *     
     */
    public void setUsageInformation(UsageInformationType value) {
        this.usageInformation = value;
    }

    /**
     * Gets the value of the usageInformationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUsageInformationRef() {
        return usageInformationRef;
    }

    /**
     * Sets the value of the usageInformationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUsageInformationRef(ReferenceType value) {
        this.usageInformationRef = value;
    }

}