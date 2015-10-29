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
    "resourceAdaptorTypeRef",
    "activityContextInterfaceFactoryName",
    "resourceAdaptorEntityBinding"
})
@XmlRootElement(name = "resource-adaptor-type-binding")
public class ResourceAdaptorTypeBinding {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "resource-adaptor-type-ref", required = true)
    protected ResourceAdaptorTypeRef resourceAdaptorTypeRef;
    @XmlElement(name = "activity-context-interface-factory-name")
    protected ActivityContextInterfaceFactoryName activityContextInterfaceFactoryName;
    @XmlElement(name = "resource-adaptor-entity-binding")
    protected List<ResourceAdaptorEntityBinding> resourceAdaptorEntityBinding;

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
     * Gets the value of the resourceAdaptorTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorTypeRef }
     *     
     */
    public ResourceAdaptorTypeRef getResourceAdaptorTypeRef() {
        return resourceAdaptorTypeRef;
    }

    /**
     * Sets the value of the resourceAdaptorTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorTypeRef }
     *     
     */
    public void setResourceAdaptorTypeRef(ResourceAdaptorTypeRef value) {
        this.resourceAdaptorTypeRef = value;
    }

    /**
     * Gets the value of the activityContextInterfaceFactoryName property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityContextInterfaceFactoryName }
     *     
     */
    public ActivityContextInterfaceFactoryName getActivityContextInterfaceFactoryName() {
        return activityContextInterfaceFactoryName;
    }

    /**
     * Sets the value of the activityContextInterfaceFactoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityContextInterfaceFactoryName }
     *     
     */
    public void setActivityContextInterfaceFactoryName(ActivityContextInterfaceFactoryName value) {
        this.activityContextInterfaceFactoryName = value;
    }

    /**
     * Gets the value of the resourceAdaptorEntityBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAdaptorEntityBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAdaptorEntityBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAdaptorEntityBinding }
     * 
     * 
     */
    public List<ResourceAdaptorEntityBinding> getResourceAdaptorEntityBinding() {
        if (resourceAdaptorEntityBinding == null) {
            resourceAdaptorEntityBinding = new ArrayList<ResourceAdaptorEntityBinding>();
        }
        return this.resourceAdaptorEntityBinding;
    }

}