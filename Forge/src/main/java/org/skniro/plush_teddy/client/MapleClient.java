package org.skniro.plush_teddy.client;

import org.skniro.plush_teddy.PlushTeddy;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = PlushTeddy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MapleClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        ChunkSectionLayer renderLayer2 = ChunkSectionLayer.TRIPWIRE;

        ChunkSectionLayer renderLayer3 = ChunkSectionLayer.CUTOUT;

        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
    }

}
