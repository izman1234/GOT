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

public class DeadTreeTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<DeadTreeTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, DeadTreeTrunkPlacer::new));

    public DeadTreeTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.DEAD_TREE_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        height = 3 + random.nextInt(4);
        for (int j1 = startPos.getY(); j1 < startPos.getY() + height; ++j1) {
            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), j1, startPos.getZ()), config);
        }
        for (int branch = 0; branch < 4; ++branch) {
            int branchLength = 3 + random.nextInt(5);
            int branchHorizontalPos = 0;
            int branchVerticalPos = height - 1 - random.nextInt(2);
            for (int l = 0; l < branchLength; ++l) {
                if (random.nextInt(4) == 0) {
                    ++branchHorizontalPos;
                }
                if (random.nextInt(3) != 0) {
                    ++branchVerticalPos;
                }
                switch (branch) {
                    case 0: {
                        this.getAndSetState(world, replacer, random, mutable.set(startPos.getX() - branchHorizontalPos, startPos.getY() + branchVerticalPos, startPos.getZ()), config);
                        //setBlockAndNotifyAdequately(world, i - branchHorizontalPos, branchVerticalPos, k, woodBlock, woodMeta | 0xC);
                        continue;
                    }
                    case 1: {
                        this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), startPos.getY() + branchVerticalPos, startPos.getZ() + branchHorizontalPos), config);
                        //setBlockAndNotifyAdequately(world, i, branchVerticalPos, k + branchHorizontalPos, woodBlock, woodMeta | 0xC);
                        continue;
                    }
                    case 2: {
                        this.getAndSetState(world, replacer, random, mutable.set(startPos.getX() + branchHorizontalPos, startPos.getY() + branchVerticalPos, startPos.getZ()), config);
                        //setBlockAndNotifyAdequately(world, i + branchHorizontalPos, branchVerticalPos, k, woodBlock, woodMeta | 0xC);
                        continue;
                    }
                    case 3: {
                        this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), startPos.getY() + branchVerticalPos, startPos.getZ() - branchHorizontalPos), config);
                        //setBlockAndNotifyAdequately(world, i, branchVerticalPos, k - branchHorizontalPos, woodBlock, woodMeta | 0xC);
                    }
                }
            }
        }

        //list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j1, k1), 1, false));

        return null;
    }
}



