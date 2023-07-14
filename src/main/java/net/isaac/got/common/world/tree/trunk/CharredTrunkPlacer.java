package net.isaac.got.common.world.tree.trunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class CharredTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<CharredTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, CharredTrunkPlacer::new));

    public CharredTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.CHARRED_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        height = 2 + random.nextInt(5);
        int j = startPos.getY();
        for (int j1 = j; j1 < j + height; ++j1) {
            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), j1, startPos.getZ()), config);
            //world.setBlock(i, j1, k, GOTRegistry.wood1, 3, 2);
        }
        if (height >= 4) {
            for (int branch = 0; branch < 4; ++branch) {
                int branchLength = 2 + random.nextInt(4);
                int branchHorizontalPos = 0;
                int branchVerticalPos = j + height - random.nextInt(2);
                for (int l = 0; l < branchLength; ++l) {
                    if (random.nextInt(4) == 0) {
                        ++branchHorizontalPos;
                    }
                    if (random.nextInt(3) != 0) {
                        ++branchVerticalPos;
                    }
                    switch (branch) {
                        case 0: {
                            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX() - branchHorizontalPos, j + branchVerticalPos, startPos.getZ()), config);
                            //world.setBlock(i - branchHorizontalPos, branchVerticalPos, k, GOTRegistry.wood1, 15, 2);
                            continue;
                        }
                        case 1: {
                            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), j + branchVerticalPos, startPos.getZ() + branchHorizontalPos), config);
                            //world.setBlock(i, branchVerticalPos, k + branchHorizontalPos, GOTRegistry.wood1, 15, 2);
                            continue;
                        }
                        case 2: {
                            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX() + branchHorizontalPos, j + branchVerticalPos, startPos.getZ()), config);
                            //world.setBlock(i + branchHorizontalPos, branchVerticalPos, k, GOTRegistry.wood1, 15, 2);
                            continue;
                        }
                        case 3: {
                            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), j + branchVerticalPos, startPos.getZ() - branchHorizontalPos), config);
                            //world.setBlock(i, branchVerticalPos, k - branchHorizontalPos, GOTRegistry.wood1, 15, 2);
                        }
                    }
                }
            }
        }

        //list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j1, k1), 1, false));

        return null;
    }
}



