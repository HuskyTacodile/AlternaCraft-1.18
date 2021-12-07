package com.huskytacodile.alternacraft.events;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.entities.IndominusFemaleEntity;
import com.huskytacodile.alternacraft.entities.IndominusMaleEntity;
import com.huskytacodile.alternacraft.entities.JWGAFemaleSpinoEntity;
import com.huskytacodile.alternacraft.entities.ModEntityTypes;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Alternacraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.JWGAFEMALESPINO.get(), JWGAFemaleSpinoEntity.attributes().build());
        event.put(ModEntityTypes.INDOMINUS_FEMALE.get(), IndominusFemaleEntity.attributes().build());
        event.put(ModEntityTypes.INDOMINUS_MALE.get(), IndominusMaleEntity.attributes().build());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        SpawnEggItem.eggs();
    }
}