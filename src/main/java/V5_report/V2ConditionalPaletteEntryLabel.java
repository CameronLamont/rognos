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
 *       &lt;choice>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_automaticLabel"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_specifiedLabel"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "v2AutomaticLabel",
    "v2SpecifiedLabel"
})
@XmlRootElement(name = "v2_conditionalPaletteEntryLabel")
public class V2ConditionalPaletteEntryLabel {

    @XmlElement(name = "v2_automaticLabel")
    protected V2AutomaticLabel v2AutomaticLabel;
    @XmlElement(name = "v2_specifiedLabel")
    protected LocalizedTextType v2SpecifiedLabel;

    /**
     * Gets the value of the v2AutomaticLabel property.
     * 
     * @return
     *     possible object is
     *     {@link V2AutomaticLabel }
     *     
     */
    public V2AutomaticLabel getV2AutomaticLabel() {
        return v2AutomaticLabel;
    }

    /**
     * Sets the value of the v2AutomaticLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2AutomaticLabel }
     *     
     */
    public void setV2AutomaticLabel(V2AutomaticLabel value) {
        this.v2AutomaticLabel = value;
    }

    /**
     * Gets the value of the v2SpecifiedLabel property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedTextType }
     *     
     */
    public LocalizedTextType getV2SpecifiedLabel() {
        return v2SpecifiedLabel;
    }

    /**
     * Sets the value of the v2SpecifiedLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedTextType }
     *     
     */
    public void setV2SpecifiedLabel(LocalizedTextType value) {
        this.v2SpecifiedLabel = value;
    }

}
