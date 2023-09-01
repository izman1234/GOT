package net.isaac.got.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.isaac.got.networking.GOTMessages;
import net.isaac.got.networking.packet.AlignmentC2SPacket;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

public class KillEntityHandler {

    public static void registerKillEvents() {
        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register( (world, entity, killedEntity) -> {
            if(entity.isPlayer() && (killedEntity.getType() == EntityType.COW)) {
                AlignmentData.increaseAlignment(((IEntityDataSaver) entity), 1);
            }
            if(entity.isPlayer() && (killedEntity.getType() == EntityType.PIG)) {
                AlignmentData.increaseAlignment(((IEntityDataSaver) entity), -1);
            }

        });
    }

}
