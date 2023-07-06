package net.isaac.got.common.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.isaac.got.GOT;
import net.isaac.got.common.world.tree.sapling.*;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class GOTBlocks {
    public static final Block Alloy_Forge = registerBlock("alloy_forge",
            new FurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).strength(4.0f).requiresTool()));
    public static final Block Apple_Crumble = registerBlock("apple_crumble",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Arid_Grass = registerBlock("arid_grass",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Asshai_Bars = registerBlock("asshai_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Asshai_Dirt = registerBlock("asshai_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Asshai_Flower = registerBlock("asshai_flower",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Asshai_Grass = registerBlock("asshai_grass",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Asshai_Moss = registerBlock("asshai_moss",
            new GOTMossBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).sounds(BlockSoundGroup.GRASS).nonOpaque()));
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
            new GOTBank(FabricBlockSettings.copyOf(Blocks.DISPENSER).strength(4.0f).requiresTool())); //TODO ADD CUSTOM UI + INCORPORATE THE BANK_ACTIVE.PNG
    public static final Block Basalt_Gravel = registerBlock("basalt_gravel",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));

    //TODO ADD BERRY BUSHES
    public static final Block Berry_Pie = registerBlock("berry_pie",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Bird_Cage_Bronze = registerBlock("bird_cage_bronze",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block Bird_Cage_Gold = registerBlock("bird_cage_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block Bird_Cage_Iron = registerBlock("bird_cage_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block Bird_Cage_Silver = registerBlock("bird_cage_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block Bird_Cage_Wood = registerBlock("bird_cage_wood_wood",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
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

    //TODO ADD BOMBS

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
            new StairsBlock(GOTBlocks.Basalt_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Brick_Wall = registerBlock("brick1_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Basalt_Brick_Cracked = registerBlock("brick1_basalt_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Brick_Cracked_Slab = registerBlock("brick1_basalt_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Brick_Cracked_Stairs = registerBlock("brick1_basalt_cracked_stairs",
            new StairsBlock(GOTBlocks.Basalt_Brick_Cracked.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Brick_Cracked_Wall = registerBlock("brick1_basalt_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Diorite_Brick = registerBlock("brick1_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Diorite_Brick_Slab = registerBlock("brick1_diorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Diorite_Brick_Stairs = registerBlock("brick1_diorite_stairs",
            new StairsBlock(GOTBlocks.Diorite_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Diorite_Brick_Wall = registerBlock("brick1_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Rhyolite_Brick = registerBlock("brick1_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Rhyolite_Brick_Slab = registerBlock("brick1_rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Rhyolite_Brick_Stairs = registerBlock("brick1_rhyolite_stairs",
            new StairsBlock(GOTBlocks.Rhyolite_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Rhyolite_Brick_Wall = registerBlock("brick1_rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sandstone_Brick = registerBlock("brick1_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Brick_Slab = registerBlock("brick1_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Brick_Stairs = registerBlock("brick1_sandstone_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Brick_Wall = registerBlock("brick1_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Basalt_Carved_Brick = registerBlock("brick2_basalt_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Carved_Brick_Slab = registerBlock("brick2_basalt_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Carved_Brick_Stairs = registerBlock("brick2_basalt_carved_stairs",
            new StairsBlock(GOTBlocks.Basalt_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Carved_Brick_Wall = registerBlock("brick2_basalt_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Basalt_Westeros_Brick = registerBlock("brick2_basalt_westeros",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Westeros_Brick_Slab = registerBlock("brick2_basalt_westeros_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Westeros_Brick_Stairs = registerBlock("brick2_basalt_westeros_stairs",
            new StairsBlock(GOTBlocks.Basalt_Westeros_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Westeros_Brick_Wall = registerBlock("brick2_basalt_westeros_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Granite_Brick = registerBlock("brick2_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Granite_Brick_Slab = registerBlock("brick2_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Granite_Brick_Stairs = registerBlock("brick2_granite_stairs",
            new StairsBlock(Blocks.GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Granite_Brick_Wall = registerBlock("brick2_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Diorite_Carved_Brick = registerBlock("brick3_diorite_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Diorite_Carved_Brick_Slab = registerBlock("brick3_diorite_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Diorite_Carved_Brick_Stairs = registerBlock("brick3_diorite_carved_stairs",
            new StairsBlock(GOTBlocks.Diorite_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Diorite_Carved_Brick_Wall = registerBlock("brick3_diorite_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Granite_Carved_Brick = registerBlock("brick3_granite_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Granite_Carved_Brick_Slab = registerBlock("brick3_granite_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Granite_Carved_Brick_Stairs = registerBlock("brick3_granite_carved_stairs",
            new StairsBlock(GOTBlocks.Granite_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Granite_Carved_Brick_Wall = registerBlock("brick3_granite_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Lhazar_Brick = registerBlock("brick3_lhazar",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Lhazar_Brick_Slab = registerBlock("brick3_lhazar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Lhazar_Brick_Stairs = registerBlock("brick3_lhazar_stairs",
            new StairsBlock(GOTBlocks.Lhazar_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Lhazar_Brick_Wall = registerBlock("brick3_lhazar_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sandstone_Carved_Brick = registerBlock("brick3_sandstone_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Carved_Brick_Slab = registerBlock("brick3_sandstone_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Carved_Brick_Stairs = registerBlock("brick3_sandstone_carved_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Carved_Brick_Wall = registerBlock("brick3_sandstone_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Sandstone_Cracked_Brick = registerBlock("brick3_sandstone_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Cracked_Brick_Slab = registerBlock("brick3_sandstone_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Cracked_Brick_Stairs = registerBlock("brick3_sandstone_cracked_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Cracked_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Cracked_Brick_Wall = registerBlock("brick3_sandstone_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Sandstone_Red_Brick = registerBlock("brick3_sandstone_red",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Red_Brick_Slab = registerBlock("brick3_sandstone_red_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Red_Brick_Stairs = registerBlock("brick3_sandstone_red_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Red_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Red_Brick_Wall = registerBlock("brick3_sandstone_red_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Sandstone_Red_Carved_Brick = registerBlock("brick3_sandstone_red_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Red_Carved_Brick_Slab = registerBlock("brick3_sandstone_red_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Red_Carved_Brick_Stairs = registerBlock("brick3_sandstone_red_carved_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Red_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Red_Carved_Brick_Wall = registerBlock("brick3_sandstone_red_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Sandstone_Red_Cracked_Brick = registerBlock("brick3_sandstone_red_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Red_Cracked_Brick_Slab = registerBlock("brick3_sandstone_red_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Red_Cracked_Brick_Stairs = registerBlock("brick3_sandstone_red_cracked_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Red_Cracked_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Red_Cracked_Brick_Wall = registerBlock("brick3_sandstone_red_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Basalt_Westeros_Carved_Brick = registerBlock("brick4_basalt_westeros_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Basalt_Westeros_Carved_Brick_Slab = registerBlock("brick4_basalt_westeros_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Basalt_Westeros_Carved_Brick_Stairs = registerBlock("brick4_basalt_westeros_carved_stairs",
            new StairsBlock(GOTBlocks.Basalt_Westeros_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Basalt_Westeros_Carved_Brick_Wall = registerBlock("brick4_basalt_westeros_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Chalk_Brick = registerBlock("brick4_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Chalk_Brick_Slab = registerBlock("brick4_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Chalk_Brick_Stairs = registerBlock("brick4_chalk_stairs",
            new StairsBlock(GOTBlocks.Chalk_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Chalk_Brick_Wall = registerBlock("brick4_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sandstone_Lapis_Brick = registerBlock("brick4_sandstone_lapis",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Sandstone_Lapis_Brick_Slab = registerBlock("brick4_sandstone_lapis_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Sandstone_Lapis_Brick_Stairs = registerBlock("brick4_sandstone_lapis_stairs",
            new StairsBlock(GOTBlocks.Sandstone_Lapis_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Sandstone_Lapis_Brick_Wall = registerBlock("brick4_sandstone_lapis_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Sothoryos_Brick = registerBlock("brick4_sothoryos",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Sothoryos_Brick_Slab = registerBlock("brick4_sothoryos_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Sothoryos_Brick_Stairs = registerBlock("brick4_sothoryos_stairs",
            new StairsBlock(GOTBlocks.Sothoryos_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Sothoryos_Brick_Wall = registerBlock("brick4_sothoryos_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sothoryos_Cracked_Brick = registerBlock("brick4_sothoryos_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Sothoryos_Cracked_Brick_Slab = registerBlock("brick4_sothoryos_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Sothoryos_Cracked_Brick_Stairs = registerBlock("brick4_sothoryos_cracked_stairs",
            new StairsBlock(GOTBlocks.Sothoryos_Cracked_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Sothoryos_Cracked_Brick_Wall = registerBlock("brick4_sothoryos_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sothoryos_Gold_Brick = registerBlock("brick4_sothoryos_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Sothoryos_Gold_Brick_Slab = registerBlock("brick4_sothoryos_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Sothoryos_Gold_Brick_Stairs = registerBlock("brick4_sothoryos_gold_stairs",
            new StairsBlock(GOTBlocks.Sothoryos_Gold_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Sothoryos_Gold_Brick_Wall = registerBlock("brick4_sothoryos_gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sothoryos_Mossy_Brick = registerBlock("brick4_sothoryos_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Sothoryos_Mossy_Brick_Slab = registerBlock("brick4_sothoryos_mossy_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Sothoryos_Mossy_Brick_Stairs = registerBlock("brick4_sothoryos_mossy_stairs",
            new StairsBlock(GOTBlocks.Sothoryos_Mossy_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Sothoryos_Mossy_Brick_Wall = registerBlock("brick4_sothoryos_mossy_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Sothoryos_Obsidian_Brick = registerBlock("brick4_sothoryos_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Sothoryos_Obsidian_Brick_Slab = registerBlock("brick4_sothoryos_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Sothoryos_Obsidian_Brick_Stairs = registerBlock("brick4_sothoryos_obsidian_stairs",
            new StairsBlock(GOTBlocks.Sothoryos_Obsidian_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Sothoryos_Obsidian_Brick_Wall = registerBlock("brick4_sothoryos_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Rhyolite_Carved_Brick = registerBlock("brick5_rhyolite_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Rhyolite_Carved_Brick_Slab = registerBlock("brick5_rhyolite_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Rhyolite_Carved_Brick_Stairs = registerBlock("brick5_rhyolite_carved_stairs",
            new StairsBlock(GOTBlocks.Rhyolite_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Rhyolite_Carved_Brick_Wall = registerBlock("brick5_rhyolite_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Yiti_Brick = registerBlock("brick5_yiti",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Brick_Slab = registerBlock("brick5_yiti_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Brick_Stairs = registerBlock("brick5_yiti_stairs",
            new StairsBlock(GOTBlocks.Yiti_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Brick_Wall = registerBlock("brick5_yiti_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Yiti_Carved_Brick = registerBlock("brick5_yiti_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Carved_Brick_Slab = registerBlock("brick5_yiti_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Carved_Brick_Stairs = registerBlock("brick5_yiti_carved_stairs",
            new StairsBlock(GOTBlocks.Yiti_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Carved_Brick_Wall = registerBlock("brick5_yiti_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Yiti_Cracked_Brick = registerBlock("brick5_yiti_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Cracked_Brick_Slab = registerBlock("brick5_yiti_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Cracked_Brick_Stairs = registerBlock("brick5_yiti_cracked_stairs",
            new StairsBlock(GOTBlocks.Yiti_Cracked_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Cracked_Brick_Wall = registerBlock("brick5_yiti_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Yiti_Flowers_Brick = registerBlock("brick5_yiti_flowers",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Flowers_Brick_Slab = registerBlock("brick5_yiti_flowers_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Flowers_Brick_Stairs = registerBlock("brick5_yiti_flowers_stairs",
            new StairsBlock(GOTBlocks.Yiti_Flowers_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Flowers_Brick_Wall = registerBlock("brick5_yiti_flowers_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Yiti_Mossy_Brick = registerBlock("brick5_yiti_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Mossy_Brick_Slab = registerBlock("brick5_yiti_mossy_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Mossy_Brick_Stairs = registerBlock("brick5_yiti_mossy_stairs",
            new StairsBlock(GOTBlocks.Yiti_Mossy_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Mossy_Brick_Wall = registerBlock("brick5_yiti_mossy_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Labradorite_Brick = registerBlock("brick6_labradorite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Labradorite_Brick_Slab = registerBlock("brick6_labradorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Labradorite_Brick_Stairs = registerBlock("brick6_labradorite_stairs",
            new StairsBlock(GOTBlocks.Labradorite_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Labradorite_Brick_Wall = registerBlock("brick6_labradorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Labradorite_Carved_Brick = registerBlock("brick6_labradorite_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Labradorite_Carved_Brick_Slab = registerBlock("brick6_labradorite_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Labradorite_Carved_Brick_Stairs = registerBlock("brick6_labradorite_carved_stairs",
            new StairsBlock(GOTBlocks.Labradorite_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Labradorite_Carved_Brick_Wall = registerBlock("brick6_labradorite_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Labradorite_Cracked_Brick = registerBlock("brick6_labradorite_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Labradorite_Cracked_Brick_Slab = registerBlock("brick6_labradorite_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Labradorite_Cracked_Brick_Stairs = registerBlock("brick6_labradorite_cracked_stairs",
            new StairsBlock(GOTBlocks.Labradorite_Cracked_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Labradorite_Cracked_Brick_Wall = registerBlock("brick6_labradorite_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Labradorite_Mossy_Brick = registerBlock("brick6_labradorite_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Labradorite_Mossy_Brick_Slab = registerBlock("brick6_labradorite_mossy_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block Labradorite_Mossy_Brick_Stairs = registerBlock("brick6_labradorite_mossy_stairs",
            new StairsBlock(GOTBlocks.Labradorite_Mossy_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block Labradorite_Mossy_Brick_Wall = registerBlock("brick6_labradorite_mossy_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block Swords_Brick = registerBlock("brick6_swords",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block Yiti_Gold_Brick = registerBlock("brick6_yiti_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Gold_Brick_Slab = registerBlock("brick6_yiti_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Gold_Brick_Stairs = registerBlock("brick6_yiti_gold_stairs",
            new StairsBlock(GOTBlocks.Yiti_Gold_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Gold_Brick_Wall = registerBlock("brick6_yiti_gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Yiti_Granite_Brick = registerBlock("brick6_yiti_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Granite_Brick_Slab = registerBlock("brick6_yiti_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Granite_Brick_Stairs = registerBlock("brick6_yiti_granite_stairs",
            new StairsBlock(GOTBlocks.Yiti_Granite_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Granite_Brick_Wall = registerBlock("brick6_yiti_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Yiti_Granite_Carved_Brick = registerBlock("brick6_yiti_granite_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block Yiti_Granite_Carved_Brick_Slab = registerBlock("brick6_yiti_granite_carved_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block Yiti_Granite_Carved_Brick_Stairs = registerBlock("brick6_yiti_granite_carved_stairs",
            new StairsBlock(GOTBlocks.Yiti_Granite_Carved_Brick.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block Yiti_Granite_Carved_Brick_Wall = registerBlock("brick6_yiti_granite_carved_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));
    public static final Block Ice_Brick = registerBlock("brick_ice",
            new Block(FabricBlockSettings.copyOf(Blocks.ICE)));
    public static final Block Bronze_Bars = registerBlock("bronze_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    //TODO ADD BUTTERFLY JAR

    public static final Block Ceramic_Plate = registerBlock("ceramic_plate",
            new GOTPlateBlock(FabricBlockSettings.copyOf(Blocks.DECORATED_POT)));
    public static final Block Chandelier_Asshai = registerBlock("chandelier_asshai",
            new GOTChandelierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().breakInstantly().luminance((state) -> {
                return 14;}).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ParticleTypes.EFFECT)); //FIX COLORS
    public static final Block Chandelier_Bronze = registerBlock("chandelier_bronze",
            new GOTChandelierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().breakInstantly().luminance((state) -> {
                return 14;}).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ParticleTypes.FLAME));
    public static final Block Chandelier_Gold = registerBlock("chandelier_gold",
            new GOTChandelierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().breakInstantly().luminance((state) -> {
                return 14;}).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ParticleTypes.FLAME));
    public static final Block Chandelier_Iron = registerBlock("chandelier_iron",
            new GOTChandelierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().breakInstantly().luminance((state) -> {
                return 14;}).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ParticleTypes.FLAME));
    public static final Block Chandelier_Silver = registerBlock("chandelier_silver",
            new GOTChandelierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().breakInstantly().luminance((state) -> {
                return 14;}).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ParticleTypes.FLAME));
    public static final Block Chandelier_Valyrian = registerBlock("chandelier_valyrian",
            new GOTChandelierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().breakInstantly().luminance((state) -> {
                return 14;}).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ParticleTypes.FLAME));
    public static final Block Cherry_Pie = registerBlock("cherry_pie",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Clay_Tile = registerBlock("clay_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab = registerBlock("clay_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs = registerBlock("clay_tile_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall = registerBlock("clay_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Black = registerBlock("clay_tile_dyed_black",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Black = registerBlock("clay_tile_dyed_black_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Black = registerBlock("clay_tile_dyed_black_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Black.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Black = registerBlock("clay_tile_dyed_black_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Blue = registerBlock("clay_tile_dyed_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Blue = registerBlock("clay_tile_dyed_blue_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Blue = registerBlock("clay_tile_dyed_blue_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Blue.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Blue = registerBlock("clay_tile_dyed_blue_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Brown = registerBlock("clay_tile_dyed_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Brown = registerBlock("clay_tile_dyed_brown_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Brown = registerBlock("clay_tile_dyed_brown_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Brown.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Brown = registerBlock("clay_tile_dyed_brown_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Cyan = registerBlock("clay_tile_dyed_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Cyan = registerBlock("clay_tile_dyed_cyan_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Cyan = registerBlock("clay_tile_dyed_cyan_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Cyan.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Cyan = registerBlock("clay_tile_dyed_cyan_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Gray = registerBlock("clay_tile_dyed_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Gray = registerBlock("clay_tile_dyed_gray_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Gray = registerBlock("clay_tile_dyed_gray_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Gray.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Gray = registerBlock("clay_tile_dyed_gray_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Green = registerBlock("clay_tile_dyed_green",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Green = registerBlock("clay_tile_dyed_green_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Green = registerBlock("clay_tile_dyed_green_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Green.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Green = registerBlock("clay_tile_dyed_green_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Light_Blue = registerBlock("clay_tile_dyed_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Light_Blue = registerBlock("clay_tile_dyed_light_blue_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Light_Blue = registerBlock("clay_tile_dyed_light_blue_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Light_Blue.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Light_Blue = registerBlock("clay_tile_dyed_light_blue_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Lime = registerBlock("clay_tile_dyed_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Lime = registerBlock("clay_tile_dyed_lime_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Lime = registerBlock("clay_tile_dyed_lime_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Lime.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Lime = registerBlock("clay_tile_dyed_lime_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Magenta = registerBlock("clay_tile_dyed_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Magenta = registerBlock("clay_tile_dyed_magenta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Magenta = registerBlock("clay_tile_dyed_magenta_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Magenta.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Magenta = registerBlock("clay_tile_dyed_magenta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Orange = registerBlock("clay_tile_dyed_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Orange = registerBlock("clay_tile_dyed_orange_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Orange = registerBlock("clay_tile_dyed_orange_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Orange.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Orange = registerBlock("clay_tile_dyed_orange_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Pink = registerBlock("clay_tile_dyed_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Pink = registerBlock("clay_tile_dyed_pink_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Pink = registerBlock("clay_tile_dyed_pink_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Pink.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Pink = registerBlock("clay_tile_dyed_pink_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Purple = registerBlock("clay_tile_dyed_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Purple = registerBlock("clay_tile_dyed_purple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Purple = registerBlock("clay_tile_dyed_purple_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Purple.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Purple = registerBlock("clay_tile_dyed_purple_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Red = registerBlock("clay_tile_dyed_red",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Red = registerBlock("clay_tile_dyed_red_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Red = registerBlock("clay_tile_dyed_red_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Red.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Red = registerBlock("clay_tile_dyed_red_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Silver = registerBlock("clay_tile_dyed_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Silver = registerBlock("clay_tile_dyed_silver_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Silver = registerBlock("clay_tile_dyed_silver_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Silver.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Silver = registerBlock("clay_tile_dyed_silver_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_White = registerBlock("clay_tile_dyed_white",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_White = registerBlock("clay_tile_dyed_white_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_White = registerBlock("clay_tile_dyed_white_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_White.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_White = registerBlock("clay_tile_dyed_white_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));
    public static final Block Clay_Tile_Dyed_Yellow = registerBlock("clay_tile_dyed_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block Clay_Tile_Slab_Dyed_Yellow = registerBlock("clay_tile_dyed_yellow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB)));
    public static final Block Clay_Tile_Stairs_Dyed_Yellow = registerBlock("clay_tile_dyed_yellow_stairs",
            new StairsBlock(GOTBlocks.Clay_Tile_Dyed_Yellow.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS)));
    public static final Block Clay_Tile_Wall_Dyed_Yellow = registerBlock("clay_tile_dyed_yellow_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_WALL)));

    //TODO ADD CLOVER

    //TODO ADD COBBLEBRICK (COOL TEXTURE MERGING)

    //TODO ADD COMMAND TABLE

    public static final Block Corn_Stalk = registerBlock("corn_stalk",
            new GOTCornBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Corn_Stalk_Corn = registerBlock("corn_stalk_corn",   //FIX THESE TWO. NOT WORKING AS INTENDED
            new GOTCornBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Cucumber = registerBlock("cucumber",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Date = registerBlock("date",
            new GOTDateBlock(FabricBlockSettings.copyOf(Blocks.COCOA)));

    //TODO ADD DAUB (COOL TEXTURE MERGING)

    public static final Block Dead_Marsh_Plant = registerBlock("dead_marsh_plant",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));
    public static final Block Bruschatka = registerBlock("dirt_path_brus",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Bruschatka_Slab = registerBlock("dirt_path_brus_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Dirt_Path = registerBlock("dirt_path_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Dirt_Path_Slab = registerBlock("dirt_path_dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Jungle_Mud_Path = registerBlock("dirt_path_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block Jungle_Mud_Path_Slab = registerBlock("dirt_path_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block Almond_Door = registerBlock("door_almond",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Apple_Door = registerBlock("door_apple",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Aramant_Door = registerBlock("door_aramant",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Aspen_Door = registerBlock("door_aspen",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Banana_Door = registerBlock("door_banana",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Baobab_Door = registerBlock("door_baobab",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Beech_Door = registerBlock("door_beech",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Catalpa_Door = registerBlock("door_catalpa",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Cedar_Door = registerBlock("door_cedar",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Charred_Door = registerBlock("door_charred",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Cherry_Door = registerBlock("door_cherry",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Chestnut_Door = registerBlock("door_chestnut",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Cypress_Door = registerBlock("door_cypress",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Date_Palm_Door = registerBlock("door_date_palm",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Dragon_Door = registerBlock("door_dragon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Fir_Door = registerBlock("door_fir",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Fotinia_Door = registerBlock("door_fotinia",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Green_Oak_Door = registerBlock("door_green_oak",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Holly_Door = registerBlock("door_holly",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Ibbinia_Door = registerBlock("door_ibbinia",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Kanuka_Door = registerBlock("door_kanuka",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Larch_Door = registerBlock("door_larch",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Lemon_Door = registerBlock("door_lemon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Lime_Door = registerBlock("door_lime",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Mahogany_Door = registerBlock("door_mahogany",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Mango_Door = registerBlock("door_mango",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Mangrove_Door = registerBlock("door_mangrove",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Maple_Door = registerBlock("door_maple",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Olive_Door = registerBlock("door_olive",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Orange_Door = registerBlock("door_orange",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Palm_Door = registerBlock("door_palm",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Pear_Door = registerBlock("door_pear",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Pine_Door = registerBlock("door_pine",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Plum_Door = registerBlock("door_plum",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Pomegranate_Door = registerBlock("door_pomegranate",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Redwood_Door = registerBlock("door_redwood",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Rotten_Door = registerBlock("door_rotten",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Ulthos_Door = registerBlock("door_ulthos",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Weirwood_Door = registerBlock("door_weirwood",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Willow_Door = registerBlock("door_willow",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block Double_Flower_Black_Iris = registerBlock("double_flower_black_iris",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY)));
    public static final Block Double_Flower_Pink = registerBlock("double_flower_pink",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY)));
    public static final Block Double_Flower_Red = registerBlock("double_flower_red",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY)));
    public static final Block Double_Flower_Yellow_Iris = registerBlock("double_flower_yellow_iris",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY)));

    //TODO ADD DRIED REEDS (3 BLOCK TALL PLANT)

    public static final Block Essos_Flower_Daisy = registerBlock("essos_flower_daisy",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Essos_Flower_Pink = registerBlock("essos_flower_pink",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Essos_Flower_Red = registerBlock("essos_flower_red",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Essos_Flower_Red2 = registerBlock("essos_flower_red_a_l_t",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Essos_Flower_Yellow = registerBlock("essos_flower_yellow",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Flax = registerBlock("flax",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Fruit_Leaves_Apple = registerBlock("fruit_leaves_apple_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Fruit_Leaves_Cherry = registerBlock("fruit_leaves_cherry_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Fruit_Leaves_Mango = registerBlock("fruit_leaves_mango_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Fruit_Leaves_Pear = registerBlock("fruit_leaves_pear_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Fruit_Sapling_Apple = registerBlock("fruit_sapling_apple",
            new SaplingBlock(new FruitAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Fruit_Sapling_Cherry = registerBlock("fruit_sapling_cherry",
            new SaplingBlock(new FruitCherrySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Fruit_Sapling_Mango = registerBlock("fruit_sapling_mango",
            new SaplingBlock(new FruitMangoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Fruit_Sapling_Pear = registerBlock("fruit_sapling_pear",
            new SaplingBlock(new FruitPearSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Fruit_Wood_Apple = registerBlock("fruit_wood_apple",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fruit_Wood_Cherry = registerBlock("fruit_wood_cherry",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fruit_Wood_Mango = registerBlock("fruit_wood_mango",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fruit_Wood_Pear = registerBlock("fruit_wood_pear",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fur_Bed = registerBlock("fur_bed",
            new BedBlock(DyeColor.BROWN, (FabricBlockSettings.copyOf(Blocks.BROWN_BED)))); //TODO Fix bed model and textures
    public static final Block Fuse = registerBlock("fuse",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).sounds(BlockSoundGroup.WOOD)));

    //TODO ADD GATES

    public static final Block Fine_Glass = registerBlock("glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Fine_Glass_Pane = registerBlock("glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Gold_Bars = registerBlock("gold_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    //TODO ADD GRAPEVINES

    public static final Block Hearth = registerBlock("hearth",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Kebab_Block = registerBlock("kebab_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Catalpa_Leaves = registerBlock("leaves1_catalpa_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Ibbinia_Leaves = registerBlock("leaves1_ibbinia_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Ulthos_Leaves = registerBlock("leaves1_ulthos_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Ulthos_Red_Leaves = registerBlock("leaves1_ulthos_red_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Aramant_Leaves = registerBlock("leaves2_aramant_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Banana_Leaves = registerBlock("leaves2_banana_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Beech_Leaves = registerBlock("leaves2_beech_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Holly_Leaves = registerBlock("leaves2_holly_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Date_Palm_Leaves = registerBlock("leaves3_date_palm_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Larch_Leaves = registerBlock("leaves3_larch_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Mangrove_Leaves = registerBlock("leaves3_mangrove_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Maple_Leaves = registerBlock("leaves3_maple_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Baobab_Leaves = registerBlock("leaves4_baobab_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Cedar_Leaves = registerBlock("leaves4_cedar_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Chestnut_Leaves = registerBlock("leaves4_chestnut_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Fir_Leaves = registerBlock("leaves4_fir_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Lemon_Leaves = registerBlock("leaves5_lemon_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Lime_Leaves = registerBlock("leaves5_lime_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Orange_Leaves = registerBlock("leaves5_orange_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Pine_Leaves = registerBlock("leaves5_pine_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Cypress_Leaves = registerBlock("leaves6_cypress_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Mahogany_Leaves = registerBlock("leaves6_mahogany_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Olive_Leaves = registerBlock("leaves6_olive_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Willow_Leaves = registerBlock("leaves6_willow_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Almond_Leaves = registerBlock("leaves7_almond_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Aspen_Leaves = registerBlock("leaves7_aspen_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Fotinia_Leaves = registerBlock("leaves7_fotinia_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Green_Oak_Leaves = registerBlock("leaves7_green_oak_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Palm_Leaves = registerBlock("leaves8_palm_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Plum_Leaves = registerBlock("leaves8_plum_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Pomegranate_Leaves = registerBlock("leaves8_pomegranate_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Redwood_Leaves = registerBlock("leaves8_redwood_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Dragon_Leaves = registerBlock("leaves9_dragon_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Kanuka_Leaves = registerBlock("leaves9_kanuka_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Weirwood_Leaves = registerBlock("leaves9_weirwood_fancy",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));


    //TODO WTF TO DO WITH leaves_snowy??

    public static final Block Leek = registerBlock("leek",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Lemon_Cake = registerBlock("lemon_cake",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block Lettuce = registerBlock("lettuce",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    //TODO ADD LION BED

    public static final Block Marigold = registerBlock("marigold",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));

    public static final Block Marzipan = registerBlock("marzipan", //TODO FIX TEXTURES
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));

    //TODO ADD MILLSTONE

    public static final Block Mirk_Vines = registerBlock("mirk_vines", //TODO TEXTURE ISN'T QUITE RIGHT
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));
    public static final Block Mud = registerBlock("mud",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block Mud_Farmland = registerBlock("mud_farmland",  //TODO ALLOW PLANTS TO GROW ON IT
            new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.FARMLAND).sounds(BlockSoundGroup.MUD)));
    public static final Block Mud_Grass = registerBlock("mud_grass",
            new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.MUD)));
    public static final Block Obsidian_Gravel = registerBlock("obsidian_gravel",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block Ore_Cobalt = registerBlock("ore_cobalt",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block Ore_Gem_Amber = registerBlock("ore_gem_amber",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Gem_Opal = registerBlock("ore_gem_opal",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Gem_Ruby = registerBlock("ore_gem_ruby",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Gem_Sapphire = registerBlock("ore_gem_sapphire",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Gem_Topaz = registerBlock("ore_gem_topaz",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Glowstone = registerBlock("ore_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Salt = registerBlock("ore_salt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Saltpeter = registerBlock("ore_saltpeter",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Silver = registerBlock("ore_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Sulfur = registerBlock("ore_sulfur",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Tin = registerBlock("ore_tin",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Ore_Valyrian = registerBlock("ore_valyrian",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block Oven = registerBlock("oven",
            new FurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)));
    public static final Block Pastry = registerBlock("pastry",
            new GOTCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE))); //TODO FIX TEXTURES

    //TODO ADD PILLAR BLOCK (HAVE COOL TEXTURE MERGE THING)

    public static final Block Pipeweed = registerBlock("pipeweed",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    //TODO ADD FENCE_GATES FOR EACH WOOD TYPE

    public static final Block Apple_Planks = registerBlock("planks1_apple",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Apple_Fence = registerBlock("planks1_apple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Apple_Slab = registerBlock("planks1_apple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Apple_Stairs = registerBlock("planks1_apple_stairs",
            new StairsBlock(GOTBlocks.Apple_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aramant_Planks = registerBlock("planks1_aramant",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aramant_Fence = registerBlock("planks1_aramant_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aramant_Slab = registerBlock("planks1_aramant_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aramant_Stairs = registerBlock("planks1_aramant_stairs",
            new StairsBlock(GOTBlocks.Aramant_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Banana_Planks = registerBlock("planks1_banana",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Banana_Fence = registerBlock("planks1_banana_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Banana_Slab = registerBlock("planks1_banana_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Banana_Stairs = registerBlock("planks1_banana_stairs",
            new StairsBlock(GOTBlocks.Banana_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Beech_Planks = registerBlock("planks1_beech",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Beech_Fence = registerBlock("planks1_beech_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Beech_Slab = registerBlock("planks1_beech_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Beech_Stairs = registerBlock("planks1_beech_stairs",
            new StairsBlock(GOTBlocks.Beech_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Catalpa_Planks = registerBlock("planks1_catalpa",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Catalpa_Fence = registerBlock("planks1_catalpa_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Catalpa_Slab = registerBlock("planks1_catalpa_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Catalpa_Stairs = registerBlock("planks1_catalpa_stairs",
            new StairsBlock(GOTBlocks.Catalpa_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Charred_Planks = registerBlock("planks1_charred",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Charred_Fence = registerBlock("planks1_charred_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Charred_Slab = registerBlock("planks1_charred_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Charred_Stairs = registerBlock("planks1_charred_stairs",
            new StairsBlock(GOTBlocks.Charred_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cherry_Planks = registerBlock("planks1_cherry",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cherry_Fence = registerBlock("planks1_cherry_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cherry_Slab = registerBlock("planks1_cherry_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cherry_Stairs = registerBlock("planks1_cherry_stairs",
            new StairsBlock(GOTBlocks.Cherry_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Date_Palm_Planks = registerBlock("planks1_date_palm",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Date_Palm_Fence = registerBlock("planks1_date_palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Date_Palm_Slab = registerBlock("planks1_date_palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Date_Palm_Stairs = registerBlock("planks1_date_palm_stairs",
            new StairsBlock(GOTBlocks.Date_Palm_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Holly_Planks = registerBlock("planks1_holly",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Holly_Fence = registerBlock("planks1_holly_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Holly_Slab = registerBlock("planks1_holly_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Holly_Stairs = registerBlock("planks1_holly_stairs",
            new StairsBlock(GOTBlocks.Holly_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ibbinia_Planks = registerBlock("planks1_ibbinia",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ibbinia_Fence = registerBlock("planks1_ibbinia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ibbinia_Slab = registerBlock("planks1_ibbinia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ibbinia_Stairs = registerBlock("planks1_ibbinia_stairs",
            new StairsBlock(GOTBlocks.Ibbinia_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Larch_Planks = registerBlock("planks1_larch",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Larch_Fence = registerBlock("planks1_larch_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Larch_Slab = registerBlock("planks1_larch_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Larch_Stairs = registerBlock("planks1_larch_stairs",
            new StairsBlock(GOTBlocks.Larch_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mango_Planks = registerBlock("planks1_mango",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mango_Fence = registerBlock("planks1_mango_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mango_Slab = registerBlock("planks1_mango_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mango_Stairs = registerBlock("planks1_mango_stairs",
            new StairsBlock(GOTBlocks.Mango_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mangrove_Planks = registerBlock("planks1_mangrove",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mangrove_Fence = registerBlock("planks1_mangrove_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mangrove_Slab = registerBlock("planks1_mangrove_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mangrove_Stairs = registerBlock("planks1_mangrove_stairs",
            new StairsBlock(GOTBlocks.Mangrove_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Maple_Planks = registerBlock("planks1_maple",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Maple_Fence = registerBlock("planks1_maple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Maple_Slab = registerBlock("planks1_maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Maple_Stairs = registerBlock("planks1_maple_stairs",
            new StairsBlock(GOTBlocks.Maple_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pear_Planks = registerBlock("planks1_pear",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pear_Fence = registerBlock("planks1_pear_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pear_Slab = registerBlock("planks1_pear_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pear_Stairs = registerBlock("planks1_pear_stairs",
            new StairsBlock(GOTBlocks.Pear_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ulthos_Planks = registerBlock("planks1_ulthos",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ulthos_Fence = registerBlock("planks1_ulthos_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ulthos_Slab = registerBlock("planks1_ulthos_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Ulthos_Stairs = registerBlock("planks1_ulthos_stairs",
            new StairsBlock(GOTBlocks.Ulthos_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Almond_Planks = registerBlock("planks2_almond",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Almond_Fence = registerBlock("planks2_almond_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Almond_Slab = registerBlock("planks2_almond_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Almond_Stairs = registerBlock("planks2_almond_stairs",
            new StairsBlock(GOTBlocks.Almond_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aspen_Planks = registerBlock("planks2_aspen",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aspen_Fence = registerBlock("planks2_aspen_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aspen_Slab = registerBlock("planks2_aspen_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Aspen_Stairs = registerBlock("planks2_aspen_stairs",
            new StairsBlock(GOTBlocks.Aspen_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Baobab_Planks = registerBlock("planks2_baobab",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Baobab_Fence = registerBlock("planks2_baobab_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Baobab_Slab = registerBlock("planks2_baobab_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Baobab_Stairs = registerBlock("planks2_baobab_stairs",
            new StairsBlock(GOTBlocks.Baobab_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cedar_Planks = registerBlock("planks2_cedar",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cedar_Fence = registerBlock("planks2_cedar_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cedar_Slab = registerBlock("planks2_cedar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cedar_Stairs = registerBlock("planks2_cedar_stairs",
            new StairsBlock(GOTBlocks.Cedar_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Chestnut_Planks = registerBlock("planks2_chestnut",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Chestnut_Fence = registerBlock("planks2_chestnut_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Chestnut_Slab = registerBlock("planks2_chestnut_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Chestnut_Stairs = registerBlock("planks2_chestnut_stairs",
            new StairsBlock(GOTBlocks.Chestnut_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cypress_Planks = registerBlock("planks2_cypress",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cypress_Fence = registerBlock("planks2_cypress_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cypress_Slab = registerBlock("planks2_cypress_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Cypress_Stairs = registerBlock("planks2_cypress_stairs",
            new StairsBlock(GOTBlocks.Cypress_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fir_Planks = registerBlock("planks2_fir",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fir_Fence = registerBlock("planks2_fir_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fir_Slab = registerBlock("planks2_fir_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fir_Stairs = registerBlock("planks2_fir_stairs",
            new StairsBlock(GOTBlocks.Fir_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fotinia_Planks = registerBlock("planks2_fotinia",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fotinia_Fence = registerBlock("planks2_fotinia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fotinia_Slab = registerBlock("planks2_fotinia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Fotinia_Stairs = registerBlock("planks2_fotinia_stairs",
            new StairsBlock(GOTBlocks.Fotinia_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Green_Oak_Planks = registerBlock("planks2_green_oak",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Green_Oak_Fence = registerBlock("planks2_green_oak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Green_Oak_Slab = registerBlock("planks2_green_oak_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Green_Oak_Stairs = registerBlock("planks2_green_oak_stairs",
            new StairsBlock(GOTBlocks.Green_Oak_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lemon_Planks = registerBlock("planks2_lemon",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lemon_Fence = registerBlock("planks2_lemon_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lemon_Slab = registerBlock("planks2_lemon_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lemon_Stairs = registerBlock("planks2_lemon_stairs",
            new StairsBlock(GOTBlocks.Lemon_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lime_Planks = registerBlock("planks2_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lime_Fence = registerBlock("planks2_lime_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lime_Slab = registerBlock("planks2_lime_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Lime_Stairs = registerBlock("planks2_lime_stairs",
            new StairsBlock(GOTBlocks.Lime_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mahogany_Planks = registerBlock("planks2_mahogany",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mahogany_Fence = registerBlock("planks2_mahogany_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mahogany_Slab = registerBlock("planks2_mahogany_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Mahogany_Stairs = registerBlock("planks2_mahogany_stairs",
            new StairsBlock(GOTBlocks.Mahogany_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Olive_Planks = registerBlock("planks2_olive",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Olive_Fence = registerBlock("planks2_olive_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Olive_Slab = registerBlock("planks2_olive_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Olive_Stairs = registerBlock("planks2_olive_stairs",
            new StairsBlock(GOTBlocks.Olive_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Orange_Planks = registerBlock("planks2_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Orange_Fence = registerBlock("planks2_orange_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Orange_Slab = registerBlock("planks2_orange_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Orange_Stairs = registerBlock("planks2_orange_stairs",
            new StairsBlock(GOTBlocks.Orange_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pine_Planks = registerBlock("planks2_pine",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pine_Fence = registerBlock("planks2_pine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pine_Slab = registerBlock("planks2_pine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pine_Stairs = registerBlock("planks2_pine_stairs",
            new StairsBlock(GOTBlocks.Pine_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Willow_Planks = registerBlock("planks2_willow",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Willow_Fence = registerBlock("planks2_willow_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Willow_Slab = registerBlock("planks2_willow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Willow_Stairs = registerBlock("planks2_willow_stairs",
            new StairsBlock(GOTBlocks.Willow_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Dragon_Planks = registerBlock("planks3_dragon",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Dragon_Fence = registerBlock("planks3_dragon_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Dragon_Slab = registerBlock("planks3_dragon_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Dragon_Stairs = registerBlock("planks3_dragon_stairs",
            new StairsBlock(GOTBlocks.Dragon_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Kanuka_Planks = registerBlock("planks3_kanuka",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Kanuka_Fence = registerBlock("planks3_kanuka_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Kanuka_Slab = registerBlock("planks3_kanuka_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Kanuka_Stairs = registerBlock("planks3_kanuka_stairs",
            new StairsBlock(GOTBlocks.Kanuka_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Palm_Planks = registerBlock("planks3_palm",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Palm_Fence = registerBlock("planks3_palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Palm_Slab = registerBlock("planks3_palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Palm_Stairs = registerBlock("planks3_palm_stairs",
            new StairsBlock(GOTBlocks.Palm_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Plum_Planks = registerBlock("planks3_plum",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Plum_Fence = registerBlock("planks3_plum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Plum_Slab = registerBlock("planks3_plum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Plum_Stairs = registerBlock("planks3_plum_stairs",
            new StairsBlock(GOTBlocks.Plum_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pomegranate_Planks = registerBlock("planks3_pomegranate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pomegranate_Fence = registerBlock("planks3_pomegranate_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pomegranate_Slab = registerBlock("planks3_pomegranate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Pomegranate_Stairs = registerBlock("planks3_pomegranate_stairs",
            new StairsBlock(GOTBlocks.Pomegranate_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Redwood_Planks = registerBlock("planks3_redwood",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Redwood_Fence = registerBlock("planks3_redwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Redwood_Slab = registerBlock("planks3_redwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Redwood_Stairs = registerBlock("planks3_redwood_stairs",
            new StairsBlock(GOTBlocks.Redwood_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Weirwood_Planks = registerBlock("planks3_weirwood",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Weirwood_Fence = registerBlock("planks3_weirwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Weirwood_Slab = registerBlock("planks3_weirwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Weirwood_Stairs = registerBlock("planks3_weirwood_stairs",
            new StairsBlock(GOTBlocks.Weirwood_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Rotten_Planks = registerBlock("planks_rotten_rotten",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Rotten_Fence = registerBlock("planks_rotten_rotten_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Rotten_Slab = registerBlock("planks_rotten_rotten_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Rotten_Stairs = registerBlock("planks_rotten_rotten_stairs",
            new StairsBlock(GOTBlocks.Rotten_Planks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    //TODO ADD PLANTAIN

    public static final Block Plate = registerBlock("plate",
            new GOTPlateBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Quagmire = registerBlock("quagmire",
            new CobwebBlock(FabricBlockSettings.copyOf(Blocks.COBWEB).sounds(BlockSoundGroup.SAND)));
    public static final Block Quicksand = registerBlock("quicksand",
            new CobwebBlock(FabricBlockSettings.copyOf(Blocks.COBWEB).sounds(BlockSoundGroup.SAND)));
    public static final Block Red_Brick_Cracked = registerBlock("red_brick_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Cracked_Slab = registerBlock("red_brick_cracked_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Cracked_Stairs = registerBlock("red_brick_cracked_stairs",
            new StairsBlock(Red_Brick_Cracked.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Cracked_Wall = registerBlock("red_brick_cracked_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Mossy = registerBlock("red_brick_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Mossy_Slab = registerBlock("red_brick_mossy_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Mossy_Stairs = registerBlock("red_brick_mossy_stairs",
            new StairsBlock(Red_Brick_Mossy.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block Red_Brick_Mossy_Wall = registerBlock("red_brick_mossy_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    //TODO ADD RED SANDSTONE MAYBE
    public static final Block Reed_Bars = registerBlock("reed_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Remains = registerBlock("remains",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Rice = registerBlock("rice",
            new CropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Chalk = registerBlock("rock_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Chalk_Slab = registerBlock("rock_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Chalk_Stairs = registerBlock("rock_chalk_stairs",
            new StairsBlock(Chalk.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Chalk_Wall = registerBlock("rock_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Labradorite = registerBlock("rock_labradorite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Labradorite_Slab = registerBlock("rock_labradorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Labradorite_Stairs = registerBlock("rock_labradorite_stairs",
            new StairsBlock(Labradorite.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Labradorite_Wall = registerBlock("rock_labradorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Rhyolite = registerBlock("rock_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Rhyolite_Slab = registerBlock("rock_rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Rhyolite_Stairs = registerBlock("rock_rhyolite_stairs",
            new StairsBlock(Rhyolite.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Rhyolite_Wall = registerBlock("rock_rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Rope = registerBlock("rope",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block Rotten_Log = registerBlock("rotten_log_rotten",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Catalpa_Sapling = registerBlock("sapling1_catalpa",
            new SaplingBlock(new CatalpaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Ibbinia_Sapling = registerBlock("sapling1_ibbinia",
            new SaplingBlock(new IbbiniaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Ulthos_Sapling = registerBlock("sapling1_ulthos",
            new SaplingBlock(new UlthosSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Ulthos_Red_Sapling = registerBlock("sapling1_ulthos_red",
            new SaplingBlock(new RedUlthosSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Aramant_Sapling = registerBlock("sapling2_aramant",
            new SaplingBlock(new AramantSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Banana_Sapling = registerBlock("sapling2_banana",
            new SaplingBlock(new BananaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Beech_Sapling = registerBlock("sapling2_beech",
            new SaplingBlock(new BeechSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Holly_Sapling = registerBlock("sapling2_holly",
            new SaplingBlock(new HollySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Date_Palm_Sapling = registerBlock("sapling3_date_palm",
            new SaplingBlock(new DatePalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Larch_Sapling = registerBlock("sapling3_larch",
            new SaplingBlock(new LarchSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Mangrove_Sapling = registerBlock("sapling3_mangrove",
            new SaplingBlock(new MangroveSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Maple_Sapling = registerBlock("sapling3_maple",
            new SaplingBlock(new MapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Baobab_Sapling = registerBlock("sapling4_baobab",
            new SaplingBlock(new BaobabSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Cedar_Sapling = registerBlock("sapling4_cedar",
            new SaplingBlock(new CedarSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Chestnut_Sapling = registerBlock("sapling4_chestnut",
            new SaplingBlock(new ChestnutSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Fir_Sapling = registerBlock("sapling4_fir",
            new SaplingBlock(new FirSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Lemon_Sapling = registerBlock("sapling5_lemon",
            new SaplingBlock(new LemonSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Lime_Sapling = registerBlock("sapling5_lime",
            new SaplingBlock(new LimeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Orange_Sapling = registerBlock("sapling5_orange",
            new SaplingBlock(new OrangeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Pine_Sapling = registerBlock("sapling5_pine",
            new SaplingBlock(new PineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Cypress_Sapling = registerBlock("sapling6_cypress",
            new SaplingBlock(new CypressSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Mahogany_Sapling = registerBlock("sapling6_mahogany",
            new SaplingBlock(new MahoganySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Olive_Sapling = registerBlock("sapling6_olive",
            new SaplingBlock(new OliveSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Willow_Sapling = registerBlock("sapling6_willow",
            new SaplingBlock(new WillowSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Almond_Sapling = registerBlock("sapling7_almond",
            new SaplingBlock(new AlmondSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Aspen_Sapling = registerBlock("sapling7_aspen",
            new SaplingBlock(new AspenSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Fotinia_Sapling = registerBlock("sapling7_fotinia",
            new SaplingBlock(new FotiniaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Green_Oak_Sapling = registerBlock("sapling7_green_oak",
            new SaplingBlock(new GreenOakSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Palm_Sapling = registerBlock("sapling8_palm",
            new SaplingBlock(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Plum_Sapling = registerBlock("sapling8_plum",
            new SaplingBlock(new PlumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Pomegranate_Sapling = registerBlock("sapling8_pomegranate",
            new SaplingBlock(new PomegranateSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Redwood_Sapling = registerBlock("sapling8_redwood",
            new SaplingBlock(new RedwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Dragon_Sapling = registerBlock("sapling9_dragon",
            new SaplingBlock(new DragonSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Kanuka_Sapling = registerBlock("sapling9_kanuka",
            new SaplingBlock(new KanukaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block Weirwood_Sapling = registerBlock("sapling9_weirwood",
            new SaplingBlock(new WeirwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    //TODO ADD SARBACANE TRAP

    public static final Block Scorched_Stone = registerBlock("scorched_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Silver_Bars = registerBlock("silver_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block Smooth_Stone_Chalk = registerBlock("smooth_stone_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block Smooth_Stone_Chalk_Slab = registerBlock("smooth_stone_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Chalk_Stairs = registerBlock("smooth_stone_chalk_stairs",
            new StairsBlock(Smooth_Stone_Chalk.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Chalk_Wall = registerBlock("smooth_stone_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Labradorite = registerBlock("smooth_stone_labradorite",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block Smooth_Stone_Labradorite_Slab = registerBlock("smooth_stone_labradorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Labradorite_Stairs = registerBlock("smooth_stone_labradorite_stairs",
            new StairsBlock(Smooth_Stone_Labradorite.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Labradorite_Wall = registerBlock("smooth_stone_labradorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Rhyolite = registerBlock("smooth_stone_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block Smooth_Stone_Rhyolite_Slab = registerBlock("smooth_stone_rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Rhyolite_Stairs = registerBlock("smooth_stone_rhyolite_stairs",
            new StairsBlock(Smooth_Stone_Rhyolite.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Smooth_Stone_Rhyolite_Wall = registerBlock("smooth_stone_rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block Sothoryos_Torch = registerBlock("sothoryos_double_torch", //TODO FIX HITBOX + PARTILES
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).sounds(BlockSoundGroup.WOOD)));
    public static final Block Black_Fine_Glass = registerBlock("stained_glass_black", //TODO FIX NO TEXTURE ON GLASS PANE
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Black_Fine_Glass_Pane = registerBlock("stained_glass_pane_black",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Blue_Fine_Glass = registerBlock("stained_glass_blue",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Blue_Fine_Glass_Pane = registerBlock("stained_glass_pane_blue",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Brown_Fine_Glass = registerBlock("stained_glass_brown",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Brown_Fine_Glass_Pane = registerBlock("stained_glass_pane_brown",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Cyan_Fine_Glass = registerBlock("stained_glass_cyan",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Cyan_Fine_Glass_Pane = registerBlock("stained_glass_pane_cyan",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Gray_Fine_Glass = registerBlock("stained_glass_gray",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Gray_Fine_Glass_Pane = registerBlock("stained_glass_pane_gray",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Green_Fine_Glass = registerBlock("stained_glass_green",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Green_Fine_Glass_Pane = registerBlock("stained_glass_pane_green",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Light_Blue_Fine_Glass = registerBlock("stained_glass_light_blue",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Light_Blue_Fine_Glass_Pane = registerBlock("stained_glass_pane_light_blue",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Lime_Fine_Glass = registerBlock("stained_glass_lime",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Lime_Fine_Glass_Pane = registerBlock("stained_glass_pane_lime",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Magenta_Fine_Glass = registerBlock("stained_glass_magenta",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Magenta_Fine_Glass_Pane = registerBlock("stained_glass_pane_magenta",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Orange_Fine_Glass = registerBlock("stained_glass_orange",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Orange_Fine_Glass_Pane = registerBlock("stained_glass_pane_orange",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Pink_Fine_Glass = registerBlock("stained_glass_pink",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Pink_Fine_Glass_Pane = registerBlock("stained_glass_pane_pink",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Purple_Fine_Glass = registerBlock("stained_glass_purple",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Purple_Fine_Glass_Pane = registerBlock("stained_glass_pane_purple",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Red_Fine_Glass = registerBlock("stained_glass_red",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Red_Fine_Glass_Pane = registerBlock("stained_glass_pane_red",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Silver_Fine_Glass = registerBlock("stained_glass_silver",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Silver_Fine_Glass_Pane = registerBlock("stained_glass_pane_silver",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block White_Fine_Glass = registerBlock("stained_glass_white",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block White_Fine_Glass_Pane = registerBlock("stained_glass_pane_white",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block Yellow_Fine_Glass = registerBlock("stained_glass_yellow",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block Yellow_Fine_Glass_Pane = registerBlock("stained_glass_pane_yellow",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).nonOpaque()));

    //TODO ADD STRAW BED

    public static final Block Arryn_Table = registerBlock("table_arryn",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Asshai_Table = registerBlock("table_asshai",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Braavos_Table = registerBlock("table_braavos",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Crownlands_Table = registerBlock("table_crownlands",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Dorne_Table = registerBlock("table_dorne",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Dothraki_Table = registerBlock("table_dothraki",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Dragonstone_Table = registerBlock("table_dragonstone",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Ghiscar_Table = registerBlock("table_ghiscar",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Gift_Table = registerBlock("table_gift",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Hill_Tribes_Table = registerBlock("table_hill_tribes",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Ibben_Table = registerBlock("table_ibben",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Ironborn_Table = registerBlock("table_ironborn",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Jogos_Table = registerBlock("table_jogos",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Lhazar_Table = registerBlock("table_lhazar",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Lorath_Table = registerBlock("table_lorath",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Lys_Table = registerBlock("table_lys",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Mossovy_Table = registerBlock("table_mossovy",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Myr_Table = registerBlock("table_myr",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block North_Table = registerBlock("table_north",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Norvos_Table = registerBlock("table_norvos",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Pentos_Table = registerBlock("table_pentos",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Qarth_Table = registerBlock("table_qarth",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Qohor_Table = registerBlock("table_qohor",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Reach_Table = registerBlock("table_reach",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Riverlands_Table = registerBlock("table_riverlands",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Sothoryos_Table = registerBlock("table_sothoryos",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Stormlands_Table = registerBlock("table_stormlands",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Summer_Table = registerBlock("table_summer",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Tyrosh_Table = registerBlock("table_tyrosh",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Volantis_Table = registerBlock("table_volantis",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Westerlands_Table = registerBlock("table_westerlands",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Wildling_Table = registerBlock("table_wildling",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Yiti_Table = registerBlock("table_yi_ti",
            new GOTCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static final Block Fernsprout = registerBlock("tall_grass_fernsprout",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Grass_Flower = registerBlock("tall_grass_flower",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Grass_Nettle = registerBlock("tall_grass_nettle",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Short_Grass = registerBlock("tall_grass_short",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Thistle = registerBlock("tall_grass_thistle",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Grass_Wheat = registerBlock("tall_grass_wheat",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block Termite_Mound = registerBlock("termite_mound",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block Thatch_Floor = registerBlock("thatch_floor",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Thatch_Reed = registerBlock("thatch_reed",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Thatch_Thatch = registerBlock("thatch_thatch",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block Almond_Trapdoor = registerBlock("trapdoor_almond",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Apple_Trapdoor = registerBlock("trapdoor_apple",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Aramant_Trapdoor = registerBlock("trapdoor_aramant",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Aspen_Trapdoor = registerBlock("trapdoor_aspen",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Banana_Trapdoor = registerBlock("trapdoor_banana",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Baobab_Trapdoor = registerBlock("trapdoor_baobab",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Beech_Trapdoor = registerBlock("trapdoor_beech",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Catalpa_Trapdoor = registerBlock("trapdoor_catalpa",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Cedar_Trapdoor = registerBlock("trapdoor_cedar",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Charred_Trapdoor = registerBlock("trapdoor_charred",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Cherry_Trapdoor = registerBlock("trapdoor_cherry",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Chestnut_Trapdoor = registerBlock("trapdoor_chestnut",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Cypress_Trapdoor = registerBlock("trapdoor_cypress",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Date_Palm_Trapdoor = registerBlock("trapdoor_date_palm",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Dragon_Trapdoor = registerBlock("trapdoor_dragon",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Fir_Trapdoor = registerBlock("trapdoor_fir",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Fotinia_Trapdoor = registerBlock("trapdoor_fotinia",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Green_Oak_Trapdoor = registerBlock("trapdoor_green_oak",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Holly_Trapdoor = registerBlock("trapdoor_holly",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Ibbinia_Trapdoor = registerBlock("trapdoor_ibbinia",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Kanuka_Trapdoor = registerBlock("trapdoor_kanuka",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Larch_Trapdoor = registerBlock("trapdoor_larch",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Lemon_Trapdoor = registerBlock("trapdoor_lemon",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Lime_Trapdoor = registerBlock("trapdoor_lime",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Mahogany_Trapdoor = registerBlock("trapdoor_mahogany",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Mango_Trapdoor = registerBlock("trapdoor_mango",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Mangrove_Trapdoor = registerBlock("trapdoor_mangrove",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Maple_Trapdoor = registerBlock("trapdoor_maple",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Olive_Trapdoor = registerBlock("trapdoor_olive",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Orange_Trapdoor = registerBlock("trapdoor_orange",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Palm_Trapdoor = registerBlock("trapdoor_palm",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Pear_Trapdoor = registerBlock("trapdoor_pear",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Pine_Trapdoor = registerBlock("trapdoor_pine",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Plum_Trapdoor = registerBlock("trapdoor_plum",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Pomegranate_Trapdoor = registerBlock("trapdoor_pomegranate",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Redwood_Trapdoor = registerBlock("trapdoor_redwood",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Rotten_Trapdoor = registerBlock("trapdoor_rotten",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Ulthos_Trapdoor = registerBlock("trapdoor_ulthos",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Weirwood_Trapdoor = registerBlock("trapdoor_weirwood",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block Willow_Trapdoor = registerBlock("trapdoor_willow",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    //TODO ADD TREASURE

    public static final Block Turnip = registerBlock("turnip",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Ulthos_Bars = registerBlock("ulthos_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Ulthos_Torch = registerBlock("ulthos_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ParticleTypes.FLAME));
    public static final Block Ulthos_WallTorch = registerBlock("ulthos_walltorch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ParticleTypes.FLAME));
    public static final Block Valyrian_Bars = registerBlock("valyrian_bars",
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    //TODO ADD WASTE BLOCK WITH MULTIPLE VARIANTS

    public static final Block White_Sand = registerBlock("white_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block White_Sand_Slab = registerBlock("white_sand_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block White_Sandstone = registerBlock("white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block White_Sandstone_Slab = registerBlock("white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block White_Sandstone_Stairs = registerBlock("white_sandstone_stairs",
            new StairsBlock(White_Sandstone.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    //TODO ADD WILD FIRE JAR (CUSTOM MODEL)

    public static final Block Wild_Fire = registerBlock("wild_fire",
            new FireBlock(FabricBlockSettings.copyOf(Blocks.FIRE)));
    public static final Block Willow_Vines = registerBlock("willow_vines", //TODO TEXTURE ISN'T QUITE RIGHT
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));
    public static final Block Catalpa_Wood = registerBlock("wood1_catalpa",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Charred_Wood = registerBlock("wood1_charred",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Ibbinia_Wood = registerBlock("wood1_ibbinia",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Ulthos_Wood = registerBlock("wood1_ulthos",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Aramant_Wood = registerBlock("wood2_aramant",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Banana_Wood = registerBlock("wood2_banana",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Beech_Wood = registerBlock("wood2_beech",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Holly_Wood = registerBlock("wood2_holly",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Date_Palm_Wood = registerBlock("wood3_date_palm",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Larch_Wood = registerBlock("wood3_larch",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Mangrove_Wood = registerBlock("wood3_mangrove",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Maple_Wood = registerBlock("wood3_maple",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Baobab_Wood = registerBlock("wood4_baobab",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Cedar_Wood = registerBlock("wood4_cedar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Chestnut_Wood = registerBlock("wood4_chestnut",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fir_Wood = registerBlock("wood4_fir",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Lemon_Wood = registerBlock("wood5_lemon",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Lime_Wood = registerBlock("wood5_lime",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Orange_Wood = registerBlock("wood5_orange",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Pine_Wood = registerBlock("wood5_pine",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Cypress_Wood = registerBlock("wood6_cypress",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Mahogany_Wood = registerBlock("wood6_mahogany",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Olive_Wood = registerBlock("wood6_olive",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Willow_Wood = registerBlock("wood6_willow",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Almond_Wood = registerBlock("wood7_almond",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Aspen_Wood = registerBlock("wood7_aspen",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fotinia_Wood = registerBlock("wood7_fotinia",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Green_Oak_Wood = registerBlock("wood7_green_oak",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Palm_Wood = registerBlock("wood8_palm",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Plum_Wood = registerBlock("wood8_plum",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Pomegranate_Wood = registerBlock("wood8_pomegranate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Redwood_Wood = registerBlock("wood8_redwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Dragon_Wood = registerBlock("wood9_dragon",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Kanuka_Wood = registerBlock("wood9_kanuka",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Weirwood_Wood = registerBlock("wood9_weirwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Catalpa_Wood_Beam = registerBlock("wood_beam1_catalpa",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Charred_Wood_Beam = registerBlock("wood_beam1_charred",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Ibbinia_Wood_Beam = registerBlock("wood_beam1_ibbinia",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Ulthos_Wood_Beam = registerBlock("wood_beam1_ulthos",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Aramant_Wood_Beam = registerBlock("wood_beam2_aramant",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Banana_Wood_Beam = registerBlock("wood_beam2_banana",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Beech_Wood_Beam = registerBlock("wood_beam2_beech",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Holly_Wood_Beam = registerBlock("wood_beam2_holly",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Date_Palm_Wood_Beam = registerBlock("wood_beam3_date_palm",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Larch_Wood_Beam = registerBlock("wood_beam3_larch",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Mangrove_Wood_Beam = registerBlock("wood_beam3_mangrove",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Maple_Wood_Beam = registerBlock("wood_beam3_maple",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Baobab_Wood_Beam = registerBlock("wood_beam4_baobab",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Cedar_Wood_Beam = registerBlock("wood_beam4_cedar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Chestnut_Wood_Beam = registerBlock("wood_beam4_chestnut",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fir_Wood_Beam = registerBlock("wood_beam4_fir",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Lemon_Wood_Beam = registerBlock("wood_beam5_lemon",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Lime_Wood_Beam = registerBlock("wood_beam5_lime",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Orange_Wood_Beam = registerBlock("wood_beam5_orange",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Pine_Wood_Beam = registerBlock("wood_beam5_pine",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Cypress_Wood_Beam = registerBlock("wood_beam6_cypress",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Mahogany_Wood_Beam = registerBlock("wood_beam6_mahogany",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Olive_Wood_Beam = registerBlock("wood_beam6_olive",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Willow_Wood_Beam = registerBlock("wood_beam6_willow",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Almond_Wood_Beam = registerBlock("wood_beam7_almond",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Aspen_Wood_Beam = registerBlock("wood_beam7_aspen",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Fotinia_Wood_Beam = registerBlock("wood_beam7_fotinia",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Green_Oak_Wood_Beam = registerBlock("wood_beam7_green_oak",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Palm_Wood_Beam = registerBlock("wood_beam8_palm",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Plum_Wood_Beam = registerBlock("wood_beam8_plum",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Pomegranate_Wood_Beam = registerBlock("wood_beam8_pomegranate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Redwood_Wood_Beam = registerBlock("wood_beam8_redwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Dragon_Wood_Beam = registerBlock("wood_beam9_dragon",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Kanuka_Wood_Beam = registerBlock("wood_beam9_kanuka",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Weirwood_Wood_Beam = registerBlock("wood_beam9_weirwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Apple_Wood_Beam = registerBlock("wood_beam_fruit_apple",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Cherry_Wood_Beam = registerBlock("wood_beam_fruit_cherry",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Mango_Wood_Beam = registerBlock("wood_beam_fruit_mango",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Pear_Wood_Beam = registerBlock("wood_beam_fruit_pear",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Rotten_Wood_Beam = registerBlock("wood_beam_rotten_rotten",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Ibben_Wood_Beam = registerBlock("wood_beam_s_ibben",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Gold_Ibben_Wood_Beam = registerBlock("wood_beam_s_ibben_gold",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Birch_Wood_Beam = registerBlock("wood_beam_v1_birch",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Jungle_Wood_Beam = registerBlock("wood_beam_v1_jungle",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Oak_Wood_Beam = registerBlock("wood_beam_v1_oak",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Spruce_Wood_Beam = registerBlock("wood_beam_v1_spruce",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Acacia_Wood_Beam = registerBlock("wood_beam_v2_acacia",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Dark_Oak_Wood_Beam = registerBlock("wood_beam_v2_dark_oak",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block Wood_Plate = registerBlock("wood_plate",
            new GOTPlateBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block Yam = registerBlock("yam",
            new BeetrootsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block Yiti_Flower_Blue = registerBlock("yiti_flower_chrys_blue",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Yiti_Flower_Orange = registerBlock("yiti_flower_chrys_orange",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Yiti_Flower_Pink = registerBlock("yiti_flower_chrys_pink",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Yiti_Flower_White = registerBlock("yiti_flower_chrys_white",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block Yiti_Flower_Yellow = registerBlock("yiti_flower_chrys_yellow",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));

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
