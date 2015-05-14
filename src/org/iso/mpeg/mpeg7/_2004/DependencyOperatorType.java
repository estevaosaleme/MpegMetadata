//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dependencyOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dependencyOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="subject"/>
 *     &lt;enumeration value="object"/>
 *     &lt;enumeration value="indirectObject"/>
 *     &lt;enumeration value="predicate"/>
 *     &lt;enumeration value="expletive"/>
 *     &lt;enumeration value="nonRestrictive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dependencyOperatorType")
@XmlEnum
public enum DependencyOperatorType {

    @XmlEnumValue("subject")
    SUBJECT("subject"),
    @XmlEnumValue("object")
    OBJECT("object"),
    @XmlEnumValue("indirectObject")
    INDIRECT_OBJECT("indirectObject"),
    @XmlEnumValue("predicate")
    PREDICATE("predicate"),
    @XmlEnumValue("expletive")
    EXPLETIVE("expletive"),
    @XmlEnumValue("nonRestrictive")
    NON_RESTRICTIVE("nonRestrictive");
    private final String value;

    DependencyOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DependencyOperatorType fromValue(String v) {
        for (DependencyOperatorType c: DependencyOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
