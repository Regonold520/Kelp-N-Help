package com.camsicle.sigma.data.provider;

import com.camsicle.sigma.init.BlockInit;
import com.camsicle.sigma.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CamsRecipeProvider extends FabricRecipeProvider {
    public CamsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        genSmeltingRecipes(exporter);

        genCraftingRecipes(exporter);

        genSmithingRecipes(exporter);



    }
    public static void genCraftingRecipes(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInit.COMPRESSED_KELP)
                .input('K', Items.KELP)
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .criterion(hasItem(Items.KELP), conditionsFromItem(Items.KELP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInit.MEGA_COMPRESSED_KELP)
                .input('K', ItemInit.COMPRESSED_KELP)
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .criterion(hasItem(ItemInit.COMPRESSED_KELP), conditionsFromItem(ItemInit.COMPRESSED_KELP))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.HONNI_INGOT)
                        .input(Items.GOLD_INGOT, 1)
                        .input(Items.HONEYCOMB, 8)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.KELPITE_INGOT)
                .input(ItemInit.HONNI_INGOT, 4)
                .input(ItemInit.KELPITE_SCRAP, 4)
                .criterion(hasItem(ItemInit.KELPITE_SHARD), conditionsFromItem(ItemInit.KELPITE_SHARD))
                .offerTo(exporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlockInit.HONNI_BLOCK)
                .input(ItemInit.HONNI_INGOT, 9)
                .criterion(hasItem(ItemInit.HONNI_INGOT), conditionsFromItem(ItemInit.HONNI_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInit.KELPITE_UPGRADE_TRIM)
                .input('K', ItemInit.MEGA_COMPRESSED_KELP)
                .input('T', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("KKK")
                .pattern("KTK")
                .pattern("KKK")
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter);

    }

    public static void genSmithingRecipes(RecipeExporter exporter) {

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ItemInit.KELPITE_UPGRADE_TRIM),
                        Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ItemInit.KELPITE_INGOT),
                        RecipeCategory.MISC,
                        ItemInit.KELPITE_SWORD
                ).criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, "kelpite_sword");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ItemInit.KELPITE_UPGRADE_TRIM),
                        Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ItemInit.KELPITE_INGOT),
                        RecipeCategory.MISC,
                        ItemInit.KELPITE_PICKAXE
                ).criterion(hasItem(Items.NETHERITE_PICKAXE), conditionsFromItem(Items.NETHERITE_PICKAXE))
                .offerTo(exporter, "kelpite_pickaxe");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ItemInit.KELPITE_UPGRADE_TRIM),
                        Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ItemInit.KELPITE_INGOT),
                        RecipeCategory.MISC,
                        ItemInit.KELPITE_AXE
                ).criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, "kelpite_axe");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ItemInit.KELPITE_UPGRADE_TRIM),
                        Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ItemInit.KELPITE_INGOT),
                        RecipeCategory.MISC,
                        ItemInit.KELPITE_SHOVEL
                ).criterion(hasItem(Items.NETHERITE_SHOVEL), conditionsFromItem(Items.NETHERITE_SHOVEL))
                .offerTo(exporter, "kelpite_shovel");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ItemInit.KELPITE_UPGRADE_TRIM),
                        Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ItemInit.KELPITE_INGOT),
                        RecipeCategory.MISC,
                        ItemInit.KELPITE_HOE
                ).criterion(hasItem(Items.NETHERITE_HOE), conditionsFromItem(Items.NETHERITE_HOE))
                .offerTo(exporter, "kelpite_hoe");
    }

    public static void genSmeltingRecipes(RecipeExporter exporter) {
        List<ItemConvertible> kelpScrap = List.of(ItemInit.KELPITE_SHARD, BlockInit.KELPITE_ORE);


        offerBlasting(exporter,
                kelpScrap,
                RecipeCategory.MISC,
                ItemInit.KELPITE_SCRAP,
                0.2f,
                200,
                "kelpGroup");

        offerSmelting(exporter,
                kelpScrap,
                RecipeCategory.MISC,
                ItemInit.KELPITE_SCRAP,
                0.2f,
                400,
                "kelpGroup");
    }

}
