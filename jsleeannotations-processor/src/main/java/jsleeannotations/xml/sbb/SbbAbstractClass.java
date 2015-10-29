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

import java.util.ArrayList;
import java.util.List;
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
    "sbbAbstractClassName",
    "cmpField",
    "getChildRelationMethod",
    "getProfileCmpMethod"
})
@XmlRootElement(name = "sbb-abstract-class")
public class SbbAbstractClass {

    @XmlAttribute(name = "reentrant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reentrant;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "sbb-abstract-class-name", required = true)
    protected SbbAbstractClassName sbbAbstractClassName;
    @XmlElement(name = "cmp-field")
    protected List<CmpField> cmpField;
    @XmlElement(name = "get-child-relation-method")
    protected List<GetChildRelationMethod> getChildRelationMethod;
    @XmlElement(name = "get-profile-cmp-method")
    protected List<GetProfileCmpMethod> getProfileCmpMethod;

    /**
     * Gets the value of the reentrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReentrant() {
        if (reentrant == null) {
            return "False";
        } else {
            return reentrant;
        }
    }

    /**
     * Sets the value of the reentrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReentrant(String value) {
        this.reentrant = value;
    }

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
     * Gets the value of the sbbAbstractClassName property.
     * 
     * @return
     *     possible object is
     *     {@link SbbAbstractClassName }
     *     
     */
    public SbbAbstractClassName getSbbAbstractClassName() {
        return sbbAbstractClassName;
    }

    /**
     * Sets the value of the sbbAbstractClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbbAbstractClassName }
     *     
     */
    public void setSbbAbstractClassName(SbbAbstractClassName value) {
        this.sbbAbstractClassName = value;
    }

    /**
     * Gets the value of the cmpField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmpField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmpField }
     * 
     * 
     */
    public List<CmpField> getCmpField() {
        if (cmpField == null) {
            cmpField = new ArrayList<CmpField>();
        }
        return this.cmpField;
    }

    /**
     * Gets the value of the getChildRelationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getChildRelationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetChildRelationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetChildRelationMethod }
     * 
     * 
     */
    public List<GetChildRelationMethod> getGetChildRelationMethod() {
        if (getChildRelationMethod == null) {
            getChildRelationMethod = new ArrayList<GetChildRelationMethod>();
        }
        return this.getChildRelationMethod;
    }

    /**
     * Gets the value of the getProfileCmpMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getProfileCmpMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetProfileCmpMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetProfileCmpMethod }
     * 
     * 
     */
    public List<GetProfileCmpMethod> getGetProfileCmpMethod() {
        if (getProfileCmpMethod == null) {
            getProfileCmpMethod = new ArrayList<GetProfileCmpMethod>();
        }
        return this.getProfileCmpMethod;
    }

}
