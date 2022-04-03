
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
public class YellowDiamondSwordItem extends StevenuniverseworldModElements.ModElement {
	@ObjectHolder("stevenuniverseworld:yellow_diamond_sword")
	public static final Item block = null;

	public YellowDiamondSwordItem(StevenuniverseworldModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 398f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(YellowDiamondItem.block));
			}
		}, 3, -2.5f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("yellow_diamond_sword"));
	}
}
