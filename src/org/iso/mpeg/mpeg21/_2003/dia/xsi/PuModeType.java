//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg21._2003.dia.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for puModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="puModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="self"/>
 *     &lt;enumeration value="ancestors"/>
 *     &lt;enumeration value="descendants"/>
 *     &lt;enumeration value="ancestorsDescendants"/>
 *     &lt;enumeration value="preceding"/>
 *     &lt;enumeration value="precedingSiblings"/>
 *     &lt;enumeration value="sequential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "puModeType", namespace = "urn:mpeg:mpeg21:2003:01-DIA-XSI-NS")
@XmlEnum
public enum PuModeType {

    @XmlEnumValue("self")
    SELF("self"),
    @XmlEnumValue("ancestors")
    ANCESTORS("ancestors"),
    @XmlEnumValue("descendants")
    DESCENDANTS("descendants"),
    @XmlEnumValue("ancestorsDescendants")
    ANCESTORS_DESCENDANTS("ancestorsDescendants"),
    @XmlEnumValue("preceding")
    PRECEDING("preceding"),
    @XmlEnumValue("precedingSiblings")
    PRECEDING_SIBLINGS("precedingSiblings"),
    @XmlEnumValue("sequential")
    SEQUENTIAL("sequential");
    private final String value;

    PuModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PuModeType fromValue(String v) {
        for (PuModeType c: PuModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}