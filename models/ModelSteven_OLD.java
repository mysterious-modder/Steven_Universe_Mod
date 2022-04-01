// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSteven_OLD extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Hair_r1;
	private final ModelRenderer Hair_r2;
	private final ModelRenderer Hair_r3;
	private final ModelRenderer Hair_r4;
	private final ModelRenderer Hair_r5;
	private final ModelRenderer Hair_r6;
	private final ModelRenderer Hair_r7;
	private final ModelRenderer Hair_r8;
	private final ModelRenderer Hair_r9;
	private final ModelRenderer Hair_r10;
	private final ModelRenderer Hair_r11;
	private final ModelRenderer Hair_r12;
	private final ModelRenderer Head_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer Chestplate;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelSteven_OLD() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 9.0F, -0.5F);
		Head.setTextureOffset(0, 20).addBox(-2.0F, -5.0F, -1.1F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(9, 36).addBox(-2.5F, -2.0F, -2.1F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(12, 20).addBox(-2.5F, -3.0F, 0.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 20).addBox(1.5F, -3.0F, 0.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 11).addBox(-3.5F, -5.9F, 1.5F, 7.0F, 6.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(17, 6).addBox(-2.5F, -6.9F, -0.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		Hair_r1 = new ModelRenderer(this);
		Hair_r1.setRotationPoint(3.6746F, -1.9773F, 3.0396F);
		Head.addChild(Hair_r1);
		setRotationAngle(Hair_r1, -0.5876F, 0.0002F, -0.6742F);
		Hair_r1.setTextureOffset(21, 44).addBox(-7.5F, -4.5F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r1.setTextureOffset(33, 50).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r2 = new ModelRenderer(this);
		Hair_r2.setRotationPoint(0.9408F, -3.4462F, 4.0719F);
		Head.addChild(Hair_r2);
		setRotationAngle(Hair_r2, -0.0224F, -0.8084F, -0.466F);
		Hair_r2.setTextureOffset(12, 41).addBox(-4.5F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r2.setTextureOffset(44, 0).addBox(-4.5F, -2.5F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r2.setTextureOffset(42, 47).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r3 = new ModelRenderer(this);
		Hair_r3.setRotationPoint(0.8554F, -1.716F, 5.4858F);
		Head.addChild(Hair_r3);
		setRotationAngle(Hair_r3, -0.224F, -0.5125F, -0.5629F);
		Hair_r3.setTextureOffset(51, 50).addBox(-1.5F, 0.5F, -3.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r4 = new ModelRenderer(this);
		Hair_r4.setRotationPoint(0.8337F, -0.5595F, 3.5944F);
		Head.addChild(Hair_r4);
		setRotationAngle(Hair_r4, 1.8495F, 0.2115F, 1.1466F);
		Hair_r4.setTextureOffset(12, 47).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r5 = new ModelRenderer(this);
		Hair_r5.setRotationPoint(2.9833F, -4.5639F, 1.8304F);
		Head.addChild(Hair_r5);
		setRotationAngle(Hair_r5, 0.5081F, -1.0183F, -1.1387F);
		Hair_r5.setTextureOffset(21, 50).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r6 = new ModelRenderer(this);
		Hair_r6.setRotationPoint(-1.4289F, -5.5365F, 4.3969F);
		Head.addChild(Hair_r6);
		setRotationAngle(Hair_r6, 0.5566F, -0.1056F, -1.4374F);
		Hair_r6.setTextureOffset(46, 13).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r7 = new ModelRenderer(this);
		Hair_r7.setRotationPoint(3.8496F, -1.3986F, 4.5193F);
		Head.addChild(Hair_r7);
		setRotationAngle(Hair_r7, 0.8851F, -0.5384F, -1.2723F);
		Hair_r7.setTextureOffset(22, 38).addBox(-0.5F, -8.5F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r7.setTextureOffset(52, 30).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r8 = new ModelRenderer(this);
		Hair_r8.setRotationPoint(1.46F, -6.1781F, 3.3167F);
		Head.addChild(Hair_r8);
		setRotationAngle(Hair_r8, 0.2874F, -0.3944F, 0.2968F);
		Hair_r8.setTextureOffset(20, 0).addBox(-3.8F, -2.5F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r8.setTextureOffset(0, 51).addBox(-0.8F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r9 = new ModelRenderer(this);
		Hair_r9.setRotationPoint(1.9373F, -6.2308F, 0.9147F);
		Head.addChild(Hair_r9);
		setRotationAngle(Hair_r9, 1.268F, -0.6575F, -0.9164F);
		Hair_r9.setTextureOffset(43, 41).addBox(-2.5F, 2.5F, 2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r9.setTextureOffset(0, 39).addBox(-3.5F, -1.5F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r9.setTextureOffset(48, 19).addBox(-0.5F, 1.5F, 0.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r10 = new ModelRenderer(this);
		Hair_r10.setRotationPoint(-2.2543F, -6.0597F, 2.7589F);
		Head.addChild(Hair_r10);
		setRotationAngle(Hair_r10, 0.9674F, -0.6939F, -0.2108F);
		Hair_r10.setTextureOffset(43, 33).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r11 = new ModelRenderer(this);
		Hair_r11.setRotationPoint(-3.2329F, -4.1086F, 1.9225F);
		Head.addChild(Hair_r11);
		setRotationAngle(Hair_r11, 0.3707F, -0.7058F, -0.1439F);
		Hair_r11.setTextureOffset(41, 27).addBox(-1.5F, -1.2F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Hair_r12 = new ModelRenderer(this);
		Hair_r12.setRotationPoint(3.0F, -4.4F, 4.0F);
		Head.addChild(Hair_r12);
		setRotationAngle(Hair_r12, 0.5236F, -0.6109F, -0.3927F);
		Hair_r12.setTextureOffset(0, 45).addBox(-4.5F, -0.5F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r12.setTextureOffset(43, 7).addBox(-8.5F, 0.5F, -0.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r12.setTextureOffset(33, 44).addBox(-5.5F, 1.5F, 0.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r12.setTextureOffset(34, 38).addBox(-3.5F, -4.5F, -0.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Hair_r12.setTextureOffset(52, 36).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -2.3852F, -1.3228F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, -1.0472F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(17, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-3.4291F, 10.1796F, 0.5F);
		setRotationAngle(RightArm, 3.1416F, 0.0F, 3.1416F);
		RightArm.setTextureOffset(0, 29).addBox(0.3671F, 0.8215F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(50, 25).addBox(1.0F, 6.8F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(-0.3331F, 0.3517F, 0.0F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -1.0472F);
		RightArm_r1.setTextureOffset(53, 3).addBox(-0.55F, -0.567F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(3.4F, 10.2F, 0.5F);
		LeftArm.setTextureOffset(29, 28).addBox(0.3381F, 0.8011F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		LeftArm.setTextureOffset(50, 25).addBox(1.1709F, 6.7796F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(0.1378F, 0.3314F, 0.0F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -1.0472F);
		LeftArm_r1.setTextureOffset(12, 53).addBox(-0.8F, -1.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		Chestplate = new ModelRenderer(this);
		Chestplate.setRotationPoint(0.0F, 24.0F, 0.0F);
		Chestplate.setTextureOffset(0, 0).addBox(-3.5F, -15.0F, -1.0F, 7.0F, 8.0F, 3.0F, 0.0F, false);
		Chestplate.setTextureOffset(18, 18).addBox(-3.5F, -15.0F, -2.0F, 7.0F, 8.0F, 2.0F, 0.0F, false);
		Chestplate.setTextureOffset(15, 28).addBox(-3.0F, -14.4F, -2.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		Chestplate.setTextureOffset(20, 13).addBox(-3.0F, -12.0F, 1.4F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		Chestplate.setTextureOffset(36, 20).addBox(-2.7F, -13.7F, -3.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 17.0F, 0.0F);
		RightLeg.setTextureOffset(34, 10).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(42, 53).addBox(-1.5F, 6.0F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 17.0F, 0.0F);
		LeftLeg.setTextureOffset(32, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(52, 44).addBox(-1.5F, 6.0F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		Chestplate.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}