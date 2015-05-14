//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package org.iso.mpeg.mpegv._2010.sepv;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mpeg.mpeg_v._2010._01_sepv_ns package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LightPrefTypeUnfavorableColor_QNAME = new QName("urn:mpeg:mpeg-v:2010:01-SEPV-NS", "UnfavorableColor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mpeg.mpeg_v._2010._01_sepv_ns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LightPrefType }
     * 
     */
    public LightPrefType createLightPrefType() {
        return new LightPrefType();
    }

    /**
     * Create an instance of {@link KinestheticPrefType }
     * 
     */
    public KinestheticPrefType createKinestheticPrefType() {
        return new KinestheticPrefType();
    }

    /**
     * Create an instance of {@link WavePreferenceType }
     * 
     */
    public WavePreferenceType createWavePreferenceType() {
        return new WavePreferenceType();
    }

    /**
     * Create an instance of {@link TactilePrefType }
     * 
     */
    public TactilePrefType createTactilePrefType() {
        return new TactilePrefType();
    }

    /**
     * Create an instance of {@link ShakePreferenceType }
     * 
     */
    public ShakePreferenceType createShakePreferenceType() {
        return new ShakePreferenceType();
    }

    /**
     * Create an instance of {@link MoveTowardPreferenceType }
     * 
     */
    public MoveTowardPreferenceType createMoveTowardPreferenceType() {
        return new MoveTowardPreferenceType();
    }

    /**
     * Create an instance of {@link CollidePreferenceType }
     * 
     */
    public CollidePreferenceType createCollidePreferenceType() {
        return new CollidePreferenceType();
    }

    /**
     * Create an instance of {@link SpinPreferenceType }
     * 
     */
    public SpinPreferenceType createSpinPreferenceType() {
        return new SpinPreferenceType();
    }

    /**
     * Create an instance of {@link SprayingPrefType }
     * 
     */
    public SprayingPrefType createSprayingPrefType() {
        return new SprayingPrefType();
    }

    /**
     * Create an instance of {@link FogPrefType }
     * 
     */
    public FogPrefType createFogPrefType() {
        return new FogPrefType();
    }

    /**
     * Create an instance of {@link RigidBodyMotionPrefType }
     * 
     */
    public RigidBodyMotionPrefType createRigidBodyMotionPrefType() {
        return new RigidBodyMotionPrefType();
    }

    /**
     * Create an instance of {@link TurnPreferenceType }
     * 
     */
    public TurnPreferenceType createTurnPreferenceType() {
        return new TurnPreferenceType();
    }

    /**
     * Create an instance of {@link WindPrefType }
     * 
     */
    public WindPrefType createWindPrefType() {
        return new WindPrefType();
    }

    /**
     * Create an instance of {@link VibrationPrefType }
     * 
     */
    public VibrationPrefType createVibrationPrefType() {
        return new VibrationPrefType();
    }

    /**
     * Create an instance of {@link HeatingPrefType }
     * 
     */
    public HeatingPrefType createHeatingPrefType() {
        return new HeatingPrefType();
    }

    /**
     * Create an instance of {@link ColorCorrectionPrefType }
     * 
     */
    public ColorCorrectionPrefType createColorCorrectionPrefType() {
        return new ColorCorrectionPrefType();
    }

    /**
     * Create an instance of {@link FlashPrefType }
     * 
     */
    public FlashPrefType createFlashPrefType() {
        return new FlashPrefType();
    }

    /**
     * Create an instance of {@link CoolingPrefType }
     * 
     */
    public CoolingPrefType createCoolingPrefType() {
        return new CoolingPrefType();
    }

    /**
     * Create an instance of {@link ScentPrefType }
     * 
     */
    public ScentPrefType createScentPrefType() {
        return new ScentPrefType();
    }

    /**
     * Create an instance of {@link InclinePreferenceType }
     * 
     */
    public InclinePreferenceType createInclinePreferenceType() {
        return new InclinePreferenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mpeg:mpeg-v:2010:01-SEPV-NS", name = "UnfavorableColor", scope = LightPrefType.class)
    public JAXBElement<List<String>> createLightPrefTypeUnfavorableColor(List<String> value) {
        return new JAXBElement<List<String>>(_LightPrefTypeUnfavorableColor_QNAME, ((Class) List.class), LightPrefType.class, ((List<String> ) value));
    }

}
