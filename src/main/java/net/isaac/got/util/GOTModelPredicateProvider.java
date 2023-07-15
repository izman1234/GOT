package net.isaac.got.util;

import net.isaac.got.common.item.weapon.GOTWeapons;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class GOTModelPredicateProvider {
    public static void registerModelModels() {
        registerBow(GOTWeapons.Asshai_Bow);
        registerBow(GOTWeapons.Essos_Bow);
        registerBow(GOTWeapons.Nomad_Bow);
        registerBow(GOTWeapons.Westeros_Bow);
        registerBow(GOTWeapons.Yiti_Bow);
        //registerSpear(GOTWeapons.Asshai_Spear);
    }

    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem() != stack ? 0.0F : (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), (stack, world, entity, seed) ->
            entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
    }

    private static void registerSpear(Item spear) {
        ModelPredicateProviderRegistry.register(spear, new Identifier("throwing"), (stack, world, entity, seed) -> {
            return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
        });
    }
}
