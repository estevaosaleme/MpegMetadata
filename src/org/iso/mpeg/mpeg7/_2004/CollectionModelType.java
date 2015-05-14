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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AnalyticModelType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Collection" type="{urn:mpeg:mpeg7:schema:2004}CollectionType"/>
 *         &lt;element name="CollectionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionModelType", propOrder = {
    "collectionOrCollectionRef"
})
public class CollectionModelType
    extends AnalyticModelType
{

    @XmlElements({
        @XmlElement(name = "Collection", type = CollectionType.class),
        @XmlElement(name = "CollectionRef", type = ReferenceType.class)
    })
    protected List<Object> collectionOrCollectionRef;

    /**
     * Gets the value of the collectionOrCollectionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionOrCollectionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionOrCollectionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionType }
     * {@link ReferenceType }
     * 
     * 
     */
    public List<Object> getCollectionOrCollectionRef() {
        if (collectionOrCollectionRef == null) {
            collectionOrCollectionRef = new ArrayList<Object>();
        }
        return this.collectionOrCollectionRef;
    }

}
