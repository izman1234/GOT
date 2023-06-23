package net.isaac.got.common.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.isaac.got.GOT;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class GOTOther {
    /* INGOTS */
    public static final Item Alloy_Steel_Ingot = registerItem("alloy_steel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Bronze_Ingot = registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Silver_Ingot = registerItem("silver_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Tin_Ingot = registerItem("tin_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Valyrian_Ingot = registerItem("valyrian_ingot",
            new Item(new FabricItemSettings()));
    public static final Item Yiti_Steel_Ingot = registerItem("yiti_steel_ingot",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }
    public static void registerModOther() {
        GOT.LOGGER.debug("Registering Mod Other for " + GOT.MOD_ID);
    }
}
