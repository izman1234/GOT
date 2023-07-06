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

public class CedarFoliagePlacer extends FoliagePlacer {
    public static final Codec<CedarFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(CedarFoliagePlacer::getFoliageHeight))
                    .apply(instance, CedarFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public CedarFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.CEDAR_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable centerPos = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for(int y = offset; y >= offset - foliageHeight; --y){
            for (int j = -radius; j <= radius; ++j) {
                for (int k = -radius; k <= radius; ++k) {
                    if (this.isPositionInvalid(random, j, y, k, radius, false)) continue;
                    mutable.set(centerPos, j, y, k);
                    if((Math.abs(j) == radius) || (Math.abs(k) == radius)) {
                        if (random.nextInt(10) <= 7) {
                            FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                        }
                    }
                    else {
                        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                    }
                }
            }
            radius++;
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
