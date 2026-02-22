package org.skniro.plush_teddy.item;

import org.skniro.plush_teddy.PlushTeddy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.skniro.plush_teddy.block.*;

import java.util.function.Supplier;

public class FurnitureCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlushTeddy.MOD_ID);

    public static final Supplier<CreativeModeTab> Maple_Group_Furniture = CREATIVE_MODE_TABS.register("maple_group_furniture",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL.get()))
                    .title(Component.translatable("itemGroup.plush_teddy.maple_group_furniture"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(MapleFurnitureBlocks.TEDDY_BEAR_NORMAL.get());
                    })
                    .build());

    public static void registerMapleCreativeModeTabs(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
