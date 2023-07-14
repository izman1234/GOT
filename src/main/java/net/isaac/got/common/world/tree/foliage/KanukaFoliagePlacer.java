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

import java.util.Iterator;

public class KanukaFoliagePlacer extends FoliagePlacer {
    public static final Codec<KanukaFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(KanukaFoliagePlacer::getFoliageHeight))
                    .apply(instance, KanukaFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public KanukaFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.KANUKA_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable centerPos = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        int leafHeight = 2;
        int maxRange = 1 + random.nextInt(3);
        for (int j1 = 0; j1 < leafHeight; ++j1) {
            int leafRange = maxRange - j1;
            for (int i1 = -leafRange; i1 <= leafRange; ++i1) {
                for (int k1 = -leafRange; k1 <= leafRange; ++k1) {
                    int i2 = Math.abs(i1);
                    int dist = i2 + Math.abs(k1);
                    if (dist > leafRange) {
                        continue;
                    }
                    mutable.set(centerPos, i1, j1, k1);
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
