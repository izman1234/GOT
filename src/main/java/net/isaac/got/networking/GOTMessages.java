package net.isaac.got.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.isaac.got.GOT;
import net.isaac.got.networking.packet.AlignmentC2SPacket;
import net.isaac.got.networking.packet.CurrentAlignmentSelectionSyncDataS2CPacket;
import net.minecraft.util.Identifier;

public class GOTMessages {
    public static final Identifier ALIGNMENT_RIGHT_ID = new Identifier(GOT.MOD_ID, "alignment_right");
    public static final Identifier ALIGNMENT_LEFT_ID = new Identifier(GOT.MOD_ID, "alignment_left");
    public static final Identifier ALIGNMENT_UP_ID = new Identifier(GOT.MOD_ID, "alignment_up");
    public static final Identifier ALIGNMENT_DOWN_ID = new Identifier(GOT.MOD_ID, "alignment_down");
    public static final Identifier ALIGNMENT_SYNC_W_ID = new Identifier(GOT.MOD_ID, "alignment_sync_w");
    public static final Identifier ALIGNMENT_SYNC_WE_ID = new Identifier(GOT.MOD_ID, "alignment_sync_we");
    public static final Identifier ALIGNMENT_SYNC_EE_ID = new Identifier(GOT.MOD_ID, "alignment_sync_ee");
    public static final Identifier ALIGNMENT_SYNC_S_ID = new Identifier(GOT.MOD_ID, "alignment_sync_s");
    public static final Identifier ALIGNMENT_SYNC_AREA_ID = new Identifier(GOT.MOD_ID, "alignment_sync_area");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_RIGHT_ID, AlignmentC2SPacket::right);
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_LEFT_ID, AlignmentC2SPacket::left);
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_UP_ID, AlignmentC2SPacket::up);
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_DOWN_ID, AlignmentC2SPacket::down);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_W_ID, CurrentAlignmentSelectionSyncDataS2CPacket::westeros);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_WE_ID, CurrentAlignmentSelectionSyncDataS2CPacket::w_essos);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_EE_ID, CurrentAlignmentSelectionSyncDataS2CPacket::e_essos);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_S_ID, CurrentAlignmentSelectionSyncDataS2CPacket::south);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_AREA_ID, CurrentAlignmentSelectionSyncDataS2CPacket::area);
    }
}
