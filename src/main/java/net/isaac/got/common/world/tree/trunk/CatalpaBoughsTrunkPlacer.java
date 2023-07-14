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

public class CatalpaBoughsTrunkPlacer extends TrunkPlacer {
    // Use the fillTrunkPlacerFields to create our codec
    public static final Codec<CatalpaBoughsTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, CatalpaBoughsTrunkPlacer::new));

    public CatalpaBoughsTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    public int minHeight = 10;
    public int maxHeight = 14;

    @Override
    protected TrunkPlacerType<?> getType() {
        return GOTTrunks.CATALPA_BOUGHS_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        ForkingTrunkPlacer.setToDirt(world, replacer, random, startPos.down(), config);
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        height = random.nextBetween( minHeight, maxHeight);
        int leafMin = (int) (height * 0.6f);
        int i = startPos.getX();
        int k = startPos.getZ();
        int j = startPos.getY();
        if (j >= -63 && startPos.getY() + height + 1 <= 320) {
            int j1;
            int deg = 0;
            for (j1 = j + height; j1 >= j + height - leafMin; --j1) {
                int branches = 1 + random.nextInt(2);
                for (int b = 0; b < branches; ++b) {
                    float angle = (float) Math.toRadians(deg += 50 + random.nextInt(70));
                    float cos = MathHelper.cos(angle);
                    float sin = MathHelper.sin(angle);
                    float angleY = random.nextFloat() * 0.8726646259971648f;
                    float sinY = MathHelper.sin(angleY);
                    int length = 4 + random.nextInt(6);
                    int i1 = i;
                    int k1 = k;
                    int j2 = j1;
                    for (int l = 0; l < length; ++l) {
                        if (Math.floor(cos * l) != Math.floor(cos * (l - 1))) {
                            i1 = (int) (i1 + Math.signum(cos));
                        }
                        if (Math.floor(sin * l) != Math.floor(sin * (l - 1))) {
                            k1 = (int) (k1 + Math.signum(sin));
                        }
                        if (Math.floor(sinY * l) != Math.floor(sinY * (l - 1))) {
                            j2 = (int) (j2 + Math.signum(sinY));
                        }
                        this.getAndSetState(world, replacer, random, mutable.set(i1, j2, k1), config);
                        //setBlockAndNotifyAdequately(world, i1, j2, k1, woodBlock, woodMeta | 0xC);
                    }
                    list.add(new FoliagePlacer.TreeNode(new BlockPos(i1, j2, k1), 1, false));
                    //growLeafCanopy(world, random, i1, j2, k1);
                }
            }
            for (j1 = j; j1 < j + height; ++j1) {
                this.getAndSetState(world, replacer, random, mutable.set(i, j1, k), config);
                //setBlockAndNotifyAdequately(world, i, j1, k, woodBlock, woodMeta);
            }
            for (int i1 = i - 1; i1 <= i + 1; ++i1) {
                for (int k1 = k - 1; k1 <= k + 1; ++k1) {
                    int i2 = i1 - i;
                    int k2 = k1 - k;
                    if (Math.abs(i2) == Math.abs(k2)) {
                        continue;
                    }
                    int rootY = j + random.nextInt(2);
                    while (rootY != startPos.getY() - 5) {
                        this.getAndSetState(world, replacer, random, mutable.set(i1, rootY, k1), config);
                        //setBlockAndNotifyAdequately(world, i1, rootY, k1, woodBlock, woodMeta | 0xC);
                        --rootY;
                    }
                }
            }
        }

        return list;
    }
}



