package com.jwebmp.plugins.c3.options.data;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public enum C3DataXAxis
{
	X1,
	X2;

	@JsonValue
	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}

}
