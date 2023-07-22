package net.isaac.got.common.item.weapon.GOTEntities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.isaac.got.GOT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GOTEntityTypes {
    public static EntityType<GOTEntitySpear> OBARA_SPEAR;
    public static EntityType<GOTEntitySpear> SUNSPEAR;
    public static EntityType<GOTEntitySpear> ASSHAI_SPEAR;
    public static EntityType<GOTEntitySpear> BRONZE_SPEAR;
    public static EntityType<GOTEntitySpear> ESSOS_SPEAR;
    public static EntityType<GOTEntitySpear> ICE_SPEAR;
    public static EntityType<GOTEntitySpear> IRON_SPEAR;
    public static EntityType<GOTEntitySpear> LHAZAR_SPEAR;
    public static EntityType<GOTEntitySpear> NOMAD_SPEAR;
    public static EntityType<GOTEntitySpear> SOTHORYOS_SPEAR;
    public static EntityType<GOTEntitySpear> STONE_SPEAR;
    public static EntityType<GOTEntitySpear> SUMMER_SPEAR;
    public static EntityType<GOTEntitySpear> VALYRIAN_SPEAR;
    public static EntityType<GOTEntitySpear> WESTEROS_SPEAR;
    public static EntityType<GOTEntitySpear> WILDLING_SPEAR;
    public static EntityType<GOTEntitySpear> YITI_SPEAR;
    public static EntityType<GOTEntityThrowingAxe> THROWING_AXE;

    public static void init() {
        OBARA_SPEAR = register("obara_spear", createEntityType(GOTEntitySpear::new));
        SUNSPEAR = register("sunspear", createEntityType(GOTEntitySpear::new));
        ASSHAI_SPEAR = register("asshai_spear", createEntityType(GOTEntitySpear::new));
        BRONZE_SPEAR = register("bronze_spear", createEntityType(GOTEntitySpear::new));
        ESSOS_SPEAR = register("essos_spear", createEntityType(GOTEntitySpear::new));
        ICE_SPEAR = register("ice_spear", createEntityType(GOTEntitySpear::new));
        IRON_SPEAR = register("iron_spear", createEntityType(GOTEntitySpear::new));
        LHAZAR_SPEAR = register("lhazar_spear", createEntityType(GOTEntitySpear::new));
        NOMAD_SPEAR = register("nomad_spear", createEntityType(GOTEntitySpear::new));
        SOTHORYOS_SPEAR = register("sothoryos_spear", createEntityType(GOTEntitySpear::new));
        STONE_SPEAR = register("stone_spear", createEntityType(GOTEntitySpear::new));
        SUMMER_SPEAR = register("summer_spear", createEntityType(GOTEntitySpear::new));
        VALYRIAN_SPEAR = register("valyrian_spear", createEntityType(GOTEntitySpear::new));
        WESTEROS_SPEAR = register("westeros_spear", createEntityType(GOTEntitySpear::new));
        WILDLING_SPEAR = register("wildling_spear", createEntityType(GOTEntitySpear::new));
        YITI_SPEAR = register("yiti_spear", createEntityType(GOTEntitySpear::new));
    }

    private static <T extends Entity> EntityType<T> register(String s, EntityType<T> bombEntityType) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(GOT.MOD_ID, s), bombEntityType);
    }

    private static <T extends Entity> EntityType<T> createEntityType(EntityType.EntityFactory<T> factory) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }
}
