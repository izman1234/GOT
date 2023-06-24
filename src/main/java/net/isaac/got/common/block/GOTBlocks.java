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
    public static final Block Ore_Cobalt = registerBlock("ore_cobalt",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE).strength(4.0f).requiresTool()));

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
