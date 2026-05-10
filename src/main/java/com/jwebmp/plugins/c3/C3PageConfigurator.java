package com.jwebmp.plugins.c3;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;


/**
 * Page configurator for C3.js — D3-based reusable charting library.
 */
@PluginInformation(pluginName = "C3.js",
		pluginUniqueName = "c3-js",
		pluginDescription = "C3 makes it easy to generate D3-based charts by wrapping the code required to construct the entire chart. We don't need to write D3 code any more.",
		pluginVersion = "0.7.20",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginDependancyUniqueIDs = "d3",
		pluginCategories = "d3, c3, graphing, charts, svg",
		pluginSubtitle = "C3 enables deeper integration of charts into your application",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "https://github.com/c3js/c3",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "https://c3js.org/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/c3",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "c3",
		pluginModuleName = "com.jwebmp.plugins.c3",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "c3", version = "^0.7.20")
@NgScript("node_modules/c3/c3.min.js")
@NgStyleSheet("node_modules/c3/c3.min.css")
public class C3PageConfigurator
		implements IPageConfigurator<C3PageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
