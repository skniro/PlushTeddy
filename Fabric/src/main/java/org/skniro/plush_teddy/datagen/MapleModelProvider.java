package org.skniro.plush_teddy.datagen;

import org.skniro.plush_teddy.block.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class MapleModelProvider extends FabricModelProvider {
    public MapleModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){

        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
