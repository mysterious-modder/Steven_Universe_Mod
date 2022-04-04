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
		Head.setTextureOffset(0, 0).addBox(-4.5F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Upper = new ModelRenderer(this);
		Upper.setRotationPoint(0.5F, 5.0F, 0.0F);
		Upper.setTextureOffset(32, 30).addBox(-9.5F, -4.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Upper.setTextureOffset(32, 20).addBox(7.5F, -4.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Upper.setTextureOffset(32, 10).addBox(-1.5F, -4.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Upper.setTextureOffset(32, 0).addBox(-1.5F, -4.0F, -9.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		Medium = new ModelRenderer(this);
		Medium.setRotationPoint(0.0F, 11.0F, 0.0F);
		Medium.setTextureOffset(24, 26).addBox(-5.0F, -4.0F, -5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Medium.setTextureOffset(16, 26).addBox(4.0F, -4.0F, -5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Medium.setTextureOffset(8, 26).addBox(4.0F, -4.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Medium.setTextureOffset(0, 26).addBox(-5.0F, -4.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		Lower = new ModelRenderer(this);
		Lower.setRotationPoint(0.0F, 18.0F, 0.0F);
		Lower.setTextureOffset(24, 16).addBox(-3.0F, -4.0F, 1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Lower.setTextureOffset(16, 16).addBox(2.0F, -4.0F, 1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Lower.setTextureOffset(8, 16).addBox(-3.0F, -4.0F, -3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		Lower.setTextureOffset(0, 16).addBox(2.0F, -4.0F, -3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Upper.rotateAngleY = f2 / 20.f;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Lower.rotateAngleY = f2 / 20.f;
		this.Medium.rotateAngleY = f2;
	}
}