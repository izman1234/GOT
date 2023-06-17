package net.isaac.got.common.item.weapon.GOTEntities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class GOTEntitySpear extends TridentEntity {
    private static final TrackedData<Byte> LOYALTY = DataTracker.registerData(GOTEntitySpear.class, TrackedDataHandlerRegistry.BYTE);
    public GOTEntitySpear(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }
}
