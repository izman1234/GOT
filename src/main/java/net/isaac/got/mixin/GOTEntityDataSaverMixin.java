package net.isaac.got.mixin;

import net.isaac.got.util.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class GOTEntityDataSaverMixin implements IEntityDataSaver {
    private NbtCompound AlignmentWesterosIndex;
    private NbtCompound AlignmentWEssosIndex;
    private NbtCompound AlignmentEEssosIndex;
    private NbtCompound AlignmentSouthIndex;
    private NbtCompound CurrentArea;

    @Override
    public NbtCompound getAlignmentWesterosData() {
        if(this.AlignmentWesterosIndex == null) {
            this.AlignmentWesterosIndex = new NbtCompound();
        }
        return AlignmentWesterosIndex;
    }

    @Override
    public NbtCompound getAlignmentWEssosData() {
        if(this.AlignmentWEssosIndex == null) {
            this.AlignmentWEssosIndex = new NbtCompound();
        }
        return AlignmentWEssosIndex;
    }

    @Override
    public NbtCompound getAlignmentEEssosData() {
        if(this.AlignmentEEssosIndex == null) {
            this.AlignmentEEssosIndex = new NbtCompound();
        }
        return AlignmentEEssosIndex;
    }

    @Override
    public NbtCompound getAlignmentSouthData() {
        if(this.AlignmentSouthIndex == null) {
            this.AlignmentSouthIndex = new NbtCompound();
        }
        return AlignmentSouthIndex;
    }

    @Override
    public NbtCompound getCurrentArea() {
        if(this.CurrentArea == null) {
            this.CurrentArea = new NbtCompound();
        }
        return CurrentArea;
    }

    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable info) {
        if(this.AlignmentWesterosIndex != null) {
            nbt.put("got.alignment_westeros_data", AlignmentWesterosIndex);
        }
        if(this.AlignmentWEssosIndex != null) {
            nbt.put("got.alignment_w_essos_data", AlignmentWEssosIndex);
        }
        if(this.AlignmentEEssosIndex != null) {
            nbt.put("got.alignment_e_essos_data", AlignmentEEssosIndex);
        }
        if(this.AlignmentSouthIndex != null) {
            nbt.put("got.alignment_south_data", AlignmentSouthIndex);
        }
        if(this.CurrentArea != null) {
            nbt.put("got.alignment_current_area_data", CurrentArea);
        }
    }

    @Inject(method = "readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if(nbt.contains("got.alignment_westeros_data", 10)) {
            AlignmentWesterosIndex = nbt.getCompound("got.alignment_westeros_data");
        }
        if(nbt.contains("got.alignment_w_essos_data", 10)) {
            AlignmentWEssosIndex = nbt.getCompound("got.alignment_w_essos_data");
        }
        if(nbt.contains("got.alignment_e_essos_data", 10)) {
            AlignmentEEssosIndex = nbt.getCompound("got.alignment_e_essos_data");
        }
        if(nbt.contains("got.alignment_south_data", 10)) {
            AlignmentSouthIndex = nbt.getCompound("got.alignment_south_data");
        }
        if(nbt.contains("got.alignment_current_area_data", 10)) {
            CurrentArea = nbt.getCompound("got.alignment_current_area_data");
        }
    }
}
