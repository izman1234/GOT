package net.isaac.got.common.item.tool;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.isaac.got.GOT;
import net.isaac.got.common.item.GOTToolMaterials;
import net.isaac.got.common.item.weapon.GOTItemSword;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class GOTTools {
    /* PICKAXES */
    public static final Item Alloy_Steel_Pickaxe = registerItem("alloy_steel_pickaxe",
            new GOTItemPickaxe(GOTToolMaterials.ALLOYSTEEL, 4, -3.2f, new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }
    public static void registerModTools() {
        GOT.LOGGER.debug("Registering Mod Tools for " + GOT.MOD_ID);
    }
}
