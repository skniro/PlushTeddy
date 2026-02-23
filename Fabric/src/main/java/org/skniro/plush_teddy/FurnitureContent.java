package org.skniro.plush_teddy;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import org.skniro.plush_teddy.block.*;
import org.skniro.plush_teddy.item.MapleItems;


public class FurnitureContent {


    public static void registerItem(){
        MapleItems.registerModItems();
    }
    public static void registerBlock(){
        MapleFurnitureBlocks.registerCushionBlocks();
    }

    public static void CreativeTab() {
        CreativeModeTabEvents.modifyOutputEvent(PlushTeddy.Maple_Group_Furniture).register(content -> {

            content.accept(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL);
        });

    }

}

