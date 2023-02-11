package com.hacklesgaming.hacklesspookylands.entity.client;

import com.hacklesgaming.hacklesspookylands.HacklesSpookyLands;
import com.hacklesgaming.hacklesspookylands.entity.custom.InchwormEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

    public class InchwormRenderer extends GeoEntityRenderer<InchwormEntity> {
        public InchwormRenderer(EntityRendererProvider.Context renderManager) {
            super(renderManager, new InchwormModel());
            this.shadowRadius = 0.3f;
        }

        @Override
        public ResourceLocation getTextureLocation(InchwormEntity instance) {
            return new ResourceLocation(HacklesSpookyLands.MOD_ID, "textures/entity/inchworm.png");
        }

        @Override
        public RenderType getRenderType(InchwormEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
            return super.getRenderType(animatable, texture, bufferSource, partialTick);
        }
}

