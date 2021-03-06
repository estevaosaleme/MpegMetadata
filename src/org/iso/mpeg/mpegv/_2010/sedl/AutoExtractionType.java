//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpegv._2010.sedl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autoExtractionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="autoExtractionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="audio"/>
 *     &lt;enumeration value="visual"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "autoExtractionType")
@XmlEnum
public enum AutoExtractionType {

    @XmlEnumValue("audio")
    AUDIO("audio"),
    @XmlEnumValue("visual")
    VISUAL("visual"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    AutoExtractionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoExtractionType fromValue(String v) {
        for (AutoExtractionType c: AutoExtractionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
