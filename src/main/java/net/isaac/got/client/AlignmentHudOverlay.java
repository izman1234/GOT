package net.isaac.got.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.isaac.got.GOT;
import net.isaac.got.common.faction.GOTFactions;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;

public class AlignmentHudOverlay implements HudRenderCallback {
    private static final Identifier ALIGNMENT_PLAYER_HUD = new Identifier(GOT.MOD_ID, "textures/gui/alignment.png");
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if(client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderTexture(0, ALIGNMENT_PLAYER_HUD);

        //RenderSystem.enableBlend();
        chooseColor();
        drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 114, 7, 2, 16, 228, 12, 256, 256);
        //RenderSystem.disableBlend();

        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 116, 5, 0, 0, 232, 14, 256, 256);

        chooseText(drawContext, x, 20);
        placeSword(drawContext, x);


    }

    public static void chooseColor() {
        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                RenderSystem.setShaderColor(GOTFactions.WesterosfactionRed[WesterosIndex]/255.0F, GOTFactions.WesterosfactionGreen[WesterosIndex]/255.0F, GOTFactions.WesterosfactionBlue[WesterosIndex]/255.0F, 1.0F);
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                RenderSystem.setShaderColor(GOTFactions.WEssosfactionRed[WEssosIndex]/255.0F, GOTFactions.WEssosfactionGreen[WEssosIndex]/255.0F, GOTFactions.WEssosfactionBlue[WEssosIndex]/255.0F, 1.0F);
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                RenderSystem.setShaderColor(GOTFactions.EEssosfactionRed[EEssosIndex]/255.0F, GOTFactions.EEssosfactionGreen[EEssosIndex]/255.0F, GOTFactions.EEssosfactionBlue[EEssosIndex]/255.0F, 1.0F);
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                RenderSystem.setShaderColor(GOTFactions.SouthfactionRed[SouthIndex]/255.0F, GOTFactions.SouthfactionGreen[SouthIndex]/255.0F, GOTFactions.SouthfactionBlue[SouthIndex]/255.0F, 1.0F);
                break;
        }

    }

    public static void chooseText(DrawContext drawContext, int x, int y) {
        TextRenderer renderer = MinecraftClient.getInstance().textRenderer;
        int[] potato =  ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getIntArray("current_alignments");

        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                drawContext.drawCenteredTextWithShadow(renderer, GOTFactions.WesterosfactionName[WesterosIndex], x, y, 16112962);
                drawContext.drawCenteredTextWithShadow(renderer, Integer.toString(potato[WesterosIndex]), x, 30, 16112962);
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                drawContext.drawCenteredTextWithShadow(renderer, GOTFactions.WEssosfactionName[WEssosIndex], x, y, 16112962);
                drawContext.drawCenteredTextWithShadow(renderer, Integer.toString(potato[AlignmentData.MaxFactionAmountW + WEssosIndex]), x, 30, 16112962);
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                drawContext.drawCenteredTextWithShadow(renderer, GOTFactions.EEssosfactionName[EEssosIndex], x, y, 16112962);
                drawContext.drawCenteredTextWithShadow(renderer, Integer.toString(potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + EEssosIndex]), x, 30, 16112962);
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                drawContext.drawCenteredTextWithShadow(renderer, GOTFactions.SouthfactionName[SouthIndex], x, y, 16112962);
                drawContext.drawCenteredTextWithShadow(renderer, Integer.toString(potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + AlignmentData.MaxFactionAmountEE + SouthIndex]), x, 30, 16112962);
                break;
        }

    }

    public static void placeSword(DrawContext drawContext, int x) {
        int[] potato =  ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getIntArray("current_alignments");
        int alignmentNumber;

        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                alignmentNumber = potato[WesterosIndex];
                placeSwordHelper(drawContext, x, alignmentNumber);
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                alignmentNumber = potato[AlignmentData.MaxFactionAmountW + WEssosIndex];
                placeSwordHelper(drawContext, x, alignmentNumber);
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                alignmentNumber = potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + EEssosIndex];
                placeSwordHelper(drawContext, x, alignmentNumber);
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                alignmentNumber = potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + AlignmentData.MaxFactionAmountEE + SouthIndex];
                placeSwordHelper(drawContext, x, alignmentNumber);
                break;
        }

        //drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 8, 4, 0, 36, 16, 16, 256, 256);

    }

    public static void placeSwordHelper(DrawContext drawContext, int x, int alignmentNumber) {
        float xShift;
        if(Math.abs(alignmentNumber) > 10000) {
            xShift = (((float)alignmentNumber - 10000.0F) / 90000.0F) * 228.0F;
            if(alignmentNumber < 0) {
                xShift = 228.0F - xShift;
            }
            drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 8 + (int)Math.floor(xShift) - 114, 4, 0, 36, 16, 16, 256, 256);
        }
        else if(Math.abs(alignmentNumber) > 1000) {
            xShift = (((float)alignmentNumber - 1000.0F) / 9000.0F) * 228.0F;
            if(alignmentNumber < 0) {
                xShift = 228.0F - xShift;
            }
            drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 8 + (int)Math.floor(xShift) - 114, 4, 0, 36, 16, 16, 256, 256);
        }
        else if(Math.abs(alignmentNumber) > 100) {
            xShift = (((float)alignmentNumber - 100.0F) / 900.0F) * 228.0F;
            if(alignmentNumber < 0) {
                xShift = 228.0F - xShift;
            }
            drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 8 + (int)Math.floor(xShift) - 114, 4, 0, 36, 16, 16, 256, 256);
        }
        else if(Math.abs(alignmentNumber) > 10){
            xShift = (((float)alignmentNumber - 10.0F) / 90.0F) * 228.0F;
            if(alignmentNumber < 0) {
                xShift = 228.0F - xShift;
            }
            drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 8 + (int)Math.floor(xShift) - 114, 4, 0, 36, 16, 16, 256, 256);
        }
        else { //below 10
            xShift = (((float)alignmentNumber) / 10.0F) * 114.0F;
            if(alignmentNumber < 0) {
                xShift = -xShift;
            }
            drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 8 + (int)Math.floor(xShift), 4, 0, 36, 16, 16, 256, 256);
        }

    }
}
