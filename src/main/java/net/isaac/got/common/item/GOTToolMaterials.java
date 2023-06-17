package net.isaac.got.common.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.isaac.got.common.item.other.GOTOther;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import java.util.function.Supplier;

public enum GOTToolMaterials implements ToolMaterial {
    VALYRIANSTEEL(MiningLevels.DIAMOND, 1561, 8.0f, 3.0f, 10, () -> Ingredient.ofItems(GOTOther.Valyrian_Ingot)),
    ALLOYSTEEL(MiningLevels.IRON, 500, 6.0f, 2.0f, 10, () -> Ingredient.ofItems(GOTOther.Alloy_Steel_Ingot)),
    BRONZE(MiningLevels.IRON, 500, 6.0f, 2.0f, 10, () -> Ingredient.ofItems(GOTOther.Bronze_Ingot));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private GOTToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
