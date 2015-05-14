//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinguisticDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinguisticDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}LinguisticEntityType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Heading" type="{urn:mpeg:mpeg7:schema:2004}SentencesType"/>
 *         &lt;element name="Division" type="{urn:mpeg:mpeg7:schema:2004}LinguisticDocumentType"/>
 *         &lt;element name="Paragraph" type="{urn:mpeg:mpeg7:schema:2004}SentencesType"/>
 *         &lt;element name="Sentences" type="{urn:mpeg:mpeg7:schema:2004}SentencesType"/>
 *         &lt;element name="Sentence" type="{urn:mpeg:mpeg7:schema:2004}SyntacticConstituentType"/>
 *         &lt;element name="Quotation" type="{urn:mpeg:mpeg7:schema:2004}LinguisticDocumentType"/>
 *       &lt;/choice>
 *       &lt;attribute name="synthesis" type="{urn:mpeg:mpeg7:schema:2004}synthesisType" default="coordination" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticDocumentType", propOrder = {
    "headingOrDivisionOrParagraph"
})
public class LinguisticDocumentType
    extends LinguisticEntityType
{

    @XmlElementRefs({
        @XmlElementRef(name = "Sentences", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Sentence", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Quotation", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Heading", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Division", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Paragraph", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends LinguisticEntityType>> headingOrDivisionOrParagraph;
    @XmlAttribute(name = "synthesis")
    protected SynthesisType synthesis;

    /**
     * Gets the value of the headingOrDivisionOrParagraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headingOrDivisionOrParagraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadingOrDivisionOrParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SentencesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinguisticDocumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinguisticDocumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link SentencesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SentencesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyntacticConstituentType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends LinguisticEntityType>> getHeadingOrDivisionOrParagraph() {
        if (headingOrDivisionOrParagraph == null) {
            headingOrDivisionOrParagraph = new ArrayList<JAXBElement<? extends LinguisticEntityType>>();
        }
        return this.headingOrDivisionOrParagraph;
    }

    /**
     * Gets the value of the synthesis property.
     * 
     * @return
     *     possible object is
     *     {@link SynthesisType }
     *     
     */
    public SynthesisType getSynthesis() {
        if (synthesis == null) {
            return SynthesisType.COORDINATION;
        } else {
            return synthesis;
        }
    }

    /**
     * Sets the value of the synthesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynthesisType }
     *     
     */
    public void setSynthesis(SynthesisType value) {
        this.synthesis = value;
    }

}
