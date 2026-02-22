package org.skniro.plush_teddy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.*;


import java.util.concurrent.CompletableFuture;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, RegistryKeys.ITEM, completableFuture);
    }

    public static class ModItemTags {
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

    }


}
