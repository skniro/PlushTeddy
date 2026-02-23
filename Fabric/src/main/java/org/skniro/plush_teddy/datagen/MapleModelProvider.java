package org.skniro.plush_teddy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import org.skniro.plush_teddy.block.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;


public class MapleModelProvider extends FabricModelProvider {


    public MapleModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
