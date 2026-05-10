package com.jwebmp.plugins.c3;

import com.jwebmp.core.base.references.JavascriptReference;

/**
 * References for all the graphing Java Scripts
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum C3JavascriptReferencePool
{

	/**
	 * The basic core for the graphing system
	 */
	C3GraphCore(new JavascriptReference("C3", 0.410, "bower_components/c3/c3.js", "https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.js", 15)),
	;
	private final JavascriptReference reference;

	C3JavascriptReferencePool(JavascriptReference reference)
	{
		this.reference = reference;

	}

	public JavascriptReference getReference()
	{
		return reference;
	}

}
