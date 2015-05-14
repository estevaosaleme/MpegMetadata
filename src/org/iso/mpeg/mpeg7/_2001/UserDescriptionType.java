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
 * <p>Java class for UserDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}ContentManagementType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{urn:mpeg:mpeg7:schema:2001}AgentType" minOccurs="0"/>
 *         &lt;element name="UserPreferences" type="{urn:mpeg:mpeg7:schema:2001}UserPreferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsageHistory" type="{urn:mpeg:mpeg7:schema:2001}UsageHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDescriptionType", propOrder = {
    "user",
    "userPreferences",
    "usageHistory"
})
public class UserDescriptionType
    extends ContentManagementType
{

    @XmlElement(name = "User")
    protected AgentType user;
    @XmlElement(name = "UserPreferences")
    protected List<UserPreferencesType> userPreferences;
    @XmlElement(name = "UsageHistory")
    protected List<UsageHistoryType> usageHistory;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link AgentType }
     *     
     */
    public AgentType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType }
     *     
     */
    public void setUser(AgentType value) {
        this.user = value;
    }

    /**
     * Gets the value of the userPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPreferencesType }
     * 
     * 
     */
    public List<UserPreferencesType> getUserPreferences() {
        if (userPreferences == null) {
            userPreferences = new ArrayList<UserPreferencesType>();
        }
        return this.userPreferences;
    }

    /**
     * Gets the value of the usageHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageHistoryType }
     * 
     * 
     */
    public List<UsageHistoryType> getUsageHistory() {
        if (usageHistory == null) {
            usageHistory = new ArrayList<UsageHistoryType>();
        }
        return this.usageHistory;
    }

}
