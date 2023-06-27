package net.isaac.got.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.isaac.got.GOT;
import net.isaac.got.common.block.GOTBananaBlock;
import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GOTGroups {
    public static ItemGroup GOTCombatGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_combat"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Combat"))
                    .icon(() -> new ItemStack(GOTWeapons.Tormund_Sword)).entries((displayContext, entries) -> {

                        /* LEGENDARY WEAPONS */
                        entries.add(GOTWeapons.Areo_Hotah_Axe);
                        entries.add(GOTWeapons.Baelish_Dagger);
                        entries.add(GOTWeapons.Beric_Sword);
                        entries.add(GOTWeapons.Blackfyre);
                        entries.add(GOTWeapons.Bolton_Dagger);
                        entries.add(GOTWeapons.Brightroar);
                        entries.add(GOTWeapons.Celtigar_Axe);
                        entries.add(GOTWeapons.Daario_Arakh);
                        entries.add(GOTWeapons.Dark_Sister);
                        entries.add(GOTWeapons.Darkstar);
                        entries.add(GOTWeapons.Dawn);
                        entries.add(GOTWeapons.Eddard_Sword);
                        entries.add(GOTWeapons.Euron_Dagger);
                        entries.add(GOTWeapons.Forrester_Sword);
                        entries.add(GOTWeapons.Tormund_Sword);

                        /* WEAPONS */
                        entries.add(GOTWeapons.Alloy_Steel_Dagger);
                        entries.add(GOTWeapons.Alloy_Steel_Dagger_Poisoned);
                        entries.add(GOTWeapons.Alloy_Steel_Halberd);
                        entries.add(GOTWeapons.Alloy_Steel_Sword);
                        entries.add(GOTWeapons.Archmag_Staff);
                        entries.add(GOTWeapons.Asshai_Battleaxe);
                        entries.add(GOTWeapons.Asshai_Bow);
                        entries.add(GOTWeapons.Asshai_Dagger);
                        entries.add(GOTWeapons.Asshai_Dagger_Poisoned);
                        entries.add(GOTWeapons.Asshai_Hammer);
                        entries.add(GOTWeapons.Asshai_Spear);
                        entries.add(GOTWeapons.Asshai_Staff);
                        entries.add(GOTWeapons.Asshai_Sword);
                        entries.add(GOTWeapons.Black_Arakh);
                        entries.add(GOTWeapons.Bronze_Battleaxe);
                        entries.add(GOTWeapons.Bronze_Dagger);
                        entries.add(GOTWeapons.Bronze_Dagger_Poisoned);
                        entries.add(GOTWeapons.Bronze_Spear);
                        entries.add(GOTWeapons.Bronze_Sword);
                        entries.add(GOTWeapons.Bronze_Throwing_Axe);
                        entries.add(GOTWeapons.Essos_Bow);
                        entries.add(GOTWeapons.Essos_Dagger);
                        entries.add(GOTWeapons.Essos_Dagger_Poisoned);
                        entries.add(GOTWeapons.Essos_Hammer);
                        entries.add(GOTWeapons.Essos_Pike);
                        entries.add(GOTWeapons.Essos_Polearm);
                        entries.add(GOTWeapons.Essos_Spear);
                        entries.add(GOTWeapons.Essos_Sword);
                    }).build());

    public static ItemGroup GOTIngredientsGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_ingredients"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Ingredients"))
                    .icon(() -> new ItemStack(GOTOther.Alloy_Steel_Ingot)).entries((displayContext, entries) -> {
                        /* INGOTS */
                        entries.add(GOTOther.Alloy_Steel_Ingot);
                        entries.add(GOTOther.Bronze_Ingot);
                        entries.add(GOTOther.Valyrian_Ingot);
                    }).build());

    public static ItemGroup GOTFunctionalGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_functional"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Functional Blocks"))
                    .icon(() -> new ItemStack(GOTBlocks.Alloy_Forge)).entries((displayContext, entries) -> {
                        entries.add(GOTBlocks.Alloy_Forge);
                        entries.add(GOTBlocks.Bank);
                    }).build());

    public static ItemGroup GOTFoodGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_food"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Food"))
                    .icon(() -> new ItemStack(GOTBlocks.Apple_Crumble)).entries((displayContext, entries) -> {
                        entries.add(GOTBlocks.Apple_Crumble);
                        entries.add(GOTBlocks.Banana_Cake);
                        entries.add(GOTBlocks.Banana);
                        entries.add(GOTBlocks.Berry_Pie);
                        entries.add(GOTBlocks.Cherry_Pie);
                        entries.add(GOTBlocks.Date);
                        entries.add(GOTBlocks.Cucumber);
                        entries.add(GOTBlocks.Flax);
                        entries.add(GOTBlocks.Kebab_Block);
                        entries.add(GOTBlocks.Leek);
                        entries.add(GOTBlocks.Lemon_Cake);
                        entries.add(GOTBlocks.Lettuce);
                    }).build());

    public static ItemGroup GOTNaturalGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_natural"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Natural Blocks"))
                    .icon(() -> new ItemStack(GOTBlocks.Basalt_Gravel)).entries((displayContext, entries) -> {
                        entries.add(GOTBlocks.Asshai_Dirt);
                        entries.add(GOTBlocks.Arid_Grass);
                        entries.add(GOTBlocks.Asshai_Flower);
                        entries.add(GOTBlocks.Asshai_Grass);
                        entries.add(GOTBlocks.Asshai_Moss);
                        entries.add(GOTBlocks.Asshai_Thorn);
                        entries.add(GOTBlocks.Basalt_Gravel);
                        entries.add(GOTBlocks.Blackroot);
                        entries.add(GOTBlocks.Bluebell);
                        entries.add(GOTBlocks.Corn_Stalk);
                        entries.add(GOTBlocks.Corn_Stalk_Corn);
                        entries.add(GOTBlocks.Dead_Marsh_Plant);
                        entries.add(GOTBlocks.Double_Flower_Black_Iris);
                        entries.add(GOTBlocks.Double_Flower_Pink);
                        entries.add(GOTBlocks.Double_Flower_Red);
                        entries.add(GOTBlocks.Double_Flower_Yellow_Iris);
                        entries.add(GOTBlocks.Essos_Flower_Daisy);
                        entries.add(GOTBlocks.Essos_Flower_Pink);
                        entries.add(GOTBlocks.Essos_Flower_Red);
                        entries.add(GOTBlocks.Essos_Flower_Red2);
                        entries.add(GOTBlocks.Essos_Flower_Yellow);
                        entries.add(GOTBlocks.Fruit_Leaves_Apple);
                        entries.add(GOTBlocks.Fruit_Leaves_Cherry);
                        entries.add(GOTBlocks.Fruit_Leaves_Mango);
                        entries.add(GOTBlocks.Fruit_Leaves_Pear);
                        entries.add(GOTBlocks.Fruit_Sapling_Apple);
                        entries.add(GOTBlocks.Fruit_Sapling_Cherry);
                        entries.add(GOTBlocks.Fruit_Sapling_Mango);
                        entries.add(GOTBlocks.Fruit_Sapling_Pear);
                        entries.add(GOTBlocks.Catalpa_Leaves);
                        entries.add(GOTBlocks.Ibbinia_Leaves);
                        entries.add(GOTBlocks.Ulthos_Leaves);
                        entries.add(GOTBlocks.Ulthos_Red_Leaves);
                        entries.add(GOTBlocks.Aramant_Leaves);
                        entries.add(GOTBlocks.Banana_Leaves);
                        entries.add(GOTBlocks.Beech_Leaves);
                        entries.add(GOTBlocks.Holly_Leaves);
                        entries.add(GOTBlocks.Date_Palm_Leaves);
                        entries.add(GOTBlocks.Larch_Leaves);
                        entries.add(GOTBlocks.Mangrove_Leaves);
                        entries.add(GOTBlocks.Maple_Leaves);
                        entries.add(GOTBlocks.Baobab_Leaves);
                        entries.add(GOTBlocks.Cedar_Leaves);
                        entries.add(GOTBlocks.Chestnut_Leaves);
                        entries.add(GOTBlocks.Fir_Leaves);
                        entries.add(GOTBlocks.Lemon_Leaves);
                        entries.add(GOTBlocks.Lime_Leaves);
                        entries.add(GOTBlocks.Orange_Leaves);
                        entries.add(GOTBlocks.Pine_Leaves);
                        entries.add(GOTBlocks.Cypress_Leaves);
                        entries.add(GOTBlocks.Mahogany_Leaves);
                        entries.add(GOTBlocks.Olive_Leaves);
                        entries.add(GOTBlocks.Willow_Leaves);
                        entries.add(GOTBlocks.Almond_Leaves);
                        entries.add(GOTBlocks.Aspen_Leaves);
                        entries.add(GOTBlocks.Fotinia_Leaves);
                        entries.add(GOTBlocks.Green_Oak_Leaves);
                        entries.add(GOTBlocks.Palm_Leaves);
                        entries.add(GOTBlocks.Plum_Leaves);
                        entries.add(GOTBlocks.Pomegranate_Leaves);
                        entries.add(GOTBlocks.Redwood_Leaves);
                        entries.add(GOTBlocks.Dragon_Leaves);
                        entries.add(GOTBlocks.Kanuka_Leaves);
                        entries.add(GOTBlocks.Weirwood_Leaves);
                        


                        entries.add(GOTBlocks.Ore_Cobalt);

                    }).build());

    public static ItemGroup GOTBuildingGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_building"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Building Blocks"))
                    .icon(() -> new ItemStack(GOTBlocks.Andesite_Brick)).entries((displayContext, entries) -> {
                        entries.add(GOTBlocks.Asshai_Bars);
                        entries.add(GOTBlocks.Bone_Block);
                        entries.add(GOTBlocks.Bone_Block_Slab);
                        entries.add(GOTBlocks.Bone_Block_Stairs);
                        entries.add(GOTBlocks.Bone_Block_Wall);
                        entries.add(GOTBlocks.Andesite_Brick);
                        entries.add(GOTBlocks.Andesite_Brick_Slab);
                        entries.add(GOTBlocks.Andesite_Brick_Stairs);
                        entries.add(GOTBlocks.Andesite_Brick_Wall);
                        entries.add(GOTBlocks.Andesite_Brick_Carved);
                        entries.add(GOTBlocks.Andesite_Brick_Carved_Slab);
                        entries.add(GOTBlocks.Andesite_Brick_Carved_Stairs);
                        entries.add(GOTBlocks.Andesite_Brick_Carved_Wall);
                        entries.add(GOTBlocks.Andesite_Brick_Cracked);
                        entries.add(GOTBlocks.Andesite_Brick_Cracked_Slab);
                        entries.add(GOTBlocks.Andesite_Brick_Cracked_Stairs);
                        entries.add(GOTBlocks.Andesite_Brick_Cracked_Wall);
                        entries.add(GOTBlocks.Andesite_Brick_Mossy);
                        entries.add(GOTBlocks.Andesite_Brick_Mossy_Slab);
                        entries.add(GOTBlocks.Andesite_Brick_Mossy_Stairs);
                        entries.add(GOTBlocks.Andesite_Brick_Mossy_Wall);
                        entries.add(GOTBlocks.Basalt_Brick);
                        entries.add(GOTBlocks.Basalt_Brick_Slab);
                        entries.add(GOTBlocks.Basalt_Brick_Stairs);
                        entries.add(GOTBlocks.Basalt_Brick_Wall);
                        entries.add(GOTBlocks.Basalt_Brick_Cracked);
                        entries.add(GOTBlocks.Basalt_Brick_Cracked_Slab);
                        entries.add(GOTBlocks.Basalt_Brick_Cracked_Stairs);
                        entries.add(GOTBlocks.Basalt_Brick_Cracked_Wall);
                        entries.add(GOTBlocks.Diorite_Brick);
                        entries.add(GOTBlocks.Diorite_Brick_Slab);
                        entries.add(GOTBlocks.Diorite_Brick_Stairs);
                        entries.add(GOTBlocks.Diorite_Brick_Wall);
                        entries.add(GOTBlocks.Rhyolite_Brick);
                        entries.add(GOTBlocks.Rhyolite_Brick_Slab);
                        entries.add(GOTBlocks.Rhyolite_Brick_Stairs);
                        entries.add(GOTBlocks.Rhyolite_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Brick);
                        entries.add(GOTBlocks.Sandstone_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Brick_Wall);
                        entries.add(GOTBlocks.Basalt_Carved_Brick);
                        entries.add(GOTBlocks.Basalt_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Basalt_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Basalt_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Basalt_Westeros_Brick);
                        entries.add(GOTBlocks.Basalt_Westeros_Brick_Slab);
                        entries.add(GOTBlocks.Basalt_Westeros_Brick_Stairs);
                        entries.add(GOTBlocks.Basalt_Westeros_Brick_Wall);
                        entries.add(GOTBlocks.Granite_Brick);
                        entries.add(GOTBlocks.Granite_Brick_Slab);
                        entries.add(GOTBlocks.Granite_Brick_Stairs);
                        entries.add(GOTBlocks.Granite_Brick_Wall);
                        entries.add(GOTBlocks.Diorite_Carved_Brick);
                        entries.add(GOTBlocks.Diorite_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Diorite_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Diorite_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Granite_Carved_Brick);
                        entries.add(GOTBlocks.Granite_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Granite_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Granite_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Lhazar_Brick);
                        entries.add(GOTBlocks.Lhazar_Brick_Slab);
                        entries.add(GOTBlocks.Lhazar_Brick_Stairs);
                        entries.add(GOTBlocks.Lhazar_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Carved_Brick);
                        entries.add(GOTBlocks.Sandstone_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Cracked_Brick);
                        entries.add(GOTBlocks.Sandstone_Cracked_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Cracked_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Cracked_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Red_Brick);
                        entries.add(GOTBlocks.Sandstone_Red_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Red_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Red_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Red_Carved_Brick);
                        entries.add(GOTBlocks.Sandstone_Red_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Red_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Red_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Red_Cracked_Brick);
                        entries.add(GOTBlocks.Sandstone_Red_Cracked_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Red_Cracked_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Red_Cracked_Brick_Wall);
                        entries.add(GOTBlocks.Basalt_Westeros_Carved_Brick);
                        entries.add(GOTBlocks.Basalt_Westeros_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Basalt_Westeros_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Basalt_Westeros_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Chalk_Brick);
                        entries.add(GOTBlocks.Chalk_Brick_Slab);
                        entries.add(GOTBlocks.Chalk_Brick_Stairs);
                        entries.add(GOTBlocks.Chalk_Brick_Wall);
                        entries.add(GOTBlocks.Sandstone_Lapis_Brick);
                        entries.add(GOTBlocks.Sandstone_Lapis_Brick_Slab);
                        entries.add(GOTBlocks.Sandstone_Lapis_Brick_Stairs);
                        entries.add(GOTBlocks.Sandstone_Lapis_Brick_Wall);
                        entries.add(GOTBlocks.Sothoryos_Brick);
                        entries.add(GOTBlocks.Sothoryos_Brick_Slab);
                        entries.add(GOTBlocks.Sothoryos_Brick_Stairs);
                        entries.add(GOTBlocks.Sothoryos_Brick_Wall);
                        entries.add(GOTBlocks.Sothoryos_Cracked_Brick);
                        entries.add(GOTBlocks.Sothoryos_Cracked_Brick_Slab);
                        entries.add(GOTBlocks.Sothoryos_Cracked_Brick_Stairs);
                        entries.add(GOTBlocks.Sothoryos_Cracked_Brick_Wall);
                        entries.add(GOTBlocks.Sothoryos_Gold_Brick);
                        entries.add(GOTBlocks.Sothoryos_Gold_Brick_Slab);
                        entries.add(GOTBlocks.Sothoryos_Gold_Brick_Stairs);
                        entries.add(GOTBlocks.Sothoryos_Gold_Brick_Wall);
                        entries.add(GOTBlocks.Sothoryos_Mossy_Brick);
                        entries.add(GOTBlocks.Sothoryos_Mossy_Brick_Slab);
                        entries.add(GOTBlocks.Sothoryos_Mossy_Brick_Stairs);
                        entries.add(GOTBlocks.Sothoryos_Mossy_Brick_Wall);
                        entries.add(GOTBlocks.Sothoryos_Obsidian_Brick);
                        entries.add(GOTBlocks.Sothoryos_Obsidian_Brick_Slab);
                        entries.add(GOTBlocks.Sothoryos_Obsidian_Brick_Stairs);
                        entries.add(GOTBlocks.Sothoryos_Obsidian_Brick_Wall);
                        entries.add(GOTBlocks.Rhyolite_Carved_Brick);
                        entries.add(GOTBlocks.Rhyolite_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Rhyolite_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Rhyolite_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Brick);
                        entries.add(GOTBlocks.Yiti_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Carved_Brick);
                        entries.add(GOTBlocks.Yiti_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Cracked_Brick);
                        entries.add(GOTBlocks.Yiti_Cracked_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Cracked_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Cracked_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Flowers_Brick);
                        entries.add(GOTBlocks.Yiti_Flowers_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Flowers_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Flowers_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Mossy_Brick);
                        entries.add(GOTBlocks.Yiti_Mossy_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Mossy_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Mossy_Brick_Wall);
                        entries.add(GOTBlocks.Labradorite_Brick);
                        entries.add(GOTBlocks.Labradorite_Brick_Slab);
                        entries.add(GOTBlocks.Labradorite_Brick_Stairs);
                        entries.add(GOTBlocks.Labradorite_Brick_Wall);
                        entries.add(GOTBlocks.Labradorite_Carved_Brick);
                        entries.add(GOTBlocks.Labradorite_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Labradorite_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Labradorite_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Labradorite_Cracked_Brick);
                        entries.add(GOTBlocks.Labradorite_Cracked_Brick_Slab);
                        entries.add(GOTBlocks.Labradorite_Cracked_Brick_Stairs);
                        entries.add(GOTBlocks.Labradorite_Cracked_Brick_Wall);
                        entries.add(GOTBlocks.Labradorite_Mossy_Brick);
                        entries.add(GOTBlocks.Labradorite_Mossy_Brick_Slab);
                        entries.add(GOTBlocks.Labradorite_Mossy_Brick_Stairs);
                        entries.add(GOTBlocks.Labradorite_Mossy_Brick_Wall);
                        entries.add(GOTBlocks.Swords_Brick);
                        entries.add(GOTBlocks.Yiti_Gold_Brick);
                        entries.add(GOTBlocks.Yiti_Gold_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Gold_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Gold_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Granite_Brick);
                        entries.add(GOTBlocks.Yiti_Granite_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Granite_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Granite_Brick_Wall);
                        entries.add(GOTBlocks.Yiti_Granite_Carved_Brick);
                        entries.add(GOTBlocks.Yiti_Granite_Carved_Brick_Slab);
                        entries.add(GOTBlocks.Yiti_Granite_Carved_Brick_Stairs);
                        entries.add(GOTBlocks.Yiti_Granite_Carved_Brick_Wall);
                        entries.add(GOTBlocks.Ice_Brick);
                        entries.add(GOTBlocks.Bronze_Bars);
                        entries.add(GOTBlocks.Clay_Tile);
                        entries.add(GOTBlocks.Clay_Tile_Slab);
                        entries.add(GOTBlocks.Clay_Tile_Stairs);
                        entries.add(GOTBlocks.Clay_Tile_Wall);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Black);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Black);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Black);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Black);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Brown);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Brown);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Brown);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Brown);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Cyan);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Cyan);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Cyan);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Cyan);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Gray);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Gray);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Gray);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Gray);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Green);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Green);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Green);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Green);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Light_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Light_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Light_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Light_Blue);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Lime);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Lime);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Lime);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Lime);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Magenta);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Magenta);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Magenta);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Magenta);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Orange);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Orange);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Orange);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Orange);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Pink);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Pink);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Pink);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Pink);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Purple);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Purple);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Purple);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Purple);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Red);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Red);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Red);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Red);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Silver);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Silver);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Silver);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Silver);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_White);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_White);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_White);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_White);
                        entries.add(GOTBlocks.Clay_Tile_Dyed_Yellow);
                        entries.add(GOTBlocks.Clay_Tile_Slab_Dyed_Yellow);
                        entries.add(GOTBlocks.Clay_Tile_Stairs_Dyed_Yellow);
                        entries.add(GOTBlocks.Clay_Tile_Wall_Dyed_Yellow);
                        entries.add(GOTBlocks.Bruschatka);
                        entries.add(GOTBlocks.Dirt_Path);
                        entries.add(GOTBlocks.Jungle_Mud_Path);
                        entries.add(GOTBlocks.Fruit_Wood_Apple);
                        entries.add(GOTBlocks.Fruit_Wood_Cherry);
                        entries.add(GOTBlocks.Fruit_Wood_Mango);
                        entries.add(GOTBlocks.Fruit_Wood_Pear);
                        entries.add(GOTBlocks.Gold_Bars);

                    }).build());

    public static ItemGroup GOTDecorationGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_decoration"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Decoration Blocks"))
                    .icon(() -> new ItemStack(GOTBlocks.Opal_Gem_Block)).entries((displayContext, entries) -> {
                        entries.add(GOTBlocks.Asshai_Torch);
                        entries.add(GOTBlocks.Bird_Cage_Bronze);
                        entries.add(GOTBlocks.Bird_Cage_Gold);
                        entries.add(GOTBlocks.Bird_Cage_Iron);
                        entries.add(GOTBlocks.Bird_Cage_Silver);
                        entries.add(GOTBlocks.Bird_Cage_Wood);
                        entries.add(GOTBlocks.Amber_Gem_Block);
                        entries.add(GOTBlocks.Coral_Gem_Block);
                        entries.add(GOTBlocks.Opal_Gem_Block);
                        entries.add(GOTBlocks.Pearl_Gem_Block);
                        entries.add(GOTBlocks.Ruby_Gem_Block);
                        entries.add(GOTBlocks.Sapphire_Gem_Block);
                        entries.add(GOTBlocks.Topaz_Gem_Block);
                        entries.add(GOTBlocks.Bronze_Metal_Block);
                        entries.add(GOTBlocks.Saltpeter_Metal_Block);
                        entries.add(GOTBlocks.Silver_Metal_Block);
                        entries.add(GOTBlocks.Sulfur_Metal_Block);
                        entries.add(GOTBlocks.Tin_Metal_Block);
                        entries.add(GOTBlocks.Valyrian_Metal_Block);
                        entries.add(GOTBlocks.Alloy_Steel_Block);
                        entries.add(GOTBlocks.Gilded_Iron_Block);
                        entries.add(GOTBlocks.Salt_Metal_Block);
                        entries.add(GOTBlocks.Ceramic_Plate);
                        entries.add(GOTBlocks.Chandelier_Asshai);
                        entries.add(GOTBlocks.Chandelier_Bronze);
                        entries.add(GOTBlocks.Chandelier_Gold);
                        entries.add(GOTBlocks.Chandelier_Iron);
                        entries.add(GOTBlocks.Chandelier_Silver);
                        entries.add(GOTBlocks.Chandelier_Valyrian);
                        entries.add(GOTBlocks.Fur_Bed);
                        entries.add(GOTBlocks.Fuse);
                        entries.add(GOTBlocks.Fine_Glass);
                        entries.add(GOTBlocks.Fine_Glass_Pane);
                        entries.add(GOTBlocks.Hearth);

                    }).build());

    public static void registerModGroups() {
        GOT.LOGGER.debug("Registering Mod Groups for " + GOT.MOD_ID);
    }


}
