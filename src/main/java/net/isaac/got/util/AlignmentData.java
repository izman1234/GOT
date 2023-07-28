package net.isaac.got.util;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.isaac.got.mixin.GOTEntityDataSaverMixin;
import net.isaac.got.networking.GOTMessages;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;


public class AlignmentData {

    public static int MaxFactionAmountW = 14;
    public static int MaxFactionAmountWE = 13;
    public static int MaxFactionAmountEE = 5;
    public static int MaxFactionAmountS = 3;
    public static int MaxAreaAmount = 4;

    public static int switchFaction(IEntityDataSaver player, int direction, int currentArea) {
        NbtCompound nbt;
        int currentFact;
        int max;
        nbt = player.getAlignmentData();
        if(currentArea == 0) {
            currentFact = nbt.getInt("alignment_westeros");
            max = MaxFactionAmountW;
        }
        else if(currentArea == 1) {
            currentFact = nbt.getInt("alignment_w_essos");
            max = MaxFactionAmountWE;
        }
        else if(currentArea == 2) {
            currentFact = nbt.getInt("alignment_e_essos");
            max = MaxFactionAmountEE;
        }
        else {
            currentFact = nbt.getInt("alignment_south");
            max = MaxFactionAmountS;
        }


        if(currentFact + direction >= max) {
            currentFact = 0;
        }
        else if(currentFact + direction < 0) {
            currentFact = max - 1;
        }
        else {
            currentFact += direction;
        }

        if(currentArea == 0) {
            nbt.putInt("alignment_westeros", currentFact);
            syncAlignmentW(currentFact, (ServerPlayerEntity) player);
        }
        else if(currentArea == 1) {
            nbt.putInt("alignment_w_essos", currentFact);
            syncAlignmentWE(currentFact, (ServerPlayerEntity) player);
        }
        else if(currentArea == 2) {
            nbt.putInt("alignment_e_essos", currentFact);
            syncAlignmentEE(currentFact, (ServerPlayerEntity) player);
        }
        else {
            nbt.putInt("alignment_south", currentFact);
            syncAlignmentS(currentFact, (ServerPlayerEntity) player);
        }

        return currentFact;

    }

    public static int switchArea(IEntityDataSaver player, int direction) {
        NbtCompound nbt = player.getAlignmentData();
        int currentArea = nbt.getInt("alignment_current_area");

        if(currentArea + direction >= MaxAreaAmount) {
            currentArea = 0;
        }
        else if(currentArea + direction < 0) {
            currentArea = MaxAreaAmount - 1;
        }
        else {
            currentArea += direction;
        }
        nbt.putInt("alignment_current_area", currentArea);

        syncAlignmentArea(currentArea, (ServerPlayerEntity) player);
        return currentArea;

    }

    public static int[] increaseAlignment (IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getAlignmentData();
        int currentArea = nbt.getInt("alignment_current_area");
        int[] array = nbt.getIntArray("current_alignments").clone();
        switch(currentArea) {
            case 0: //Westeros
                int westerosIndex = nbt.getInt("alignment_westeros");
                array[westerosIndex] += amount;
                nbt.putIntArray("current_alignments", array);
                break;
            case 1: //WEssos
                int wessosIndex = nbt.getInt("alignment_w_essos");
                array[MaxFactionAmountW + wessosIndex] += amount;
                nbt.putIntArray("current_alignments", array);
                break;
            case 2: //EEssos
                int eessosIndex = nbt.getInt("alignment_e_essos");
                array[MaxFactionAmountW + MaxFactionAmountWE + eessosIndex] += amount;
                nbt.putIntArray("current_alignments", array);
                break;
            case 3: //South
                int southIndex = nbt.getInt("alignment_south");
                array[MaxFactionAmountW + MaxFactionAmountWE + MaxFactionAmountEE + southIndex] += amount;
                nbt.putIntArray("current_alignments", array);
                break;
        }

        syncCurrentAlignments(array, (ServerPlayerEntity) player);
        return array;
    }

    public static void syncAlignmentW(int alignmentIndex, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(alignmentIndex);
        ServerPlayNetworking.send(player, GOTMessages.ALIGNMENT_SYNC_W_ID, buffer);
    }

    public static void syncAlignmentWE(int alignmentIndex, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(alignmentIndex);
        ServerPlayNetworking.send(player, GOTMessages.ALIGNMENT_SYNC_WE_ID, buffer);
    }

    public static void syncAlignmentEE(int alignmentIndex, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(alignmentIndex);
        ServerPlayNetworking.send(player, GOTMessages.ALIGNMENT_SYNC_EE_ID, buffer);
    }

    public static void syncAlignmentS(int alignmentIndex, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(alignmentIndex);
        ServerPlayNetworking.send(player, GOTMessages.ALIGNMENT_SYNC_S_ID, buffer);
    }

    public static void syncAlignmentArea(int alignmentIndex, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(alignmentIndex);
        ServerPlayNetworking.send(player, GOTMessages.ALIGNMENT_SYNC_AREA_ID, buffer);
    }

    public static void syncCurrentAlignments(int[] currentAlignments, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        int[] array = currentAlignments.clone();
        buffer.writeIntArray(array);
        ServerPlayNetworking.send(player, GOTMessages.CURRENT_ALIGNMENTS_SYNC_ID, buffer);
    }


}
