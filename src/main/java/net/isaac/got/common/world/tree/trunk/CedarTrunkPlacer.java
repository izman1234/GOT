package net.isaac.got.common.world.tree.trunk;

import com.google.common.collect.ImmutableList;
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
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class CedarTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<CedarTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, CedarTrunkPlacer::new));

    public CedarTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.CEDAR_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        Direction direction;

        for (int i = 0; i < height; ++i) {
            this.getAndSetState(world, replacer, random, startPos.up(i), config);
        }
        list.add(new FoliagePlacer.TreeNode(startPos.up(height), 0, false));

        int n, k, l, i, j;
        int keepHeight;
        int mHeight;
        int numTimes = random.nextBetween(3, 7);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        OptionalInt optionalInt = OptionalInt.empty();

        for(int o = 0; o < numTimes + 1; o++) {
            direction = Direction.Type.HORIZONTAL.random(random);
            i = height - random.nextBetween(1, 5) - random.nextBetween(1, 3);
            j = 4 - random.nextInt(2);
            if(i <= 5) {
                i = 5;
            }
            k = startPos.getX();
            l = startPos.getZ();
            mHeight = 0;
            for (int m = 0; m < height; ++m) {
                n = startPos.getY() + mHeight;
                if (m >= i && j > 0) {
                    k += direction.getOffsetX();
                    l += direction.getOffsetZ();
                    --j;
                    keepHeight = random.nextInt(6);
                    if (keepHeight <= 1) {
                        mHeight--;
                    }
                    if (!this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config)) continue;
                    optionalInt = OptionalInt.of(n + 1);
                }
                mHeight++;
            }
            if (optionalInt.isPresent()) {
                list.add(new FoliagePlacer.TreeNode(new BlockPos(k, optionalInt.getAsInt(), l), 1, false));
            }
        }
        return list;
    }

}


