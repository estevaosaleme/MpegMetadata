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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SemanticBaseType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Event" type="{urn:mpeg:mpeg7:schema:2004}EventType"/>
 *           &lt;element name="EventRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;element name="SemanticPlace" type="{urn:mpeg:mpeg7:schema:2004}SemanticPlaceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SemanticTime" type="{urn:mpeg:mpeg7:schema:2004}SemanticTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "eventOrEventRef",
    "semanticPlace",
    "semanticTime"
})
public class EventType
    extends SemanticBaseType
{

    @XmlElements({
        @XmlElement(name = "Event", type = EventType.class),
        @XmlElement(name = "EventRef", type = ReferenceType.class)
    })
    protected List<Object> eventOrEventRef;
    @XmlElement(name = "SemanticPlace")
    protected List<SemanticPlaceType> semanticPlace;
    @XmlElement(name = "SemanticTime")
    protected List<SemanticTimeType> semanticTime;

    /**
     * Gets the value of the eventOrEventRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventOrEventRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventOrEventRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getEventOrEventRef() {
        if (eventOrEventRef == null) {
            eventOrEventRef = new ArrayList<Object>();
        }
        return this.eventOrEventRef;
    }

    /**
     * Gets the value of the semanticPlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticPlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticPlaceType }
     * 
     * 
     */
    public List<SemanticPlaceType> getSemanticPlace() {
        if (semanticPlace == null) {
            semanticPlace = new ArrayList<SemanticPlaceType>();
        }
        return this.semanticPlace;
    }

    /**
     * Gets the value of the semanticTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticTimeType }
     * 
     * 
     */
    public List<SemanticTimeType> getSemanticTime() {
        if (semanticTime == null) {
            semanticTime = new ArrayList<SemanticTimeType>();
        }
        return this.semanticTime;
    }

}
