
package net.mcreator.stevenuniverseworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.stevenuniverseworld.StevenuniverseworldModElements;

@StevenuniverseworldModElements.ModElement.Tag
public class BlueDiamondSickleItem extends StevenuniverseworldModElements.ModElement {
	@ObjectHolder("stevenuniverseworld:blue_diamond_sickle")
	public static final Item block = null;

	public BlueDiamondSickleItem(StevenuniverseworldModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 2f;
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
				return Ingredient.fromStacks(new ItemStack(BlueDiamondItem.block));
			}
		}, 0, -2f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("blue_diamond_sickle"));
	}
}
