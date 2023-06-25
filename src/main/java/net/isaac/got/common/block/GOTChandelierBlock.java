package net.isaac.got.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.joml.Vector3f;

public class GOTChandelierBlock extends Block {
    protected final ParticleEffect particle;
    public GOTChandelierBlock(Settings settings, ParticleEffect particle) {

        super(settings);
        this.particle = particle;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockBelowPos = pos.up();
        BlockState blockBelowState = world.getBlockState(blockBelowPos);
        return blockBelowState.isSideSolidFullSquare(world, blockBelowPos, Direction.DOWN);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == Direction.UP && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) { //FIX
        double d = (double)pos.getX() + 0.2;
        double e = (double)pos.getY() + 0.7;
        double f = (double)pos.getZ() + 0.2;
        if(this.particle == ParticleTypes.EFFECT) {
            world.addParticle(this.particle, d, e, f, -0.5, 0.0, -0.5);
            world.addParticle(this.particle, d + 0.6, e, f, 0.5, 0.0, -0.5);
            world.addParticle(this.particle, d, e, f+ 0.6, -0.5, 0.0, 0.5);
            world.addParticle(this.particle, d+ 0.6, e, f+ 0.6, 0.5, 0.0, 0.5);
        }
        else {
            world.addParticle(this.particle, d, e, f, 0.0, 0.0, 0.0);
            world.addParticle(this.particle, d + 0.6, e, f, 0.0, 0.0, 0.0);
            world.addParticle(this.particle, d, e, f+ 0.6, 0.0, 0.0, 0.0);
            world.addParticle(this.particle, d+ 0.6, e, f+ 0.6, 0.0, 0.0, 0.0);
        }
    }
}
