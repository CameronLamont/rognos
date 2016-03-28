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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}bar"/>
 *           &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}line"/>
 *           &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}area"/>
 *         &lt;/choice>
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
    "barOrLineOrArea"
})
@XmlRootElement(name = "combinationChartTypes")
public class CombinationChartTypes {

    @XmlElements({
        @XmlElement(name = "bar", type = Bar.class),
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "area", type = Area.class)
    })
    protected List<Object> barOrLineOrArea;

    /**
     * Gets the value of the barOrLineOrArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barOrLineOrArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarOrLineOrArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bar }
     * {@link Line }
     * {@link Area }
     * 
     * 
     */
    public List<Object> getBarOrLineOrArea() {
        if (barOrLineOrArea == null) {
            barOrLineOrArea = new ArrayList<Object>();
        }
        return this.barOrLineOrArea;
    }

}
