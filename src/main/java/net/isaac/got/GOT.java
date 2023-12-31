package net.isaac.got;

import net.fabricmc.api.ModInitializer;

import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.block.GOTFlammableBlockRegistry;
import net.isaac.got.common.GOTGroups;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.tool.GOTTools;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.isaac.got.common.world.dimension.GOTDimensions;
import net.isaac.got.common.world.tree.decorator.GOTDecorator;
import net.isaac.got.common.world.tree.foliage.GOTFoliage;
import net.isaac.got.common.world.tree.trunk.GOTTrunks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GOT implements ModInitializer {
    public static final String MOD_ID = "got";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        GOTWeapons.registerModWeapons();
        GOTTools.registerModTools();
        GOTBlocks.registerModBlocks();
        GOTOther.registerModOther();
        GOTGroups.registerModGroups();

        GOTFlammableBlockRegistry.registerFlammableBlocks();

        GOTFoliage.register();
        GOTTrunks.register();
        GOTDecorator.register();

        GOTDimensions.register();


    }
}