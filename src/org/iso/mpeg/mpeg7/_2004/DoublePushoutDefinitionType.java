//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package org.iso.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoublePushoutDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoublePushoutDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}GraphicalRuleDefinitionType">
 *       &lt;sequence>
 *         &lt;element name="LHSGraph" type="{urn:mpeg:mpeg7:schema:2004}GraphType"/>
 *         &lt;element name="ContextGraph" type="{urn:mpeg:mpeg7:schema:2004}GraphType"/>
 *         &lt;element name="RHSGraph" type="{urn:mpeg:mpeg7:schema:2004}GraphType"/>
 *         &lt;element name="MorphismGraph" type="{urn:mpeg:mpeg7:schema:2004}MorphismGraphType" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoublePushoutDefinitionType", propOrder = {
    "lhsGraph",
    "contextGraph",
    "rhsGraph",
    "morphismGraph"
})
public class DoublePushoutDefinitionType
    extends GraphicalRuleDefinitionType
{

    @XmlElement(name = "LHSGraph", required = true)
    protected GraphType lhsGraph;
    @XmlElement(name = "ContextGraph", required = true)
    protected GraphType contextGraph;
    @XmlElement(name = "RHSGraph", required = true)
    protected GraphType rhsGraph;
    @XmlElement(name = "MorphismGraph", required = true)
    protected List<MorphismGraphType> morphismGraph;

    /**
     * Gets the value of the lhsGraph property.
     * 
     * @return
     *     possible object is
     *     {@link GraphType }
     *     
     */
    public GraphType getLHSGraph() {
        return lhsGraph;
    }

    /**
     * Sets the value of the lhsGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphType }
     *     
     */
    public void setLHSGraph(GraphType value) {
        this.lhsGraph = value;
    }

    /**
     * Gets the value of the contextGraph property.
     * 
     * @return
     *     possible object is
     *     {@link GraphType }
     *     
     */
    public GraphType getContextGraph() {
        return contextGraph;
    }

    /**
     * Sets the value of the contextGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphType }
     *     
     */
    public void setContextGraph(GraphType value) {
        this.contextGraph = value;
    }

    /**
     * Gets the value of the rhsGraph property.
     * 
     * @return
     *     possible object is
     *     {@link GraphType }
     *     
     */
    public GraphType getRHSGraph() {
        return rhsGraph;
    }

    /**
     * Sets the value of the rhsGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphType }
     *     
     */
    public void setRHSGraph(GraphType value) {
        this.rhsGraph = value;
    }

    /**
     * Gets the value of the morphismGraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the morphismGraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMorphismGraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MorphismGraphType }
     * 
     * 
     */
    public List<MorphismGraphType> getMorphismGraph() {
        if (morphismGraph == null) {
            morphismGraph = new ArrayList<MorphismGraphType>();
        }
        return this.morphismGraph;
    }

}
