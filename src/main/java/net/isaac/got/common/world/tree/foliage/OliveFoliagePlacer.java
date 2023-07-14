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

public class OliveFoliagePlacer extends FoliagePlacer {
    public static final Codec<OliveFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(OliveFoliagePlacer::getFoliageHeight))
                    .apply(instance, OliveFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public OliveFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.OLIVE_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        radius = 0;
        if (!treeNode.isGiantTrunk()) {
            if(random.nextInt(2) == 1) {
                generateSquare(world, placer, random, config, center, 2, offset, false);
                generateSquare(world, placer, random, config, center, 3, offset - 1, false);
                generateSquare(world, placer, random, config, center, 2, offset - 2, false);
                generateSquare(world, placer, random, config, center, 1, offset - 3, false);
            }
            else {
                generateSquare(world, placer, random, config, center, 2, offset, false);
                generateSquare(world, placer, random, config, center, 3, offset - 1, false);
                generateSquare(world, placer, random, config, center, 1, offset - 2, false);
            }
        }
        else {
            generateSquare(world, placer, random, config, center, 2, offset + 1, true);
            generateSquare(world, placer, random, config, center, 3, offset, true);
            generateSquare(world, placer, random, config, center, 3, offset - 1, true);
            generateSquare(world, placer, random, config, center, 1, offset - 2, true);
        }
    }

    @Override
    protected void generateSquare(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int j = -radius; j <= radius; ++j) {
            for (int k = -radius; k <= radius; ++k) {
                if (!this.isPositionInvalid(random, j, y, k, radius, giantTrunk)) {
                    mutable.set(centerPos, j, y, k);
                    if(!((Math.abs(j) == radius) && (Math.abs(k) == radius))) {
                        if ((Math.abs(j) == radius) || (Math.abs(k) == radius)) {
                            if (random.nextInt(10) <= 4) {
                                FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                            }
                        } else {
                            FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
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
