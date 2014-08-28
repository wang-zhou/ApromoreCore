/*
 * Copyright © 2009-2014 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.03 at 05:04:23 PM CET 
//

package org.yawlfoundation.yawlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for LayoutLocaleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutLocaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="country" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutLocaleType")
public class LayoutLocaleType {

	@XmlAttribute(required = true)
	protected String language;
	@XmlAttribute(required = true)
	protected String country;

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the value of the country property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountry(String value) {
		this.country = value;
	}

}
