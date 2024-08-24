package com.camsicle.sigma.data.provider;

import com.camsicle.sigma.init.BlockInit;
import com.camsicle.sigma.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CamsBlockLootTableProvider extends FabricBlockLootTableProvider {
    public CamsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.KELPITE_ORE, ItemInit.KELPITE_SHARD);

        addDrop(BlockInit.HONNI_BLOCK, BlockInit.HONNI_BLOCK);
    }

}
