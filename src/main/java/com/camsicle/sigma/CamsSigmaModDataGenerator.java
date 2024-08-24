package com.camsicle.sigma;

import com.camsicle.sigma.data.generator.CamsWorldGenerator;
import com.camsicle.sigma.data.provider.*;
import com.camsicle.sigma.init.worldgen.ConfiguredFeatureInit;
import com.camsicle.sigma.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

import java.util.ConcurrentModificationException;

public class CamsSigmaModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(CamsModelProvider::new);
		pack.addProvider(CamsEnLangProvider::new);
		pack.addProvider(CamsBlockLootTableProvider::new);
		pack.addProvider(CamsBlockTagProvider::new);
		pack.addProvider(CamsWorldGenerator::new);
		pack.addProvider(CamsRecipeProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}


}
