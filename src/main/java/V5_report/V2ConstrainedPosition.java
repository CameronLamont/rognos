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
 *       &lt;all>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_verticalPosition"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_horizontalPosition"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_positionAnchor"/>
 *       &lt;/all>
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
@XmlRootElement(name = "v2_constrainedPosition")
public class V2ConstrainedPosition {

    @XmlElement(name = "v2_verticalPosition", required = true)
    protected V2VerticalPosition v2VerticalPosition;
    @XmlElement(name = "v2_horizontalPosition", required = true)
    protected V2HorizontalPosition v2HorizontalPosition;
    @XmlElement(name = "v2_positionAnchor", required = true)
    protected V2PositionAnchor v2PositionAnchor;

    /**
     * Gets the value of the v2VerticalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link V2VerticalPosition }
     *     
     */
    public V2VerticalPosition getV2VerticalPosition() {
        return v2VerticalPosition;
    }

    /**
     * Sets the value of the v2VerticalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2VerticalPosition }
     *     
     */
    public void setV2VerticalPosition(V2VerticalPosition value) {
        this.v2VerticalPosition = value;
    }

    /**
     * Gets the value of the v2HorizontalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link V2HorizontalPosition }
     *     
     */
    public V2HorizontalPosition getV2HorizontalPosition() {
        return v2HorizontalPosition;
    }

    /**
     * Sets the value of the v2HorizontalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2HorizontalPosition }
     *     
     */
    public void setV2HorizontalPosition(V2HorizontalPosition value) {
        this.v2HorizontalPosition = value;
    }

    /**
     * Gets the value of the v2PositionAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link V2PositionAnchor }
     *     
     */
    public V2PositionAnchor getV2PositionAnchor() {
        return v2PositionAnchor;
    }

    /**
     * Sets the value of the v2PositionAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2PositionAnchor }
     *     
     */
    public void setV2PositionAnchor(V2PositionAnchor value) {
        this.v2PositionAnchor = value;
    }

}