package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.entity.SapphireEntity;
import net.mcreator.stevenuniverseworld.entity.RubyEntity;
import net.mcreator.stevenuniverseworld.entity.GarnetEntity;
import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class PinkFreedomProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure PinkFreedom!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency sourceentity for procedure PinkFreedom!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof GarnetEntity.CustomEntity == true) {
			{
				Entity _ent = sourceentity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"summon stevenuniverseworld:garnet ~ ~ ~");
				}
			}
			if (!entity.world.isRemote())
				entity.remove();
		} else if (entity instanceof RubyEntity.CustomEntity == true) {
			{
				Entity _ent = sourceentity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"summon stevenuniverseworld:ruby ~ ~ ~");
				}
			}
			if (!entity.world.isRemote())
				entity.remove();
		} else if (entity instanceof SapphireEntity.CustomEntity == true) {
			{
				Entity _ent = sourceentity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"summon stevenuniverseworld:sapphire ~ ~ ~");
				}
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
