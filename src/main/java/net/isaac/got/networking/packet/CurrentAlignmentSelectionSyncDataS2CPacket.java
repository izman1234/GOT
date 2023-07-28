package net.isaac.got.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;

public class CurrentAlignmentSelectionSyncDataS2CPacket {

    public static void westeros(MinecraftClient client, ClientPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityDataSaver) client.player).getAlignmentData().putInt("alignment_westeros", buf.readInt());
    }

    public static void w_essos(MinecraftClient client, ClientPlayNetworkHandler handler,
                             PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityDataSaver) client.player).getAlignmentData().putInt("alignment_w_essos", buf.readInt());
    }

    public static void e_essos(MinecraftClient client, ClientPlayNetworkHandler handler,
                             PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityDataSaver) client.player).getAlignmentData().putInt("alignment_e_essos", buf.readInt());
    }

    public static void south(MinecraftClient client, ClientPlayNetworkHandler handler,
                            PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityDataSaver) client.player).getAlignmentData().putInt("alignment_south", buf.readInt());
    }

    public static void area(MinecraftClient client, ClientPlayNetworkHandler handler,
                            PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityDataSaver) client.player).getAlignmentData().putInt("alignment_current_area", buf.readInt());
    }

    public static void current_alignments(MinecraftClient client, ClientPlayNetworkHandler handler,
                            PacketByteBuf buf, PacketSender responseSender) {
        ((IEntityDataSaver) client.player).getAlignmentData().putIntArray("current_alignments", buf.readIntArray());
    }
}
