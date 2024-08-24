package com.camsicle.sigma.data.provider;

import com.camsicle.sigma.init.BlockInit;
import com.camsicle.sigma.init.ItemGroupInit;
import com.camsicle.sigma.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CamsEnLangProvider extends FabricLanguageProvider {
    public CamsEnLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder  builder, @NotNull Text text, @NotNull String value) {
        if(text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.COMPRESSED_KELP, "Compressed Kelp");
        translationBuilder.add(ItemInit.MEGA_COMPRESSED_KELP, "Mega Compressed Kelp");

        translationBuilder.add(ItemInit.KELPITE_SCRAP, "Kelpite Scrap");
        translationBuilder.add(ItemInit.KELPITE_INGOT, "Kelpite Ingot");
        translationBuilder.add(ItemInit.KELPITE_SHARD, "Kelpite Shard");

        translationBuilder.add(ItemInit.HONNI_INGOT, "Honni Ingot");

        translationBuilder.add(ItemInit.KELPITE_UPGRADE_TRIM, "Kelpite Upgrade Template");

        translationBuilder.add(ItemInit.KELPITE_SWORD, "Kelpite Sword");
        translationBuilder.add(ItemInit.KELPITE_PICKAXE, "Kelpite Pickaxe");
        translationBuilder.add(ItemInit.KELPITE_AXE, "Kelpite Axe");
        translationBuilder.add(ItemInit.KELPITE_HOE, "Kelpite Hoe");
        translationBuilder.add(ItemInit.KELPITE_SHOVEL, "Kelpite Shovel");


        translationBuilder.add(BlockInit.KELPITE_ORE, "Kelpite Ore");
        translationBuilder.add(BlockInit.HONNI_BLOCK, "Honni Block");

        addText(translationBuilder, ItemGroupInit.KELP_TITLE, "Kelp 'N Help Items");
    }
}
