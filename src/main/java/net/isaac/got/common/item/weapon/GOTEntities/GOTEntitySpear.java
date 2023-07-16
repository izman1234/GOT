package net.isaac.got.common.item.weapon.GOTEntities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.isaac.got.GOT;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.isaac.got.mixin.SpearEntityAccessor;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class GOTEntitySpear extends TridentEntity {
    public GOTEntitySpear(EntityType<? extends GOTEntitySpear> entityType, World world) {
        super(entityType, world);
    }

    public GOTEntitySpear(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }

    public void setTridentAttributes(World world, LivingEntity owner, ItemStack stack) {
        this.setTridentStack(stack.copy());
        this.dataTracker.set(SpearEntityAccessor.impaled$getLoyalty(), (byte) EnchantmentHelper.getLoyalty(stack));
        this.dataTracker.set(SpearEntityAccessor.impaled$getEnchanted(), stack.hasGlint());
    }

    protected float getDragInWater() {
        return 0.99f;
    }

    public ItemStack getTridentStack() {
        return ((SpearEntityAccessor) this).impaled$getTridentStack();
    }

    public void setTridentStack(ItemStack tridentStack) {
        ((SpearEntityAccessor) this).impaled$setTridentStack(tridentStack);
    }

    protected void setDealtDamage(boolean dealtDamage) {
        ((SpearEntityAccessor) this).impaled$setDealtDamage(dealtDamage);
    }

    protected boolean hasDealtDamage() {
        return ((SpearEntityAccessor) this).impaled$hasDealtDamage();
    }

}
