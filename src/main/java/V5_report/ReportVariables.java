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
 *         &lt;element name="reportVariable" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportExpression"/>
 *                   &lt;element name="variableValues" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice maxOccurs="unbounded">
 *                               &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue"/>
 *                               &lt;element name="variableValueGroup">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue" maxOccurs="unbounded"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="boolean"/>
 *                       &lt;enumeration value="locale"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
    "reportVariable"
})
@XmlRootElement(name = "reportVariables")
public class ReportVariables {

    @XmlElement(required = true)
    protected List<ReportVariables.ReportVariable> reportVariable;

    /**
     * Gets the value of the reportVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportVariables.ReportVariable }
     * 
     * 
     */
    public List<ReportVariables.ReportVariable> getReportVariable() {
        if (reportVariable == null) {
            reportVariable = new ArrayList<ReportVariables.ReportVariable>();
        }
        return this.reportVariable;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportExpression"/>
     *         &lt;element name="variableValues" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice maxOccurs="unbounded">
     *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue"/>
     *                     &lt;element name="variableValueGroup">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue" maxOccurs="unbounded"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="boolean"/>
     *             &lt;enumeration value="locale"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class ReportVariable {

        @XmlElement(required = true)
        protected String reportExpression;
        protected ReportVariables.ReportVariable.VariableValues variableValues;
        @XmlElement(name = "XMLAttributes")
        protected XMLAttributes xmlAttributes;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "type", required = true)
        protected String type;

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
         * Gets the value of the variableValues property.
         * 
         * @return
         *     possible object is
         *     {@link ReportVariables.ReportVariable.VariableValues }
         *     
         */
        public ReportVariables.ReportVariable.VariableValues getVariableValues() {
            return variableValues;
        }

        /**
         * Sets the value of the variableValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportVariables.ReportVariable.VariableValues }
         *     
         */
        public void setVariableValues(ReportVariables.ReportVariable.VariableValues value) {
            this.variableValues = value;
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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
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
         *         &lt;choice maxOccurs="unbounded">
         *           &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue"/>
         *           &lt;element name="variableValueGroup">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue" maxOccurs="unbounded"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "variableValueOrVariableValueGroup"
        })
        public static class VariableValues {

            @XmlElements({
                @XmlElement(name = "variableValue", type = VariableValue.class),
                @XmlElement(name = "variableValueGroup", type = ReportVariables.ReportVariable.VariableValues.VariableValueGroup.class)
            })
            protected List<Object> variableValueOrVariableValueGroup;

            /**
             * Gets the value of the variableValueOrVariableValueGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the variableValueOrVariableValueGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVariableValueOrVariableValueGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VariableValue }
             * {@link ReportVariables.ReportVariable.VariableValues.VariableValueGroup }
             * 
             * 
             */
            public List<Object> getVariableValueOrVariableValueGroup() {
                if (variableValueOrVariableValueGroup == null) {
                    variableValueOrVariableValueGroup = new ArrayList<Object>();
                }
                return this.variableValueOrVariableValueGroup;
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
             *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}variableValue" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "variableValue"
            })
            public static class VariableValueGroup {

                @XmlElement(required = true)
                protected List<VariableValue> variableValue;
                @XmlAttribute(name = "value", required = true)
                protected String value;

                /**
                 * Gets the value of the variableValue property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variableValue property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariableValue().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VariableValue }
                 * 
                 * 
                 */
                public List<VariableValue> getVariableValue() {
                    if (variableValue == null) {
                        variableValue = new ArrayList<VariableValue>();
                    }
                    return this.variableValue;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }

    }

}
