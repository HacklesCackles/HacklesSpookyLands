package com.hacklesgaming.hacklesspookylands.entity;

import com.hacklesgaming.hacklesspookylands.HacklesSpookyLands;
import com.hacklesgaming.hacklesspookylands.entity.custom.InchwormEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HacklesSpookyLands.MOD_ID);

    public static final RegistryObject<EntityType<InchwormEntity>> INCHWORM =
            ENTITY_TYPES.register("inchworm",
                    () -> EntityType.Builder.of(InchwormEntity::new, MobCategory.CREATURE)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(HacklesSpookyLands.MOD_ID, "inchworm").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
