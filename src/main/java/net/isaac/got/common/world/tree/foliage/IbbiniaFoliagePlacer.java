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

public class IbbiniaFoliagePlacer extends FoliagePlacer {
    public static final Codec<IbbiniaFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(IbbiniaFoliagePlacer::getFoliageHeight))
                    .apply(instance, IbbiniaFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public IbbiniaFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.IBBINIA_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int i = random.nextInt(2);
        int j = 1;
        int k = 0;

        for (int l = offset; l >= offset - foliageHeight; --l) {
            generateDiamond(world, placer, random, config, i, center, mutable, l);
            if(i >= j) {
                i = k;
                k = 1;
                j = Math.min(j + 1, radius + treeNode.getFoliageRadius());
                continue;
            }
            ++i;
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
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        // Just pick the random height using the IntProvider
        return foliageHeight.get(random);
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return dx == radius && dz == radius && (random.nextInt(2) == 0 || y == 0);
    }
}
