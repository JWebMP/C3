package com.jwebmp.plugins.c3.options.data;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public enum C3DataOrderOptions
{
	Asc,
	Desc;

	@Override
	@JsonValue
	public String toString()
	{
		return name().toLowerCase();
	}
}
