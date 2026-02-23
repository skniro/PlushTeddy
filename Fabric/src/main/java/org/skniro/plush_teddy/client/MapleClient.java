package org.skniro.plush_teddy.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

@Environment(EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ChunkSectionLayer renderLayer2 = ChunkSectionLayer.SOLID;


        ChunkSectionLayer renderLayer3 = ChunkSectionLayer.CUTOUT;

        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;

    }
}
