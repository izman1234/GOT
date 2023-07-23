package net.isaac.got.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.isaac.got.GOT;
import net.isaac.got.common.faction.GOTFactions;
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

        chooseColor(drawContext); //not working :/
        drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 114, 2, 2, 16, 228, 12, 256, 256);

        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        drawContext.drawTexture(ALIGNMENT_PLAYER_HUD, x - 116, 0, 0, 0, 232, 14, 256, 256);

        chooseText(drawContext, x, 15);


    }

    public static void chooseColor(DrawContext drawContext) {
        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getCurrentArea().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentWesterosData().getInt("alignment_westeros");
                RenderSystem.setShaderColor(GOTFactions.WesterosfactionRed[WesterosIndex], GOTFactions.WesterosfactionGreen[WesterosIndex], GOTFactions.WesterosfactionBlue[WesterosIndex], 1.0F);
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentWEssosData().getInt("alignment_w_essos");
                RenderSystem.setShaderColor(GOTFactions.WEssosfactionRed[WEssosIndex], GOTFactions.WEssosfactionGreen[WEssosIndex], GOTFactions.WEssosfactionBlue[WEssosIndex], 1.0F);
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentEEssosData().getInt("alignment_e_essos");
                RenderSystem.setShaderColor(GOTFactions.EEssosfactionRed[EEssosIndex], GOTFactions.EEssosfactionGreen[EEssosIndex], GOTFactions.EEssosfactionBlue[EEssosIndex], 1.0F);
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentSouthData().getInt("alignment_south");
                RenderSystem.setShaderColor(GOTFactions.SouthfactionRed[SouthIndex], GOTFactions.SouthfactionGreen[SouthIndex], GOTFactions.SouthfactionBlue[SouthIndex], 1.0F);
                break;
        }

    }

    public static void chooseText(DrawContext drawContext, int x, int y) {
        TextRenderer renderer = MinecraftClient.getInstance().textRenderer;

        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getCurrentArea().getInt("alignment_current_area")) {
            case 0: //westeros
                switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentWesterosData().getInt("alignment_westeros")) {
                    case 0:
                        drawContext.drawCenteredTextWithShadow(renderer, "White Walkers", x, y, 16112962);
                        break;
                    case 1:
                        drawContext.drawCenteredTextWithShadow(renderer, "Wildlings", x, y, 16112962);
                        break;
                    case 2:
                        drawContext.drawCenteredTextWithShadow(renderer, "Night's Watch", x, y, 16112962);
                        break;
                    case 3:
                        drawContext.drawCenteredTextWithShadow(renderer, "North", x, y, 16112962);
                        break;
                    case 4:
                        drawContext.drawCenteredTextWithShadow(renderer, "Iron Islands", x, y, 16112962);
                        break;
                    case 5:
                        drawContext.drawCenteredTextWithShadow(renderer, "Westerlands", x, y, 16112962);
                        break;
                    case 6:
                        drawContext.drawCenteredTextWithShadow(renderer, "Riverlands", x, y, 16112962);
                        break;
                    case 7:
                        drawContext.drawCenteredTextWithShadow(renderer, "Hill-Tribes", x, y, 16112962);
                        break;
                    case 8:
                        drawContext.drawCenteredTextWithShadow(renderer, "Arryn Vale", x, y, 16112962);
                        break;
                    case 9:
                        drawContext.drawCenteredTextWithShadow(renderer, "Dragonstone", x, y, 16112962);
                        break;
                    case 10:
                        drawContext.drawCenteredTextWithShadow(renderer, "Crownlands", x, y, 16112962);
                        break;
                    case 11:
                        drawContext.drawCenteredTextWithShadow(renderer, "Stormlands", x, y, 16112962);
                        break;
                    case 12:
                        drawContext.drawCenteredTextWithShadow(renderer, "Reach", x, y, 16112962);
                        break;
                    case 13:
                        drawContext.drawCenteredTextWithShadow(renderer, "Dorne", x, y, 16112962);
                        break;
                    default:
                        drawContext.drawCenteredTextWithShadow(renderer, "Something is wrong", x, y, 16112962);
                        break;
                }
                break;
            case 1: //west essos
                switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentWEssosData().getInt("alignment_w_essos")) {
                    case 0:
                        drawContext.drawCenteredTextWithShadow(renderer, "Braavos", x, y, 16112962);
                        break;
                    case 1:
                        drawContext.drawCenteredTextWithShadow(renderer, "Volantis", x, y, 16112962);
                        break;
                    case 2:
                        drawContext.drawCenteredTextWithShadow(renderer, "Pentos", x, y, 16112962);
                        break;
                    case 3:
                        drawContext.drawCenteredTextWithShadow(renderer, "Norvos", x, y, 16112962);
                        break;
                    case 4:
                        drawContext.drawCenteredTextWithShadow(renderer, "Lorath", x, y, 16112962);
                        break;
                    case 5:
                        drawContext.drawCenteredTextWithShadow(renderer, "Myr", x, y, 16112962);
                        break;
                    case 6:
                        drawContext.drawCenteredTextWithShadow(renderer, "Lys", x, y, 16112962);
                        break;
                    case 7:
                        drawContext.drawCenteredTextWithShadow(renderer, "Qohor", x, y, 16112962);
                        break;
                    case 8:
                        drawContext.drawCenteredTextWithShadow(renderer, "Tyrosh", x, y, 16112962);
                        break;
                    case 9:
                        drawContext.drawCenteredTextWithShadow(renderer, "Ghiscar", x, y, 16112962);
                        break;
                    case 10:
                        drawContext.drawCenteredTextWithShadow(renderer, "Qarth", x, y, 16112962);
                        break;
                    case 11:
                        drawContext.drawCenteredTextWithShadow(renderer, "Lhazar", x, y, 16112962);
                        break;
                    case 12:
                        drawContext.drawCenteredTextWithShadow(renderer, "Dothraki", x, y, 16112962);
                        break;
                    default:
                        drawContext.drawCenteredTextWithShadow(renderer, "Something is wrong", x, y, 16112962);
                        break;
                }
                break;
            case 2: //east essos
                switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentEEssosData().getInt("alignment_e_essos")) {
                    case 0:
                        drawContext.drawCenteredTextWithShadow(renderer, "Ibben", x, y, 16112962);
                        break;
                    case 1:
                        drawContext.drawCenteredTextWithShadow(renderer, "Jogos Nhai", x, y, 16112962);
                        break;
                    case 2:
                        drawContext.drawCenteredTextWithShadow(renderer, "Mossovy", x, y, 16112962);
                        break;
                    case 3:
                        drawContext.drawCenteredTextWithShadow(renderer, "Yi Ti", x, y, 16112962);
                        break;
                    case 4:
                        drawContext.drawCenteredTextWithShadow(renderer, "Asshai", x, y, 16112962);
                        break;
                    default:
                        drawContext.drawCenteredTextWithShadow(renderer, "Something is wrong", x, y, 16112962);
                        break;
                }
                break;
            case 3: //south
                switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentSouthData().getInt("alignment_south")) {
                    case 0:
                        drawContext.drawCenteredTextWithShadow(renderer, "Sothoryos", x, y, 16112962);
                        break;
                    case 1:
                        drawContext.drawCenteredTextWithShadow(renderer, "Summer Islands", x, y, 16112962);
                        break;
                    case 2:
                        drawContext.drawCenteredTextWithShadow(renderer, "Ulthos", x, y, 16112962);
                        break;
                    default:
                        drawContext.drawCenteredTextWithShadow(renderer, "Something is wrong", x, y, 16112962);
                        break;
                }
                break;
        }

    }
}
