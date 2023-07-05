package net.isaac.got.common.item.tool;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class GOTItemAxe extends AxeItem {
    public GOTItemAxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}