//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="appSetVariableValueToDataItemValue">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
 *                   &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="appSetVariableValueToConstant">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;all>
 *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appVariableValue"/>
 *                   &lt;/all>
 *                   &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="appClearVariable">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="appSetVariableValueToContinuousValue">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable"
})
@XmlRootElement(name = "appOnSelectSetVariableValues")
public class AppOnSelectSetVariableValues {

    @XmlElements({
        @XmlElement(name = "appSetVariableValueToDataItemValue", type = AppOnSelectSetVariableValues.AppSetVariableValueToDataItemValue.class),
        @XmlElement(name = "appSetVariableValueToConstant", type = AppOnSelectSetVariableValues.AppSetVariableValueToConstant.class),
        @XmlElement(name = "appClearVariable", type = AppOnSelectSetVariableValues.AppClearVariable.class),
        @XmlElement(name = "appSetVariableValueToContinuousValue", type = AppOnSelectSetVariableValues.AppSetVariableValueToContinuousValue.class)
    })
    protected List<Object> appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable;

    /**
     * Gets the value of the appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppOnSelectSetVariableValues.AppSetVariableValueToDataItemValue }
     * {@link AppOnSelectSetVariableValues.AppSetVariableValueToConstant }
     * {@link AppOnSelectSetVariableValues.AppClearVariable }
     * {@link AppOnSelectSetVariableValues.AppSetVariableValueToContinuousValue }
     * 
     * 
     */
    public List<Object> getAppSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable() {
        if (appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable == null) {
            appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable = new ArrayList<Object>();
        }
        return this.appSetVariableValueToDataItemValueOrAppSetVariableValueToConstantOrAppClearVariable;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppClearVariable {

        @XmlAttribute(name = "refAppVariable", required = true)
        protected String refAppVariable;
        @XmlAttribute(name = "sourceType")
        protected String sourceType;

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

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
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
     *       &lt;all>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appVariableValue"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
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
    public static class AppSetVariableValueToConstant {

        @XmlElement(required = true)
        protected AppVariableValue appVariableValue;
        @XmlAttribute(name = "refAppVariable", required = true)
        protected String refAppVariable;
        @XmlAttribute(name = "sourceType")
        protected String sourceType;

        /**
         * Gets the value of the appVariableValue property.
         * 
         * @return
         *     possible object is
         *     {@link AppVariableValue }
         *     
         */
        public AppVariableValue getAppVariableValue() {
            return appVariableValue;
        }

        /**
         * Sets the value of the appVariableValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppVariableValue }
         *     
         */
        public void setAppVariableValue(AppVariableValue value) {
            this.appVariableValue = value;
        }

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

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppSetVariableValueToContinuousValue {

        @XmlAttribute(name = "refAppVariable", required = true)
        protected String refAppVariable;
        @XmlAttribute(name = "sourceType")
        protected String sourceType;

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

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppSetVariableValueAttributes"/>
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
    public static class AppSetVariableValueToDataItemValue {

        @XmlAttribute(name = "refDataItem", required = true)
        protected String refDataItem;
        @XmlAttribute(name = "refAppVariable", required = true)
        protected String refAppVariable;
        @XmlAttribute(name = "sourceType")
        protected String sourceType;

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

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
        }

    }

}
