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
    }
}
