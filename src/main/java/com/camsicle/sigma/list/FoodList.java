package com.camsicle.sigma.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent KELP_FOOD_COMPONENT = new FoodComponent.Builder().nutrition(1000)
            .nutrition(4)
            .saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 30 , 1), 1.0F)
            .build();
}
