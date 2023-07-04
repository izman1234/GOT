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

public class BananaFoliagePlacer extends FoliagePlacer {
    public static final Codec<BananaFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(1, 512).fieldOf("foliage_height").forGetter(BananaFoliagePlacer::getFoliageHeight))
                    .apply(instance, BananaFoliagePlacer::new));

    private final IntProvider foliageHeight;

    public BananaFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider foliageHeight) { //2 0 5
        super(radius, offset);

        this.foliageHeight = foliageHeight;
    }

    public IntProvider getFoliageHeight() {
        return this.foliageHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GOTFoliage.BANANA_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos.Mutable center = treeNode.getCenter().mutableCopy();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int height = offset - foliageHeight + 1;
        Direction directionList[] = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
        for (Direction dir : directionList) {
            int state = random.nextInt(3);
            switch(state) {
                case 0:
                    generateVariant1(world, placer, random, config, radius, center, mutable, dir, height);
                    break;
                case 1:
                    generateVariant2(world, placer, random, config, radius, center, mutable, dir, height);
                    break;
                case 2:
                    generateVariant3(world, placer, random, config, radius, center, mutable, dir, height);
                    break;
            }
        }
    }

    private void generateVariant1(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int radius, BlockPos.Mutable center, BlockPos.Mutable mutable, Direction dir, int height) {

        int x = dir.getOffsetX();
        int z = dir.getOffsetZ();
        int y = height;

        mutable.set(center, x, y, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        x += dir.getOffsetX();
        z += dir.getOffsetZ();

        mutable.set(center, x, y, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        mutable.set(center, x, y + 1, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

    }

    private void generateVariant2(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int radius, BlockPos.Mutable center, BlockPos.Mutable mutable, Direction dir, int height) {

        int x = dir.getOffsetX();
        int z = dir.getOffsetZ();
        int y = height;

        mutable.set(center, x, y, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        mutable.set(center, x, y + 1, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        x += dir.getOffsetX();
        z += dir.getOffsetZ();

        mutable.set(center, x, y + 1, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        mutable.set(center, x, y + 2, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

    }

    private void generateVariant3(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int radius, BlockPos.Mutable center, BlockPos.Mutable mutable, Direction dir, int height) {

        int x = dir.getOffsetX();
        int z = dir.getOffsetZ();
        int y = height;

        mutable.set(center, x, y, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        mutable.set(center, x, y + 1, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        mutable.set(center, x, y + 2, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        x += dir.getOffsetX();
        z += dir.getOffsetZ();

        mutable.set(center, x, y + 2, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

        mutable.set(center, x, y + 3, z);
        FoliagePlacer.placeFoliageBlock(world, placer, random, config, mutable);

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
