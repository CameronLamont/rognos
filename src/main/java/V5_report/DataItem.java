//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}expression"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataItemAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataItemDetailAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}DataItemCalculatedMemberAttributes"/>
 *       &lt;attribute name="aggregate" default="automatic">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="automatic"/>
 *             &lt;enumeration value="summarize"/>
 *             &lt;enumeration value="total"/>
 *             &lt;enumeration value="minimum"/>
 *             &lt;enumeration value="maximum"/>
 *             &lt;enumeration value="average"/>
 *             &lt;enumeration value="count"/>
 *             &lt;enumeration value="calculated"/>
 *             &lt;enumeration value="countDistinct"/>
 *             &lt;enumeration value="standardDeviation"/>
 *             &lt;enumeration value="variance"/>
 *             &lt;enumeration value="median"/>
 *             &lt;enumeration value="notApplicable"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rollupAggregate" default="automatic">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="automatic"/>
 *             &lt;enumeration value="summarize"/>
 *             &lt;enumeration value="total"/>
 *             &lt;enumeration value="minimum"/>
 *             &lt;enumeration value="maximum"/>
 *             &lt;enumeration value="average"/>
 *             &lt;enumeration value="count"/>
 *             &lt;enumeration value="calculated"/>
 *             &lt;enumeration value="countDistinct"/>
 *             &lt;enumeration value="standardDeviation"/>
 *             &lt;enumeration value="variance"/>
 *             &lt;enumeration value="median"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sort" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ascending"/>
 *             &lt;enumeration value="descending"/>
 *             &lt;enumeration value="none"/>
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
@XmlRootElement(name = "dataItem")
public class DataItem {

    @XmlElement(required = true)
    protected QueryExpressionType expression;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "aggregate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String aggregate;
    @XmlAttribute(name = "rollupAggregate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rollupAggregate;
    @XmlAttribute(name = "sort")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sort;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "detail")
    protected String detail;
    @XmlAttribute(name = "naInCalcMemberContext")
    protected Boolean naInCalcMemberContext;
    @XmlAttribute(name = "solveOrder")
    protected BigInteger solveOrder;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setExpression(QueryExpressionType value) {
        this.expression = value;
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
     * Gets the value of the aggregate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregate() {
        if (aggregate == null) {
            return "automatic";
        } else {
            return aggregate;
        }
    }

    /**
     * Sets the value of the aggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregate(String value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the rollupAggregate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupAggregate() {
        if (rollupAggregate == null) {
            return "automatic";
        } else {
            return rollupAggregate;
        }
    }

    /**
     * Sets the value of the rollupAggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupAggregate(String value) {
        this.rollupAggregate = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        if (sort == null) {
            return "none";
        } else {
            return sort;
        }
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
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
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        if (detail == null) {
            return "automatic";
        } else {
            return detail;
        }
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the naInCalcMemberContext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNaInCalcMemberContext() {
        if (naInCalcMemberContext == null) {
            return false;
        } else {
            return naInCalcMemberContext;
        }
    }

    /**
     * Sets the value of the naInCalcMemberContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaInCalcMemberContext(Boolean value) {
        this.naInCalcMemberContext = value;
    }

    /**
     * Gets the value of the solveOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSolveOrder() {
        return solveOrder;
    }

    /**
     * Sets the value of the solveOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSolveOrder(BigInteger value) {
        this.solveOrder = value;
    }

}
