package org.skniro.plush_teddy;

import org.skniro.plush_teddy.block.MapleFurnitureBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlushTeddy implements ModInitializer {
    public static final String MOD_ID = "plush_teddy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ModContainer MOD_CONTAINER = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow();

    public static final RegistryKey<ItemGroup> Maple_Group_Furniture = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "plush_teddy"));
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, Maple_Group_Furniture, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL))
                .displayName(Text.translatable("itemGroup.plush_teddy.maple_group_furniture"))
                .build());
        FurnitureContent.registerItem();
        FurnitureContent.registerBlock();
        FurnitureContent.CreativeTab();
    }

    public static Identifier asResource(String path) {
        return Identifier.of(MOD_ID, path);
    }

}
