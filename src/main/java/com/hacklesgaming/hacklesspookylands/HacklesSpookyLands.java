package com.hacklesgaming.hacklesspookylands;


import com.hacklesgaming.hacklesspookylands.entity.ModEntityTypes;
import com.hacklesgaming.hacklesspookylands.entity.client.InchwormRenderer;
import com.hacklesgaming.hacklesspookylands.item.ModCreativeModeTab;
import com.hacklesgaming.hacklesspookylands.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HacklesSpookyLands.MOD_ID)
public class HacklesSpookyLands {
    public static final String MOD_ID = "hacklesspookylands";
    private static final Logger LOGGER = LogUtils.getLogger();

    public HacklesSpookyLands() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);


        ModEntityTypes.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);


        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, HacklesSpookyLandsCommonConfigs.SPEC, "hacklesspookylands-common.toml");

        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, HacklesSpookyLandsClientConfigs.SPEC, "hacklesspookylands-client.toml");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModEntityTypes.INCHWORM.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
        });
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTab.SPOOKY_TAB) {
            event.accept(ModItems.INCHWORM_SPAWN_EGG);
        }

    }
        // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
        @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
        public static class ClientModEvents {
            @SubscribeEvent
            public static void onClientSetup(FMLClientSetupEvent event) {

                EntityRenderers.register(ModEntityTypes.INCHWORM.get(), InchwormRenderer::new);

            }
        }
    }

