//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.11.09 at 12:33:57 PM EST
//


package org.owasp.dependencycheck.jaxb.pom.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *          Contains the information needed for deploying websites.
 *
 *
 * <p>Java class for Site complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Site">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class Site {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String id;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String name;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String url;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setUrl(String value) {
        this.url = value;
    }

}
