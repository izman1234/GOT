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

public class RedwoodFoliagePlacer extends FoliagePlacer {
    public static final Codec<RedwoodFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(RedwoodFoliagePlacer::getFoliageHeight))
                    .apply(instance, RedwoodFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public RedwoodFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.REDWOOD_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int height, int radius, int offset) {
        BlockPos center = treeNode.getCenter();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int i = treeNode.isGiantTrunk() ? 1 : 0;

        int leafStart = trunkHeight - random.nextBetween(5, 8);
        int leafTop = offset;
        int leafRange = 0;
        int maxRange = 2;
        boolean increasing = true;

        for (int j1 = leafTop; j1 >= leafTop - leafStart; --j1) {
            if (j1 >= leafStart - 1) {
                leafRange = 0;
            } else if (increasing) {
                leafRange++;
                if (leafRange >= 3) {
                    increasing = false;
                }
            } else {
                --leafRange;
                if (leafRange <= 1) {
                    increasing = true;
                }
            }
            leafRange = Math.min(leafRange, 4);
            for (int i13 = -maxRange; i13 <= maxRange + i; ++i13) { //issue for giant
                for (int k13 = -maxRange; k13 <= maxRange + i; ++k13) {
                    int i2 = Math.abs(i13);
                    int k2 = Math.abs(k13);
                    if (i13 > 0) {
                        i2 -= i;
                    }
                    if (k13 > 0) {
                        k2 -= i;
                    }
                    int d = i2 + k2;
                    if (j1 < leafTop - 2) {
                        d += random.nextInt(2);
                    }
                    if (d > leafRange) {
                       continue;
                    }
                    mutable.set(center, i13, j1, k13);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
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
