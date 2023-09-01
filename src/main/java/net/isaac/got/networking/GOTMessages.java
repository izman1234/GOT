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
    public static final Identifier SET_FACTION_ID = new Identifier(GOT.MOD_ID, "set_faction");
    public static final Identifier ALIGNMENT_SYNC_W_ID = new Identifier(GOT.MOD_ID, "alignment_sync_w");
    public static final Identifier ALIGNMENT_SYNC_WE_ID = new Identifier(GOT.MOD_ID, "alignment_sync_we");
    public static final Identifier ALIGNMENT_SYNC_EE_ID = new Identifier(GOT.MOD_ID, "alignment_sync_ee");
    public static final Identifier ALIGNMENT_SYNC_S_ID = new Identifier(GOT.MOD_ID, "alignment_sync_s");
    public static final Identifier ALIGNMENT_SYNC_AREA_ID = new Identifier(GOT.MOD_ID, "alignment_sync_area");
    public static final Identifier CURRENT_ALIGNMENTS_SYNC_ID = new Identifier(GOT.MOD_ID, "current_alignments_sync");
    //public static final Identifier CURRENT_ALIGNMENTS = new Identifier(GOT.MOD_ID, "current_alignments_increase");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_RIGHT_ID, AlignmentC2SPacket::right);
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_LEFT_ID, AlignmentC2SPacket::left);
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_UP_ID, AlignmentC2SPacket::up);
        ServerPlayNetworking.registerGlobalReceiver(ALIGNMENT_DOWN_ID, AlignmentC2SPacket::down);
        //ServerPlayNetworking.registerGlobalReceiver(CURRENT_ALIGNMENTS, AlignmentC2SPacket::increase); //wrong spot?
        ServerPlayNetworking.registerGlobalReceiver(SET_FACTION_ID, AlignmentC2SPacket::set);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_W_ID, CurrentAlignmentSelectionSyncDataS2CPacket::westeros);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_WE_ID, CurrentAlignmentSelectionSyncDataS2CPacket::w_essos);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_EE_ID, CurrentAlignmentSelectionSyncDataS2CPacket::e_essos);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_S_ID, CurrentAlignmentSelectionSyncDataS2CPacket::south);
        ClientPlayNetworking.registerGlobalReceiver(ALIGNMENT_SYNC_AREA_ID, CurrentAlignmentSelectionSyncDataS2CPacket::area);
        ClientPlayNetworking.registerGlobalReceiver(CURRENT_ALIGNMENTS_SYNC_ID, CurrentAlignmentSelectionSyncDataS2CPacket::current_alignments);
    }
}
