package net.isaac.got.common.world.tree.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
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
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class KanukaTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<KanukaTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, KanukaTrunkPlacer::new));

    public KanukaTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.KANUKA_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();


        float trunkAngleY = (float) Math.toRadians(90.0f - random.nextBetween(0, 35));
        float trunkAngle = random.nextFloat() * 3.1415927f * 2.0f;
        float trunkYCos = MathHelper.cos(trunkAngleY);
        float trunkYSin = MathHelper.sin(trunkAngleY);
        float trunkCos = MathHelper.cos(trunkAngle) * trunkYCos;
        float trunkSin = MathHelper.sin(trunkAngle) * trunkYCos;
        for (int pass = 0; pass <= 1; ++pass) {
            int trunkX = startPos.getX(); // i k j
            int trunkZ = startPos.getZ();
            int trunkY = startPos.getY();
            ArrayList<int[]> trunkCoords = new ArrayList<>();
            for (int l = 0; l < height; ++l) {
                if (l > 0) {
                    if (Math.floor(trunkCos * l) != Math.floor(trunkCos * (l + 1))) {
                        trunkX = (int) (trunkX + Math.signum(trunkCos));
                    }
                    if (Math.floor(trunkSin * l) != Math.floor(trunkSin * (l + 1))) {
                        trunkZ = (int) (trunkZ + Math.signum(trunkSin));
                    }
                    if (Math.floor(trunkYSin * l) != Math.floor(trunkYSin * (l + 1))) {
                        trunkY = (int) (trunkY + Math.signum(trunkYSin));
                    }
                }
                int j1 = trunkY;
                for (int i1 = trunkX; i1 <= trunkX; ++i1) {
                    for (int k1 = trunkZ; k1 <= trunkZ; ++k1) {
                        if (pass != 1) {
                            continue;
                        }
                        this.getAndSetState(world, replacer, random, mutable.set(i1, j1, k1), config);
                        trunkCoords.add(new int[]{i1, j1, k1});
                    }
                }
            }
            if (pass != 1) {
                continue;
            }
            int branchHeight = (int) (height * 0.67);
            int deg = 0;
            while (deg < 360) {
                int degIncr = random.nextBetween(70, 150);
                degIncr = Math.max(degIncr, 20);
                float angle = (float) Math.toRadians(deg += degIncr);
                float cos = MathHelper.cos(angle);
                float sin = MathHelper.sin(angle);
                float angleY = (float) Math.toRadians(70.0f - random.nextFloat() * 20.0f);
                float cosY = MathHelper.cos(angleY);
                float sinY = MathHelper.sin(angleY);
                cos *= cosY;
                sin *= cosY;
                int length = branchHeight + random.nextBetween( -3, 3);
                length = Math.max(length, 3);
                int trunkIndex = random.nextBetween((int) ((trunkCoords.size() - 1) * 0.5), trunkCoords.size() - 1);
                int[] oneTrunkCoord = trunkCoords.get(trunkIndex);
                int i1 = oneTrunkCoord[0];
                int j1 = oneTrunkCoord[1];
                int k1 = oneTrunkCoord[2];
                for (int l = 0; l < length; ++l) {
                    if (Math.floor(cos * l) != Math.floor(cos * (l + 1))) {
                        i1 = (int) (i1 + Math.signum(cos));
                    }
                    if (Math.floor(sin * l) != Math.floor(sin * (l + 1))) {
                        k1 = (int) (k1 + Math.signum(sin));
                    }
                    if (Math.floor(sinY * l) != Math.floor(sinY * (l + 1))) {
                        j1 = (int) (j1 + Math.signum(sinY));
                    }
                    this.getAndSetState(world, replacer, random, mutable.set(i1, j1, k1), config);
                }
                list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j1, k1), 1, false));
            }
        }

        return list;
    }
}



