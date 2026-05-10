package com.jwebmp.plugins.c3.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3TransitionOptions
		extends JavaScriptPart<C3TransitionOptions>
{


	private Integer duration;

	public C3TransitionOptions()
	{
		//Nothing Needed
	}

	/**
	 * Set duration of transition (in milliseconds) for chart animation.<p>
	 * Note:
	 * <p>
	 * <p>
	 * If 0 or null set, transition will be skipped. So, this makes initial rendering faster especially in case you have a lot of data.<p>
	 *
	 * @return
	 */
	public Integer getDuration()
	{
		return duration;
	}

	/**
	 * Set duration of transition (in milliseconds) for chart animation.<p>
	 * Note:
	 * <p>
	 * <p>
	 * If 0 or null set, transition will be skipped. So, this makes initial rendering faster especially in case you have a lot of data.<p>
	 *
	 * @param duration
	 */
	public void setDuration(Integer duration)
	{
		this.duration = duration;
	}

}
