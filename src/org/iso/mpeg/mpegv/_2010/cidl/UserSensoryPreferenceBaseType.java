//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package org.iso.mpeg.mpegv._2010.cidl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.iso.mpeg.mpeg21._2003.dia.UserCharacteristicBaseType;
import org.iso.mpeg.mpegv._2010.sepv.ColorCorrectionPrefType;
import org.iso.mpeg.mpegv._2010.sepv.CoolingPrefType;
import org.iso.mpeg.mpegv._2010.sepv.FogPrefType;
import org.iso.mpeg.mpegv._2010.sepv.HeatingPrefType;
import org.iso.mpeg.mpegv._2010.sepv.KinestheticPrefType;
import org.iso.mpeg.mpegv._2010.sepv.LightPrefType;
import org.iso.mpeg.mpegv._2010.sepv.RigidBodyMotionPrefType;
import org.iso.mpeg.mpegv._2010.sepv.ScentPrefType;
import org.iso.mpeg.mpegv._2010.sepv.SprayingPrefType;
import org.iso.mpeg.mpegv._2010.sepv.TactilePrefType;
import org.iso.mpeg.mpegv._2010.sepv.VibrationPrefType;
import org.iso.mpeg.mpegv._2010.sepv.WindPrefType;


/**
 * <p>Java class for UserSensoryPreferenceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSensoryPreferenceBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserCharacteristicBaseType">
 *       &lt;attGroup ref="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}userSensoryPrefBaseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSensoryPreferenceBaseType")
@XmlSeeAlso({
    KinestheticPrefType.class,
    TactilePrefType.class,
    SprayingPrefType.class,
    FogPrefType.class,
    RigidBodyMotionPrefType.class,
    WindPrefType.class,
    VibrationPrefType.class,
    HeatingPrefType.class,
    ColorCorrectionPrefType.class,
    LightPrefType.class,
    CoolingPrefType.class,
    ScentPrefType.class
})
public abstract class UserSensoryPreferenceBaseType
    extends UserCharacteristicBaseType
{

    @XmlAttribute(name = "adaptationMode")
    protected AdaptationModeType adaptationMode;
    @XmlAttribute(name = "activate")
    protected Boolean activate;

    /**
     * Gets the value of the adaptationMode property.
     * 
     * @return
     *     possible object is
     *     {@link AdaptationModeType }
     *     
     */
    public AdaptationModeType getAdaptationMode() {
        return adaptationMode;
    }

    /**
     * Sets the value of the adaptationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptationModeType }
     *     
     */
    public void setAdaptationMode(AdaptationModeType value) {
        this.adaptationMode = value;
    }

    /**
     * Gets the value of the activate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivate() {
        return activate;
    }

    /**
     * Sets the value of the activate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivate(Boolean value) {
        this.activate = value;
    }

}