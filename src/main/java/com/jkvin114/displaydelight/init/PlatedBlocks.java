package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.SimplePlatedFoodBlock;
import com.jkvin114.displaydelight.block.StackablePlateFoodBlock;

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

public class PlatedBlocks {
    public static List<RegistryObject<Block>> blocks = new ArrayList<>() ;

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisplayDelight.MODID);
    public static final RegistryObject<Block> PLATED_DUMPLINGS = createStackablePlatedBlock("plated_dumplings", 2);
    public static final RegistryObject<Block> PLATED_HAMBURGER = createPlatedBlock("plated_hamburger");
    public static final RegistryObject<Block> PLATED_BARBECUE_STICK = createStackablePlatedBlock("plated_barbecue_stick", 3);
    public static final RegistryObject<Block> PLATED_CHICKEN_SANDWICH = createStackablePlatedBlock("plated_chicken_sandwich", 2);
    public static final RegistryObject<Block> PLATED_EGG_SANDWICH = createStackablePlatedBlock("plated_egg_sandwich", 2);
    public static final RegistryObject<Block> PLATED_KELP_ROLL = createStackablePlatedBlock("plated_kelp_roll", 3);
    public static final RegistryObject<Block> PLATED_MELON_POPSICLE = createStackablePlatedBlock("plated_melon_popsicle", 2);
    public static final RegistryObject<Block> PLATED_STUFFED_POTATO = createStackablePlatedBlock("plated_stuffed_potato", 3);
    public static final RegistryObject<Block> PLATED_MUTTON_WRAP = createStackablePlatedBlock("plated_mutton_wrap", 2);
    public static final RegistryObject<Block> PLATED_BACON_SANDWICH = createPlatedBlock("plated_bacon_sandwich");

    public static final RegistryObject<Block> PLATED_CABBAGE_ROLL = createStackablePlatedBlock("plated_cabbage_rolls", 3);

    public static final RegistryObject<Block> PLATED_COD_ROLL = createStackablePlatedBlock("plated_cod_roll", 6);
    public static final RegistryObject<Block> PLATED_KELP_ROLL_SLICE = createStackablePlatedBlock("plated_kelp_roll_slice", 6);
    public static final RegistryObject<Block> PLATED_SALMON_ROLL = createStackablePlatedBlock("plated_salmon_roll", 6);

    public static final RegistryObject<Block> PLATED_SWEET_BERRY_COOKIE = createStackablePlatedBlock("plated_sweet_berry_cookie", 4);
    public static final RegistryObject<Block> PLATED_HONEY_COOKIE = createStackablePlatedBlock("plated_honey_cookie", 4);


    //VANILA
    public static final RegistryObject<Block> PLATED_COOKIE = createStackablePlatedBlock("plated_cookie", 4);
    public static final RegistryObject<Block> PLATED_PUMPKIN_PIE = createPlatedBlock("plated_pumpkin_pie");

    private static BlockBehaviour.Properties baseProps() {
        return BlockBehaviour.Properties.of().noOcclusion()
                .instabreak().pushReaction(PushReaction.DESTROY).noParticlesOnBreak().mapColor(MapColor.COLOR_BROWN);
    }

    public static RegistryObject<Block> createStackablePlatedBlock(String name, int maxStacks) {
        RegistryObject<Block> b = REGISTRY.register(name,
                () -> new StackablePlateFoodBlock(baseProps()
                        .sound(SoundType.WOOD), maxStacks));
        blocks.add(b);
        return b;
    }

    public static RegistryObject<Block> createPlatedBlock(String name) {
        RegistryObject<Block> b = REGISTRY.register(name,
                () -> new SimplePlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(b);
        return b;
    }


    public static List<Block> getAll() {
        return blocks.stream().map(RegistryObject::get).toList();
    };

}
