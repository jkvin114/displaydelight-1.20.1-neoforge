package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DisplayTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisplayDelight.MODID);

    public static final RegistryObject<CreativeModeTab> TAB_FARMERS_DELIGHT = CREATIVE_TABS.register(DisplayDelight.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Display Delight"))
                    .icon(() -> new ItemStack(DisplayItems.GRILLED_SALMON.get()))
                    .displayItems((parameters, output) -> {

                        output.accept(DisplayItems.PLATE.get());
                        output.accept(DisplayItems.SMALL_PLATE.get());
                        DisplayItems.GetAll().forEach(output::accept);
                    })
                    .build());
}
