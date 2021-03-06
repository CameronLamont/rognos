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
 *         &lt;element name="appButtonLabel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appButtonIcon" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appButtonValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appButtonValue" maxOccurs="unbounded">
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
@XmlRootElement(name = "appButtonDefinition")
public class AppButtonDefinition {

    protected AppButtonDefinition.AppButtonLabel appButtonLabel;
    protected AppButtonDefinition.AppButtonIcon appButtonIcon;
    protected AppButtonDefinition.AppButtonValues appButtonValues;

    /**
     * Gets the value of the appButtonLabel property.
     * 
     * @return
     *     possible object is
     *     {@link AppButtonDefinition.AppButtonLabel }
     *     
     */
    public AppButtonDefinition.AppButtonLabel getAppButtonLabel() {
        return appButtonLabel;
    }

    /**
     * Sets the value of the appButtonLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppButtonDefinition.AppButtonLabel }
     *     
     */
    public void setAppButtonLabel(AppButtonDefinition.AppButtonLabel value) {
        this.appButtonLabel = value;
    }

    /**
     * Gets the value of the appButtonIcon property.
     * 
     * @return
     *     possible object is
     *     {@link AppButtonDefinition.AppButtonIcon }
     *     
     */
    public AppButtonDefinition.AppButtonIcon getAppButtonIcon() {
        return appButtonIcon;
    }

    /**
     * Sets the value of the appButtonIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppButtonDefinition.AppButtonIcon }
     *     
     */
    public void setAppButtonIcon(AppButtonDefinition.AppButtonIcon value) {
        this.appButtonIcon = value;
    }

    /**
     * Gets the value of the appButtonValues property.
     * 
     * @return
     *     possible object is
     *     {@link AppButtonDefinition.AppButtonValues }
     *     
     */
    public AppButtonDefinition.AppButtonValues getAppButtonValues() {
        return appButtonValues;
    }

    /**
     * Sets the value of the appButtonValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppButtonDefinition.AppButtonValues }
     *     
     */
    public void setAppButtonValues(AppButtonDefinition.AppButtonValues value) {
        this.appButtonValues = value;
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
    public static class AppButtonIcon {

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
    public static class AppButtonLabel {

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
     *         &lt;element name="appButtonValue" maxOccurs="unbounded">
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
        "appButtonValue"
    })
    public static class AppButtonValues {

        @XmlElement(required = true)
        protected List<AppButtonDefinition.AppButtonValues.AppButtonValue> appButtonValue;

        /**
         * Gets the value of the appButtonValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appButtonValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppButtonValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppButtonDefinition.AppButtonValues.AppButtonValue }
         * 
         * 
         */
        public List<AppButtonDefinition.AppButtonValues.AppButtonValue> getAppButtonValue() {
            if (appButtonValue == null) {
                appButtonValue = new ArrayList<AppButtonDefinition.AppButtonValues.AppButtonValue>();
            }
            return this.appButtonValue;
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
        public static class AppButtonValue {

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
