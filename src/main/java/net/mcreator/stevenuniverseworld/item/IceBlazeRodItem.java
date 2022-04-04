
package net.mcreator.stevenuniverseworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.stevenuniverseworld.StevenuniverseworldModElements;

@StevenuniverseworldModElements.ModElement.Tag
public class IceBlazeRodItem extends StevenuniverseworldModElements.ModElement {
	@ObjectHolder("stevenuniverseworld:ice_blaze_rod")
	public static final Item block = null;

	public IceBlazeRodItem(StevenuniverseworldModElements instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("ice_blaze_rod");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
