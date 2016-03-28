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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type to define special chart values.
 * 
 * <p>Java class for ChartDynamicValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartDynamicValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataSource"/>
 *         &lt;element name="mean">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="numberOfStddev" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *                 &lt;attribute name="comboIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="limit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="limitType" default="max">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="min"/>
 *                       &lt;enumeration value="max"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="comboIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="percentile">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="percentile" type="{http://www.w3.org/2001/XMLSchema}decimal" default="50" />
 *                 &lt;attribute name="comboIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}percentAlongAxis"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartDynamicValueType", propOrder = {
    "dataSource",
    "mean",
    "limit",
    "percentile",
    "percentAlongAxis"
})
@XmlSeeAlso({
    NumericPosition.class
})
public class ChartDynamicValueType {

    protected DataSourceType dataSource;
    protected ChartDynamicValueType.Mean mean;
    protected ChartDynamicValueType.Limit limit;
    protected ChartDynamicValueType.Percentile percentile;
    protected PercentAlongAxis percentAlongAxis;

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType }
     *     
     */
    public DataSourceType getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType }
     *     
     */
    public void setDataSource(DataSourceType value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDynamicValueType.Mean }
     *     
     */
    public ChartDynamicValueType.Mean getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDynamicValueType.Mean }
     *     
     */
    public void setMean(ChartDynamicValueType.Mean value) {
        this.mean = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDynamicValueType.Limit }
     *     
     */
    public ChartDynamicValueType.Limit getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDynamicValueType.Limit }
     *     
     */
    public void setLimit(ChartDynamicValueType.Limit value) {
        this.limit = value;
    }

    /**
     * Gets the value of the percentile property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDynamicValueType.Percentile }
     *     
     */
    public ChartDynamicValueType.Percentile getPercentile() {
        return percentile;
    }

    /**
     * Sets the value of the percentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDynamicValueType.Percentile }
     *     
     */
    public void setPercentile(ChartDynamicValueType.Percentile value) {
        this.percentile = value;
    }

    /**
     * Gets the value of the percentAlongAxis property.
     * 
     * @return
     *     possible object is
     *     {@link PercentAlongAxis }
     *     
     */
    public PercentAlongAxis getPercentAlongAxis() {
        return percentAlongAxis;
    }

    /**
     * Sets the value of the percentAlongAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentAlongAxis }
     *     
     */
    public void setPercentAlongAxis(PercentAlongAxis value) {
        this.percentAlongAxis = value;
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
     *       &lt;attribute name="limitType" default="max">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="min"/>
     *             &lt;enumeration value="max"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="comboIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Limit {

        @XmlAttribute(name = "limitType")
        protected String limitType;
        @XmlAttribute(name = "comboIndex")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger comboIndex;

        /**
         * Gets the value of the limitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitType() {
            if (limitType == null) {
                return "max";
            } else {
                return limitType;
            }
        }

        /**
         * Sets the value of the limitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitType(String value) {
            this.limitType = value;
        }

        /**
         * Gets the value of the comboIndex property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComboIndex() {
            if (comboIndex == null) {
                return new BigInteger("0");
            } else {
                return comboIndex;
            }
        }

        /**
         * Sets the value of the comboIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComboIndex(BigInteger value) {
            this.comboIndex = value;
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
     *       &lt;attribute name="numberOfStddev" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
     *       &lt;attribute name="comboIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Mean {

        @XmlAttribute(name = "numberOfStddev")
        protected BigDecimal numberOfStddev;
        @XmlAttribute(name = "comboIndex")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger comboIndex;

        /**
         * Gets the value of the numberOfStddev property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNumberOfStddev() {
            if (numberOfStddev == null) {
                return new BigDecimal("0");
            } else {
                return numberOfStddev;
            }
        }

        /**
         * Sets the value of the numberOfStddev property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNumberOfStddev(BigDecimal value) {
            this.numberOfStddev = value;
        }

        /**
         * Gets the value of the comboIndex property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComboIndex() {
            if (comboIndex == null) {
                return new BigInteger("0");
            } else {
                return comboIndex;
            }
        }

        /**
         * Sets the value of the comboIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComboIndex(BigInteger value) {
            this.comboIndex = value;
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
     *       &lt;attribute name="percentile" type="{http://www.w3.org/2001/XMLSchema}decimal" default="50" />
     *       &lt;attribute name="comboIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Percentile {

        @XmlAttribute(name = "percentile")
        protected BigDecimal percentile;
        @XmlAttribute(name = "comboIndex")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger comboIndex;

        /**
         * Gets the value of the percentile property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentile() {
            if (percentile == null) {
                return new BigDecimal("50");
            } else {
                return percentile;
            }
        }

        /**
         * Sets the value of the percentile property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentile(BigDecimal value) {
            this.percentile = value;
        }

        /**
         * Gets the value of the comboIndex property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComboIndex() {
            if (comboIndex == null) {
                return new BigInteger("0");
            } else {
                return comboIndex;
            }
        }

        /**
         * Sets the value of the comboIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComboIndex(BigInteger value) {
            this.comboIndex = value;
        }

    }

}