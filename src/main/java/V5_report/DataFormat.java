//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}numberFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}percentFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}currencyFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}stringFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dateFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dateTimeFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}timeFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}intervalFormat"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}format"/>
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
    "numberFormat",
    "percentFormat",
    "currencyFormat",
    "stringFormat",
    "dateFormat",
    "dateTimeFormat",
    "timeFormat",
    "intervalFormat",
    "format"
})
@XmlRootElement(name = "dataFormat")
public class DataFormat {

    protected NumberFormat numberFormat;
    protected PercentFormat percentFormat;
    protected CurrencyFormat currencyFormat;
    protected StringFormat stringFormat;
    protected DateFormat dateFormat;
    protected DateTimeFormat dateTimeFormat;
    protected TimeFormat timeFormat;
    protected IntervalFormat intervalFormat;
    protected Format format;

    /**
     * Gets the value of the numberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link NumberFormat }
     *     
     */
    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets the value of the numberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberFormat }
     *     
     */
    public void setNumberFormat(NumberFormat value) {
        this.numberFormat = value;
    }

    /**
     * Gets the value of the percentFormat property.
     * 
     * @return
     *     possible object is
     *     {@link PercentFormat }
     *     
     */
    public PercentFormat getPercentFormat() {
        return percentFormat;
    }

    /**
     * Sets the value of the percentFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentFormat }
     *     
     */
    public void setPercentFormat(PercentFormat value) {
        this.percentFormat = value;
    }

    /**
     * Gets the value of the currencyFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyFormat }
     *     
     */
    public CurrencyFormat getCurrencyFormat() {
        return currencyFormat;
    }

    /**
     * Sets the value of the currencyFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyFormat }
     *     
     */
    public void setCurrencyFormat(CurrencyFormat value) {
        this.currencyFormat = value;
    }

    /**
     * Gets the value of the stringFormat property.
     * 
     * @return
     *     possible object is
     *     {@link StringFormat }
     *     
     */
    public StringFormat getStringFormat() {
        return stringFormat;
    }

    /**
     * Sets the value of the stringFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringFormat }
     *     
     */
    public void setStringFormat(StringFormat value) {
        this.stringFormat = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat }
     *     
     */
    public DateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat }
     *     
     */
    public void setDateFormat(DateFormat value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the dateTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFormat }
     *     
     */
    public DateTimeFormat getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Sets the value of the dateTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFormat }
     *     
     */
    public void setDateTimeFormat(DateTimeFormat value) {
        this.dateTimeFormat = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFormat }
     *     
     */
    public TimeFormat getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFormat }
     *     
     */
    public void setTimeFormat(TimeFormat value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the intervalFormat property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalFormat }
     *     
     */
    public IntervalFormat getIntervalFormat() {
        return intervalFormat;
    }

    /**
     * Sets the value of the intervalFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalFormat }
     *     
     */
    public void setIntervalFormat(IntervalFormat value) {
        this.intervalFormat = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link Format }
     *     
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link Format }
     *     
     */
    public void setFormat(Format value) {
        this.format = value;
    }

}
