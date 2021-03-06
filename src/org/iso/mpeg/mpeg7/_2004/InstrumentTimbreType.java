//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentTimbreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTimbreType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AudioDSType">
 *       &lt;sequence>
 *         &lt;element name="LogAttackTime" type="{urn:mpeg:mpeg7:schema:2004}LogAttackTimeType" minOccurs="0"/>
 *         &lt;element name="HarmonicSpectralCentroid" type="{urn:mpeg:mpeg7:schema:2004}HarmonicSpectralCentroidType" minOccurs="0"/>
 *         &lt;element name="HarmonicSpectralDeviation" type="{urn:mpeg:mpeg7:schema:2004}HarmonicSpectralDeviationType" minOccurs="0"/>
 *         &lt;element name="HarmonicSpectralSpread" type="{urn:mpeg:mpeg7:schema:2004}HarmonicSpectralSpreadType" minOccurs="0"/>
 *         &lt;element name="HarmonicSpectralVariation" type="{urn:mpeg:mpeg7:schema:2004}HarmonicSpectralVariationType" minOccurs="0"/>
 *         &lt;element name="SpectralCentroid" type="{urn:mpeg:mpeg7:schema:2004}SpectralCentroidType" minOccurs="0"/>
 *         &lt;element name="TemporalCentroid" type="{urn:mpeg:mpeg7:schema:2004}TemporalCentroidType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTimbreType", propOrder = {
    "logAttackTime",
    "harmonicSpectralCentroid",
    "harmonicSpectralDeviation",
    "harmonicSpectralSpread",
    "harmonicSpectralVariation",
    "spectralCentroid",
    "temporalCentroid"
})
public class InstrumentTimbreType
    extends AudioDSType
{

    @XmlElement(name = "LogAttackTime")
    protected LogAttackTimeType logAttackTime;
    @XmlElement(name = "HarmonicSpectralCentroid")
    protected HarmonicSpectralCentroidType harmonicSpectralCentroid;
    @XmlElement(name = "HarmonicSpectralDeviation")
    protected HarmonicSpectralDeviationType harmonicSpectralDeviation;
    @XmlElement(name = "HarmonicSpectralSpread")
    protected HarmonicSpectralSpreadType harmonicSpectralSpread;
    @XmlElement(name = "HarmonicSpectralVariation")
    protected HarmonicSpectralVariationType harmonicSpectralVariation;
    @XmlElement(name = "SpectralCentroid")
    protected SpectralCentroidType spectralCentroid;
    @XmlElement(name = "TemporalCentroid")
    protected TemporalCentroidType temporalCentroid;

    /**
     * Gets the value of the logAttackTime property.
     * 
     * @return
     *     possible object is
     *     {@link LogAttackTimeType }
     *     
     */
    public LogAttackTimeType getLogAttackTime() {
        return logAttackTime;
    }

    /**
     * Sets the value of the logAttackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogAttackTimeType }
     *     
     */
    public void setLogAttackTime(LogAttackTimeType value) {
        this.logAttackTime = value;
    }

    /**
     * Gets the value of the harmonicSpectralCentroid property.
     * 
     * @return
     *     possible object is
     *     {@link HarmonicSpectralCentroidType }
     *     
     */
    public HarmonicSpectralCentroidType getHarmonicSpectralCentroid() {
        return harmonicSpectralCentroid;
    }

    /**
     * Sets the value of the harmonicSpectralCentroid property.
     * 
     * @param value
     *     allowed object is
     *     {@link HarmonicSpectralCentroidType }
     *     
     */
    public void setHarmonicSpectralCentroid(HarmonicSpectralCentroidType value) {
        this.harmonicSpectralCentroid = value;
    }

    /**
     * Gets the value of the harmonicSpectralDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link HarmonicSpectralDeviationType }
     *     
     */
    public HarmonicSpectralDeviationType getHarmonicSpectralDeviation() {
        return harmonicSpectralDeviation;
    }

    /**
     * Sets the value of the harmonicSpectralDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HarmonicSpectralDeviationType }
     *     
     */
    public void setHarmonicSpectralDeviation(HarmonicSpectralDeviationType value) {
        this.harmonicSpectralDeviation = value;
    }

    /**
     * Gets the value of the harmonicSpectralSpread property.
     * 
     * @return
     *     possible object is
     *     {@link HarmonicSpectralSpreadType }
     *     
     */
    public HarmonicSpectralSpreadType getHarmonicSpectralSpread() {
        return harmonicSpectralSpread;
    }

    /**
     * Sets the value of the harmonicSpectralSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link HarmonicSpectralSpreadType }
     *     
     */
    public void setHarmonicSpectralSpread(HarmonicSpectralSpreadType value) {
        this.harmonicSpectralSpread = value;
    }

    /**
     * Gets the value of the harmonicSpectralVariation property.
     * 
     * @return
     *     possible object is
     *     {@link HarmonicSpectralVariationType }
     *     
     */
    public HarmonicSpectralVariationType getHarmonicSpectralVariation() {
        return harmonicSpectralVariation;
    }

    /**
     * Sets the value of the harmonicSpectralVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HarmonicSpectralVariationType }
     *     
     */
    public void setHarmonicSpectralVariation(HarmonicSpectralVariationType value) {
        this.harmonicSpectralVariation = value;
    }

    /**
     * Gets the value of the spectralCentroid property.
     * 
     * @return
     *     possible object is
     *     {@link SpectralCentroidType }
     *     
     */
    public SpectralCentroidType getSpectralCentroid() {
        return spectralCentroid;
    }

    /**
     * Sets the value of the spectralCentroid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpectralCentroidType }
     *     
     */
    public void setSpectralCentroid(SpectralCentroidType value) {
        this.spectralCentroid = value;
    }

    /**
     * Gets the value of the temporalCentroid property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCentroidType }
     *     
     */
    public TemporalCentroidType getTemporalCentroid() {
        return temporalCentroid;
    }

    /**
     * Sets the value of the temporalCentroid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCentroidType }
     *     
     */
    public void setTemporalCentroid(TemporalCentroidType value) {
        this.temporalCentroid = value;
    }

}
