package net.isaac.got.common.world.tree.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class WillowFoliagePlacer extends FoliagePlacer {
    public static final Codec<WillowFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(WillowFoliagePlacer::getFoliageHeight))
                    .apply(instance, WillowFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public WillowFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.WILLOW_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos center = treeNode.getCenter();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int radiusSq = radius * radius;
        int radiusSqLess = (int) ((radius - 0.5) * (radius - 0.5));
        //if(random.nextInt(10) <= 3) {foliageHeight += random.nextBetween(1, 2); }
        for (int i1 = offset; i1 >= offset - foliageHeight; --i1) {
            for (int j1 = -radius; j1 <= radius; ++j1) {
                for (int k1 = -radius; k1 <= radius; ++k1) {
                    int i2 = Math.abs(i1 + foliageHeight) - Math.abs(offset - foliageHeight);
                    int j2 = Math.abs(j1) - radius;
                    int k2 = Math.abs(k1) - radius;
                    int dist = (i2 * i2) + (j2 * j2) + (k2 * k2);
                    int taxicab = Math.abs(i2) + Math.abs(j2) + Math.abs(k2);
                    if (dist >= radiusSqLess && (dist >= radiusSq || random.nextInt(3) != 0) || taxicab > 4) {
                        continue;
                    }
                    mutable.set(center, j1, i1, k1);
                    if((Math.abs(j1) == radius) || (Math.abs(k1) == radius)) {
                        if (random.nextInt(10) <= 6) {
                            FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                        }
                    }
                    else {
                        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                    }
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
