package net.isaac.got.common.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.isaac.got.GOT;
import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class GOTModelProvider extends FabricModelProvider {
    public GOTModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /* FUNCTIONAL */
        blockStateModelGenerator.registerCooker(GOTBlocks.Alloy_Forge, TexturedModel.ORIENTABLE);

        /* FOOD */
        CakeBlockGenerator.generateBlockJson("apple_crumble");
        CakeBlockGenerator.generateBlockJson("banana_cake");
        CakeBlockGenerator.generateBlockJson("berry_pie");

        /* NATURAL */
        blockStateModelGenerator.registerTintableCross(GOTBlocks.Arid_Grass, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Asshai_Dirt);
        blockStateModelGenerator.registerTintableCross(GOTBlocks.Asshai_Flower, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GOTBlocks.Asshai_Grass, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Ore_Cobalt);
        blockStateModelGenerator.registerWoolAndCarpet(Blocks.WHITE_WOOL, GOTBlocks.Asshai_Moss); //NOT WORKING
        blockStateModelGenerator.registerTintableCross(GOTBlocks.Asshai_Thorn, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Basalt_Gravel);
        blockStateModelGenerator.registerTintableCross(GOTBlocks.Blackroot, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GOTBlocks.Bluebell, BlockStateModelGenerator.TintType.TINTED);

        /* BULDING */
        PaneBlockGenerator.generateBlockJson("asshai_bars");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Amber_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Coral_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Opal_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Pearl_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Ruby_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sapphire_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Topaz_Gem_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Bronze_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Saltpeter_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Silver_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sulfur_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Tin_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Valyrian_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Alloy_Steel_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Gilded_Iron_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Salt_Metal_Block);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Bone_Block);
        SlabGenerator.generateBlockJson("bone_block");
        StairGenerator.generateBlockJson("bone_block");
        WallGenerator.generateBlockJson("bone_block");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Andesite_Brick);
        SlabGenerator.generateBlockJson("brick1_andesite");
        StairGenerator.generateBlockJson("brick1_andesite");
        WallGenerator.generateBlockJson("brick1_andesite");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Andesite_Brick_Carved);
        SlabGenerator.generateBlockJson("brick1_andesite_carved");
        StairGenerator.generateBlockJson("brick1_andesite_carved");
        WallGenerator.generateBlockJson("brick1_andesite_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Andesite_Brick_Cracked);
        SlabGenerator.generateBlockJson("brick1_andesite_cracked");
        StairGenerator.generateBlockJson("brick1_andesite_cracked");
        WallGenerator.generateBlockJson("brick1_andesite_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Andesite_Brick_Mossy);
        SlabGenerator.generateBlockJson("brick1_andesite_mossy");
        StairGenerator.generateBlockJson("brick1_andesite_mossy");
        WallGenerator.generateBlockJson("brick1_andesite_mossy");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Basalt_Brick);
        SlabGenerator.generateBlockJson("brick1_basalt");
        StairGenerator.generateBlockJson("brick1_basalt");
        WallGenerator.generateBlockJson("brick1_basalt");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Basalt_Brick_Cracked);
        SlabGenerator.generateBlockJson("brick1_basalt_cracked");
        StairGenerator.generateBlockJson("brick1_basalt_cracked");
        WallGenerator.generateBlockJson("brick1_basalt_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Diorite_Brick);
        SlabGenerator.generateBlockJson("brick1_diorite");
        StairGenerator.generateBlockJson("brick1_diorite");
        WallGenerator.generateBlockJson("brick1_diorite");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Rhyolite_Brick);
        SlabGenerator.generateBlockJson("brick1_rhyolite");
        StairGenerator.generateBlockJson("brick1_rhyolite");
        WallGenerator.generateBlockJson("brick1_rhyolite");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Brick);
        SlabGenerator.generateBlockJson("brick1_sandstone");
        StairGenerator.generateBlockJson("brick1_sandstone");
        WallGenerator.generateBlockJson("brick1_sandstone");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Basalt_Carved_Brick);
        SlabGenerator.generateBlockJson("brick2_basalt_carved");
        StairGenerator.generateBlockJson("brick2_basalt_carved");
        WallGenerator.generateBlockJson("brick2_basalt_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Basalt_Westeros_Brick);
        SlabGenerator.generateBlockJson("brick2_basalt_westeros");
        StairGenerator.generateBlockJson("brick2_basalt_westeros");
        WallGenerator.generateBlockJson("brick2_basalt_westeros");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Granite_Brick);
        SlabGenerator.generateBlockJson("brick2_granite");
        StairGenerator.generateBlockJson("brick2_granite");
        WallGenerator.generateBlockJson("brick2_granite");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Diorite_Carved_Brick);
        SlabGenerator.generateBlockJson("brick3_diorite_carved");
        StairGenerator.generateBlockJson("brick3_diorite_carved");
        WallGenerator.generateBlockJson("brick3_diorite_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Granite_Carved_Brick);
        SlabGenerator.generateBlockJson("brick3_granite_carved");
        StairGenerator.generateBlockJson("brick3_granite_carved");
        WallGenerator.generateBlockJson("brick3_granite_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Lhazar_Brick);
        SlabGenerator.generateBlockJson("brick3_lhazar");
        StairGenerator.generateBlockJson("brick3_lhazar");
        WallGenerator.generateBlockJson("brick3_lhazar");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Carved_Brick);
        SlabGenerator.generateBlockJson("brick3_sandstone_carved");
        StairGenerator.generateBlockJson("brick3_sandstone_carved");
        WallGenerator.generateBlockJson("brick3_sandstone_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Cracked_Brick);
        SlabGenerator.generateBlockJson("brick3_sandstone_cracked");
        StairGenerator.generateBlockJson("brick3_sandstone_cracked");
        WallGenerator.generateBlockJson("brick3_sandstone_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Red_Brick);
        SlabGenerator.generateBlockJson("brick3_sandstone_red");
        StairGenerator.generateBlockJson("brick3_sandstone_red");
        WallGenerator.generateBlockJson("brick3_sandstone_red");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Red_Carved_Brick);
        SlabGenerator.generateBlockJson("brick3_sandstone_red_carved");
        StairGenerator.generateBlockJson("brick3_sandstone_red_carved");
        WallGenerator.generateBlockJson("brick3_sandstone_red_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Red_Cracked_Brick);
        SlabGenerator.generateBlockJson("brick3_sandstone_red_cracked");
        StairGenerator.generateBlockJson("brick3_sandstone_red_cracked");
        WallGenerator.generateBlockJson("brick3_sandstone_red_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Basalt_Westeros_Carved_Brick);
        SlabGenerator.generateBlockJson("brick4_basalt_westeros_carved");
        StairGenerator.generateBlockJson("brick4_basalt_westeros_carved");
        WallGenerator.generateBlockJson("brick4_basalt_westeros_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Chalk_Brick);
        SlabGenerator.generateBlockJson("brick4_chalk");
        StairGenerator.generateBlockJson("brick4_chalk");
        WallGenerator.generateBlockJson("brick4_chalk");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sandstone_Lapis_Brick);
        SlabGenerator.generateBlockJson("brick4_sandstone_lapis");
        StairGenerator.generateBlockJson("brick4_sandstone_lapis");
        WallGenerator.generateBlockJson("brick4_sandstone_lapis");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sothoryos_Brick);
        SlabGenerator.generateBlockJson("brick4_sothoryos");
        StairGenerator.generateBlockJson("brick4_sothoryos");
        WallGenerator.generateBlockJson("brick4_sothoryos");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sothoryos_Cracked_Brick);
        SlabGenerator.generateBlockJson("brick4_sothoryos_cracked");
        StairGenerator.generateBlockJson("brick4_sothoryos_cracked");
        WallGenerator.generateBlockJson("brick4_sothoryos_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sothoryos_Gold_Brick);
        SlabGenerator.generateBlockJson("brick4_sothoryos_gold");
        StairGenerator.generateBlockJson("brick4_sothoryos_gold");
        WallGenerator.generateBlockJson("brick4_sothoryos_gold");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sothoryos_Mossy_Brick);
        SlabGenerator.generateBlockJson("brick4_sothoryos_mossy");
        StairGenerator.generateBlockJson("brick4_sothoryos_mossy");
        WallGenerator.generateBlockJson("brick4_sothoryos_mossy");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Sothoryos_Obsidian_Brick);
        SlabGenerator.generateBlockJson("brick4_sothoryos_obsidian");
        StairGenerator.generateBlockJson("brick4_sothoryos_obsidian");
        WallGenerator.generateBlockJson("brick4_sothoryos_obsidian");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Rhyolite_Carved_Brick);
        SlabGenerator.generateBlockJson("brick5_rhyolite_carved");
        StairGenerator.generateBlockJson("brick5_rhyolite_carved");
        WallGenerator.generateBlockJson("brick5_rhyolite_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Brick);
        SlabGenerator.generateBlockJson("brick5_yiti");
        StairGenerator.generateBlockJson("brick5_yiti");
        WallGenerator.generateBlockJson("brick5_yiti");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Carved_Brick);
        SlabGenerator.generateBlockJson("brick5_yiti_carved");
        StairGenerator.generateBlockJson("brick5_yiti_carved");
        WallGenerator.generateBlockJson("brick5_yiti_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Cracked_Brick);
        SlabGenerator.generateBlockJson("brick5_yiti_cracked");
        StairGenerator.generateBlockJson("brick5_yiti_cracked");
        WallGenerator.generateBlockJson("brick5_yiti_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Flowers_Brick);
        SlabGenerator.generateBlockJson("brick5_yiti_flowers");
        StairGenerator.generateBlockJson("brick5_yiti_flowers");
        WallGenerator.generateBlockJson("brick5_yiti_flowers");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Mossy_Brick);
        SlabGenerator.generateBlockJson("brick5_yiti_mossy");
        StairGenerator.generateBlockJson("brick5_yiti_mossy");
        WallGenerator.generateBlockJson("brick5_yiti_mossy");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Labradorite_Brick);
        SlabGenerator.generateBlockJson("brick6_labradorite");
        StairGenerator.generateBlockJson("brick6_labradorite");
        WallGenerator.generateBlockJson("brick6_labradorite");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Labradorite_Carved_Brick);
        SlabGenerator.generateBlockJson("brick6_labradorite_carved");
        StairGenerator.generateBlockJson("brick6_labradorite_carved");
        WallGenerator.generateBlockJson("brick6_labradorite_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Labradorite_Cracked_Brick);
        SlabGenerator.generateBlockJson("brick6_labradorite_cracked");
        StairGenerator.generateBlockJson("brick6_labradorite_cracked");
        WallGenerator.generateBlockJson("brick6_labradorite_cracked");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Labradorite_Mossy_Brick);
        SlabGenerator.generateBlockJson("brick6_labradorite_mossy");
        StairGenerator.generateBlockJson("brick6_labradorite_mossy");
        WallGenerator.generateBlockJson("brick6_labradorite_mossy");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Swords_Brick);
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Gold_Brick);
        SlabGenerator.generateBlockJson("brick6_yiti_gold");
        StairGenerator.generateBlockJson("brick6_yiti_gold");
        WallGenerator.generateBlockJson("brick6_yiti_gold");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Granite_Brick);
        SlabGenerator.generateBlockJson("brick6_yiti_granite");
        StairGenerator.generateBlockJson("brick6_yiti_granite");
        WallGenerator.generateBlockJson("brick6_yiti_granite");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Yiti_Granite_Carved_Brick);
        SlabGenerator.generateBlockJson("brick6_yiti_granite_carved");
        StairGenerator.generateBlockJson("brick6_yiti_granite_carved");
        WallGenerator.generateBlockJson("brick6_yiti_granite_carved");
        blockStateModelGenerator.registerCubeAllModelTexturePool(GOTBlocks.Ice_Brick);


        /*DECORATION */
        blockStateModelGenerator.registerTorch(GOTBlocks.Asshai_Torch, GOTBlocks.Asshai_WallTorch); //MAYBE NOT WORKING?
        BirdCageGenerator.generateBlockJson("bird_cage_bronze");
        BirdCageGenerator.generateBlockJson("bird_cage_gold");
        BirdCageGenerator.generateBlockJson("bird_cage_iron");
        BirdCageGenerator.generateBlockJson("bird_cage_silver");
        BirdCageGenerator.generateBlockJson("bird_cage_wood_wood");

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /* LEGENDARY WEAPONS */
        itemModelGenerator.register(GOTWeapons.Areo_Hotah_Axe, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Baelish_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Beric_Sword, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Blackfyre, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bolton_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Brightroar, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Celtigar_Axe, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Daario_Arakh, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Dark_Sister, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Darkstar, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Dawn, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Eddard_Sword, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Euron_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Forrester_Sword, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Tormund_Sword, Models.HANDHELD);

        /* WEAPONS */
        itemModelGenerator.register(GOTWeapons.Alloy_Steel_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Alloy_Steel_Dagger_Poisoned, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Alloy_Steel_Halberd, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Alloy_Steel_Sword, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Archmag_Staff, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Battleaxe, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Bow, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Dagger_Poisoned, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Hammer, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Spear, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Staff, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Asshai_Sword, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Black_Arakh, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bronze_Battleaxe, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bronze_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bronze_Dagger_Poisoned, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bronze_Spear, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bronze_Sword, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Bronze_Throwing_Axe, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Bow, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Dagger, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Dagger_Poisoned, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Hammer, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Pike, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Polearm, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Spear, Models.HANDHELD);
        itemModelGenerator.register(GOTWeapons.Essos_Sword, Models.HANDHELD);

        /* INGREDENTS */
        itemModelGenerator.register(GOTOther.Alloy_Steel_Ingot, Models.GENERATED);
        itemModelGenerator.register(GOTOther.Bronze_Ingot, Models.GENERATED);
        itemModelGenerator.register(GOTOther.Valyrian_Ingot, Models.GENERATED);

        /* FOOD */

    }
}
