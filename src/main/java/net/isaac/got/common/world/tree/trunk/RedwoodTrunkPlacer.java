package net.isaac.got.common.world.tree.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class RedwoodTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<RedwoodTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, RedwoodTrunkPlacer::new));

    public RedwoodTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.REDWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();

        for (int i = 0; i < height; ++i) {
            this.getAndSetState(world, replacer, random, startPos.up(i), config);
        }
        list.add(new FoliagePlacer.TreeNode(startPos.up(height), 0, false));

        int n, k, l;
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        Direction directionList[] = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
        for(int m = 0; m <= 1; m++) {
            for (Direction dir : directionList) {
                n = startPos.getY() + m;
                k = startPos.getX();
                l = startPos.getZ();
                k += dir.getOffsetX();
                l += dir.getOffsetZ();
                if(m == 1) {
                    if(random.nextInt(10) <= 6) {
                        this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config);
                    }

                }
                else {
                    this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config);
                }
            }
        }

        return list;
    }

}


