package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class SmallPlatedBlocks {
    public static List<RegistryObject<Block>> blocks = new ArrayList<>() ;

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisplayDelight.MODID);

    public static final RegistryObject<Block> PLATED_CAKE_SLICE = createPlatedBlock("small_plated_cake_slice");
    public static final RegistryObject<Block> PLATED_APPLE_PIE_SLICE = createPlatedBlock("small_plated_apple_pie_slice");
    public static final RegistryObject<Block> PLATED_CHOCOLATE_PIE_SLICE = createPlatedBlock("small_plated_chocolate_pie_slice");
    public static final RegistryObject<Block> PLATED_SWEET_BERRY_CHEESECAKE_SLICE = createPlatedBlock("small_plated_sweet_berry_cheesecake_slice");
    public static final RegistryObject<Block> PLATED_STUFFED_POTATO = createPlatedBlock("small_plated_stuffed_potato");
    public static final RegistryObject<Block> PLATED_COD_ROLL = createPlatedBlock("small_plated_cod_roll");
    public static final RegistryObject<Block> PLATED_SALMON_ROLL = createPlatedBlock("small_plated_salmon_roll");
    public static final RegistryObject<Block> PLATED_KELP_ROLL_SLICE = createPlatedBlock("small_plated_kelp_roll_slice");
    public static final RegistryObject<Block> PLATED_CABBAGE_ROLLS = createPlatedBlock("small_plated_cabbage_rolls");
    public static final RegistryObject<Block> PLATED_PUMPKIN_PIE_SLICE = createPlatedBlock("small_plated_pumpkin_pie_slice");


    private static BlockBehaviour.Properties baseProps() {
        return BlockBehaviour.Properties.of().noOcclusion()
                .instabreak().pushReaction(PushReaction.DESTROY).noParticlesOnBreak().mapColor(MapColor.COLOR_BROWN);
    }

    public static RegistryObject<Block> createPlatedBlock(String name) {
        RegistryObject<Block> b= REGISTRY.register(name,
                () -> new SmallPlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(b);
        return b;
    }

    public static List<Block> getAll() {
        return blocks.stream().map(RegistryObject::get).toList();
    };

}
