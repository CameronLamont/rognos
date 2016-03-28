//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigDecimal;
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
 *         &lt;element name="continuousChartPaletteEntry" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="paletteEntryValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="paletteEntryColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
 *                 &lt;attribute name="transparency" default="0">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minInclusive value="0"/>
 *                       &lt;maxInclusive value="100"/>
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
    "continuousChartPaletteEntry"
})
@XmlRootElement(name = "continuousChartPalette")
public class ContinuousChartPalette {

    @XmlElement(required = true)
    protected List<ContinuousChartPalette.ContinuousChartPaletteEntry> continuousChartPaletteEntry;

    /**
     * Gets the value of the continuousChartPaletteEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continuousChartPaletteEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinuousChartPaletteEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContinuousChartPalette.ContinuousChartPaletteEntry }
     * 
     * 
     */
    public List<ContinuousChartPalette.ContinuousChartPaletteEntry> getContinuousChartPaletteEntry() {
        if (continuousChartPaletteEntry == null) {
            continuousChartPaletteEntry = new ArrayList<ContinuousChartPalette.ContinuousChartPaletteEntry>();
        }
        return this.continuousChartPaletteEntry;
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
     *       &lt;attribute name="paletteEntryValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="paletteEntryColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" default="black" />
     *       &lt;attribute name="transparency" default="0">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minInclusive value="0"/>
     *             &lt;maxInclusive value="100"/>
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
    @XmlType(name = "")
    public static class ContinuousChartPaletteEntry {

        @XmlAttribute(name = "paletteEntryValue", required = true)
        protected float paletteEntryValue;
        @XmlAttribute(name = "paletteEntryColor")
        protected String paletteEntryColor;
        @XmlAttribute(name = "transparency")
        protected BigDecimal transparency;

        /**
         * Gets the value of the paletteEntryValue property.
         * 
         */
        public float getPaletteEntryValue() {
            return paletteEntryValue;
        }

        /**
         * Sets the value of the paletteEntryValue property.
         * 
         */
        public void setPaletteEntryValue(float value) {
            this.paletteEntryValue = value;
        }

        /**
         * Gets the value of the paletteEntryColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaletteEntryColor() {
            if (paletteEntryColor == null) {
                return "black";
            } else {
                return paletteEntryColor;
            }
        }

        /**
         * Sets the value of the paletteEntryColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaletteEntryColor(String value) {
            this.paletteEntryColor = value;
        }

        /**
         * Gets the value of the transparency property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTransparency() {
            if (transparency == null) {
                return new BigDecimal("0");
            } else {
                return transparency;
            }
        }

        /**
         * Sets the value of the transparency property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTransparency(BigDecimal value) {
            this.transparency = value;
        }

    }

}
