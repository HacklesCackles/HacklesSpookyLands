package com.hacklesgaming.hacklesspookylands.entity.client;

import com.hacklesgaming.hacklesspookylands.HacklesSpookyLands;
import com.hacklesgaming.hacklesspookylands.entity.custom.InchwormEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

    public class InchwormModel extends GeoModel<InchwormEntity> {
        @Override
        public ResourceLocation getModelResource(InchwormEntity object) {
            return new ResourceLocation(HacklesSpookyLands.MOD_ID, "geo/inchworm.geo.json");
        }

        @Override
        public ResourceLocation getTextureResource(InchwormEntity object) {
            return new ResourceLocation(HacklesSpookyLands.MOD_ID, "textures/entity/inchworm.png");
        }

        @Override
        public ResourceLocation getAnimationResource(InchwormEntity animatable) {
            return new ResourceLocation(HacklesSpookyLands.MOD_ID, "animations/inchworm.animation.json");
        }
    }

