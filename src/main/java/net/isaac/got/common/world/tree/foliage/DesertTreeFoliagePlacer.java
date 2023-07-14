package net.isaac.got.common.world.tree.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class DesertTreeFoliagePlacer extends FoliagePlacer {
    public static final Codec<DesertTreeFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(DesertTreeFoliagePlacer::getFoliageHeight))
                    .apply(instance, DesertTreeFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public DesertTreeFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.DESERT_TREE_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos center = treeNode.getCenter();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        int leafStart = 1;
        int leafRangeMin = 0;
        for (int j2 = -leafStart; j2 <= 1; ++j2) {
            int j3 = j2;
            int leafRange = leafRangeMin + 1 - j3 / 2;
            for (int i2 = -leafRange; i2 <= leafRange; ++i2) {
                int i3 = i2;
                for (int k2 = -leafRange; k2 <= leafRange; ++k2) {
                    int k3 = k2;
                    if (Math.abs(i3) == leafRange && Math.abs(k3) == leafRange && (random.nextInt(2) == 0 || j3 == 0)) {
                        continue;
                    }
                    mutable.set(center, i2, j2, k2);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                   // setBlockAndNotifyAdequately(world, i2, j2, k2, leafBlock, leafMeta);
                }
            }
        }
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        // Just pick the random height using the IntProvider
        return foliageHeight.get(random);
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return dx == radius && dz == radius && (random.nextInt(2) == 0 || y == 0);
    }
}
