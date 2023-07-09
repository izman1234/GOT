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
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class GiantRedwoodTrunkPlacer extends GiantTrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<GiantRedwoodTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, GiantRedwoodTrunkPlacer::new));

    public GiantRedwoodTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.GIANT_REDWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();

        BlockPos blockPos = startPos.down();
        setToDirt(world, replacer, random, blockPos, config);
        setToDirt(world, replacer, random, blockPos.east(), config);
        setToDirt(world, replacer, random, blockPos.south(), config);
        setToDirt(world, replacer, random, blockPos.south().east(), config);
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int i = 0; i < height; ++i) {
            this.setLog(world, replacer, random, mutable, config, startPos, 0, i, 0);
            this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 0);
            this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 1);
            this.setLog(world, replacer, random, mutable, config, startPos, 0, i, 1);
        }
        list.add(new FoliagePlacer.TreeNode(startPos.up(height), 0, true));

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, -1, i, 0);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, -1, i, 1);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, 2, i, 0);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, 2, i, 1);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 2);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, 0, i, 2);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, 1, i, -1);
            }
        }

        for(int i = 0; i <= 3; ++i) {
            if((random.nextBetween(1,3) == 1) && (i == 2)) {
                break;
            }
            else if((random.nextBetween(1,3) == 1) && (i == 3)) {
                break;
            }
            else {
                this.setLog(world, replacer, random, mutable, config, startPos, 0, i, -1);
            }
        }

        return list;
    }

    private void setLog(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos.Mutable tmpPos, TreeFeatureConfig config, BlockPos startPos, int dx, int dy, int dz) {
        tmpPos.set(startPos, dx, dy, dz);
        this.trySetState(world, replacer, random, tmpPos, config);
    }

}


