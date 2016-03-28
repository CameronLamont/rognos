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
 *         &lt;element name="classStyle" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DescriptionLayoutAttributes"/>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "classStyle"
})
@XmlRootElement(name = "classStyles")
public class ClassStyles {

    @XmlElement(required = true)
    protected List<ClassStyles.ClassStyle> classStyle;

    /**
     * Gets the value of the classStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassStyles.ClassStyle }
     * 
     * 
     */
    public List<ClassStyles.ClassStyle> getClassStyle() {
        if (classStyle == null) {
            classStyle = new ArrayList<ClassStyles.ClassStyle>();
        }
        return this.classStyle;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DescriptionLayoutAttributes"/>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ClassStyle {

        @XmlElement(name = "CSS")
        protected CSS css;
        protected GeneratedBackground generatedBackground;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "label")
        protected String label;
        @XmlAttribute(name = "description")
        protected String description;

        /**
         * Gets the value of the css property.
         * 
         * @return
         *     possible object is
         *     {@link CSS }
         *     
         */
        public CSS getCSS() {
            return css;
        }

        /**
         * Sets the value of the css property.
         * 
         * @param value
         *     allowed object is
         *     {@link CSS }
         *     
         */
        public void setCSS(CSS value) {
            this.css = value;
        }

        /**
         * Gets the value of the generatedBackground property.
         * 
         * @return
         *     possible object is
         *     {@link GeneratedBackground }
         *     
         */
        public GeneratedBackground getGeneratedBackground() {
            return generatedBackground;
        }

        /**
         * Sets the value of the generatedBackground property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeneratedBackground }
         *     
         */
        public void setGeneratedBackground(GeneratedBackground value) {
            this.generatedBackground = value;
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
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}
