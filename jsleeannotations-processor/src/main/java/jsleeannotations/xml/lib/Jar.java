/*
 * JSLEE Annotations
 * Copyright (c) 2015 Piotr Grabowski, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.26 at 10:31:31 PM CET 
//


package jsleeannotations.xml.lib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "jarName",
    "securityPermissions"
})
@XmlRootElement(name = "jar")
public class Jar {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "jar-name", required = true)
    protected JarName jarName;
    @XmlElement(name = "security-permissions")
    protected SecurityPermissions securityPermissions;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the jarName property.
     * 
     * @return
     *     possible object is
     *     {@link JarName }
     *     
     */
    public JarName getJarName() {
        return jarName;
    }

    /**
     * Sets the value of the jarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JarName }
     *     
     */
    public void setJarName(JarName value) {
        this.jarName = value;
    }

    /**
     * Gets the value of the securityPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPermissions }
     *     
     */
    public SecurityPermissions getSecurityPermissions() {
        return securityPermissions;
    }

    /**
     * Sets the value of the securityPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPermissions }
     *     
     */
    public void setSecurityPermissions(SecurityPermissions value) {
        this.securityPermissions = value;
    }

}
