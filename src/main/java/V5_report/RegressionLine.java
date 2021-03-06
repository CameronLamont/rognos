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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="regressionLinePosition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="commonLog">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="naturalLog">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="linear">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="exponential">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="polynomialFit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="exponent" default="1">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                 &lt;maxInclusive value="10"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="regressionLineLabel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartContents" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyles" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}LineStyles"/>
 *       &lt;attribute name="numberOfRegressionLines" default="oneForAllData">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="oneForAllData"/>
 *             &lt;enumeration value="oneForEachSeries"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="showInLegend" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
@XmlRootElement(name = "regressionLine")
public class RegressionLine {

    @XmlElement(required = true)
    protected RegressionLine.RegressionLinePosition regressionLinePosition;
    protected RegressionLine.RegressionLineLabel regressionLineLabel;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    protected Style style;
    protected ConditionalStyles conditionalStyles;
    protected ConditionalStyleRefs conditionalStyleRefs;
    protected PropertyList propertyList;
    @XmlAttribute(name = "numberOfRegressionLines")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberOfRegressionLines;
    @XmlAttribute(name = "showInLegend")
    protected Boolean showInLegend;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "transparency")
    protected BigDecimal transparency;
    @XmlAttribute(name = "weight")
    protected BigDecimal weight;
    @XmlAttribute(name = "lineStyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineStyle;

    /**
     * Gets the value of the regressionLinePosition property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionLine.RegressionLinePosition }
     *     
     */
    public RegressionLine.RegressionLinePosition getRegressionLinePosition() {
        return regressionLinePosition;
    }

    /**
     * Sets the value of the regressionLinePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionLine.RegressionLinePosition }
     *     
     */
    public void setRegressionLinePosition(RegressionLine.RegressionLinePosition value) {
        this.regressionLinePosition = value;
    }

    /**
     * Gets the value of the regressionLineLabel property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionLine.RegressionLineLabel }
     *     
     */
    public RegressionLine.RegressionLineLabel getRegressionLineLabel() {
        return regressionLineLabel;
    }

    /**
     * Sets the value of the regressionLineLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionLine.RegressionLineLabel }
     *     
     */
    public void setRegressionLineLabel(RegressionLine.RegressionLineLabel value) {
        this.regressionLineLabel = value;
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
     * Gets the value of the numberOfRegressionLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfRegressionLines() {
        if (numberOfRegressionLines == null) {
            return "oneForAllData";
        } else {
            return numberOfRegressionLines;
        }
    }

    /**
     * Sets the value of the numberOfRegressionLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRegressionLines(String value) {
        this.numberOfRegressionLines = value;
    }

    /**
     * Gets the value of the showInLegend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowInLegend() {
        if (showInLegend == null) {
            return true;
        } else {
            return showInLegend;
        }
    }

    /**
     * Sets the value of the showInLegend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInLegend(Boolean value) {
        this.showInLegend = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        if (color == null) {
            return "black";
        } else {
            return color;
        }
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the transparency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransparency() {
        if (transparency == null) {
            return new BigDecimal("0");
        } else {
            return transparency;
        }
    }

    /**
     * Sets the value of the transparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransparency(BigDecimal value) {
        this.transparency = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        if (weight == null) {
            return new BigDecimal("0");
        } else {
            return weight;
        }
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the lineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineStyle() {
        if (lineStyle == null) {
            return "solid";
        } else {
            return lineStyle;
        }
    }

    /**
     * Sets the value of the lineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineStyle(String value) {
        this.lineStyle = value;
    }


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
    public static class RegressionLineLabel {

        protected ChartContents chartContents;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="commonLog">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="naturalLog">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="linear">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="exponential">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="polynomialFit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="exponent" default="1">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                       &lt;maxInclusive value="10"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonLog",
        "naturalLog",
        "linear",
        "exponential",
        "polynomialFit"
    })
    public static class RegressionLinePosition {

        protected RegressionLine.RegressionLinePosition.CommonLog commonLog;
        protected RegressionLine.RegressionLinePosition.NaturalLog naturalLog;
        protected RegressionLine.RegressionLinePosition.Linear linear;
        protected RegressionLine.RegressionLinePosition.Exponential exponential;
        protected RegressionLine.RegressionLinePosition.PolynomialFit polynomialFit;

        /**
         * Gets the value of the commonLog property.
         * 
         * @return
         *     possible object is
         *     {@link RegressionLine.RegressionLinePosition.CommonLog }
         *     
         */
        public RegressionLine.RegressionLinePosition.CommonLog getCommonLog() {
            return commonLog;
        }

        /**
         * Sets the value of the commonLog property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegressionLine.RegressionLinePosition.CommonLog }
         *     
         */
        public void setCommonLog(RegressionLine.RegressionLinePosition.CommonLog value) {
            this.commonLog = value;
        }

        /**
         * Gets the value of the naturalLog property.
         * 
         * @return
         *     possible object is
         *     {@link RegressionLine.RegressionLinePosition.NaturalLog }
         *     
         */
        public RegressionLine.RegressionLinePosition.NaturalLog getNaturalLog() {
            return naturalLog;
        }

        /**
         * Sets the value of the naturalLog property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegressionLine.RegressionLinePosition.NaturalLog }
         *     
         */
        public void setNaturalLog(RegressionLine.RegressionLinePosition.NaturalLog value) {
            this.naturalLog = value;
        }

        /**
         * Gets the value of the linear property.
         * 
         * @return
         *     possible object is
         *     {@link RegressionLine.RegressionLinePosition.Linear }
         *     
         */
        public RegressionLine.RegressionLinePosition.Linear getLinear() {
            return linear;
        }

        /**
         * Sets the value of the linear property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegressionLine.RegressionLinePosition.Linear }
         *     
         */
        public void setLinear(RegressionLine.RegressionLinePosition.Linear value) {
            this.linear = value;
        }

        /**
         * Gets the value of the exponential property.
         * 
         * @return
         *     possible object is
         *     {@link RegressionLine.RegressionLinePosition.Exponential }
         *     
         */
        public RegressionLine.RegressionLinePosition.Exponential getExponential() {
            return exponential;
        }

        /**
         * Sets the value of the exponential property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegressionLine.RegressionLinePosition.Exponential }
         *     
         */
        public void setExponential(RegressionLine.RegressionLinePosition.Exponential value) {
            this.exponential = value;
        }

        /**
         * Gets the value of the polynomialFit property.
         * 
         * @return
         *     possible object is
         *     {@link RegressionLine.RegressionLinePosition.PolynomialFit }
         *     
         */
        public RegressionLine.RegressionLinePosition.PolynomialFit getPolynomialFit() {
            return polynomialFit;
        }

        /**
         * Sets the value of the polynomialFit property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegressionLine.RegressionLinePosition.PolynomialFit }
         *     
         */
        public void setPolynomialFit(RegressionLine.RegressionLinePosition.PolynomialFit value) {
            this.polynomialFit = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CommonLog {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Exponential {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Linear {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NaturalLog {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="exponent" default="1">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *             &lt;maxInclusive value="10"/>
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
        @XmlType(name = "")
        public static class PolynomialFit {

            @XmlAttribute(name = "exponent")
            protected Integer exponent;

            /**
             * Gets the value of the exponent property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getExponent() {
                if (exponent == null) {
                    return  1;
                } else {
                    return exponent;
                }
            }

            /**
             * Sets the value of the exponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setExponent(Integer value) {
                this.exponent = value;
            }

        }

    }

}
