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
 *         &lt;element name="v2_note" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_constrainedPosition"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartTextItems" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="refQuery" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "v2Note"
})
@XmlRootElement(name = "v2_notes")
public class V2Notes {

    @XmlElement(name = "v2_note", required = true)
    protected List<V2Notes.V2Note> v2Note;

    /**
     * Gets the value of the v2Note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v2Note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV2Note().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link V2Notes.V2Note }
     * 
     * 
     */
    public List<V2Notes.V2Note> getV2Note() {
        if (v2Note == null) {
            v2Note = new ArrayList<V2Notes.V2Note>();
        }
        return this.v2Note;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_constrainedPosition"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartTextItems" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="refQuery" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class V2Note {

        protected Style style;
        @XmlElement(name = "v2_constrainedPosition", required = true)
        protected V2ConstrainedPosition v2ConstrainedPosition;
        protected ConditionalRender conditionalRender;
        protected ConditionalStyleRefs conditionalStyleRefs;
        @XmlElement(name = "XMLAttributes")
        protected XMLAttributes xmlAttributes;
        protected MasterDetailLinks masterDetailLinks;
        protected PropertyList propertyList;
        @XmlElement(name = "v2_chartTextItems")
        protected V2ChartTextItems v2ChartTextItems;
        @XmlAttribute(name = "refQuery", required = true)
        protected String refQuery;

        /**
         * Gets the value of the style property.
         * 
         * @return
         *     possible object is
         *     {@link Style }
         *     
         */
        public Style getStyle() {
            return style;
        }

        /**
         * Sets the value of the style property.
         * 
         * @param value
         *     allowed object is
         *     {@link Style }
         *     
         */
        public void setStyle(Style value) {
            this.style = value;
        }

        /**
         * Gets the value of the v2ConstrainedPosition property.
         * 
         * @return
         *     possible object is
         *     {@link V2ConstrainedPosition }
         *     
         */
        public V2ConstrainedPosition getV2ConstrainedPosition() {
            return v2ConstrainedPosition;
        }

        /**
         * Sets the value of the v2ConstrainedPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2ConstrainedPosition }
         *     
         */
        public void setV2ConstrainedPosition(V2ConstrainedPosition value) {
            this.v2ConstrainedPosition = value;
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
         * Gets the value of the conditionalStyleRefs property.
         * 
         * @return
         *     possible object is
         *     {@link ConditionalStyleRefs }
         *     
         */
        public ConditionalStyleRefs getConditionalStyleRefs() {
            return conditionalStyleRefs;
        }

        /**
         * Sets the value of the conditionalStyleRefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConditionalStyleRefs }
         *     
         */
        public void setConditionalStyleRefs(ConditionalStyleRefs value) {
            this.conditionalStyleRefs = value;
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
         * Gets the value of the masterDetailLinks property.
         * 
         * @return
         *     possible object is
         *     {@link MasterDetailLinks }
         *     
         */
        public MasterDetailLinks getMasterDetailLinks() {
            return masterDetailLinks;
        }

        /**
         * Sets the value of the masterDetailLinks property.
         * 
         * @param value
         *     allowed object is
         *     {@link MasterDetailLinks }
         *     
         */
        public void setMasterDetailLinks(MasterDetailLinks value) {
            this.masterDetailLinks = value;
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
         * Gets the value of the v2ChartTextItems property.
         * 
         * @return
         *     possible object is
         *     {@link V2ChartTextItems }
         *     
         */
        public V2ChartTextItems getV2ChartTextItems() {
            return v2ChartTextItems;
        }

        /**
         * Sets the value of the v2ChartTextItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2ChartTextItems }
         *     
         */
        public void setV2ChartTextItems(V2ChartTextItems value) {
            this.v2ChartTextItems = value;
        }

        /**
         * Gets the value of the refQuery property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefQuery() {
            return refQuery;
        }

        /**
         * Sets the value of the refQuery property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefQuery(String value) {
            this.refQuery = value;
        }

    }

}