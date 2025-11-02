package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.*;
import com.jkvin114.displaydelight.block.fiery.FieryFoodBlock;
import com.jkvin114.displaydelight.block.fiery.FieryWideFoodBlock;
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
    public static final RegistryObject<Block> HOT_COCOA = createHotDrinkFoodBlock("hot_cocoa");


    //VANILA
    public static final RegistryObject<Block> MUSHROOM_STEW = createFoodBlock("mushroom_stew");
    public static final RegistryObject<Block> RABBIT_STEW = createFoodBlock("rabbit_stew");
    public static final RegistryObject<Block> BEETROOT_STEW = createFoodBlock("beetroot_soup");


    //CORN DELIGHT

    public static final RegistryObject<Block> CD_NACHOS_BOWL = createFoodBlock("cd_nachos_bowl");
    public static final RegistryObject<Block> CD_CREAMY_COR_DRINK = createHotDrinkFoodBlock("cd_creamy_corn_drink");

    public static final RegistryObject<Block> CD_CORNBREAD_STUFFING = createFoodBlock("cd_cornbread_stuffing");
    public static final RegistryObject<Block> CD_CORN_SOUP = createFoodBlock("cd_corn_soup");
    public static final RegistryObject<Block> CD_CREAMED_CORN = createFoodBlock("cd_creamed_corn");


