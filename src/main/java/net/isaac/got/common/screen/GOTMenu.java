package net.isaac.got.common.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.isaac.got.GOT;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GOTMenu extends Screen {
    public GOTMenu() {
        super(Text.literal("GOT Menu"));
    }
    private static final Text ADVANCEMENTS_TEXT = Text.translatable("gui.advancements");
    private static final Identifier WINDOW_TEXTURE = new Identifier("textures/gui/advancements/window.png");

    public ButtonWidget achievements;
    public ButtonWidget map;
    public ButtonWidget factions;
    public ButtonWidget localization;
    public ButtonWidget fellowships;
    public ButtonWidget titles;
    public ButtonWidget attributes;
    public ButtonWidget options;

    @Override
    public void init() {
        achievements = ButtonWidget.builder(Text.literal("Achievements"), button -> {
                    System.out.println("Achievements");
                })
                .dimensions(width / 2 - 205, 20, 200, 20)
                .build();
        map = ButtonWidget.builder(Text.literal("Map"), button -> {
                    System.out.println("Map");
                })
                .dimensions(width / 2 + 5, 20, 200, 20)
                .build();
        factions = ButtonWidget.builder(Text.literal("Factions"), button -> {
                    System.out.println("Factions");
                })
                .dimensions(width / 2 - 205, 50, 200, 20)
                .build();
        localization = ButtonWidget.builder(Text.literal("Localization"), button -> {
                    System.out.println("Localization");
                })
                .dimensions(width / 2 + 5, 50, 200, 20)
                .build();
        fellowships = ButtonWidget.builder(Text.literal("Fellowships"), button -> {
                    System.out.println("Fellowships");
                })
                .dimensions(width / 2 - 205, 80, 200, 20)
                .build();
        titles = ButtonWidget.builder(Text.literal("Titles"), button -> {
                    System.out.println("Titles");
                })
                .dimensions(width / 2 + 5, 80, 200, 20)
                .build();
        attributes = ButtonWidget.builder(Text.literal("Attributes"), button -> {
                    System.out.println("Attributes");
                })
                .dimensions(width / 2 - 205, 110, 200, 20)
                .build();
        options = ButtonWidget.builder(Text.literal("Options"), button -> {
                    System.out.println("Options");
                })
                .dimensions(width / 2 + 5, 110, 200, 20)
                .build();

        addDrawableChild(achievements);
        addDrawableChild(map);
        addDrawableChild(factions);
        addDrawableChild(localization);
        addDrawableChild(fellowships);
        addDrawableChild(titles);
        addDrawableChild(attributes);
        addDrawableChild(options);
    }

    /*@Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (this.client.options.advancementsKey.matchesKey(keyCode, scanCode)) {
            this.client.setScreen(null);
            this.client.mouse.lockCursor();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        int i = (this.width - 252) / 2;
        int j = (this.height - 140) / 2;
        this.renderBackground(context);
        this.drawWindow(context, i, j);
    }

    public void drawWindow(DrawContext context, int x, int y) {
        RenderSystem.enableBlend();
        context.drawTexture(WINDOW_TEXTURE, x, y, 0, 0, 252, 140);
        /*if (this.tabs.size() > 1) {
            for (AdvancementTab advancementTab : this.tabs.values()) {
                advancementTab.drawBackground(context, x, y, advancementTab == this.selectedTab);
            }
            for (AdvancementTab advancementTab : this.tabs.values()) {
                advancementTab.drawIcon(context, x, y);
            }
        }*/
        //context.drawText(this.textRenderer, ADVANCEMENTS_TEXT, x + 8, y + 6, 0x404040, false);
    //}


}
