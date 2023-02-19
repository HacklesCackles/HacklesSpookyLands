package com.hacklesgaming.hacklesspookylands.item;

import com.hacklesgaming.hacklesspookylands.HacklesSpookyLands;
import com.hacklesgaming.hacklesspookylands.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HacklesSpookyLands.MOD_ID);

    public static final RegistryObject<Item> INCHWORM_SPAWN_EGG = ITEMS.register("inchworm_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INCHWORM,  0x5e8600, 0xb3ff00,
                    new Item.Properties()));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
