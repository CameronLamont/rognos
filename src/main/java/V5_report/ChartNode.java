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
 *         &lt;element name="chartNodeMembers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartNodeMember" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="chartNestedNodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartNode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlRootElement(name = "chartNode")
public class ChartNode {

    @XmlElement(required = true)
    protected ChartNode.ChartNodeMembers chartNodeMembers;
    protected ChartNode.ChartNestedNodes chartNestedNodes;

    /**
     * Gets the value of the chartNodeMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ChartNode.ChartNodeMembers }
     *     
     */
    public ChartNode.ChartNodeMembers getChartNodeMembers() {
        return chartNodeMembers;
    }

    /**
     * Sets the value of the chartNodeMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartNode.ChartNodeMembers }
     *     
     */
    public void setChartNodeMembers(ChartNode.ChartNodeMembers value) {
        this.chartNodeMembers = value;
    }

    /**
     * Gets the value of the chartNestedNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ChartNode.ChartNestedNodes }
     *     
     */
    public ChartNode.ChartNestedNodes getChartNestedNodes() {
        return chartNestedNodes;
    }

    /**
     * Sets the value of the chartNestedNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartNode.ChartNestedNodes }
     *     
     */
    public void setChartNestedNodes(ChartNode.ChartNestedNodes value) {
        this.chartNestedNodes = value;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartNode" maxOccurs="unbounded"/>
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
        "chartNode"
    })
    public static class ChartNestedNodes {

        @XmlElement(required = true)
        protected List<ChartNode> chartNode;

        /**
         * Gets the value of the chartNode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chartNode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChartNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChartNode }
         * 
         * 
         */
        public List<ChartNode> getChartNode() {
            if (chartNode == null) {
                chartNode = new ArrayList<ChartNode>();
            }
            return this.chartNode;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartNodeMember" maxOccurs="unbounded"/>
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
        "chartNodeMember"
    })
    public static class ChartNodeMembers {

        @XmlElement(required = true)
        protected List<ChartNodeMember> chartNodeMember;

        /**
         * Gets the value of the chartNodeMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chartNodeMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChartNodeMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChartNodeMember }
         * 
         * 
         */
        public List<ChartNodeMember> getChartNodeMember() {
            if (chartNodeMember == null) {
                chartNodeMember = new ArrayList<ChartNodeMember>();
            }
            return this.chartNodeMember;
        }

    }

}
