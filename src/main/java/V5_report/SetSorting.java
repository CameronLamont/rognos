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
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dmTuple"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dmMemberProperty"/>
 *       &lt;/choice>
 *       &lt;attribute name="ascending" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="breakHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dmTuple",
    "dmMemberProperty"
})
@XmlRootElement(name = "setSorting")
public class SetSorting {

    protected DmTuple dmTuple;
    protected DmMemberProperty dmMemberProperty;
    @XmlAttribute(name = "ascending")
    protected Boolean ascending;
    @XmlAttribute(name = "breakHierarchy")
    protected Boolean breakHierarchy;

    /**
     * Gets the value of the dmTuple property.
     * 
     * @return
     *     possible object is
     *     {@link DmTuple }
     *     
     */
    public DmTuple getDmTuple() {
        return dmTuple;
    }

    /**
     * Sets the value of the dmTuple property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTuple }
     *     
     */
    public void setDmTuple(DmTuple value) {
        this.dmTuple = value;
    }

    /**
     * Gets the value of the dmMemberProperty property.
     * 
     * @return
     *     possible object is
     *     {@link DmMemberProperty }
     *     
     */
    public DmMemberProperty getDmMemberProperty() {
        return dmMemberProperty;
    }

    /**
     * Sets the value of the dmMemberProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMemberProperty }
     *     
     */
    public void setDmMemberProperty(DmMemberProperty value) {
        this.dmMemberProperty = value;
    }

    /**
     * Gets the value of the ascending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAscending() {
        if (ascending == null) {
            return true;
        } else {
            return ascending;
        }
    }

    /**
     * Sets the value of the ascending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAscending(Boolean value) {
        this.ascending = value;
    }

    /**
     * Gets the value of the breakHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBreakHierarchy() {
        if (breakHierarchy == null) {
            return true;
        } else {
            return breakHierarchy;
        }
    }

    /**
     * Sets the value of the breakHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakHierarchy(Boolean value) {
        this.breakHierarchy = value;
    }

}
