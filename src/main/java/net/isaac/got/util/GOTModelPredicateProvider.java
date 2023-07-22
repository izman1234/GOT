package net.isaac.got.util;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
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
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Set;

public class GOTModelPredicateProvider {
    public static final EntityModelLayer OBARA_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "obara_spear"), "main");
    public static final EntityModelLayer SUNSPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "sunspear"), "main");
    public static final EntityModelLayer ASSHAI_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "asshai_spear"), "main");
    public static final EntityModelLayer BRONZE_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "bronze_spear"), "main");
    public static final EntityModelLayer ESSOS_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "essos_spear"), "main");
    public static final EntityModelLayer ICE_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "ice_spear"), "main");
    public static final EntityModelLayer IRON_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "iron_spear"), "main");
    public static final EntityModelLayer LHAZAR_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "lhazar_spear"), "main");
    public static final EntityModelLayer NOMAD_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "nomad_spear"), "main");
    public static final EntityModelLayer SOTHORYOS_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "sothoryos_spear"), "main");
    public static final EntityModelLayer STONE_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "stone_spear"), "main");
    public static final EntityModelLayer SUMMER_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "summer_spear"), "main");
    public static final EntityModelLayer VALYRIAN_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "valyrian_spear"), "main");
    public static final EntityModelLayer WESTEROS_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "westeros_spear"), "main");
    public static final EntityModelLayer WILDLING_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "wildling_spear"), "main");
    public static final EntityModelLayer YITI_SPEAR = new EntityModelLayer(new Identifier(GOT.MOD_ID, "yiti_spear"), "main");

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


    private static EntityModelLayer findSpear(GOTItemSpear item) {
        if(item == GOTWeapons.Obara_Spear) {
            return OBARA_SPEAR;
        }
        else if(item == GOTWeapons.Sunspear) {
            return SUNSPEAR;
        }
        else if(item == GOTWeapons.Asshai_Spear) {
            return ASSHAI_SPEAR;
        }
        else if(item == GOTWeapons.Bronze_Spear) {
            return BRONZE_SPEAR;
        }
        else if(item == GOTWeapons.Essos_Spear) {
            return ESSOS_SPEAR;
        }
        else if(item == GOTWeapons.Ice_Spear) {
            return ICE_SPEAR;
        }
        else if(item == GOTWeapons.Iron_Spear) {
            return IRON_SPEAR;
        }
        else if(item == GOTWeapons.Lhazar_Spear) {
            return LHAZAR_SPEAR;
        }
        else if(item == GOTWeapons.Nomad_Spear) {
            return NOMAD_SPEAR;
        }
        else if(item == GOTWeapons.Sothoryos_Spear) {
            return SOTHORYOS_SPEAR;
        }
        else if(item == GOTWeapons.Stone_Spear) {
            return STONE_SPEAR;
        }
        else if(item == GOTWeapons.Summer_Spear) {
            return SUMMER_SPEAR;
        }
        else if(item == GOTWeapons.Valyrian_Spear) {
            return VALYRIAN_SPEAR;
        }
        else if(item == GOTWeapons.Westeros_Spear) {
            return WESTEROS_SPEAR;
        }
        else if(item == GOTWeapons.Wildling_Spear) {
            return WILDLING_SPEAR;
        }
        else if(item == GOTWeapons.Yiti_Spear) {
            return YITI_SPEAR;
        }
        else {
            return null;
        }
    }

    private static void registerSpears() {
        EntityModelLayerRegistry.registerModelLayer(OBARA_SPEAR, GOTEntitySpearModel::getObaraSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(SUNSPEAR, GOTEntitySpearModel::getSunspearModelData);
        EntityModelLayerRegistry.registerModelLayer(ASSHAI_SPEAR, GOTEntitySpearModel::getAsshaiSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(BRONZE_SPEAR, GOTEntitySpearModel::getBronzeSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(ESSOS_SPEAR, GOTEntitySpearModel::getEssosSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(ICE_SPEAR, GOTEntitySpearModel::getIceSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(IRON_SPEAR, GOTEntitySpearModel::getIronSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(LHAZAR_SPEAR, GOTEntitySpearModel::getLhazarSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(NOMAD_SPEAR, GOTEntitySpearModel::getNomadSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(SOTHORYOS_SPEAR, GOTEntitySpearModel::getSothoryosSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(STONE_SPEAR, GOTEntitySpearModel::getStoneSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(SUMMER_SPEAR, GOTEntitySpearModel::getSummerSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(VALYRIAN_SPEAR, GOTEntitySpearModel::getValyrianSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(WESTEROS_SPEAR, GOTEntitySpearModel::getWesterosSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(WILDLING_SPEAR, GOTEntitySpearModel::getWildlingSpearModelData);
        EntityModelLayerRegistry.registerModelLayer(YITI_SPEAR, GOTEntitySpearModel::getYitiSpearModelData);

        for (GOTItemSpear item : GOTWeapons.ALL_SPEARS) {
            Identifier tridentId = Registries.ITEM.getId(item);
            Identifier texture = new Identifier(tridentId.getNamespace(), "textures/entity/handheld/" + tridentId.getPath() + ".png");

            EntityModelLayer modelLayer = findSpear(item);
            GOTSpearItemRenderer tridentItemRenderer = new GOTSpearItemRenderer(tridentId, texture, modelLayer);
            ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(tridentItemRenderer);
            BuiltinItemRendererRegistry.INSTANCE.register(item, tridentItemRenderer);
            EntityRendererRegistry.register(item.getEntityType(), ctx -> new GOTSpearRenderer(ctx, texture, modelLayer));

            FabricModelPredicateProviderRegistry.register(item, new Identifier("throwing"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
            ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> out.accept(new ModelIdentifier(tridentId.getNamespace(), tridentId.getPath() + "_in_inventory", "inventory")));
        }
    }

}
