package net.isaac.got.common.screen;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.isaac.got.GOT;
import net.isaac.got.common.faction.GOTFactions;
import net.isaac.got.networking.GOTMessages;
import net.isaac.got.networking.packet.AlignmentC2SPacket;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

@Environment(EnvType.CLIENT)
public class Factions extends Screen {
    private final Screen parent;
    private int currentAlignment;
    private static final Identifier GOT_MAP = new Identifier(GOT.MOD_ID, "textures/gui/map.png");
    private static final Identifier GOT_FACTIONS = new Identifier(GOT.MOD_ID, "textures/gui/factions.png");
    public ButtonWidget switchRegion;

    public int scrollX;
    public ButtonWidget menu;
    public TexturedButtonWidget right;
    public TexturedButtonWidget left;
    public int pageNumber = 1;
    public TexturedButtonWidget scroll;
    private final List<Drawable> drawables = Lists.newArrayList();

    private TextRenderer renderer = MinecraftClient.getInstance().textRenderer;
    protected Factions(Screen parent) {
        super(Text.literal("GOT Faction Screen"));
        this.parent = parent;
    }

    @Override
    public void init() {
        GOTFactions.initFriends();
        int x = 0;
        int y = 0;
        if(client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height / 2;
        }
        switchRegion = ButtonWidget.builder(Text.literal("Switch Region"), button -> {
            System.out.println("Switched Region");
        }).dimensions(x + 5, y + 90, 120, 20).build();
        menu = ButtonWidget.builder(Text.literal("Menu"), button -> {
            System.out.println("Menu");
            client.setScreen(parent);
        }).dimensions(x - 125, y + 90, 120, 20).build();
        scroll = new TexturedButtonWidget(x - 8, y + 71, 17, 12, 0, 142, 0,
                GOT_FACTIONS, button -> {

        });
        right = new TexturedButtonWidget(x + 110, y + 42, 10, 14, 31, 161, 15,
                GOT_FACTIONS, button -> {
            System.out.println("Right");
            if(pageNumber < 4) {
                pageNumber++;
            }
        });
        left = new TexturedButtonWidget(x - 120, y + 42, 10, 14, 16, 161, 15,
                GOT_FACTIONS, button -> {
            System.out.println("Left");
            if(pageNumber > 1) {
                pageNumber--;
            }
        });

        this.addDrawableChild(switchRegion);
        this.addDrawableChild(menu);
    }

    //drawContext.drawTexture(GOT_FACTIONS, x - 8, y + 71, 0, 142, 17, 12, 256, 256);

