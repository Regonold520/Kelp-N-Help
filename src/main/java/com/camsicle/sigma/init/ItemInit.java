package com.camsicle.sigma.init;

import com.camsicle.sigma.CamsSigmaMod;
import com.camsicle.sigma.list.enums.CamsToolMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {

    public static final Item COMPRESSED_KELP = register("compressed_kelp", new Item(new Item.Settings()));
    public static final Item MEGA_COMPRESSED_KELP = register("mega_compressed_kelp", new Item(new Item.Settings()));

    public static final Item KELPITE_SCRAP = register("kelpite_scrap", new Item(new Item.Settings()));
    public static final Item KELPITE_INGOT = register("kelpite_ingot", new Item(new Item.Settings()));
    public static final Item KELPITE_SHARD = register("kelpite_shard", new Item(new Item.Settings()));


    public static final Item HONNI_INGOT = register("honni_ingot", new Item(new Item.Settings()));

    public static final Item KELPITE_UPGRADE_TRIM = register("kelpite_upgrade_trim", new Item(new Item.Settings()));

    public static final SwordItem KELPITE_SWORD = register("kelpite_sword",
            new SwordItem(CamsToolMaterials.KELP_TOOLS, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(CamsToolMaterials.KELP_TOOLS, 3 , -2.4f))));

    public static final PickaxeItem KELPITE_PICKAXE = register("kelpite_pickaxe",
            new PickaxeItem(CamsToolMaterials.KELP_TOOLS, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(CamsToolMaterials.KELP_TOOLS, 3 , -2.4f))));

    public static final AxeItem KELPITE_AXE = register("kelpite_axe",
            new AxeItem(CamsToolMaterials.KELP_TOOLS, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(CamsToolMaterials.KELP_TOOLS, 4 , -2.4f))));

    public static final ShovelItem KELPITE_SHOVEL = register("kelpite_shovel",
            new ShovelItem(CamsToolMaterials.KELP_TOOLS, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(CamsToolMaterials.KELP_TOOLS, 3 , -2.4f))));

    public static final HoeItem KELPITE_HOE = register("kelpite_hoe",
            new HoeItem(CamsToolMaterials.KELP_TOOLS, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(CamsToolMaterials.KELP_TOOLS, 0 , -2.4f))));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, CamsSigmaMod.id(name), item);
    }

    public static void load() {}
}
