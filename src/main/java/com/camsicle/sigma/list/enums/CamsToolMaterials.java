package com.camsicle.sigma.list.enums;

import com.camsicle.sigma.init.ItemInit;
import com.camsicle.sigma.list.TagList;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public enum CamsToolMaterials implements ToolMaterial {

    KELP_TOOLS(
            3000,
            12.0f,
            5.0f,
            TagList.Blocks.INCORRECT_FOR_KELPITE_TOOL,
            15,
            Ingredient.ofItems(ItemInit.COMPRESSED_KELP)
    );

    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    CamsToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
