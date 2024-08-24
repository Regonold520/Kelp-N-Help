package com.camsicle.sigma;

import com.camsicle.sigma.init.BlockInit;
import com.camsicle.sigma.init.ItemGroupInit;
import com.camsicle.sigma.init.ItemInit;
import com.camsicle.sigma.init.worldgen.BiomeModInit;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class  CamsSigmaMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("cams-sigma-mod");
	public static final String MOD_ID = "cams-sigma-mod";

	@Override
	public void onInitialize() {
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		BiomeModInit.load();

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.DRIED_KELP_BLOCK)
				.destDimID(Identifier.of("cams-sigma-mod:custom_dimension"))
				.tintColor(0 , 153, 51)
				.registerPortal();


		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}