package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.IConfigSpec;


public class DisplayConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final IConfigSpec CONFIG;

    public static final ForgeConfigSpec.BooleanValue TOOLTIP;
    public static final ForgeConfigSpec.BooleanValue MESSAGE;
    public static final ForgeConfigSpec.BooleanValue DISABLE_VANILLA_FOODS;
    public static final ForgeConfigSpec.BooleanValue DISABLE_EATING_ANIMATION_FIX;

    public static final ForgeConfigSpec.BooleanValue SILKTOUCH_DROPS_FOOD_BLOCK_ITEM;
    public static final ForgeConfigSpec.BooleanValue WANDERING_TRADER_FOOD_BLOCK_ITEMS;

    static {
        BUILDER.push("Features");
        DISABLE_VANILLA_FOODS = BUILDER
                .comment("Disable Vanila Food(mushroom stew,rabbit stew,beetroot soup) Placement. Set to true if vanila food placement conflicts with other mods")
                .define("Disable-Vanila-Food-Placement", false);
        TOOLTIP = BUILDER.comment("Should placeable tooltips be enabled?").define("Tooltips", true);
        DISABLE_EATING_ANIMATION_FIX = BUILDER.comment("This mod uses hardcoded check to remove annoying eating animation while plating some foods.\n" +
                        " Try setting this to true if there are any related issues(can't eat foods, can't plate foods, etc.). (only applicable for Forge version)")
                .define("Disable-Eating-Animation-Fix", false);

        MESSAGE = BUILDER.comment("Should a message be enabled when attempting to place a food item?")
                .define("Display-Message", true);
        SILKTOUCH_DROPS_FOOD_BLOCK_ITEM = BUILDER.comment("Whether to drop the food block item when food block is broken by silktouch")
                .define("SilkTouchDropFoodBlock", true);
        WANDERING_TRADER_FOOD_BLOCK_ITEMS = BUILDER.comment("Should wandering traders sell food block items that are unobtainable in survival due to missing compat?")
                .define("WanderingTraderSellFoodBlock", true);
        BUILDER.pop();
        CONFIG = BUILDER.build();
    }

}