
package net.mcreator.stevenuniverseworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.stevenuniverseworld.StevenuniverseworldModElements;

@StevenuniverseworldModElements.ModElement.Tag
public class WhiteDiamondStaffItem extends StevenuniverseworldModElements.ModElement {
	@ObjectHolder("stevenuniverseworld:white_diamond_staff")
	public static final Item block = null;

	public WhiteDiamondStaffItem(StevenuniverseworldModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 66;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WhiteDiamondItem.block));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("white_diamond_staff"));
	}
}
