package com.huskytacodile.alternacraft.util;

import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Alternacraft.MOD_ID);

    public static final RegistryObject<SoundEvent> SPINO_ROAR1 =
            registerSoundEvent("spino_roar1");
    public static final RegistryObject<SoundEvent> SPINO_ROAR2 =
            registerSoundEvent("spino_roar2");
    public static final RegistryObject<SoundEvent> SPINO_ROAR3 =
            registerSoundEvent("spino_roar3");
    public static final RegistryObject<SoundEvent> SATELLITE_SPINO =
            registerSoundEvent("satellite_spino");
    public static final RegistryObject<SoundEvent> INDOMINUS_REX_ROAR1 =
            registerSoundEvent("indominus_rex_roar1");
    public static final RegistryObject<SoundEvent> INDOMINUS_REX_ROAR2 =
            registerSoundEvent("indominus_rex_roar2");
    public static final RegistryObject<SoundEvent> INDOMINUS_REX_GROWL =
            registerSoundEvent("indominus_rex_growl");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Alternacraft.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
