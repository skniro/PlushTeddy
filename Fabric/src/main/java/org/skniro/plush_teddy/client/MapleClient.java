package org.skniro.plush_teddy.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.BlockRenderLayer;

@Environment(EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayer renderLayer2 = BlockRenderLayer.TRIPWIRE;

        BlockRenderLayer renderLayer3 = BlockRenderLayer.CUTOUT;

        BlockRenderLayer renderLayer4 = BlockRenderLayer.TRANSLUCENT;

    }
}
