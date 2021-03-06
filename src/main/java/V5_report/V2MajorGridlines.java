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
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}LineStyleAndColorAttributes2"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "v2_majorGridlines")
public class V2MajorGridlines {

    @XmlAttribute(name = "lineColor")
    protected String lineColor;
    @XmlAttribute(name = "lineStyle")
    protected LineStyleType2 lineStyle;
    @XmlAttribute(name = "lineWeight")
    protected String lineWeight;

    /**
     * Gets the value of the lineColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineColor() {
        if (lineColor == null) {
            return "black";
        } else {
            return lineColor;
        }
    }

    /**
     * Sets the value of the lineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineColor(String value) {
        this.lineColor = value;
    }

    /**
     * Gets the value of the lineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyleType2 }
     *     
     */
    public LineStyleType2 getLineStyle() {
        if (lineStyle == null) {
            return LineStyleType2 .SOLID;
        } else {
            return lineStyle;
        }
    }

    /**
     * Sets the value of the lineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyleType2 }
     *     
     */
    public void setLineStyle(LineStyleType2 value) {
        this.lineStyle = value;
    }

    /**
     * Gets the value of the lineWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineWeight() {
        if (lineWeight == null) {
            return "1px";
        } else {
            return lineWeight;
        }
    }

    /**
     * Sets the value of the lineWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineWeight(String value) {
        this.lineWeight = value;
    }

}
