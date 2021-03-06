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
 *       &lt;all>
 *         &lt;element name="appCheckboxLabel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appCheckboxIcon" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appCheckboxValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appCheckboxValue" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlRootElement(name = "appCheckboxDefinition")
public class AppCheckboxDefinition {

    protected AppCheckboxDefinition.AppCheckboxLabel appCheckboxLabel;
    protected AppCheckboxDefinition.AppCheckboxIcon appCheckboxIcon;
    protected AppCheckboxDefinition.AppCheckboxValues appCheckboxValues;

    /**
     * Gets the value of the appCheckboxLabel property.
     * 
     * @return
     *     possible object is
     *     {@link AppCheckboxDefinition.AppCheckboxLabel }
     *     
     */
    public AppCheckboxDefinition.AppCheckboxLabel getAppCheckboxLabel() {
        return appCheckboxLabel;
    }

    /**
     * Sets the value of the appCheckboxLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCheckboxDefinition.AppCheckboxLabel }
     *     
     */
    public void setAppCheckboxLabel(AppCheckboxDefinition.AppCheckboxLabel value) {
        this.appCheckboxLabel = value;
    }

    /**
     * Gets the value of the appCheckboxIcon property.
     * 
     * @return
     *     possible object is
     *     {@link AppCheckboxDefinition.AppCheckboxIcon }
     *     
     */
    public AppCheckboxDefinition.AppCheckboxIcon getAppCheckboxIcon() {
        return appCheckboxIcon;
    }

    /**
     * Sets the value of the appCheckboxIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCheckboxDefinition.AppCheckboxIcon }
     *     
     */
    public void setAppCheckboxIcon(AppCheckboxDefinition.AppCheckboxIcon value) {
        this.appCheckboxIcon = value;
    }

    /**
     * Gets the value of the appCheckboxValues property.
     * 
     * @return
     *     possible object is
     *     {@link AppCheckboxDefinition.AppCheckboxValues }
     *     
     */
    public AppCheckboxDefinition.AppCheckboxValues getAppCheckboxValues() {
        return appCheckboxValues;
    }

    /**
     * Sets the value of the appCheckboxValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCheckboxDefinition.AppCheckboxValues }
     *     
     */
    public void setAppCheckboxValues(AppCheckboxDefinition.AppCheckboxValues value) {
        this.appCheckboxValues = value;
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
    public static class AppCheckboxIcon {

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
    public static class AppCheckboxLabel {

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
     *       &lt;sequence>
     *         &lt;element name="appCheckboxValue" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "appCheckboxValue"
    })
    public static class AppCheckboxValues {

        @XmlElement(required = true)
        protected List<AppCheckboxDefinition.AppCheckboxValues.AppCheckboxValue> appCheckboxValue;

        /**
         * Gets the value of the appCheckboxValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appCheckboxValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppCheckboxValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppCheckboxDefinition.AppCheckboxValues.AppCheckboxValue }
         * 
         * 
         */
        public List<AppCheckboxDefinition.AppCheckboxValues.AppCheckboxValue> getAppCheckboxValue() {
            if (appCheckboxValue == null) {
                appCheckboxValue = new ArrayList<AppCheckboxDefinition.AppCheckboxValues.AppCheckboxValue>();
            }
            return this.appCheckboxValue;
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
        public static class AppCheckboxValue {

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

    }

}
