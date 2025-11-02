package com.jkvin114.displaydelight;
import com.jkvin114.displaydelight.init.*;


import com.jkvin114.displaydelight.init.compat.ExpandedDelightDisplayBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DisplayDelight.MODID)
public class DisplayDelight
{


    // Define mod id in a common place for everything to reference
    public static final String MODID = "displaydelight";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public DisplayDelight() throws Exception {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
/*
        if(ModList.get().isLoaded("displaydelight_lite")){
            throw new RuntimeException("Mod displaydelight_lite is not compatiable with displaydelight");
        }
*/
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        DisplayItems.REGISTRY.register(modEventBus);
        DisplayBlocks.REGISTRY.register(modEventBus);
        PlatedBlocks.REGISTRY.register(modEventBus);
        SmallPlatedBlocks.REGISTRY.register(modEventBus);
        DisplayTabs.CREATIVE_TABS.register(modEventBus);
     //   ExpandedDelightDisplayBlocks.load();



        //
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DisplayConfig.CONFIG, "displaydelight-common.toml");


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
