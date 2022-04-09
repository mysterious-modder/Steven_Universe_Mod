package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.item.RosesShieldActivatedItem;
import net.mcreator.stevenuniverseworld.StevenuniverseworldModVariables;
import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class ResesShieldActivateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure ResesShieldActivate!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency itemstack for procedure ResesShieldActivate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double RosesShieldDamage = 0;
		if (itemstack.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem()) {
			RosesShieldDamage = ((itemstack).getDamage());
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(RosesShieldActivatedItem.block);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)).setDamage((int) RosesShieldDamage);
			{
				double _setval = 40;
				entity.getCapability(StevenuniverseworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pinkShieldTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
