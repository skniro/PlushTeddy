package org.skniro.plush_teddy;


import org.skniro.plush_teddy.block.*;
import org.skniro.plush_teddy.item.FurnitureCreativeModeTabs;
import org.skniro.plush_teddy.item.FurnitureItems;
import net.neoforged.bus.api.IEventBus;


public class FurnitureContent {


    public static void registerItem(IEventBus modEventBus){
        FurnitureItems.registerModItems(modEventBus);
    }
    public static void registerBlock(IEventBus modEventBus){
        MapleFurnitureBlocks.registerCushionBlocks(modEventBus);
    }

    public static void CreativeTab(IEventBus modEventBus) {
        FurnitureCreativeModeTabs.registerMapleCreativeModeTabs(modEventBus);
    }

}

