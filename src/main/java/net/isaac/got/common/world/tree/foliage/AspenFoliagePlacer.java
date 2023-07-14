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

public class AspenFoliagePlacer extends FoliagePlacer {
    public static final Codec<AspenFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(AspenFoliagePlacer::getFoliageHeight))
                    .apply(instance, AspenFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public AspenFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.ASPEN_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        int i = treeNode.isGiantTrunk() ? 1 : 0;
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        if(treeNode.isGiantTrunk()) { foliageHeight = trunkHeight - random.nextBetween(2,5); }
        else { foliageHeight = trunkHeight - random.nextBetween(2, 3); }

        for(int l = offset; l >= offset - 1; l--) {
            for (int y = 0; y <= 0 + i; y++) {
                for (int z = 0; z <= 0 + i; z++) {
                    mutable.set(center, y, l, z);
                    placeFoliageBlock(world, placer, random, config, mutable);
                }
            }
        }

        for(int y = -1; y <= 1 + i; y++) {
            for(int z = -1; z <= 1 + i; z++) {
                mutable.set(center, y, offset - 2, z);
                placeFoliageBlock(world, placer, random, config, mutable);
            }
        }

        for(int l = offset - 3; l >= offset - foliageHeight; l--) {
            if(treeNode.isGiantTrunk()) { radius = random.nextBetween(0, 2); }
            else { radius = random.nextBetween(1, 2); }
            for (int j = -radius; j <= radius + i; ++j) {
                for (int k = -radius; k <= radius + i; ++k) {
                    if (!this.isPositionInvalid(random, j, l, k, radius, treeNode.isGiantTrunk())) {
                        if(Math.abs(j) == radius || Math.abs(k) == radius) {
                            if(random.nextInt(10) <= 5) {
                                mutable.set(center, j, l, k);
                                placeFoliageBlock(world, placer, random, config, mutable);
                            }
                        }
                        else {
                            mutable.set(center, j, l, k);
                            placeFoliageBlock(world, placer, random, config, mutable);
                        }
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
