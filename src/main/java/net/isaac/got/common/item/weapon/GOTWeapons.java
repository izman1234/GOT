package net.isaac.got.common.item.weapon;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.isaac.got.GOT;
import net.isaac.got.common.item.GOTToolMaterials;
import net.isaac.got.common.item.weapon.GOTEntities.GOTEntitySpear;
import net.isaac.got.common.item.weapon.GOTEntities.GOTEntityTypes;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Set;

public class GOTWeapons {
    public static final Set<GOTItemSpear> ALL_SPEARS = new ReferenceOpenHashSet<>();

    /* LEGENDARY WEAPONS */
    public static final Item Areo_Hotah_Axe = registerItem("areo_hotah_axe",
            new GOTItemSword(ToolMaterials.DIAMOND, 6, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Baelish_Dagger = registerItem("baelish_dagger",
            new GOTItemDagger(GOTToolMaterials.ALLOYSTEEL, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Beric_Sword = registerItem("beric_sword",
            new GOTItemSword(ToolMaterials.DIAMOND, 3, -2.4f, GOTItemSword.HitEffect.FIRE, new FabricItemSettings()));
    public static final Item Blackfyre = registerItem("blackfyre",
            new GOTItemSword(ToolMaterials.DIAMOND, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bolton_Dagger = registerItem("bolton_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Brightroar = registerItem("brightroar",
            new GOTItemSword(ToolMaterials.DIAMOND, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Celtigar_Axe= registerItem("celtigar_axe",
            new GOTItemSword(GOTToolMaterials.BRONZE, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Daario_Arakh = registerItem("daario_arakh",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Dark_Sister = registerItem("dark_sister",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Darkstar = registerItem("darkstar",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Dawn = registerItem("dawn",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Eddard_Sword = registerItem("eddard_sword",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Euron_Dagger = registerItem("euron_dagger",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Forrester_Sword = registerItem("forrester_sword",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Gendry_Hammer = registerItem("gendry_hammer",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Gregor_Clegane_Sword = registerItem("gregor_clegane_sword",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Hearteater = registerItem("hearteater",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Heartsbane = registerItem("heartsbane",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Honor = registerItem("honor",
            new GOTItemSword(ToolMaterials.IRON, 5, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Ice = registerItem("ice",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Jaime_Sword = registerItem("jaime_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    //TODO: Joffrey Crossbow

    public static final Item Just_Maid = registerItem("just_maid",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Indomitable = registerItem("indomitable",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lady_Forlorn = registerItem("lady_forlorn",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lamentation = registerItem("lamentation",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lightbringer = registerItem("lightbringer",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Longclaw = registerItem("longclaw",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Needle = registerItem("needle",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Night_King_Sword = registerItem("night_king_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Nightfall = registerItem("nightfall",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Oathkeeper = registerItem("oathkeeper",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Obara_Spear = registerItem("obara_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Orphan_Maker = registerItem("orphan_maker",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Pruner = registerItem("pruner",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Reminder = registerItem("reminder",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Rhaegar_Sword = registerItem("rhaegar_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Robb_Sword = registerItem("robb_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Robert_Hammer = registerItem("robert_hammer",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Sandor_Clegane_Sword = registerItem("sandor_clegane_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Strickland_Sword = registerItem("strickland_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Sunspear = registerItem("sunspear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Tidewings = registerItem("tidewings",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Tormund_Sword = registerItem("tormund_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Truth = registerItem("truth",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Trystane_Sword = registerItem("trystane_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Tugar_Khan_Sword = registerItem("tugar_khan_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Tyene_Dagger = registerItem("tyene_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Tyrion_Axe = registerItem("tyrion_axe",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Victarion_Axe = registerItem("victarion_axe",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Vigilance = registerItem("vigilance",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Widow_Wail = registerItem("widow_wail",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    /* WEAPONS */
    public static final Item Alloy_Steel_Dagger = registerItem("alloy_steel_dagger",
            new GOTItemDagger(GOTToolMaterials.ALLOYSTEEL, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Alloy_Steel_Dagger_Poisoned = registerItem("alloy_steel_dagger_poisoned",
            new GOTItemDagger(GOTToolMaterials.ALLOYSTEEL, 4, -2.0f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Alloy_Steel_Halberd = registerItem("alloy_steel_halberd",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Alloy_Steel_Sword = registerItem("alloy_steel_sword",
            new GOTItemSword(GOTToolMaterials.ALLOYSTEEL, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Archmag_Staff = registerItem("archmag_staff",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Battleaxe = registerItem("asshai_battleaxe",
            new GOTItemSword(GOTToolMaterials.BRONZE, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Bow = registerItem("asshai_bow", new GOTItemBow(new FabricItemSettings().maxDamage(200)));
    public static final Item Asshai_Dagger = registerItem("asshai_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Dagger_Poisoned = registerItem("asshai_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.0f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Asshai_Hammer = registerItem("asshai_hammer",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Spear = registerSpear("asshai_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.ASSHAI_SPEAR), true);
    public static final Item Asshai_Staff = registerItem("asshai_staff",
            new GOTItemSword(ToolMaterials.IRON, 4, -2.1f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Asshai_Sword = registerItem("asshai_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Black_Arakh = registerItem("black_arakh",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Battleaxe = registerItem("bronze_battleaxe",
            new GOTItemSword(GOTToolMaterials.BRONZE, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Dagger = registerItem("bronze_dagger",
            new GOTItemDagger(GOTToolMaterials.BRONZE, 3, -2.0f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Dagger_Poisoned = registerItem("bronze_dagger_poisoned",
            new GOTItemDagger(GOTToolMaterials.BRONZE, 3, -2.0f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    //public static final Item Bronze_Spear = registerSpear("bronze_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Bronze_Sword = registerItem("bronze_sword",
            new GOTItemSword(GOTToolMaterials.BRONZE, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Bronze_Throwing_Axe = registerItem("bronze_throwing_axe", new GOTItemThrowingAxe(new FabricItemSettings().maxDamage(250))); //FIX DMG
    public static final Item Essos_Bow = registerItem("essos_bow", new GOTItemBow(new FabricItemSettings().maxDamage(200)));
    public static final Item Essos_Dagger = registerItem("essos_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Essos_Dagger_Poisoned = registerItem("essos_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Essos_Hammer = registerItem("essos_hammer",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Essos_Pike = registerItem("essos_pike",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Essos_Polearm = registerItem("essos_polearm",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Essos_Spear = registerSpear("essos_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Essos_Sword = registerItem("essos_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Ibben_Sword = registerItem("ibben_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Ice_Battleaxe = registerItem("ice_battleaxe",
            new GOTItemSword(GOTToolMaterials.ICESHARD, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Ice_Heavy_Sword = registerItem("ice_heavy_sword",
            new GOTItemSword(GOTToolMaterials.ICESHARD, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Ice_Spear = registerSpear("ice_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Ice_Sword = registerItem("ice_sword",
            new GOTItemSword(GOTToolMaterials.ICESHARD, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Iron_Dagger = registerItem("iron_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Iron_Dagger_Poisoned = registerItem("iron_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Iron_Pike = registerItem("iron_pike",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Iron_Spear = registerSpear("iron_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Iron_Throwing_Axe = registerItem("iron_throwing_axe", new GOTItemThrowingAxe(new FabricItemSettings().maxDamage(250)));
    public static final Item Katana = registerItem("katana",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lhazar_Battleaxe = registerItem("lhazar_battleaxe",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lhazar_Club = registerItem("lhazar_club",
            new GOTItemSword(ToolMaterials.IRON, 1, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lhazar_Dagger = registerItem("lhazar_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Lhazar_Dagger_Poisoned = registerItem("lhazar_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    //public static final Item Lhazar_Spear = registerSpear("lhazar_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Lhazar_Sword = registerItem("lhazar_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Mace = registerItem("mace",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Mossovy_Sword = registerItem("mossovy_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Nomad_Battleaxe = registerItem("nomad_battleaxe",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Nomad_Bow = registerItem("nomad_bow", new GOTItemBow(new FabricItemSettings().maxDamage(200)));
    //public static final Item Nomad_Spear = registerSpear("nomad_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Nomad_Sword = registerItem("nomad_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    //TODO: ADD NYMERIA WHIP

    public static final Item Skull_Staff = registerItem("skull_staff",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    //TODO: ADD SLING

    public static final Item Sothoryos_Battleaxe = registerItem("sothoryos_battleaxe",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Sothoryos_Dagger = registerItem("sothoryos_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Sothoryos_Dagger_Poisoned = registerItem("sothoryos_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Sothoryos_Hammer = registerItem("sothoryos_hammer",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Sothoryos_Pike = registerItem("sothoryos_pike",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Sothoryos_Spear = registerItem("sothoryos_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Sothoryos_Sword = registerItem("sothoryos_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Stone_Spear = registerSpear("stone_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Summer_Dagger = registerItem("summer_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Summer_Dagger_Poisoned = registerItem("summer_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Summer_Pike = registerItem("summer_pike",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Summer_Spear = registerSpear("summer_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Summer_Sword = registerItem("summer_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Valyrian_Battleaxe = registerItem("valyrian_battleaxe",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));

    //TODO: ADD VALYRIAN CROSSBOW

    public static final Item Valyrian_Dagger = registerItem("valyrian_dagger",
            new GOTItemDagger(GOTToolMaterials.VALYRIANSTEEL, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Valyrian_Dagger_Poisoned = registerItem("valyrian_dagger_poisoned",
            new GOTItemDagger(GOTToolMaterials.VALYRIANSTEEL, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Valyrian_Halberd = registerItem("valyrian_halberd",
            new GOTItemSword(GOTToolMaterials.VALYRIANSTEEL, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Valyrian_Hammer = registerItem("valyrian_hammer",
            new GOTItemSword(GOTToolMaterials.VALYRIANSTEEL, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Valyrian_Spear = registerItem("valyrian_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Valyrian_Sword = registerItem("valyrian_sword",
            new GOTItemSword(GOTToolMaterials.VALYRIANSTEEL, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Westeros_Bow = registerItem("westeros_bow", new GOTItemBow(new FabricItemSettings().maxDamage(200)));
    public static final Item Westeros_Dagger = registerItem("westeros_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Westeros_Dagger_Poisoned = registerItem("westeros_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Westeros_Greatsword = registerItem("westeros_greatsword",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Westeros_Hammer = registerItem("westeros_hammer",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Westeros_Lance = registerItem("westeros_lance",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Westeros_Longsword = registerItem("westeros_longsword",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Westeros_Pike = registerItem("westeros_pike",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Westeros_Spear = registerSpear("westeros_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Westeros_Sword = registerItem("westeros_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Wildling_Battleaxe = registerItem("wildling_battleaxe",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Wildling_Dagger = registerItem("wildling_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Wildling_Dagger_Poisoned = registerItem("wildling_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Wildling_Hammer = registerItem("wildling_hammer",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Wildling_Polearm = registerItem("wildling_polearm",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Wildling_Spear = registerItem("wildling_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Wildling_Sword = registerItem("wildling_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Yiti_Battleaxe = registerItem("yiti_battleaxe",
            new GOTItemSword(ToolMaterials.IRON, 5, -3.2f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Yiti_Bow = registerItem("yiti_bow", new GOTItemBow(new FabricItemSettings().maxDamage(200)));
    public static final Item Yiti_Dagger = registerItem("yiti_dagger",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Yiti_Dagger_Poisoned = registerItem("yiti_dagger_poisoned",
            new GOTItemDagger(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.POISON, new FabricItemSettings()));
    public static final Item Yiti_Pike = registerItem("yiti_pike",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    public static final Item Yiti_Polearm = registerItem("yiti_polearm",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));
    //public static final Item Yiti_Spear = registerSpear("yiti_spear", new GOTItemSpear(new FabricItemSettings().maxDamage(250), GOTEntityTypes.SPEAR));
    public static final Item Yiti_Sword = registerItem("yiti_sword",
            new GOTItemSword(ToolMaterials.IRON, 3, -2.4f, GOTItemSword.HitEffect.NONE, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
    }

    public static GOTItemSpear registerSpear(String name, GOTItemSpear item, boolean registerDispenserBehavior) {
        Registry.register(Registries.ITEM, new Identifier(GOT.MOD_ID, name), item);
        ALL_SPEARS.add(item);
        if (registerDispenserBehavior) {
            DispenserBlock.registerBehavior(item, new ProjectileDispenserBehavior() {
                @Override
                protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                    GOTEntitySpear tridentEntity = Objects.requireNonNull(item.getEntityType().create(world));
                    tridentEntity.setPos(position.getX(), position.getY(), position.getZ());
                    stack.decrement(1);
                    return tridentEntity;
                }
            });
        }
        return item;
    }

    public static void registerModWeapons() {
        GOT.LOGGER.debug("Registering Mod Weapons for " + GOT.MOD_ID);
    }
}
