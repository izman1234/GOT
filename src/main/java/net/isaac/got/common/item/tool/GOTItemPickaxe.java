package net.isaac.got.common.item.tool;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class GOTItemPickaxe extends PickaxeItem {
    public GOTItemPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
