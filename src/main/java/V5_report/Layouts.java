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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}layout"/>
 *         &lt;element name="conditionalLayouts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conditionalLayout" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}LayoutType">
 *                           &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalPartAttributes"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalOwnerAttributes"/>
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
@XmlRootElement(name = "layouts")
public class Layouts {

    @XmlElement(required = true)
    protected LayoutType layout;
    protected Layouts.ConditionalLayouts conditionalLayouts;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutType }
     *     
     */
    public LayoutType getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutType }
     *     
     */
    public void setLayout(LayoutType value) {
        this.layout = value;
    }

    /**
     * Gets the value of the conditionalLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link Layouts.ConditionalLayouts }
     *     
     */
    public Layouts.ConditionalLayouts getConditionalLayouts() {
        return conditionalLayouts;
    }

    /**
     * Sets the value of the conditionalLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layouts.ConditionalLayouts }
     *     
     */
    public void setConditionalLayouts(Layouts.ConditionalLayouts value) {
        this.conditionalLayouts = value;
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
     *         &lt;element name="conditionalLayout" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}LayoutType">
     *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalPartAttributes"/>
     *               &lt;/extension>
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
        "conditionalLayout"
    })
    public static class ConditionalLayouts {

        @XmlElement(required = true)
        protected List<Layouts.ConditionalLayouts.ConditionalLayout> conditionalLayout;
        @XmlAttribute(name = "refVariable", required = true)
        protected String refVariable;

        /**
         * Gets the value of the conditionalLayout property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conditionalLayout property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConditionalLayout().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Layouts.ConditionalLayouts.ConditionalLayout }
         * 
         * 
         */
        public List<Layouts.ConditionalLayouts.ConditionalLayout> getConditionalLayout() {
            if (conditionalLayout == null) {
                conditionalLayout = new ArrayList<Layouts.ConditionalLayouts.ConditionalLayout>();
            }
            return this.conditionalLayout;
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
         *     &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}LayoutType">
         *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ConditionalPartAttributes"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ConditionalLayout
            extends LayoutType
        {

            @XmlAttribute(name = "refVariableValue", required = true)
            protected String refVariableValue;

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

}
