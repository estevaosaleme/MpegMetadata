//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralResourcePrioritiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralResourcePrioritiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="ModalityPriorities" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ModalityPrioritiesType" minOccurs="0"/>
 *         &lt;element name="GenrePriorities" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}GenrePrioritiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralResourcePrioritiesType", propOrder = {
    "modalityPriorities",
    "genrePriorities"
})
public class GeneralResourcePrioritiesType
    extends DIABaseType
{

    @XmlElement(name = "ModalityPriorities")
    protected ModalityPrioritiesType modalityPriorities;
    @XmlElement(name = "GenrePriorities")
    protected GenrePrioritiesType genrePriorities;

    /**
     * Gets the value of the modalityPriorities property.
     * 
     * @return
     *     possible object is
     *     {@link ModalityPrioritiesType }
     *     
     */
    public ModalityPrioritiesType getModalityPriorities() {
        return modalityPriorities;
    }

    /**
     * Sets the value of the modalityPriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalityPrioritiesType }
     *     
     */
    public void setModalityPriorities(ModalityPrioritiesType value) {
        this.modalityPriorities = value;
    }

    /**
     * Gets the value of the genrePriorities property.
     * 
     * @return
     *     possible object is
     *     {@link GenrePrioritiesType }
     *     
     */
    public GenrePrioritiesType getGenrePriorities() {
        return genrePriorities;
    }

    /**
     * Sets the value of the genrePriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenrePrioritiesType }
     *     
     */
    public void setGenrePriorities(GenrePrioritiesType value) {
        this.genrePriorities = value;
    }

}
