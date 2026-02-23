package org.skniro.plush_teddy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import org.skniro.plush_teddy.PlushTeddy;
import org.skniro.plush_teddy.block.*;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


import java.util.concurrent.CompletableFuture;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataGenerator,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(PlushTeddy.Maple_Group_Furniture,"Plush Teddy");

        translationBuilder.add(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL, "Teddy Bear");
    }
}
