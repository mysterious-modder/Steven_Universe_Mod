package net.mcreator.stevenuniverseworld.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.stevenuniverseworld.entity.SnowBlazeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnowBlazeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnowBlazeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsnow_blaze(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("stevenuniverseworld:textures/snow_blaze.png");
					}
				};
			});
			RenderingRegistry.registerEntityRenderingHandler(SnowBlazeEntity.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsnow_blaze extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Upper;
		private final ModelRenderer Medium;
		private final ModelRenderer Lower;

		public Modelsnow_blaze() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.5F, 5.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Upper = new ModelRenderer(this);
			Upper.setRotationPoint(0.5F, 5.0F, 0.0F);
			Upper.setTextureOffset(32, 30).addBox(-10.0F, -4.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Upper.setTextureOffset(32, 20).addBox(7.0F, -4.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Upper.setTextureOffset(32, 10).addBox(-2.0F, -4.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Upper.setTextureOffset(32, 0).addBox(-2.0F, -4.0F, -9.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Medium = new ModelRenderer(this);
			Medium.setRotationPoint(0.0F, 11.0F, 0.0F);
			Medium.setTextureOffset(24, 26).addBox(-5.5F, -4.0F, -5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Medium.setTextureOffset(16, 26).addBox(3.5F, -4.0F, -5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Medium.setTextureOffset(8, 26).addBox(3.5F, -4.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Medium.setTextureOffset(0, 26).addBox(-5.5F, -4.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Lower = new ModelRenderer(this);
			Lower.setRotationPoint(0.0F, 18.0F, 0.0F);
			Lower.setTextureOffset(24, 16).addBox(-3.5F, -4.0F, 1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Lower.setTextureOffset(16, 16).addBox(1.5F, -4.0F, 1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Lower.setTextureOffset(8, 16).addBox(-3.5F, -4.0F, -3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			Lower.setTextureOffset(0, 16).addBox(1.5F, -4.0F, -3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Upper.render(matrixStack, buffer, packedLight, packedOverlay);
			Medium.render(matrixStack, buffer, packedLight, packedOverlay);
			Lower.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Upper.rotateAngleY = f2 / 20.f;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Lower.rotateAngleY = f2 / 20.f;
			this.Medium.rotateAngleY = f2;
		}
	}

}
