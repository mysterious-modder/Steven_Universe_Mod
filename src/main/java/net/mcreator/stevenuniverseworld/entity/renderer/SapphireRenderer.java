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

import net.mcreator.stevenuniverseworld.entity.SapphireEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SapphireRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SapphireEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsapphire(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("stevenuniverseworld:textures/sapphire.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsapphire extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Hair_r1;
		private final ModelRenderer Hair_r2;
		private final ModelRenderer Hair_r3;
		private final ModelRenderer Hair_r4;
		private final ModelRenderer Hair_r5;
		private final ModelRenderer Hair_r6;
		private final ModelRenderer Hair_r7;
		private final ModelRenderer Hair_r8;
		private final ModelRenderer Neck;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightHand_r1;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer RightArm_r2;
		private final ModelRenderer RightArm_r3;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftHand_r1;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer LeftArm_r2;
		private final ModelRenderer LeftArm_r3;
		private final ModelRenderer Chestplate;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer Chestplate_r1;
		private final ModelRenderer Chestplate_r2;
		private final ModelRenderer Dress;
		private final ModelRenderer Cala_r1;
		private final ModelRenderer Cala_r2;

		public Modelsapphire() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 5.1F, 0.1F);
			Head.setTextureOffset(58, 36).addBox(-2.0F, -5.0F, -2.1F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(11, 15).addBox(-3.6F, -8.0F, -2.0F, 7.0F, 5.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(60, 45).addBox(-2.6F, -6.0F, -3.1F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			Hair_r1 = new ModelRenderer(this);
			Hair_r1.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r1);
			setRotationAngle(Hair_r1, -1.6255F, 0.3006F, -1.7536F);
			Hair_r1.setTextureOffset(39, 18).addBox(-9.9246F, -5.5749F, 0.5348F, 7.0F, 4.0F, 3.0F, 0.0F, false);
			Hair_r2 = new ModelRenderer(this);
			Hair_r2.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r2);
			setRotationAngle(Hair_r2, -1.6255F, -0.3006F, 1.7536F);
			Hair_r2.setTextureOffset(46, 0).addBox(2.6616F, -5.5749F, 0.7145F, 7.0F, 4.0F, 3.0F, 0.0F, false);
			Hair_r2.setTextureOffset(32, 11).addBox(-6.3384F, -5.5749F, 1.7145F, 10.0F, 4.0F, 3.0F, 0.0F, false);
			Hair_r3 = new ModelRenderer(this);
			Hair_r3.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r3);
			setRotationAngle(Hair_r3, -1.6255F, 0.3006F, -1.7536F);
			Hair_r3.setTextureOffset(24, 27).addBox(-3.6689F, -5.5749F, 1.4348F, 10.0F, 4.0F, 3.0F, 0.0F, false);
			Hair_r4 = new ModelRenderer(this);
			Hair_r4.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r4);
			setRotationAngle(Hair_r4, 0.4363F, 0.0F, 0.0F);
			Hair_r4.setTextureOffset(0, 47).addBox(-3.1221F, 3.9835F, 1.2897F, 6.0F, 6.0F, 3.0F, 0.0F, false);
			Hair_r4.setTextureOffset(42, 43).addBox(-3.1221F, -7.0165F, 3.2897F, 6.0F, 11.0F, 3.0F, 0.0F, false);
			Hair_r5 = new ModelRenderer(this);
			Hair_r5.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r5);
			setRotationAngle(Hair_r5, 0.5236F, 0.0F, 0.0F);
			Hair_r5.setTextureOffset(24, 43).addBox(-3.1221F, -0.6161F, 2.2807F, 6.0F, 11.0F, 3.0F, 0.0F, false);
			Hair_r6 = new ModelRenderer(this);
			Hair_r6.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r6);
			setRotationAngle(Hair_r6, 0.1745F, 0.0F, 0.0F);
			Hair_r6.setTextureOffset(0, 0).addBox(-3.1221F, -10.9798F, 2.0269F, 6.0F, 19.0F, 3.0F, 0.0F, false);
			Hair_r7 = new ModelRenderer(this);
			Hair_r7.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r7);
			setRotationAngle(Hair_r7, 0.0F, 0.0F, 0.2182F);
			Hair_r7.setTextureOffset(12, 50).addBox(-5.5196F, -8.9953F, -3.4976F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Hair_r8 = new ModelRenderer(this);
			Hair_r8.setRotationPoint(-0.0779F, 6.446F, 1.4976F);
			Head.addChild(Hair_r8);
			setRotationAngle(Hair_r8, 0.0F, 0.0F, -0.2182F);
			Hair_r8.setTextureOffset(53, 50).addBox(4.52F, -9.0482F, -3.4976F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Neck = new ModelRenderer(this);
			Neck.setRotationPoint(2.2F, 29.1F, 1.1F);
			Neck.setTextureOffset(15, 0).addBox(-2.7F, -24.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-3.0F, 7.9F, 0.1F);
			setRotationAngle(RightArm, 0.0F, 0.0F, 0.0436F);
			RightHand_r1 = new ModelRenderer(this);
			RightHand_r1.setRotationPoint(3.0783F, 3.5151F, 1.4976F);
			RightArm.addChild(RightHand_r1);
			setRotationAngle(RightHand_r1, 0.0F, 0.0F, 0.1309F);
			RightHand_r1.setTextureOffset(0, 22).addBox(-6.0316F, 5.6281F, -2.5976F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(3.0783F, 3.5151F, 1.4976F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.3491F);
			RightArm_r1.setTextureOffset(54, 60).addBox(-4.6419F, 1.7769F, -2.0976F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			RightArm_r2 = new ModelRenderer(this);
			RightArm_r2.setRotationPoint(3.0783F, 3.5151F, 1.4976F);
			RightArm.addChild(RightArm_r2);
			setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.1745F);
			RightArm_r2.setTextureOffset(58, 60).addBox(-4.9136F, -2.8664F, -2.0976F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			RightArm_r3 = new ModelRenderer(this);
			RightArm_r3.setRotationPoint(3.0783F, 3.5151F, 1.4976F);
			RightArm.addChild(RightArm_r3);
			setRotationAngle(RightArm_r3, 0.0F, 0.0F, -0.0436F);
			RightArm_r3.setTextureOffset(12, 60).addBox(-5.8271F, -5.4302F, -3.0976F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(3.1F, 7.6F, 0.0F);
			setRotationAngle(LeftArm, 0.0F, 0.0F, 0.0436F);
			LeftHand_r1 = new ModelRenderer(this);
			LeftHand_r1.setRotationPoint(-3.0028F, 4.0809F, 1.5976F);
			LeftArm.addChild(LeftHand_r1);
			setRotationAngle(LeftHand_r1, 0.0F, 0.0F, -0.1309F);
			LeftHand_r1.setTextureOffset(0, 27).addBox(5.163F, 5.07F, -2.5976F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(-3.0028F, 4.0809F, 1.5976F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.3491F);
			LeftArm_r1.setTextureOffset(18, 27).addBox(3.8055F, 1.7145F, -2.0976F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			LeftArm_r2 = new ModelRenderer(this);
			LeftArm_r2.setRotationPoint(-3.0028F, 4.0809F, 1.5976F);
			LeftArm.addChild(LeftArm_r2);
			setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.1745F);
			LeftArm_r2.setTextureOffset(6, 22).addBox(4.0574F, -2.9846F, -2.0976F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			LeftArm_r3 = new ModelRenderer(this);
			LeftArm_r3.setRotationPoint(-3.0028F, 4.0809F, 1.5976F);
			LeftArm.addChild(LeftArm_r3);
			setRotationAngle(LeftArm_r3, 0.0F, 0.0F, -0.0436F);
			LeftArm_r3.setTextureOffset(59, 18).addBox(3.1729F, -5.4302F, -3.0976F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Chestplate = new ModelRenderer(this);
			Chestplate.setRotationPoint(0.0F, 24.0F, 0.0F);
			Chestplate.setTextureOffset(0, 27).addBox(-3.0F, -18.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
			Chestplate.setTextureOffset(38, 57).addBox(-1.9F, -12.9F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.0779F, -12.454F, 1.5976F);
			Chestplate.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
			cube_r1.setTextureOffset(24, 57).addBox(-2.7389F, -0.0097F, -3.5976F, 3.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-0.0779F, -12.454F, 1.5976F);
			Chestplate.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
			cube_r2.setTextureOffset(58, 7).addBox(-0.1229F, -0.112F, -3.5976F, 3.0F, 7.0F, 4.0F, 0.0F, false);
			Chestplate_r1 = new ModelRenderer(this);
			Chestplate_r1.setRotationPoint(-0.0779F, -12.454F, 1.5976F);
			Chestplate.addChild(Chestplate_r1);
			setRotationAngle(Chestplate_r1, 0.1658F, 0.0F, 0.0F);
			Chestplate_r1.setTextureOffset(50, 25).addBox(-2.0221F, -0.6379F, -1.0069F, 4.0F, 13.0F, 2.0F, 0.0F, false);
			Chestplate_r2 = new ModelRenderer(this);
			Chestplate_r2.setRotationPoint(-0.0779F, -12.454F, 1.5976F);
			Chestplate.addChild(Chestplate_r2);
			setRotationAngle(Chestplate_r2, -0.1658F, 0.0F, 0.0F);
			Chestplate_r2.setTextureOffset(0, 56).addBox(-1.8221F, -0.1257F, -3.9426F, 4.0F, 13.0F, 2.0F, 0.0F, false);
			Dress = new ModelRenderer(this);
			Dress.setRotationPoint(-2.3F, 18.0F, 0.0F);
			Dress.setTextureOffset(18, 0).addBox(-2.7F, -1.0F, -2.0F, 10.0F, 7.0F, 4.0F, 0.0F, false);
			Cala_r1 = new ModelRenderer(this);
			Cala_r1.setRotationPoint(2.2221F, -6.454F, 1.5976F);
			Dress.addChild(Cala_r1);
			setRotationAngle(Cala_r1, 0.1222F, 0.0F, 0.0F);
			Cala_r1.setTextureOffset(24, 34).addBox(-4.9221F, 5.4296F, -1.0852F, 10.0F, 7.0F, 2.0F, 0.0F, false);
			Cala_r2 = new ModelRenderer(this);
			Cala_r2.setRotationPoint(2.2221F, -6.454F, 1.5976F);
			Dress.addChild(Cala_r2);
			setRotationAngle(Cala_r2, -0.1222F, 0.0F, 0.0F);
			Cala_r2.setTextureOffset(0, 38).addBox(-4.9221F, 5.819F, -4.0863F, 10.0F, 7.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			Chestplate.render(matrixStack, buffer, packedLight, packedOverlay);
			Dress.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
