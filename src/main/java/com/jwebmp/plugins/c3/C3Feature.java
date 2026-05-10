package com.jwebmp.plugins.c3;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class C3Feature
		extends Feature<GlobalFeatures, C3Options, C3Feature>
{


	private C3Options options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public C3Feature(Component forComponent)
	{
		super("C3JSFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(C3JavascriptReferencePool.C3GraphCore.getReference());
		getCssReferences().add(C3CSSReferencePool.C3GraphCore.getReference());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public C3Options getOptions()
	{
		if (options == null)
		{
			options = new C3Options(getComponent());
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = "c3.generate(" + getNewLine();
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);

	}
}
