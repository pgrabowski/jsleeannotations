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

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jsleeannotations.xml.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jsleeannotations.xml.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceName }
     * 
     */
    public ServiceName createServiceName() {
        return new ServiceName();
    }

    /**
     * Create an instance of {@link ServiceXml }
     * 
     */
    public ServiceXml createServiceXml() {
        return new ServiceXml();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link DefaultPriority }
     * 
     */
    public DefaultPriority createDefaultPriority() {
        return new DefaultPriority();
    }

    /**
     * Create an instance of {@link RootSbb }
     * 
     */
    public RootSbb createRootSbb() {
        return new RootSbb();
    }

    /**
     * Create an instance of {@link SbbName }
     * 
     */
    public SbbName createSbbName() {
        return new SbbName();
    }

    /**
     * Create an instance of {@link SbbVendor }
     * 
     */
    public SbbVendor createSbbVendor() {
        return new SbbVendor();
    }

    /**
     * Create an instance of {@link SbbVersion }
     * 
     */
    public SbbVersion createSbbVersion() {
        return new SbbVersion();
    }

    /**
     * Create an instance of {@link AddressProfileTable }
     * 
     */
    public AddressProfileTable createAddressProfileTable() {
        return new AddressProfileTable();
    }

    /**
     * Create an instance of {@link ServiceVendor }
     * 
     */
    public ServiceVendor createServiceVendor() {
        return new ServiceVendor();
    }

    /**
     * Create an instance of {@link ServiceVersion }
     * 
     */
    public ServiceVersion createServiceVersion() {
        return new ServiceVersion();
    }

}
