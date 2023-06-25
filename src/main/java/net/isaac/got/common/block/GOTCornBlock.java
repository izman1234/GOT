package net.isaac.got.common.block;

import net.minecraft.block.BambooBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import javax.swing.text.html.BlockView;

public class GOTCornBlock extends Block {
    public GOTCornBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockBelow = world.getBlockState(pos.down()); // Get the block state below

        // Check if the block below is farmland or the same custom block
        return blockBelow.getBlock() == Blocks.FARMLAND || blockBelow.getBlock() == this;
    }
}
