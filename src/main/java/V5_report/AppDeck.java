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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appCardDefinition"/>
 *         &lt;element name="appCards">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appCard" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}contents"/>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDataSource"/>
 *         &lt;element name="appDefaultCard" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}contents"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerSelect" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerFilter" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppControlAttributes"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AppDeckControlAttributes"/>
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
@XmlRootElement(name = "appDeck")
public class AppDeck {

    @XmlElement(required = true)
    protected AppCardDefinition appCardDefinition;
    @XmlElement(required = true)
    protected AppDeck.AppCards appCards;
    @XmlElement(required = true)
    protected AppDataSource appDataSource;
    protected AppDeck.AppDefaultCard appDefaultCard;
    protected AppContainerSelect appContainerSelect;
    protected AppContainerFilter appContainerFilter;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected AppDrills appDrills;
    protected ConditionalRender conditionalRender;
    protected Style style;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "slideDirection")
    protected String slideDirection;

    /**
     * Gets the value of the appCardDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AppCardDefinition }
     *     
     */
    public AppCardDefinition getAppCardDefinition() {
        return appCardDefinition;
    }

    /**
     * Sets the value of the appCardDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCardDefinition }
     *     
     */
    public void setAppCardDefinition(AppCardDefinition value) {
        this.appCardDefinition = value;
    }

    /**
     * Gets the value of the appCards property.
     * 
     * @return
     *     possible object is
     *     {@link AppDeck.AppCards }
     *     
     */
    public AppDeck.AppCards getAppCards() {
        return appCards;
    }

    /**
     * Sets the value of the appCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDeck.AppCards }
     *     
     */
    public void setAppCards(AppDeck.AppCards value) {
        this.appCards = value;
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
     * Gets the value of the appDefaultCard property.
     * 
     * @return
     *     possible object is
     *     {@link AppDeck.AppDefaultCard }
     *     
     */
    public AppDeck.AppDefaultCard getAppDefaultCard() {
        return appDefaultCard;
    }

    /**
     * Sets the value of the appDefaultCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDeck.AppDefaultCard }
     *     
     */
    public void setAppDefaultCard(AppDeck.AppDefaultCard value) {
        this.appDefaultCard = value;
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
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the slideDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlideDirection() {
        return slideDirection;
    }

    /**
     * Sets the value of the slideDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlideDirection(String value) {
        this.slideDirection = value;
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
     *         &lt;element name="appCard" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}contents"/>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
     *                 &lt;/all>
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
        "appCard"
    })
    public static class AppCards {

        @XmlElement(required = true)
        protected List<AppDeck.AppCards.AppCard> appCard;

        /**
         * Gets the value of the appCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppDeck.AppCards.AppCard }
         * 
         * 
         */
        public List<AppDeck.AppCards.AppCard> getAppCard() {
            if (appCard == null) {
                appCard = new ArrayList<AppDeck.AppCards.AppCard>();
            }
            return this.appCard;
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
        public static class AppCard {

            @XmlElement(required = true)
            protected Contents contents;
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
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
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
    public static class AppDefaultCard {

        @XmlElement(required = true)
        protected Contents contents;
        protected Style style;
        protected ConditionalStyleRefs conditionalStyleRefs;
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