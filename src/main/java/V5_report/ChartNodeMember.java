//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartContents" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartLabel" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}SolveOrderAttributes"/>
 *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "chartNodeMember")
public class ChartNodeMember {

    protected ChartContents chartContents;
    protected ChartLabel chartLabel;
    protected PropertyList propertyList;
    protected SortList sortList;
    protected Style style;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "refDataItem", required = true)
    protected String refDataItem;
    @XmlAttribute(name = "solveOrder")
    protected BigInteger solveOrder;

    /**
     * Gets the value of the chartContents property.
     * 
     * @return
     *     possible object is
     *     {@link ChartContents }
     *     
     */
    public ChartContents getChartContents() {
        return chartContents;
    }

    /**
     * Sets the value of the chartContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartContents }
     *     
     */
    public void setChartContents(ChartContents value) {
        this.chartContents = value;
    }

    /**
     * Gets the value of the chartLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ChartLabel }
     *     
     */
    public ChartLabel getChartLabel() {
        return chartLabel;
    }

    /**
     * Sets the value of the chartLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartLabel }
     *     
     */
    public void setChartLabel(ChartLabel value) {
        this.chartLabel = value;
    }

    /**
     * Gets the value of the propertyList property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getPropertyList() {
        return propertyList;
    }

    /**
     * Sets the value of the propertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setPropertyList(PropertyList value) {
        this.propertyList = value;
    }

    /**
     * Gets the value of the sortList property.
     * 
     * @return
     *     possible object is
     *     {@link SortList }
     *     
     */
    public SortList getSortList() {
        return sortList;
    }

    /**
     * Sets the value of the sortList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortList }
     *     
     */
    public void setSortList(SortList value) {
        this.sortList = value;
    }

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
     * Gets the value of the solveOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSolveOrder() {
        return solveOrder;
    }

    /**
     * Sets the value of the solveOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSolveOrder(BigInteger value) {
        this.solveOrder = value;
    }

}
