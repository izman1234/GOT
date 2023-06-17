package net.isaac.got.common.item.weapon;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BasicWeapons extends SwordItem {
    public BasicWeapons(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
