package net.isaac.got.common.item.weapon;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.isaac.got.GOT;
import net.isaac.got.common.item.GOTToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class GOTWeapons {
    /* LEGENDARY WEAPONS */
    public static final Item Tormund_Sword = registerItem("tormund_sword",
            new SwordItem(ToolMaterials.IRON, 3, -2.4f, new FabricItemSettings()));
    public static final Item Areo_Hotah_Axe = registerItem("areo_hotah_axe",
            new SwordItem(ToolMaterials.DIAMOND, 6, -3.2f, new FabricItemSettings()));
    public static final Item Baelish_Dagger = registerItem("baelish_dagger",
            new SwordItem(GOTToolMaterials.ALLOYSTEEL, 3, -2.0f, new FabricItemSettings()));
    public static final Item Beric_Sword = registerItem("beric_sword",
            new SwordItem(ToolMaterials.DIAMOND, 3, -2.4f, new FabricItemSettings()));
    public static final Item Bolton_Dagger = registerItem("bolton_dagger",
            new SwordItem(ToolMaterials.IRON, 3, -2.0f, new FabricItemSettings()));

    /* WEAPONS */
    public static final Item Alloy_Steel_Dagger = registerItem("alloy_steel_dagger",
            new SwordItem(GOTToolMaterials.ALLOYSTEEL, 3, -2.0f, new FabricItemSettings()));
    public static final Item Alloy_Steel_Dagger_Poisoned = registerItem("alloy_steel_dagger_poisoned",
            new SwordItem(GOTToolMaterials.ALLOYSTEEL, 4, -2.0f, new FabricItemSettings()));
    public static final Item Alloy_Steel_Halberd = registerItem("alloy_steel_halberd",
            new SwordItem(GOTToolMaterials.ALLOYSTEEL, 5, -3.2f, new FabricItemSettings()));
    public static final Item Alloy_Steel_Sword = registerItem("alloy_steel_sword",
            new SwordItem(GOTToolMaterials.ALLOYSTEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item Asshai_Dagger = registerItem("asshai_dagger",
            new SwordItem(ToolMaterials.IRON, 3, -2.0f, new FabricItemSettings()));
    public static final Item Asshai_Dagger_Poisoned = registerItem("asshai_dagger_poisoned",
            new SwordItem(ToolMaterials.IRON, 3, -2.0f, new FabricItemSettings()));
    public static final Item Asshai_Hammer = registerItem("asshai_hammer",
            new SwordItem(ToolMaterials.IRON, 5, -3.2f, new FabricItemSettings()));
    public static final Item Asshai_Spear = registerItem("asshai_spear",
            new SwordItem(ToolMaterials.IRON, 4, -2.4f, new FabricItemSettings()));
    public static final Item Asshai_Staff = registerItem("asshai_staff",
            new SwordItem(ToolMaterials.IRON, 4, -2.1f, new FabricItemSettings()));
    public static final Item Asshai_Sword = registerItem("asshai_sword",
            new SwordItem(ToolMaterials.IRON, 3, -2.4f, new FabricItemSettings()));
    public static final Item Bronze_Battleaxe = registerItem("bronze_battleaxe",
            new SwordItem(GOTToolMaterials.BRONZE, 3, -3.2f, new FabricItemSettings()));
    public static final Item Bronze_Dagger = registerItem("bronze_dagger",
            new SwordItem(GOTToolMaterials.BRONZE, 3, -2.0f, new FabricItemSettings()));
    public static final Item Bronze_Dagger_Poisoned = registerItem("bronze_dagger_poisoned",
            new SwordItem(GOTToolMaterials.BRONZE, 3, -2.0f, new FabricItemSettings()));
    public static final Item Bronze_Spear = registerItem("bronze_spear",
            new SwordItem(GOTToolMaterials.BRONZE, 5, -2.4f, new FabricItemSettings()));
    public static final Item Bronze_Sword = registerItem("bronze_sword",
            new SwordItem(GOTToolMaterials.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static final Item Bronze_Throwing_Axe = registerItem("bronze_throwing_axe",
            new SwordItem(GOTToolMaterials.BRONZE, 3, -2.4f, new FabricItemSettings()));
    //Add Bronze Throwing Axe

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }

    public static void registerModWeapons() {
        GOT.LOGGER.debug("Registering Mod Weapons for " + GOT.MOD_ID);
    }
}
