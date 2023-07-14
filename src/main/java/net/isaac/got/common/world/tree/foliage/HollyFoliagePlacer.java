package net.isaac.got.common.world.tree.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class HollyFoliagePlacer extends FoliagePlacer {
    public static final Codec<HollyFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(HollyFoliagePlacer::getFoliageHeight))
                    .apply(instance, HollyFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public HollyFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.HOLLY_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        int ran = random.nextInt(3);
        foliageHeight = trunkHeight - ran - 3;

        if (treeNode.isGiantTrunk()) {
            BlockPos blockPos = treeNode.getCenter();
            int m = 0;
            for (int j = blockPos.getY() - foliageHeight + offset; j <= blockPos.getY() + offset; ++j) {
                if(j  == blockPos.getY() + offset || j == blockPos.getY() + offset - 1 || j == blockPos.getY() + offset - 2) {  m = 1; }
                else if (j == blockPos.getY() + offset - 3){ m = 2; }
                else {
                    if(m == 3) { m--; }
                    else { m++; }
                }

                int k = blockPos.getY() - j;
                this.generateSquare(world, placer, random, config, new BlockPos(blockPos.getX(), j, blockPos.getZ()), m, 0, treeNode.isGiantTrunk());
            }
        } else {
            BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
            BlockPos.Mutable mutable = new BlockPos.Mutable();
            int i = 0;
            int j = 2;
            for (int l = offset; l >= offset - foliageHeight; --l) {
                if (l == offset || l == offset - 1) {
                    generateDiamond(world, placer, random, config, i, center, mutable, l);
                    if (l == offset) {
                        ++i;
                    }
                } else {
                    generateSquare(world, placer, random, config, center, i, l, false);
                    if (i < j) {
                        ++i;

                    }
                }
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
    @Override
    protected void generateSquare(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        int i = giantTrunk ? 1 : 0;
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for (int j = -radius; j <= radius + i; ++j) {
            for (int k = -radius; k <= radius + i; ++k) {
                int ran = random.nextInt(10);
                if (this.isPositionInvalid(random, j, y, k, radius, giantTrunk)) continue;
                if((Math.abs(k) == radius) || (Math.abs(j) == radius)) {
                    if(ran > 2) {
                        mutable.set(centerPos, j, y, k);
                        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                    }
                }
                else {
                    mutable.set(centerPos, j, y, k);
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
