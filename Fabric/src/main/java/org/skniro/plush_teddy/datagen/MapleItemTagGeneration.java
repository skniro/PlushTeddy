package org.skniro.plush_teddy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import java.util.concurrent.CompletableFuture;


public class MapleItemTagGeneration extends FabricTagsProvider<Item> {
    public MapleItemTagGeneration(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, Registries.ITEM, completableFuture);
    }

    public static class ModItemTags {
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

    }


}
