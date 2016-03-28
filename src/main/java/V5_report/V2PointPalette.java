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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="v2_pointPaletteEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_pointPaletteEntry" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="v2_pointColorByValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_pointColorByValueEntries" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_colorByValueMeasure" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ColorByValueMissing"/>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MarkerShape2"/>
 *                 &lt;attribute name="boundaryValueType" default="percent">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="percent"/>
 *                       &lt;enumeration value="absolute"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MarkerStyleAttributes2"/>
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
@XmlRootElement(name = "v2_pointPalette")
public class V2PointPalette {

    @XmlElement(name = "v2_pointPaletteEntries")
    protected V2PointPalette.V2PointPaletteEntries v2PointPaletteEntries;
    @XmlElement(name = "v2_pointColorByValue")
    protected V2PointPalette.V2PointColorByValue v2PointColorByValue;
    @XmlAttribute(name = "markerBorders")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String markerBorders;
    @XmlAttribute(name = "markerBorderColor")
    protected String markerBorderColor;
    @XmlAttribute(name = "markerSize")
    protected String markerSize;

    /**
     * Gets the value of the v2PointPaletteEntries property.
     * 
     * @return
     *     possible object is
     *     {@link V2PointPalette.V2PointPaletteEntries }
     *     
     */
    public V2PointPalette.V2PointPaletteEntries getV2PointPaletteEntries() {
        return v2PointPaletteEntries;
    }

    /**
     * Sets the value of the v2PointPaletteEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2PointPalette.V2PointPaletteEntries }
     *     
     */
    public void setV2PointPaletteEntries(V2PointPalette.V2PointPaletteEntries value) {
        this.v2PointPaletteEntries = value;
    }

    /**
     * Gets the value of the v2PointColorByValue property.
     * 
     * @return
     *     possible object is
     *     {@link V2PointPalette.V2PointColorByValue }
     *     
     */
    public V2PointPalette.V2PointColorByValue getV2PointColorByValue() {
        return v2PointColorByValue;
    }

    /**
     * Sets the value of the v2PointColorByValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2PointPalette.V2PointColorByValue }
     *     
     */
    public void setV2PointColorByValue(V2PointPalette.V2PointColorByValue value) {
        this.v2PointColorByValue = value;
    }

    /**
     * Gets the value of the markerBorders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerBorders() {
        if (markerBorders == null) {
            return "hide";
        } else {
            return markerBorders;
        }
    }

    /**
     * Sets the value of the markerBorders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerBorders(String value) {
        this.markerBorders = value;
    }

    /**
     * Gets the value of the markerBorderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerBorderColor() {
        if (markerBorderColor == null) {
            return "black";
        } else {
            return markerBorderColor;
        }
    }

    /**
     * Sets the value of the markerBorderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerBorderColor(String value) {
        this.markerBorderColor = value;
    }

    /**
     * Gets the value of the markerSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerSize() {
        if (markerSize == null) {
            return "10pt";
        } else {
            return markerSize;
        }
    }

    /**
     * Sets the value of the markerSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerSize(String value) {
        this.markerSize = value;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_pointColorByValueEntries" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_colorByValueMeasure" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ColorByValueMissing"/>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MarkerShape2"/>
     *       &lt;attribute name="boundaryValueType" default="percent">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="percent"/>
     *             &lt;enumeration value="absolute"/>
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
    public static class V2PointColorByValue {

        @XmlElement(name = "v2_pointColorByValueEntries")
        protected V2PointColorByValueEntries v2PointColorByValueEntries;
        @XmlElement(name = "v2_colorByValueMeasure")
        protected ColorByValuetMeasureType2 v2ColorByValueMeasure;
        @XmlAttribute(name = "boundaryValueType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String boundaryValueType;
        @XmlAttribute(name = "missingColor")
        protected String missingColor;
        @XmlAttribute(name = "missingColorTransparency")
        protected Long missingColorTransparency;
        @XmlAttribute(name = "markerShape")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String markerShape;

        /**
         * Gets the value of the v2PointColorByValueEntries property.
         * 
         * @return
         *     possible object is
         *     {@link V2PointColorByValueEntries }
         *     
         */
        public V2PointColorByValueEntries getV2PointColorByValueEntries() {
            return v2PointColorByValueEntries;
        }

        /**
         * Sets the value of the v2PointColorByValueEntries property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2PointColorByValueEntries }
         *     
         */
        public void setV2PointColorByValueEntries(V2PointColorByValueEntries value) {
            this.v2PointColorByValueEntries = value;
        }

        /**
         * Gets the value of the v2ColorByValueMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link ColorByValuetMeasureType2 }
         *     
         */
        public ColorByValuetMeasureType2 getV2ColorByValueMeasure() {
            return v2ColorByValueMeasure;
        }

        /**
         * Sets the value of the v2ColorByValueMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ColorByValuetMeasureType2 }
         *     
         */
        public void setV2ColorByValueMeasure(ColorByValuetMeasureType2 value) {
            this.v2ColorByValueMeasure = value;
        }

        /**
         * Gets the value of the boundaryValueType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoundaryValueType() {
            if (boundaryValueType == null) {
                return "percent";
            } else {
                return boundaryValueType;
            }
        }

        /**
         * Sets the value of the boundaryValueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoundaryValueType(String value) {
            this.boundaryValueType = value;
        }

        /**
         * Gets the value of the missingColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMissingColor() {
            if (missingColor == null) {
                return "black";
            } else {
                return missingColor;
            }
        }

        /**
         * Sets the value of the missingColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMissingColor(String value) {
            this.missingColor = value;
        }

        /**
         * Gets the value of the missingColorTransparency property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getMissingColorTransparency() {
            if (missingColorTransparency == null) {
                return  0L;
            } else {
                return missingColorTransparency;
            }
        }

        /**
         * Sets the value of the missingColorTransparency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMissingColorTransparency(Long value) {
            this.missingColorTransparency = value;
        }

        /**
         * Gets the value of the markerShape property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarkerShape() {
            if (markerShape == null) {
                return "circle";
            } else {
                return markerShape;
            }
        }

        /**
         * Sets the value of the markerShape property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarkerShape(String value) {
            this.markerShape = value;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_pointPaletteEntry" maxOccurs="unbounded"/>
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
        "v2PointPaletteEntry"
    })
    public static class V2PointPaletteEntries {

        @XmlElement(name = "v2_pointPaletteEntry", required = true)
        protected List<V2PointPaletteEntry> v2PointPaletteEntry;

        /**
         * Gets the value of the v2PointPaletteEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the v2PointPaletteEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getV2PointPaletteEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link V2PointPaletteEntry }
         * 
         * 
         */
        public List<V2PointPaletteEntry> getV2PointPaletteEntry() {
            if (v2PointPaletteEntry == null) {
                v2PointPaletteEntry = new ArrayList<V2PointPaletteEntry>();
            }
            return this.v2PointPaletteEntry;
        }

    }

}