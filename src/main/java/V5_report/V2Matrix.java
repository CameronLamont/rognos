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
 *         &lt;element name="v2_matrixRows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="v2_matrixRowLabels" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *                           &lt;/all>
 *                           &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TextTruncationAttributes2"/>
 *                           &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AutoFontSizing2"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisTitle" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MatrixLabelsLocation"/>
 *                 &lt;attribute name="matrixLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="v2_matrixColumns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="v2_matrixColumnLabels" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
 *                           &lt;/all>
 *                           &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TextTruncationAttributes2"/>
 *                           &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AutoFontSizing2"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisTitle" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MatrixLabelsLocation"/>
 *                 &lt;attribute name="matrixLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="wrapCells" default="wrapIfPossible">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="noWrap"/>
 *             &lt;enumeration value="wrapIfPossible"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="showAxesInMatrix" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlRootElement(name = "v2_matrix")
public class V2Matrix {

    @XmlElement(name = "v2_matrixRows")
    protected V2Matrix.V2MatrixRows v2MatrixRows;
    @XmlElement(name = "v2_matrixColumns")
    protected V2Matrix.V2MatrixColumns v2MatrixColumns;
    @XmlAttribute(name = "wrapCells")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrapCells;
    @XmlAttribute(name = "showAxesInMatrix")
    protected Boolean showAxesInMatrix;

    /**
     * Gets the value of the v2MatrixRows property.
     * 
     * @return
     *     possible object is
     *     {@link V2Matrix.V2MatrixRows }
     *     
     */
    public V2Matrix.V2MatrixRows getV2MatrixRows() {
        return v2MatrixRows;
    }

    /**
     * Sets the value of the v2MatrixRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2Matrix.V2MatrixRows }
     *     
     */
    public void setV2MatrixRows(V2Matrix.V2MatrixRows value) {
        this.v2MatrixRows = value;
    }

    /**
     * Gets the value of the v2MatrixColumns property.
     * 
     * @return
     *     possible object is
     *     {@link V2Matrix.V2MatrixColumns }
     *     
     */
    public V2Matrix.V2MatrixColumns getV2MatrixColumns() {
        return v2MatrixColumns;
    }

    /**
     * Sets the value of the v2MatrixColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link V2Matrix.V2MatrixColumns }
     *     
     */
    public void setV2MatrixColumns(V2Matrix.V2MatrixColumns value) {
        this.v2MatrixColumns = value;
    }

    /**
     * Gets the value of the wrapCells property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapCells() {
        if (wrapCells == null) {
            return "wrapIfPossible";
        } else {
            return wrapCells;
        }
    }

    /**
     * Sets the value of the wrapCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapCells(String value) {
        this.wrapCells = value;
    }

    /**
     * Gets the value of the showAxesInMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowAxesInMatrix() {
        if (showAxesInMatrix == null) {
            return false;
        } else {
            return showAxesInMatrix;
        }
    }

    /**
     * Sets the value of the showAxesInMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAxesInMatrix(Boolean value) {
        this.showAxesInMatrix = value;
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
     *         &lt;element name="v2_matrixColumnLabels" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
     *                 &lt;/all>
     *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TextTruncationAttributes2"/>
     *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AutoFontSizing2"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisTitle" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MatrixLabelsLocation"/>
     *       &lt;attribute name="matrixLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
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
    public static class V2MatrixColumns {

        @XmlElement(name = "v2_matrixColumnLabels")
        protected V2Matrix.V2MatrixColumns.V2MatrixColumnLabels v2MatrixColumnLabels;
        @XmlElement(name = "v2_axisTitle")
        protected V2AxisTitle v2AxisTitle;
        @XmlAttribute(name = "matrixLevels")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger matrixLevels;
        @XmlAttribute(name = "matrixLabelsLocation")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String matrixLabelsLocation;

        /**
         * Gets the value of the v2MatrixColumnLabels property.
         * 
         * @return
         *     possible object is
         *     {@link V2Matrix.V2MatrixColumns.V2MatrixColumnLabels }
         *     
         */
        public V2Matrix.V2MatrixColumns.V2MatrixColumnLabels getV2MatrixColumnLabels() {
            return v2MatrixColumnLabels;
        }

