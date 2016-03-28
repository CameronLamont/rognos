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
import javax.xml.bind.annotation.XmlType;


/**
 * Common definition for a scatter chart axis
 * 
 * <p>Java class for ScatterNumericAxisType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScatterNumericAxisType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisRange"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisLabels" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisTitle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_minorGridlines" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_majorGridlines" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisLine" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_numericBaselines" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_majorBackgroundColors" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AxisAttributes2"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScatterNumericAxisType2", propOrder = {

})
public class ScatterNumericAxisType2 {

    @XmlElement(name = "v2_axisRange", required = true)
    protected V2AxisRange v2AxisRange;
    @XmlElement(name = "v2_axisLabels")
    protected V2AxisLabels v2AxisLabels;
    @XmlElement(name = "v2_axisTitle")
    protected V2AxisTitle v2AxisTitle;
    @XmlElement(name = "v2_minorGridlines")
    protected V2MinorGridlines v2MinorGridlines;
    @XmlElement(name = "v2_majorGridlines")
    protected V2MajorGridlines v2MajorGridlines;
    @XmlElement(name = "v2_axisLine")
    protected V2AxisLine v2AxisLine;
    @XmlElement(name = "v2_chartMeasure")
    protected ChartMeasureType2 v2ChartMeasure;
    @XmlElement(name = "v2_numericBaselines")
    protected V2NumericBaselines v2NumericBaselines;
    @XmlElement(name = "v2_majorBackgroundColors")
    protected V2MajorBackgroundColors v2MajorBackgroundColors;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "numberOfMinorIntervals")
    protected BigInteger numberOfMinorIntervals;
    @XmlAttribute(name = "showInMatrix")
    protected Boolean showInMatrix;

    /**
     * Gets the value of the v2AxisRange property.
     * 
     * @return
     *     possible object is
     *     {@link V2AxisRange }
     *     
     */
    public V2AxisRange getV2AxisRange() {
        return v2AxisRange;
    }

    /**
     * Sets the value of the v2AxisRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2AxisRange }
     *     
     */
    public void setV2AxisRange(V2AxisRange value) {
        this.v2AxisRange = value;
    }

    /**
     * These will be either numeric or string labels depending on the context.  If this element is not defined, labels will not be rendered for this axis.  Labels will be drawn at every scale interval.  TODO: Deal with label orientation and fitting.
     * 
     * @return
     *     possible object is
     *     {@link V2AxisLabels }
     *     
     */
    public V2AxisLabels getV2AxisLabels() {
        return v2AxisLabels;
    }

    /**
     * Sets the value of the v2AxisLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2AxisLabels }
     *     
     */
    public void setV2AxisLabels(V2AxisLabels value) {
        this.v2AxisLabels = value;
    }

    /**
     * This is the generated or automatic title of an axis.
     * 
     * @return
     *     possible object is
     *     {@link V2AxisTitle }
     *     
     */
    public V2AxisTitle getV2AxisTitle() {
        return v2AxisTitle;
    }

    /**
     * Sets the value of the v2AxisTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2AxisTitle }
     *     
     */
    public void setV2AxisTitle(V2AxisTitle value) {
        this.v2AxisTitle = value;
    }

    /**
     * Gets the value of the v2MinorGridlines property.
     * 
     * @return
     *     possible object is
     *     {@link V2MinorGridlines }
     *     
     */
    public V2MinorGridlines getV2MinorGridlines() {
        return v2MinorGridlines;
    }

    /**
     * Sets the value of the v2MinorGridlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2MinorGridlines }
     *     
     */
    public void setV2MinorGridlines(V2MinorGridlines value) {
        this.v2MinorGridlines = value;
    }

    /**
     * Gets the value of the v2MajorGridlines property.
     * 
     * @return
     *     possible object is
     *     {@link V2MajorGridlines }
     *     
     */
    public V2MajorGridlines getV2MajorGridlines() {
        return v2MajorGridlines;
    }

    /**
     * Sets the value of the v2MajorGridlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2MajorGridlines }
     *     
     */
    public void setV2MajorGridlines(V2MajorGridlines value) {
        this.v2MajorGridlines = value;
    }

    /**
     * Gets the value of the v2AxisLine property.
     * 
     * @return
     *     possible object is
     *     {@link V2AxisLine }
     *     
     */
    public V2AxisLine getV2AxisLine() {
        return v2AxisLine;
    }

    /**
     * Sets the value of the v2AxisLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2AxisLine }
     *     
     */
    public void setV2AxisLine(V2AxisLine value) {
        this.v2AxisLine = value;
    }

    /**
     * Gets the value of the v2ChartMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ChartMeasureType2 }
     *     
     */
    public ChartMeasureType2 getV2ChartMeasure() {
        return v2ChartMeasure;
    }

    /**
     * Sets the value of the v2ChartMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartMeasureType2 }
     *     
     */
    public void setV2ChartMeasure(ChartMeasureType2 value) {
        this.v2ChartMeasure = value;
    }

    /**
     * Baselines that are drawn against this numerical axis.  Baselines are rendered in order, therefore the last baseline in the list will be rendered on top.
     * 
     * @return
     *     possible object is
     *     {@link V2NumericBaselines }
     *     
     */
    public V2NumericBaselines getV2NumericBaselines() {
        return v2NumericBaselines;
    }

    /**
     * Sets the value of the v2NumericBaselines property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2NumericBaselines }
     *     
     */
    public void setV2NumericBaselines(V2NumericBaselines value) {
        this.v2NumericBaselines = value;
    }

    /**
     * Gets the value of the v2MajorBackgroundColors property.
     * 
     * @return
     *     possible object is
     *     {@link V2MajorBackgroundColors }
     *     
     */
    public V2MajorBackgroundColors getV2MajorBackgroundColors() {
        return v2MajorBackgroundColors;
    }

    /**
     * Sets the value of the v2MajorBackgroundColors property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2MajorBackgroundColors }
     *     
     */
    public void setV2MajorBackgroundColors(V2MajorBackgroundColors value) {
        this.v2MajorBackgroundColors = value;
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
     * Gets the value of the numberOfMinorIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMinorIntervals() {
        if (numberOfMinorIntervals == null) {
            return new BigInteger("2");
        } else {
            return numberOfMinorIntervals;
        }
    }

    /**
     * Sets the value of the numberOfMinorIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMinorIntervals(BigInteger value) {
        this.numberOfMinorIntervals = value;
    }

    /**
     * Gets the value of the showInMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowInMatrix() {
        if (showInMatrix == null) {
            return true;
        } else {
            return showInMatrix;
        }
    }

    /**
     * Sets the value of the showInMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInMatrix(Boolean value) {
        this.showInMatrix = value;
    }

}