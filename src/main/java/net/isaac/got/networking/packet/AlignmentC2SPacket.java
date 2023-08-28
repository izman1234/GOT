package net.isaac.got.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class AlignmentC2SPacket {
    //public static int setAmount; //FIX LATER

    public static void set(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                    PacketByteBuf buf, PacketSender responseSender) {
        int currentArea = ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area");
        int setAmount = ((IEntityDataSaver) MinecraftClient.getInstance().player).getAmount();

        AlignmentData.setFaction(((IEntityDataSaver) player), setAmount, currentArea);
        switch(currentArea) {
            case 0:
                AlignmentData.syncAlignmentW(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_westeros"), player);
                break;
            case 1:
                AlignmentData.syncAlignmentWE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_w_essos"), player);
                break;
            case 2:
                AlignmentData.syncAlignmentEE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_e_essos"), player);
                break;
            case 3:
                AlignmentData.syncAlignmentS(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_south"), player);
                break;
        }
    }

    public static void right(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        //ONLY ON SEVER SIDE
        int currentArea = ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area");

        AlignmentData.switchFaction(((IEntityDataSaver) player), 1, currentArea);
        switch(currentArea) {
            case 0:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_westeros") + " for westeros"), true);
                AlignmentData.syncAlignmentW(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_westeros"), player);
                break;
            case 1:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_w_essos") + " for west essos"), true);
                AlignmentData.syncAlignmentWE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_w_essos"), player);
                break;
            case 2:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_e_essos") + " for east essos"), true);
                AlignmentData.syncAlignmentEE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_e_essos"), player);
                break;
            case 3:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_south") + " for south"), true);
                AlignmentData.syncAlignmentS(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_south"), player);
                break;
        }
    }

    public static void left(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                                PacketByteBuf buf, PacketSender responseSender) {
        //ONLY ON SEVER SIDE
        int currentArea = ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area");

        AlignmentData.switchFaction(((IEntityDataSaver) player), -1, currentArea);
        switch(currentArea) {
            case 0:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_westeros") + " for westeros"), true);
                AlignmentData.syncAlignmentW(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_westeros"), player);
                break;
            case 1:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_w_essos") + " for west essos"), true);
                AlignmentData.syncAlignmentWE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_w_essos"), player);
                break;
            case 2:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_e_essos") + " for east essos"), true);
                AlignmentData.syncAlignmentEE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_e_essos"), player);
                break;
            case 3:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentData().getInt("alignment_south") + " for south"), true);
                AlignmentData.syncAlignmentS(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_south"), player);
                break;
        }
    }

    public static void up(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                            PacketByteBuf buf, PacketSender responseSender) {
        AlignmentData.switchArea(((IEntityDataSaver) player), 1);
        switch(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area")) {
            case 0:
                player.sendMessage(Text.literal("Switched to Westeros"), true);
                break;
            case 1:
                player.sendMessage(Text.literal("Switched to West Essos"), true);
                break;
            case 2:
                player.sendMessage(Text.literal("Switched to East Essos"), true);
                break;
            case 3:
                player.sendMessage(Text.literal("Switched to South"), true);
                break;
        }
        AlignmentData.syncAlignmentArea(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area"), player);

    }

    public static void down(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                          PacketByteBuf buf, PacketSender responseSender) {
        AlignmentData.switchArea(((IEntityDataSaver) player), -1);
        switch(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area")) {
            case 0:
                player.sendMessage(Text.literal("Switched to Westeros"), true);
                break;
            case 1:
                player.sendMessage(Text.literal("Switched to West Essos"), true);
                break;
            case 2:
                player.sendMessage(Text.literal("Switched to East Essos"), true);
                break;
            case 3:
                player.sendMessage(Text.literal("Switched to South"), true);
                break;
        }

        AlignmentData.syncAlignmentArea(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area"), player);


    }

    public static void increase(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                                PacketByteBuf buf, PacketSender responseSender) {
        int amount = ((IEntityDataSaver) player).getAlignmentIncrease();
        AlignmentData.increaseAlignment(((IEntityDataSaver) player), amount);

        AlignmentData.syncCurrentAlignments(((IEntityDataSaver) player).getAlignmentData().getIntArray("current_alignments"), player);
    }
}
