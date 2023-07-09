package net.isaac.got.common.world.tree.sapling;

import net.isaac.got.common.world.GOTConfiguredFeatures;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class AspenSaplingGenerator extends LargeTreeSaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return GOTConfiguredFeatures.ASPEN_KEY;
    }

    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return GOTConfiguredFeatures.GIANT_ASPEN_KEY;
    }
}
