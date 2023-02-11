package com.hacklesgaming.hacklesspookylands.event;

import com.hacklesgaming.hacklesspookylands.HacklesSpookyLands;
import com.hacklesgaming.hacklesspookylands.entity.ModEntityTypes;
import com.hacklesgaming.hacklesspookylands.entity.custom.InchwormEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = HacklesSpookyLands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.INCHWORM.get(), InchwormEntity.setAttributes());
        }
    }
}
