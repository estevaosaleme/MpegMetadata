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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContinuousHiddenMarkovModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContinuousHiddenMarkovModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}StateTransitionModelType">
 *       &lt;sequence>
 *         &lt;element name="DescriptorModel" type="{urn:mpeg:mpeg7:schema:2004}DescriptorModelType" maxOccurs="unbounded"/>
 *         &lt;element name="ObservationDistribution" type="{urn:mpeg:mpeg7:schema:2004}ContinuousDistributionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinuousHiddenMarkovModelType", propOrder = {
    "descriptorModel",
    "observationDistribution"
})
@XmlSeeAlso({
    SoundModelType.class
})
public class ContinuousHiddenMarkovModelType
    extends StateTransitionModelType
{

    @XmlElement(name = "DescriptorModel", required = true)
    protected List<DescriptorModelType> descriptorModel;
    @XmlElement(name = "ObservationDistribution", required = true)
    protected List<ContinuousDistributionType> observationDistribution;

    /**
     * Gets the value of the descriptorModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptorModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptorModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorModelType }
     * 
     * 
     */
    public List<DescriptorModelType> getDescriptorModel() {
        if (descriptorModel == null) {
            descriptorModel = new ArrayList<DescriptorModelType>();
        }
        return this.descriptorModel;
    }

    /**
     * Gets the value of the observationDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContinuousDistributionType }
     * 
     * 
     */
    public List<ContinuousDistributionType> getObservationDistribution() {
        if (observationDistribution == null) {
            observationDistribution = new ArrayList<ContinuousDistributionType>();
        }
        return this.observationDistribution;
    }

}
