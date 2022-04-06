package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class StevenHealProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure StevenHeal!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"effect give @e minecraft:regeneration 5 4");
			}
		}
	}
}
