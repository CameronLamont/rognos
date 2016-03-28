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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appCheckboxDefinition"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDataSource"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerSelect" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appControlEnabled" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerFilter" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appTextStyle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppControlAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppCheckboxGroupAttributes"/>
 *       &lt;attribute name="textColor" type="{http://developer.cognos.com/schemas/report/11.0/}ColorType" />
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
@XmlRootElement(name = "appCheckboxGroup")
public class AppCheckboxGroup {

    @XmlElement(required = true)
    protected AppCheckboxDefinition appCheckboxDefinition;
    @XmlElement(required = true)
    protected AppDataSource appDataSource;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected AppDrills appDrills;
    protected AppContainerSelect appContainerSelect;
    protected AppControlEnabled appControlEnabled;
    protected ConditionalRender conditionalRender;
    protected AppContainerFilter appContainerFilter;
    protected Style style;
    protected AppTextStyle appTextStyle;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "textColor")
    protected String textColor;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;
    @XmlAttribute(name = "orientation")
    protected String orientation;

    /**
     * Gets the value of the appCheckboxDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AppCheckboxDefinition }
     *     
     */
    public AppCheckboxDefinition getAppCheckboxDefinition() {
        return appCheckboxDefinition;
    }

    /**
     * Sets the value of the appCheckboxDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCheckboxDefinition }
     *     
     */
    public void setAppCheckboxDefinition(AppCheckboxDefinition value) {
        this.appCheckboxDefinition = value;
    }

    /**
     * Gets the value of the appDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link AppDataSource }
     *     
     */
    public AppDataSource getAppDataSource() {
        return appDataSource;
    }

    /**
     * Sets the value of the appDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDataSource }
     *     
     */
    public void setAppDataSource(AppDataSource value) {
        this.appDataSource = value;
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
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
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

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "horizontal";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

}
