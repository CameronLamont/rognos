//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 01:59:17 PM AEDT 
//


package V5_report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineStyleType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineStyleType2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="dash"/>
 *     &lt;enumeration value="dot"/>
 *     &lt;enumeration value="dash_dot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineStyleType2")
@XmlEnum
public enum LineStyleType2 {

    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("dash")
    DASH("dash"),
    @XmlEnumValue("dot")
    DOT("dot"),
    @XmlEnumValue("dash_dot")
    DASH_DOT("dash_dot");
    private final String value;

    LineStyleType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineStyleType2 fromValue(String v) {
        for (LineStyleType2 c: LineStyleType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
