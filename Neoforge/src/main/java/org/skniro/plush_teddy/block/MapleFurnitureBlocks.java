package org.skniro.plush_teddy.block;

import org.skniro.plush_teddy.PlushTeddy;
import org.skniro.plush_teddy.block.init.*;
import org.skniro.plush_teddy.item.FurnitureItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class MapleFurnitureBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, PlushTeddy.MOD_ID);

    public static final Supplier<Block> TEDDY_BEAR_NORMAL = registerBlock("teddy_bear_normal", BaseTeddyBearBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).noOcclusion().noCollision().strength(1.0F).ignitedByLava());

    private static ToIntFunction<BlockState> litBlockEmission(int p_50760_) {
        return (p_50763_) -> {
            return (Boolean)p_50763_.getValue(BlockStateProperties.LIT) ? p_50760_ : 0;
        };
    }

    public static <B extends Block> Supplier<Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PlushTeddy.MOD_ID, name))));
        });
    }

    private static <B extends Block> Supplier<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        Supplier<Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PlushTeddy.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> Supplier<Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        Supplier<Block> bSupplier = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bSupplier);
        return bSupplier;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block) {
        return FurnitureItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PlushTeddy.MOD_ID, name)))));
    }

    public static void registerCushionBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
