package com.huskytacodile.alternacraft.item;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.entities.ModEntityTypes;
import com.huskytacodile.alternacraft.item.custom.ModSpawnEggItem;
import com.huskytacodile.alternacraft.item.custom.PainiteBowItem;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Alternacraft.MOD_ID);

    public static final RegistryObject<ModSpawnEggItem> JWGAFEMALESPINO_SPAWN_EGG = ITEMS.register("jwgafemalespino_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JWGAFEMALESPINO, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> JWGAMALESPINO_SPAWN_EGG = ITEMS.register("jwgamalespino_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JWGAMALESPINO, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> INDOMINUS_FEMALE_SPAWN_EGG = ITEMS.register("indominus_female_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.INDOMINUS_FEMALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> INDOMINUS_MALE_SPAWN_EGG = ITEMS.register("indominus_male_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.INDOMINUS_MALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> INDOMINUS_ELEMENTAL_SPAWN_EGG = ITEMS.register("indominus_elemental_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.INDOMINUS_ELEMENTAL, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> ACRO_MALE_SPAWN_EGG = ITEMS.register("acro_male_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ACRO_MALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> ACRO_FEMALE_SPAWN_EGG = ITEMS.register("acro_female_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ACRO_FEMALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE = ITEMS.register("painite",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_SWORD = ITEMS.register("painite_sword",
            ()-> new SwordItem(ModItemTier.PAINITE, 2,1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_PICKAXE = ITEMS.register("painite_pickaxe",
            ()-> new PickaxeItem(ModItemTier.PAINITE, 1,-2f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_AXE = ITEMS.register("painite_axe",
            ()-> new AxeItem(ModItemTier.PAINITE, 4,-1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_SHOVEL = ITEMS.register("painite_shovel",
            ()-> new ShovelItem(ModItemTier.PAINITE, 0,-1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_HOE = ITEMS.register("painite_hoe",
            ()-> new HoeItem(ModItemTier.PAINITE, 0,0f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<PainiteBowItem> PAINITE_BOW = ITEMS.register("painite_bow",
            () -> new PainiteBowItem(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
