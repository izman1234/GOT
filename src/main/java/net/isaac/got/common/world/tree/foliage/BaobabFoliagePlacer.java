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

public class BaobabFoliagePlacer extends FoliagePlacer {
    public static final Codec<BaobabFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(BaobabFoliagePlacer::getFoliageHeight))
                    .apply(instance, BaobabFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public BaobabFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.BAOBAB_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int leafMin = random.nextInt(3);
        int height = 0;

        for (int j3 = -leafMin; j3 <= height; ++j3) {
            int leafRange = 1 - (j3 - height);
            int leafRangeSq = leafRange * leafRange;
            for (int i1 = -leafRange; i1 <= leafRange; ++i1) {
                for (int k1 = -leafRange; k1 <= leafRange; ++k1) {
                    int i2 = i1;
                    int k2 = k1;
                    if (i2 * i2 + k2 * k2 > leafRangeSq) {
                        //continue;
                    }
                    if((Math.abs(i1) == leafRange) || (Math.abs(k1) == leafRange)) {
                        if(random.nextBetween(1, 10) >= 3) {
                            mutable.set(center, i1, j3, k1);
                            FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                        }
                    }
                    else {
                        mutable.set(center, i1, j3, k1);
                        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                    }
                    //setBlockAndNotifyAdequately(world, i1, j, k1, leafBlock, leafMeta);
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
