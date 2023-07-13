package net.isaac.got.common.world.tree.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class MassiveTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<MassiveTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, MassiveTrunkPlacer::new));

    public MassiveTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.MASSIVE_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        int i = startPos.getX();
        int k = startPos.getZ();
        int j = startPos.getY();
        float f = 1.0f;
        height = (int) (f * 40.0f * 1.0f);
        int trunkRadiusMin = (int) (f * 5.0f);
        int trunkRadiusMax = trunkRadiusMin + 4;
        int xSlope = 4 + random.nextInt(7);
        if (random.nextBoolean()) {
            xSlope *= -1;
        }
        int zSlope = 4 + random.nextInt(7);
        if (random.nextBoolean()) {
            zSlope *= -1;
        }
        for (int j1 = 0; j1 < height; ++j1) {
            int width = trunkRadiusMax - (int) ((float) j1 / height * (trunkRadiusMax - trunkRadiusMin));
            for (int i1 = i - width; i1 <= i + width; ++i1) {
                for (int k1 = k - width; k1 <= k + width; ++k1) {
                    int i2 = i1 - i;
                    int k2 = k1 - k;
                    if (i2 * i2 + k2 * k2 >= width * width) {
                        continue;
                    }
                    this.getAndSetState(world, replacer, random, mutable.set(i1, j + j1, k1), config);
                    if (j1 != 0) {
                        continue;
                    }
                    for (int j2 = j - 1; j2 >= 0 && Math.abs(j2 - j) <= 6 + random.nextInt(5); --j2) {
                        this.getAndSetState(world, replacer, random, mutable.set(i1, j2, k1), config);
                        //setBlockAndNotifyAdequately(world, i1, j2, k1, woodID, woodMeta);
                    }
                }
            }
            if (j1 % xSlope == 0) {
                if (xSlope > 0) {
                    ++i;
                } else {
                    --i;
                }
            }
            if (j1 % zSlope == 0) {
                if (zSlope > 0) {
                    ++k;
                } else {
                    --k;
                }
            }
        }
        int angle = 0;
        while (angle < 360) {
            float angleR = (angle += 10 + random.nextInt(20)) / 180.0f * 3.1415927f;
            float sin = MathHelper.sin(angleR);
            float cos = MathHelper.cos(angleR);
            int boughLength = 12 + random.nextInt(10);
            int boughThickness = Math.round(boughLength / 25.0f * 1.5f);
            int boughBaseHeight = j + MathHelper.floor(height * (0.9f + random.nextFloat() * 0.1f));
            int boughHeight = 3 + random.nextInt(4);
            for (int l = 0; l < boughLength; ++l) {
                int i1 = i + Math.round(sin * l);
                int k1 = k + Math.round(cos * l);
                int j1 = boughBaseHeight + Math.round((float) l / boughLength * boughHeight);
                int range = boughThickness - Math.round((float) l / boughLength * boughThickness * 0.5f);
                for (int i2 = i1 - range; i2 <= i1 + range; ++i2) {
                    for (int j2 = j1 - range; j2 <= j1 + range; ++j2) {
                        for (int k2 = k1 - range; k2 <= k1 + range; ++k2) {
                            this.getAndSetState(world, replacer, random, mutable.set(i2, j2, k2), config);
                            //setBlockAndNotifyAdequately(world, i2, j2, k2, woodID, woodMeta | 0xC);
                        }
                    }
                }
                int branch_angle = angle + random.nextInt(360);
                float branch_angleR = branch_angle / 180.0f * 3.1415927f;
                float branch_sin = MathHelper.sin(branch_angleR);
                float branch_cos = MathHelper.cos(branch_angleR);
                int branchLength = 7 + random.nextInt(6);
                int branchHeight = random.nextInt(6);
                int leafRange = 3;
                for (int l1 = 0; l1 < branchLength; ++l1) {
                    int j2;
                    int i2 = i1 + Math.round(branch_sin * l1);
                    int k2 = k1 + Math.round(branch_cos * l1);
                    for (int j3 = j2 = j1 + Math.round((float) l1 / branchLength * branchHeight); j3 >= j2 - 1; --j3) {
                        this.getAndSetState(world, replacer, random, mutable.set(i2, j3, k2), config);
                        //setBlockAndNotifyAdequately(world, i2, j3, k2, woodID, woodMeta | 0xC);
                    }
                    list.add(new FoliagePlacer.TreeNode(new BlockPos(i2, j2, k2), 1, false));
                    /*for (int i3 = i2 - leafRange; i3 <= i2 + leafRange; ++i3) {
                        for (int j3 = j2 - leafRange; j3 <= j2 + leafRange; ++j3) {
                            for (int k3 = k2 - leafRange; k3 <= k2 + leafRange; ++k3) {
                                int i4 = i3 - i2;
                                int j4 = j3 - j2;
                                int k4 = k3 - k2;
                                int dist = i4 * i4 + j4 * j4 + k4 * k4;
                                if (dist >= (leafRange - 1) * (leafRange - 1) && (dist >= leafRange * leafRange || random.nextInt(3) == 0) || (block2 = world.getBlock(i3, j3, k3)).getMaterial() != Material.air && !block2.isLeaves(world, i3, j3, k3)) {
                                    continue;
                                }
                                setBlockAndNotifyAdequately(world, i3, j3, k3, leafID, leafMeta);
                                if (random.nextInt(40) == 0 && world.isAirBlock(i3 - 1, j3, k3)) {
                                    growVines(world, random, i3 - 1, j3, k3, 8);
                                }
                                if (random.nextInt(40) == 0 && world.isAirBlock(i3 + 1, j3, k3)) {
                                    growVines(world, random, i3 + 1, j3, k3, 2);
                                }
                                if (random.nextInt(40) == 0 && world.isAirBlock(i3, j3, k3 - 1)) {
                                    growVines(world, random, i3, j3, k3 - 1, 1);
                                }
                                if (random.nextInt(40) != 0 || !world.isAirBlock(i3, j3, k3 + 1)) {
                                    continue;
                                }
                                growVines(world, random, i3, j3, k3 + 1, 4);
                            }
                        }
                    }*/
                }
            }
        }



        return list;
    }
}



