//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericLayoutStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericLayoutStyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyles" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericLayoutStyleType", propOrder = {

})
public class GenericLayoutStyleType {

    protected Style style;
    protected ConditionalStyles conditionalStyles;
    protected ConditionalStyleRefs conditionalStyleRefs;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link Style }
     *     
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link Style }
     *     
     */
    public void setStyle(Style value) {
        this.style = value;
    }

    /**
     * Gets the value of the conditionalStyles property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyles }
     *     
     */
    public ConditionalStyles getConditionalStyles() {
        return conditionalStyles;
    }

    /**
     * Sets the value of the conditionalStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyles }
     *     
     */
    public void setConditionalStyles(ConditionalStyles value) {
        this.conditionalStyles = value;
    }

    /**
     * Gets the value of the conditionalStyleRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyleRefs }
     *     
     */
    public ConditionalStyleRefs getConditionalStyleRefs() {
        return conditionalStyleRefs;
    }

    /**
     * Sets the value of the conditionalStyleRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyleRefs }
     *     
     */
    public void setConditionalStyleRefs(ConditionalStyleRefs value) {
        this.conditionalStyleRefs = value;
    }

    /**
     * Gets the value of the xmlAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link XMLAttributes }
     *     
     */
    public XMLAttributes getXMLAttributes() {
        return xmlAttributes;
    }

    /**
     * Sets the value of the xmlAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAttributes }
     *     
     */
    public void setXMLAttributes(XMLAttributes value) {
        this.xmlAttributes = value;
    }

}
