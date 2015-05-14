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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="MediaInformation" type="{urn:mpeg:mpeg7:schema:2004}MediaInformationType"/>
 *           &lt;element name="MediaInformationRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *           &lt;element name="MediaLocator" type="{urn:mpeg:mpeg7:schema:2004}MediaLocatorType"/>
 *         &lt;/choice>
 *         &lt;element name="StructuralUnit" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CreationInformation" type="{urn:mpeg:mpeg7:schema:2004}CreationInformationType"/>
 *           &lt;element name="CreationInformationRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="UsageInformation" type="{urn:mpeg:mpeg7:schema:2004}UsageInformationType"/>
 *           &lt;element name="UsageInformationRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;element name="TextAnnotation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2004}TextAnnotationType">
 *                 &lt;attribute name="type">
 *                   &lt;simpleType>
 *                     &lt;union memberTypes=" {urn:mpeg:mpeg7:schema:2004}termAliasReferenceType {urn:mpeg:mpeg7:schema:2004}termURIReferenceType {http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/union>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Semantic" type="{urn:mpeg:mpeg7:schema:2004}SemanticType"/>
 *           &lt;element name="SemanticRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;element name="MatchingHint" type="{urn:mpeg:mpeg7:schema:2004}MatchingHintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PointOfView" type="{urn:mpeg:mpeg7:schema:2004}PointOfViewType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relation" type="{urn:mpeg:mpeg7:schema:2004}RelationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", propOrder = {
    "mediaInformation",
    "mediaInformationRef",
    "mediaLocator",
    "structuralUnit",
    "creationInformation",
    "creationInformationRef",
    "usageInformation",
    "usageInformationRef",
    "textAnnotation",
    "semanticOrSemanticRef",
    "matchingHint",
    "pointOfView",
    "relation"
})
@XmlSeeAlso({
    MultimediaSegmentType.class,
    AudioVisualRegionType.class,
    TextSegmentType.class,
    AudioVisualSegmentType.class,
    InkSegmentType.class,
    StillRegionType.class,
    StillRegion3DType.class,
    MovingRegionType.class,
    AudioSegmentType.class,
    VideoSegmentType.class
})
public abstract class SegmentType
    extends DSType
{

    @XmlElement(name = "MediaInformation")
    protected MediaInformationType mediaInformation;
    @XmlElement(name = "MediaInformationRef")
    protected ReferenceType mediaInformationRef;
    @XmlElement(name = "MediaLocator")
    protected MediaLocatorType mediaLocator;
    @XmlElement(name = "StructuralUnit")
    protected ControlledTermUseType structuralUnit;
    @XmlElement(name = "CreationInformation")
    protected CreationInformationType creationInformation;
    @XmlElement(name = "CreationInformationRef")
    protected ReferenceType creationInformationRef;
    @XmlElement(name = "UsageInformation")
    protected UsageInformationType usageInformation;
    @XmlElement(name = "UsageInformationRef")
    protected ReferenceType usageInformationRef;
    @XmlElement(name = "TextAnnotation")
    protected List<SegmentType.TextAnnotation> textAnnotation;
    @XmlElements({
        @XmlElement(name = "Semantic", type = SemanticType.class),
        @XmlElement(name = "SemanticRef", type = ReferenceType.class)
    })
    protected List<Object> semanticOrSemanticRef;
    @XmlElement(name = "MatchingHint")
    protected List<MatchingHintType> matchingHint;
    @XmlElement(name = "PointOfView")
    protected List<PointOfViewType> pointOfView;
    @XmlElement(name = "Relation")
    protected List<RelationType> relation;

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
     * Gets the value of the structuralUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledTermUseType }
     *     
     */
    public ControlledTermUseType getStructuralUnit() {
        return structuralUnit;
    }

    /**
     * Sets the value of the structuralUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledTermUseType }
     *     
     */
    public void setStructuralUnit(ControlledTermUseType value) {
        this.structuralUnit = value;
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

    /**
     * Gets the value of the textAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.TextAnnotation }
     * 
     * 
     */
    public List<SegmentType.TextAnnotation> getTextAnnotation() {
        if (textAnnotation == null) {
            textAnnotation = new ArrayList<SegmentType.TextAnnotation>();
        }
        return this.textAnnotation;
    }

    /**
     * Gets the value of the semanticOrSemanticRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticOrSemanticRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticOrSemanticRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getSemanticOrSemanticRef() {
        if (semanticOrSemanticRef == null) {
            semanticOrSemanticRef = new ArrayList<Object>();
        }
        return this.semanticOrSemanticRef;
    }

    /**
     * Gets the value of the matchingHint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchingHint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchingHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchingHintType }
     * 
     * 
     */
    public List<MatchingHintType> getMatchingHint() {
        if (matchingHint == null) {
            matchingHint = new ArrayList<MatchingHintType>();
        }
        return this.matchingHint;
    }

    /**
     * Gets the value of the pointOfView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfViewType }
     * 
     * 
     */
    public List<PointOfViewType> getPointOfView() {
        if (pointOfView == null) {
            pointOfView = new ArrayList<PointOfViewType>();
        }
        return this.pointOfView;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelation() {
        if (relation == null) {
            relation = new ArrayList<RelationType>();
        }
        return this.relation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}TextAnnotationType">
     *       &lt;attribute name="type">
     *         &lt;simpleType>
     *           &lt;union memberTypes=" {urn:mpeg:mpeg7:schema:2004}termAliasReferenceType {urn:mpeg:mpeg7:schema:2004}termURIReferenceType {http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/union>
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
    @XmlType(name = "")
    public static class TextAnnotation
        extends TextAnnotationType
    {

        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
