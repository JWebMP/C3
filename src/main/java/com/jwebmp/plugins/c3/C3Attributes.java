package com.jwebmp.plugins.c3;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;

/**
 * @author GedMarc
 */
public enum C3Attributes
		implements AttributeDefinitions
{
	Visibility;

	@Override
	public boolean isKeyword()
	{
		return false;
	}
}