        /**
         * Sets the value of the v2MatrixColumnLabels property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2Matrix.V2MatrixColumns.V2MatrixColumnLabels }
         *     
         */
        public void setV2MatrixColumnLabels(V2Matrix.V2MatrixColumns.V2MatrixColumnLabels value) {
            this.v2MatrixColumnLabels = value;
        }

        /**
         * Gets the value of the v2AxisTitle property.
         * 
         * @return
         *     possible object is
         *     {@link V2AxisTitle }
         *     
         */
        public V2AxisTitle getV2AxisTitle() {
            return v2AxisTitle;
        }

        /**
         * Sets the value of the v2AxisTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2AxisTitle }
         *     
         */
        public void setV2AxisTitle(V2AxisTitle value) {
            this.v2AxisTitle = value;
        }

        /**
         * Gets the value of the matrixLevels property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMatrixLevels() {
            if (matrixLevels == null) {
                return new BigInteger("1");
            } else {
                return matrixLevels;
            }
        }

        /**
         * Sets the value of the matrixLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMatrixLevels(BigInteger value) {
            this.matrixLevels = value;
        }

        /**
         * Gets the value of the matrixLabelsLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatrixLabelsLocation() {
            if (matrixLabelsLocation == null) {
                return "primary";
            } else {
                return matrixLabelsLocation;
            }
        }

        /**
         * Sets the value of the matrixLabelsLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatrixLabelsLocation(String value) {
            this.matrixLabelsLocation = value;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
         *       &lt;/all>
         *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TextTruncationAttributes2"/>
         *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AutoFontSizing2"/>
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
        public static class V2MatrixColumnLabels {

            protected Style style;
            @XmlAttribute(name = "autoTruncation")
            protected Boolean autoTruncation;
            @XmlAttribute(name = "truncationText")
            protected String truncationText;
            @XmlAttribute(name = "manualTruncationMaxChars")
            @XmlSchemaType(name = "unsignedInt")
            protected Long manualTruncationMaxChars;
            @XmlAttribute(name = "autoFontSizing")
            protected Boolean autoFontSizing;

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
             * Gets the value of the autoTruncation property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isAutoTruncation() {
                if (autoTruncation == null) {
                    return true;
                } else {
                    return autoTruncation;
                }
            }

            /**
             * Sets the value of the autoTruncation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAutoTruncation(Boolean value) {
                this.autoTruncation = value;
            }

            /**
             * Gets the value of the truncationText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTruncationText() {
                if (truncationText == null) {
                    return "...";
                } else {
                    return truncationText;
                }
            }

            /**
             * Sets the value of the truncationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTruncationText(String value) {
                this.truncationText = value;
            }

            /**
             * Gets the value of the manualTruncationMaxChars property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getManualTruncationMaxChars() {
                if (manualTruncationMaxChars == null) {
                    return  50L;
                } else {
                    return manualTruncationMaxChars;
                }
            }

            /**
             * Sets the value of the manualTruncationMaxChars property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setManualTruncationMaxChars(Long value) {
                this.manualTruncationMaxChars = value;
            }

            /**
             * Gets the value of the autoFontSizing property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isAutoFontSizing() {
                if (autoFontSizing == null) {
                    return false;
                } else {
                    return autoFontSizing;
                }
            }

            /**
             * Sets the value of the autoFontSizing property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAutoFontSizing(Boolean value) {
                this.autoFontSizing = value;
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
     *         &lt;element name="v2_matrixRowLabels" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
     *                 &lt;/all>
     *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TextTruncationAttributes2"/>
     *                 &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AutoFontSizing2"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}v2_axisTitle" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}MatrixLabelsLocation"/>
     *       &lt;attribute name="matrixLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
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
    public static class V2MatrixRows {

        @XmlElement(name = "v2_matrixRowLabels")
        protected V2Matrix.V2MatrixRows.V2MatrixRowLabels v2MatrixRowLabels;
        @XmlElement(name = "v2_axisTitle")
        protected V2AxisTitle v2AxisTitle;
        @XmlAttribute(name = "matrixLevels")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger matrixLevels;
        @XmlAttribute(name = "matrixLabelsLocation")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String matrixLabelsLocation;

        /**
         * Gets the value of the v2MatrixRowLabels property.
         * 
         * @return
         *     possible object is
         *     {@link V2Matrix.V2MatrixRows.V2MatrixRowLabels }
         *     
         */
        public V2Matrix.V2MatrixRows.V2MatrixRowLabels getV2MatrixRowLabels() {
            return v2MatrixRowLabels;
        }

