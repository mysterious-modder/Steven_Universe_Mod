package net.mcreator.stevenuniverseworld.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.stevenuniverseworld.entity.PinkStevenFutureEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PinkStevenFutureRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PinkStevenFutureEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSteven_Pink_FUTURE(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("stevenuniverseworld:textures/pink_steven_future.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSteven_Pink_FUTURE extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer hair_r1;
		private final ModelRenderer hair_r2;
		private final ModelRenderer hair_r3;
		private final ModelRenderer hair_r4;
		private final ModelRenderer Hair_r5;
		private final ModelRenderer Hair_r6;
		private final ModelRenderer Hair_r7;
		private final ModelRenderer Hair_r8;
		private final ModelRenderer Hair_r9;
		private final ModelRenderer Hair_r10;
		private final ModelRenderer Hair_r11;
		private final ModelRenderer Hair_r12;
		private final ModelRenderer Hair_r13;
		private final ModelRenderer Hair_r14;
		private final ModelRenderer Head_r1;
		private final ModelRenderer Neck;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer Chestplate;
		private final ModelRenderer hip;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModelSteven_Pink_FUTURE() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.5F);
			Head.setTextureOffset(32, 33).addBox(-2.0F, -5.0F, -2.1F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(0, 38).addBox(-2.5F, -2.0F, -3.1F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(22, 6).addBox(-2.5F, -3.0F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(22, 1).addBox(1.5F, -3.0F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hair_r1 = new ModelRenderer(this);
			hair_r1.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(hair_r1);
			setRotationAngle(hair_r1, -1.0381F, -0.198F, 2.9338F);
			hair_r1.setTextureOffset(19, 53).addBox(-2.5789F, 3.6304F, 4.4861F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			hair_r2 = new ModelRenderer(this);
			hair_r2.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(hair_r2);
			setRotationAngle(hair_r2, -1.2558F, -0.4771F, -2.7179F);
			hair_r2.setTextureOffset(10, 55).addBox(-0.3957F, 2.6304F, 5.5046F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			hair_r3 = new ModelRenderer(this);
			hair_r3.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(hair_r3);
			setRotationAngle(hair_r3, -1.0363F, 0.1925F, 2.2991F);
			hair_r3.setTextureOffset(36, 42).addBox(-7.2862F, 4.1304F, 0.0871F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			hair_r3.setTextureOffset(36, 42).addBox(-6.2862F, -0.8696F, 0.0871F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			hair_r3.setTextureOffset(54, 28).addBox(-4.5362F, 3.6304F, 3.3371F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			hair_r4 = new ModelRenderer(this);
			hair_r4.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(hair_r4);
			setRotationAngle(hair_r4, -1.0053F, -0.0514F, 2.6113F);
			hair_r4.setTextureOffset(25, 55).addBox(-0.909F, 0.6577F, 3.9611F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Hair_r5 = new ModelRenderer(this);
			Hair_r5.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r5);
			setRotationAngle(Hair_r5, 1.8648F, 0.7856F, 3.0611F);
			Hair_r5.setTextureOffset(52, 52).addBox(-0.0757F, -4.14F, -8.1604F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Hair_r5.setTextureOffset(52, 52).addBox(-1.0757F, -0.14F, -4.1604F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Hair_r5.setTextureOffset(49, 47).addBox(-2.0757F, -0.14F, -6.1604F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r6 = new ModelRenderer(this);
			Hair_r6.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r6);
			setRotationAngle(Hair_r6, 0.8649F, 0.6175F, 2.9993F);
			Hair_r6.setTextureOffset(9, 50).addBox(-2.7288F, 4.0252F, -5.4485F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r7 = new ModelRenderer(this);
			Hair_r7.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r7);
			setRotationAngle(Hair_r7, 0.5352F, 0.1881F, -2.0599F);
			Hair_r7.setTextureOffset(30, 50).addBox(2.4137F, 3.6494F, -2.1191F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r8 = new ModelRenderer(this);
			Hair_r8.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r8);
			setRotationAngle(Hair_r8, 1.281F, 0.1408F, -2.096F);
			Hair_r8.setTextureOffset(52, 12).addBox(4.9389F, 0.3854F, -3.4456F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r8.setTextureOffset(48, 36).addBox(-0.0611F, 0.3854F, -3.4456F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r9 = new ModelRenderer(this);
			Hair_r9.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r9);
			setRotationAngle(Hair_r9, 0.7262F, -0.4523F, -0.7897F);
			Hair_r9.setTextureOffset(48, 23).addBox(2.9828F, -7.6416F, -0.6035F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r9.setTextureOffset(48, 23).addBox(1.9828F, -1.6416F, -0.6035F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r9.setTextureOffset(21, 47).addBox(1.9828F, -5.8916F, 1.3965F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Hair_r9.setTextureOffset(12, 44).addBox(1.9828F, -2.8916F, -0.6035F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Hair_r9.setTextureOffset(48, 6).addBox(1.9828F, -3.8916F, 0.3965F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Hair_r10 = new ModelRenderer(this);
			Hair_r10.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r10);
			setRotationAngle(Hair_r10, 0.7736F, 0.6273F, -1.8244F);
			Hair_r10.setTextureOffset(48, 41).addBox(3.2255F, 3.1519F, -0.6991F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Hair_r11 = new ModelRenderer(this);
			Hair_r11.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r11);
			setRotationAngle(Hair_r11, -0.684F, -1.3095F, 1.5529F);
			Hair_r11.setTextureOffset(44, 17).addBox(-1.9708F, -6.1191F, 3.2961F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Hair_r12 = new ModelRenderer(this);
			Hair_r12.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r12);
			setRotationAngle(Hair_r12, 1.2818F, -0.5278F, -0.2805F);
			Hair_r12.setTextureOffset(46, 0).addBox(-0.8063F, -0.8563F, 2.1535F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Hair_r13 = new ModelRenderer(this);
			Hair_r13.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Hair_r13);
			setRotationAngle(Hair_r13, 1.3424F, -0.1762F, -1.0846F);
			Hair_r13.setTextureOffset(45, 30).addBox(4.015F, -2.8312F, 1.3038F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Hair_r14 = new ModelRenderer(this);
			Hair_r14.setRotationPoint(0.0867F, -6.0112F, -1.1127F);
			Head.addChild(Hair_r14);
			setRotationAngle(Hair_r14, -0.7918F, -0.9602F, -1.2542F);
			Hair_r14.setTextureOffset(42, 50).addBox(-1.5F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			Head_r1 = new ModelRenderer(this);
			Head_r1.setRotationPoint(-0.0352F, 1.7452F, 0.1424F);
			Head.addChild(Head_r1);
			setRotationAngle(Head_r1, -1.0472F, 0.0F, 0.0F);
			Head_r1.setTextureOffset(19, 0).addBox(-0.4648F, -0.4302F, -5.3096F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Neck = new ModelRenderer(this);
			Neck.setRotationPoint(-0.0025F, 0.5F, 0.5461F);
			Neck.setTextureOffset(0, 52).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-3.8897F, 2.5895F, 0.0F);
			setRotationAngle(RightArm, 0.0F, 0.0F, 0.0F);
			RightArm.setTextureOffset(0, 25).addBox(-4.0603F, 0.3105F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(-2.1608F, 0.4853F, 0.5F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, -3.1416F, 0.0F, -1.5708F);
			RightArm_r1.setTextureOffset(40, 42).addBox(0.0505F, -2.05F, -1.5F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(4.0209F, 2.4796F, 0.0F);
			LeftArm.setTextureOffset(32, 20).addBox(-0.0709F, 0.4204F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(1.076F, 0.4654F, 0.25F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -1.5708F);
			LeftArm_r1.setTextureOffset(0, 43).addBox(-0.0969F, -1.095F, -2.25F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			Chestplate = new ModelRenderer(this);
			Chestplate.setRotationPoint(0.0F, 5.025F, -0.15F);
			Chestplate.setTextureOffset(0, 0).addBox(-4.0F, -4.025F, -0.85F, 8.0F, 10.0F, 3.0F, 0.0F, false);
			Chestplate.setTextureOffset(0, 13).addBox(-4.0F, -4.025F, -1.85F, 8.0F, 10.0F, 2.0F, 0.0F, false);
			Chestplate.setTextureOffset(32, 6).addBox(-3.5F, -3.425F, -2.35F, 7.0F, 5.0F, 1.0F, 0.0F, false);
			Chestplate.setTextureOffset(36, 12).addBox(-3.5F, -3.025F, 1.55F, 7.0F, 4.0F, 1.0F, 0.0F, false);
			hip = new ModelRenderer(this);
			hip.setRotationPoint(0.0F, 12.0F, 0.0F);
			hip.setTextureOffset(22, 0).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.2F, 13.0F, 0.0F);
			RightLeg.setTextureOffset(16, 24).addBox(-1.8F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(24, 42).addBox(-1.8F, 10.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.05F, 13.0F, 0.0F);
			LeftLeg.setTextureOffset(20, 9).addBox(-2.05F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(12, 39).addBox(-2.05F, 10.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			Chestplate.render(matrixStack, buffer, packedLight, packedOverlay);
			hip.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
