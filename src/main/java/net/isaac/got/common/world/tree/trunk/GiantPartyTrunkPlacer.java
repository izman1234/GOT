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

public class GiantPartyTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<GiantPartyTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, GiantPartyTrunkPlacer::new));

    public GiantPartyTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.GIANT_PARTY_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        int i = startPos.getX();
        int k = startPos.getZ();
        int j = startPos.getY();
        int i1;
        int j1;
        int k1;
        int trunkWidth = 1;
        height = random.nextInt(12) + 12;
        for (j1 = 0; j1 < height; ++j1) {
            for (int i13 = i - trunkWidth; i13 <= i + trunkWidth; ++i13) {
                for (int k13 = k - trunkWidth; k13 <= k + trunkWidth; ++k13) {
                    this.getAndSetState(world, replacer, random, mutable.set(i13, j + j1, k13), config);
                    //setBlockAndNotifyAdequately(world, i13, j + j1, k13, woodBlock, woodMeta);
                }
            }
        }
        int angle = 0;
        while (angle < 360) {
            float angleR = (angle += 20 + random.nextInt(25)) / 180.0f * 3.1415927f;
            float sin = MathHelper.sin(angleR);
            float cos = MathHelper.cos(angleR);
            int boughLength = 6 + random.nextInt(6);
            int boughThickness = Math.round(boughLength / 20.0f * 1.5f);
            int boughBaseHeight = j + MathHelper.floor(height * (0.75f + random.nextFloat() * 0.25f));
            int boughHeight = 3 + random.nextInt(4);
            for (int l = 0; l < boughLength; ++l) {
                int i14 = i + Math.round(sin * l);
                int k14 = k + Math.round(cos * l);
                int j12 = boughBaseHeight + Math.round((float) l / boughLength * boughHeight);
                int range = boughThickness - Math.round((float) l / boughLength * boughThickness * 0.5f);
                for (int i2 = i14 - range; i2 <= i14 + range; ++i2) {
                    for (int j2 = j12 - range; j2 <= j12 + range; ++j2) {
                        for (int k2 = k14 - range; k2 <= k14 + range; ++k2) {
                            this.getAndSetState(world, replacer, random, mutable.set(i2, j2, k2), config);
                            //setBlockAndNotifyAdequately(world, i2, j2, k2, woodBlock, woodMeta | 0xC);
                        }
                    }
                }
                int branch_angle = angle + random.nextInt(360);
                float branch_angleR = branch_angle / 180.0f * 3.1415927f;
                float branch_sin = MathHelper.sin(branch_angleR);
                float branch_cos = MathHelper.cos(branch_angleR);
                int branchLength = 4 + random.nextInt(4);
                int branchHeight = random.nextInt(5);
                int leafRange = 3;
                for (int l1 = 0; l1 < branchLength; ++l1) {
                    int j2;
                    int i2 = i14 + Math.round(branch_sin * l1);
                    int k2 = k14 + Math.round(branch_cos * l1);
                    int j3;
                    for (j3 = j2 = j12 + Math.round((float) l1 / branchLength * branchHeight); j3 >= j2 - 1; --j3) {
                        this.getAndSetState(world, replacer, random, mutable.set(i2, j3, k2), config);
                        //setBlockAndNotifyAdequately(world, i2, j3, k2, woodBlock, woodMeta | 0xC);
                    }
                    if (l1 != branchLength - 1) {
                        continue;
                    }
                    list.add(new FoliagePlacer.TreeNode(new BlockPos(i2, j3, k2), 1, false));

                    //place foliage here
                }
            }
        }
        int roots = 5 + random.nextInt(5);
        for (int l = 0; l < roots; ++l) {
            int i15 = i;
            int j13 = j + 1 + random.nextInt(5);
            int k15 = k;
            int xDirection = 0;
            int zDirection = 0;
            int rootLength = 2 + random.nextInt(4);
            if (random.nextBoolean()) {
                if (random.nextBoolean()) {
                    i15 -= trunkWidth + 1;
                    xDirection = -1;
                } else {
                    i15 += trunkWidth + 1;
                    xDirection = 1;
                }
                k15 -= trunkWidth + 1;
                k15 += random.nextInt(trunkWidth * 2 + 2);
            } else {
                if (random.nextBoolean()) {
                    k15 -= trunkWidth + 1;
                    zDirection = -1;
                } else {
                    k15 += trunkWidth + 1;
                    zDirection = 1;
                }
                i15 -= trunkWidth + 1;
                i15 += random.nextInt(trunkWidth * 2 + 2);
            }
            for (int l1 = 0; l1 < rootLength; ++l1) {
                int rootBlocks = 0;
                int j2 = j13;
                while (rootBlocks < 5) {
                    this.getAndSetState(world, replacer, random, mutable.set(i15, j2, k15), config);
                    //setBlockAndNotifyAdequately(world, i15, j2, k15, woodBlock, woodMeta | 0xC);
                    rootBlocks++;
                    --j2;
                }
                --j13;
                if (random.nextBoolean()) {
                    if (xDirection == -1) {
                        i15--;
                    } else if (xDirection == 1) {
                        i15++;
                    } else if (zDirection == -1) {
                        k15--;
                    } else {
                        k15++;
                    }
                }
            }
        }


        return list;
    }
}



