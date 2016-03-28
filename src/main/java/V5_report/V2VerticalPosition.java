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
 *       &lt;choice>
 *         &lt;element name="v2_top">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="offset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSPosition" default="0px" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="v2_middle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="offset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSPosition" default="0px" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="v2_bottom">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="offset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSPosition" default="0px" />
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
    "v2Top",
    "v2Middle",
    "v2Bottom"
})
@XmlRootElement(name = "v2_verticalPosition")
public class V2VerticalPosition {

    @XmlElement(name = "v2_top")
    protected V2VerticalPosition.V2Top v2Top;
    @XmlElement(name = "v2_middle")
    protected V2VerticalPosition.V2Middle v2Middle;
    @XmlElement(name = "v2_bottom")
    protected V2VerticalPosition.V2Bottom v2Bottom;

    /**
     * Gets the value of the v2Top property.
     * 
     * @return
     *     possible object is
     *     {@link V2VerticalPosition.V2Top }
     *     
     */
    public V2VerticalPosition.V2Top getV2Top() {
        return v2Top;
    }

    /**
     * Sets the value of the v2Top property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2VerticalPosition.V2Top }
     *     
     */
    public void setV2Top(V2VerticalPosition.V2Top value) {
        this.v2Top = value;
    }

    /**
     * Gets the value of the v2Middle property.
     * 
     * @return
     *     possible object is
     *     {@link V2VerticalPosition.V2Middle }
     *     
     */
    public V2VerticalPosition.V2Middle getV2Middle() {
        return v2Middle;
    }

    /**
     * Sets the value of the v2Middle property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2VerticalPosition.V2Middle }
     *     
     */
    public void setV2Middle(V2VerticalPosition.V2Middle value) {
        this.v2Middle = value;
    }

    /**
     * Gets the value of the v2Bottom property.
     * 
     * @return
     *     possible object is
     *     {@link V2VerticalPosition.V2Bottom }
     *     
     */
    public V2VerticalPosition.V2Bottom getV2Bottom() {
        return v2Bottom;
    }

    /**
     * Sets the value of the v2Bottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2VerticalPosition.V2Bottom }
     *     
     */
    public void setV2Bottom(V2VerticalPosition.V2Bottom value) {
        this.v2Bottom = value;
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
     *       &lt;attribute name="offset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSPosition" default="0px" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class V2Bottom {

        @XmlAttribute(name = "offset")
        protected String offset;

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffset() {
            if (offset == null) {
                return "0px";
            } else {
                return offset;
            }
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffset(String value) {
            this.offset = value;
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
     *       &lt;attribute name="offset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSPosition" default="0px" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class V2Middle {

        @XmlAttribute(name = "offset")
        protected String offset;

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffset() {
            if (offset == null) {
                return "0px";
            } else {
                return offset;
            }
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffset(String value) {
            this.offset = value;
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
     *       &lt;attribute name="offset" type="{http://developer.cognos.com/schemas/report/11.0/}CSSPosition" default="0px" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class V2Top {

        @XmlAttribute(name = "offset")
        protected String offset;

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffset() {
            if (offset == null) {
                return "0px";
            } else {
                return offset;
            }
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffset(String value) {
            this.offset = value;
        }

    }

}