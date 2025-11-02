package com.jkvin114.displaydelight.init;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public  class RegisterHelper {
    public  static RegistryObject<Block> createFoodBlock(String id){
        return DisplayBlocks.createFoodBlock(id);
    }
    public  static RegistryObject<Block> createDrinkFoodBlock(String id){
        return DisplayBlocks.createDrinkFoodBlock(id);
    }
    public  static RegistryObject<Block> createWideFoodBlock(String id){
        return DisplayBlocks.createWideFoodBlock(id);
    }

    public  static RegistryObject<Block> createStackablePlatedFoodBlock(String id,int maxstacks){
        return PlatedBlocks.createStackablePlatedBlock(id,maxstacks);
    }
    public  static RegistryObject<Block> createPlatedFoodBlock(String id){
        return PlatedBlocks.createPlatedBlock(id);
    }
    public  static RegistryObject<Block> createSmallPlatedFoodBlock(String id){
        return SmallPlatedBlocks.createPlatedBlock(id);
    }
}
