//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.iso.mpeg.mpeg7._2001.ControlledTermUseType;


/**
 * <p>Java class for ModalityPrioritiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModalityPrioritiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="Modality" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2001}ControlledTermUseType">
 *                 &lt;attribute name="priorityLevel" type="{urn:mpeg:mpeg7:schema:2001}nonNegativeReal" default="1.0" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalityPrioritiesType", propOrder = {
    "modality"
})
public class ModalityPrioritiesType
    extends DIABaseType
{

    @XmlElement(name = "Modality")
    protected List<ModalityPrioritiesType.Modality> modality;

    /**
     * Gets the value of the modality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModalityPrioritiesType.Modality }
     * 
     * 
     */
    public List<ModalityPrioritiesType.Modality> getModality() {
        if (modality == null) {
            modality = new ArrayList<ModalityPrioritiesType.Modality>();
        }
        return this.modality;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}ControlledTermUseType">
     *       &lt;attribute name="priorityLevel" type="{urn:mpeg:mpeg7:schema:2001}nonNegativeReal" default="1.0" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Modality
        extends ControlledTermUseType
    {

        @XmlAttribute(name = "priorityLevel")
        protected Double priorityLevel;

        /**
         * Gets the value of the priorityLevel property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getPriorityLevel() {
            if (priorityLevel == null) {
                return  1.0D;
            } else {
                return priorityLevel;
            }
        }

        /**
         * Sets the value of the priorityLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setPriorityLevel(Double value) {
            this.priorityLevel = value;
        }

    }

}
