//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartNodes" minOccurs="0"/>
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
@XmlRootElement(name = "progressiveBars")
public class ProgressiveBars {

    protected ChartNodes chartNodes;

    /**
     * Gets the value of the chartNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ChartNodes }
     *     
     */
    public ChartNodes getChartNodes() {
        return chartNodes;
    }

    /**
     * Sets the value of the chartNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartNodes }
     *     
     */
    public void setChartNodes(ChartNodes value) {
        this.chartNodes = value;
    }

}
