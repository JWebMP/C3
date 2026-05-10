package com.jwebmp.plugins.c3.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 9, 2016
 */
public class C3SizeOptions
		extends JavaScriptPart<C3SizeOptions>
{


	private Integer width;
	private Integer height;

	public C3SizeOptions()
	{
		//Nothing Needed
	}

	/**
	 * The desired width of the chart element.
	 * <p>
	 * If this option is not specified, the width of the chart will be calculated by the size of the parent element it's appended to.
	 *
	 * @return
	 */
	public Integer getWidth()
	{
		return width;
	}

	/**
	 * The desired width of the chart element.
	 * <p>
	 * If this option is not specified, the width of the chart will be calculated by the size of the parent element it's appended to.
	 *
	 * @param width
	 */
	public void setWidth(Integer width)
	{
		this.width = width;
	}

	/**
	 * The desired height of the chart element.
	 * <p>
	 * If this option is not specified, the height of the chart will be calculated by the size of the parent element it's appended to.
	 *
	 * @return
	 */
	public Integer getHeight()
	{
		return height;
	}

	/**
	 * The desired height of the chart element.
	 * <p>
	 * If this option is not specified, the height of the chart will be calculated by the size of the parent element it's appended to.
	 *
	 * @param height
	 */
	public void setHeight(Integer height)
	{
		this.height = height;
	}

}
