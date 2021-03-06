//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The position is given by the member returned by the datasource.  If this is a static value, such as Canada, it should be matched by string comparison.  The offset is relative to that member.  Negative values mean to the left and position values mean to the right.  This is a percentage value.  50 means  half way to the member to the immediate right.
 * 
 * <p>Java class for MemberPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportExpression"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}percentAlongAxis"/>
 *         &lt;element name="memberIndex">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="memberIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="memberOffset" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberPositionType", propOrder = {
    "reportExpression",
    "percentAlongAxis",
    "memberIndex"
})
public class MemberPositionType {

    protected String reportExpression;
    protected PercentAlongAxis percentAlongAxis;
    protected MemberPositionType.MemberIndex memberIndex;
    @XmlAttribute(name = "memberOffset")
    protected BigDecimal memberOffset;

    /**
     * Gets the value of the reportExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportExpression() {
        return reportExpression;
    }

    /**
     * Sets the value of the reportExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportExpression(String value) {
        this.reportExpression = value;
    }

    /**
     * Gets the value of the percentAlongAxis property.
     * 
     * @return
     *     possible object is
     *     {@link PercentAlongAxis }
     *     
     */
    public PercentAlongAxis getPercentAlongAxis() {
        return percentAlongAxis;
    }

    /**
     * Sets the value of the percentAlongAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentAlongAxis }
     *     
     */
    public void setPercentAlongAxis(PercentAlongAxis value) {
        this.percentAlongAxis = value;
    }

    /**
     * Gets the value of the memberIndex property.
     * 
     * @return
     *     possible object is
     *     {@link MemberPositionType.MemberIndex }
     *     
     */
    public MemberPositionType.MemberIndex getMemberIndex() {
        return memberIndex;
    }

    /**
     * Sets the value of the memberIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberPositionType.MemberIndex }
     *     
     */
    public void setMemberIndex(MemberPositionType.MemberIndex value) {
        this.memberIndex = value;
    }

    /**
     * Gets the value of the memberOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMemberOffset() {
        if (memberOffset == null) {
            return new BigDecimal("0");
        } else {
            return memberOffset;
        }
    }

    /**
     * Sets the value of the memberOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMemberOffset(BigDecimal value) {
        this.memberOffset = value;
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
     *       &lt;attribute name="memberIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MemberIndex {

        @XmlAttribute(name = "memberIndex")
        @XmlSchemaType(name = "unsignedInt")
        protected Long memberIndex;

        /**
         * Gets the value of the memberIndex property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getMemberIndex() {
            if (memberIndex == null) {
                return  1L;
            } else {
                return memberIndex;
            }
        }

        /**
         * Sets the value of the memberIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMemberIndex(Long value) {
            this.memberIndex = value;
        }

    }

}
