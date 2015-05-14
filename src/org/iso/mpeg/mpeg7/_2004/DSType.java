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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}Mpeg7BaseType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:mpeg:mpeg7:schema:2004}HeaderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:mpeg:mpeg7:schema:2004}mediaTimePropertyGrp"/>
 *       &lt;attGroup ref="{urn:mpeg:mpeg7:schema:2004}timePropertyGrp"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSType", propOrder = {
    "header"
})
@XmlSeeAlso({
    PackageType.class,
    CreationInformationType.class,
    SummarySegmentType.class,
    CreationPreferencesType.class,
    MediaInformationType.class,
    FilteringAndSearchPreferencesType.class,
    AvailabilityType.class,
    UsageInformationType.class,
    InkMediaInformationType.class,
    UserActionHistoryType.class,
    UsageRecordType.class,
    VariationType.class,
    BrowsingPreferencesType.class,
    HandWritingRecogInformationType.class,
    SummaryPreferencesType.class,
    VariationSetType.class,
    UserActionListType.class,
    UserActionType.class,
    PlaceType.class,
    SourcePreferencesType.class,
    DisseminationType.class,
    UsageHistoryType.class,
    AffectiveType.class,
    MediaProfileType.class,
    SummarizationType.class,
    HandWritingRecogResultType.class,
    GraphType.class,
    ClassificationType.class,
    SummarySegmentGroupType.class,
    ViewType.class,
    ClassificationSchemeBaseType.class,
    ViewDecompositionType.class,
    RelatedMaterialType.class,
    UserPreferencesType.class,
    MediaInstanceType.class,
    SummaryThemeListType.class,
    MultimediaContentType.class,
    LinguisticEntityType.class,
    AgentType.class,
    RelationType.class,
    StructuredCollectionType.class,
    SegmentType.class,
    TermDefinitionBaseType.class,
    CreationType.class,
    SummaryType.class,
    CollectionType.class,
    VisualDSType.class,
    AudioDSType.class,
    ClassificationPreferencesType.class,
    GraphicalRuleDefinitionType.class,
    ModelType.class,
    SemanticBaseType.class,
    SegmentDecompositionType.class
})
public abstract class DSType
    extends Mpeg7BaseType
{

    @XmlElement(name = "Header")
    protected List<HeaderType> header;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "mediaTimeBase")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaTimeBase;
    @XmlAttribute(name = "mediaTimeUnit")
    protected String mediaTimeUnit;
    @XmlAttribute(name = "timeBase")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timeBase;
    @XmlAttribute(name = "timeUnit")
    protected String timeUnit;

    /**
     * Gets the value of the header property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the header property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderType }
     * 
     * 
     */
    public List<HeaderType> getHeader() {
        if (header == null) {
            header = new ArrayList<HeaderType>();
        }
        return this.header;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mediaTimeBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTimeBase() {
        return mediaTimeBase;
    }

    /**
     * Sets the value of the mediaTimeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTimeBase(String value) {
        this.mediaTimeBase = value;
    }

    /**
     * Gets the value of the mediaTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTimeUnit() {
        return mediaTimeUnit;
    }

    /**
     * Sets the value of the mediaTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTimeUnit(String value) {
        this.mediaTimeUnit = value;
    }

    /**
     * Gets the value of the timeBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeBase() {
        return timeBase;
    }

    /**
     * Sets the value of the timeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBase(String value) {
        this.timeBase = value;
    }

    /**
     * Gets the value of the timeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets the value of the timeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeUnit(String value) {
        this.timeUnit = value;
    }

}
