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
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Areo_Hotah_Axe = registerItem("areo_hotah_axe",
            new GOTItemSword(ToolMaterials.DIAMOND, 6, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Baelish_Dagger = registerItem("baelish_dagger",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Beric_Sword = registerItem("beric_sword",
            new GOTItemSword(ToolMaterials.DIAMOND, 3, -2.4f, GOTItemSword.HitEffect.FIRE, new FabricItemSettings()));
    public static final Item Bolton_Dagger = registerItem("bolton_dagger",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    /* WEAPONS */
    public static final Item Alloy_Steel_Dagger = registerItem("alloy_steel_dagger",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Alloy_Steel_Dagger_Poisoned = registerItem("alloy_steel_dagger_poisoned",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 4, -2.0f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Alloy_Steel_Halberd = registerItem("alloy_steel_halberd",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Alloy_Steel_Sword = registerItem("alloy_steel_sword",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Dagger = registerItem("asshai_dagger",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Dagger_Poisoned = registerItem("asshai_dagger_poisoned",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Asshai_Hammer = registerItem("asshai_hammer",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Spear = registerItem("asshai_spear",
            new GOTItemSpear(new FabricItemSettings()/*ToolMaterials.IRON, 4, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()*/));
    public static final Item Asshai_Staff = registerItem("asshai_staff",
            new GOTItemSword(ToolMaterials.IRON, 4, -2.1f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Sword = registerItem("asshai_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Battleaxe = registerItem("bronze_battleaxe",
            new GOTItemSword(GOTToolMaterials.BRONZE, 3, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Dagger = registerItem("bronze_dagger",
            new GOTItemSword(GOTToolMaterials.BRONZE, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Dagger_Poisoned = registerItem("bronze_dagger_poisoned",
            new GOTItemSword(GOTToolMaterials.BRONZE, 3, -2.0f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Bronze_Spear = registerItem("bronze_spear",
            new GOTItemSword(GOTToolMaterials.BRONZE, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Sword = registerItem("bronze_sword",
            new GOTItemSword(GOTToolMaterials.BRONZE, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Throwing_Axe = registerItem("bronze_throwing_axe",
            new GOTItemSword(GOTToolMaterials.BRONZE, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }

    public static void registerModWeapons() {
        GOT.LOGGER.debug("Registering Mod Weapons for " + GOT.MOD_ID);
    }
}
