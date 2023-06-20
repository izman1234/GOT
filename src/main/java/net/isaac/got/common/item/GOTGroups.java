package net.isaac.got.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.isaac.got.GOT;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GOTGroups {
    public static ItemGroup GOTCombat = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_combat"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Combat"))
                    .icon(() -> new ItemStack(GOTWeapons.Tormund_Sword)).entries((displayContext, entries) -> {

                        /* LEGENDARY WEAPONS */
                        entries.add(GOTWeapons.Areo_Hotah_Axe);
                        entries.add(GOTWeapons.Baelish_Dagger);
                        entries.add(GOTWeapons.Beric_Sword);
                        entries.add(GOTWeapons.Blackfyre);
                        entries.add(GOTWeapons.Bolton_Dagger);
                        entries.add(GOTWeapons.Brightroar);
                        entries.add(GOTWeapons.Celtigar_Axe);
                        entries.add(GOTWeapons.Daario_Arakh);
                        entries.add(GOTWeapons.Dark_Sister);
                        entries.add(GOTWeapons.Darkstar);
                        entries.add(GOTWeapons.Dawn);
                        entries.add(GOTWeapons.Eddard_Sword);
                        entries.add(GOTWeapons.Euron_Dagger);
                        entries.add(GOTWeapons.Forrester_Sword);
                        entries.add(GOTWeapons.Tormund_Sword);

                        /* WEAPONS */
                        entries.add(GOTWeapons.Alloy_Steel_Dagger);
                        entries.add(GOTWeapons.Alloy_Steel_Dagger_Poisoned);
                        entries.add(GOTWeapons.Alloy_Steel_Halberd);
                        entries.add(GOTWeapons.Alloy_Steel_Sword);
                        entries.add(GOTWeapons.Archmag_Staff);
                        entries.add(GOTWeapons.Asshai_Battleaxe);
                        entries.add(GOTWeapons.Asshai_Bow);
                        entries.add(GOTWeapons.Asshai_Dagger);
                        entries.add(GOTWeapons.Asshai_Dagger_Poisoned);
                        entries.add(GOTWeapons.Asshai_Hammer);
                        entries.add(GOTWeapons.Asshai_Spear);
                        entries.add(GOTWeapons.Asshai_Staff);
                        entries.add(GOTWeapons.Asshai_Sword);
                        entries.add(GOTWeapons.Black_Arakh);
                        entries.add(GOTWeapons.Bronze_Battleaxe);
                        entries.add(GOTWeapons.Bronze_Dagger);
                        entries.add(GOTWeapons.Bronze_Dagger_Poisoned);
                        entries.add(GOTWeapons.Bronze_Spear);
                        entries.add(GOTWeapons.Bronze_Sword);
                        entries.add(GOTWeapons.Bronze_Throwing_Axe);
                        entries.add(GOTWeapons.Essos_Bow);
                        entries.add(GOTWeapons.Essos_Dagger);
                        entries.add(GOTWeapons.Essos_Dagger_Poisoned);
                        entries.add(GOTWeapons.Essos_Hammer);
                        entries.add(GOTWeapons.Essos_Pike);
                        entries.add(GOTWeapons.Essos_Polearm);
                        entries.add(GOTWeapons.Essos_Spear);
                        entries.add(GOTWeapons.Essos_Sword);
                    }).build());

    public static ItemGroup GOTIngredients = Registry.register(Registries.ITEM_GROUP, new Identifier(GOT.MOD_ID, "got_ingredients"),
            FabricItemGroup.builder().displayName(Text.literal("GOT Ingredients"))
                    .icon(() -> new ItemStack(GOTOther.Alloy_Steel_Ingot)).entries((displayContext, entries) -> {
                        /* INGOTS */
                        entries.add(GOTOther.Alloy_Steel_Ingot);
                        entries.add(GOTOther.Bronze_Ingot);
                        entries.add(GOTOther.Valyrian_Ingot);
                    }).build());

    public static void registerModGroups() {
        GOT.LOGGER.debug("Registering Mod Groups for " + GOT.MOD_ID);
    }


}
