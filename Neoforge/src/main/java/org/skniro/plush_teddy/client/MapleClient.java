package org.skniro.plush_teddy.client;

import org.skniro.plush_teddy.PlushTeddy;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = PlushTeddy.MOD_ID, value = Dist.CLIENT)
public class MapleClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ChunkSectionLayer renderLayer2 = ChunkSectionLayer.TRIPWIRE;


        ChunkSectionLayer renderLayer3 = ChunkSectionLayer.CUTOUT;

        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
    }
}
