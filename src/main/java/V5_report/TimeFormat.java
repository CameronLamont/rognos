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
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}CommonTimeFormatAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}CommonFormatAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}CommonNonStringFormatAttributes"/>
 *       &lt;attribute name="whenZero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "timeFormat")
public class TimeFormat {

    @XmlAttribute(name = "whenZero")
    protected String whenZero;
    @XmlAttribute(name = "timeStyle")
    protected String timeStyle;
    @XmlAttribute(name = "showAmPm")
    protected Boolean showAmPm;
    @XmlAttribute(name = "showTimeZone")
    protected Boolean showTimeZone;
    @XmlAttribute(name = "clock")
    protected String clock;
    @XmlAttribute(name = "decimalDelimiter")
    protected String decimalDelimiter;
    @XmlAttribute(name = "showHours")
    protected String showHours;
    @XmlAttribute(name = "showMinutes")
    protected String showMinutes;
    @XmlAttribute(name = "showSeconds")
    protected String showSeconds;
    @XmlAttribute(name = "showMilliseconds")
    protected String showMilliseconds;
    @XmlAttribute(name = "timeSeparator")
    protected String timeSeparator;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "whenMissing")
    protected String whenMissing;
    @XmlAttribute(name = "whenSecurityError")
    protected String whenSecurityError;
    @XmlAttribute(name = "whenNotApplicable")
    protected String whenNotApplicable;
    @XmlAttribute(name = "whenAnyError")
    protected String whenAnyError;
    @XmlAttribute(name = "digitShaping")
    protected String digitShaping;

    /**
     * Gets the value of the whenZero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenZero() {
        return whenZero;
    }

    /**
     * Sets the value of the whenZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenZero(String value) {
        this.whenZero = value;
    }

    /**
     * Gets the value of the timeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStyle() {
        return timeStyle;
    }

    /**
     * Sets the value of the timeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStyle(String value) {
        this.timeStyle = value;
    }

    /**
     * Gets the value of the showAmPm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowAmPm() {
        return showAmPm;
    }

    /**
     * Sets the value of the showAmPm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAmPm(Boolean value) {
        this.showAmPm = value;
    }

    /**
     * Gets the value of the showTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTimeZone() {
        return showTimeZone;
    }

    /**
     * Sets the value of the showTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTimeZone(Boolean value) {
        this.showTimeZone = value;
    }

    /**
     * Gets the value of the clock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClock() {
        return clock;
    }

    /**
     * Sets the value of the clock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClock(String value) {
        this.clock = value;
    }

    /**
     * Gets the value of the decimalDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalDelimiter() {
        return decimalDelimiter;
    }

    /**
     * Sets the value of the decimalDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalDelimiter(String value) {
        this.decimalDelimiter = value;
    }

    /**
     * Gets the value of the showHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowHours() {
        return showHours;
    }

    /**
     * Sets the value of the showHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowHours(String value) {
        this.showHours = value;
    }

    /**
     * Gets the value of the showMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowMinutes() {
        return showMinutes;
    }

    /**
     * Sets the value of the showMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowMinutes(String value) {
        this.showMinutes = value;
    }

    /**
     * Gets the value of the showSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowSeconds() {
        return showSeconds;
    }

    /**
     * Sets the value of the showSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowSeconds(String value) {
        this.showSeconds = value;
    }

    /**
     * Gets the value of the showMilliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowMilliseconds() {
        return showMilliseconds;
    }

    /**
     * Sets the value of the showMilliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowMilliseconds(String value) {
        this.showMilliseconds = value;
    }

    /**
     * Gets the value of the timeSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSeparator() {
        return timeSeparator;
    }

    /**
     * Sets the value of the timeSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSeparator(String value) {
        this.timeSeparator = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the whenMissing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenMissing() {
        return whenMissing;
    }

    /**
     * Sets the value of the whenMissing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenMissing(String value) {
        this.whenMissing = value;
    }

    /**
     * Gets the value of the whenSecurityError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenSecurityError() {
        return whenSecurityError;
    }

    /**
     * Sets the value of the whenSecurityError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenSecurityError(String value) {
        this.whenSecurityError = value;
    }

    /**
     * Gets the value of the whenNotApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenNotApplicable() {
        return whenNotApplicable;
    }

    /**
     * Sets the value of the whenNotApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenNotApplicable(String value) {
        this.whenNotApplicable = value;
    }

    /**
     * Gets the value of the whenAnyError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenAnyError() {
        return whenAnyError;
    }

    /**
     * Sets the value of the whenAnyError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenAnyError(String value) {
        this.whenAnyError = value;
    }

    /**
     * Gets the value of the digitShaping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitShaping() {
        return digitShaping;
    }

    /**
     * Sets the value of the digitShaping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitShaping(String value) {
        this.digitShaping = value;
    }

}