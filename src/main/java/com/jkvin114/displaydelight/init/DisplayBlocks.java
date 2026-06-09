package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.*;
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


public class DisplayBlocks {
    public static List<RegistryObject<Block>> blocks = new ArrayList<>() ;

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS,DisplayDelight.MODID);

    public static final RegistryObject<Block> PLATE = REGISTRY.register("food_plate",
            ()-> new EmptyPlateBlock(
            BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SMALL_PLATE = REGISTRY.register("small_food_plate",
            ()-> new EmptySmallPlateBlock(
                    BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)
                            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GLOW_BERRY_CUSTARD = createDrinkFoodBlock("glow_berry_custard");
    public static final RegistryObject<Block> FRUIT_SALAD = createFoodBlock("fruit_salad");
    public static final RegistryObject<Block> NETHER_SALAD = createFoodBlock("nether_salad");
    public static final RegistryObject<Block> COOKED_RICE = createFoodBlock("cooked_rice");
    public static final RegistryObject<Block> MIXED_SALAD = createFoodBlock("mixed_salad");
    public static final RegistryObject<Block> BEEF_STEW = createFoodBlock("beef_stew");
    public static final RegistryObject<Block> CHICKEN_SOUP = createFoodBlock("chicken_soup");
    public static final RegistryObject<Block> VEGETABLE_SOUP = createFoodBlock("vegetable_soup");
    public static final RegistryObject<Block> FISH_STEW = createFoodBlock("fish_stew");
    public static final RegistryObject<Block> FRIED_RICE = createFoodBlock("fried_rice");
    public static final RegistryObject<Block> PUMPKIN_SOUP = createFoodBlock("pumpkin_soup");
    public static final RegistryObject<Block> BAKED_COD_STEW = createFoodBlock("baked_cod_stew");
    public static final RegistryObject<Block> NOODLE_SOUP = createFoodBlock("noodle_soup");
    public static final RegistryObject<Block> BONE_BROTH = createFoodBlock("bone_broth");
    public static final RegistryObject<Block> BACON_AND_EGGS = createWideFoodBlock("bacon_and_eggs");
    public static final RegistryObject<Block> PASTA_WITH_MEATBALLS = createWideFoodBlock("pasta_with_meatballs");
    public static final RegistryObject<Block> PASTA_WITH_MUTTON_CHOP = createWideFoodBlock("pasta_with_mutton_chop");
    public static final RegistryObject<Block> ROASTED_MUTTON_CHOPS = createWideFoodBlock("roasted_mutton_chops");
    public static final RegistryObject<Block> STEAK_AND_POTATOES = createWideFoodBlock("steak_and_potatoes");
    public static final RegistryObject<Block> VEGETABLE_NOODLES = createWideFoodBlock("vegetable_noodles");
    public static final RegistryObject<Block> RATATOUILLE = createWideFoodBlock("ratatouille");
    public static final RegistryObject<Block> SQUID_INK_PASTA = createWideFoodBlock("squid_ink_pasta");
    public static final RegistryObject<Block> GRILLED_SALMON = createWideFoodBlock("grilled_salmon");
    public static final RegistryObject<Block> MUSHROOM_RICE = createWideFoodBlock("mushroom_rice");
    public static final RegistryObject<Block> ROAST_CHICKEN = createFoodBlock("roast_chicken");
    public static final RegistryObject<Block> STUFFED_PUMPKIN = createFoodBlock("stuffed_pumpkin");
    public static final RegistryObject<Block> HONEY_GLAZED_HAM = createFoodBlock("honey_glazed_ham");
    public static final RegistryObject<Block> SHEPHEREDS_PIE = createFoodBlock("shepherds_pie");
    public static final RegistryObject<Block> APPLE_CIDER = createDrinkFoodBlock("apple_cider");
    public static final RegistryObject<Block> MELON_JUICE = createDrinkFoodBlock("melon_juice");
    public static final RegistryObject<Block> HOT_COCOA = createDrinkFoodBlock("hot_cocoa");
    public static final RegistryObject<Block> GLEAMING_SALAD = createFoodBlock("gleaming_salad");
    public static final RegistryObject<Block> ONION_SOUP = createFoodBlock("onion_soup");


    //VANILA
    public static final RegistryObject<Block> MUSHROOM_STEW = createFoodBlock("mushroom_stew");
    public static final RegistryObject<Block> RABBIT_STEW = createFoodBlock("rabbit_stew");
    public static final RegistryObject<Block> BEETROOT_STEW = createFoodBlock("beetroot_soup");

    public static List<Block> getAll() {
        return blocks.stream().map(RegistryObject::get).toList();
    }
    private static BlockBehaviour.Properties baseProps(){
        return   BlockBehaviour.Properties.of().noOcclusion().instabreak().noParticlesOnBreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }
    private static RegistryObject<Block> createHotDrinkFoodBlock(String name){
        RegistryObject<Block> block =  REGISTRY.register(name,
                ()->new HotDrinkBlock(baseProps()
                        .sound(SoundType.GLASS)));
        blocks.add(block);
        return block;

    }
    public static RegistryObject<Block> createDrinkFoodBlock(String name){

        RegistryObject<Block> block =  REGISTRY.register(name,
                ()->new DrinkBlock(baseProps()
                        .sound(SoundType.GLASS)));

     //   DisplayItems.registerBlockItem(block);
        blocks.add(block);
        return block;
    }
    public static RegistryObject<Block> createWideFoodBlock(String name){
        RegistryObject<Block> block= REGISTRY.register(name,
                ()->new WideFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(block);
      //  DisplayItems.registerBlockItem(block);

        return block;
    }
    public static RegistryObject<Block> createFoodBlock(String name){
        RegistryObject<Block> block= REGISTRY.register(name,
                ()->new FoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(block);
    //    DisplayItems.registerBlockItem(block);
        return block;
    }
}
