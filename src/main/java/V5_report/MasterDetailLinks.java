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
 *       &lt;sequence>
 *         &lt;element name="masterDetailLink" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="masterContext">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataItemContext"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="detailContext">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataItemContext"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}parameterContext"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
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
    "masterDetailLink"
})
@XmlRootElement(name = "masterDetailLinks")
public class MasterDetailLinks {

    protected List<MasterDetailLinks.MasterDetailLink> masterDetailLink;

    /**
     * Gets the value of the masterDetailLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterDetailLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterDetailLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterDetailLinks.MasterDetailLink }
     * 
     * 
     */
    public List<MasterDetailLinks.MasterDetailLink> getMasterDetailLink() {
        if (masterDetailLink == null) {
            masterDetailLink = new ArrayList<MasterDetailLinks.MasterDetailLink>();
        }
        return this.masterDetailLink;
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
     *         &lt;element name="masterContext">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataItemContext"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="detailContext">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataItemContext"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}parameterContext"/>
     *                 &lt;/choice>
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
    public static class MasterDetailLink {

        @XmlElement(required = true)
        protected MasterDetailLinks.MasterDetailLink.MasterContext masterContext;
        @XmlElement(required = true)
        protected MasterDetailLinks.MasterDetailLink.DetailContext detailContext;

        /**
         * Gets the value of the masterContext property.
         * 
         * @return
         *     possible object is
         *     {@link MasterDetailLinks.MasterDetailLink.MasterContext }
         *     
         */
        public MasterDetailLinks.MasterDetailLink.MasterContext getMasterContext() {
            return masterContext;
        }

        /**
         * Sets the value of the masterContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link MasterDetailLinks.MasterDetailLink.MasterContext }
         *     
         */
        public void setMasterContext(MasterDetailLinks.MasterDetailLink.MasterContext value) {
            this.masterContext = value;
        }

        /**
         * Gets the value of the detailContext property.
         * 
         * @return
         *     possible object is
         *     {@link MasterDetailLinks.MasterDetailLink.DetailContext }
         *     
         */
        public MasterDetailLinks.MasterDetailLink.DetailContext getDetailContext() {
            return detailContext;
        }

        /**
         * Sets the value of the detailContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link MasterDetailLinks.MasterDetailLink.DetailContext }
         *     
         */
        public void setDetailContext(MasterDetailLinks.MasterDetailLink.DetailContext value) {
            this.detailContext = value;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataItemContext"/>
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}parameterContext"/>
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
            "dataItemContext",
            "parameterContext"
        })
        public static class DetailContext {

            protected DataItemContext dataItemContext;
            protected ParameterContext parameterContext;

            /**
             * Gets the value of the dataItemContext property.
             * 
             * @return
             *     possible object is
             *     {@link DataItemContext }
             *     
             */
            public DataItemContext getDataItemContext() {
                return dataItemContext;
            }

            /**
             * Sets the value of the dataItemContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link DataItemContext }
             *     
             */
            public void setDataItemContext(DataItemContext value) {
                this.dataItemContext = value;
            }

            /**
             * Gets the value of the parameterContext property.
             * 
             * @return
             *     possible object is
             *     {@link ParameterContext }
             *     
             */
            public ParameterContext getParameterContext() {
                return parameterContext;
            }

            /**
             * Sets the value of the parameterContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParameterContext }
             *     
             */
            public void setParameterContext(ParameterContext value) {
                this.parameterContext = value;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataItemContext"/>
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
            "dataItemContext"
        })
        public static class MasterContext {

            protected DataItemContext dataItemContext;

            /**
             * Gets the value of the dataItemContext property.
             * 
             * @return
             *     possible object is
             *     {@link DataItemContext }
             *     
             */
            public DataItemContext getDataItemContext() {
                return dataItemContext;
            }

            /**
             * Sets the value of the dataItemContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link DataItemContext }
             *     
             */
            public void setDataItemContext(DataItemContext value) {
                this.dataItemContext = value;
            }

        }

    }

}
