//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="appSliderMinVariable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refAppVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appSliderMaxVariable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refAppVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appSliderTrackValuesStyle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appControlEnabled" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appTextStyle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppContinuousSliderAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppControlAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSliderAttributes"/>
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
@XmlRootElement(name = "appContinuousSlider")
public class AppContinuousSlider {

    protected AppContinuousSlider.AppSliderMinVariable appSliderMinVariable;
    protected AppContinuousSlider.AppSliderMaxVariable appSliderMaxVariable;
    protected AppSliderTrackValuesStyle appSliderTrackValuesStyle;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected AppDrills appDrills;
    protected AppControlEnabled appControlEnabled;
    protected ConditionalRender conditionalRender;
    protected Style style;
    protected AppTextStyle appTextStyle;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "min")
    protected BigDecimal min;
    @XmlAttribute(name = "max")
    protected BigDecimal max;
    @XmlAttribute(name = "step")
    protected BigDecimal step;
    @XmlAttribute(name = "tickInterval")
    protected BigDecimal tickInterval;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;
    @XmlAttribute(name = "animate")
    protected Boolean animate;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "rangeType")
    protected String rangeType;
    @XmlAttribute(name = "labelColor")
    protected String labelColor;
    @XmlAttribute(name = "tickType")
    protected String tickType;
    @XmlAttribute(name = "tickLabelSkipInterval")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tickLabelSkipInterval;
    @XmlAttribute(name = "live")
    protected Boolean live;
    @XmlAttribute(name = "trackLength")
    protected String trackLength;
    @XmlAttribute(name = "showTooltip")
    protected Boolean showTooltip;

    /**
     * Gets the value of the appSliderMinVariable property.
     * 
     * @return
     *     possible object is
     *     {@link AppContinuousSlider.AppSliderMinVariable }
     *     
     */
    public AppContinuousSlider.AppSliderMinVariable getAppSliderMinVariable() {
        return appSliderMinVariable;
    }

    /**
     * Sets the value of the appSliderMinVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppContinuousSlider.AppSliderMinVariable }
     *     
     */
    public void setAppSliderMinVariable(AppContinuousSlider.AppSliderMinVariable value) {
        this.appSliderMinVariable = value;
    }

    /**
     * Gets the value of the appSliderMaxVariable property.
     * 
     * @return
     *     possible object is
     *     {@link AppContinuousSlider.AppSliderMaxVariable }
     *     
     */
    public AppContinuousSlider.AppSliderMaxVariable getAppSliderMaxVariable() {
        return appSliderMaxVariable;
    }

    /**
     * Sets the value of the appSliderMaxVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppContinuousSlider.AppSliderMaxVariable }
     *     
     */
    public void setAppSliderMaxVariable(AppContinuousSlider.AppSliderMaxVariable value) {
        this.appSliderMaxVariable = value;
    }

    /**
     * Gets the value of the appSliderTrackValuesStyle property.
     * 
     * @return
     *     possible object is
     *     {@link AppSliderTrackValuesStyle }
     *     
     */
    public AppSliderTrackValuesStyle getAppSliderTrackValuesStyle() {
        return appSliderTrackValuesStyle;
    }

    /**
     * Sets the value of the appSliderTrackValuesStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSliderTrackValuesStyle }
     *     
     */
    public void setAppSliderTrackValuesStyle(AppSliderTrackValuesStyle value) {
        this.appSliderTrackValuesStyle = value;
    }

    /**
     * Gets the value of the appOnSelectSetVariableValues property.
     * 
     * @return
     *     possible object is
     *     {@link AppOnSelectSetVariableValues }
     *     
     */
    public AppOnSelectSetVariableValues getAppOnSelectSetVariableValues() {
        return appOnSelectSetVariableValues;
    }

    /**
     * Sets the value of the appOnSelectSetVariableValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppOnSelectSetVariableValues }
     *     
     */
    public void setAppOnSelectSetVariableValues(AppOnSelectSetVariableValues value) {
        this.appOnSelectSetVariableValues = value;
    }

    /**
     * Gets the value of the appDrills property.
     * 
     * @return
     *     possible object is
     *     {@link AppDrills }
     *     
     */
    public AppDrills getAppDrills() {
        return appDrills;
    }

    /**
     * Sets the value of the appDrills property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDrills }
     *     
     */
    public void setAppDrills(AppDrills value) {
        this.appDrills = value;
    }

    /**
     * Gets the value of the appControlEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AppControlEnabled }
     *     
     */
    public AppControlEnabled getAppControlEnabled() {
        return appControlEnabled;
    }

    /**
     * Sets the value of the appControlEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppControlEnabled }
     *     
     */
    public void setAppControlEnabled(AppControlEnabled value) {
        this.appControlEnabled = value;
    }

    /**
     * Gets the value of the conditionalRender property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalRender }
     *     
     */
    public ConditionalRender getConditionalRender() {
        return conditionalRender;
    }

    /**
     * Sets the value of the conditionalRender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalRender }
     *     
     */
    public void setConditionalRender(ConditionalRender value) {
        this.conditionalRender = value;
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
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMin() {
        if (min == null) {
            return new BigDecimal("0.0");
        } else {
            return min;
        }
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMin(BigDecimal value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMax() {
        if (max == null) {
            return new BigDecimal("100.0");
        } else {
            return max;
        }
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMax(BigDecimal value) {
        this.max = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStep() {
        if (step == null) {
            return new BigDecimal("1.0");
        } else {
            return step;
        }
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStep(BigDecimal value) {
        this.step = value;
    }

    /**
     * Gets the value of the tickInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTickInterval() {
        return tickInterval;
    }

    /**
     * Sets the value of the tickInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTickInterval(BigDecimal value) {
        this.tickInterval = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayForOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayForOrientation() {
        if (displayForOrientation == null) {
            return "both";
        } else {
            return displayForOrientation;
        }
    }

    /**
     * Sets the value of the displayForOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayForOrientation(String value) {
        this.displayForOrientation = value;
    }

    /**
     * Gets the value of the animate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnimate() {
        if (animate == null) {
            return false;
        } else {
            return animate;
        }
    }

    /**
     * Sets the value of the animate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnimate(Boolean value) {
        this.animate = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "horizontal";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the rangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeType() {
        if (rangeType == null) {
            return "none";
        } else {
            return rangeType;
        }
    }

    /**
     * Sets the value of the rangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeType(String value) {
        this.rangeType = value;
    }

    /**
     * Gets the value of the labelColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelColor() {
        if (labelColor == null) {
            return "black";
        } else {
            return labelColor;
        }
    }

    /**
     * Sets the value of the labelColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelColor(String value) {
        this.labelColor = value;
    }

    /**
     * Gets the value of the tickType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickType() {
        if (tickType == null) {
            return "values";
        } else {
            return tickType;
        }
    }

    /**
     * Sets the value of the tickType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickType(String value) {
        this.tickType = value;
    }

    /**
     * Gets the value of the tickLabelSkipInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTickLabelSkipInterval() {
        return tickLabelSkipInterval;
    }

    /**
     * Sets the value of the tickLabelSkipInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTickLabelSkipInterval(BigInteger value) {
        this.tickLabelSkipInterval = value;
    }

    /**
     * Gets the value of the live property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLive() {
        if (live == null) {
            return false;
        } else {
            return live;
        }
    }

    /**
     * Sets the value of the live property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLive(Boolean value) {
        this.live = value;
    }

    /**
     * Gets the value of the trackLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackLength() {
        if (trackLength == null) {
            return "300px";
        } else {
            return trackLength;
        }
    }

    /**
     * Sets the value of the trackLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackLength(String value) {
        this.trackLength = value;
    }

    /**
     * Gets the value of the showTooltip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowTooltip() {
        if (showTooltip == null) {
            return true;
        } else {
            return showTooltip;
        }
    }

    /**
     * Sets the value of the showTooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTooltip(Boolean value) {
        this.showTooltip = value;
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
     *       &lt;attribute name="refAppVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppSliderMaxVariable {

        @XmlAttribute(name = "refAppVariable", required = true)
        protected String refAppVariable;

        /**
         * Gets the value of the refAppVariable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefAppVariable() {
            return refAppVariable;
        }

        /**
         * Sets the value of the refAppVariable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefAppVariable(String value) {
            this.refAppVariable = value;
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
     *       &lt;attribute name="refAppVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppSliderMinVariable {

        @XmlAttribute(name = "refAppVariable", required = true)
        protected String refAppVariable;

        /**
         * Gets the value of the refAppVariable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefAppVariable() {
            return refAppVariable;
        }

        /**
         * Sets the value of the refAppVariable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefAppVariable(String value) {
            this.refAppVariable = value;
        }

    }

}