package org.skniro.plush_teddy;


import org.skniro.plush_teddy.block.*;
import org.skniro.plush_teddy.item.MapleItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class FurnitureContent {


    public static void registerItem(){
        MapleItems.registerModItems();
    }
    public static void registerBlock(){
        MapleFurnitureBlocks.registerCushionBlocks();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(PlushTeddy.Maple_Group_Furniture).register(content -> {

            content.add(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL);
        });

    }

}

