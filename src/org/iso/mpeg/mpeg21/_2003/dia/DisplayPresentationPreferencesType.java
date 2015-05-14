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
 * <p>Java class for DisplayPresentationPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayPresentationPreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserCharacteristicBaseType">
 *       &lt;sequence>
 *         &lt;element name="ColorTemperaturePreference" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ColorPreferenceType" minOccurs="0"/>
 *         &lt;element name="BrightnessPreference" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ColorPreferenceType" minOccurs="0"/>
 *         &lt;element name="SaturationPreference" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ColorPreferenceType" minOccurs="0"/>
 *         &lt;element name="ContrastPreference" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ColorPreferenceType" minOccurs="0"/>
 *         &lt;element name="StereoscopicVideoConversion" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}StereoscopicVideoConversionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayPresentationPreferencesType", propOrder = {
    "colorTemperaturePreference",
    "brightnessPreference",
    "saturationPreference",
    "contrastPreference",
    "stereoscopicVideoConversion"
})
public class DisplayPresentationPreferencesType
    extends UserCharacteristicBaseType
{

    @XmlElement(name = "ColorTemperaturePreference")
    protected ColorPreferenceType colorTemperaturePreference;
    @XmlElement(name = "BrightnessPreference")
    protected ColorPreferenceType brightnessPreference;
    @XmlElement(name = "SaturationPreference")
    protected ColorPreferenceType saturationPreference;
    @XmlElement(name = "ContrastPreference")
    protected ColorPreferenceType contrastPreference;
    @XmlElement(name = "StereoscopicVideoConversion")
    protected StereoscopicVideoConversionType stereoscopicVideoConversion;

    /**
     * Gets the value of the colorTemperaturePreference property.
     * 
     * @return
     *     possible object is
     *     {@link ColorPreferenceType }
     *     
     */
    public ColorPreferenceType getColorTemperaturePreference() {
        return colorTemperaturePreference;
    }

    /**
     * Sets the value of the colorTemperaturePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorPreferenceType }
     *     
     */
    public void setColorTemperaturePreference(ColorPreferenceType value) {
        this.colorTemperaturePreference = value;
    }

    /**
     * Gets the value of the brightnessPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ColorPreferenceType }
     *     
     */
    public ColorPreferenceType getBrightnessPreference() {
        return brightnessPreference;
    }

    /**
     * Sets the value of the brightnessPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorPreferenceType }
     *     
     */
    public void setBrightnessPreference(ColorPreferenceType value) {
        this.brightnessPreference = value;
    }

    /**
     * Gets the value of the saturationPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ColorPreferenceType }
     *     
     */
    public ColorPreferenceType getSaturationPreference() {
        return saturationPreference;
    }

    /**
     * Sets the value of the saturationPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorPreferenceType }
     *     
     */
    public void setSaturationPreference(ColorPreferenceType value) {
        this.saturationPreference = value;
    }

    /**
     * Gets the value of the contrastPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ColorPreferenceType }
     *     
     */
    public ColorPreferenceType getContrastPreference() {
        return contrastPreference;
    }

    /**
     * Sets the value of the contrastPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorPreferenceType }
     *     
     */
    public void setContrastPreference(ColorPreferenceType value) {
        this.contrastPreference = value;
    }

    /**
     * Gets the value of the stereoscopicVideoConversion property.
     * 
     * @return
     *     possible object is
     *     {@link StereoscopicVideoConversionType }
     *     
     */
    public StereoscopicVideoConversionType getStereoscopicVideoConversion() {
        return stereoscopicVideoConversion;
    }

    /**
     * Sets the value of the stereoscopicVideoConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link StereoscopicVideoConversionType }
     *     
     */
    public void setStereoscopicVideoConversion(StereoscopicVideoConversionType value) {
        this.stereoscopicVideoConversion = value;
    }

}