        /**
         * Sets the value of the v2MatrixRowLabels property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2Matrix.V2MatrixRows.V2MatrixRowLabels }
         *     
         */
        public void setV2MatrixRowLabels(V2Matrix.V2MatrixRows.V2MatrixRowLabels value) {
            this.v2MatrixRowLabels = value;
        }

        /**
         * Gets the value of the v2AxisTitle property.
         * 
         * @return
         *     possible object is
         *     {@link V2AxisTitle }
         *     
         */
        public V2AxisTitle getV2AxisTitle() {
            return v2AxisTitle;
        }

        /**
         * Sets the value of the v2AxisTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link V2AxisTitle }
         *     
         */
        public void setV2AxisTitle(V2AxisTitle value) {
            this.v2AxisTitle = value;
        }

        /**
         * Gets the value of the matrixLevels property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMatrixLevels() {
            if (matrixLevels == null) {
                return new BigInteger("1");
            } else {
                return matrixLevels;
            }
        }

        /**
         * Sets the value of the matrixLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMatrixLevels(BigInteger value) {
            this.matrixLevels = value;
        }

        /**
         * Gets the value of the matrixLabelsLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatrixLabelsLocation() {
            if (matrixLabelsLocation == null) {
                return "primary";
            } else {
                return matrixLabelsLocation;
            }
        }

        /**
         * Sets the value of the matrixLabelsLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatrixLabelsLocation(String value) {
            this.matrixLabelsLocation = value;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}style" minOccurs="0"/>
         *       &lt;/all>
         *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}TextTruncationAttributes2"/>
         *       &lt;attGroup ref="{http://developer.cognos.com/schemas/report/11.0/}AutoFontSizing2"/>
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
        public static class V2MatrixRowLabels {

            protected Style style;
            @XmlAttribute(name = "autoTruncation")
            protected Boolean autoTruncation;
            @XmlAttribute(name = "truncationText")
            protected String truncationText;
            @XmlAttribute(name = "manualTruncationMaxChars")
            @XmlSchemaType(name = "unsignedInt")
            protected Long manualTruncationMaxChars;
            @XmlAttribute(name = "autoFontSizing")
            protected Boolean autoFontSizing;

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
             * Gets the value of the autoTruncation property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isAutoTruncation() {
                if (autoTruncation == null) {
                    return true;
                } else {
                    return autoTruncation;
                }
            }

            /**
             * Sets the value of the autoTruncation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAutoTruncation(Boolean value) {
                this.autoTruncation = value;
            }

            /**
             * Gets the value of the truncationText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTruncationText() {
                if (truncationText == null) {
                    return "...";
                } else {
                    return truncationText;
                }
            }

            /**
             * Sets the value of the truncationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTruncationText(String value) {
                this.truncationText = value;
            }

            /**
             * Gets the value of the manualTruncationMaxChars property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getManualTruncationMaxChars() {
                if (manualTruncationMaxChars == null) {
                    return  50L;
                } else {
                    return manualTruncationMaxChars;
                }
            }

            /**
             * Sets the value of the manualTruncationMaxChars property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setManualTruncationMaxChars(Long value) {
                this.manualTruncationMaxChars = value;
            }

            /**
             * Gets the value of the autoFontSizing property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isAutoFontSizing() {
                if (autoFontSizing == null) {
                    return false;
                } else {
                    return autoFontSizing;
                }
            }

            /**
             * Sets the value of the autoFontSizing property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAutoFontSizing(Boolean value) {
                this.autoFontSizing = value;
            }

        }

    }

}
