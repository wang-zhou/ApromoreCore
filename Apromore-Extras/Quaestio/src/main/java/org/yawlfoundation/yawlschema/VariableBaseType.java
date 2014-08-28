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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for VariableBaseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VariableBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *             &lt;choice>
 *               &lt;sequence>
 *                 &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                 &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;element name="isUntyped" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableBaseType", propOrder = { "documentation", "name",
		"type", "namespace", "isUntyped", "element" })
@XmlSeeAlso({ VariableFactsType.class, OutputParameterFactsType.class,
		InputParameterFactsType.class })
public class VariableBaseType {

	protected String documentation;
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String name;
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String type;
	@XmlSchemaType(name = "anyURI")
	protected String namespace;
	protected Object isUntyped;
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String element;

	/**
	 * Gets the value of the documentation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * Sets the value of the documentation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocumentation(String value) {
		this.documentation = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the namespace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * Sets the value of the namespace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNamespace(String value) {
		this.namespace = value;
	}

	/**
	 * Gets the value of the isUntyped property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getIsUntyped() {
		return isUntyped;
	}

	/**
	 * Sets the value of the isUntyped property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setIsUntyped(Object value) {
		this.isUntyped = value;
	}

	/**
	 * Gets the value of the element property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getElement() {
		return element;
	}

	/**
	 * Sets the value of the element property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setElement(String value) {
		this.element = value;
	}

}
