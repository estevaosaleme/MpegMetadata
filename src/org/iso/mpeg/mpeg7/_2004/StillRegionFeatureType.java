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
 * <p>Java class for StillRegionFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StillRegionFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VisualDSType">
 *       &lt;sequence>
 *         &lt;element name="DominantColor" type="{urn:mpeg:mpeg7:schema:2004}DominantColorType" minOccurs="0"/>
 *         &lt;element name="ScalableColor" type="{urn:mpeg:mpeg7:schema:2004}ScalableColorType" minOccurs="0"/>
 *         &lt;element name="ColorStructure" type="{urn:mpeg:mpeg7:schema:2004}ColorStructureType" minOccurs="0"/>
 *         &lt;element name="ColorLayout" type="{urn:mpeg:mpeg7:schema:2004}ColorLayoutType" minOccurs="0"/>
 *         &lt;element name="ColorTemperature" type="{urn:mpeg:mpeg7:schema:2004}ColorTemperatureType" minOccurs="0"/>
 *         &lt;element name="IlluminationCompensatedColor" type="{urn:mpeg:mpeg7:schema:2004}IlluminationInvariantColorType" minOccurs="0"/>
 *         &lt;element name="Edge" type="{urn:mpeg:mpeg7:schema:2004}EdgeHistogramType" minOccurs="0"/>
 *         &lt;element name="HomogeneousPattern" type="{urn:mpeg:mpeg7:schema:2004}HomogeneousTextureType" minOccurs="0"/>
 *         &lt;element name="TextureBrowsing" type="{urn:mpeg:mpeg7:schema:2004}TextureBrowsingType" minOccurs="0"/>
 *         &lt;element name="ShapeMask" type="{urn:mpeg:mpeg7:schema:2004}RegionShapeType" minOccurs="0"/>
 *         &lt;element name="Contour" type="{urn:mpeg:mpeg7:schema:2004}ContourShapeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StillRegionFeatureType", propOrder = {
    "dominantColor",
    "scalableColor",
    "colorStructure",
    "colorLayout",
    "colorTemperature",
    "illuminationCompensatedColor",
    "edge",
    "homogeneousPattern",
    "textureBrowsing",
    "shapeMask",
    "contour"
})
public class StillRegionFeatureType
    extends VisualDSType
{

    @XmlElement(name = "DominantColor")
    protected DominantColorType dominantColor;
    @XmlElement(name = "ScalableColor")
    protected ScalableColorType scalableColor;
    @XmlElement(name = "ColorStructure")
    protected ColorStructureType colorStructure;
    @XmlElement(name = "ColorLayout")
    protected ColorLayoutType colorLayout;
    @XmlElement(name = "ColorTemperature")
    protected ColorTemperatureType colorTemperature;
    @XmlElement(name = "IlluminationCompensatedColor")
    protected IlluminationInvariantColorType illuminationCompensatedColor;
    @XmlElement(name = "Edge")
    protected EdgeHistogramType edge;
    @XmlElement(name = "HomogeneousPattern")
    protected HomogeneousTextureType homogeneousPattern;
    @XmlElement(name = "TextureBrowsing")
    protected TextureBrowsingType textureBrowsing;
    @XmlElement(name = "ShapeMask")
    protected RegionShapeType shapeMask;
    @XmlElement(name = "Contour")
    protected ContourShapeType contour;

    /**
     * Gets the value of the dominantColor property.
     * 
     * @return
     *     possible object is
     *     {@link DominantColorType }
     *     
     */
    public DominantColorType getDominantColor() {
        return dominantColor;
    }

    /**
     * Sets the value of the dominantColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DominantColorType }
     *     
     */
    public void setDominantColor(DominantColorType value) {
        this.dominantColor = value;
    }

    /**
     * Gets the value of the scalableColor property.
     * 
     * @return
     *     possible object is
     *     {@link ScalableColorType }
     *     
     */
    public ScalableColorType getScalableColor() {
        return scalableColor;
    }

    /**
     * Sets the value of the scalableColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalableColorType }
     *     
     */
    public void setScalableColor(ScalableColorType value) {
        this.scalableColor = value;
    }

    /**
     * Gets the value of the colorStructure property.
     * 
     * @return
     *     possible object is
     *     {@link ColorStructureType }
     *     
     */
    public ColorStructureType getColorStructure() {
        return colorStructure;
    }

    /**
     * Sets the value of the colorStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorStructureType }
     *     
     */
    public void setColorStructure(ColorStructureType value) {
        this.colorStructure = value;
    }

    /**
     * Gets the value of the colorLayout property.
     * 
     * @return
     *     possible object is
     *     {@link ColorLayoutType }
     *     
     */
    public ColorLayoutType getColorLayout() {
        return colorLayout;
    }

    /**
     * Sets the value of the colorLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorLayoutType }
     *     
     */
    public void setColorLayout(ColorLayoutType value) {
        this.colorLayout = value;
    }

    /**
     * Gets the value of the colorTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link ColorTemperatureType }
     *     
     */
    public ColorTemperatureType getColorTemperature() {
        return colorTemperature;
    }

    /**
     * Sets the value of the colorTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorTemperatureType }
     *     
     */
    public void setColorTemperature(ColorTemperatureType value) {
        this.colorTemperature = value;
    }

    /**
     * Gets the value of the illuminationCompensatedColor property.
     * 
     * @return
     *     possible object is
     *     {@link IlluminationInvariantColorType }
     *     
     */
    public IlluminationInvariantColorType getIlluminationCompensatedColor() {
        return illuminationCompensatedColor;
    }

    /**
     * Sets the value of the illuminationCompensatedColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link IlluminationInvariantColorType }
     *     
     */
    public void setIlluminationCompensatedColor(IlluminationInvariantColorType value) {
        this.illuminationCompensatedColor = value;
    }

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link EdgeHistogramType }
     *     
     */
    public EdgeHistogramType getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgeHistogramType }
     *     
     */
    public void setEdge(EdgeHistogramType value) {
        this.edge = value;
    }

    /**
     * Gets the value of the homogeneousPattern property.
     * 
     * @return
     *     possible object is
     *     {@link HomogeneousTextureType }
     *     
     */
    public HomogeneousTextureType getHomogeneousPattern() {
        return homogeneousPattern;
    }

    /**
     * Sets the value of the homogeneousPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomogeneousTextureType }
     *     
     */
    public void setHomogeneousPattern(HomogeneousTextureType value) {
        this.homogeneousPattern = value;
    }

    /**
     * Gets the value of the textureBrowsing property.
     * 
     * @return
     *     possible object is
     *     {@link TextureBrowsingType }
     *     
     */
    public TextureBrowsingType getTextureBrowsing() {
        return textureBrowsing;
    }

    /**
     * Sets the value of the textureBrowsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureBrowsingType }
     *     
     */
    public void setTextureBrowsing(TextureBrowsingType value) {
        this.textureBrowsing = value;
    }

    /**
     * Gets the value of the shapeMask property.
     * 
     * @return
     *     possible object is
     *     {@link RegionShapeType }
     *     
     */
    public RegionShapeType getShapeMask() {
        return shapeMask;
    }

    /**
     * Sets the value of the shapeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionShapeType }
     *     
     */
    public void setShapeMask(RegionShapeType value) {
        this.shapeMask = value;
    }

    /**
     * Gets the value of the contour property.
     * 
     * @return
     *     possible object is
     *     {@link ContourShapeType }
     *     
     */
    public ContourShapeType getContour() {
        return contour;
    }

    /**
     * Sets the value of the contour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContourShapeType }
     *     
     */
    public void setContour(ContourShapeType value) {
        this.contour = value;
    }

}
