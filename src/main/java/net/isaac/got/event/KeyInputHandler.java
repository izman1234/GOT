package net.isaac.got.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.isaac.got.common.screen.GOTMenu;
import net.isaac.got.networking.GOTMessages;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.SharedConstants;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.advancement.AdvancementsScreen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY = "key.category.got.category";
    public static final String KEY_SWITCH_ALIGNMENT_VIEW_RIGHT = "key.got.switch_alignment_view_right";
    public static final String KEY_SWITCH_ALIGNMENT_VIEW_LEFT = "key.got.switch_alignment_view_left";
    public static final String KEY_SWITCH_ALIGNMENT_VIEW_UP = "key.got.switch_alignment_view_up";
    public static final String KEY_SWITCH_ALIGNMENT_VIEW_DOWN = "key.got.switch_alignment_view_down";
    public static final String KEY_GOT_MENU = "key.got.got_menu";

    public static KeyBinding switchAlignmentKeyRight;
    public static KeyBinding switchAlignmentKeyLeft;
    public static KeyBinding switchAlignmentKeyUp;
    public static KeyBinding switchAlignmentKeyDown;
    public static KeyBinding GOTMenuButton;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(switchAlignmentKeyRight.wasPressed()) {
                ClientPlayNetworking.send(GOTMessages.ALIGNMENT_RIGHT_ID, PacketByteBufs.create());
            }
            else if(switchAlignmentKeyLeft.wasPressed()) {
                ClientPlayNetworking.send(GOTMessages.ALIGNMENT_LEFT_ID, PacketByteBufs.create());
            }
            else if(switchAlignmentKeyUp.wasPressed()) {
                ClientPlayNetworking.send(GOTMessages.ALIGNMENT_UP_ID, PacketByteBufs.create());
            }
            else if(switchAlignmentKeyDown.wasPressed()) {
                ClientPlayNetworking.send(GOTMessages.ALIGNMENT_DOWN_ID, PacketByteBufs.create());
            }
            else if(GOTMenuButton.wasPressed()) {
                //OPEN/CLOSE Menu
                client.setScreen(new GOTMenu());
            }
        });
    }

    public static void register() {
        switchAlignmentKeyRight = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_SWITCH_ALIGNMENT_VIEW_RIGHT,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT,
                KEY_CATEGORY
        ));
        switchAlignmentKeyLeft = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_SWITCH_ALIGNMENT_VIEW_LEFT,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_LEFT,
                KEY_CATEGORY
        ));
        switchAlignmentKeyUp = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_SWITCH_ALIGNMENT_VIEW_UP,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UP,
                KEY_CATEGORY
        ));
        switchAlignmentKeyDown = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_SWITCH_ALIGNMENT_VIEW_DOWN,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_DOWN,
                KEY_CATEGORY
        ));
        GOTMenuButton = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_GOT_MENU,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                KEY_CATEGORY
        ));

        registerKeyInputs();
    }

}
