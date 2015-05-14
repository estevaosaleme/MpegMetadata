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
 * <p>Java class for MediaReviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaReviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rating" type="{urn:mpeg:mpeg7:schema:2004}RatingType" minOccurs="0"/>
 *         &lt;element name="FreeTextReview" type="{urn:mpeg:mpeg7:schema:2004}TextualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReviewReference" type="{urn:mpeg:mpeg7:schema:2004}RelatedMaterialType" minOccurs="0"/>
 *         &lt;element name="Reviewer" type="{urn:mpeg:mpeg7:schema:2004}AgentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaReviewType", propOrder = {
    "rating",
    "freeTextReview",
    "reviewReference",
    "reviewer"
})
public class MediaReviewType {

    @XmlElement(name = "Rating")
    protected RatingType rating;
    @XmlElement(name = "FreeTextReview")
    protected List<TextualType> freeTextReview;
    @XmlElement(name = "ReviewReference")
    protected RelatedMaterialType reviewReference;
    @XmlElement(name = "Reviewer")
    protected AgentType reviewer;

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link RatingType }
     *     
     */
    public RatingType getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingType }
     *     
     */
    public void setRating(RatingType value) {
        this.rating = value;
    }

    /**
     * Gets the value of the freeTextReview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeTextReview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeTextReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextualType }
     * 
     * 
     */
    public List<TextualType> getFreeTextReview() {
        if (freeTextReview == null) {
            freeTextReview = new ArrayList<TextualType>();
        }
        return this.freeTextReview;
    }

    /**
     * Gets the value of the reviewReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedMaterialType }
     *     
     */
    public RelatedMaterialType getReviewReference() {
        return reviewReference;
    }

    /**
     * Sets the value of the reviewReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedMaterialType }
     *     
     */
    public void setReviewReference(RelatedMaterialType value) {
        this.reviewReference = value;
    }

    /**
     * Gets the value of the reviewer property.
     * 
     * @return
     *     possible object is
     *     {@link AgentType }
     *     
     */
    public AgentType getReviewer() {
        return reviewer;
    }

    /**
     * Sets the value of the reviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType }
     *     
     */
    public void setReviewer(AgentType value) {
        this.reviewer = value;
    }

}