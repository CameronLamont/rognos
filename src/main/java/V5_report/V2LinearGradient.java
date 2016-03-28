//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_gradientColor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="gradientAngle" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="360"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "v2GradientColor"
})
@XmlRootElement(name = "v2_linearGradient")
public class V2LinearGradient {

    @XmlElement(name = "v2_gradientColor", required = true)
    protected List<V2GradientColor> v2GradientColor;
    @XmlAttribute(name = "gradientAngle")
    protected BigDecimal gradientAngle;

    /**
     * Gets the value of the v2GradientColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v2GradientColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV2GradientColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link V2GradientColor }
     * 
     * 
     */
    public List<V2GradientColor> getV2GradientColor() {
        if (v2GradientColor == null) {
            v2GradientColor = new ArrayList<V2GradientColor>();
        }
        return this.v2GradientColor;
    }

    /**
     * Gets the value of the gradientAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGradientAngle() {
        if (gradientAngle == null) {
            return new BigDecimal("0");
        } else {
            return gradientAngle;
        }
    }

    /**
     * Sets the value of the gradientAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGradientAngle(BigDecimal value) {
        this.gradientAngle = value;
    }

}
