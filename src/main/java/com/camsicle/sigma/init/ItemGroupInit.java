package com.camsicle.sigma.init;

import com.camsicle.sigma.CamsSigmaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text KELP_TITLE = Text.translatable("itemGroup." + CamsSigmaMod.MOD_ID + ".kelp_group");

    public static final ItemGroup KELP_GROUP = register("kelp_group", FabricItemGroup.builder()
            .displayName(KELP_TITLE)
            .icon(ItemInit.COMPRESSED_KELP::getDefaultStack)
            .entries(((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(CamsSigmaMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add)))
            .build());


    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, CamsSigmaMod.id(name), itemGroup);
    }

    public static void load() {}
}
