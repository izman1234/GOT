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

public class MahoganyFoliagePlacer extends FoliagePlacer {
    public static final Codec<MahoganyFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(MahoganyFoliagePlacer::getFoliageHeight))
                    .apply(instance, MahoganyFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public MahoganyFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) {
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.MAHOGANY_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable centerPos = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        radius = random.nextBetween(0, 2);
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

        Iterator var14 = Direction.Type.HORIZONTAL.iterator();
        int hangingLeavesChance = 4;
        int hangingLeavesExtensionChance = 9;
        BlockPos blockPos = centerPos.down();

        while(var14.hasNext()) {
            Direction direction = (Direction)var14.next();
            Direction direction2 = direction.rotateYClockwise();
            int j = direction2.getDirection() == Direction.AxisDirection.POSITIVE ? radius: radius;
            mutable.set(centerPos, 0, offset - foliageHeight - 1, 0).move(direction2, j).move(direction, -radius);
            int k = -radius;

            while(k < radius) {
                boolean bl = placer.hasPlacedBlock(mutable.move(Direction.UP));
                mutable.move(Direction.DOWN);
                if (bl && placeFoliageBlock(world, placer, random, config, hangingLeavesChance, blockPos, mutable)) {
                    mutable.move(Direction.DOWN);
                    placeFoliageBlock(world, placer, random, config, hangingLeavesExtensionChance, blockPos, mutable);
                    mutable.move(Direction.UP);
                    mutable.move(Direction.UP);
                }

                ++k;
                mutable.move(direction);
            }
        }
    }

    private static boolean placeFoliageBlock(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int chance, BlockPos origin, BlockPos.Mutable pos) {
        if (pos.getManhattanDistance(origin) >= 7) {
            return false;
        } else {
            return chance >= random.nextInt(10) ? placeFoliageBlock(world, placer, random, config, pos) : false;
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
