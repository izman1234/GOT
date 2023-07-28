package net.isaac.got.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.Random;

public class PlayerTickHandler implements ServerTickEvents.StartTick {
    @Override
    public void onStartTick(MinecraftServer server) {
        for(ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if(new Random().nextFloat() <= 0.05) {
                //ServerPlayerEntity dataPlayer = ((IEntityDataSaver) player);
                AlignmentData.syncAlignmentArea(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_current_area"), player);
                AlignmentData.syncAlignmentW(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_westeros"), player);
                AlignmentData.syncAlignmentWE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_w_essos"), player);
                AlignmentData.syncAlignmentEE(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_e_essos"), player);
                AlignmentData.syncAlignmentS(((IEntityDataSaver) player).getAlignmentData().getInt("alignment_south"), player);
                AlignmentData.syncCurrentAlignments(((IEntityDataSaver) player).getAlignmentData().getIntArray("current_alignments"), player);
            }
        }
    }
}
