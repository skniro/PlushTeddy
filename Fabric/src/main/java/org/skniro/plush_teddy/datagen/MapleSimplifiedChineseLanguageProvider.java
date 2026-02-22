package org.skniro.plush_teddy.datagen;

import org.skniro.plush_teddy.PlushTeddy;
import org.skniro.plush_teddy.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MapleSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public MapleSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(PlushTeddy.Maple_Group_Furniture,"毛绒玩具熊");

        translationBuilder.add(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL, "毛绒玩具熊");

    }
}
