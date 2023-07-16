package net.isaac.got.util;

import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.isaac.got.GOT;
import net.isaac.got.client.GOTSpearItemRenderer;
import net.isaac.got.client.GOTSpearRenderer;
import net.isaac.got.common.item.weapon.GOTEntities.model.GOTEntitySpearModel;
import net.isaac.got.common.item.weapon.GOTItemSpear;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

public class GOTModelPredicateProvider {
    public static void registerModelModels() {
        registerBow(GOTWeapons.Asshai_Bow);
        registerBow(GOTWeapons.Essos_Bow);
        registerBow(GOTWeapons.Nomad_Bow);
        registerBow(GOTWeapons.Westeros_Bow);
        registerBow(GOTWeapons.Yiti_Bow);

        registerSpears();
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

    private static void registerSpears() {
        EntityModelLayerRegistry.registerModelLayer(ASSHAI_SPEAR, GOTEntitySpearModel::getAsshaiSpearTexturedModelData);

        for (GOTItemSpear item : GOTWeapons.ALL_SPEARS) {
            Identifier tridentId = Registries.ITEM.getId(item);
            Identifier texture = new Identifier(tridentId.getNamespace(), "textures/entity/handheld/" + tridentId.getPath() + ".png");

            EntityModelLayer modelLayer = ASSHAI_SPEAR;
            GOTSpearItemRenderer tridentItemRenderer = new GOTSpearItemRenderer(tridentId, texture, modelLayer);
            ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(tridentItemRenderer);
            BuiltinItemRendererRegistry.INSTANCE.register(item, tridentItemRenderer);
            EntityRendererRegistry.register(item.getEntityType(), ctx -> new GOTSpearRenderer(ctx, texture, modelLayer));

            FabricModelPredicateProviderRegistry.register(item, new Identifier("throwing"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
            ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> out.accept(new ModelIdentifier(tridentId.getNamespace(), tridentId.getPath() + "_in_inventory", "inventory")));
        }
    }

    public static final EntityModelLayer ASSHAI_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "asshai_spear"), "main");
}
