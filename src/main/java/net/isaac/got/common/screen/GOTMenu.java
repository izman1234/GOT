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
import net.minecraft.client.gui.widget.TexturedButtonWidget;

@Environment(EnvType.CLIENT)
public class GOTMenu extends Screen {
    private static final Identifier GOT_MENU_GUI = new Identifier(GOT.MOD_ID, "textures/gui/menu_icons.png");
    public GOTMenu() {
        super(Text.literal("GOT Menu"));
    }
    //private static final Text ADVANCEMENTS_TEXT = Text.translatable("gui.advancements");
    //private static final Identifier WINDOW_TEXTURE = new Identifier("textures/gui/advancements/window.png");

    public TexturedButtonWidget achievements;
    public TexturedButtonWidget map;
    public TexturedButtonWidget factions;
    public TexturedButtonWidget localization;
    public TexturedButtonWidget fellowships;
    public TexturedButtonWidget titles;
    public TexturedButtonWidget attributes;
    public TexturedButtonWidget options;

    @Override
    public void init() {
        int x = 0;
        int y = 0;
        if(client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height / 2;
        }
        achievements = new TexturedButtonWidget(x - 79, y - 37, 32, 32, 64, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Achievements");
        });
        map = new TexturedButtonWidget(x - 37, y - 37, 32, 32, 96, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Map");
        });
        factions = new TexturedButtonWidget(x + 5, y - 37, 32, 32, 128, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Factions");
            client.setScreen(new Factions(this));
        });
        localization = new TexturedButtonWidget(x + 47, y - 37, 32, 32, 0, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Localization");
        });
        fellowships = new TexturedButtonWidget(x - 79, y + 5, 32, 32, 192, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Fellowships");
        });
        titles = new TexturedButtonWidget(x - 37, y + 5, 32, 32, 224, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Titles");
        });
        attributes = new TexturedButtonWidget(x + 5, y + 5, 32, 32, 160, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Attributes");
        });
        options = new TexturedButtonWidget(x + 47, y + 5, 32, 32, 32, 0, 32,
                GOT_MENU_GUI, button -> {
            System.out.println("Options");
        });

        addDrawableChild(achievements);
        addDrawableChild(map);
        addDrawableChild(factions);
        addDrawableChild(localization);
        addDrawableChild(fellowships);
        addDrawableChild(titles);
        addDrawableChild(attributes);
        addDrawableChild(options);
    }


}
