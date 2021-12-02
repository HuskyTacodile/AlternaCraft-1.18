package com.huskytacodile.alternacraft.block;

import com.huskytacodile.alternacraft.Alternacraft;

import com.huskytacodile.alternacraft.item.ModCreativeModeTab;
import com.huskytacodile.alternacraft.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Alternacraft.MOD_ID);



    public static final RegistryObject<Block> FOSSIL_ORE = registerBlock("fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PAINITE_ORE = registerBlock("painite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
