package com.jkvin114.displaydelight.block;

import com.jkvin114.displaydelight.init.BlockAssociations;
import com.jkvin114.displaydelight.init.DisplayBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SmallPlatedFoodBlock extends AbstractItemBlock{

    public SmallPlatedFoodBlock(Properties props) {
        super(props);
    }
    public BlockState getStateFrom(BlockState plate, Direction direction) {
        if (plate.is(DisplayBlocks.SMALL_PLATE.get())) {
            return this.defaultBlockState().setValue(FACING, direction.getOpposite());
        } else return this.defaultBlockState();
    }
    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
        ItemStack stk= this.getStackFor();
        if(stk.getItem().equals(Items.AIR)){
            stk = new ItemStack(state.getBlock().asItem());
        }
        return  stk;
    }@Override
    public ItemStack getStackFor() {
        return new ItemStack(BlockAssociations.getSmallPlatedItemFor(this));
    }
    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).isFaceSturdy(world, pos.below(), Direction.UP, SupportType.CENTER);
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(4, 0, 4, 12, 5, 12);}

}
