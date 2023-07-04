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
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class RedUlthosTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<RedUlthosTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, RedUlthosTrunkPlacer::new));

    public RedUlthosTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.RED_ULTHOS_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        int n;
        setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        Direction directionList[] = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP};
        int i = height - 3;
        int kk = 0;
        int ll = 0;
        OptionalInt optionalInt = OptionalInt.empty();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for(int j = 0; j < 5; j++) {
            int k = startPos.getX();
            int l = startPos.getZ();
            for (int m = 0; m < height; ++m) {
                n = startPos.getY() + m;
                if (m >= i) {
                    k += directionList[j].getOffsetX();
                    l += directionList[j].getOffsetZ();
                }
                kk = k;
                ll = l;
                if (!this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config)) continue;
                optionalInt = OptionalInt.of(n + 1);
            }
        }
        if (optionalInt.isPresent()) {
            list.add(new FoliagePlacer.TreeNode(new BlockPos(kk, optionalInt.getAsInt(), ll), 1, false));
        }

        i += 1;
        int offsetx = 0;
        int offsetz = 0;
        for(int j = 0; j < 4; j++) {
            int x = startPos.getX();
            int z = startPos.getZ();
            if(directionList[j] == Direction.NORTH) {
                offsetx = 1;
                offsetz = 0;
            }
            else if(directionList[j] == Direction.EAST) {
                offsetx = 0;
                offsetz = 1;
            }
            else if(directionList[j] == Direction.SOUTH) {
                offsetx = -1;
                offsetz = 0;
            }
            else if(directionList[j] == Direction.WEST) {
                offsetx = 0;
                offsetz = -1;
            }
            for (int m = i; m < height; ++m) {
                n = startPos.getY() + m;
                if (m >= i) {
                    x += directionList[j].getOffsetX() + offsetx;
                    z += directionList[j].getOffsetZ() + offsetz;
                }
                if (!this.getAndSetState(world, replacer, random, mutable.set(x, n, z), config)) continue;
                optionalInt = OptionalInt.of(n + 1);
            }
        }

        int k = startPos.getX();
        int l = startPos.getZ();
        int ran = random.nextInt(4);
        Direction dir = directionList[ran];
        for(int b = 0; b < 3; b++) {
            for (int m = 0; m < 2; ++m) {
                n = startPos.getY() + m;
                k += dir.getOffsetX();
                l += dir.getOffsetZ();
                if (!this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config)) continue;
                optionalInt = OptionalInt.of(n + 1);
                dir  = directionList[4];

            }
            if(b == 1) {
                generateEndPiece(world, replacer, random, config, directionList[ran], mutable, startPos, list, k, l);
                generateEndPiece(world, replacer, random, config, directionList[ran].rotateYCounterclockwise(), mutable, startPos, list, k, l);
            }
            if(ran == 3) { ran = 0; }
            else { ran += 1;}
            dir = directionList[ran];
        }
        return list;
    }

    public void generateEndPiece(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, Direction dir,  BlockPos.Mutable mutable, BlockPos startPos, ArrayList<FoliagePlacer.TreeNode> list, int k, int l) {
        int n = startPos.getY();
        k += dir.getOffsetX();
        l += dir.getOffsetZ();
        this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config);

    }
}


