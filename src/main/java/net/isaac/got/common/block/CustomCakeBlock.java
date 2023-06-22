package net.isaac.got.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CustomCakeBlock extends CakeBlock {
    private static final VoxelShape[] SHAPES = {
            // Define the voxel shapes for each state (0 to 6 bites)
            createCuboidShape(1, 0, 1, 15, 8, 15),
            createCuboidShape(3, 0, 1, 15, 8, 15),
            createCuboidShape(5, 0, 1, 15, 8, 15),
            createCuboidShape(7, 0, 1, 15, 8, 15),
            createCuboidShape(9, 0, 1, 15, 8, 15),
            createCuboidShape(11, 0, 1, 15, 8, 15),
            createCuboidShape(13, 0, 1, 15, 8, 15),
    };

    public CustomCakeBlock(Settings settings) {
        super(settings);
    }

    protected int getComparatorOutput(BlockState state) {
        return state.get(BITES);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getStackInHand(hand);

        if (heldItem.isEmpty() && player.canConsume(false)) {
            return eatCakeSlice(state, world, pos, player);
        }

        if (heldItem.getItem().isFood()) {
            return eatCakeSliceAndFood(state, world, pos, player, heldItem);
        }

        return ActionResult.PASS;
    }

    private ActionResult eatCakeSlice(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if (!world.isClient) {
            return super.onUse(state, world, pos, player, player.getActiveHand(), new BlockHitResult(player.getPos(), player.getHorizontalFacing(), pos, false));
        }
        return ActionResult.SUCCESS;
    }

    private ActionResult eatCakeSliceAndFood(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack heldItem) {
        if (!world.isClient) {
            player.eatFood(world, heldItem);
            return super.onUse(state, world, pos, player, player.getActiveHand(), new BlockHitResult(player.getPos(), player.getHorizontalFacing(), pos, false));
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ePos) {
        return SHAPES[state.get(BITES)];
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPES[state.get(BITES)];
    }
}
