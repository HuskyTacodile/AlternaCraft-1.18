package com.huskytacodile.alternacraft.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ALTERNACRAFT_GROUP = new CreativeModeTab("alternacraftTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FOSSIL.get());
        }
    };
}
