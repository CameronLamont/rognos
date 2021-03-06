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
 *         &lt;element name="mapChartDrill" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportDrills" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="featureId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "mapChartDrill"
})
@XmlRootElement(name = "mapChartDrills")
public class MapChartDrills {

    @XmlElement(required = true)
    protected List<MapChartDrills.MapChartDrill> mapChartDrill;

    /**
     * Gets the value of the mapChartDrill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapChartDrill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapChartDrill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapChartDrills.MapChartDrill }
     * 
     * 
     */
    public List<MapChartDrills.MapChartDrill> getMapChartDrill() {
        if (mapChartDrill == null) {
            mapChartDrill = new ArrayList<MapChartDrills.MapChartDrill>();
        }
        return this.mapChartDrill;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportDrills" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="featureId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class MapChartDrill {

        protected ReportDrills reportDrills;
        @XmlElement(name = "XMLAttributes")
        protected XMLAttributes xmlAttributes;
        @XmlAttribute(name = "featureId", required = true)
        protected String featureId;

        /**
         * Gets the value of the reportDrills property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDrills }
         *     
         */
        public ReportDrills getReportDrills() {
            return reportDrills;
        }

        /**
         * Sets the value of the reportDrills property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDrills }
         *     
         */
        public void setReportDrills(ReportDrills value) {
            this.reportDrills = value;
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
         * Gets the value of the featureId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureId() {
            return featureId;
        }

        /**
         * Sets the value of the featureId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureId(String value) {
            this.featureId = value;
        }

    }

}
