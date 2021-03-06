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
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_commonAxis" minOccurs="0"/>
 *         &lt;element name="v2_topLeftAxis" type="{http://developer.cognos.com/schemas/report/11.0/}CombinationNumericAxisType2" minOccurs="0"/>
 *         &lt;element name="v2_topRightAxis" type="{http://developer.cognos.com/schemas/report/11.0/}CombinationNumericAxisType2" minOccurs="0"/>
 *         &lt;element name="v2_bottomLeftAxis" type="{http://developer.cognos.com/schemas/report/11.0/}CombinationNumericAxisType2" minOccurs="0"/>
 *         &lt;element name="v2_bottomRightAxis" type="{http://developer.cognos.com/schemas/report/11.0/}CombinationNumericAxisType2" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_legend" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_defaultChartMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartTitle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartSubTitle" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartFooter" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalRender" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartBody" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_notes" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}reportDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_dropShadow" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}chartSuppress" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}noDataHandler" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}masterDetailLinks" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}conditionalStyleRefs" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}alternateText" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_matrix" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_combinationTypeTooltips" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_plotArea" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appOnSelectSetVariableValues" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appDrills" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appContainerSelect" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appChartProperties" minOccurs="0"/>
 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_chartTextStyle" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}Depth2"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}CommonChartAttributes2"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MaterialEffects"/>
 *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}OrientationGroup"/>
 *       &lt;attribute name="matchSeriesColor" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlRootElement(name = "v2_combinationChart")
public class V2CombinationChart {

