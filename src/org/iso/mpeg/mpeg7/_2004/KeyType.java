//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for KeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AudioDSType">
 *       &lt;sequence>
 *         &lt;element name="KeyNote">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>degreeNoteType">
 *                 &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="accidental" type="{urn:mpeg:mpeg7:schema:2004}degreeAccidentalType" default="natural" />
 *       &lt;attribute name="mode" type="{urn:mpeg:mpeg7:schema:2004}termReferenceType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyType", propOrder = {
    "keyNote"
})
public class KeyType
    extends AudioDSType
{

    @XmlElement(name = "KeyNote", required = true)
    protected KeyType.KeyNote keyNote;
    @XmlAttribute(name = "accidental")
    protected DegreeAccidentalType accidental;
    @XmlAttribute(name = "mode")
    protected String mode;

    /**
     * Gets the value of the keyNote property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType.KeyNote }
     *     
     */
    public KeyType.KeyNote getKeyNote() {
        return keyNote;
    }

    /**
     * Sets the value of the keyNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType.KeyNote }
     *     
     */
    public void setKeyNote(KeyType.KeyNote value) {
        this.keyNote = value;
    }

    /**
     * Gets the value of the accidental property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeAccidentalType }
     *     
     */
    public DegreeAccidentalType getAccidental() {
        if (accidental == null) {
            return DegreeAccidentalType.NATURAL;
        } else {
            return accidental;
        }
    }

    /**
     * Sets the value of the accidental property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeAccidentalType }
     *     
     */
    public void setAccidental(DegreeAccidentalType value) {
        this.accidental = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>degreeNoteType">
     *       &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class KeyNote {

        @XmlValue
        protected DegreeNoteType value;
        @XmlAttribute(name = "display")
        protected String display;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link DegreeNoteType }
         *     
         */
        public DegreeNoteType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link DegreeNoteType }
         *     
         */
        public void setValue(DegreeNoteType value) {
            this.value = value;
        }

        /**
         * Gets the value of the display property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplay() {
            return display;
        }

        /**
         * Sets the value of the display property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplay(String value) {
            this.display = value;
        }

    }

}
