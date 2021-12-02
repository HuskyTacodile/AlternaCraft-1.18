package com.huskytacodile.alternacraft.world.gen;

import com.huskytacodile.alternacraft.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    FOSSIL(Lazy.of(ModBlocks.FOSSIL_ORE), 5, 25, 52, 3),
    PAINITE(Lazy.of(ModBlocks.PAINITE_ORE), 3, 7, 13, 2),
    TITANIUM(Lazy.of(ModBlocks.TITANIUM_ORE), 5, 20, 65, 5);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }


    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
