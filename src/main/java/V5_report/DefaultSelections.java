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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}defaultSimpleSelection"/>
 *         &lt;element name="defaultRangeSelection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = {
    "defaultSimpleSelectionOrDefaultRangeSelection"
})
@XmlRootElement(name = "defaultSelections")
public class DefaultSelections {

    @XmlElements({
        @XmlElement(name = "defaultSimpleSelection", type = String.class),
        @XmlElement(name = "defaultRangeSelection", type = DefaultSelections.DefaultRangeSelection.class)
    })
    protected List<Object> defaultSimpleSelectionOrDefaultRangeSelection;

    /**
     * Gets the value of the defaultSimpleSelectionOrDefaultRangeSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultSimpleSelectionOrDefaultRangeSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultSimpleSelectionOrDefaultRangeSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link DefaultSelections.DefaultRangeSelection }
     * 
     * 
     */
    public List<Object> getDefaultSimpleSelectionOrDefaultRangeSelection() {
        if (defaultSimpleSelectionOrDefaultRangeSelection == null) {
            defaultSimpleSelectionOrDefaultRangeSelection = new ArrayList<Object>();
        }
        return this.defaultSimpleSelectionOrDefaultRangeSelection;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DefaultRangeSelection {

        @XmlAttribute(name = "min")
        protected String min;
        @XmlAttribute(name = "max")
        protected String max;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMin(String value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMax(String value) {
            this.max = value;
        }

    }

}
