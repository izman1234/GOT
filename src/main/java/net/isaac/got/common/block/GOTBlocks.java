package net.isaac.got.common.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.isaac.got.GOT;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class GOTBlocks {
    public static final Block Alloy_Forge = registerBlock("alloy_forge",
            new FurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).strength(4.0f).requiresTool()));
    public static final Block Apple_Crumble = registerBlock("apple_crumble",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Arid_Grass = registerBlock("arid_grass",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Asshai_Bars = registerBlock("asshai_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(4.0f).requiresTool()));
    public static final Block Asshai_Dirt = registerBlock("asshai_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Asshai_Flower = registerBlock("asshai_flower",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY).requiresTool()));
    public static final Block Asshai_Grass = registerBlock("asshai_grass",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Asshai_Moss = registerBlock("asshai_moss",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).sounds(BlockSoundGroup.GRASS)));
    public static final Block Asshai_Thorn = registerBlock("asshai_thorn",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));
    public static final Block Asshai_Torch = registerBlock("asshai_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ParticleTypes.FLAME)); //CAN'T PLACE ON SIDE OF BLOCKS
    public static final Block Asshai_WallTorch = registerBlock("asshai_walltorch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ParticleTypes.FLAME));
    public static final Block Banana = registerBlock("banana",
            new GOTBananaBlock(FabricBlockSettings.copyOf(Blocks.COCOA)));
    public static final Block Banana_Cake = registerBlock("banana_cake",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Bank = registerBlock("bank",
            new GOTBank(FabricBlockSettings.copyOf(Blocks.DISPENSER).strength(4.0f).requiresTool())); //ADD CUSTOM UI + INCORPORATE THE BANK_ACTIVE.PNG
    public static final Block Basalt_Gravel = registerBlock("basalt_gravel",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));

    //ADD BERRY BUSHES
    public static final Block Berry_Pie = registerBlock("berry_pie",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Bird_Cage_Bronze = registerBlock("bird_cage_bronze",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block Bird_Cage_Gold = registerBlock("bird_cage_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block Bird_Cage_Iron = registerBlock("bird_cage_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Bird_Cage_Silver = registerBlock("bird_cage_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Bird_Cage_Wood = registerBlock("bird_cage_wood_wood",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Blackroot = registerBlock("blackroot",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));
    public static final Block Amber_Gem_Block = registerBlock("block_gem_amber",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block Coral_Gem_Block = registerBlock("block_gem_coral",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block Opal_Gem_Block = registerBlock("block_gem_opal",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block Pearl_Gem_Block = registerBlock("block_gem_pearl",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block Ruby_Gem_Block = registerBlock("block_gem_ruby",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block Sapphire_Gem_Block = registerBlock("block_gem_sapphire",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block Topaz_Gem_Block = registerBlock("block_gem_topaz",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block Bronze_Metal_Block = registerBlock("block_metal1_bronze",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block Saltpeter_Metal_Block = registerBlock("block_metal1_saltpeter",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block Silver_Metal_Block = registerBlock("block_metal1_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block Sulfur_Metal_Block = registerBlock("block_metal1_sulfur",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Tin_Metal_Block = registerBlock("block_metal1_tin",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Valyrian_Metal_Block = registerBlock("block_metal1_valyrian",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block Alloy_Steel_Block = registerBlock("block_metal2_alloy_steel",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Gilded_Iron_Block = registerBlock("block_metal2_gilded_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Salt_Metal_Block = registerBlock("block_metal2_salt",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block Bluebell = registerBlock("bluebell",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));

    //ADD BOMBS

    public static final Block Bone_Block = registerBlock("bone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)));
    public static final Block Bone_Block_Slab = registerBlock("bone_block_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).sounds(BlockSoundGroup.BONE)));
    public static final Block Bone_Block_Stairs = registerBlock("bone_block_stairs",
            new StairsBlock(Bone_Block.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).sounds(BlockSoundGroup.BONE)));
    public static final Block Bone_Block_Wall = registerBlock("bone_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).sounds(BlockSoundGroup.BONE)));
    public static final Block Andesite_Brick = registerBlock("brick1_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Andesite_Brick_Slab = registerBlock("brick1_andesite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Andesite_Brick_Stairs = registerBlock("brick1_andesite_stairs",
            new StairsBlock(Andesite_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Andesite_Brick_Wall = registerBlock("brick1_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Andesite_Brick_Carved = registerBlock("brick1_andesite_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Andesite_Brick_Carved_Slab = registerBlock("brick1_andesite_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Andesite_Brick_Carved_Stairs = registerBlock("brick1_andesite_carved_stairs",
            new StairsBlock(Andesite_Brick_Carved.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Andesite_Brick_Carved_Wall = registerBlock("brick1_andesite_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Andesite_Brick_Cracked = registerBlock("brick1_andesite_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Andesite_Brick_Cracked_Slab = registerBlock("brick1_andesite_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Andesite_Brick_Cracked_Stairs = registerBlock("brick1_andesite_cracked_stairs",
            new StairsBlock(Andesite_Brick_Cracked.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Andesite_Brick_Cracked_Wall = registerBlock("brick1_andesite_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Andesite_Brick_Mossy = registerBlock("brick1_andesite_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Andesite_Brick_Mossy_Slab = registerBlock("brick1_andesite_mossy_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Andesite_Brick_Mossy_Stairs = registerBlock("brick1_andesite_mossy_stairs",
            new StairsBlock(Andesite_Brick_Mossy.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Andesite_Brick_Mossy_Wall = registerBlock("brick1_andesite_mossy_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Basalt_Brick = registerBlock("brick1_basalt",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Brick_Slab = registerBlock("brick1_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Brick_Stairs = registerBlock("brick1_basalt_stairs",
            new StairsBlock(Blocks.BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Brick_Wall = registerBlock("brick1_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Basalt_Brick_Cracked = registerBlock("brick1_basalt_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Brick_Cracked_Slab = registerBlock("brick1_basalt_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Brick_Cracked_Stairs = registerBlock("brick1_basalt_cracked_stairs",
            new StairsBlock(Blocks.BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Brick_Cracked_Wall = registerBlock("brick1_basalt_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Diorite_Brick = registerBlock("brick1_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Diorite_Brick_Slab = registerBlock("brick1_diorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Diorite_Brick_Stairs = registerBlock("brick1_diorite_stairs",
            new StairsBlock(Blocks.DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Diorite_Brick_Wall = registerBlock("brick1_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Rhyolite_Brick = registerBlock("brick1_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Rhyolite_Brick_Slab = registerBlock("brick1_rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Rhyolite_Brick_Stairs = registerBlock("brick1_rhyolite_stairs",
            new StairsBlock(Blocks.DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Rhyolite_Brick_Wall = registerBlock("brick1_rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sandstone_Brick = registerBlock("brick1_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Sandstone_Brick_Slab = registerBlock("brick1_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Sandstone_Brick_Stairs = registerBlock("brick1_sandstone_stairs",
            new StairsBlock(Blocks.DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Sandstone_Brick_Wall = registerBlock("brick1_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Basalt_Carved_Brick = registerBlock("brick2_basalt_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Carved_Brick_Slab = registerBlock("brick2_basalt_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Carved_Brick_Stairs = registerBlock("brick2_basalt_carved_stairs",
            new StairsBlock(Blocks.DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Carved_Brick_Wall = registerBlock("brick2_basalt_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Basalt_Westeros_Brick = registerBlock("brick2_basalt_westeros",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Westeros_Brick_Slab = registerBlock("brick2_basalt_westeros_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Westeros_Brick_Stairs = registerBlock("brick2_basalt_westeros_stairs",
            new StairsBlock(Blocks.DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Westeros_Brick_Wall = registerBlock("brick2_basalt_westeros_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Ore_Cobalt = registerBlock("ore_cobalt",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE).strength(1.25F, 4.2F)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GOT.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        GOT.LOGGER.info("Registering ModBlocks for " + GOT.MOD_ID);
    }
}
