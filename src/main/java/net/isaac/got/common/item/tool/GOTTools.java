package net.isaac.got.common.item.tool;

import net.isaac.got.GOT;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class GOTTools {
    //public static final Item TEST = registerItem("test", new Item(new Item.Settings()));
    //public static final Item TEST2 = registerItem("test2", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }
    public static void registerModTools() {
        GOT.LOGGER.debug("Registering Mod Tools for " + GOT.MOD_ID);
    }
}
