package net.isaac.got.common.item.tool;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class GOTItemShovel extends ShovelItem {
    public GOTItemShovel(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}