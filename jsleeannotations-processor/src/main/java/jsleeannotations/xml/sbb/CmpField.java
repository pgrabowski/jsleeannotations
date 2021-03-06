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
// Generated on: 2015.01.26 at 10:24:46 PM CET 
//


package jsleeannotations.xml.sbb;

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
    "cmpFieldName",
    "sbbAliasRef"
})
@XmlRootElement(name = "cmp-field")
public class CmpField {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "cmp-field-name", required = true)
    protected CmpFieldName cmpFieldName;
    @XmlElement(name = "sbb-alias-ref")
    protected SbbAliasRef sbbAliasRef;

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
     * Gets the value of the cmpFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link CmpFieldName }
     *     
     */
    public CmpFieldName getCmpFieldName() {
        return cmpFieldName;
    }

    /**
     * Sets the value of the cmpFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmpFieldName }
     *     
     */
    public void setCmpFieldName(CmpFieldName value) {
        this.cmpFieldName = value;
    }

    /**
     * Gets the value of the sbbAliasRef property.
     * 
     * @return
     *     possible object is
     *     {@link SbbAliasRef }
     *     
     */
    public SbbAliasRef getSbbAliasRef() {
        return sbbAliasRef;
    }

    /**
     * Sets the value of the sbbAliasRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbbAliasRef }
     *     
     */
    public void setSbbAliasRef(SbbAliasRef value) {
        this.sbbAliasRef = value;
    }

}
