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
 *         &lt;element name="appNoValueListItemLabel" type="{http://developer.cognos.com/schemas/report/11.0/}LocalizedTextType"/>
 *       &lt;/all>
 *       &lt;attribute name="lastItemInList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlRootElement(name = "appNoValueListItem")
public class AppNoValueListItem {

    @XmlElement(required = true)
    protected LocalizedTextType appNoValueListItemLabel;
    @XmlAttribute(name = "lastItemInList")
    protected Boolean lastItemInList;

    /**
     * Gets the value of the appNoValueListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedTextType }
     *     
     */
    public LocalizedTextType getAppNoValueListItemLabel() {
        return appNoValueListItemLabel;
    }

    /**
     * Sets the value of the appNoValueListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedTextType }
     *     
     */
    public void setAppNoValueListItemLabel(LocalizedTextType value) {
        this.appNoValueListItemLabel = value;
    }

    /**
     * Gets the value of the lastItemInList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLastItemInList() {
        if (lastItemInList == null) {
            return false;
        } else {
            return lastItemInList;
        }
    }

    /**
     * Sets the value of the lastItemInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastItemInList(Boolean value) {
        this.lastItemInList = value;
    }

}
