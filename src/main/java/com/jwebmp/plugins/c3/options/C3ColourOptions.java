package com.jwebmp.plugins.c3.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3ColourOptions
		extends JavaScriptPart<C3ColourOptions>
{


	/**
	 * List of colour patterns
	 */
	private List<String> pattern;
	/**
	 *
	 */
	private String threshold;

	/**
	 * C3 Colour options
	 */
	public C3ColourOptions()
	{
		//Nothing needed
	}

	/**
	 * Set custom color pattern.<p>
	 * Default:
	 * <p>
	 * <p>
	 * undefined<p>
	 * Format:
	 * <p>
	 * <p>
	 * color: {
	 * <p>
	 * pattern: ['#1f77b4', '#aec7e8', ...]
	 * <p>
	 * }
	 * <p>
	 *
	 * @return
	 */
	public List<String> getPattern()
	{
		return pattern;
	}

	/**
	 * Set custom color pattern.<p>
	 * Default:
	 * <p>
	 * <p>
	 * undefined<p>
	 * Format:
	 * <p>
	 * <p>
	 * color: {
	 * <p>
	 * pattern: ['#1f77b4', '#aec7e8', ...]
	 * <p>
	 * }
	 * <p>
	 *
	 * @param pattern
	 */
	public void setPattern(List<String> pattern)
	{
		this.pattern = pattern;
	}

	/**
	 * Configures the threshold
	 *
	 * @return
	 */
	public String getThreshold()
	{
		return threshold;
	}

	/**
	 * Sets the threshold
	 *
	 * @param threshold
	 */
	public void setThreshold(String threshold)
	{
		this.threshold = threshold;
	}

}
