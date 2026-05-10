package com.jwebmp.plugins.c3.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class C3InclusionsModule implements IGuiceScanModuleInclusions<C3InclusionsModule>
{
	@Override
	public Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.c3");
		return set;
	}
}
