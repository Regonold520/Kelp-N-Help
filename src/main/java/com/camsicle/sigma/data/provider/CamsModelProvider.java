package com.camsicle.sigma.data.provider;

import com.camsicle.sigma.init.BlockInit;
import com.camsicle.sigma.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CamsModelProvider extends FabricModelProvider {
    public CamsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.KELPITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.HONNI_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.COMPRESSED_KELP, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MEGA_COMPRESSED_KELP, Models.GENERATED);

        itemModelGenerator.register(ItemInit.KELPITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ItemInit.KELPITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.KELPITE_SHARD, Models.GENERATED);

        itemModelGenerator.register(ItemInit.HONNI_INGOT, Models.GENERATED);

        itemModelGenerator.register(ItemInit.KELPITE_SWORD ,Models.HANDHELD);
        itemModelGenerator.register(ItemInit.KELPITE_PICKAXE ,Models.HANDHELD);
        itemModelGenerator.register(ItemInit.KELPITE_AXE ,Models.HANDHELD);
        itemModelGenerator.register(ItemInit.KELPITE_HOE ,Models.HANDHELD);
        itemModelGenerator.register(ItemInit.KELPITE_SHOVEL ,Models.HANDHELD);

        itemModelGenerator.register(ItemInit.KELPITE_UPGRADE_TRIM ,Models.GENERATED);
    }
}
