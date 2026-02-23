package org.skniro.plush_teddy.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import org.skniro.plush_teddy.block.*;

import java.util.concurrent.CompletableFuture;


public class MapleLootTableGenerator extends FabricBlockLootSubProvider {


    protected MapleLootTableGenerator(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL);
    }

}
