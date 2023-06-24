package net.isaac.got.common.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class GOTFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(GOTBlocks.Arid_Grass, 30, 60);
    }
}
