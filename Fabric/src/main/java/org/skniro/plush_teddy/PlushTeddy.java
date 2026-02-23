package org.skniro.plush_teddy;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import org.skniro.plush_teddy.block.MapleFurnitureBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlushTeddy implements ModInitializer {
    public static final String MOD_ID = "plush_teddy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ModContainer MOD_CONTAINER = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow();

    public static final ResourceKey<CreativeModeTab> Maple_Group_Furniture = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "plush_teddy"));
    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Maple_Group_Furniture, FabricCreativeModeTab.builder()
                .icon(() -> new ItemStack(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL))
                .title(Component.translatable("itemGroup.plush_teddy.maple_group_furniture"))
                .build());
        FurnitureContent.registerItem();
        FurnitureContent.registerBlock();
        FurnitureContent.CreativeTab();
    }

    public static Identifier asResource(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

}
