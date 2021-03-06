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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TransparencyAttributes"/>
 *       &lt;attribute name="blurPreset" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="minimumBlur"/>
 *             &lt;enumeration value="littleBlur"/>
 *             &lt;enumeration value="averageBlur"/>
 *             &lt;enumeration value="muchBlur"/>
 *             &lt;enumeration value="maximumBlur"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="color" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="gray" />
 *       &lt;attribute name="shadowOffset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSLength" default="5px" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "v2_dropShadow")
public class V2DropShadow {

    @XmlAttribute(name = "blurPreset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String blurPreset;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "shadowOffset")
    protected String shadowOffset;
    @XmlAttribute(name = "transparency")
    protected Long transparency;

    /**
     * Gets the value of the blurPreset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlurPreset() {
        if (blurPreset == null) {
            return "none";
        } else {
            return blurPreset;
        }
    }

    /**
     * Sets the value of the blurPreset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlurPreset(String value) {
        this.blurPreset = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        if (color == null) {
            return "gray";
        } else {
            return color;
        }
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the shadowOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowOffset() {
        if (shadowOffset == null) {
            return "5px";
        } else {
            return shadowOffset;
        }
    }

    /**
     * Sets the value of the shadowOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowOffset(String value) {
        this.shadowOffset = value;
    }

    /**
     * Gets the value of the transparency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getTransparency() {
        if (transparency == null) {
            return  0L;
        } else {
            return transparency;
        }
    }

    /**
     * Sets the value of the transparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransparency(Long value) {
        this.transparency = value;
    }

}
