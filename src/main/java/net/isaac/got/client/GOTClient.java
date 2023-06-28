package net.isaac.got.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.isaac.got.common.block.GOTBlocks;
import net.minecraft.client.render.RenderLayer;

public class GOTClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Arid_Grass, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Asshai_Bars, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Asshai_Flower, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Asshai_Grass, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Asshai_Moss, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Asshai_Thorn, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Asshai_Torch, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Bronze, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Bronze, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Gold, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Gold, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Iron, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Iron, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Silver, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Silver, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Wood, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bird_Cage_Wood, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Blackroot, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bluebell, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Bronze_Bars, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chandelier_Asshai, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chandelier_Bronze, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chandelier_Gold, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chandelier_Iron, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chandelier_Silver, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chandelier_Valyrian, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Corn_Stalk, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Corn_Stalk_Corn, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Cucumber, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Dead_Marsh_Plant, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Double_Flower_Black_Iris, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Double_Flower_Pink, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Double_Flower_Red, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Double_Flower_Yellow_Iris, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Essos_Flower_Daisy, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Essos_Flower_Pink, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Essos_Flower_Red, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Essos_Flower_Red2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Essos_Flower_Yellow, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Flax, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Leaves_Apple, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Leaves_Cherry, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Leaves_Mango, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Leaves_Pear, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Sapling_Apple, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Sapling_Cherry, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Sapling_Mango, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fruit_Sapling_Pear, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fuse, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fine_Glass, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fine_Glass_Pane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Gold_Bars, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Catalpa_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Ibbinia_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Ulthos_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Ulthos_Red_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Aramant_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Banana_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Beech_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Holly_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Date_Palm_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Larch_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Mangrove_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Maple_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Baobab_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Cedar_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Chestnut_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fir_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Lemon_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Lime_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Orange_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Pine_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Cypress_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Mahogany_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Olive_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Willow_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Almond_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Aspen_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Fotinia_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Green_Oak_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Palm_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Plum_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Pomegranate_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Redwood_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Dragon_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Kanuka_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Weirwood_Leaves, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Leek, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Lettuce, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Marigold, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Mirk_Vines, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Pipeweed, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Reed_Bars, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOTBlocks.Rice, RenderLayer.getCutout());


    }
}
