package net.isaac.got.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class AlignmentC2SPacket {
    public static void right(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        //ONLY ON SEVER SIDE

        AlignmentData.switchFaction(((IEntityDataSaver) player), 1, ((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area"));
        switch(((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area")) {
            case 0:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentWesterosData().getInt("alignment_westeros") + " for westeros"), true);
                AlignmentData.syncAlignmentW(((IEntityDataSaver) player).getAlignmentWesterosData().getInt("alignment_westeros"), player);
                break;
            case 1:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentWEssosData().getInt("alignment_w_essos") + " for west essos"), true);
                AlignmentData.syncAlignmentWE(((IEntityDataSaver) player).getAlignmentWEssosData().getInt("alignment_w_essos"), player);
                break;
            case 2:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentEEssosData().getInt("alignment_e_essos") + " for east essos"), true);
                AlignmentData.syncAlignmentEE(((IEntityDataSaver) player).getAlignmentEEssosData().getInt("alignment_e_essos"), player);
                break;
            case 3:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentSouthData().getInt("alignment_south") + " for south"), true);
                AlignmentData.syncAlignmentS(((IEntityDataSaver) player).getAlignmentSouthData().getInt("alignment_south"), player);
                break;
        }
    }

    public static void left(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                                PacketByteBuf buf, PacketSender responseSender) {
        //ONLY ON SEVER SIDE

        AlignmentData.switchFaction(((IEntityDataSaver) player), -1, ((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area"));
        switch(((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area")) {
            case 0:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentWesterosData().getInt("alignment_westeros") + " for westeros"), true);
                AlignmentData.syncAlignmentW(((IEntityDataSaver) player).getAlignmentWesterosData().getInt("alignment_westeros"), player);
                break;
            case 1:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentWEssosData().getInt("alignment_w_essos") + " for west essos"), true);
                AlignmentData.syncAlignmentWE(((IEntityDataSaver) player).getAlignmentWEssosData().getInt("alignment_w_essos"), player);
                break;
            case 2:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentEEssosData().getInt("alignment_e_essos") + " for east essos"), true);
                AlignmentData.syncAlignmentEE(((IEntityDataSaver) player).getAlignmentEEssosData().getInt("alignment_e_essos"), player);
                break;
            case 3:
                player.sendMessage(Text.literal("Currently at Index: " + ((IEntityDataSaver) player).getAlignmentSouthData().getInt("alignment_south") + " for south"), true);
                AlignmentData.syncAlignmentS(((IEntityDataSaver) player).getAlignmentSouthData().getInt("alignment_south"), player);
                break;
        }
    }

    public static void up(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                            PacketByteBuf buf, PacketSender responseSender) {
        AlignmentData.switchArea(((IEntityDataSaver) player), 1);
        switch(((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area")) {
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
        AlignmentData.syncAlignmentArea(((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area"), player);

    }

    public static void down(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                          PacketByteBuf buf, PacketSender responseSender) {
        AlignmentData.switchArea(((IEntityDataSaver) player), -1);
        switch(((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area")) {
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

        AlignmentData.syncAlignmentArea(((IEntityDataSaver) player).getCurrentArea().getInt("alignment_current_area"), player);


    }
}