    @Override
    public void render(DrawContext drawContext, int mouseX, int mouseY, float delta) {
        super.render(drawContext, mouseX, mouseY, delta);

        int x = 0;
        int y = 0;
        if(client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height / 2;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderTexture(0, GOT_FACTIONS);

        drawContext.drawTexture(GOT_FACTIONS, x - 128, y - 64, 0, 0, 256, 128, 256, 256);
        this.addDrawableChild(right).render(drawContext, mouseX, mouseY, delta);
        this.addDrawableChild(left).render(drawContext, mouseX, mouseY, delta);

        if(this.pageNumber == 1) {
            this.left.visible = false;
            this.right.visible = true;
            drawContext.drawText(renderer, "Reputation:", x - 113, y - 50, 0x7a5d43, false);
            rep(drawContext, x - 55, y);
            relation(drawContext, x - 113, y - 40);

            if (this.currentAlignment < 0) {
                drawContext.drawText(renderer, "NPCs Slain:", x - 113, y - 20, 0x7a5d43, false);
            }
            else {
                drawContext.drawText(renderer, "Enemies Slain:", x - 113, y - 20, 0x7a5d43, false);
                drawContext.drawText(renderer, "Trades Made:", x - 113, y - 10, 0x7a5d43, false);
                drawContext.drawText(renderer, "Units Hired:", x - 113, y, 0x7a5d43, false);
                drawContext.drawText(renderer, "Mini-Quests Completed:", x - 113, y + 10, 0x7a5d43, false);
                if(this.currentAlignment == 0) {
                    drawContext.drawText(renderer, "NPCs Slain:", x - 113, y + 20, 0x7a5d43, false);
                }
            }
        }
        else if(this.pageNumber == 2) {
            this.left.visible = true;
            this.right.visible = true;
            drawContext.drawText(renderer, "Ranks:", x - 113, y - 50, 0x7a5d43, false);
            pageTwo(drawContext, x - 113, y);
        }
        else if(this.pageNumber == 3) {
            this.left.visible = true;
            this.right.visible = true;
            drawContext.drawText(renderer, "Friends:", x - 113, y - 50, 0x7a5d43, false);
            friends(drawContext, x - 113, y);
            //something
        }
        else if(this.pageNumber == 4) {
            this.left.visible = true;
            this.right.visible = false;
            drawContext.drawText(renderer, "Mortal Enemies:", x - 113, y - 50, 0x7a5d43, false);
            drawContext.drawText(renderer, "Enemies:", x - 113, y - 20, 0x7a5d43, false);
        }

        sectionScrollBar(drawContext, x, y);
        this.addDrawableChild(scroll).render(drawContext, mouseX, mouseY, delta); //order mattered for scroll

        if(this.switchRegion.isFocused()) {
            ClientPlayNetworking.send(GOTMessages.ALIGNMENT_UP_ID, PacketByteBufs.create());
            rep(drawContext, x - 55, y);
            this.switchRegion.setFocused(false);
        }

        if(this.scroll.isMouseOver(mouseX, mouseY) && this.scroll.isFocused()) {
            if(mouseX - 10 < x - 119) {
                this.scroll.setPosition(x - 119, y + 71);
                scrollX = x - 119 + 8;
            }
            else if(mouseX - 10 > x + 102) {
                this.scroll.setPosition(x + 102, y + 71);
                scrollX = x + 102 + 8;
            }
            else {
                this.scroll.setPosition(mouseX - 10, y + 71);
                scrollX = mouseX - 10 + 8;
            }
        }
        else {
            this.scroll.setFocused(false);
        }

        changeFaction(x);

    }


    @Override
    public void close() {
        client.setScreen(parent);
    }

    public void rep(DrawContext drawContext, int x, int y) {
        int[] potato =  ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getIntArray("current_alignments");

        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                this.currentAlignment = potato[WesterosIndex];
                drawContext.drawText(renderer, Integer.toString(this.currentAlignment), x, y - 50, 16112962, true);
                switchRegion.setMessage(Text.literal("Westeros"));
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                this.currentAlignment = potato[AlignmentData.MaxFactionAmountW + WEssosIndex];
                drawContext.drawText(renderer, Integer.toString(this.currentAlignment), x, y - 50, 16112962, true);
                switchRegion.setMessage(Text.literal("West Essos"));
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                this.currentAlignment = potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + EEssosIndex];
                drawContext.drawText(renderer, Integer.toString(this.currentAlignment), x, y - 50, 16112962, true);
                switchRegion.setMessage(Text.literal("East Essos"));
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                this.currentAlignment = potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + AlignmentData.MaxFactionAmountEE + SouthIndex];
                drawContext.drawText(renderer, Integer.toString(this.currentAlignment), x, y - 50, 16112962, true);
                switchRegion.setMessage(Text.literal("South"));
                break;
        }
    }

    public void relation(DrawContext drawContext, int x, int y) {
        if(this.currentAlignment < 0 ) {
            drawContext.drawText(renderer, "Traitor", x, y, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 10) {
            drawContext.drawText(renderer, "Neutral", x, y, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 50) {
            drawContext.drawText(renderer, "Guest", x, y, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 100) {
            drawContext.drawText(renderer, "Friend", x, y, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 500) {
            drawContext.drawText(renderer, "Benefactor", x, y, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 1000) {
            drawContext.drawText(renderer, "Hero", x, y, 0x7a5d43, false);
        }
        else {
            drawContext.drawText(renderer, "Patron", x, y, 0x7a5d43, false);
        }
    }

    public void pageTwo(DrawContext drawContext, int x, int y) {
        int[] potato =  ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getIntArray("current_alignments");

        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                this.currentAlignment = potato[WesterosIndex];
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                this.currentAlignment = potato[AlignmentData.MaxFactionAmountW + WEssosIndex];
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                this.currentAlignment = potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + EEssosIndex];
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                this.currentAlignment = potato[AlignmentData.MaxFactionAmountW + AlignmentData.MaxFactionAmountWE + AlignmentData.MaxFactionAmountEE + SouthIndex];
                break;
        }

        if(this.currentAlignment < 0 ) {
            drawContext.drawTextWithShadow(renderer, "• Traitor (-)", x, y - 40, 16112962);
            drawContext.drawText(renderer, "• Neutral (0)", x, y - 30, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Guest (+10)", x, y - 20, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Friend (+50)", x, y - 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Benefactor (+100)", x, y, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Hero (+500)", x, y + 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Patron (+1000)", x, y + 20, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 10) {
            drawContext.drawText(renderer, "• Traitor (-)", x, y - 40, 0x7a5d43, false);
            drawContext.drawTextWithShadow(renderer, "• Neutral (0)", x, y - 30, 16112962);
            drawContext.drawText(renderer, "• Guest (+10)", x, y - 20, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Friend (+50)", x, y - 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Benefactor (+100)", x, y, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Hero (+500)", x, y + 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Patron (+1000)", x, y + 20, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 50) {
            drawContext.drawText(renderer, "• Traitor (-)", x, y - 40, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Neutral (0)", x, y - 30, 0x7a5d43, false);
            drawContext.drawTextWithShadow(renderer, "• Guest (+10)", x, y - 20, 16112962);
            drawContext.drawText(renderer, "• Friend (+50)", x, y - 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Benefactor (+100)", x, y, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Hero (+500)", x, y + 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Patron (+1000)", x, y + 20, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 100) {
            drawContext.drawText(renderer, "• Traitor (-)", x, y - 40, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Neutral (0)", x, y - 30, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Guest (+10)", x, y - 20, 0x7a5d43, false);
            drawContext.drawTextWithShadow(renderer, "• Friend (+50)", x, y - 10, 16112962);
            drawContext.drawText(renderer, "• Benefactor (+100)", x, y, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Hero (+500)", x, y + 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Patron (+1000)", x, y + 20, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 500) {
            drawContext.drawText(renderer, "• Traitor (-)", x, y - 40, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Neutral (0)", x, y - 30, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Guest (+10)", x, y - 20, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Friend (+50)", x, y - 10, 0x7a5d43, false);
            drawContext.drawTextWithShadow(renderer, "• Benefactor (+100)", x, y, 16112962);
            drawContext.drawText(renderer, "• Hero (+500)", x, y + 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Patron (+1000)", x, y + 20, 0x7a5d43, false);
        }
        else if(this.currentAlignment < 1000) {
            drawContext.drawText(renderer, "• Traitor (-)", x, y - 40, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Neutral (0)", x, y - 30, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Guest (+10)", x, y - 20, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Friend (+50)", x, y - 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Benefactor (+100)", x, y, 0x7a5d43, false);
            drawContext.drawTextWithShadow(renderer, "• Hero (+500)", x, y + 10, 16112962);
            drawContext.drawText(renderer, "• Patron (+1000)", x, y + 20, 0x7a5d43, false);
        }
        else {
            drawContext.drawText(renderer, "• Traitor (-)", x, y - 40, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Neutral (0)", x, y - 30, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Guest (+10)", x, y - 20, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Friend (+50)", x, y - 10, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Benefactor (+100)", x, y, 0x7a5d43, false);
            drawContext.drawText(renderer, "• Hero (+500)", x, y + 10, 0x7a5d43, false);
            drawContext.drawTextWithShadow(renderer, "• Patron (+1000)", x, y + 20, 16112962);
        }
    }
    public void sectionScrollBar(DrawContext drawContext, int x, int y) {
        drawContext.drawTexture(GOT_FACTIONS, x - 120, y + 70, 0, 128, 240, 14, 256, 256);

        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                for(int i = 1; i <= AlignmentData.MaxFactionAmountW; i++) {
                    RenderSystem.setShaderColor(GOTFactions.WesterosfactionRed[i - 1]/255.0F, GOTFactions.WesterosfactionGreen[i - 1]/255.0F, GOTFactions.WesterosfactionBlue[i - 1]/255.0F, 1.0F);
                    drawContext.drawTexture(GOT_FACTIONS, x - 119 + (17 * (i - 1)), y + 71, 1 + (17 * (i - 1)), 129, 17, 12, 256, 256);
                }
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                for(int i = 1; i <= AlignmentData.MaxFactionAmountWE; i++) {
                    RenderSystem.setShaderColor(GOTFactions.WEssosfactionRed[i - 1]/255.0F, GOTFactions.WEssosfactionGreen[i - 1]/255.0F, GOTFactions.WEssosfactionBlue[i - 1]/255.0F, 1.0F);
                    if(i == AlignmentData.MaxFactionAmountWE) {
                        drawContext.drawTexture(GOT_FACTIONS, x - 119 + (18 * (i - 1)), y + 71, 1 + (17 * (i - 1)), 129, 22, 12, 256, 256);

                    }
                    else {
                        drawContext.drawTexture(GOT_FACTIONS, x - 119 + (18 * (i - 1)), y + 71, 1 + (18 * (i - 1)), 129, 18, 12, 256, 256);

                    }
                }
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                for(int i = 1; i <= AlignmentData.MaxFactionAmountEE; i++) {
                    RenderSystem.setShaderColor(GOTFactions.EEssosfactionRed[i - 1]/255.0F, GOTFactions.EEssosfactionGreen[i - 1]/255.0F, GOTFactions.EEssosfactionBlue[i - 1]/255.0F, 1.0F);
                    if(i == AlignmentData.MaxFactionAmountEE) {
                        drawContext.drawTexture(GOT_FACTIONS, x - 119 + (47 * (i - 1)), y + 71, 1 + (47 * (i - 1)), 129, 50, 12, 256, 256);
                    }
                    else {
                        drawContext.drawTexture(GOT_FACTIONS, x - 119 + (47 * (i - 1)), y + 71, 1 + (47 * (i - 1)), 129, 47, 12, 256, 256);
                    }
                }
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                for(int i = 1; i <= AlignmentData.MaxFactionAmountS; i++) {
                    RenderSystem.setShaderColor(GOTFactions.SouthfactionRed[i - 1]/255.0F, GOTFactions.SouthfactionGreen[i - 1]/255.0F, GOTFactions.SouthfactionBlue[i - 1]/255.0F, 1.0F);
                    if(i == AlignmentData.MaxFactionAmountS) {
                        drawContext.drawTexture(GOT_FACTIONS, x - 119 + (79 * (i - 1)), y + 71, 1 + (79 * (i - 1)), 129, 80, 12, 256, 256);
                    }
                    else {
                        drawContext.drawTexture(GOT_FACTIONS, x - 119 + (79 * (i - 1)), y + 71, 1 + (79 * (i - 1)), 129, 79, 12, 256, 256);
                    }
                }
                break;
        }
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void changeFaction(int x) {
        int area = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area");
        float xleft;
        float xright;
        switch(area) {
            case 0:
                for(int i = 1; i <= AlignmentData.MaxFactionAmountW; i++) {
                    xleft = (float)x - 119.0F + (17.0F * ((float)i - 1.0F));
                    xright = xleft + 17.0F;
                    if((scrollX >= (int)xleft) && (scrollX <= (int)xright)) {
                        ((IEntityDataSaver) MinecraftClient.getInstance().player).setAmount(i - 1);
                        //AlignmentC2SPacket.setAmount = i - 1;
                        ClientPlayNetworking.send(GOTMessages.SET_FACTION_ID, PacketByteBufs.create());

                    }
                }
                break;
            case 1:
                for(int i = 1; i <= AlignmentData.MaxFactionAmountWE; i++) {
                    xleft = (float)x - 119.0F + (18.3F * ((float)i - 1.0F));
                    xright = xleft + 18.3F;
                    if((scrollX >= (int)xleft) && (scrollX <= (int)xright)) {
                        ((IEntityDataSaver) MinecraftClient.getInstance().player).setAmount(i - 1);
                        //AlignmentC2SPacket.setAmount = i - 1;
                        ClientPlayNetworking.send(GOTMessages.SET_FACTION_ID, PacketByteBufs.create());
                    }
                }
                break;
            case 2:
                for(int i = 1; i <= AlignmentData.MaxFactionAmountEE; i++) {
                    xleft = (float)x - 119.0F + (47.6F * ((float)i - 1.0F));
                    xright = xleft + 47.6F;
                    if((scrollX >= (int)xleft) && (scrollX <= (int)xright)) {
                        ((IEntityDataSaver) MinecraftClient.getInstance().player).setAmount(i - 1);
                        //AlignmentC2SPacket.setAmount = i - 1;
                        ClientPlayNetworking.send(GOTMessages.SET_FACTION_ID, PacketByteBufs.create());
                    }
                }
                break;
            case 3:
                for(int i = 1; i <= AlignmentData.MaxFactionAmountS; i++) {
                    xleft = (float)x - 119.0F + (79.33F * ((float)i - 1.0F));
                    xright = xleft + 79.33F;
                    if((scrollX >= (int)xleft) && (scrollX <= (int)xright)) {
                        ((IEntityDataSaver) MinecraftClient.getInstance().player).setAmount(i - 1);
                        //AlignmentC2SPacket.setAmount = i - 1;
                        ClientPlayNetworking.send(GOTMessages.SET_FACTION_ID, PacketByteBufs.create());
                    }
                }
                break;
        }
        //AlignmentData.setFaction((IEntityDataSaver) client, 5, 1);
    }

    public void friends(DrawContext drawContext, int x, int y) {
        switch(((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_current_area")) {
            case 0: //westeros
                int WesterosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_westeros");
                for(int i = 0; i < GOTFactions.WesterosFriends[WesterosIndex].length; ++i) {
                    drawContext.drawText(renderer, GOTFactions.WesterosFriends[WesterosIndex][i], x, y - (40 - (10*i)), 0x7a5d43, false);
                }
                break;
            case 1: //west essos
                int WEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_w_essos");
                for(int i = 0; i < GOTFactions.WEssosFriends[WEssosIndex].length; ++i) {
                    drawContext.drawText(renderer, GOTFactions.WEssosFriends[WEssosIndex][i], x, y - (40 - (10*i)), 0x7a5d43, false);
                }
                break;
            case 2: //east essos
                int EEssosIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_e_essos");
                for(int i = 0; i < GOTFactions.EEssosFriends[EEssosIndex].length; ++i) {
                    drawContext.drawText(renderer, GOTFactions.EEssosFriends[EEssosIndex][i], x, y - (40 - (10*i)), 0x7a5d43, false);
                }
                break;
            case 3: //south
                int SouthIndex = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAlignmentData().getInt("alignment_south");
                for(int i = 0; i < GOTFactions.SouthFriends[SouthIndex].length; ++i) {
                    drawContext.drawText(renderer, GOTFactions.SouthFriends[SouthIndex][i], x, y - (40 - (10*i)), 0x7a5d43, false);
                }
                break;
        }

    }

}
