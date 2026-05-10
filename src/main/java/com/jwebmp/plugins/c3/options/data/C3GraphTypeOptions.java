package com.jwebmp.plugins.c3.options.data;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public enum C3GraphTypeOptions
{

	Line,
	Spline,
	Step,
	Area,
	Area_Spline,
	Area_Step,
	Bar,
	Scatter,
	Pie,
	Donut,
	Gauge,
	;

	@Override
	public String toString()
	{
		return name().replace(CHAR_UNDERSCORE, CHAR_DASH)
		             .toLowerCase();
	}
}
