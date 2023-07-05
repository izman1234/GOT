package net.isaac.got.common.block;

import net.minecraft.block.*;
import net.minecraft.util.math.Direction;

public class GOTPaneBlock extends PaneBlock {
    public GOTPaneBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState neighbor, Direction facing) {
        return neighbor.getBlock() == this || super.isSideInvisible(state, neighbor, facing);
    }
}