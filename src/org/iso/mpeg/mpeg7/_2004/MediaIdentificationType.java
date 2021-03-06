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
 * <p>Java class for MediaIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaIdentificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DType">
 *       &lt;sequence>
 *         &lt;element name="EntityIdentifier" type="{urn:mpeg:mpeg7:schema:2004}UniqueIDType"/>
 *         &lt;element name="AudioDomain" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VideoDomain" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImageDomain" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaIdentificationType", propOrder = {
    "entityIdentifier",
    "audioDomain",
    "videoDomain",
    "imageDomain"
})
public class MediaIdentificationType
    extends DType
{

    @XmlElement(name = "EntityIdentifier", required = true)
    protected UniqueIDType entityIdentifier;
    @XmlElement(name = "AudioDomain")
    protected List<ControlledTermUseType> audioDomain;
    @XmlElement(name = "VideoDomain")
    protected List<ControlledTermUseType> videoDomain;
    @XmlElement(name = "ImageDomain")
    protected List<ControlledTermUseType> imageDomain;

    /**
     * Gets the value of the entityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getEntityIdentifier() {
        return entityIdentifier;
    }

    /**
     * Sets the value of the entityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setEntityIdentifier(UniqueIDType value) {
        this.entityIdentifier = value;
    }

    /**
     * Gets the value of the audioDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledTermUseType }
     * 
     * 
     */
    public List<ControlledTermUseType> getAudioDomain() {
        if (audioDomain == null) {
            audioDomain = new ArrayList<ControlledTermUseType>();
        }
        return this.audioDomain;
    }

    /**
     * Gets the value of the videoDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledTermUseType }
     * 
     * 
     */
    public List<ControlledTermUseType> getVideoDomain() {
        if (videoDomain == null) {
            videoDomain = new ArrayList<ControlledTermUseType>();
        }
        return this.videoDomain;
    }

    /**
     * Gets the value of the imageDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledTermUseType }
     * 
     * 
     */
    public List<ControlledTermUseType> getImageDomain() {
        if (imageDomain == null) {
            imageDomain = new ArrayList<ControlledTermUseType>();
        }
        return this.imageDomain;
    }

}
