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

public class GiantPartyFoliagePlacer extends FoliagePlacer {
    public static final Codec<GiantPartyFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(GiantPartyFoliagePlacer::getFoliageHeight))
                    .apply(instance, GiantPartyFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public GiantPartyFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.GIANT_PARTY_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable centerPos = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int leafRange = 3;
        int j2 = random.nextBetween(1, 3);

        for (int i3 = -leafRange; i3 <= leafRange; ++i3) {
            for (int j3 = j2 -leafRange; j3 <= j2 +leafRange; ++j3) {
                for (int k3 = -leafRange; k3 <= leafRange; ++k3) {
                    int i4 = i3;
                    int j4 = j3 - j2;
                    int k4 = k3;
                    int dist = i4 * i4 + j4 * j4 + k4 * k4;
                    if (dist >= (leafRange - 1) * (leafRange - 1) && (dist >= leafRange * leafRange || random.nextInt(3) == 0)) {
                        continue;
                    }
                    mutable.set(centerPos, i3, j3, k3);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                    //setBlockAndNotifyAdequately(world, i3, j3, k3, leafBlock, leafMeta);
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
