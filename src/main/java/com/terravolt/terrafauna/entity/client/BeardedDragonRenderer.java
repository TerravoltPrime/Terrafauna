package com.terravolt.terrafauna.entity.client;

import com.terravolt.terrafauna.TerraFauna;
import com.terravolt.terrafauna.entity.custom.BeardedDragon;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BeardedDragonRenderer extends MobRenderer<BeardedDragon, BeardedDragonModel<BeardedDragon>> {
    public BeardedDragonRenderer(EntityRendererProvider.Context context) {
        super(context, new BeardedDragonModel<>(context.bakeLayer(BeardedDragonModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(BeardedDragon entity) {
        return ResourceLocation.fromNamespaceAndPath(TerraFauna.MOD_ID, "textures/entity/bearded_dragon/bearded_dragon_orange.png");
    }

    @Override
    public void render(BeardedDragon entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}