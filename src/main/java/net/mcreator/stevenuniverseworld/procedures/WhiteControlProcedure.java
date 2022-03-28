package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class WhiteControlProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure WhiteControl!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency sourceentity for procedure WhiteControl!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		String tag = "";
		if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
			((TameableEntity) entity).setTamed(true);
			((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
		}
	}
}
