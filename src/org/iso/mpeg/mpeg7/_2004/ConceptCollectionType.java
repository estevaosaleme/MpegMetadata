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
 * <p>Java class for ConceptCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}CollectionType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Concept" type="{urn:mpeg:mpeg7:schema:2004}SemanticBaseType"/>
 *           &lt;element name="ConceptRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ConceptCollection" type="{urn:mpeg:mpeg7:schema:2004}ConceptCollectionType"/>
 *           &lt;element name="ConceptCollectionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
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
@XmlType(name = "ConceptCollectionType", propOrder = {
    "conceptOrConceptRef",
    "conceptCollectionOrConceptCollectionRef"
})
public class ConceptCollectionType
    extends CollectionType
{

    @XmlElements({
        @XmlElement(name = "Concept", type = SemanticBaseType.class),
        @XmlElement(name = "ConceptRef", type = ReferenceType.class)
    })
    protected List<Object> conceptOrConceptRef;
    @XmlElements({
        @XmlElement(name = "ConceptCollection", type = ConceptCollectionType.class),
        @XmlElement(name = "ConceptCollectionRef", type = ReferenceType.class)
    })
    protected List<Object> conceptCollectionOrConceptCollectionRef;

    /**
     * Gets the value of the conceptOrConceptRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptOrConceptRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptOrConceptRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticBaseType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getConceptOrConceptRef() {
        if (conceptOrConceptRef == null) {
            conceptOrConceptRef = new ArrayList<Object>();
        }
        return this.conceptOrConceptRef;
    }

    /**
     * Gets the value of the conceptCollectionOrConceptCollectionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptCollectionOrConceptCollectionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptCollectionOrConceptCollectionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptCollectionType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getConceptCollectionOrConceptCollectionRef() {
        if (conceptCollectionOrConceptCollectionRef == null) {
            conceptCollectionOrConceptCollectionRef = new ArrayList<Object>();
        }
        return this.conceptCollectionOrConceptCollectionRef;
    }

}
