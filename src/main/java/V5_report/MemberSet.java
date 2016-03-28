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
 *       &lt;all>
 *         &lt;element name="memberSets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}memberSet" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "memberSet")
public class MemberSet {

    protected MemberSet.MemberSets memberSets;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "refDataItem", required = true)
    protected String refDataItem;

    /**
     * Gets the value of the memberSets property.
     * 
     * @return
     *     possible object is
     *     {@link MemberSet.MemberSets }
     *     
     */
    public MemberSet.MemberSets getMemberSets() {
        return memberSets;
    }

    /**
     * Sets the value of the memberSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberSet.MemberSets }
     *     
     */
    public void setMemberSets(MemberSet.MemberSets value) {
        this.memberSets = value;
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
     * Gets the value of the refDataItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDataItem() {
        return refDataItem;
    }

    /**
     * Sets the value of the refDataItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDataItem(String value) {
        this.refDataItem = value;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}memberSet" maxOccurs="unbounded"/>
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
        "memberSet"
    })
    public static class MemberSets {

        @XmlElement(required = true)
        protected List<MemberSet> memberSet;

        /**
         * Gets the value of the memberSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MemberSet }
         * 
         * 
         */
        public List<MemberSet> getMemberSet() {
            if (memberSet == null) {
                memberSet = new ArrayList<MemberSet>();
            }
            return this.memberSet;
        }

    }

}
