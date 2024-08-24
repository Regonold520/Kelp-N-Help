package com.camsicle.sigma.list;

import com.camsicle.sigma.CamsSigmaMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_KELPITE_TOOL =  TagKey.of(RegistryKeys.BLOCK, CamsSigmaMod.id("incorrect_for_kelpite_tool"));
    }
}
