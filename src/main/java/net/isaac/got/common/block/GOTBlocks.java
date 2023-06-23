package net.isaac.got.common.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.isaac.got.GOT;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class GOTBlocks {
    public static final Block Alloy_Forge = registerBlock("alloy_forge",
            new FurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).strength(4.0f).requiresTool()));
    public static final Block Apple_Crumble = registerBlock("apple_crumble",
            new CustomCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(1.0f)));
    public static final Block Arid_Grass = registerBlock("arid_grass",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS).mapColor(MapColor.DARK_GREEN).replaceable()
                    .noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block Asshai_Bars = registerBlock("asshai_bars",
            new CustomPaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(4.0f).requiresTool()));
    public static final Block Asshai_Dirt = registerBlock("asshai_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block Banana_Cake = registerBlock("banana_cake",
            new CustomCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(1.0f)));
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
