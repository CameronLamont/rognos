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
 *         &lt;element name="repeaterTableCell">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}contents"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyles" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}repeaterGroups" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}propertyList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyles" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}noDataHandler" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}containerDropShadow" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}listSuppress" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}summaryText" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerFilter" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerSelect" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDataRepeaterTableProperties" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appRepeaterTableCellDefinition" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}NoPageWhenNoDataAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}RepeatEveryPageAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppOrientationControlAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}CommonLayoutAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}ShareResultSet"/>
 *       &lt;attribute name="refQuery" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="across" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="down" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="direction" default="lr-tb">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="lr-tb"/>
 *             &lt;enumeration value="tb-lr"/>
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
@XmlRootElement(name = "repeaterTable")
public class RepeaterTable {

    @XmlElement(required = true)
    protected RepeaterTable.RepeaterTableCell repeaterTableCell;
    protected RepeaterGroups repeaterGroups;
    protected PropertyList propertyList;
    protected SortList sortList;
    protected MasterDetailLinks masterDetailLinks;
    protected Style style;
    protected ConditionalStyles conditionalStyles;
    protected ConditionalStyleRefs conditionalStyleRefs;
    protected ConditionalRender conditionalRender;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    protected NoDataHandler noDataHandler;
    protected ContainerDropShadow containerDropShadow;
    protected ListSuppress listSuppress;
    protected LocalizedTextType summaryText;
    protected AppContainerFilter appContainerFilter;
    protected AppContainerSelect appContainerSelect;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected AppDataRepeaterTableProperties appDataRepeaterTableProperties;
    protected AppRepeaterTableCellDefinition appRepeaterTableCellDefinition;
    @XmlAttribute(name = "refQuery", required = true)
    protected String refQuery;
    @XmlAttribute(name = "across")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger across;
    @XmlAttribute(name = "down")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger down;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "renderPageWhenEmpty")
    protected Boolean renderPageWhenEmpty;
    @XmlAttribute(name = "repeatEveryPage")
    protected Boolean repeatEveryPage;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "shareResultSet")
    protected Boolean shareResultSet;

    /**
     * Gets the value of the repeaterTableCell property.
     * 
     * @return
     *     possible object is
     *     {@link RepeaterTable.RepeaterTableCell }
     *     
     */
    public RepeaterTable.RepeaterTableCell getRepeaterTableCell() {
        return repeaterTableCell;
    }

    /**
     * Sets the value of the repeaterTableCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeaterTable.RepeaterTableCell }
     *     
     */
    public void setRepeaterTableCell(RepeaterTable.RepeaterTableCell value) {
        this.repeaterTableCell = value;
    }

    /**
     * Gets the value of the repeaterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link RepeaterGroups }
     *     
     */
    public RepeaterGroups getRepeaterGroups() {
        return repeaterGroups;
    }

    /**
     * Sets the value of the repeaterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeaterGroups }
     *     
     */
    public void setRepeaterGroups(RepeaterGroups value) {
        this.repeaterGroups = value;
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
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link Style }
     *     
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link Style }
     *     
     */
    public void setStyle(Style value) {
        this.style = value;
    }

    /**
     * Gets the value of the conditionalStyles property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyles }
     *     
     */
    public ConditionalStyles getConditionalStyles() {
        return conditionalStyles;
    }

    /**
     * Sets the value of the conditionalStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyles }
     *     
     */
    public void setConditionalStyles(ConditionalStyles value) {
        this.conditionalStyles = value;
    }

    /**
     * Gets the value of the conditionalStyleRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStyleRefs }
     *     
     */
    public ConditionalStyleRefs getConditionalStyleRefs() {
        return conditionalStyleRefs;
    }

    /**
     * Sets the value of the conditionalStyleRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStyleRefs }
     *     
     */
    public void setConditionalStyleRefs(ConditionalStyleRefs value) {
        this.conditionalStyleRefs = value;
    }

    /**
     * Gets the value of the conditionalRender property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalRender }
     *     
     */
    public ConditionalRender getConditionalRender() {
        return conditionalRender;
    }

    /**
     * Sets the value of the conditionalRender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalRender }
     *     
     */
    public void setConditionalRender(ConditionalRender value) {
        this.conditionalRender = value;
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
     * Gets the value of the noDataHandler property.
     * 
     * @return
     *     possible object is
     *     {@link NoDataHandler }
     *     
     */
    public NoDataHandler getNoDataHandler() {
        return noDataHandler;
    }

    /**
     * Sets the value of the noDataHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoDataHandler }
     *     
     */
    public void setNoDataHandler(NoDataHandler value) {
        this.noDataHandler = value;
    }

    /**
     * Gets the value of the containerDropShadow property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerDropShadow }
     *     
     */
    public ContainerDropShadow getContainerDropShadow() {
        return containerDropShadow;
    }

    /**
     * Sets the value of the containerDropShadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerDropShadow }
     *     
     */
    public void setContainerDropShadow(ContainerDropShadow value) {
        this.containerDropShadow = value;
    }

    /**
     * Gets the value of the listSuppress property.
     * 
     * @return
     *     possible object is
     *     {@link ListSuppress }
     *     
     */
    public ListSuppress getListSuppress() {
        return listSuppress;
    }

    /**
     * Sets the value of the listSuppress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSuppress }
     *     
     */
    public void setListSuppress(ListSuppress value) {
        this.listSuppress = value;
    }

    /**
     * Gets the value of the summaryText property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedTextType }
     *     
     */
    public LocalizedTextType getSummaryText() {
        return summaryText;
    }

    /**
     * Sets the value of the summaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedTextType }
     *     
     */
    public void setSummaryText(LocalizedTextType value) {
        this.summaryText = value;
    }

    /**
     * Gets the value of the appContainerFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AppContainerFilter }
     *     
     */
    public AppContainerFilter getAppContainerFilter() {
        return appContainerFilter;
    }

    /**
     * Sets the value of the appContainerFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppContainerFilter }
     *     
     */
    public void setAppContainerFilter(AppContainerFilter value) {
        this.appContainerFilter = value;
    }

    /**
     * Gets the value of the appContainerSelect property.
     * 
     * @return
     *     possible object is
     *     {@link AppContainerSelect }
     *     
     */
    public AppContainerSelect getAppContainerSelect() {
        return appContainerSelect;
    }

    /**
     * Sets the value of the appContainerSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppContainerSelect }
     *     
     */
    public void setAppContainerSelect(AppContainerSelect value) {
        this.appContainerSelect = value;
    }

    /**
     * Gets the value of the appOnSelectSetVariableValues property.
     * 
     * @return
     *     possible object is
     *     {@link AppOnSelectSetVariableValues }
     *     
     */
    public AppOnSelectSetVariableValues getAppOnSelectSetVariableValues() {
        return appOnSelectSetVariableValues;
    }

    /**
     * Sets the value of the appOnSelectSetVariableValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppOnSelectSetVariableValues }
     *     
     */
    public void setAppOnSelectSetVariableValues(AppOnSelectSetVariableValues value) {
        this.appOnSelectSetVariableValues = value;
    }

    /**
     * Gets the value of the appDataRepeaterTableProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AppDataRepeaterTableProperties }
     *     
     */
    public AppDataRepeaterTableProperties getAppDataRepeaterTableProperties() {
        return appDataRepeaterTableProperties;
    }

    /**
     * Sets the value of the appDataRepeaterTableProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDataRepeaterTableProperties }
     *     
     */
    public void setAppDataRepeaterTableProperties(AppDataRepeaterTableProperties value) {
        this.appDataRepeaterTableProperties = value;
    }

    /**
     * Gets the value of the appRepeaterTableCellDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AppRepeaterTableCellDefinition }
     *     
     */
    public AppRepeaterTableCellDefinition getAppRepeaterTableCellDefinition() {
        return appRepeaterTableCellDefinition;
    }

    /**
     * Sets the value of the appRepeaterTableCellDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRepeaterTableCellDefinition }
     *     
     */
    public void setAppRepeaterTableCellDefinition(AppRepeaterTableCellDefinition value) {
        this.appRepeaterTableCellDefinition = value;
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
     * Gets the value of the across property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcross() {
        return across;
    }

    /**
     * Sets the value of the across property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcross(BigInteger value) {
        this.across = value;
    }

    /**
     * Gets the value of the down property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDown() {
        return down;
    }

    /**
     * Sets the value of the down property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDown(BigInteger value) {
        this.down = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        if (direction == null) {
            return "lr-tb";
        } else {
            return direction;
        }
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the renderPageWhenEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRenderPageWhenEmpty() {
        if (renderPageWhenEmpty == null) {
            return true;
        } else {
            return renderPageWhenEmpty;
        }
    }

    /**
     * Sets the value of the renderPageWhenEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenderPageWhenEmpty(Boolean value) {
        this.renderPageWhenEmpty = value;
    }

    /**
     * Gets the value of the repeatEveryPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatEveryPage() {
        if (repeatEveryPage == null) {
            return false;
        } else {
            return repeatEveryPage;
        }
    }

    /**
     * Sets the value of the repeatEveryPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatEveryPage(Boolean value) {
        this.repeatEveryPage = value;
    }

    /**
     * Gets the value of the displayForOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayForOrientation() {
        if (displayForOrientation == null) {
            return "both";
        } else {
            return displayForOrientation;
        }
    }

    /**
     * Sets the value of the displayForOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayForOrientation(String value) {
        this.displayForOrientation = value;
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
     * Gets the value of the shareResultSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShareResultSet() {
        if (shareResultSet == null) {
            return false;
        } else {
            return shareResultSet;
        }
    }

    /**
     * Sets the value of the shareResultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareResultSet(Boolean value) {
        this.shareResultSet = value;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}contents"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyles" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
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
    public static class RepeaterTableCell {

        @XmlElement(required = true)
        protected Contents contents;
        protected Style style;
        protected ConditionalStyles conditionalStyles;
        protected ConditionalStyleRefs conditionalStyleRefs;
        protected ConditionalRender conditionalRender;
        @XmlElement(name = "XMLAttributes")
        protected XMLAttributes xmlAttributes;

        /**
         * Gets the value of the contents property.
         * 
         * @return
         *     possible object is
         *     {@link Contents }
         *     
         */
        public Contents getContents() {
            return contents;
        }

        /**
         * Sets the value of the contents property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contents }
         *     
         */
        public void setContents(Contents value) {
            this.contents = value;
        }

        /**
         * Gets the value of the style property.
         * 
         * @return
         *     possible object is
         *     {@link Style }
         *     
         */
        public Style getStyle() {
            return style;
        }

        /**
         * Sets the value of the style property.
         * 
         * @param value
         *     allowed object is
         *     {@link Style }
         *     
         */
        public void setStyle(Style value) {
            this.style = value;
        }

        /**
         * Gets the value of the conditionalStyles property.
         * 
         * @return
         *     possible object is
         *     {@link ConditionalStyles }
         *     
         */
        public ConditionalStyles getConditionalStyles() {
            return conditionalStyles;
        }

        /**
         * Sets the value of the conditionalStyles property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConditionalStyles }
         *     
         */
        public void setConditionalStyles(ConditionalStyles value) {
            this.conditionalStyles = value;
        }

        /**
         * Gets the value of the conditionalStyleRefs property.
         * 
         * @return
         *     possible object is
         *     {@link ConditionalStyleRefs }
         *     
         */
        public ConditionalStyleRefs getConditionalStyleRefs() {
            return conditionalStyleRefs;
        }

        /**
         * Sets the value of the conditionalStyleRefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConditionalStyleRefs }
         *     
         */
        public void setConditionalStyleRefs(ConditionalStyleRefs value) {
            this.conditionalStyleRefs = value;
        }

        /**
         * Gets the value of the conditionalRender property.
         * 
         * @return
         *     possible object is
         *     {@link ConditionalRender }
         *     
         */
        public ConditionalRender getConditionalRender() {
            return conditionalRender;
        }

        /**
         * Sets the value of the conditionalRender property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConditionalRender }
         *     
         */
        public void setConditionalRender(ConditionalRender value) {
            this.conditionalRender = value;
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

    }

}
