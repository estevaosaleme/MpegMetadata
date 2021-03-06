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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancedFaceRecognitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedFaceRecognitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualDType">
 *       &lt;sequence>
 *         &lt;element name="FourierFeature">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
 *               &lt;/simpleType>
 *               &lt;minLength value="24"/>
 *               &lt;maxLength value="63"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CentralFourierFeature">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
 *               &lt;/simpleType>
 *               &lt;minLength value="24"/>
 *               &lt;maxLength value="63"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="CompositeFeature">
 *             &lt;simpleType>
 *               &lt;restriction>
 *                 &lt;simpleType>
 *                   &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
 *                 &lt;/simpleType>
 *                 &lt;minLength value="0"/>
 *                 &lt;maxLength value="63"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="SubregionCompositeFeature">
 *             &lt;simpleType>
 *               &lt;restriction>
 *                 &lt;simpleType>
 *                   &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned5" />
 *                 &lt;/simpleType>
 *                 &lt;minLength value="0"/>
 *                 &lt;maxLength value="63"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedFaceRecognitionType", propOrder = {
    "fourierFeature",
    "centralFourierFeature",
    "compositeFeature",
    "subregionCompositeFeature"
})
public class AdvancedFaceRecognitionType
    extends VisualDType
{

    @XmlList
    @XmlElement(name = "FourierFeature", type = Integer.class)
    protected List<Integer> fourierFeature;
    @XmlList
    @XmlElement(name = "CentralFourierFeature", type = Integer.class)
    protected List<Integer> centralFourierFeature;
    @XmlList
    @XmlElement(name = "CompositeFeature", type = Integer.class)
    protected List<Integer> compositeFeature;
    @XmlList
    @XmlElement(name = "SubregionCompositeFeature", type = Integer.class)
    protected List<Integer> subregionCompositeFeature;

    /**
     * Gets the value of the fourierFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fourierFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFourierFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFourierFeature() {
        if (fourierFeature == null) {
            fourierFeature = new ArrayList<Integer>();
        }
        return this.fourierFeature;
    }

    /**
     * Gets the value of the centralFourierFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centralFourierFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentralFourierFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCentralFourierFeature() {
        if (centralFourierFeature == null) {
            centralFourierFeature = new ArrayList<Integer>();
        }
        return this.centralFourierFeature;
    }

    /**
     * Gets the value of the compositeFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCompositeFeature() {
        if (compositeFeature == null) {
            compositeFeature = new ArrayList<Integer>();
        }
        return this.compositeFeature;
    }

    /**
     * Gets the value of the subregionCompositeFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subregionCompositeFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubregionCompositeFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSubregionCompositeFeature() {
        if (subregionCompositeFeature == null) {
            subregionCompositeFeature = new ArrayList<Integer>();
        }
        return this.subregionCompositeFeature;
    }

}
