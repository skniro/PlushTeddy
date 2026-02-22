package org.skniro.plush_teddy.datagen;

import org.skniro.plush_teddy.PlushTeddy;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MapleWorldGenerator extends FabricDynamicRegistryProvider {
    public MapleWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        entries.addAll(registries.getOrThrow(RegistryKeys.CONFIGURED_FEATURE));
        entries.addAll(registries.getOrThrow(RegistryKeys.PLACED_FEATURE));
        entries.addAll(registries.getOrThrow(RegistryKeys.BIOME));
    }

    @Override
    public String getName() {
        return PlushTeddy.MOD_ID;
    }
}