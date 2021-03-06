//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="pageOverallGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}headerPages" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}footerPages" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pageGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pageGroup" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}headerPages" minOccurs="0"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}footerPages" minOccurs="0"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
 *                           &lt;/all>
 *                           &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="detailPages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}page"/>
 *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}pageSet"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ResetPageAttributes"/>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "pageSet")
public class PageSet {

    protected PageSet.PageOverallGroup pageOverallGroup;
    protected PageSet.PageGroups pageGroups;
    @XmlElement(required = true)
    protected PageSet.DetailPages detailPages;
    protected MasterDetailLinks masterDetailLinks;
    protected PropertyList propertyList;
    protected SortList sortList;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "refQuery", required = true)
    protected String refQuery;
    @XmlAttribute(name = "resetPageNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resetPageNumber;
    @XmlAttribute(name = "resetPageCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resetPageCount;

    /**
     * Gets the value of the pageOverallGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PageSet.PageOverallGroup }
     *     
     */
    public PageSet.PageOverallGroup getPageOverallGroup() {
        return pageOverallGroup;
    }

    /**
     * Sets the value of the pageOverallGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSet.PageOverallGroup }
     *     
     */
    public void setPageOverallGroup(PageSet.PageOverallGroup value) {
        this.pageOverallGroup = value;
    }

    /**
     * Gets the value of the pageGroups property.
     * 
     * @return
     *     possible object is
     *     {@link PageSet.PageGroups }
     *     
     */
    public PageSet.PageGroups getPageGroups() {
        return pageGroups;
    }

    /**
     * Sets the value of the pageGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSet.PageGroups }
     *     
     */
    public void setPageGroups(PageSet.PageGroups value) {
        this.pageGroups = value;
    }

    /**
     * Gets the value of the detailPages property.
     * 
     * @return
     *     possible object is
     *     {@link PageSet.DetailPages }
     *     
     */
    public PageSet.DetailPages getDetailPages() {
        return detailPages;
    }

    /**
     * Sets the value of the detailPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSet.DetailPages }
     *     
     */
    public void setDetailPages(PageSet.DetailPages value) {
        this.detailPages = value;
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
     * Gets the value of the sortList property.
     * 
     * @return
     *     possible object is
     *     {@link SortList }
     *     
     */
    public SortList getSortList() {
        return sortList;
    }

    /**
     * Sets the value of the sortList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortList }
     *     
     */
    public void setSortList(SortList value) {
        this.sortList = value;
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

    /**
     * Gets the value of the resetPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResetPageNumber() {
        return resetPageNumber;
    }

    /**
     * Sets the value of the resetPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResetPageNumber(BigInteger value) {
        this.resetPageNumber = value;
    }

    /**
     * Gets the value of the resetPageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResetPageCount() {
        return resetPageCount;
    }

    /**
     * Sets the value of the resetPageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResetPageCount(BigInteger value) {
        this.resetPageCount = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}page"/>
     *           &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}pageSet"/>
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
        "pageOrPageSet"
    })
    public static class DetailPages {

        @XmlElements({
            @XmlElement(name = "page", type = Page.class),
            @XmlElement(name = "pageSet", type = PageSet.class)
        })
        protected List<Object> pageOrPageSet;

        /**
         * Gets the value of the pageOrPageSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pageOrPageSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPageOrPageSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Page }
         * {@link PageSet }
         * 
         * 
         */
        public List<Object> getPageOrPageSet() {
            if (pageOrPageSet == null) {
                pageOrPageSet = new ArrayList<Object>();
            }
            return this.pageOrPageSet;
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
     *         &lt;element name="pageGroup" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}headerPages" minOccurs="0"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}footerPages" minOccurs="0"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
     *                 &lt;/all>
     *                 &lt;attribute name="refDataItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "pageGroup"
    })
    public static class PageGroups {

        @XmlElement(required = true)
        protected List<PageSet.PageGroups.PageGroup> pageGroup;

        /**
         * Gets the value of the pageGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pageGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPageGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PageSet.PageGroups.PageGroup }
         * 
         * 
         */
        public List<PageSet.PageGroups.PageGroup> getPageGroup() {
            if (pageGroup == null) {
                pageGroup = new ArrayList<PageSet.PageGroups.PageGroup>();
            }
            return this.pageGroup;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}headerPages" minOccurs="0"/>
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}footerPages" minOccurs="0"/>
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
         *       &lt;/all>
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
        public static class PageGroup {

            protected HeaderPages headerPages;
            protected FooterPages footerPages;
            protected PropertyList propertyList;
            protected SortList sortList;
            @XmlAttribute(name = "refDataItem", required = true)
            protected String refDataItem;

            /**
             * Gets the value of the headerPages property.
             * 
             * @return
             *     possible object is
             *     {@link HeaderPages }
             *     
             */
            public HeaderPages getHeaderPages() {
                return headerPages;
            }

            /**
             * Sets the value of the headerPages property.
             * 
             * @param value
             *     allowed object is
             *     {@link HeaderPages }
             *     
             */
            public void setHeaderPages(HeaderPages value) {
                this.headerPages = value;
            }

            /**
             * Gets the value of the footerPages property.
             * 
             * @return
             *     possible object is
             *     {@link FooterPages }
             *     
             */
            public FooterPages getFooterPages() {
                return footerPages;
            }

            /**
             * Sets the value of the footerPages property.
             * 
             * @param value
             *     allowed object is
             *     {@link FooterPages }
             *     
             */
            public void setFooterPages(FooterPages value) {
                this.footerPages = value;
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
             * Gets the value of the sortList property.
             * 
             * @return
             *     possible object is
             *     {@link SortList }
             *     
             */
            public SortList getSortList() {
                return sortList;
            }

            /**
             * Sets the value of the sortList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SortList }
             *     
             */
            public void setSortList(SortList value) {
                this.sortList = value;
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
     *       &lt;all>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}headerPages" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}footerPages" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
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
    public static class PageOverallGroup {

        protected HeaderPages headerPages;
        protected FooterPages footerPages;
        protected PropertyList propertyList;

        /**
         * Gets the value of the headerPages property.
         * 
         * @return
         *     possible object is
         *     {@link HeaderPages }
         *     
         */
        public HeaderPages getHeaderPages() {
            return headerPages;
        }

        /**
         * Sets the value of the headerPages property.
         * 
         * @param value
         *     allowed object is
         *     {@link HeaderPages }
         *     
         */
        public void setHeaderPages(HeaderPages value) {
            this.headerPages = value;
        }

        /**
         * Gets the value of the footerPages property.
         * 
         * @return
         *     possible object is
         *     {@link FooterPages }
         *     
         */
        public FooterPages getFooterPages() {
            return footerPages;
        }

        /**
         * Sets the value of the footerPages property.
         * 
         * @param value
         *     allowed object is
         *     {@link FooterPages }
         *     
         */
        public void setFooterPages(FooterPages value) {
            this.footerPages = value;
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

    }

}
