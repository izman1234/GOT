package net.isaac.got.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.isaac.got.networking.GOTMessages;
import net.minecraft.entity.EntityType;

public class KillEntityHandler {

    public static void registerKillEvents() {
        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register( (world, entity, killedEntity) -> {
            if(entity.isPlayer() && ((killedEntity.getType() == EntityType.COW) || (killedEntity.getType() == EntityType.PIG))) {
                ClientPlayNetworking.send(GOTMessages.CURRENT_ALIGNMENTS, PacketByteBufs.create()); //should be server?
            }

        });
    }

}
