package com.hacklesgaming.hacklesspookylands.item;

import com.hacklesgaming.hacklesspookylands.HacklesSpookyLands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HacklesSpookyLands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab SPOOKY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SPOOKY_TAB = event.registerCreativeModeTab(new ResourceLocation(HacklesSpookyLands.MOD_ID, "spooky_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.INCHWORM_SPAWN_EGG.get())).title(Component.literal("Spooky")).build());
    }
}
