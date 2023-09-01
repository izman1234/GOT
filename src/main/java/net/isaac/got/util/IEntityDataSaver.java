package net.isaac.got.util;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtIntArray;

public interface IEntityDataSaver {
    NbtCompound getAlignmentData();

    void setAmount(int amount);

    int getAmount();


}
