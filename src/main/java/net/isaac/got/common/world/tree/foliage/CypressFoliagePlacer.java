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

public class CypressFoliagePlacer extends FoliagePlacer {
    public static final Codec<CypressFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(CypressFoliagePlacer::getFoliageHeight))
                    .apply(instance, CypressFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public CypressFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.CYPRESS_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        if(treeNode.isGiantTrunk()) {
            int bottom = random.nextBetween(2, 3);
            generateSquareBig(world, placer, random, config, center, 0, offset, true);
            generateSquareBig(world, placer, random, config, center, 0, offset - 1, true);
            generateSquareBig(world, placer, random, config, center, radius, offset - 2, true);
            generateSquareBig(world, placer, random, config, center, radius, offset - 3, true);

            for (int i = offset - 4; i >= offset - foliageHeight; --i) {
                generateSquareCedar(world, placer, random, config, center, radius, i, true);
            }
            if (bottom == 2) {
                generateSquareBig(world, placer, random, config, center, radius, offset - foliageHeight - 1, true);
                generateSquareBig(world, placer, random, config, center, radius, offset - foliageHeight - 2, true);
            } else {
                generateSquareBig(world, placer, random, config, center, radius, offset - foliageHeight - 1, true);
                generateSquareBig(world, placer, random, config, center, radius, offset - foliageHeight - 2, true);
                generateSquareBig(world, placer, random, config, center, radius, offset - foliageHeight - 3, true);
            }
        }
        else {
            int bottom = random.nextBetween(1, 2);
            generateDiamond(world, placer, random, config, 0, center, mutable, offset);
            generateDiamond(world, placer, random, config, 0, center, mutable, offset - 1);
            generateDiamond(world, placer, random, config, radius, center, mutable, offset - 2);
            generateDiamond(world, placer, random, config, radius, center, mutable, offset - 3);

            for (int i = offset - 4; i >= offset - foliageHeight; --i) {
                generateSquareCedar(world, placer, random, config, center, radius, i, false);
            }
            if (bottom == 1) {
                generateDiamond(world, placer, random, config, radius, center, mutable, offset - foliageHeight - 1);
            } else {
                generateDiamond(world, placer, random, config, radius, center, mutable, offset - foliageHeight - 1);
                generateDiamond(world, placer, random, config, radius, center, mutable, offset - foliageHeight - 2);
            }
        }
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

    protected void generateSquareCedar(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        int i = giantTrunk ? 1 : 0;
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int j = -radius; j <= radius + i; ++j) {
            for(int k = -radius; k <= radius + i; ++k) {
                mutable.set(centerPos, j, y, k);
                placeFoliageBlock(world, placer, random, config, mutable);
            }
        }

    }

    protected void generateSquareBig(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        int i = giantTrunk ? 1 : 0;
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int j = -radius; j <= radius + i; ++j) {
            for(int k = -radius; k <= radius + i; ++k) {
                if(radius == 0) {
                    mutable.set(centerPos, j, y, k);
                    placeFoliageBlock(world, placer, random, config, mutable);
                }
                else {
                    if (((j != -radius) || (k != -radius)) && ((j != -radius) || (k != radius + 1)) && ((j != radius + 1) || (k != radius + 1)) && ((j != radius + 1) || (k != -radius))) {
                        mutable.set(centerPos, j, y, k);
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
