package net.isaac.got.common.world.tree.sapling;

import net.isaac.got.common.world.features.configuredfeatures.GOTConfiguredFeatures;
import net.isaac.got.common.world.features.configuredfeatures.TreeConfigFeatures;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class CypressSaplingGenerator extends LargeTreeSaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return TreeConfigFeatures.CYPRESS_KEY;
    }

    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return TreeConfigFeatures.GIANT_CYPRESS_KEY;
    }
}
