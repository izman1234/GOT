package net.isaac.got.common.item.weapon;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class GOTItemSword extends SwordItem {
    public GOTItemSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, HitEffect e, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        effect = e;
    }
    public HitEffect effect;

    public HitEffect getHitEffect() {
        return effect;
    }
    @Override
    public boolean postHit(ItemStack itemstack, LivingEntity target, LivingEntity attacker) {
        if (getHitEffect() == HitEffect.NONE) {
            return true;
        }
        if (getHitEffect() == HitEffect.POISON) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100,1), attacker);
            return super.postHit(itemstack, target, attacker);
        }
        if (getHitEffect() == HitEffect.FIRE) {
            target.setOnFireFor(4);
            return true;
        }
        if (getHitEffect() == HitEffect.WITHER) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100,1), attacker);
            return super.postHit(itemstack, target, attacker);
        }
        return true;
    }
    public enum HitEffect {
        NONE, FIRE, POISON, WITHER
    }
}
