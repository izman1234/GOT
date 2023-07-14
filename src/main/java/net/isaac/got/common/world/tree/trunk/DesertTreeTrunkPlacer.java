package net.isaac.got.common.world.tree.trunk;

import com.google.common.collect.Lists;
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

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class DesertTreeTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<DesertTreeTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, DesertTreeTrunkPlacer::new));

    public DesertTreeTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.DESERT_TREE_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int branch = 0; branch < 4; ++branch) {
            int branchLength = 1 + random.nextInt(3);
            int i1 = startPos.getX();
            int j1 = startPos.getY() + height - 1 - random.nextInt(2);
            int k1 = startPos.getZ();
            for (int l = 0; l < branchLength; ++l) {
                if (random.nextInt(3) != 0) {
                    ++j1;
                }
                if (random.nextInt(3) != 0) {
                    switch (branch) {
                        case 0: {
                            --i1;
                            break;
                        }
                        case 1: {
                            ++k1;
                            break;
                        }
                        case 2: {
                            ++i1;
                            break;
                        }
                        case 3: {
                            --k1;
                        }
                    }
                }
                this.getAndSetState(world, replacer, random, mutable.set(i1, j1, k1), config);
                list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j1, k1), 1, false));
                //setBlockAndNotifyAdequately(world, i1, j1, k1, woodBlock, woodMeta);
            }
        }
        for (int j1 = startPos.getY(); j1 < startPos.getY() + height; ++j1) {
            this.getAndSetState(world, replacer, random, mutable.set(startPos.getX(), j1, startPos.getZ()), config);
            //setBlockAndNotifyAdequately(world, i, j1, k, woodBlock, woodMeta);
        }

        //list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j1, k1), 1, false));

        return list;
    }
}



