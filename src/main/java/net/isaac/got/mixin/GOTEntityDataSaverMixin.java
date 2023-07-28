package net.isaac.got.mixin;

import net.isaac.got.util.AlignmentData;
import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class GOTEntityDataSaverMixin implements IEntityDataSaver {
    private NbtCompound AlignmentDataNBT;
    private int[] currentAlign = new int[36];

    @Override
    public NbtCompound getAlignmentData() {
        if(this.AlignmentDataNBT == null) {
            this.AlignmentDataNBT = new NbtCompound();
            AlignmentDataNBT.putIntArray("current_alignments", currentAlign);
        }
        return AlignmentDataNBT;
    }

    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable info) {
        if(AlignmentDataNBT != null) {
            AlignmentDataNBT.putInt("alignment_westeros", AlignmentDataNBT.getInt("alignment_westeros"));
            AlignmentDataNBT.putInt("alignment_w_essos", AlignmentDataNBT.getInt("alignment_w_essos"));
            AlignmentDataNBT.putInt("alignment_e_essos", AlignmentDataNBT.getInt("alignment_e_essos"));
            AlignmentDataNBT.putInt("alignment_south", AlignmentDataNBT.getInt("alignment_south"));
            AlignmentDataNBT.putInt("alignment_current_area", AlignmentDataNBT.getInt("alignment_current_area"));
            AlignmentDataNBT.putIntArray("current_alignments", AlignmentDataNBT.getIntArray("current_alignments"));
            nbt.put("got.alignment_data", AlignmentDataNBT);
        }

    }

    @Inject(method = "readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if(nbt.contains("got.alignment_data", 10)) {
            AlignmentDataNBT = nbt.getCompound("got.alignment_data");
        }

    }
}
