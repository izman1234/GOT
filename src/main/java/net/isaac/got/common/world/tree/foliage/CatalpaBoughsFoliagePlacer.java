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

public class CatalpaBoughsFoliagePlacer extends FoliagePlacer {
    public static final Codec<CatalpaBoughsFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(CatalpaBoughsFoliagePlacer::getFoliageHeight))
                    .apply(instance, CatalpaBoughsFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public CatalpaBoughsFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.CATALPA_BOUGHS_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos center = treeNode.getCenter();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        int leafStart = -1;
        int leafTop = 2;
        int maxRange = 3 + random.nextInt(2);
        int[] ranges = {-2, 0, -1, -2};
        for (int j1 = leafStart; j1 <= leafTop; ++j1) {
            int leafRange = maxRange + ranges[j1 - leafStart];
            int leafRangeSq = leafRange * leafRange;
            for (int i1 = -leafRange; i1 <= leafRange; ++i1) {
                for (int k1 = -leafRange; k1 <= leafRange; ++k1) {
                    boolean grow;
                    int i2 = Math.abs(i1);
                    int k2 = Math.abs(k1);
                    int j2 = Math.abs(j1);
                    int dSq = i2 * i2 + k2 * k2;
                    int dCh = i2 + j2 + k2;
                    grow = dSq < leafRangeSq && dCh <= 4;
                    if (i2 == leafRange - 1 || k2 == leafRange - 1) {
                        grow &= random.nextInt(4) != 0;
                    }
                    if (!grow) {
                        //continue;
                    }
                    mutable.set(center, i1, j1, k1);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                    //setBlockAndNotifyAdequately(world, i1, j1, k1, leafBlock, leafMeta);
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
