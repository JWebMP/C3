package com.jwebmp.plugins.c3.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class C3ExclusionsModule implements IGuiceScanModuleExclusions<C3ExclusionsModule>, IGuiceScanJarExclusions<C3ExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.c3"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("c3.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("c3-" + digit + "*.jar");
        return jars;
    }
}
