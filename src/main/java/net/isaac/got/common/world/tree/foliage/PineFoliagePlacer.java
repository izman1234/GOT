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

public class PineFoliagePlacer extends FoliagePlacer {
    public static final Codec<PineFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(PineFoliagePlacer::getFoliageHeight))
                    .apply(instance, PineFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public PineFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.PINE_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int height, int radius, int offset) {
        BlockPos center = treeNode.getCenter();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int maxCircleSize;
        int currentCircleSize = 0;
        height = trunkHeight - 5;

        generateDiamond(world, placer, random, config, 0, center, mutable, offset);
        generateDiamond(world, placer, random, config, 1, center, mutable, offset - 1);

        for(int l = offset - 2; l >= -height; --l) {
            maxCircleSize = random.nextBetween(1, 3);
            if(maxCircleSize > 1) {
                if(l - 4 >= -height) {
                    generateDiamond(world, placer, random, config, currentCircleSize, center, mutable, l);
                    if((maxCircleSize == 3)) {
                        currentCircleSize = 2;
                    }
                    else {
                        currentCircleSize = 1;
                    }
                    generateDiamond(world, placer, random, config, currentCircleSize, center, mutable, l - 1);
                    generateDiamond(world, placer, random, config, currentCircleSize + 1, center, mutable, l - 2);
                    generateDiamond(world, placer, random, config, currentCircleSize, center, mutable, l - 3);
                    currentCircleSize = 0;
                    l -= 3;
                }
            }
            else {
                if(l - 2 >= -height) {
                    generateDiamond(world, placer, random, config, currentCircleSize, center, mutable, l);
                    generateDiamond(world, placer, random, config, currentCircleSize + 1, center, mutable, l - 1);
                    generateDiamond(world, placer, random, config, currentCircleSize, center, mutable, l - 2);
                    l -= 2;
                }
            }
        }
    }

    private void generateDiamond(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int radius, BlockPos center, BlockPos.Mutable mutable, int height) {
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
