//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigDecimal;
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
 *       &lt;all>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartNodes" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}connectLines" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ShowAbsoluteValues"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DisplayDataLocation"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}BorderProperties"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}UseNumericalAxis"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ChartValueType"/>
 *       &lt;attribute name="showValues" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlRootElement(name = "bar")
public class Bar {

    protected ChartNodes chartNodes;
    protected ConnectLines connectLines;
    @XmlAttribute(name = "showValues")
    protected Boolean showValues;
    @XmlAttribute(name = "showAbsoluteValues")
    protected Boolean showAbsoluteValues;
    @XmlAttribute(name = "displayDataLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displayDataLocation;
    @XmlAttribute(name = "showBorders")
    protected Boolean showBorders;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "borderTransparency")
    protected BigDecimal borderTransparency;
    @XmlAttribute(name = "useNumericalAxis")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useNumericalAxis;
    @XmlAttribute(name = "valueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueType;

    /**
     * Gets the value of the chartNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ChartNodes }
     *     
     */
    public ChartNodes getChartNodes() {
        return chartNodes;
    }

    /**
     * Sets the value of the chartNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartNodes }
     *     
     */
    public void setChartNodes(ChartNodes value) {
        this.chartNodes = value;
    }

    /**
     * Gets the value of the connectLines property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectLines }
     *     
     */
    public ConnectLines getConnectLines() {
        return connectLines;
    }

    /**
     * Sets the value of the connectLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectLines }
     *     
     */
    public void setConnectLines(ConnectLines value) {
        this.connectLines = value;
    }

    /**
     * Gets the value of the showValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowValues() {
        if (showValues == null) {
            return false;
        } else {
            return showValues;
        }
    }

    /**
     * Sets the value of the showValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowValues(Boolean value) {
        this.showValues = value;
    }

    /**
     * Gets the value of the showAbsoluteValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowAbsoluteValues() {
        if (showAbsoluteValues == null) {
            return true;
        } else {
            return showAbsoluteValues;
        }
    }

    /**
     * Sets the value of the showAbsoluteValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAbsoluteValues(Boolean value) {
        this.showAbsoluteValues = value;
    }

    /**
     * Gets the value of the displayDataLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayDataLocation() {
        if (displayDataLocation == null) {
            return "centered";
        } else {
            return displayDataLocation;
        }
    }

    /**
     * Sets the value of the displayDataLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayDataLocation(String value) {
        this.displayDataLocation = value;
    }

    /**
     * Gets the value of the showBorders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowBorders() {
        if (showBorders == null) {
            return false;
        } else {
            return showBorders;
        }
    }

    /**
     * Sets the value of the showBorders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowBorders(Boolean value) {
        this.showBorders = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        if (borderColor == null) {
            return "black";
        } else {
            return borderColor;
        }
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the borderTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBorderTransparency() {
        if (borderTransparency == null) {
            return new BigDecimal("0");
        } else {
            return borderTransparency;
        }
    }

    /**
     * Sets the value of the borderTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBorderTransparency(BigDecimal value) {
        this.borderTransparency = value;
    }

    /**
     * Gets the value of the useNumericalAxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseNumericalAxis() {
        if (useNumericalAxis == null) {
            return "numericalAxisY1";
        } else {
            return useNumericalAxis;
        }
    }

    /**
     * Sets the value of the useNumericalAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseNumericalAxis(String value) {
        this.useNumericalAxis = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        if (valueType == null) {
            return "absolute";
        } else {
            return valueType;
        }
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

}