package net.isaac.got.common.item.weapon.GOTEntities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityThrowingAxe extends TridentEntity {
    public GOTEntityThrowingAxe(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }
}
