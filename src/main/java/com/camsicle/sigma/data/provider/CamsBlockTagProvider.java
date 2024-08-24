package com.camsicle.sigma.data.provider;

import com.camsicle.sigma.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CamsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public CamsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.KELPITE_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.KELPITE_ORE);
    }
}
