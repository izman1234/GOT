package net.isaac.got.common.world.tree.decorator;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.isaac.got.common.block.GOTBananaBlock;
import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.block.GOTDateBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CocoaBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class DatePalmDecorator extends TreeDecorator {
    public static final DatePalmDecorator INSTANCE = new DatePalmDecorator();

    public static final Codec<DatePalmDecorator> CODEC = Codec.unit(() -> INSTANCE);

    private DatePalmDecorator() {}

    @Override
    protected TreeDecoratorType<?> getType() {
        return GOTDecorator.DATE_PALM_DECORATOR;
    }

    @Override
    public void generate(Generator generator) {
        Random random = generator.getRandom();
        ObjectArrayList<BlockPos> list = generator.getLogPositions();
        int i = ((BlockPos)list.get(2)).getY();
        list.stream().filter(pos -> pos.getY() - i >= 4).forEach(pos -> {
            BlockPos blockPos;
            if(!generator.isAir(blockPos = pos.add(1, 1, 0))) {
                for (Direction direction : Direction.Type.HORIZONTAL) {
                    Direction direction2;
                    if (!generator.isAir(blockPos = pos.add((direction2 = direction.getOpposite()).getOffsetX(), 0, direction2.getOffsetZ())))
                        continue;
                    generator.replace(blockPos, (BlockState) ((BlockState) GOTBlocks.Date.getDefaultState().with(GOTDateBlock.FACING, direction)));
                }
            }
        });
    }

}
