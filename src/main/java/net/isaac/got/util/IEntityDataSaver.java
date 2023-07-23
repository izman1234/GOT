package net.isaac.got.util;

import net.minecraft.nbt.NbtCompound;

public interface IEntityDataSaver {
    NbtCompound getAlignmentWesterosData();
    NbtCompound getAlignmentWEssosData();
    NbtCompound getAlignmentEEssosData();
    NbtCompound getAlignmentSouthData();
    NbtCompound getCurrentArea();
}
