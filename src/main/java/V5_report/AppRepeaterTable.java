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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appRepeaterTableCellDefinition"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDataSource"/>
 *         &lt;element name="appRepeaterTableCell">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}contents"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerSelect" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerFilter" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appRepeaterTableProperties" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppControlAttributes"/>
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
@XmlRootElement(name = "appRepeaterTable")
public class AppRepeaterTable {

    @XmlElement(required = true)
    protected AppRepeaterTableCellDefinition appRepeaterTableCellDefinition;
    @XmlElement(required = true)
    protected AppDataSource appDataSource;
    @XmlElement(required = true)
    protected AppRepeaterTable.AppRepeaterTableCell appRepeaterTableCell;
    protected AppContainerSelect appContainerSelect;
    protected AppContainerFilter appContainerFilter;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected ConditionalRender conditionalRender;
    protected AppRepeaterTableProperties appRepeaterTableProperties;
    protected Style style;
    protected AppDrills appDrills;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "across")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger across;
    @XmlAttribute(name = "down")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger down;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;

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
     * Gets the value of the appRepeaterTableCell property.
     * 
     * @return
     *     possible object is
     *     {@link AppRepeaterTable.AppRepeaterTableCell }
     *     
     */
    public AppRepeaterTable.AppRepeaterTableCell getAppRepeaterTableCell() {
        return appRepeaterTableCell;
    }

    /**
     * Sets the value of the appRepeaterTableCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRepeaterTable.AppRepeaterTableCell }
     *     
     */
    public void setAppRepeaterTableCell(AppRepeaterTable.AppRepeaterTableCell value) {
        this.appRepeaterTableCell = value;
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
     * Gets the value of the appRepeaterTableProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AppRepeaterTableProperties }
     *     
     */
    public AppRepeaterTableProperties getAppRepeaterTableProperties() {
        return appRepeaterTableProperties;
    }

    /**
     * Sets the value of the appRepeaterTableProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRepeaterTableProperties }
     *     
     */
    public void setAppRepeaterTableProperties(AppRepeaterTableProperties value) {
        this.appRepeaterTableProperties = value;
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
    public static class AppRepeaterTableCell {

        @XmlElement(required = true)
        protected Contents contents;
        protected Style style;
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