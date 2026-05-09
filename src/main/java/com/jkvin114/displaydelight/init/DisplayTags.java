package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DisplayTags {
    public static final TagKey<Item> PLATE_DISPLAYABLE = ItemTags.create(new ResourceLocation(DisplayDelight.MODID, "plate_displayable"));
    public static final TagKey<Item> SMALL_PLATE_DISPLAYABLE = ItemTags.create(new ResourceLocation(DisplayDelight.MODID, "small_plate_displayable"));

    public static final TagKey<Item> DISPLAYABLE = ItemTags.create(new ResourceLocation(DisplayDelight.MODID, "displayable"));

    public static final TagKey<Block> SUPPORT_EXCEPTIONS = BlockTags.create(new ResourceLocation(DisplayDelight.MODID, "support_exceptions"));


}