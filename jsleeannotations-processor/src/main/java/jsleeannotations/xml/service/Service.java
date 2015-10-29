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
// Generated on: 2015.01.26 at 10:32:52 PM CET 
//


package jsleeannotations.xml.service;

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
    "serviceName",
    "serviceVendor",
    "serviceVersion",
    "rootSbb",
    "defaultPriority",
    "addressProfileTable"
})
@XmlRootElement(name = "service")
public class Service {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "service-name", required = true)
    protected ServiceName serviceName;
    @XmlElement(name = "service-vendor", required = true)
    protected ServiceVendor serviceVendor;
    @XmlElement(name = "service-version", required = true)
    protected ServiceVersion serviceVersion;
    @XmlElement(name = "root-sbb", required = true)
    protected RootSbb rootSbb;
    @XmlElement(name = "default-priority", required = true)
    protected DefaultPriority defaultPriority;
    @XmlElement(name = "address-profile-table")
    protected AddressProfileTable addressProfileTable;

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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceName }
     *     
     */
    public ServiceName getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceName }
     *     
     */
    public void setServiceName(ServiceName value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceVendor property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVendor }
     *     
     */
    public ServiceVendor getServiceVendor() {
        return serviceVendor;
    }

    /**
     * Sets the value of the serviceVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVendor }
     *     
     */
    public void setServiceVendor(ServiceVendor value) {
        this.serviceVendor = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVersion }
     *     
     */
    public ServiceVersion getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVersion }
     *     
     */
    public void setServiceVersion(ServiceVersion value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the rootSbb property.
     * 
     * @return
     *     possible object is
     *     {@link RootSbb }
     *     
     */
    public RootSbb getRootSbb() {
        return rootSbb;
    }

    /**
     * Sets the value of the rootSbb property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootSbb }
     *     
     */
    public void setRootSbb(RootSbb value) {
        this.rootSbb = value;
    }

    /**
     * Gets the value of the defaultPriority property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultPriority }
     *     
     */
    public DefaultPriority getDefaultPriority() {
        return defaultPriority;
    }

    /**
     * Sets the value of the defaultPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultPriority }
     *     
     */
    public void setDefaultPriority(DefaultPriority value) {
        this.defaultPriority = value;
    }

    /**
     * Gets the value of the addressProfileTable property.
     * 
     * @return
     *     possible object is
     *     {@link AddressProfileTable }
     *     
     */
    public AddressProfileTable getAddressProfileTable() {
        return addressProfileTable;
    }

    /**
     * Sets the value of the addressProfileTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressProfileTable }
     *     
     */
    public void setAddressProfileTable(AddressProfileTable value) {
        this.addressProfileTable = value;
    }

}
