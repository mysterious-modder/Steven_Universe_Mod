package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class SummonPinkGemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure SummonPinkGem!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency itemstack for procedure SummonPinkGem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double Summon = 0;
		Summon = Math.round(Math.random());
		if (Summon == 0) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"summon stevenuniverseworld:pink_steven");
				}
			}
		}
		(itemstack).shrink((int) 1);
	}
}
