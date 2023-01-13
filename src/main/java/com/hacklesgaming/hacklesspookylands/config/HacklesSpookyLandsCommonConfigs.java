package com.hacklesgaming.hacklesspookylands.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class HacklesSpookyLandsCommonConfigs {

         public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
         public static final ForgeConfigSpec SPEC;

         //public static final ForgeConfigSpec.ConfigValue<Integer> building_spawn_rate;
         //public static final ForgeConfigSpec.ConfigValue<String> building_comment;

    static {
        BUILDER.push("Configs for Hackles Spooky Lands");

        // HERE DEFINE YOUR CONFIGS!

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
