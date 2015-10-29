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
// Generated on: 2015.01.26 at 10:32:37 PM CET 
//


package jsleeannotations.xml.profile;

import jsleeannotations.xml.common.EnvEntry;

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
    "profileSpecName",
    "profileSpecVendor",
    "profileSpecVersion",
    "libraryRef",
    "profileSpecRef",
    "collator",
    "profileClasses",
    "envEntry",
    "query",
    "profileHints"
})
@XmlRootElement(name = "profile-spec")
public class ProfileSpec {

    @XmlAttribute(name = "profile-read-only")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String profileReadOnly;
    @XmlAttribute(name = "profile-events-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String profileEventsEnabled;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "profile-spec-name", required = true)
    protected ProfileSpecName profileSpecName;
    @XmlElement(name = "profile-spec-vendor", required = true)
    protected ProfileSpecVendor profileSpecVendor;
    @XmlElement(name = "profile-spec-version", required = true)
    protected ProfileSpecVersion profileSpecVersion;
    @XmlElement(name = "library-ref")
    protected List<LibraryRef> libraryRef;
    @XmlElement(name = "profile-spec-ref")
    protected List<ProfileSpecRef> profileSpecRef;
    protected List<Collator> collator;
    @XmlElement(name = "profile-classes", required = true)
    protected ProfileClasses profileClasses;
    @XmlElement(name = "env-entry")
    protected List<EnvEntry> envEntry;
    protected List<Query> query;
    @XmlElement(name = "profile-hints")
    protected ProfileHints profileHints;

    /**
     * Gets the value of the profileReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileReadOnly() {
        if (profileReadOnly == null) {
            return "True";
        } else {
            return profileReadOnly;
        }
    }

    /**
     * Sets the value of the profileReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileReadOnly(String value) {
        this.profileReadOnly = value;
    }

    /**
     * Gets the value of the profileEventsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileEventsEnabled() {
        if (profileEventsEnabled == null) {
            return "True";
        } else {
            return profileEventsEnabled;
        }
    }

    /**
     * Sets the value of the profileEventsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileEventsEnabled(String value) {
        this.profileEventsEnabled = value;
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
     * Gets the value of the profileSpecName property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileSpecName }
     *     
     */
    public ProfileSpecName getProfileSpecName() {
        return profileSpecName;
    }

    /**
     * Sets the value of the profileSpecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileSpecName }
     *     
     */
    public void setProfileSpecName(ProfileSpecName value) {
        this.profileSpecName = value;
    }

    /**
     * Gets the value of the profileSpecVendor property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileSpecVendor }
     *     
     */
    public ProfileSpecVendor getProfileSpecVendor() {
        return profileSpecVendor;
    }

    /**
     * Sets the value of the profileSpecVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileSpecVendor }
     *     
     */
    public void setProfileSpecVendor(ProfileSpecVendor value) {
        this.profileSpecVendor = value;
    }

    /**
     * Gets the value of the profileSpecVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileSpecVersion }
     *     
     */
    public ProfileSpecVersion getProfileSpecVersion() {
        return profileSpecVersion;
    }

    /**
     * Sets the value of the profileSpecVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileSpecVersion }
     *     
     */
    public void setProfileSpecVersion(ProfileSpecVersion value) {
        this.profileSpecVersion = value;
    }

    /**
     * Gets the value of the libraryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryRef }
     * 
     * 
     */
    public List<LibraryRef> getLibraryRef() {
        if (libraryRef == null) {
            libraryRef = new ArrayList<LibraryRef>();
        }
        return this.libraryRef;
    }

    /**
     * Gets the value of the profileSpecRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileSpecRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileSpecRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileSpecRef }
     * 
     * 
     */
    public List<ProfileSpecRef> getProfileSpecRef() {
        if (profileSpecRef == null) {
            profileSpecRef = new ArrayList<ProfileSpecRef>();
        }
        return this.profileSpecRef;
    }

    /**
     * Gets the value of the collator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collator }
     * 
     * 
     */
    public List<Collator> getCollator() {
        if (collator == null) {
            collator = new ArrayList<Collator>();
        }
        return this.collator;
    }

    /**
     * Gets the value of the profileClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileClasses }
     *     
     */
    public ProfileClasses getProfileClasses() {
        return profileClasses;
    }

    /**
     * Sets the value of the profileClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileClasses }
     *     
     */
    public void setProfileClasses(ProfileClasses value) {
        this.profileClasses = value;
    }

    /**
     * Gets the value of the envEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the envEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvEntry }
     * 
     * 
     */
    public List<EnvEntry> getEnvEntry() {
        if (envEntry == null) {
            envEntry = new ArrayList<EnvEntry>();
        }
        return this.envEntry;
    }

    /**
     * Gets the value of the query property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Query }
     * 
     * 
     */
    public List<Query> getQuery() {
        if (query == null) {
            query = new ArrayList<Query>();
        }
        return this.query;
    }

    /**
     * Gets the value of the profileHints property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileHints }
     *     
     */
    public ProfileHints getProfileHints() {
        return profileHints;
    }

    /**
     * Sets the value of the profileHints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileHints }
     *     
     */
    public void setProfileHints(ProfileHints value) {
        this.profileHints = value;
    }

}