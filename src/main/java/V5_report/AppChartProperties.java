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
 *         &lt;element name="appChartClickableRegions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppClickableRegionsAttributes"/>
 *                 &lt;attribute name="numericAxisTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="ordinalAxisTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="legendTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppChartPropertiesCommonAttributes"/>
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
@XmlRootElement(name = "appChartProperties")
public class AppChartProperties {

    protected AppChartProperties.AppChartClickableRegions appChartClickableRegions;
    @XmlAttribute(name = "showHover")
    protected Boolean showHover;
    @XmlAttribute(name = "showPointer")
    protected Boolean showPointer;
    @XmlAttribute(name = "clickable")
    protected Boolean clickable;

    /**
     * Gets the value of the appChartClickableRegions property.
     * 
     * @return
     *     possible object is
     *     {@link AppChartProperties.AppChartClickableRegions }
     *     
     */
    public AppChartProperties.AppChartClickableRegions getAppChartClickableRegions() {
        return appChartClickableRegions;
    }

    /**
     * Sets the value of the appChartClickableRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppChartProperties.AppChartClickableRegions }
     *     
     */
    public void setAppChartClickableRegions(AppChartProperties.AppChartClickableRegions value) {
        this.appChartClickableRegions = value;
    }

    /**
     * Gets the value of the showHover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowHover() {
        if (showHover == null) {
            return true;
        } else {
            return showHover;
        }
    }

    /**
     * Sets the value of the showHover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHover(Boolean value) {
        this.showHover = value;
    }

    /**
     * Gets the value of the showPointer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowPointer() {
        if (showPointer == null) {
            return false;
        } else {
            return showPointer;
        }
    }

    /**
     * Sets the value of the showPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPointer(Boolean value) {
        this.showPointer = value;
    }

    /**
     * Gets the value of the clickable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClickable() {
        if (clickable == null) {
            return false;
        } else {
            return clickable;
        }
    }

    /**
     * Sets the value of the clickable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClickable(Boolean value) {
        this.clickable = value;
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
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppClickableRegionsAttributes"/>
     *       &lt;attribute name="numericAxisTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="ordinalAxisTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="legendTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppChartClickableRegions {

        @XmlAttribute(name = "numericAxisTitle")
        protected Boolean numericAxisTitle;
        @XmlAttribute(name = "ordinalAxisTitle")
        protected Boolean ordinalAxisTitle;
        @XmlAttribute(name = "legendTitle")
        protected Boolean legendTitle;
        @XmlAttribute(name = "intersections")
        protected Boolean intersections;
        @XmlAttribute(name = "ordinalAxisLabels")
        protected Boolean ordinalAxisLabels;
        @XmlAttribute(name = "legendLabels")
        protected Boolean legendLabels;

        /**
         * Gets the value of the numericAxisTitle property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNumericAxisTitle() {
            if (numericAxisTitle == null) {
                return false;
            } else {
                return numericAxisTitle;
            }
        }

        /**
         * Sets the value of the numericAxisTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNumericAxisTitle(Boolean value) {
            this.numericAxisTitle = value;
        }

        /**
         * Gets the value of the ordinalAxisTitle property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOrdinalAxisTitle() {
            if (ordinalAxisTitle == null) {
                return false;
            } else {
                return ordinalAxisTitle;
            }
        }

        /**
         * Sets the value of the ordinalAxisTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOrdinalAxisTitle(Boolean value) {
            this.ordinalAxisTitle = value;
        }

        /**
         * Gets the value of the legendTitle property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isLegendTitle() {
            if (legendTitle == null) {
                return false;
            } else {
                return legendTitle;
            }
        }

        /**
         * Sets the value of the legendTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLegendTitle(Boolean value) {
            this.legendTitle = value;
        }

        /**
         * Gets the value of the intersections property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIntersections() {
            if (intersections == null) {
                return true;
            } else {
                return intersections;
            }
        }

        /**
         * Sets the value of the intersections property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIntersections(Boolean value) {
            this.intersections = value;
        }

        /**
         * Gets the value of the ordinalAxisLabels property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOrdinalAxisLabels() {
            if (ordinalAxisLabels == null) {
                return false;
            } else {
                return ordinalAxisLabels;
            }
        }

        /**
         * Sets the value of the ordinalAxisLabels property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOrdinalAxisLabels(Boolean value) {
            this.ordinalAxisLabels = value;
        }

        /**
         * Gets the value of the legendLabels property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isLegendLabels() {
            if (legendLabels == null) {
                return false;
            } else {
                return legendLabels;
            }
        }

        /**
         * Sets the value of the legendLabels property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLegendLabels(Boolean value) {
            this.legendLabels = value;
        }

    }

}