//delightful
    public static final RegistryObject<Block> DF_MATCHA_ICE_CREAM = createFoodBlock("df_matcha_ice_cream");
    public static final RegistryObject<Block> DF_MATCHA_MILKSHAKE= createDrinkFoodBlock("df_matcha_milkshake");
    public static final RegistryObject<Block> DF_SALMONBERRY_ICE_CREAM = createFoodBlock("df_salmonberry_ice_cream");
    public static final RegistryObject<Block> DF_SALMONBERRY_MILKSHAKE = createDrinkFoodBlock("df_salmonberry_milkshake");
    public static final RegistryObject<Block> DF_MATCHA_LATTE = createHotDrinkFoodBlock("df_matcha_latte");
    public static final RegistryObject<Block> DF_ENDER_NECTAR = createHotDrinkFoodBlock("df_ender_nectar");
    public static final RegistryObject<Block> DF_BERRY_MATCHA_LATTE = createDrinkFoodBlock("df_berry_matcha_latte");
    public static final RegistryObject<Block> DF_CACTUS_CHILI = createFoodBlock("df_cactus_chili");
    public static final RegistryObject<Block> DF_FIELD_SALAD = createFoodBlock("df_field_salad");
    public static final RegistryObject<Block> DF_STUFFED_CANTALOUPE = createFoodBlock("df_stuffed_cantaloupe");
    public static final RegistryObject<Block> DF_SINIGANG = createFoodBlock("df_sinigang");
    public static final RegistryObject<Block> DF_CACTUS_SOUP = createFoodBlock("df_cactus_soup");

    //pineapple delight
    public static final RegistryObject<Block> PD_PINEAPPLE_FRIED_RICE = createFoodBlock("pd_pineapple_fried_rice");
    public static final RegistryObject<Block> PD_PINEAPPLE_ICE_CREAM = createDrinkFoodBlock("pd_pineapple_ice_cream");
    public static final RegistryObject<Block> PD_PINEAPPLE_MILK_SHAKE = createDrinkFoodBlock("pd_pineapple_milk_shake");
    public static final RegistryObject<Block> PD_PINEAPPLE_JUICE = createDrinkFoodBlock("pd_pineapple_juice");

    //ocean delight
    public static final RegistryObject<Block> OD_BOWL_OF_GUARDIAN_SOUP = createFoodBlock("od_bowl_of_guardian_soup");
    public static final RegistryObject<Block> OD_BRAISED_SEA_PICKLE = createFoodBlock("od_braised_sea_pickle");
    public static final RegistryObject<Block> OD_SEAGRASS_SALAD = createFoodBlock("od_seagrass_salad");
    public static final RegistryObject<Block> OD_SQUID_RINGS = createFoodBlock("od_squid_rings");

    //alex delight
    public static final RegistryObject<Block> AD_MAGGOT_SALAD = createFoodBlock("ad_maggot_salad");
    public static final RegistryObject<Block> AD_KANGAROO_STEW = createFoodBlock("ad_kangaroo_stew");
    public static final RegistryObject<Block> AD_ACACIA_BLOSSOM_SOUP = createFoodBlock("ad_acacia_blossom_soup");
    public static final RegistryObject<Block> AD_LOBSTER_PASTA = createWideFoodBlock("ad_lobster_pasta");
    public static final RegistryObject<Block> AD_KANGAROO_PASTA = createWideFoodBlock("ad_kangaroo_pasta");

    //cultural delight
    public static final RegistryObject<Block> CTD_HEARTY_SALAD = createFoodBlock("ctd_hearty_salad");
    public static final RegistryObject<Block> CTD_CREAMED_CORN = createFoodBlock("ctd_creamed_corn");
    public static final RegistryObject<Block> CTD_SPICY_CURRY = createFoodBlock("ctd_spicy_curry");
    public static final RegistryObject<Block> CTD_FRIED_EGGPLANT_PASTA = createWideFoodBlock("ctd_fried_eggplant_pasta");

    //large meals
    public static final RegistryObject<Block> LM_PUFFERFISH_BROTH = createFoodBlock("lm_pufferfish_broth");
    public static final RegistryObject<Block> LM_POTATO_SOUP = createFoodBlock("lm_potato_soup");
    public static final RegistryObject<Block> LM_RED_SOUP = createFoodBlock("lm_red_soup");
    public static final RegistryObject<Block> LM_TOMATO_EGG_SOUP = createFoodBlock("lm_tomato_egg_soup");
    public static final RegistryObject<Block> LM_COD_DELUXE= createWideFoodBlock("lm_cod_deluxe");
    public static final RegistryObject<Block> LM_HEARTY_LUNCH = createWideFoodBlock("lm_hearty_lunch");
    public static final RegistryObject<Block> LM_CHICKEN_CURRY = createWideFoodBlock("lm_chicken_curry");
    public static final RegistryObject<Block> LM_PASTA_WITH_MUSHROOM_SAUCE = createWideFoodBlock("lm_pasta_with_mushroom_sauce");
    public static final RegistryObject<Block> LM_OMURICE = createFoodBlock("lm_omurice");
    public static final RegistryObject<Block> LM_MUSHROOM_POT_PIE = createFoodBlock("lm_mushroom_pot_pie");
    public static final RegistryObject<Block> LM_ROASTED_MUTTOH_RACK = createFoodBlock("lm_roasted_mutton_rack");
    public static final RegistryObject<Block> LM_SWEET_BERRY_CUSTARD = createDrinkFoodBlock("lm_sweet_berry_custard");
    public static final RegistryObject<Block> LM_RICE_PUDDING = createFoodBlock("lm_rice_pudding");

    //festive delight
    public static final RegistryObject<Block> FD_FESTIVE_CHICKEN = createFoodBlock("fd_festive_chicken");
    public static final RegistryObject<Block> FD_CHRISTMAS_TEA = createHotDrinkFoodBlock("fd_christmas_tea");
    public static final RegistryObject<Block> FD_SALMON_VERRINES = createDrinkFoodBlock("fd_salmon_verrines");


    public static final RegistryObject<Block> BNC_FIERY_FONDUE = createFoodBlock("bnc_fiery_fondue");
    public static final RegistryObject<Block> BNC_SCARLET_PIEROGI = createWideFoodBlock("bnc_scarlet_pierogi");
    public static final RegistryObject<Block> BNC_HORROR_LASAGNA = createWideFoodBlock("bnc_horror_lasagna");
    public static final RegistryObject<Block> BNC_CHEESY_PASTA = createWideFoodBlock("bnc_cheesy_pasta");
    public static final RegistryObject<Block> BNC_CREAMY_ONION_SOUP = createFoodBlock("bnc_creamy_onion_soup");
    public static final RegistryObject<Block> BNC_VEGETABLE_OMELET = createFoodBlock("bnc_vegetable_omelet");

    public static final RegistryObject<Block> ED_CRANBERRY_JUICE = createDrinkFoodBlock("ed_cranberry_juice");
    public static final RegistryObject<Block> ED_CRANBERRY_CHICKEN = createWideFoodBlock("ed_cranberry_chicken");
    public static final RegistryObject<Block> ED_ASPARAGUS_MUSHROOM_PASTA = createWideFoodBlock("ed_asparagus_mushroom_pasta");
    public static final RegistryObject<Block> ED_SWEET_POTATO_CASSEROLE = createWideFoodBlock("ed_sweet_potato_casserole");

    public static final RegistryObject<Block> CTD_POACHED_EGGPLANTS = createFoodBlock("ctd_poached_eggplants");
    public static final RegistryObject<Block> CTD_EGGPLANT_PARMESAN = createFoodBlock("ctd_eggplant_parmesan");

    public static final RegistryObject<Block> ACD_POOR_FISHER_CHOWDER = createFoodBlock("acd_poor_fisher_chowder");
    public static final RegistryObject<Block> ACD_JELLYFISH_JELLY = createFoodBlock("acd_jellyfish_jelly");
    public static final RegistryObject<Block> ACD_UNUSUAL_FISH_SOUP = createFoodBlock("acd_unusual_fish_soup");
    public static final RegistryObject<Block> ACD_BASS_STEW = createFoodBlock("acd_bass_stew");
    public static final RegistryObject<Block> ACD_FISH_CHORBA = createFoodBlock("acd_fish_chorba");
    public static final RegistryObject<Block> ACD_FISH_AND_CHIPS = createFoodBlock("acd_fish_and_chips");
    public static final RegistryObject<Block> ACD_HALASZLE = createFoodBlock("acd_halaszle");
    public static final RegistryObject<Block> ACD_CRISPY_NORI_KELP = createFoodBlock("acd_crispy_nori_kelp");
    public static final RegistryObject<Block> ACD_BAKED_POLLOCK_WITH_CARROTS = createWideFoodBlock("acd_baked_pollock_with_carrots");
    public static final RegistryObject<Block> ACD_LARGE_FISH_WITH_VEGETABLES = createWideFoodBlock("acd_large_fish_with_vegetables");
    public static final RegistryObject<Block> ACD_ROLLMOPS = createWideFoodBlock("acd_rollmops");
    public static final RegistryObject<Block> ACD_TUNA_SPAGHETTI = createWideFoodBlock("acd_tuna_spaghetti");
    public static final RegistryObject<Block> ACD_HALIBUT_WITH_TARTAR_SAUCE = createWideFoodBlock("acd_halibut_with_tartar_sauce");
    public static final RegistryObject<Block> ACD_BUCKLING = createWideFoodBlock("acd_buckling");
    public static final RegistryObject<Block> ACD_TURTLE_MEAT_DISH = createWideFoodBlock("acd_turtle_meat_dish");

    public static final RegistryObject<Block> ERD_CHORUS_JUICE = createDrinkFoodBlock("erd_chorus_juice");
    public static final RegistryObject<Block> ERD_AMBERVEIL_STEW = createFoodBlock("erd_amberveil_stew");
    public static final RegistryObject<Block> ERD_AMBERVEILED_CURRY = createFoodBlock("erd_amberveiled_curry");
    public static final RegistryObject<Block> ERD_CHORUS_STEW = createFoodBlock("erd_chorus_stew");
    public static final RegistryObject<Block> ERD_TWISTED_CEREAL = createFoodBlock("erd_twisted_cereal");
    public static final RegistryObject<Block> ERD_ENDERMITE_STEW = createFoodBlock("erd_endermite_stew");
    public static final RegistryObject<Block> ERD_ENDER_PAELLA = createWideFoodBlock("erd_ender_paella");
    public static final RegistryObject<Block> ERD_CHICKEN_CURRY = createWideFoodBlock("erd_chicken_curry");
    public static final RegistryObject<Block> ERD_STEAK_FRIES = createWideFoodBlock("erd_steak_fries");
    public static final RegistryObject<Block> ERD_VEIL_OF_FLAMES_RISOTTO = createWideFoodBlock("erd_veil_of_flames_risotto");
    public static final RegistryObject<Block> ERD_PEARL_PASTA = createWideFoodBlock("erd_pearl_pasta");
    public static final RegistryObject<Block> ERD_STUFFED_SHULKER_BOWL = createFoodBlock("erd_stuffed_shulker_bowl");

    public static final RegistryObject<Block> EDD_DRAGON_BREATH_AND_CHORUS_SOUP = createFoodBlock("edd_dragon_breath_and_chorus_soup");
    public static final RegistryObject<Block> EDD_SHULKER_SOUP = createFoodBlock("edd_shulker_soup");
    public static final RegistryObject<Block> EDD_ENDER_NOODLE = createFoodBlock("edd_ender_noodle");
    public static final RegistryObject<Block> EDD_ENDERMAN_GRISTLE_STEW = createFoodBlock("edd_enderman_gristle_stew");
    public static final RegistryObject<Block> EDD_STIR_FRIED_SHULKER_MEAT = createWideFoodBlock("edd_stir_fried_shulker_meat");
    public static final RegistryObject<Block> EDD_ROASTED_DRAGON_STEAK = createWideFoodBlock("edd_roasted_dragon_steak");
    public static final RegistryObject<Block> EDD_END_MIXED_SALAD = createFoodBlock("edd_end_mixed_salad");
    public static final RegistryObject<Block> EDD_ASSORTED_SALAD = createFoodBlock("edd_assorted_salad");
    public static final RegistryObject<Block> EDD_ENDER_CONGEE = createFoodBlock("edd_ender_congee");
    public static final RegistryObject<Block> EDD_CHORUS_FRUIT_MILK_TEA = createHotDrinkFoodBlock("edd_chorus_fruit_milk_tea");
    public static final RegistryObject<Block> EDD_CHORUS_FRUIT_WINE = createDrinkFoodBlock("edd_chorus_fruit_wine");
    public static final RegistryObject<Block> EDD_BUBBLE_TEA = createHotDrinkFoodBlock("edd_bubble_tea");
    public static final RegistryObject<Block> EDD_DRAGON_BREATH_SODA = createDrinkFoodBlock("edd_dragon_breath_soda");
    public static final RegistryObject<Block> EDD_CHORUS_FLOWER_TEA = createHotDrinkFoodBlock("edd_chorus_flower_tea");
    public static final RegistryObject<Block> EDD_GRILLED_SHULKER = createFoodBlock("edd_grilled_shulker");
    public static final RegistryObject<Block> EDD_DRAGON_MEAT_STEW = createFoodBlock("edd_dragon_meat_stew");
    public static final RegistryObject<Block> EDD_STEAMED_DRAGON_EGG = createFoodBlock("edd_steamed_dragon_egg");
    public static final RegistryObject<Block> EDD_DRAGON_LEG_WITH_SAUCE = createFoodBlock("edd_dragon_leg_with_sauce");

    public static final RegistryObject<Block> MND_SIZZLING_PUDDING = createFoodBlock("mnd_sizzling_pudding");
    public static final RegistryObject<Block> MND_ROCK_SOUP = createFieryFoodBlock("mnd_rock_soup");
    public static final RegistryObject<Block> MND_SPICY_NOODLE_SOUP = createFieryFoodBlock("mnd_spicy_noodle_soup");
    public static final RegistryObject<Block> MND_STRIDER_STEW = createFoodBlock("mnd_strider_stew");
    public static final RegistryObject<Block> MND_GHAST_SALAD = createFoodBlock("mnd_ghast_salad");
    public static final RegistryObject<Block> MND_DRIED_GHAST_WITH_MILK = createFoodBlock("mnd_dried_ghast_with_milk");
    public static final RegistryObject<Block> MND_SAUSAGE_AND_POTATOES = createFoodBlock("mnd_sausage_and_potatoes");
    public static final RegistryObject<Block> MND_SPICY_HOGLIN_STEW = createFieryFoodBlock("mnd_spicy_hoglin_stew");
    public static final RegistryObject<Block> MND_EGG_SOUP = createFoodBlock("mnd_egg_soup");
    public static final RegistryObject<Block> MND_BREAKFAST_SAMPLER = createWideFoodBlock("mnd_breakfast_sampler");
    public static final RegistryObject<Block> MND_FRIED_HOGLIN_CHOP = createWideFoodBlock("mnd_fried_hoglin_chop");
    public static final RegistryObject<Block> MND_TWISTED_GHASTA = createWideFoodBlock("mnd_twisted_ghasta");
    public static final RegistryObject<Block> MND_STRIDER_WITH_GRILLED_FUNGUS = createWideFoodBlock("mnd_strider_with_grilled_fungus");
    public static final RegistryObject<Block> MND_SCOTCH_EGGS = createWideFoodBlock("mnd_scotch_eggs");
    public static final RegistryObject<Block> MND_GIANT_TAKOYAKI = createWideFoodBlock("mnd_giant_takoyaki");
    public static final RegistryObject<Block> MND_BLUE_TENDERLOIN_STEAK = createWideFoodBlock("mnd_blue_tenderloin_steak");
    public static final RegistryObject<Block> MND_CRIMSON_STROGANOFF = createWideFoodBlock("mnd_crimson_stroganoff");
    public static final RegistryObject<Block> MND_SPICY_CURRY = createFieryWideFoodBlock("mnd_spicy_curry");
    public static final RegistryObject<Block> MND_BLEEDING_TARTAR = createWideFoodBlock("mnd_bleeding_tartar");
    public static final RegistryObject<Block> MND_HOT_WINGS = createFieryWideFoodBlock("mnd_hot_wings");

    public static final RegistryObject<Block> MND_PLATE_OF_GHASTA_WITH_CREAM = createFoodBlock("mnd_plate_of_ghasta_with_cream");
    public static final RegistryObject<Block> MND_PLATE_OF_STUFFED_HOGLIN_SNOUT = createFoodBlock("mnd_plate_of_stuffed_hoglin_snout");
    public static final RegistryObject<Block> MND_PLATE_OF_STUFFED_HOGLIN_HAM = createFoodBlock("mnd_plate_of_stuffed_hoglin_ham");
    public static final RegistryObject<Block> MND_PLATE_OF_STUFFED_HOGLIN = createFoodBlock("mnd_plate_of_stuffed_hoglin");
    public static final RegistryObject<Block> MND_PLATE_OF_COLD_STRIDERLOAF = createFoodBlock("mnd_plate_of_cold_striderloaf");
    public static final RegistryObject<Block> MND_PLATE_OF_STRIDERLOAF = createFoodBlock("mnd_plate_of_striderloaf");

    public static final RegistryObject<Block> CRD_KELP_SHAKE = createDrinkFoodBlock("crd_kelp_shake");
    public static final RegistryObject<Block> CRD_COCONUT_PUDDING = createDrinkFoodBlock("crd_coconut_pudding");
    public static final RegistryObject<Block> CRD_COOCNUT_MILK = createDrinkFoodBlock("crd_coconut_milk");

    public static final RegistryObject<Block> CRD_CLAM_BAKE = createWideFoodBlock("crd_clam_bake");
    public static final RegistryObject<Block> CRD_SURF_AND_TURF = createWideFoodBlock("crd_surf_and_turf");

    public static final RegistryObject<Block> CRD_SEAFOOD_GUMBO = createFoodBlock("crd_seafood_gumbo");
    public static final RegistryObject<Block> CRD_SHRIMP_FRIED_RICE = createFoodBlock("crd_shrimp_fried_rice");
    public static final RegistryObject<Block> CRD_CORAL_CRUNCH = createFoodBlock("crd_coral_crunch");
    public static final RegistryObject<Block> CRD_CLAM_CHOWDER = createFoodBlock("crd_clam_chowder");
    public static final RegistryObject<Block> CRD_BISQUE = createFoodBlock("crd_bisque");

    public static final RegistryObject<Block> ND_PLATE_OF_STUFFED_HOGLIN_SNOUT = createFoodBlock("nd_plate_of_stuffed_hoglin_snout");
    public static final RegistryObject<Block> ND_PLATE_OF_STUFFED_HOGLIN_HAM = createFoodBlock("nd_plate_of_stuffed_hoglin_ham");
    public static final RegistryObject<Block> ND_PLATE_OF_STUFFED_HOGLIN_ROAST = createFoodBlock("nd_plate_of_stuffed_hoglin_roast");
    public static final RegistryObject<Block> ND_STRIDER_MOSS_STEW = createFoodBlock("nd_strider_moss_stew");
    public static final RegistryObject<Block> ND_WARPED_MOLDY_MEAT = createWideFoodBlock("nd_warped_moldy_meat");
    public static final RegistryObject<Block> ND_GRILLED_STRIDER = createWideFoodBlock("nd_grilled_strider");


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
    private static RegistryObject<Block> createFieryWideFoodBlock(String name){


        RegistryObject<Block> block=  REGISTRY.register(name,
                ()->new FieryWideFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(block);
        return  block;
    }
    private static RegistryObject<Block> createFieryFoodBlock(String name){
        RegistryObject<Block> block=  REGISTRY.register(name,
                ()->new FieryFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(block);
        return  block;
    }
}
