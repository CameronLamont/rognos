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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="dimensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dimension" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levels" minOccurs="0"/>
 *                             &lt;element name="hierarchies" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;element name="levelHierarchy">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levelRef" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="memberHierarchy">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence minOccurs="0">
 *                                                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}calculatedMembers" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="factList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fact" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "dimensionInfo")
public class DimensionInfo {

    protected DimensionInfo.Dimensions dimensions;
    protected DimensionInfo.FactList factList;

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionInfo.Dimensions }
     *     
     */
    public DimensionInfo.Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionInfo.Dimensions }
     *     
     */
    public void setDimensions(DimensionInfo.Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the factList property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionInfo.FactList }
     *     
     */
    public DimensionInfo.FactList getFactList() {
        return factList;
    }

    /**
     * Sets the value of the factList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionInfo.FactList }
     *     
     */
    public void setFactList(DimensionInfo.FactList value) {
        this.factList = value;
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
     *         &lt;element name="dimension" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levels" minOccurs="0"/>
     *                   &lt;element name="hierarchies" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                               &lt;element name="levelHierarchy">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levelRef" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="memberHierarchy">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence minOccurs="0">
     *                                         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}calculatedMembers" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "dimension"
    })
    public static class Dimensions {

        @XmlElement(required = true)
        protected List<DimensionInfo.Dimensions.Dimension> dimension;

        /**
         * Gets the value of the dimension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dimension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDimension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DimensionInfo.Dimensions.Dimension }
         * 
         * 
         */
        public List<DimensionInfo.Dimensions.Dimension> getDimension() {
            if (dimension == null) {
                dimension = new ArrayList<DimensionInfo.Dimensions.Dimension>();
            }
            return this.dimension;
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
         *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levels" minOccurs="0"/>
         *         &lt;element name="hierarchies" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
         *                     &lt;element name="levelHierarchy">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levelRef" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;/sequence>
         *                             &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="memberHierarchy">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence minOccurs="0">
         *                               &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}calculatedMembers" minOccurs="0"/>
         *                             &lt;/sequence>
         *                             &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Dimension {

            protected Levels levels;
            protected DimensionInfo.Dimensions.Dimension.Hierarchies hierarchies;
            @XmlAttribute(name = "name", required = true)
            protected String name;

            /**
             * Gets the value of the levels property.
             * 
             * @return
             *     possible object is
             *     {@link Levels }
             *     
             */
            public Levels getLevels() {
                return levels;
            }

            /**
             * Sets the value of the levels property.
             * 
             * @param value
             *     allowed object is
             *     {@link Levels }
             *     
             */
            public void setLevels(Levels value) {
                this.levels = value;
            }

            /**
             * Gets the value of the hierarchies property.
             * 
             * @return
             *     possible object is
             *     {@link DimensionInfo.Dimensions.Dimension.Hierarchies }
             *     
             */
            public DimensionInfo.Dimensions.Dimension.Hierarchies getHierarchies() {
                return hierarchies;
            }

            /**
             * Sets the value of the hierarchies property.
             * 
             * @param value
             *     allowed object is
             *     {@link DimensionInfo.Dimensions.Dimension.Hierarchies }
             *     
             */
            public void setHierarchies(DimensionInfo.Dimensions.Dimension.Hierarchies value) {
                this.hierarchies = value;
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
             *           &lt;element name="levelHierarchy">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levelRef" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;/sequence>
             *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="memberHierarchy">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence minOccurs="0">
             *                     &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}calculatedMembers" minOccurs="0"/>
             *                   &lt;/sequence>
             *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
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
                "levelHierarchyOrMemberHierarchy"
            })
            public static class Hierarchies {

                @XmlElements({
                    @XmlElement(name = "levelHierarchy", type = DimensionInfo.Dimensions.Dimension.Hierarchies.LevelHierarchy.class),
                    @XmlElement(name = "memberHierarchy", type = DimensionInfo.Dimensions.Dimension.Hierarchies.MemberHierarchy.class)
                })
                protected List<Object> levelHierarchyOrMemberHierarchy;

                /**
                 * Gets the value of the levelHierarchyOrMemberHierarchy property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the levelHierarchyOrMemberHierarchy property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLevelHierarchyOrMemberHierarchy().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DimensionInfo.Dimensions.Dimension.Hierarchies.LevelHierarchy }
                 * {@link DimensionInfo.Dimensions.Dimension.Hierarchies.MemberHierarchy }
                 * 
                 * 
                 */
                public List<Object> getLevelHierarchyOrMemberHierarchy() {
                    if (levelHierarchyOrMemberHierarchy == null) {
                        levelHierarchyOrMemberHierarchy = new ArrayList<Object>();
                    }
                    return this.levelHierarchyOrMemberHierarchy;
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
                 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}levelRef" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "levelRef"
                })
                public static class LevelHierarchy {

                    protected List<LevelRef> levelRef;
                    @XmlAttribute(name = "name", required = true)
                    protected String name;

                    /**
                     * Gets the value of the levelRef property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the levelRef property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLevelRef().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link LevelRef }
                     * 
                     * 
                     */
                    public List<LevelRef> getLevelRef() {
                        if (levelRef == null) {
                            levelRef = new ArrayList<LevelRef>();
                        }
                        return this.levelRef;
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
                 *       &lt;sequence minOccurs="0">
                 *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}calculatedMembers" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "calculatedMembers"
                })
                public static class MemberHierarchy {

                    protected CalculatedMembers calculatedMembers;
                    @XmlAttribute(name = "name", required = true)
                    protected String name;

                    /**
                     * Gets the value of the calculatedMembers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CalculatedMembers }
                     *     
                     */
                    public CalculatedMembers getCalculatedMembers() {
                        return calculatedMembers;
                    }

                    /**
                     * Sets the value of the calculatedMembers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CalculatedMembers }
                     *     
                     */
                    public void setCalculatedMembers(CalculatedMembers value) {
                        this.calculatedMembers = value;
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

                }

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
     *       &lt;sequence>
     *         &lt;element name="fact" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "fact"
    })
    public static class FactList {

        @XmlElement(required = true)
        protected List<DimensionInfo.FactList.Fact> fact;

        /**
         * Gets the value of the fact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DimensionInfo.FactList.Fact }
         * 
         * 
         */
        public List<DimensionInfo.FactList.Fact> getFact() {
            if (fact == null) {
                fact = new ArrayList<DimensionInfo.FactList.Fact>();
            }
            return this.fact;
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
        @XmlType(name = "")
        public static class Fact {

            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "refDataItem", required = true)
            protected String refDataItem;

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

        }

    }

}
