package com.jkvin114.displaydelight.init.compat;

import com.jkvin114.displaydelight.init.RegisterHelper;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ExpandedDelightDisplayBlocks {
    //Expanded delight
    public static final RegistryObject<Block> ED_ASPARAGUS_SOUP = RegisterHelper.createFoodBlock("ed_asparagus_soup");
    public static final RegistryObject<Block> ED_ASPARAGUS_SOUP_CREAMY = RegisterHelper.createFoodBlock("ed_asparagus_soup_creamy");
    public static final RegistryObject<Block> ED_ASPARAGUS_AND_BACON_CHEESY = RegisterHelper.createWideFoodBlock("ed_asparagus_and_bacon_cheesy");
    public static final RegistryObject<Block> ED_PEPERONATA = RegisterHelper.createWideFoodBlock("ed_peperonata");
    public static final RegistryObject<Block> ED_PEANUT_HONEY_SOUP = RegisterHelper.createFoodBlock("ed_peanut_honey_soup");
    public static final RegistryObject<Block> ED_MAC_AND_CHEESE = RegisterHelper.createFoodBlock("ed_mac_and_cheese");
    public static final RegistryObject<Block> ED_PEANUT_SALAD = RegisterHelper.createFoodBlock("ed_peanut_salad");
    public static final RegistryObject<Block> ED_SWEET_POTTATO_SALAD = RegisterHelper.createFoodBlock("ed_sweet_potato_salad");
    public static final RegistryObject<Block> ED_CINNAMON_RICE = RegisterHelper.createFoodBlock("ed_cinnamon_rice");
    public static final RegistryObject<Block> ED_CINNAMON_APPLES = RegisterHelper.createFoodBlock("ed_cinnamon_apples");
    public static final RegistryObject<Block> ED_APPLE_JUICE = RegisterHelper.createDrinkFoodBlock("ed_apple_juice");
    public static final RegistryObject<Block> ED_SWEET_BERRY_JUICE = RegisterHelper.createDrinkFoodBlock("ed_sweet_berry_juice");
    public static final RegistryObject<Block> ED_GLOW_BERRY_JUICE = RegisterHelper.createDrinkFoodBlock("ed_glow_berry_juice");


    public static final RegistryObject<Block> ED_SWEET_ROLL_SMALL = RegisterHelper.createSmallPlatedFoodBlock("ed_small_plated_sweet_roll");
    public static final RegistryObject<Block> ED_BERRY_SWEET_ROLL_SMALL = RegisterHelper.createSmallPlatedFoodBlock("ed_small_plated_berry_sweet_roll");
    public static final RegistryObject<Block> ED_GLOW_BERRY_SWEET_ROLL_SMALL = RegisterHelper.createSmallPlatedFoodBlock("ed_small_plated_glow_berry_sweet_roll");
    public static final RegistryObject<Block> ED_CHEESE_SLICE = RegisterHelper.createSmallPlatedFoodBlock("ed_small_plated_cheese_slice");


    public static final RegistryObject<Block> ED_PEANUT_BUTTER_SANDWICH = RegisterHelper.createPlatedFoodBlock("ed_plated_peanut_butter_sandwich");
    public static final RegistryObject<Block> ED_PEANUT_BUTTER_AND_HONEY_SANDWICH = RegisterHelper.createPlatedFoodBlock("ed_plated_peanut_butter_honey_sandwich");
    public static final RegistryObject<Block> ED_GLOW_BERRY_JELLY_SANDWICH = RegisterHelper.createPlatedFoodBlock("ed_plated_glow_berry_jelly_sandwich");
    public static final RegistryObject<Block> ED_SWEET_BERRY_JELLY_SANDWICH = RegisterHelper.createPlatedFoodBlock("ed_plated_sweet_berry_jelly_sandwich");
    public static final RegistryObject<Block> ED_CHEESE_SANDWICH = RegisterHelper.createPlatedFoodBlock("ed_plated_cheese_sandwich");
    public static final RegistryObject<Block> ED_GRILLED_CHEESE = RegisterHelper.createPlatedFoodBlock("ed_plated_grilled_cheese");

    public static final RegistryObject<Block> ED_CHOCOLATE_COOKIE = RegisterHelper.createStackablePlatedFoodBlock("ed_plated_chocolate_cookie", 4);
    public static final RegistryObject<Block> ED_SUGAR_COOKIE = RegisterHelper.createStackablePlatedFoodBlock("ed_plated_sugar_cookie", 4);
    public static final RegistryObject<Block> ED_SNICKERDOODLE = RegisterHelper.createStackablePlatedFoodBlock("ed_plated_snickerdoodle", 4);
    public static final RegistryObject<Block> ED_SWEET_ROLL = RegisterHelper.createStackablePlatedFoodBlock("ed_plated_sweet_roll", 4);
    public static final RegistryObject<Block> ED_BERRY_SWEET_ROLL = RegisterHelper.createStackablePlatedFoodBlock("ed_plated_berry_sweet_roll", 4);
    public static final RegistryObject<Block> ED_GLOW_BERRY_SWEET_ROLL = RegisterHelper.createStackablePlatedFoodBlock("ed_plated_glow_berry_sweet_roll", 4);

    public static void load(){
        LogUtils.getLogger().info("Expanded delight blocks are loaded");
    }

}
