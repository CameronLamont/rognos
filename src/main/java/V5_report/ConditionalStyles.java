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
 *         &lt;element name="conditionalStyleCases">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conditionalStyle" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataFormat" minOccurs="0"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
 *                           &lt;/all>
 *                           &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalPartAttributes"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalOwnerAttributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="conditionalStyleDefault">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataFormat" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlRootElement(name = "conditionalStyles")
public class ConditionalStyles {

    @XmlElement(required = true)
    protected ConditionalStyles.ConditionalStyleCases conditionalStyleCases;
    @XmlElement(required = true)
    protected ConditionalStyles.ConditionalStyleDefault conditionalStyleDefault;

    /**
     * Gets the value of the conditionalStyleCases property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyles.ConditionalStyleCases }
     *     
     */
    public ConditionalStyles.ConditionalStyleCases getConditionalStyleCases() {
        return conditionalStyleCases;
    }

    /**
     * Sets the value of the conditionalStyleCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyles.ConditionalStyleCases }
     *     
     */
    public void setConditionalStyleCases(ConditionalStyles.ConditionalStyleCases value) {
        this.conditionalStyleCases = value;
    }

    /**
     * Gets the value of the conditionalStyleDefault property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyles.ConditionalStyleDefault }
     *     
     */
    public ConditionalStyles.ConditionalStyleDefault getConditionalStyleDefault() {
        return conditionalStyleDefault;
    }

    /**
     * Sets the value of the conditionalStyleDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyles.ConditionalStyleDefault }
     *     
     */
    public void setConditionalStyleDefault(ConditionalStyles.ConditionalStyleDefault value) {
        this.conditionalStyleDefault = value;
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
     *         &lt;element name="conditionalStyle" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataFormat" minOccurs="0"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
     *                 &lt;/all>
     *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalPartAttributes"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalOwnerAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conditionalStyle"
    })
    public static class ConditionalStyleCases {

        @XmlElement(required = true)
        protected List<ConditionalStyles.ConditionalStyleCases.ConditionalStyle> conditionalStyle;
        @XmlAttribute(name = "refVariable", required = true)
        protected String refVariable;

        /**
         * Gets the value of the conditionalStyle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conditionalStyle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConditionalStyle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConditionalStyles.ConditionalStyleCases.ConditionalStyle }
         * 
         * 
         */
        public List<ConditionalStyles.ConditionalStyleCases.ConditionalStyle> getConditionalStyle() {
            if (conditionalStyle == null) {
                conditionalStyle = new ArrayList<ConditionalStyles.ConditionalStyleCases.ConditionalStyle>();
            }
            return this.conditionalStyle;
        }

        /**
         * Gets the value of the refVariable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefVariable() {
            return refVariable;
        }

        /**
         * Sets the value of the refVariable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefVariable(String value) {
            this.refVariable = value;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataFormat" minOccurs="0"/>
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
         *       &lt;/all>
         *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalPartAttributes"/>
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
        public static class ConditionalStyle {

            @XmlElement(name = "CSS")
            protected CSS css;
            protected DataFormat dataFormat;
            protected GeneratedBackground generatedBackground;
            @XmlAttribute(name = "refVariableValue", required = true)
            protected String refVariableValue;

            /**
             * Gets the value of the css property.
             * 
             * @return
             *     possible object is
             *     {@link CSS }
             *     
             */
            public CSS getCSS() {
                return css;
            }

            /**
             * Sets the value of the css property.
             * 
             * @param value
             *     allowed object is
             *     {@link CSS }
             *     
             */
            public void setCSS(CSS value) {
                this.css = value;
            }

            /**
             * Gets the value of the dataFormat property.
             * 
             * @return
             *     possible object is
             *     {@link DataFormat }
             *     
             */
            public DataFormat getDataFormat() {
                return dataFormat;
            }

            /**
             * Sets the value of the dataFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link DataFormat }
             *     
             */
            public void setDataFormat(DataFormat value) {
                this.dataFormat = value;
            }

            /**
             * Gets the value of the generatedBackground property.
             * 
             * @return
             *     possible object is
             *     {@link GeneratedBackground }
             *     
             */
            public GeneratedBackground getGeneratedBackground() {
                return generatedBackground;
            }

            /**
             * Sets the value of the generatedBackground property.
             * 
             * @param value
             *     allowed object is
             *     {@link GeneratedBackground }
             *     
             */
            public void setGeneratedBackground(GeneratedBackground value) {
                this.generatedBackground = value;
            }

            /**
             * Gets the value of the refVariableValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefVariableValue() {
                return refVariableValue;
            }

            /**
             * Sets the value of the refVariableValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefVariableValue(String value) {
                this.refVariableValue = value;
            }

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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataFormat" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
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
    public static class ConditionalStyleDefault {

        @XmlElement(name = "CSS")
        protected CSS css;
        protected DataFormat dataFormat;
        protected GeneratedBackground generatedBackground;

        /**
         * Gets the value of the css property.
         * 
         * @return
         *     possible object is
         *     {@link CSS }
         *     
         */
        public CSS getCSS() {
            return css;
        }

        /**
         * Sets the value of the css property.
         * 
         * @param value
         *     allowed object is
         *     {@link CSS }
         *     
         */
        public void setCSS(CSS value) {
            this.css = value;
        }

        /**
         * Gets the value of the dataFormat property.
         * 
         * @return
         *     possible object is
         *     {@link DataFormat }
         *     
         */
        public DataFormat getDataFormat() {
            return dataFormat;
        }

        /**
         * Sets the value of the dataFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataFormat }
         *     
         */
        public void setDataFormat(DataFormat value) {
            this.dataFormat = value;
        }

        /**
         * Gets the value of the generatedBackground property.
         * 
         * @return
         *     possible object is
         *     {@link GeneratedBackground }
         *     
         */
        public GeneratedBackground getGeneratedBackground() {
            return generatedBackground;
        }

        /**
         * Sets the value of the generatedBackground property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeneratedBackground }
         *     
         */
        public void setGeneratedBackground(GeneratedBackground value) {
            this.generatedBackground = value;
        }

    }

}
