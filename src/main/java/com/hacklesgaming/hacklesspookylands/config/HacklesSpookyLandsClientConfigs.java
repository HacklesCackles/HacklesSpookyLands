package com.hacklesgaming.hacklesspookylands.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class HacklesSpookyLandsClientConfigs {

        public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
        public static final ForgeConfigSpec SPEC;

        static {
            BUILDER.push("Configs for Hackles Spooky Lands");

            // HERE DEFINE YOUR CONFIGS

            BUILDER.pop();
            SPEC = BUILDER.build();
        }
    }
