package org.skniro.plush_teddy;


import org.skniro.plush_teddy.block.*;
import org.skniro.plush_teddy.item.FurnitureCreativeModeTabs;
import org.skniro.plush_teddy.item.FurnitureItems;
import net.minecraftforge.eventbus.api.bus.BusGroup;


public class FurnitureContent {


    public static void registerItem(BusGroup modEventBus){
        FurnitureItems.registerModItems(modEventBus);
    }
    public static void registerBlock(BusGroup modEventBus){
        MapleFurnitureBlocks.registerCushionBlocks(modEventBus);
    }

    public static void CreativeTab(BusGroup modEventBus) {
        FurnitureCreativeModeTabs.registerMapleCreativeModeTabs(modEventBus);
    }
}

