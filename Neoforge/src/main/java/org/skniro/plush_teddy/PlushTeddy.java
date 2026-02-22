package org.skniro.plush_teddy;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PlushTeddy.MOD_ID)
public class PlushTeddy {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "plush_teddy";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public PlushTeddy(IEventBus modEventBus) {
        FurnitureContent.registerItem(modEventBus);
        FurnitureContent.registerBlock(modEventBus);
        FurnitureContent.CreativeTab(modEventBus);

        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
