package org.skniro.plush_teddy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class MapleBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public MapleBlockTagGeneration(FabricDataOutput dataGenerator,CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

    }
}
