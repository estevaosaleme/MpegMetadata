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
 * <p>Java class for DescriptionMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptionMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}HeaderType">
 *       &lt;sequence>
 *         &lt;element name="Confidence" type="{urn:mpeg:mpeg7:schema:2004}zeroToOneType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdate" type="{urn:mpeg:mpeg7:schema:2004}timePointType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{urn:mpeg:mpeg7:schema:2004}TextAnnotationType" minOccurs="0"/>
 *         &lt;element name="PublicIdentifier" type="{urn:mpeg:mpeg7:schema:2004}UniqueIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrivateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Creator" type="{urn:mpeg:mpeg7:schema:2004}CreatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationLocation" type="{urn:mpeg:mpeg7:schema:2004}PlaceType" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{urn:mpeg:mpeg7:schema:2004}timePointType" minOccurs="0"/>
 *         &lt;element name="Instrument" type="{urn:mpeg:mpeg7:schema:2004}CreationToolType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rights" type="{urn:mpeg:mpeg7:schema:2004}RightsType" minOccurs="0"/>
 *         &lt;element name="Package" type="{urn:mpeg:mpeg7:schema:2004}PackageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionMetadataType", propOrder = {
    "confidence",
    "version",
    "lastUpdate",
    "comment",
    "publicIdentifier",
    "privateIdentifier",
    "creator",
    "creationLocation",
    "creationTime",
    "instrument",
    "rights",
    "_package"
})
public class DescriptionMetadataType
    extends HeaderType
{

    @XmlElement(name = "Confidence")
    protected Float confidence;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "LastUpdate")
    protected String lastUpdate;
    @XmlElement(name = "Comment")
    protected TextAnnotationType comment;
    @XmlElement(name = "PublicIdentifier")
    protected List<UniqueIDType> publicIdentifier;
    @XmlElement(name = "PrivateIdentifier")
    protected List<String> privateIdentifier;
    @XmlElement(name = "Creator")
    protected List<CreatorType> creator;
    @XmlElement(name = "CreationLocation")
    protected PlaceType creationLocation;
    @XmlElement(name = "CreationTime")
    protected String creationTime;
    @XmlElement(name = "Instrument")
    protected List<CreationToolType> instrument;
    @XmlElement(name = "Rights")
    protected RightsType rights;
    @XmlElement(name = "Package")
    protected PackageType _package;

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConfidence(Float value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link TextAnnotationType }
     *     
     */
    public TextAnnotationType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAnnotationType }
     *     
     */
    public void setComment(TextAnnotationType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the publicIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getPublicIdentifier() {
        if (publicIdentifier == null) {
            publicIdentifier = new ArrayList<UniqueIDType>();
        }
        return this.publicIdentifier;
    }

    /**
     * Gets the value of the privateIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrivateIdentifier() {
        if (privateIdentifier == null) {
            privateIdentifier = new ArrayList<String>();
        }
        return this.privateIdentifier;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatorType }
     * 
     * 
     */
    public List<CreatorType> getCreator() {
        if (creator == null) {
            creator = new ArrayList<CreatorType>();
        }
        return this.creator;
    }

    /**
     * Gets the value of the creationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getCreationLocation() {
        return creationLocation;
    }

    /**
     * Sets the value of the creationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setCreationLocation(PlaceType value) {
        this.creationLocation = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationToolType }
     * 
     * 
     */
    public List<CreationToolType> getInstrument() {
        if (instrument == null) {
            instrument = new ArrayList<CreationToolType>();
        }
        return this.instrument;
    }

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link RightsType }
     *     
     */
    public RightsType getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsType }
     *     
     */
    public void setRights(RightsType value) {
        this.rights = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackage(PackageType value) {
        this._package = value;
    }

}
