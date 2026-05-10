package com.jwebmp.plugins.c3.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class C3ExclusionsModule
		implements IGuiceScanModuleExclusions<C3ExclusionsModule>
{
	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.c3");
		return strings;
	}
}
