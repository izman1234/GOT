package net.isaac.got.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class GOTPlateBlock extends Block {
    public GOTPlateBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = createCuboidShape(2, 0, 2, 14, 1, 14);

    @Override
    public VoxelShape getOutlineShape(BlockState state, net.minecraft.world.BlockView world, BlockPos pos, ShapeContext context) {
        // Define the voxel shape for the plate block (one pixel high)
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockBelowPos = pos.down();
        BlockState blockBelowState = world.getBlockState(blockBelowPos);
        return blockBelowState.isSideSolidFullSquare(world, blockBelowPos, Direction.UP);
    }
}
