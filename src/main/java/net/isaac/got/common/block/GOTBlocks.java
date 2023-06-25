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
            new GOTPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Asshai_Dirt = registerBlock("asshai_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Asshai_Flower = registerBlock("asshai_flower",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
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



    public static final Block Ore_Cobalt = registerBlock("ore_cobalt",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));

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
