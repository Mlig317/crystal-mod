package net.griell.crystalmod.entity.client;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Crystal<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart crystal;
	private final ModelPart middle;
	private final ModelPart bottom;
	private final ModelPart triangle;
	private final ModelPart triangle6;
	private final ModelPart triangle7;
	private final ModelPart triangle8;
	private final ModelPart top;
	private final ModelPart triangle5;
	private final ModelPart triangle3;
	private final ModelPart triangle4;
	private final ModelPart triangle2;

	public Crystal(ModelPart root) {
		this.crystal = root.getChild("crystal");
		this.middle = crystal.getChild("middle");
		this.bottom = crystal.getChild("bottom");
		this.triangle = bottom.getChild("triangle");
		this.triangle6 = bottom.getChild("triangle6");
		this.triangle7 = bottom.getChild("triangle7");
		this.triangle8 = bottom.getChild("triangle8");
		this.top = crystal.getChild("top");
		this.triangle5 = top.getChild("triangle5");
		this.triangle3 = top.getChild("triangle3");
		this.triangle4 = top.getChild("triangle4");
		this.triangle2 = top.getChild("triangle2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition crystal = partdefinition.addOrReplaceChild("crystal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition middle = crystal.addOrReplaceChild("middle", CubeListBuilder.create().texOffs(12, 68).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition bottom = crystal.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 11.0F));

		PartDefinition triangle = bottom.addOrReplaceChild("triangle", CubeListBuilder.create().texOffs(0, 28).addBox(-8.0F, -2.1962F, 0.2679F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 22).addBox(-7.0F, -4.1962F, 0.2679F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-6.0F, -6.1962F, 0.2679F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 46).addBox(-5.0F, -8.1962F, 0.2679F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 34).addBox(-4.0F, -10.1962F, 0.2679F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 64).addBox(-3.0F, -12.1962F, 0.2679F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-2.0F, -14.1962F, 0.2679F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 62).addBox(-1.0F, -16.1962F, 0.2679F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -3.0F, 0.5236F, 0.0F, -3.1416F));

		PartDefinition triangle6 = bottom.addOrReplaceChild("triangle6", CubeListBuilder.create().texOffs(0, 8).addBox(-8.0F, -2.1962F, -2.2679F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 2).addBox(-7.0F, -4.1962F, -2.2679F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 36).addBox(-6.0F, -6.1962F, -2.2679F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 52).addBox(-5.0F, -8.1962F, -2.2679F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 58).addBox(-4.0F, -10.1962F, -2.2679F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(-3.0F, -12.1962F, -2.2679F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(66, 66).addBox(-2.0F, -14.1962F, -2.2679F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 70).addBox(-1.0F, -16.1962F, -2.2679F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -19.0F, -0.5236F, 0.0F, -3.1416F));

		PartDefinition triangle7 = bottom.addOrReplaceChild("triangle7", CubeListBuilder.create().texOffs(0, 4).addBox(-8.0F, -2.1962F, 0.2679F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 32).addBox(-7.0F, -4.1962F, 0.2679F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -6.1962F, 0.2679F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 50).addBox(-5.0F, -8.1962F, 0.2679F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 56).addBox(-4.0F, -10.1962F, 0.2679F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 62).addBox(-3.0F, -12.1962F, 0.2679F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 66).addBox(-2.0F, -14.1962F, 0.2679F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 70).addBox(-1.0F, -16.1962F, 0.2679F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -5.0F, -11.0F, 0.0F, -1.5708F, -2.618F));

		PartDefinition triangle8 = bottom.addOrReplaceChild("triangle8", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.1962F, -2.2679F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-7.0F, -4.1962F, -2.2679F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 26).addBox(-6.0F, -6.1962F, -2.2679F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 48).addBox(-5.0F, -8.1962F, -2.2679F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-4.0F, -10.1962F, -2.2679F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 62).addBox(-3.0F, -12.1962F, -2.2679F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 66).addBox(-2.0F, -14.1962F, -2.2679F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 68).addBox(-1.0F, -16.1962F, -2.2679F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -5.0F, -11.0F, 0.0F, -1.5708F, 2.618F));

		PartDefinition top = crystal.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 11.0F));

		PartDefinition triangle5 = top.addOrReplaceChild("triangle5", CubeListBuilder.create().texOffs(0, 12).addBox(-8.0F, -2.1962F, -2.2679F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 6).addBox(-7.0F, -4.1962F, -2.2679F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-6.0F, -6.1962F, -2.2679F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 52).addBox(-5.0F, -8.1962F, -2.2679F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 58).addBox(-4.0F, -10.1962F, -2.2679F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-3.0F, -12.1962F, -2.2679F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 16).addBox(-2.0F, -14.1962F, -2.2679F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 70).addBox(-1.0F, -16.1962F, -2.2679F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, -19.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition triangle3 = top.addOrReplaceChild("triangle3", CubeListBuilder.create().texOffs(0, 20).addBox(-8.0F, -1.3301F, -0.2321F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 14).addBox(-7.0F, -3.3301F, -0.2321F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-6.0F, -5.3301F, -0.2321F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 42).addBox(-5.0F, -7.3301F, -0.2321F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 60).addBox(-4.0F, -9.3301F, -0.2321F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 8).addBox(-3.0F, -11.3301F, -0.2321F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 24).addBox(-2.0F, -13.3301F, -0.2321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 54).addBox(-1.0F, -15.3301F, -0.2321F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, -3.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition triangle4 = top.addOrReplaceChild("triangle4", CubeListBuilder.create().texOffs(0, 16).addBox(-8.0F, -1.6962F, -3.134F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 10).addBox(-7.0F, -3.6962F, -3.134F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 40).addBox(-6.0F, -5.6962F, -3.134F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 38).addBox(-5.0F, -7.6962F, -3.134F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-4.0F, -9.6962F, -3.134F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 4).addBox(-3.0F, -11.6962F, -3.134F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 20).addBox(-2.0F, -13.6962F, -3.134F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 70).addBox(-1.0F, -15.6962F, -3.134F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -12.0F, -11.0F, 0.0F, 1.5708F, 0.5236F));

		PartDefinition triangle2 = top.addOrReplaceChild("triangle2", CubeListBuilder.create().texOffs(0, 24).addBox(-8.0F, -2.1962F, 0.2679F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 18).addBox(-7.0F, -4.1962F, 0.2679F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 44).addBox(-6.0F, -6.1962F, 0.2679F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 54).addBox(-5.0F, -8.1962F, 0.2679F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 28).addBox(-4.0F, -10.1962F, 0.2679F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 12).addBox(-3.0F, -12.1962F, 0.2679F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 66).addBox(-2.0F, -14.1962F, 0.2679F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 70).addBox(-1.0F, -16.1962F, 0.2679F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -12.0F, -11.0F, 0.0F, 1.5708F, -0.5236F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		crystal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return crystal;
	}
}