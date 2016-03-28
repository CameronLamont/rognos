//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appListItemDefinition" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appNoValueListItem" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerSelect" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerFilter" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appControlEnabled" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}sortList" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}listSuppress" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appTextStyle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppDropDownListAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppControlAttributes"/>
 *       &lt;attribute name="refQuery" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="showIcon" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlRootElement(name = "appDataDropDownList")
public class AppDataDropDownList {

    protected AppListItemDefinition appListItemDefinition;
    protected AppNoValueListItem appNoValueListItem;
    protected AppContainerSelect appContainerSelect;
    protected AppContainerFilter appContainerFilter;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected AppDrills appDrills;
    protected AppControlEnabled appControlEnabled;
    protected MasterDetailLinks masterDetailLinks;
    protected SortList sortList;
    protected ListSuppress listSuppress;
    protected ConditionalRender conditionalRender;
    protected Style style;
    protected AppTextStyle appTextStyle;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "refQuery", required = true)
    protected String refQuery;
    @XmlAttribute(name = "showIcon")
    protected Boolean showIcon;
    @XmlAttribute(name = "width", required = true)
    protected String width;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;

    /**
     * Gets the value of the appListItemDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AppListItemDefinition }
     *     
     */
    public AppListItemDefinition getAppListItemDefinition() {
        return appListItemDefinition;
    }

    /**
     * Sets the value of the appListItemDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppListItemDefinition }
     *     
     */
    public void setAppListItemDefinition(AppListItemDefinition value) {
        this.appListItemDefinition = value;
    }

    /**
     * Gets the value of the appNoValueListItem property.
     * 
     * @return
     *     possible object is
     *     {@link AppNoValueListItem }
     *     
     */
    public AppNoValueListItem getAppNoValueListItem() {
        return appNoValueListItem;
    }

    /**
     * Sets the value of the appNoValueListItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppNoValueListItem }
     *     
     */
    public void setAppNoValueListItem(AppNoValueListItem value) {
        this.appNoValueListItem = value;
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
     * Gets the value of the appDrills property.
     * 
     * @return
     *     possible object is
     *     {@link AppDrills }
     *     
     */
    public AppDrills getAppDrills() {
        return appDrills;
    }

    /**
     * Sets the value of the appDrills property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDrills }
     *     
     */
    public void setAppDrills(AppDrills value) {
        this.appDrills = value;
    }

    /**
     * Gets the value of the appControlEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AppControlEnabled }
     *     
     */
    public AppControlEnabled getAppControlEnabled() {
        return appControlEnabled;
    }

    /**
     * Sets the value of the appControlEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppControlEnabled }
     *     
     */
    public void setAppControlEnabled(AppControlEnabled value) {
        this.appControlEnabled = value;
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
     * Gets the value of the appTextStyle property.
     * 
     * @return
     *     possible object is
     *     {@link AppTextStyle }
     *     
     */
    public AppTextStyle getAppTextStyle() {
        return appTextStyle;
    }

    /**
     * Sets the value of the appTextStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppTextStyle }
     *     
     */
    public void setAppTextStyle(AppTextStyle value) {
        this.appTextStyle = value;
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
     * Gets the value of the showIcon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowIcon() {
        if (showIcon == null) {
            return false;
        } else {
            return showIcon;
        }
    }

    /**
     * Sets the value of the showIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowIcon(Boolean value) {
        this.showIcon = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
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

}
