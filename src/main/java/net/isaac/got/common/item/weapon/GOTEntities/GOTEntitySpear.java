package net.isaac.got.common.item.weapon.GOTEntities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntitySpear extends TridentEntity {
    public GOTEntitySpear(EntityType<? extends TridentEntity> entityType, World world) {
        super(entityType, world);
    }
    public GOTEntitySpear(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }
}
