package com.jwebmp.plugins.c3;

import com.jwebmp.core.base.references.CSSReference;

/**
 * References for all the graphing Java Scripts
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum C3CSSReferencePool
{

	C3GraphCore(new CSSReference("c3Graph", 1.08, "bower_components/c3/c3.css", "https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.css"));

	private final CSSReference reference;

	C3CSSReferencePool(CSSReference reference)
	{
		this.reference = reference;

	}

	public CSSReference getReference()
	{
		return reference;
	}

}
