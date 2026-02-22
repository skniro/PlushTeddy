package org.skniro.plush_teddy.block;

import org.skniro.plush_teddy.PlushTeddy;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.skniro.plush_teddy.block.init.*;

import java.util.function.Function;

public class MapleFurnitureBlocks {
    public static final Block TEDDY_BEAR_NORMAL = registerBlock("teddy_bear_normal", BaseTeddyBearBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).nonOpaque().noCollision().strength(1.0F).burnable());

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PlushTeddy.MOD_ID, name)),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PlushTeddy.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PlushTeddy.MOD_ID, name));
    }

    public static void registerCushionBlocks() {
        PlushTeddy.LOGGER.debug("Registering Cushion Blocks for " + PlushTeddy.MOD_ID);
    }
}
