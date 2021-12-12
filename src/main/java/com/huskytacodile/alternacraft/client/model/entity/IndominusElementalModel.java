package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IndominusElementalModel extends AnimatedGeoModel {
    @Override
    public ResourceLocation getAnimationFileLocation(Object entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/indominus_female.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(Object entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/indominus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "textures/entity/indominus_elemental.png");
    }
}
