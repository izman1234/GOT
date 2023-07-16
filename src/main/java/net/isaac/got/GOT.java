package net.isaac.got;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.isaac.got.client.GOTSpearRenderer;
import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.block.GOTFlammableBlockRegistry;
import net.isaac.got.common.GOTGroups;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.tool.GOTTools;
import net.isaac.got.common.item.weapon.GOTEntities.GOTEntitySpear;
import net.isaac.got.common.item.weapon.GOTEntities.GOTEntityTypes;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.isaac.got.common.world.dimension.GOTDimensions;
import net.isaac.got.common.world.tree.decorator.GOTDecorator;
import net.isaac.got.common.world.tree.foliage.GOTFoliage;
import net.isaac.got.common.world.tree.trunk.GOTTrunks;
import net.isaac.got.util.GOTModelPredicateProvider;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GOT implements ModInitializer {
    public static final String MOD_ID = "got";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        GOTEntityTypes.init();
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