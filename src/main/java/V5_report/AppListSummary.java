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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appTextStyle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="summaryMethod" default="total">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="total"/>
 *             &lt;enumeration value="minimum"/>
 *             &lt;enumeration value="maximum"/>
 *             &lt;enumeration value="average"/>
 *             &lt;enumeration value="count"/>
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

})
@XmlRootElement(name = "appListSummary")
public class AppListSummary {

    protected Style style;
    protected AppTextStyle appTextStyle;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "refDataItem", required = true)
    protected String refDataItem;
    @XmlAttribute(name = "summaryMethod")
    protected String summaryMethod;

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
     * Gets the value of the appTextStyle property.
     * 
     * @return
     *     possible object is
     *     {@link AppTextStyle }
     *     
     */
    public AppTextStyle getAppTextStyle() {
        return appTextStyle;
    }

    /**
     * Sets the value of the appTextStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppTextStyle }
     *     
     */
    public void setAppTextStyle(AppTextStyle value) {
        this.appTextStyle = value;
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
     * Gets the value of the summaryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryMethod() {
        if (summaryMethod == null) {
            return "total";
        } else {
            return summaryMethod;
        }
    }

    /**
     * Sets the value of the summaryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryMethod(String value) {
        this.summaryMethod = value;
    }

}
