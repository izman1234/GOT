package net.isaac.got.common.item.weapon;

import net.minecraft.item.ToolMaterial;

public class GOTItemDagger extends GOTItemSword{
    public GOTItemDagger(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, HitEffect e, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, e, settings);
    }
}
