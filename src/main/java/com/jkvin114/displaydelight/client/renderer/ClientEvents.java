package com.jkvin114.displaydelight.client.renderer;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.client.renderer.block.BlockModelShaper;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.Map;


@Mod.EventBusSubscriber(modid = DisplayDelight.MODID,value = Dist.CLIENT ,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    public static void init(final FMLClientSetupEvent event) {
    }
    @SubscribeEvent
    public static void modifyBakingResult(ModelEvent.ModifyBakingResult event) {
        //Map<ResourceLocation, BakedModel> models = event.getModels();
        DisplayDelight.LOGGER.info("modifyBakingResult ");
        Map<ResourceLocation, BakedModel> models = event.getModels();

        models.replaceAll((loc, model) -> {
            if (loc.getNamespace().equals(DisplayDelight.MODID))  {
                //  DisplayDelight.LOGGER.info("path: "+loc.id().getPath());

                return new PlateHidingBakedModel(model);
            }
            return model;
        });
        }
}
