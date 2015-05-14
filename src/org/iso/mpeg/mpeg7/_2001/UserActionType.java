//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package org.iso.mpeg.mpeg7._2001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}DSType">
 *       &lt;sequence>
 *         &lt;element name="ActionTime" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MediaTime" type="{urn:mpeg:mpeg7:schema:2001}MediaTimeType" minOccurs="0"/>
 *                   &lt;element name="GeneralTime" type="{urn:mpeg:mpeg7:schema:2001}TimeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProgramIdentifier" type="{urn:mpeg:mpeg7:schema:2001}UniqueIDType"/>
 *         &lt;element name="ActionDataItem" type="{urn:mpeg:mpeg7:schema:2001}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserActionType", propOrder = {
    "actionTime",
    "programIdentifier",
    "actionDataItem"
})
public class UserActionType
    extends DSType
{

    @XmlElement(name = "ActionTime")
    protected UserActionType.ActionTime actionTime;
    @XmlElement(name = "ProgramIdentifier", required = true)
    protected UniqueIDType programIdentifier;
    @XmlElement(name = "ActionDataItem")
    protected List<ReferenceType> actionDataItem;

    /**
     * Gets the value of the actionTime property.
     * 
     * @return
     *     possible object is
     *     {@link UserActionType.ActionTime }
     *     
     */
    public UserActionType.ActionTime getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserActionType.ActionTime }
     *     
     */
    public void setActionTime(UserActionType.ActionTime value) {
        this.actionTime = value;
    }

    /**
     * Gets the value of the programIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getProgramIdentifier() {
        return programIdentifier;
    }

    /**
     * Sets the value of the programIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setProgramIdentifier(UniqueIDType value) {
        this.programIdentifier = value;
    }

    /**
     * Gets the value of the actionDataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionDataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionDataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getActionDataItem() {
        if (actionDataItem == null) {
            actionDataItem = new ArrayList<ReferenceType>();
        }
        return this.actionDataItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MediaTime" type="{urn:mpeg:mpeg7:schema:2001}MediaTimeType" minOccurs="0"/>
     *         &lt;element name="GeneralTime" type="{urn:mpeg:mpeg7:schema:2001}TimeType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mediaTime",
        "generalTime"
    })
    public static class ActionTime {

        @XmlElement(name = "MediaTime")
        protected MediaTimeType mediaTime;
        @XmlElement(name = "GeneralTime")
        protected TimeType generalTime;

        /**
         * Gets the value of the mediaTime property.
         * 
         * @return
         *     possible object is
         *     {@link MediaTimeType }
         *     
         */
        public MediaTimeType getMediaTime() {
            return mediaTime;
        }

        /**
         * Sets the value of the mediaTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaTimeType }
         *     
         */
        public void setMediaTime(MediaTimeType value) {
            this.mediaTime = value;
        }

        /**
         * Gets the value of the generalTime property.
         * 
         * @return
         *     possible object is
         *     {@link TimeType }
         *     
         */
        public TimeType getGeneralTime() {
            return generalTime;
        }

        /**
         * Sets the value of the generalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeType }
         *     
         */
        public void setGeneralTime(TimeType value) {
            this.generalTime = value;
        }

    }

}
