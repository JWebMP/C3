package com.jwebmp.plugins.c3.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3InteractionsOptions
		extends JavaScriptPart<C3InteractionsOptions>
{


	private Boolean enabled;

	public C3InteractionsOptions()
	{
		//Nothing Needed
	}

	/**
	 * Indicate if the chart should have interactions.
	 * <p>
	 * If false is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
	 *
	 * @return
	 */
	public Boolean getEnabled()
	{
		return enabled;
	}

	/**
	 * Indicate if the chart should have interactions.
	 * <p>
	 * If false is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
	 *
	 * @param enabled
	 */
	public void setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
	}

}
