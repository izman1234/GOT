package net.isaac.got.common.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GOTBananaBlock extends CocoaBlock {
    private static final VoxelShape SOUTH_SHAPE = createCuboidShape(6, 3, 12, 10, 15, 16);
    private static final VoxelShape NORTH_SHAPE = createCuboidShape(6, 3, 0, 10, 15, 4);
    private static final VoxelShape WEST_SHAPE = createCuboidShape(0, 3, 6, 4, 15, 10);
    private static final VoxelShape EAST_SHAPE = createCuboidShape(12, 3, 6, 16, 15, 10);
    //public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public GOTBananaBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(AGE, 2));
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        switch (facing) {
            case SOUTH:
                return SOUTH_SHAPE;
            case NORTH:
                return NORTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case EAST:
                return EAST_SHAPE;
            default:
                return VoxelShapes.fullCube(); // Fallback to full cube shape if no matching direction
        }
    }
}
