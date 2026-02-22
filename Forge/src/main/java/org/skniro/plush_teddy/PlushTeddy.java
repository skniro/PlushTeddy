package org.skniro.plush_teddy;

import com.mojang.logging.LogUtils;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PlushTeddy.MOD_ID)
public class PlushTeddy {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "plush_teddy";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public PlushTeddy(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();
        // Register the commonSetup method for modloading

        FurnitureContent.registerItem(modEventBus);
        FurnitureContent.registerBlock(modEventBus);
        FurnitureContent.CreativeTab(modEventBus);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
