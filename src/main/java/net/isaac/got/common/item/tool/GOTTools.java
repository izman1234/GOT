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
    /* Alloy Steel */
    public static final Item Alloy_Steel_Pickaxe = registerItem("alloy_steel_pickaxe",
            new GOTItemPickaxe(GOTToolMaterials.ALLOYSTEEL, 4, -3.2f, new FabricItemSettings()));
    public static final Item Alloy_Steel_Axe = registerItem("alloy_steel_axe",
            new GOTItemAxe(GOTToolMaterials.ALLOYSTEEL, 4, -3.2f, new FabricItemSettings()));
    public static final Item Alloy_Steel_Hoe = registerItem("alloy_steel_hoe",
            new GOTItemHoe(GOTToolMaterials.ALLOYSTEEL, 4, -3.2f, new FabricItemSettings()));
    public static final Item Alloy_Steel_Shovel = registerItem("alloy_steel_shovel",
            new GOTItemShovel(GOTToolMaterials.ALLOYSTEEL, 4, -3.2f, new FabricItemSettings()));

    /* Bronze */
    public static final Item Bronze_Pickaxe = registerItem("bronze_pickaxe",
            new GOTItemPickaxe(GOTToolMaterials.BRONZE, 4, -3.2f, new FabricItemSettings()));
    public static final Item Bronze_Axe = registerItem("bronze_axe",
            new GOTItemAxe(GOTToolMaterials.BRONZE, 4, -3.2f, new FabricItemSettings()));
    public static final Item Bronze_Hoe = registerItem("bronze_hoe",
            new GOTItemHoe(GOTToolMaterials.BRONZE, 4, -3.2f, new FabricItemSettings()));
    public static final Item Bronze_Shovel = registerItem("bronze_shovel",
            new GOTItemShovel(GOTToolMaterials.BRONZE, 4, -3.2f, new FabricItemSettings()));

    /* Valyrian */
    public static final Item Valyrian_Pickaxe = registerItem("valyrian_pickaxe",
            new GOTItemPickaxe(GOTToolMaterials.VALYRIANSTEEL, 4, -3.2f, new FabricItemSettings()));
    public static final Item Valyrian_Axe = registerItem("valyrian_axe",
            new GOTItemAxe(GOTToolMaterials.VALYRIANSTEEL, 4, -3.2f, new FabricItemSettings()));
    public static final Item Valyrian_Hoe = registerItem("valyrian_hoe",
            new GOTItemHoe(GOTToolMaterials.VALYRIANSTEEL, 4, -3.2f, new FabricItemSettings()));
    public static final Item Valyrian_Shovel = registerItem("valyrian_shovel",
            new GOTItemShovel(GOTToolMaterials.VALYRIANSTEEL, 4, -3.2f, new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }
    public static void registerModTools() {
        GOT.LOGGER.debug("Registering Mod Tools for " + GOT.MOD_ID);
    }
}
