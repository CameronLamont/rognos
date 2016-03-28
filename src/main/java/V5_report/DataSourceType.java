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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="staticValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataItemValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportExpression"/>
 *         &lt;element name="dataItemLabel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="memberCaption">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cellValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appDataItemValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "DataSourceType", propOrder = {
    "staticValue",
    "dataItemValue",
    "reportExpression",
    "dataItemLabel",
    "memberCaption",
    "cellValue",
    "appDataItemValue"
})
@XmlSeeAlso({
    V5_report.ConditionalDataSources.ConditionalDataSource.class
})
public class DataSourceType {

    protected String staticValue;
    protected DataSourceType.DataItemValue dataItemValue;
    protected String reportExpression;
    protected DataSourceType.DataItemLabel dataItemLabel;
    protected DataSourceType.MemberCaption memberCaption;
    protected DataSourceType.CellValue cellValue;
    protected DataSourceType.AppDataItemValue appDataItemValue;

    /**
     * Gets the value of the staticValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticValue() {
        return staticValue;
    }

    /**
     * Sets the value of the staticValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticValue(String value) {
        this.staticValue = value;
    }

    /**
     * Gets the value of the dataItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType.DataItemValue }
     *     
     */
    public DataSourceType.DataItemValue getDataItemValue() {
        return dataItemValue;
    }

    /**
     * Sets the value of the dataItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType.DataItemValue }
     *     
     */
    public void setDataItemValue(DataSourceType.DataItemValue value) {
        this.dataItemValue = value;
    }

    /**
     * Gets the value of the reportExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportExpression() {
        return reportExpression;
    }

    /**
     * Sets the value of the reportExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportExpression(String value) {
        this.reportExpression = value;
    }

    /**
     * Gets the value of the dataItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType.DataItemLabel }
     *     
     */
    public DataSourceType.DataItemLabel getDataItemLabel() {
        return dataItemLabel;
    }

    /**
     * Sets the value of the dataItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType.DataItemLabel }
     *     
     */
    public void setDataItemLabel(DataSourceType.DataItemLabel value) {
        this.dataItemLabel = value;
    }

    /**
     * Gets the value of the memberCaption property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType.MemberCaption }
     *     
     */
    public DataSourceType.MemberCaption getMemberCaption() {
        return memberCaption;
    }

    /**
     * Sets the value of the memberCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType.MemberCaption }
     *     
     */
    public void setMemberCaption(DataSourceType.MemberCaption value) {
        this.memberCaption = value;
    }

    /**
     * Gets the value of the cellValue property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType.CellValue }
     *     
     */
    public DataSourceType.CellValue getCellValue() {
        return cellValue;
    }

    /**
     * Sets the value of the cellValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType.CellValue }
     *     
     */
    public void setCellValue(DataSourceType.CellValue value) {
        this.cellValue = value;
    }

    /**
     * Gets the value of the appDataItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType.AppDataItemValue }
     *     
     */
    public DataSourceType.AppDataItemValue getAppDataItemValue() {
        return appDataItemValue;
    }

    /**
     * Sets the value of the appDataItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType.AppDataItemValue }
     *     
     */
    public void setAppDataItemValue(DataSourceType.AppDataItemValue value) {
        this.appDataItemValue = value;
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
     *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppDataItemValue {

        @XmlAttribute(name = "refDataItem", required = true)
        protected String refDataItem;

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
    public static class CellValue {


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
     *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DataItemLabel {

        @XmlAttribute(name = "refDataItem", required = true)
        protected String refDataItem;

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
     *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DataItemValue {

        @XmlAttribute(name = "refDataItem", required = true)
        protected String refDataItem;

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
    public static class MemberCaption {


    }

}
