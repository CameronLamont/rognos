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
 *       &lt;attribute name="showHover" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="showPointer" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="clickable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "appDataRepeaterTableProperties")
public class AppDataRepeaterTableProperties {

    @XmlAttribute(name = "showHover")
    protected Boolean showHover;
    @XmlAttribute(name = "showPointer")
    protected Boolean showPointer;
    @XmlAttribute(name = "clickable")
    protected Boolean clickable;

    /**
     * Gets the value of the showHover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowHover() {
        if (showHover == null) {
            return true;
        } else {
            return showHover;
        }
    }

    /**
     * Sets the value of the showHover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHover(Boolean value) {
        this.showHover = value;
    }

    /**
     * Gets the value of the showPointer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowPointer() {
        if (showPointer == null) {
            return false;
        } else {
            return showPointer;
        }
    }

    /**
     * Sets the value of the showPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPointer(Boolean value) {
        this.showPointer = value;
    }

    /**
     * Gets the value of the clickable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClickable() {
        if (clickable == null) {
            return false;
        } else {
            return clickable;
        }
    }

    /**
     * Sets the value of the clickable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClickable(Boolean value) {
        this.clickable = value;
    }

}
