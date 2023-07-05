package net.isaac.got;

import net.fabricmc.api.ModInitializer;

import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.block.GOTFlammableBlockRegistry;
import net.isaac.got.common.item.GOTGroups;
import net.isaac.got.common.item.armor.GOTArmor;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.tool.GOTTools;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.isaac.got.common.world.dimension.GOTDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GOT implements ModInitializer {
    public static final String MOD_ID = "got";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        GOTOther.registerModOther();
        GOTTools.registerModTools();
        GOTWeapons.registerModWeapons();
        GOTBlocks.registerModBlocks();
        GOTGroups.registerModGroups();
        GOTArmor.registerModArmor();
        GOTFlammableBlockRegistry.registerFlammableBlocks();

        GOTDimensions.register();
    }
}