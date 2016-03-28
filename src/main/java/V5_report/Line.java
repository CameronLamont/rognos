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
 *         &lt;element name="highMarker" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
 *                 &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lowMarker" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
 *                 &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="openMarker" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
 *                 &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="closeMarker" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
 *                 &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ChartValueType"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}PointChartDataPointAttributesForLineAndRadar"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}LineStylesNoColor"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ShowAbsoluteValues"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DisplayDataLocation"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}UseNumericalAxis"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}BorderProperties"/>
 *       &lt;attribute name="showLine" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="showValues" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="lineType" default="pointToPoint">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="pointToPoint"/>
 *             &lt;enumeration value="stepBetweenPoints"/>
 *             &lt;enumeration value="stepAtPoint"/>
 *             &lt;enumeration value="smooth"/>
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
@XmlRootElement(name = "line")
public class Line {

    protected ChartNodes chartNodes;
    protected Line.HighMarker highMarker;
    protected Line.LowMarker lowMarker;
    protected Line.OpenMarker openMarker;
    protected Line.CloseMarker closeMarker;
    @XmlAttribute(name = "showLine")
    protected Boolean showLine;
    @XmlAttribute(name = "showValues")
    protected Boolean showValues;
    @XmlAttribute(name = "lineType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineType;
    @XmlAttribute(name = "valueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueType;
    @XmlAttribute(name = "dataPointSize")
    protected BigDecimal dataPointSize;
    @XmlAttribute(name = "pointChartDataPointShape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pointChartDataPointShape;
    @XmlAttribute(name = "weight")
    protected BigDecimal weight;
    @XmlAttribute(name = "lineStyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineStyle;
    @XmlAttribute(name = "showAbsoluteValues")
    protected Boolean showAbsoluteValues;
    @XmlAttribute(name = "displayDataLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displayDataLocation;
    @XmlAttribute(name = "useNumericalAxis")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useNumericalAxis;
    @XmlAttribute(name = "showBorders")
    protected Boolean showBorders;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "borderTransparency")
    protected BigDecimal borderTransparency;

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
     * Gets the value of the highMarker property.
     * 
     * @return
     *     possible object is
     *     {@link Line.HighMarker }
     *     
     */
    public Line.HighMarker getHighMarker() {
        return highMarker;
    }

    /**
     * Sets the value of the highMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line.HighMarker }
     *     
     */
    public void setHighMarker(Line.HighMarker value) {
        this.highMarker = value;
    }

    /**
     * Gets the value of the lowMarker property.
     * 
     * @return
     *     possible object is
     *     {@link Line.LowMarker }
     *     
     */
    public Line.LowMarker getLowMarker() {
        return lowMarker;
    }

    /**
     * Sets the value of the lowMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line.LowMarker }
     *     
     */
    public void setLowMarker(Line.LowMarker value) {
        this.lowMarker = value;
    }

    /**
     * Gets the value of the openMarker property.
     * 
     * @return
     *     possible object is
     *     {@link Line.OpenMarker }
     *     
     */
    public Line.OpenMarker getOpenMarker() {
        return openMarker;
    }

    /**
     * Sets the value of the openMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line.OpenMarker }
     *     
     */
    public void setOpenMarker(Line.OpenMarker value) {
        this.openMarker = value;
    }

    /**
     * Gets the value of the closeMarker property.
     * 
     * @return
     *     possible object is
     *     {@link Line.CloseMarker }
     *     
     */
    public Line.CloseMarker getCloseMarker() {
        return closeMarker;
    }

    /**
     * Sets the value of the closeMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line.CloseMarker }
     *     
     */
    public void setCloseMarker(Line.CloseMarker value) {
        this.closeMarker = value;
    }

    /**
     * Gets the value of the showLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowLine() {
        if (showLine == null) {
            return true;
        } else {
            return showLine;
        }
    }

    /**
     * Sets the value of the showLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLine(Boolean value) {
        this.showLine = value;
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
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        if (lineType == null) {
            return "pointToPoint";
        } else {
            return lineType;
        }
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
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

    /**
     * Gets the value of the dataPointSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDataPointSize() {
        if (dataPointSize == null) {
            return new BigDecimal("6");
        } else {
            return dataPointSize;
        }
    }

    /**
     * Sets the value of the dataPointSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDataPointSize(BigDecimal value) {
        this.dataPointSize = value;
    }

    /**
     * Gets the value of the pointChartDataPointShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointChartDataPointShape() {
        if (pointChartDataPointShape == null) {
            return "series";
        } else {
            return pointChartDataPointShape;
        }
    }

    /**
     * Sets the value of the pointChartDataPointShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointChartDataPointShape(String value) {
        this.pointChartDataPointShape = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
     *       &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CloseMarker {

        @XmlAttribute(name = "dataPointColor")
        protected String dataPointColor;
        @XmlAttribute(name = "dataPointSize")
        protected BigDecimal dataPointSize;
        @XmlAttribute(name = "dataPointShape")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String dataPointShape;

        /**
         * Gets the value of the dataPointColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointColor() {
            if (dataPointColor == null) {
                return "black";
            } else {
                return dataPointColor;
            }
        }

        /**
         * Sets the value of the dataPointColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointColor(String value) {
            this.dataPointColor = value;
        }

        /**
         * Gets the value of the dataPointSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDataPointSize() {
            if (dataPointSize == null) {
                return new BigDecimal("0");
            } else {
                return dataPointSize;
            }
        }

        /**
         * Sets the value of the dataPointSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDataPointSize(BigDecimal value) {
            this.dataPointSize = value;
        }

        /**
         * Gets the value of the dataPointShape property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointShape() {
            if (dataPointShape == null) {
                return "plainX";
            } else {
                return dataPointShape;
            }
        }

        /**
         * Sets the value of the dataPointShape property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointShape(String value) {
            this.dataPointShape = value;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
     *       &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HighMarker {

        @XmlAttribute(name = "dataPointColor")
        protected String dataPointColor;
        @XmlAttribute(name = "dataPointSize")
        protected BigDecimal dataPointSize;
        @XmlAttribute(name = "dataPointShape")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String dataPointShape;

        /**
         * Gets the value of the dataPointColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointColor() {
            if (dataPointColor == null) {
                return "black";
            } else {
                return dataPointColor;
            }
        }

        /**
         * Sets the value of the dataPointColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointColor(String value) {
            this.dataPointColor = value;
        }

        /**
         * Gets the value of the dataPointSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDataPointSize() {
            if (dataPointSize == null) {
                return new BigDecimal("0");
            } else {
                return dataPointSize;
            }
        }

        /**
         * Sets the value of the dataPointSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDataPointSize(BigDecimal value) {
            this.dataPointSize = value;
        }

        /**
         * Gets the value of the dataPointShape property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointShape() {
            if (dataPointShape == null) {
                return "plainX";
            } else {
                return dataPointShape;
            }
        }

        /**
         * Sets the value of the dataPointShape property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointShape(String value) {
            this.dataPointShape = value;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
     *       &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LowMarker {

        @XmlAttribute(name = "dataPointColor")
        protected String dataPointColor;
        @XmlAttribute(name = "dataPointSize")
        protected BigDecimal dataPointSize;
        @XmlAttribute(name = "dataPointShape")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String dataPointShape;

        /**
         * Gets the value of the dataPointColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointColor() {
            if (dataPointColor == null) {
                return "black";
            } else {
                return dataPointColor;
            }
        }

        /**
         * Sets the value of the dataPointColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointColor(String value) {
            this.dataPointColor = value;
        }

        /**
         * Gets the value of the dataPointSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDataPointSize() {
            if (dataPointSize == null) {
                return new BigDecimal("0");
            } else {
                return dataPointSize;
            }
        }

        /**
         * Sets the value of the dataPointSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDataPointSize(BigDecimal value) {
            this.dataPointSize = value;
        }

        /**
         * Gets the value of the dataPointShape property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointShape() {
            if (dataPointShape == null) {
                return "plainX";
            } else {
                return dataPointShape;
            }
        }

        /**
         * Sets the value of the dataPointShape property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointShape(String value) {
            this.dataPointShape = value;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataPointAttributes"/>
     *       &lt;attribute name="dataPointColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OpenMarker {

        @XmlAttribute(name = "dataPointColor")
        protected String dataPointColor;
        @XmlAttribute(name = "dataPointSize")
        protected BigDecimal dataPointSize;
        @XmlAttribute(name = "dataPointShape")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String dataPointShape;

        /**
         * Gets the value of the dataPointColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointColor() {
            if (dataPointColor == null) {
                return "black";
            } else {
                return dataPointColor;
            }
        }

        /**
         * Sets the value of the dataPointColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointColor(String value) {
            this.dataPointColor = value;
        }

        /**
         * Gets the value of the dataPointSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDataPointSize() {
            if (dataPointSize == null) {
                return new BigDecimal("0");
            } else {
                return dataPointSize;
            }
        }

        /**
         * Sets the value of the dataPointSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDataPointSize(BigDecimal value) {
            this.dataPointSize = value;
        }

        /**
         * Gets the value of the dataPointShape property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPointShape() {
            if (dataPointShape == null) {
                return "plainX";
            } else {
                return dataPointShape;
            }
        }

        /**
         * Sets the value of the dataPointShape property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPointShape(String value) {
            this.dataPointShape = value;
        }

    }

}