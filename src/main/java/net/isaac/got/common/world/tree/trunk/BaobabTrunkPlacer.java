package net.isaac.got.common.world.tree.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.isaac.got.common.world.tree.foliage.BaobabFoliagePlacer;
import net.minecraft.block.Block;
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

public class BaobabTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<BaobabTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, BaobabTrunkPlacer::new));

    public BaobabTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.BAOBAB_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        int k2;
        int k1;
        int i2;
        int j1;
        int i1;
        int j12;
        int i = startPos.getX();
        int k = startPos.getZ();
        int j = startPos.getY();
        int trunkCircleWidth = 4;
        height = 16 + random.nextInt(10);
        int xSlope = 5 + random.nextInt(10);
        if (random.nextBoolean()) {
            xSlope *= -1;
        }
        int zSlope = 5 + random.nextInt(10);
        if (random.nextBoolean()) {
            zSlope *= -1;
        }
        for (i1 = i - trunkCircleWidth - 1; i1 <= i + trunkCircleWidth + 1; ++i1) {
            for (k1 = k - trunkCircleWidth - 1; k1 <= k + trunkCircleWidth + 1; ++k1) {
                i2 = Math.abs(i1 - i);
                k2 = Math.abs(k1 - k);
                if (i2 * i2 + k2 * k2 > trunkCircleWidth * trunkCircleWidth) {
                    continue;
                }
            }
        }
        for (j12 = 0; j12 < height; ++j12) {
            for (int i12 = i - trunkCircleWidth - 1; i12 <= i + trunkCircleWidth + 1; ++i12) {
                for (int k12 = k - trunkCircleWidth - 1; k12 <= k + trunkCircleWidth + 1; ++k12) {
                    int k22;
                    int i22 = Math.abs(i12 - i);
                    k22 = Math.abs(k12 - k);
                    if (i22 * i22 + k22 * k22 > trunkCircleWidth * trunkCircleWidth) {
                        continue;
                    }
                    this.getAndSetState(world, replacer, random, mutable.set(i12, j + j12, k12), config);
                    //setBlockAndNotifyAdequately(world, i12, j + j12, k12, woodBlock, woodMeta);
                }
            }
            if (j12 % xSlope == 0) {
                if (xSlope > 0) {
                    ++i;
                } else {
                    --i;
                }
            }
            if (j12 % zSlope == 0) {
                if (zSlope > 0) {
                    ++k;
                } else {
                    --k;
                }
            }
        }
        for (j12 = j + height - 1; j12 > j + (int) (height * 0.75f); --j12) {
            int branches = 2 + random.nextInt(3);
            for (int l = 0; l < branches; ++l) {
                float angle = random.nextFloat() * 3.1415927f * 2.0f;
                int i13 = i;
                int k13 = k;
                int j2 = j12;
                int length = random.nextBetween(4, 6);
                for (int l1 = trunkCircleWidth; l1 < trunkCircleWidth + length; ++l1) {
                    i13 = i + (int) (1.5f + MathHelper.cos(angle) * l1);
                    j2 = j12 - 3 + l1 / 2;
                    k13 = k + (int) (1.5f + MathHelper.sin(angle) * l1);
                    this.getAndSetState(world, replacer, random, mutable.set(i13, j2, k13), config);
                    //setBlockAndNotifyAdequately(world, i13, j2, k13, woodBlock, woodMeta);
                }
                list.add(new FoliagePlacer.TreeNode(new BlockPos(i13, j2, k13), 1, false));
                /*int leafMin = 1 + random.nextInt(2);
                for (int j3 = j2 - leafMin; j3 <= j2; ++j3) {
                    int leafRange = 1 - (j3 - j2);
                    spawnLeaves(world, i13, j3, k13, leafRange);
                }*/
            }
        }
        for (i1 = i - trunkCircleWidth - 1; i1 <= i + trunkCircleWidth + 1; ++i1) {
            for (k1 = k - trunkCircleWidth - 1; k1 <= k + trunkCircleWidth + 1; ++k1) {
                i2 = Math.abs(i1 - i);
                k2 = Math.abs(k1 - k);
                if (i2 * i2 + k2 * k2 > trunkCircleWidth * trunkCircleWidth || random.nextInt(5) != 0) {
                    continue;
                }
                j1 = j + height;
                int topHeight = 2 + random.nextInt(3);
                for (int l = 0; l < topHeight; ++l) {
                    this.getAndSetState(world, replacer, random, mutable.set(i1, j1, k1), config);
                    //setBlockAndNotifyAdequately(world, i1, j1, k1, woodBlock, woodMeta);
                    ++j1;
                }
                list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j1, k1), 1, false));
                /*int leafMin = 2;
                for (int j2 = j1 - leafMin; j2 <= j1; ++j2) {
                    int leafRange = 1 - (j2 - j1);
                    spawnLeaves(world, i1, j2, k1, leafRange);
                }*/
            }
        }


        return list;
    }
}