    protected Style style;
    @XmlElement(name = "v2_commonAxis")
    protected V2CommonAxis v2CommonAxis;
    @XmlElement(name = "v2_topLeftAxis")
    protected CombinationNumericAxisType2 v2TopLeftAxis;
    @XmlElement(name = "v2_topRightAxis")
    protected CombinationNumericAxisType2 v2TopRightAxis;
    @XmlElement(name = "v2_bottomLeftAxis")
    protected CombinationNumericAxisType2 v2BottomLeftAxis;
    @XmlElement(name = "v2_bottomRightAxis")
    protected CombinationNumericAxisType2 v2BottomRightAxis;
    @XmlElement(name = "v2_legend")
    protected V2Legend v2Legend;
    @XmlElement(name = "v2_defaultChartMeasure")
    protected ChartMeasureType2 v2DefaultChartMeasure;
    @XmlElement(name = "v2_chartTitle")
    protected ChartText2 v2ChartTitle;
    @XmlElement(name = "v2_chartSubTitle")
    protected ChartText2 v2ChartSubTitle;
    @XmlElement(name = "v2_chartFooter")
    protected ChartText2 v2ChartFooter;
    protected ConditionalRender conditionalRender;
    @XmlElement(name = "v2_chartBody")
    protected V2ChartBody v2ChartBody;
    @XmlElement(name = "v2_notes")
    protected V2Notes v2Notes;
    protected ReportDrills reportDrills;
    @XmlElement(name = "v2_dropShadow")
    protected V2DropShadow v2DropShadow;
    protected ChartSuppress chartSuppress;
    protected NoDataHandler noDataHandler;
    protected MasterDetailLinks masterDetailLinks;
    protected ConditionalStyleRefs conditionalStyleRefs;
    protected LocalizedTextType alternateText;
    @XmlElement(name = "v2_matrix")
    protected V2Matrix v2Matrix;
    @XmlElement(name = "v2_combinationTypeTooltips")
    protected V2CombinationTypeTooltips v2CombinationTypeTooltips;
    @XmlElement(name = "v2_plotArea")
    protected V2PlotArea v2PlotArea;
    @XmlElement(name = "XMLAttributes")
    protected XMLAttributes xmlAttributes;
    protected AppOnSelectSetVariableValues appOnSelectSetVariableValues;
    protected AppDrills appDrills;
    protected AppContainerSelect appContainerSelect;
    protected AppChartProperties appChartProperties;
    @XmlElement(name = "v2_chartTextStyle")
    protected V2ChartTextStyle v2ChartTextStyle;
    @XmlAttribute(name = "matchSeriesColor")
    protected Boolean matchSeriesColor;
    @XmlAttribute(name = "depth")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger depth;
    @XmlAttribute(name = "refQuery", required = true)
    protected String refQuery;
    @XmlAttribute(name = "maxHotspots")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxHotspots;
    @XmlAttribute(name = "renderPageWhenEmpty")
    protected Boolean renderPageWhenEmpty;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "repeatEveryPage")
    protected Boolean repeatEveryPage;
    @XmlAttribute(name = "displayForOrientation")
    protected String displayForOrientation;
    @XmlAttribute(name = "materialEffects")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String materialEffects;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;

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
     * Common axis for all items in the combination chart.  Spacing attributes go here.
     * 
     * @return
     *     possible object is
     *     {@link V2CommonAxis }
     *     
     */
    public V2CommonAxis getV2CommonAxis() {
        return v2CommonAxis;
    }

    /**
     * Sets the value of the v2CommonAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2CommonAxis }
     *     
     */
    public void setV2CommonAxis(V2CommonAxis value) {
        this.v2CommonAxis = value;
    }

    /**
     * Gets the value of the v2TopLeftAxis property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public CombinationNumericAxisType2 getV2TopLeftAxis() {
        return v2TopLeftAxis;
    }

    /**
     * Sets the value of the v2TopLeftAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public void setV2TopLeftAxis(CombinationNumericAxisType2 value) {
        this.v2TopLeftAxis = value;
    }

    /**
     * Gets the value of the v2TopRightAxis property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public CombinationNumericAxisType2 getV2TopRightAxis() {
        return v2TopRightAxis;
    }

    /**
     * Sets the value of the v2TopRightAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public void setV2TopRightAxis(CombinationNumericAxisType2 value) {
        this.v2TopRightAxis = value;
    }

    /**
     * Gets the value of the v2BottomLeftAxis property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public CombinationNumericAxisType2 getV2BottomLeftAxis() {
        return v2BottomLeftAxis;
    }

    /**
     * Sets the value of the v2BottomLeftAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public void setV2BottomLeftAxis(CombinationNumericAxisType2 value) {
        this.v2BottomLeftAxis = value;
    }

    /**
     * Gets the value of the v2BottomRightAxis property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public CombinationNumericAxisType2 getV2BottomRightAxis() {
        return v2BottomRightAxis;
    }

    /**
     * Sets the value of the v2BottomRightAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationNumericAxisType2 }
     *     
     */
    public void setV2BottomRightAxis(CombinationNumericAxisType2 value) {
        this.v2BottomRightAxis = value;
    }

    /**
     * Defines the legend.  STYLE:  The legend will support font, color, background color, background image, generated background and padding.
     * 
     * @return
     *     possible object is
     *     {@link V2Legend }
     *     
     */
    public V2Legend getV2Legend() {
        return v2Legend;
    }

    /**
     * Sets the value of the v2Legend property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2Legend }
     *     
     */
    public void setV2Legend(V2Legend value) {
        this.v2Legend = value;
    }

    /**
     * Gets the value of the v2DefaultChartMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ChartMeasureType2 }
     *     
     */
    public ChartMeasureType2 getV2DefaultChartMeasure() {
        return v2DefaultChartMeasure;
    }

    /**
     * Sets the value of the v2DefaultChartMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartMeasureType2 }
     *     
     */
    public void setV2DefaultChartMeasure(ChartMeasureType2 value) {
        this.v2DefaultChartMeasure = value;
    }

    /**
     * Gets the value of the v2ChartTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ChartText2 }
     *     
     */
    public ChartText2 getV2ChartTitle() {
        return v2ChartTitle;
    }

    /**
     * Sets the value of the v2ChartTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartText2 }
     *     
     */
    public void setV2ChartTitle(ChartText2 value) {
        this.v2ChartTitle = value;
    }

    /**
     * Gets the value of the v2ChartSubTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ChartText2 }
     *     
     */
    public ChartText2 getV2ChartSubTitle() {
        return v2ChartSubTitle;
    }

    /**
     * Sets the value of the v2ChartSubTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartText2 }
     *     
     */
    public void setV2ChartSubTitle(ChartText2 value) {
        this.v2ChartSubTitle = value;
    }

    /**
     * Gets the value of the v2ChartFooter property.
     * 
     * @return
     *     possible object is
     *     {@link ChartText2 }
     *     
     */
    public ChartText2 getV2ChartFooter() {
        return v2ChartFooter;
    }

    /**
     * Sets the value of the v2ChartFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartText2 }
     *     
     */
    public void setV2ChartFooter(ChartText2 value) {
        this.v2ChartFooter = value;
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
     * Used to style the chart body or plot area.  In CGS lingo, this is the chart.  STYLE:  Only the following styles are allowed on the chartBody: background color, background image, generated background.
     * 
     * @return
     *     possible object is
     *     {@link V2ChartBody }
     *     
     */
    public V2ChartBody getV2ChartBody() {
        return v2ChartBody;
    }

    /**
     * Sets the value of the v2ChartBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2ChartBody }
     *     
     */
    public void setV2ChartBody(V2ChartBody value) {
        this.v2ChartBody = value;
    }

    /**
     * Gets the value of the v2Notes property.
     * 
     * @return
     *     possible object is
     *     {@link V2Notes }
     *     
     */
    public V2Notes getV2Notes() {
        return v2Notes;
    }

    /**
     * Sets the value of the v2Notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2Notes }
     *     
     */
    public void setV2Notes(V2Notes value) {
        this.v2Notes = value;
    }

    /**
     * Gets the value of the reportDrills property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDrills }
     *     
     */
    public ReportDrills getReportDrills() {
        return reportDrills;
    }

    /**
     * Sets the value of the reportDrills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDrills }
     *     
     */
    public void setReportDrills(ReportDrills value) {
        this.reportDrills = value;
    }

    /**
     * Gets the value of the v2DropShadow property.
     * 
     * @return
     *     possible object is
     *     {@link V2DropShadow }
     *     
     */
    public V2DropShadow getV2DropShadow() {
        return v2DropShadow;
    }

    /**
     * Sets the value of the v2DropShadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2DropShadow }
     *     
     */
    public void setV2DropShadow(V2DropShadow value) {
        this.v2DropShadow = value;
    }

    /**
     * Gets the value of the chartSuppress property.
     * 
     * @return
     *     possible object is
     *     {@link ChartSuppress }
     *     
     */
    public ChartSuppress getChartSuppress() {
        return chartSuppress;
    }

    /**
     * Sets the value of the chartSuppress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartSuppress }
     *     
     */
    public void setChartSuppress(ChartSuppress value) {
        this.chartSuppress = value;
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
     * Gets the value of the alternateText property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedTextType }
     *     
     */
    public LocalizedTextType getAlternateText() {
        return alternateText;
    }

    /**
     * Sets the value of the alternateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedTextType }
     *     
     */
    public void setAlternateText(LocalizedTextType value) {
        this.alternateText = value;
    }

    /**
     * Gets the value of the v2Matrix property.
     * 
     * @return
     *     possible object is
     *     {@link V2Matrix }
     *     
     */
    public V2Matrix getV2Matrix() {
        return v2Matrix;
    }

    /**
     * Sets the value of the v2Matrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2Matrix }
     *     
     */
    public void setV2Matrix(V2Matrix value) {
        this.v2Matrix = value;
    }

    /**
     * Tooltips are defined for the entire chart.
     * 
     * @return
     *     possible object is
     *     {@link V2CombinationTypeTooltips }
     *     
     */
    public V2CombinationTypeTooltips getV2CombinationTypeTooltips() {
        return v2CombinationTypeTooltips;
    }

    /**
     * Sets the value of the v2CombinationTypeTooltips property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2CombinationTypeTooltips }
     *     
     */
    public void setV2CombinationTypeTooltips(V2CombinationTypeTooltips value) {
        this.v2CombinationTypeTooltips = value;
    }

    /**
     * Gets the value of the v2PlotArea property.
     * 
     * @return
     *     possible object is
     *     {@link V2PlotArea }
     *     
     */
    public V2PlotArea getV2PlotArea() {
        return v2PlotArea;
    }

    /**
     * Sets the value of the v2PlotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2PlotArea }
     *     
     */
    public void setV2PlotArea(V2PlotArea value) {
        this.v2PlotArea = value;
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
     * Gets the value of the appChartProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AppChartProperties }
     *     
     */
    public AppChartProperties getAppChartProperties() {
        return appChartProperties;
    }

    /**
     * Sets the value of the appChartProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppChartProperties }
     *     
     */
    public void setAppChartProperties(AppChartProperties value) {
        this.appChartProperties = value;
    }

    /**
     * Gets the value of the v2ChartTextStyle property.
     * 
     * @return
     *     possible object is
     *     {@link V2ChartTextStyle }
     *     
     */
    public V2ChartTextStyle getV2ChartTextStyle() {
        return v2ChartTextStyle;
    }

    /**
     * Sets the value of the v2ChartTextStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2ChartTextStyle }
     *     
     */
    public void setV2ChartTextStyle(V2ChartTextStyle value) {
        this.v2ChartTextStyle = value;
    }

    /**
     * Gets the value of the matchSeriesColor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMatchSeriesColor() {
        if (matchSeriesColor == null) {
            return false;
        } else {
            return matchSeriesColor;
        }
    }

    /**
     * Sets the value of the matchSeriesColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchSeriesColor(Boolean value) {
        this.matchSeriesColor = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepth() {
        if (depth == null) {
            return new BigInteger("0");
        } else {
            return depth;
        }
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepth(BigInteger value) {
        this.depth = value;
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
     * Gets the value of the maxHotspots property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxHotspots() {
        return maxHotspots;
    }

    /**
     * Sets the value of the maxHotspots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxHotspots(BigInteger value) {
        this.maxHotspots = value;
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
     * Gets the value of the materialEffects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialEffects() {
        if (materialEffects == null) {
            return "none";
        } else {
            return materialEffects;
        }
    }

    /**
     * Sets the value of the materialEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialEffects(String value) {
        this.materialEffects = value;
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
            return "vertical";
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
