package net.isaac.got.common.world.tree.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class DatePalmFoliagePlacer extends FoliagePlacer {
    public static final Codec<DatePalmFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(DatePalmFoliagePlacer::getFoliageHeight))
                    .apply(instance, DatePalmFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public DatePalmFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.DATE_PALM_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for (int i = offset - foliageHeight; i <= offset; ++i) {
            for (int j = -radius; j <= radius; ++j) {
                for (int k = -radius; k <= radius; ++k) {
                    if (this.isPositionInvalid(random, j, i, k, radius, false)) continue;
                    if(i == offset - foliageHeight) {
                        generateLayer(world, placer, random, config, center, mutable, radius, 1, k, j, i); //bottom
                    }
                    else if (i == offset - foliageHeight + 1) {
                        generateLayer(world, placer, random, config, center, mutable, radius, 2, k, j, i); //middle
                    }
                    else {
                        generateLayer(world, placer, random, config, center, mutable, radius, 3, k, j, i); //top
                    }

                }
            }
        }
    }

    private void generateLayer(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, BlockPos.Mutable center, BlockPos.Mutable mutable, int radius, int layer, int k, int j, int i) {
        if(layer == 1) {
            if((Math.abs(j) == 0) || (Math.abs(k) == 0)) {
                mutable.set(center, j, i, k);
                FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
            }
            else {
                int weight = ((radius - Math.abs(k)) * (radius - Math.abs(j))) + 1;
                //if(weight != 1) { weight += 10; }
                int chance = ((weight*100)/(radius*radius));
                int ran = random.nextBetween(1, 100);
                if(ran <= chance) {
                    mutable.set(center, j, i, k);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                }
            }
        }
        else if (layer == 2) {
                int weight = ((radius - Math.abs(k)) * (radius - Math.abs(j))) + 1;
                //if(weight != 1) { weight += 10; }
                int chance = ((weight*100)/(radius*radius));
                int ran = random.nextBetween(1, 100);
                if(ran <= chance) {
                    mutable.set(center, j, i, k);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
                }
        }
        else if (layer == 3) {
            int weight = 0;
            int chance = 0;
            if(Math.abs(j) == 0) {
                weight = (radius - Math.abs(k));
                chance = ((weight*100)/(radius*radius));
            }
            else if (Math.abs(k) == 0) {
                weight = (radius - Math.abs(j));
                chance = ((weight*100)/(radius*radius));
            }
                int ran = random.nextBetween(1, 100);
                if(ran <= chance) {
                    mutable.set(center, j, i, k);
                    FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);
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
