package com.terravolt.terrafauna.entity.client;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.terravolt.terrafauna.TerraFauna;
import com.terravolt.terrafauna.entity.custom.BeardedDragon;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class BeardedDragonModel<T extends BeardedDragon> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TerraFauna.MOD_ID, "bearded_dragon"), "main");

    private final ModelPart body;
    private final ModelPart head;
    public BeardedDragonModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = this.body.getChild("Head");
    }


    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -0.8029F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.8029F, -1.0F));

        PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 13).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6233F, 0.6059F, 1.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 15).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.263F, -0.1591F, -0.2071F, 1.5708F, -0.7897F, -0.5236F));

        PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 15).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2569F, -0.1591F, -1.6213F, 1.5708F, -0.7897F, -0.5236F));

        PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 15).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2569F, -0.1591F, -1.6213F, 1.5708F, 0.7897F, 0.5236F));

        PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 15).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.263F, -0.1591F, -0.2071F, 1.5708F, 0.7897F, 0.5236F));

        PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6233F, 0.6059F, 1.0F, 0.0F, 0.0F, 0.6981F));

        PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7071F, -0.8019F, -2.497F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7929F, -0.8019F, -2.497F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7071F, -0.8019F, -1.497F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0929F, -0.8019F, -1.797F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0929F, -0.8019F, -0.797F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0929F, -0.8019F, 0.203F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7929F, -0.8019F, -1.497F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7071F, -0.8019F, -0.497F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7929F, -0.8019F, -0.497F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7071F, -0.8019F, 0.503F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 16).addBox(-0.4571F, -0.5F, -0.003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7929F, -0.8019F, 0.503F, -0.8396F, -0.6358F, 2.6521F));

        PartDefinition Right_Front_Leg = body.addOrReplaceChild("Right_Front_Leg", CubeListBuilder.create().texOffs(12, 18).addBox(-1.7869F, 2.0279F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(-1.7F, -0.05F, 1.5F));

        PartDefinition cube_r18 = Right_Front_Leg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(1, 19).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2869F, 2.0279F, 0.5F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r19 = Right_Front_Leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(3, 19).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7869F, 2.0279F, 0.0F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r20 = Right_Front_Leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(3, 19).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7869F, 2.0279F, 0.0F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r21 = Right_Front_Leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 22).addBox(-0.0373F, -0.0244F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5672F));

        PartDefinition Right_Rear_leg = body.addOrReplaceChild("Right_Rear_leg", CubeListBuilder.create().texOffs(1, 22).addBox(-1.7869F, 2.0279F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(-1.7F, -0.05F, -3.5F));

        PartDefinition cube_r22 = Right_Rear_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(1, 21).addBox(-2.1F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8131F, 2.0279F, 0.0F, 0.0F, 1.5708F, -1.5708F));

        PartDefinition cube_r23 = Right_Rear_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(1, 21).addBox(-2.1F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8131F, 2.0279F, 0.0F, 0.0F, 1.5708F, -1.6144F));

        PartDefinition cube_r24 = Right_Rear_leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(1, 19).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 19).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2869F, 2.0279F, 0.5F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r25 = Right_Rear_leg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 9).addBox(-0.0373F, -0.0244F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5672F));

        PartDefinition Left_Front_Leg = body.addOrReplaceChild("Left_Front_Leg", CubeListBuilder.create().texOffs(12, 20).addBox(0.7869F, 2.0279F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(1.7F, -0.05F, 1.5F));

        PartDefinition cube_r26 = Left_Front_Leg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(3, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7869F, 2.0279F, 1.0F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r27 = Left_Front_Leg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(1, 19).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2869F, 2.0279F, 1.5F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r28 = Left_Front_Leg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(3, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7869F, 2.0279F, 1.0F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r29 = Left_Front_Leg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 22).addBox(-0.9627F, -0.0244F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5672F));

        PartDefinition Left_Rear_Leg = body.addOrReplaceChild("Left_Rear_Leg", CubeListBuilder.create().texOffs(7, 22).addBox(0.7869F, 2.0279F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(1.7F, -0.05F, -3.5F));

        PartDefinition cube_r30 = Left_Rear_Leg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(1, 21).addBox(-2.1F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2131F, 2.0279F, 0.0F, 0.0F, 1.5708F, -1.6144F));

        PartDefinition cube_r31 = Left_Rear_Leg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(1, 19).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6869F, 2.0279F, 0.5F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition cube_r32 = Left_Rear_Leg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(1, 21).addBox(-2.1F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2131F, 2.0279F, 0.0F, 0.0F, 1.5708F, -1.5708F));

        PartDefinition cube_r33 = Left_Rear_Leg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(16, 22).addBox(-0.9627F, -0.0244F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5672F));

        PartDefinition Tail_1 = body.addOrReplaceChild("Tail_1", CubeListBuilder.create().texOffs(14, 9).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 13).addBox(-1.0F, 0.0F, 3.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.75F, -3.0F));

        PartDefinition cube_r34 = Tail_1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 2).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 22).addBox(-1.0F, 0.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 6.0F, 0.0F, 0.0F, -0.7418F));

        PartDefinition cube_r35 = Tail_1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(0.0F, 0.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.7418F));

        PartDefinition Tail_2 = Tail_1.addOrReplaceChild("Tail_2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -5.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 1.0F, -1.45F));

        PartDefinition Tail_3 = Tail_2.addOrReplaceChild("Tail_3", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, -0.5F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, -5.1F));

        PartDefinition Head = body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 5).addBox(-1.5F, -1.0F, -0.15F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(20, 13).addBox(-1.0F, -0.9F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.15F, 2.25F));

        PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(9, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7284F, -0.2929F, 2.5899F, -0.7854F, -0.7854F, 0.0F));

        PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 14).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5858F, -0.2429F, 2.6971F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 16).addBox(-1.9142F, -0.9429F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.6642F, 0.0F, 2.5328F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r39 = Head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(16, 26).addBox(0.0F, 0.0739F, -0.7381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.7582F, -0.1619F, 1.7898F, -0.0852F, -0.0189F));

        PartDefinition cube_r40 = Head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(16, 26).addBox(-1.0F, 0.0858F, -0.6299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.65F, -0.15F, 1.7898F, 0.0852F, 0.0189F));

        PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(9, 15).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5093F, -0.3029F, -0.1607F, -0.0928F, 0.0924F, -0.7897F));

        PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(9, 15).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5093F, -0.3029F, -0.1607F, -0.0618F, -0.0617F, 0.7873F));

        PartDefinition Beard = Head.addOrReplaceChild("Beard", CubeListBuilder.create().texOffs(24, 29).addBox(-1.5F, -1.9659F, -0.2412F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.9662F, 0.452F, -2.8798F, 0.0F, 0.0F));

        PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offset(0.0178F, 0.0571F, 1.7536F));

        PartDefinition cube_r43 = Jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(23, 19).addBox(-1.6921F, -0.06F, -2.1556F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.3157F, -0.07F, 1.402F, 0.0F, -0.7854F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
    @Override
    public void setupAnim(BeardedDragon entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(BeardedDragonAnimation.walk, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, BeardedDragonAnimation.Idle, ageInTicks, 1f);
    }
    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }

    @Override
    public ModelPart root() {
        return body;
    }
}