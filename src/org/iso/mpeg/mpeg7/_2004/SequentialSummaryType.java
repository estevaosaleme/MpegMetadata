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


/**
 * <p>Java class for SequentialSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequentialSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SummaryType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AudioVisualSummaryLocator" type="{urn:mpeg:mpeg7:schema:2004}TemporalSegmentLocatorType" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;element name="VideoSummaryLocator" type="{urn:mpeg:mpeg7:schema:2004}TemporalSegmentLocatorType" minOccurs="0"/>
 *             &lt;element name="AudioSummaryLocator" type="{urn:mpeg:mpeg7:schema:2004}TemporalSegmentLocatorType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="VisualSummaryComponent" type="{urn:mpeg:mpeg7:schema:2004}VisualSummaryComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AudioSummaryComponent" type="{urn:mpeg:mpeg7:schema:2004}AudioSummaryComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextualSummaryComponent" type="{urn:mpeg:mpeg7:schema:2004}TextualSummaryComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="components">
 *         &lt;simpleType>
 *           &lt;list>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                 &lt;enumeration value="visual"/>
 *                 &lt;enumeration value="audio"/>
 *                 &lt;enumeration value="textual"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/list>
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
@XmlType(name = "SequentialSummaryType", propOrder = {
    "audioVisualSummaryLocator",
    "videoSummaryLocator",
    "audioSummaryLocator",
    "visualSummaryComponent",
    "audioSummaryComponent",
    "textualSummaryComponent"
})
public class SequentialSummaryType
    extends SummaryType
{

    @XmlElement(name = "AudioVisualSummaryLocator")
    protected TemporalSegmentLocatorType audioVisualSummaryLocator;
    @XmlElement(name = "VideoSummaryLocator")
    protected TemporalSegmentLocatorType videoSummaryLocator;
    @XmlElement(name = "AudioSummaryLocator")
    protected TemporalSegmentLocatorType audioSummaryLocator;
    @XmlElement(name = "VisualSummaryComponent")
    protected List<VisualSummaryComponentType> visualSummaryComponent;
    @XmlElement(name = "AudioSummaryComponent")
    protected List<AudioSummaryComponentType> audioSummaryComponent;
    @XmlElement(name = "TextualSummaryComponent")
    protected List<TextualSummaryComponentType> textualSummaryComponent;
    @XmlAttribute(name = "components")
    protected List<String> components;

    /**
     * Gets the value of the audioVisualSummaryLocator property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public TemporalSegmentLocatorType getAudioVisualSummaryLocator() {
        return audioVisualSummaryLocator;
    }

    /**
     * Sets the value of the audioVisualSummaryLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public void setAudioVisualSummaryLocator(TemporalSegmentLocatorType value) {
        this.audioVisualSummaryLocator = value;
    }

    /**
     * Gets the value of the videoSummaryLocator property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public TemporalSegmentLocatorType getVideoSummaryLocator() {
        return videoSummaryLocator;
    }

    /**
     * Sets the value of the videoSummaryLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public void setVideoSummaryLocator(TemporalSegmentLocatorType value) {
        this.videoSummaryLocator = value;
    }

    /**
     * Gets the value of the audioSummaryLocator property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public TemporalSegmentLocatorType getAudioSummaryLocator() {
        return audioSummaryLocator;
    }

    /**
     * Sets the value of the audioSummaryLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public void setAudioSummaryLocator(TemporalSegmentLocatorType value) {
        this.audioSummaryLocator = value;
    }

    /**
     * Gets the value of the visualSummaryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualSummaryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualSummaryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualSummaryComponentType }
     * 
     * 
     */
    public List<VisualSummaryComponentType> getVisualSummaryComponent() {
        if (visualSummaryComponent == null) {
            visualSummaryComponent = new ArrayList<VisualSummaryComponentType>();
        }
        return this.visualSummaryComponent;
    }

    /**
     * Gets the value of the audioSummaryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioSummaryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioSummaryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioSummaryComponentType }
     * 
     * 
     */
    public List<AudioSummaryComponentType> getAudioSummaryComponent() {
        if (audioSummaryComponent == null) {
            audioSummaryComponent = new ArrayList<AudioSummaryComponentType>();
        }
        return this.audioSummaryComponent;
    }

    /**
     * Gets the value of the textualSummaryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textualSummaryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextualSummaryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextualSummaryComponentType }
     * 
     * 
     */
    public List<TextualSummaryComponentType> getTextualSummaryComponent() {
        if (textualSummaryComponent == null) {
            textualSummaryComponent = new ArrayList<TextualSummaryComponentType>();
        }
        return this.textualSummaryComponent;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComponents() {
        if (components == null) {
            components = new ArrayList<String>();
        }
        return this.components;
    }

}
