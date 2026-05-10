package com.jwebmp.plugins.c3.series;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Denotes a column header for C3 Data Objects
 *
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3DataColumnHeader
		extends JavaScriptPart<C3DataColumnHeader>

{

	private String name;

	/**
	 * Constructs a new column header with the given name
	 *
	 * @param name
	 */
	public C3DataColumnHeader(String name)
	{
		this.name = name;
	}

	/**
	 * Returns this column header's name
	 *
	 * @return
	 */
	@JsonValue
	@Override
	public String toString()
	{
		return getName();
	}

	/**
	 * Return the currently assigned name.
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets this columns currently assigned name
	 *
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
