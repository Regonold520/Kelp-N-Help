package com.camsicle.sigma.init.worldgen;

import com.camsicle.sigma.CamsSigmaMod;
import com.camsicle.sigma.init.BlockInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> KELPITE_ORE_KEY = registerKey("kelpite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> kelpiteOreTargets = List.of(
                OreFeatureConfig.createTarget(deepslateReplacables, BlockInit.KELPITE_ORE.getDefaultState()));

        register(context, KELPITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(kelpiteOreTargets, 3));
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, CamsSigmaMod.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                   F feature,
                                                                                   FC featureConfig){
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }

}
