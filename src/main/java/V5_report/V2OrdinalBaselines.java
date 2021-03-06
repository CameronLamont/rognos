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
 *       &lt;sequence>
 *         &lt;element name="v2_ordinalBaseline" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_ordinalPosition"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_label" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}LineStyleAndColorAttributes2"/>
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
    "v2OrdinalBaseline"
})
@XmlRootElement(name = "v2_ordinalBaselines")
public class V2OrdinalBaselines {

    @XmlElement(name = "v2_ordinalBaseline", required = true)
    protected List<V2OrdinalBaselines.V2OrdinalBaseline> v2OrdinalBaseline;

    /**
     * Gets the value of the v2OrdinalBaseline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v2OrdinalBaseline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV2OrdinalBaseline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link V2OrdinalBaselines.V2OrdinalBaseline }
     * 
     * 
     */
    public List<V2OrdinalBaselines.V2OrdinalBaseline> getV2OrdinalBaseline() {
        if (v2OrdinalBaseline == null) {
            v2OrdinalBaseline = new ArrayList<V2OrdinalBaselines.V2OrdinalBaseline>();
        }
        return this.v2OrdinalBaseline;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_ordinalPosition"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_label" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}LineStyleAndColorAttributes2"/>
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
    public static class V2OrdinalBaseline {

        @XmlElement(name = "v2_ordinalPosition", required = true)
        protected OrdinalPositionType2 v2OrdinalPosition;
        @XmlElement(name = "v2_label")
        protected ChartTextLegendLabel2 v2Label;
        protected ConditionalRender conditionalRender;
        protected PropertyList propertyList;
        @XmlElement(name = "XMLAttributes")
        protected XMLAttributes xmlAttributes;
        @XmlAttribute(name = "lineColor")
        protected String lineColor;
        @XmlAttribute(name = "lineStyle")
        protected LineStyleType2 lineStyle;
        @XmlAttribute(name = "lineWeight")
        protected String lineWeight;

        /**
         * Gets the value of the v2OrdinalPosition property.
         * 
         * @return
         *     possible object is
         *     {@link OrdinalPositionType2 }
         *     
         */
        public OrdinalPositionType2 getV2OrdinalPosition() {
            return v2OrdinalPosition;
        }

        /**
         * Sets the value of the v2OrdinalPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdinalPositionType2 }
         *     
         */
        public void setV2OrdinalPosition(OrdinalPositionType2 value) {
            this.v2OrdinalPosition = value;
        }

        /**
         * Gets the value of the v2Label property.
         * 
         * @return
         *     possible object is
         *     {@link ChartTextLegendLabel2 }
         *     
         */
        public ChartTextLegendLabel2 getV2Label() {
            return v2Label;
        }

        /**
         * Sets the value of the v2Label property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChartTextLegendLabel2 }
         *     
         */
        public void setV2Label(ChartTextLegendLabel2 value) {
            this.v2Label = value;
        }

        /**
         * Gets the value of the conditionalRender property.
         * 
         * @return
         *     possible object is
         *     {@link ConditionalRender }
         *     
         */
        public ConditionalRender getConditionalRender() {
            return conditionalRender;
        }

        /**
         * Sets the value of the conditionalRender property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConditionalRender }
         *     
         */
        public void setConditionalRender(ConditionalRender value) {
            this.conditionalRender = value;
        }

        /**
         * Gets the value of the propertyList property.
         * 
         * @return
         *     possible object is
         *     {@link PropertyList }
         *     
         */
        public PropertyList getPropertyList() {
            return propertyList;
        }

        /**
         * Sets the value of the propertyList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyList }
         *     
         */
        public void setPropertyList(PropertyList value) {
            this.propertyList = value;
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
         * Gets the value of the lineColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineColor() {
            if (lineColor == null) {
                return "black";
            } else {
                return lineColor;
            }
        }

        /**
         * Sets the value of the lineColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineColor(String value) {
            this.lineColor = value;
        }

        /**
         * Gets the value of the lineStyle property.
         * 
         * @return
         *     possible object is
         *     {@link LineStyleType2 }
         *     
         */
        public LineStyleType2 getLineStyle() {
            if (lineStyle == null) {
                return LineStyleType2 .SOLID;
            } else {
                return lineStyle;
            }
        }

        /**
         * Sets the value of the lineStyle property.
         * 
         * @param value
         *     allowed object is
         *     {@link LineStyleType2 }
         *     
         */
        public void setLineStyle(LineStyleType2 value) {
            this.lineStyle = value;
        }

        /**
         * Gets the value of the lineWeight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineWeight() {
            if (lineWeight == null) {
                return "1px";
            } else {
                return lineWeight;
            }
        }

        /**
         * Sets the value of the lineWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineWeight(String value) {
            this.lineWeight = value;
        }

    }

}
