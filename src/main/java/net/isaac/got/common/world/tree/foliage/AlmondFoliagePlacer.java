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

public class AlmondFoliagePlacer extends FoliagePlacer {
    public static final Codec<AlmondFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(AlmondFoliagePlacer::getFoliageHeight))
                    .apply(instance, AlmondFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public AlmondFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.ALMOND_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        generateDiamond(world, placer, random, config, 1, center, mutable, offset);
        generateDiamond(world, placer, random, config, 2, center, mutable, offset - 1);
        generateSquarenoCorners(world, placer, random, config, center, 2, offset - 2, false);
        generateDiamond(world, placer, random, config, 1, center, mutable, offset - 3);

    }

    private void generateDiamond(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int radius, BlockPos.Mutable center, BlockPos.Mutable mutable, int height) {
        int width = 0;
        for (int i = -radius; i <= 0; ++i) {
            for (int j = -radius; j <= radius; ++j) {
                if ((Math.abs(j) <= width)) {
                    mutable.set(center, j, height, i);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                }
            }
            width++;
        }
        width -= 2;
        for (int i = 1; i <= radius; ++i) {
            for (int j = -radius; j <= radius; ++j) {
                if ((Math.abs(j) <= width)) {
                    mutable.set(center, j, height, i);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                }
            }
            width--;
        }
    }

    protected void generateSquarenoCorners(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        int i = giantTrunk ? 1 : 0;
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int j = -radius; j <= radius + i; ++j) {
            for(int k = -radius; k <= radius + i; ++k) {
                if (!this.isPositionInvalid(random, j, y, k, radius, giantTrunk)) {
                    mutable.set(centerPos, j, y, k);
                    if(!((Math.abs(j) == radius) && (Math.abs(k) == radius))) {
                        placeFoliageBlock(world, placer, random, config, mutable);
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
