package com.camsicle.sigma.init;

import com.camsicle.sigma.CamsSigmaMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockInit {
    public static final Block KELPITE_ORE = registerWithItem("kelpite_ore", new Block(Settings.copy(Blocks.IRON_ORE)));
    public static final Block HONNI_BLOCK = registerWithItem("honni_block", new Block(Settings.copy(Blocks.IRON_BLOCK)));


    public static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, CamsSigmaMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = registerBlock(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {}
}
