package com.huskytacodile.alternacraft;

import com.huskytacodile.alternacraft.block.ModBlocks;
import com.huskytacodile.alternacraft.client.render.entity.JWGAFemaleSpinoRenderer;
import com.huskytacodile.alternacraft.entities.ModEntityTypes;
import com.huskytacodile.alternacraft.item.ModItems;
import com.huskytacodile.alternacraft.util.ModItemProperties;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Alternacraft.MOD_ID)
public class Alternacraft {
    public static final String MOD_ID = "alternacraft";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Alternacraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);


        eventBus.addListener(this::setup);
        eventBus.addListener(this::registerRenderers);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        GeckoLib.initialize();

    }
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void registerRenderers(final EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ModEntityTypes.JWGAFEMALESPINO.get(), manager -> new JWGAFemaleSpinoRenderer(manager));

        ModItemProperties.makeBow(ModItems.PAINITE_BOW.get());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
