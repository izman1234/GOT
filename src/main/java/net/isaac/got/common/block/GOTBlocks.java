package net.isaac.got.common.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.isaac.got.GOT;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GOTBlocks {
    public static final Block Ore_Cobalt= registerBlock("ore_cobalt",
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
