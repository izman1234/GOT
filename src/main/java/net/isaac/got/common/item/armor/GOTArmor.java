package net.isaac.got.common.item.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.isaac.got.GOT;
import net.isaac.got.common.item.GOTToolMaterials;
import net.isaac.got.common.item.tool.GOTItemAxe;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GOTArmor{
    public static final Item Bronze_Helmet = registerItem("bronze_helmet",
            new ArmorItem(GOTArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item Bronze_Chestplate = registerItem("bronze_chestplate",
            new ArmorItem(GOTArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item Bronze_Leggings = registerItem("bronze_leggings",
            new ArmorItem(GOTArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item Bronze_Boots = registerItem("bronze_boots",
            new ArmorItem(GOTArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item Valyrian_Helmet = registerItem("valyrian_helmet",
            new ArmorItem(GOTArmorMaterials.VALYRIAN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item Valyrian_Chestplate = registerItem("valyrian_chestplate",
            new ArmorItem(GOTArmorMaterials.VALYRIAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item Valyrian_Leggings = registerItem("valyrian_leggings",
            new ArmorItem(GOTArmorMaterials.VALYRIAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item Valyrian_Boots = registerItem("valyrian_boots",
            new ArmorItem(GOTArmorMaterials.VALYRIAN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }
    public static void registerModArmor() {
        GOT.LOGGER.debug("Registering Mod Armor for " + GOT.MOD_ID);
    }
}




