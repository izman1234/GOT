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
    public static EntityType<GOTEntitySpear> ASSHAI_SPEAR;
    public static EntityType<GOTEntityThrowingAxe> THROWING_AXE;

    public static void init() {
        ASSHAI_SPEAR = register("asshai_spear", createEntityType(GOTEntitySpear::new));
        //THROWING_AXE = register("hellfork", createEntityType(HellforkEntity::new));
    }

    private static <T extends Entity> EntityType<T> register(String s, EntityType<T> bombEntityType) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(GOT.MOD_ID, s), bombEntityType);
    }

    private static <T extends Entity> EntityType<T> createEntityType(EntityType.EntityFactory<T> factory) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }
}
