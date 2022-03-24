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

import net.mcreator.stevenuniverseworld.entity.RubyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RubyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RubyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelruby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("stevenuniverseworld:textures/ruby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelruby extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Neck;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer RightArm_r2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer LeftArm_r2;
		private final ModelRenderer Chestplate;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer Chestplate_r1;
		private final ModelRenderer Chestplate_r2;
		private final ModelRenderer Chestplate_r3;
		private final ModelRenderer CalaCintura;
		private final ModelRenderer Cala2_r1;
		private final ModelRenderer Cala1_r1;
		private final ModelRenderer RightLeg;
		private final ModelRenderer Cala_r1;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer Cala_r2;

		public Modelruby() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.6F, 7.5F, -0.5F);
			Head.setTextureOffset(20, 9).addBox(-2.1F, -4.4F, -1.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(10, 14).addBox(-4.1F, -4.4F, -1.5F, 2.0F, 5.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-4.1F, -7.4F, -1.5F, 8.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 9).addBox(1.9F, -4.4F, -1.5F, 2.0F, 5.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 23).addBox(-2.1F, -4.4F, 2.5F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			Neck = new ModelRenderer(this);
			Neck.setRotationPoint(2.5F, 32.1F, 1.0F);
			Neck.setTextureOffset(0, 9).addBox(-2.5F, -24.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-1.9F, 10.3F, 0.0F);
			setRotationAngle(RightArm, 0.0F, 0.0F, 0.0436F);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(2.5634F, 3.7463F, 0.0461F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.2618F);
			RightArm_r1.setTextureOffset(0, 30).addBox(-4.8732F, -2.4641F, -1.0461F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			RightArm_r2 = new ModelRenderer(this);
			RightArm_r2.setRotationPoint(2.5634F, 3.7463F, 0.0461F);
			RightArm.addChild(RightArm_r2);
			setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.829F);
			RightArm_r2.setTextureOffset(36, 13).addBox(-5.4054F, -1.34F, -1.0461F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(3.0F, 10.3F, 0.0F);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(-2.5025F, 3.8546F, 0.0461F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.2618F);
			LeftArm_r1.setTextureOffset(8, 31).addBox(2.7406F, -2.5534F, -1.0461F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			LeftArm_r2 = new ModelRenderer(this);
			LeftArm_r2.setRotationPoint(-2.5025F, 3.8546F, 0.0461F);
			LeftArm.addChild(LeftArm_r2);
			setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.829F);
			LeftArm_r2.setTextureOffset(32, 38).addBox(3.3875F, -1.5749F, -1.0461F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Chestplate = new ModelRenderer(this);
			Chestplate.setRotationPoint(0.0F, 24.0F, 0.0F);
			Chestplate.setTextureOffset(22, 0).addBox(-2.0F, -11.0F, -1.5F, 5.0F, 3.0F, 3.0F, 0.0F, false);
			Chestplate.setTextureOffset(10, 9).addBox(-2.0F, -14.9F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			Chestplate.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
			cube_r1.setTextureOffset(36, 24).addBox(-2.3701F, 1.2354F, -1.5461F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			Chestplate.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
			cube_r2.setTextureOffset(38, 0).addBox(1.4166F, 1.2099F, -1.5461F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			Chestplate_r1 = new ModelRenderer(this);
			Chestplate_r1.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			Chestplate.addChild(Chestplate_r1);
			setRotationAngle(Chestplate_r1, 0.2618F, 0.0F, 0.0F);
			Chestplate_r1.setTextureOffset(26, 18).addBox(-2.4975F, -2.7364F, 0.7031F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			Chestplate_r2 = new ModelRenderer(this);
			Chestplate_r2.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			Chestplate.addChild(Chestplate_r2);
			setRotationAngle(Chestplate_r2, 0.0F, -1.5621F, 0.0F);
			Chestplate_r2.setTextureOffset(0, 0).addBox(-1.0779F, -3.1083F, 1.4572F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Chestplate_r2.setTextureOffset(0, 3).addBox(-1.043F, -3.1083F, -2.5427F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Chestplate_r3 = new ModelRenderer(this);
			Chestplate_r3.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			Chestplate.addChild(Chestplate_r3);
			setRotationAngle(Chestplate_r3, -0.2618F, 0.0F, 0.0F);
			Chestplate_r3.setTextureOffset(28, 6).addBox(-2.4975F, -2.7126F, -1.7922F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			CalaCintura = new ModelRenderer(this);
			CalaCintura.setRotationPoint(0.0F, 24.0F, 0.0F);
			CalaCintura.setTextureOffset(23, 22).addBox(-2.0499F, -8.3049F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			Cala2_r1 = new ModelRenderer(this);
			Cala2_r1.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			CalaCintura.addChild(Cala2_r1);
			setRotationAngle(Cala2_r1, 0.0F, 0.0F, 1.4835F);
			Cala2_r1.setTextureOffset(32, 9).addBox(1.7239F, -2.4851F, -1.5461F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			Cala1_r1 = new ModelRenderer(this);
			Cala1_r1.setRotationPoint(0.4975F, -9.8454F, 0.0461F);
			CalaCintura.addChild(Cala1_r1);
			setRotationAngle(Cala1_r1, 0.0F, 0.0F, -1.4835F);
			Cala1_r1.setTextureOffset(35, 18).addBox(-3.7136F, -2.4552F, -1.5461F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.0F, 18.0F, 0.0F);
			RightLeg.setTextureOffset(24, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(32, 34).addBox(-1.0F, 5.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			Cala_r1 = new ModelRenderer(this);
			Cala_r1.setRotationPoint(1.4975F, -3.8454F, 0.0461F);
			RightLeg.addChild(Cala_r1);
			setRotationAngle(Cala_r1, 0.0F, 0.0F, 0.1309F);
			Cala_r1.setTextureOffset(24, 27).addBox(-2.3139F, 3.4723F, -1.5461F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.0F, 18.0F, 0.0F);
			LeftLeg.setTextureOffset(16, 31).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(33, 30).addBox(-1.0F, 5.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			Cala_r2 = new ModelRenderer(this);
			Cala_r2.setRotationPoint(-1.5025F, -3.8454F, 0.0461F);
			LeftLeg.addChild(Cala_r2);
			setRotationAngle(Cala_r2, 0.0F, 0.0F, -0.1309F);
			Cala_r2.setTextureOffset(12, 25).addBox(-0.6651F, 3.5279F, -1.5461F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			Chestplate.render(matrixStack, buffer, packedLight, packedOverlay);
			CalaCintura.render(matrixStack, buffer, packedLight, packedOverlay);
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
