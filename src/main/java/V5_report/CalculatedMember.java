//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}calculatedMembers" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "calculatedMember")
public class CalculatedMember {

    protected CalculatedMembers calculatedMembers;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "refDataItem", required = true)
    protected String refDataItem;
    @XmlAttribute(name = "caption")
    protected String caption;

    /**
     * Gets the value of the calculatedMembers property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedMembers }
     *     
     */
    public CalculatedMembers getCalculatedMembers() {
        return calculatedMembers;
    }

    /**
     * Sets the value of the calculatedMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedMembers }
     *     
     */
    public void setCalculatedMembers(CalculatedMembers value) {
        this.calculatedMembers = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the refDataItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDataItem() {
        return refDataItem;
    }

    /**
     * Sets the value of the refDataItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDataItem(String value) {
        this.refDataItem = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

}
