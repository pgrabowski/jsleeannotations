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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
    "compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot"
})
@XmlRootElement(name = "and")
public class And {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElements({
        @XmlElement(name = "compare", type = Compare.class),
        @XmlElement(name = "range-match", type = RangeMatch.class),
        @XmlElement(name = "longest-prefix-match", type = LongestPrefixMatch.class),
        @XmlElement(name = "has-prefix", type = HasPrefix.class),
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "not", type = Not.class)
    })
    protected List<Object> compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot;

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
     * Gets the value of the compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compare }
     * {@link RangeMatch }
     * {@link LongestPrefixMatch }
     * {@link HasPrefix }
     * {@link And }
     * {@link Or }
     * {@link Not }
     * 
     * 
     */
    public List<Object> getCompareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot() {
        if (compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot == null) {
            compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot = new ArrayList<Object>();
        }
        return this.compareOrRangeMatchOrLongestPrefixMatchOrHasPrefixOrAndOrOrOrNot;
    }

}
