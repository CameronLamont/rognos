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
 *       &lt;sequence>
 *         &lt;element name="listRow" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="rowCells">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rowCell" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}GenericContainerSubElementType">
 *                                     &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *                                     &lt;attribute name="tableHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}rowCellsStyle" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
 *                   &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appListRowProperties" minOccurs="0"/>
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
    "listRow"
})
@XmlRootElement(name = "listRows")
public class ListRows {

    @XmlElement(required = true)
    protected List<ListRows.ListRow> listRow;

    /**
     * Gets the value of the listRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListRows.ListRow }
     * 
     * 
     */
    public List<ListRows.ListRow> getListRow() {
        if (listRow == null) {
            listRow = new ArrayList<ListRows.ListRow>();
        }
        return this.listRow;
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
     *         &lt;element name="rowCells">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rowCell" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}GenericContainerSubElementType">
     *                           &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
     *                           &lt;attribute name="tableHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}rowCellsStyle" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}XMLAttributes" minOccurs="0"/>
     *         &lt;element ref="{http://developer.cognos.com/schemas/report/11.0/}appListRowProperties" minOccurs="0"/>
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
    public static class ListRow {

        @XmlElement(required = true)
        protected ListRows.ListRow.RowCells rowCells;
        protected GenericLayoutStyleType rowCellsStyle;
        @XmlElement(name = "XMLAttributes")
        protected XMLAttributes xmlAttributes;
        protected AppListRowProperties appListRowProperties;

        /**
         * Gets the value of the rowCells property.
         * 
         * @return
         *     possible object is
         *     {@link ListRows.ListRow.RowCells }
         *     
         */
        public ListRows.ListRow.RowCells getRowCells() {
            return rowCells;
        }

        /**
         * Sets the value of the rowCells property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListRows.ListRow.RowCells }
         *     
         */
        public void setRowCells(ListRows.ListRow.RowCells value) {
            this.rowCells = value;
        }

        /**
         * Gets the value of the rowCellsStyle property.
         * 
         * @return
         *     possible object is
         *     {@link GenericLayoutStyleType }
         *     
         */
        public GenericLayoutStyleType getRowCellsStyle() {
            return rowCellsStyle;
        }

        /**
         * Sets the value of the rowCellsStyle property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenericLayoutStyleType }
         *     
         */
        public void setRowCellsStyle(GenericLayoutStyleType value) {
            this.rowCellsStyle = value;
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
         * Gets the value of the appListRowProperties property.
         * 
         * @return
         *     possible object is
         *     {@link AppListRowProperties }
         *     
         */
        public AppListRowProperties getAppListRowProperties() {
            return appListRowProperties;
        }

        /**
         * Sets the value of the appListRowProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppListRowProperties }
         *     
         */
        public void setAppListRowProperties(AppListRowProperties value) {
            this.appListRowProperties = value;
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
         *         &lt;element name="rowCell" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}GenericContainerSubElementType">
         *                 &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
         *                 &lt;attribute name="tableHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *               &lt;/extension>
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
            "rowCell"
        })
        public static class RowCells {

            @XmlElement(required = true)
            protected List<ListRows.ListRow.RowCells.RowCell> rowCell;

            /**
             * Gets the value of the rowCell property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rowCell property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRowCell().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListRows.ListRow.RowCells.RowCell }
             * 
             * 
             */
            public List<ListRows.ListRow.RowCells.RowCell> getRowCell() {
                if (rowCell == null) {
                    rowCell = new ArrayList<ListRows.ListRow.RowCells.RowCell>();
                }
                return this.rowCell;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://developer.cognos.com/schemas/report/11.0/}GenericContainerSubElementType">
             *       &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
             *       &lt;attribute name="tableHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RowCell
                extends GenericContainerSubElementType
            {

                @XmlAttribute(name = "colSpan")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger colSpan;
                @XmlAttribute(name = "tableHeader")
                protected Boolean tableHeader;

                /**
                 * Gets the value of the colSpan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getColSpan() {
                    if (colSpan == null) {
                        return new BigInteger("1");
                    } else {
                        return colSpan;
                    }
                }

                /**
                 * Sets the value of the colSpan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setColSpan(BigInteger value) {
                    this.colSpan = value;
                }

                /**
                 * Gets the value of the tableHeader property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isTableHeader() {
                    if (tableHeader == null) {
                        return false;
                    } else {
                        return tableHeader;
                    }
                }

                /**
                 * Sets the value of the tableHeader property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setTableHeader(Boolean value) {
                    this.tableHeader = value;
                }

            }

        }

    }

}
