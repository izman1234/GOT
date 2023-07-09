package net.isaac.got.common.world.tree.sapling;

import net.isaac.got.common.world.GOTConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class BeechSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        if(random.nextBetween(1, 10) == 1) {
            return GOTConfiguredFeatures.BIG_BEECH_KEY;
        }
        else {
            return GOTConfiguredFeatures.BEECH_KEY;
        }
    }
}
