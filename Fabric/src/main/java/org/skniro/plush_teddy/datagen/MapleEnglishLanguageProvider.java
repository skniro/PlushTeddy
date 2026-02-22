package org.skniro.plush_teddy.datagen;

import org.skniro.plush_teddy.PlushTeddy;
import org.skniro.plush_teddy.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(PlushTeddy.Maple_Group_Furniture,"Plush Teddy");

        translationBuilder.add(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL, "Teddy Bear");

    }
}
