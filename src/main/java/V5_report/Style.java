//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}CSS" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}dataFormat" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}defaultStyles" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}generatedBackground" minOccurs="0"/>
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
@XmlRootElement(name = "style")
public class Style {

    @XmlElement(name = "CSS")
    protected CSS css;
    protected DataFormat dataFormat;
    protected DefaultStyles defaultStyles;
    protected GeneratedBackground generatedBackground;

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
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormat }
     *     
     */
    public DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormat }
     *     
     */
    public void setDataFormat(DataFormat value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the defaultStyles property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultStyles }
     *     
     */
    public DefaultStyles getDefaultStyles() {
        return defaultStyles;
    }

    /**
     * Sets the value of the defaultStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultStyles }
     *     
     */
    public void setDefaultStyles(DefaultStyles value) {
        this.defaultStyles = value;
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

}
