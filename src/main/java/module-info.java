import com.jwebmp.plugins.c3.implementations.C3InclusionsModule;

module com.jwebmp.plugins.c3 {
	exports com.jwebmp.plugins.c3;
	exports com.jwebmp.plugins.c3.options;
	exports com.jwebmp.plugins.c3.options.data;
	exports com.jwebmp.plugins.c3.series;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.c3.C3PageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.c3.implementations.C3ExclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with C3InclusionsModule;

	opens com.jwebmp.plugins.c3 to com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.options.data to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.series to com.fasterxml.jackson.databind, com.jwebmp.core;
}
