package com.huskytacodile.alternacraft.entities;

import com.huskytacodile.alternacraft.Alternacraft;

import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Alternacraft.MOD_ID);

    public static final RegistryObject<EntityType<JWGAFemaleSpinoEntity>> JWGAFEMALESPINO =
            ENTITY_TYPES.register("jwgafemalespino",
                    () -> EntityType.Builder.of(JWGAFemaleSpinoEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "jwgafemalespino").toString()));

    public static final RegistryObject<EntityType<IndominusMaleEntity>> INDOMINUS_MALE =
            ENTITY_TYPES.register("indominus_male",
                    () -> EntityType.Builder.of(IndominusMaleEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indominus_male").toString()));

    public static final RegistryObject<EntityType<IndominusFemaleEntity>> INDOMINUS_FEMALE =
            ENTITY_TYPES.register("indominus_female",
                    () -> EntityType.Builder.of(IndominusFemaleEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indominus_female").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
