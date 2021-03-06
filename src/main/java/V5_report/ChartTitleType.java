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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic type that represents a title on a chart.
 * 
 * <p>Java class for ChartTitleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartTitleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartContents" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyles" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="refQuery" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartTitleType", propOrder = {

})
@XmlSeeAlso({
    V5_report.Legend.LegendTitle.class,
    AxisTitle.class,
    ChartFooter.class,
    ChartTitle.class,
    ChartSubTitle.class
})
public class ChartTitleType {

    protected ChartContents chartContents;
    protected Style style;
    protected ConditionalStyles conditionalStyles;
    protected ConditionalStyleRefs conditionalStyleRefs;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    protected PropertyList propertyList;
    protected MasterDetailLinks masterDetailLinks;
    @XmlAttribute(name = "refQuery", required = true)
    protected String refQuery;

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
     * Gets the value of the conditionalStyles property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyles }
     *     
     */
    public ConditionalStyles getConditionalStyles() {
        return conditionalStyles;
    }

    /**
     * Sets the value of the conditionalStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyles }
     *     
     */
    public void setConditionalStyles(ConditionalStyles value) {
        this.conditionalStyles = value;
    }

    /**
     * Gets the value of the conditionalStyleRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyleRefs }
     *     
     */
    public ConditionalStyleRefs getConditionalStyleRefs() {
        return conditionalStyleRefs;
    }

    /**
     * Sets the value of the conditionalStyleRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyleRefs }
     *     
     */
    public void setConditionalStyleRefs(ConditionalStyleRefs value) {
        this.conditionalStyleRefs = value;
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
     * Gets the value of the masterDetailLinks property.
     * 
     * @return
     *     possible object is
     *     {@link MasterDetailLinks }
     *     
     */
    public MasterDetailLinks getMasterDetailLinks() {
        return masterDetailLinks;
    }

    /**
     * Sets the value of the masterDetailLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterDetailLinks }
     *     
     */
    public void setMasterDetailLinks(MasterDetailLinks value) {
        this.masterDetailLinks = value;
    }

    /**
     * Gets the value of the refQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefQuery() {
        return refQuery;
    }

    /**
     * Sets the value of the refQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefQuery(String value) {
        this.refQuery = value;
    }

}
