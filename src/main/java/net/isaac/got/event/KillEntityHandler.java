package net.isaac.got.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.isaac.got.networking.GOTMessages;
import net.isaac.got.networking.packet.AlignmentC2SPacket;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;

public class KillEntityHandler {

    public static void registerKillEvents() {
        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register( (world, entity, killedEntity) -> {
            if(entity.isPlayer() && (killedEntity.getType() == EntityType.COW)) {
                ((IEntityDataSaver) entity).setAlignmentIncrease(1);
                //AlignmentC2SPacket.amount = 1;
                ClientPlayNetworking.send(GOTMessages.CURRENT_ALIGNMENTS, PacketByteBufs.create());
            }
            if(entity.isPlayer() && (killedEntity.getType() == EntityType.PIG)) {
                ((IEntityDataSaver) entity).setAlignmentIncrease(-1);
                //AlignmentC2SPacket.amount = -1;
                ClientPlayNetworking.send(GOTMessages.CURRENT_ALIGNMENTS, PacketByteBufs.create());
            }

        });
    }

}
