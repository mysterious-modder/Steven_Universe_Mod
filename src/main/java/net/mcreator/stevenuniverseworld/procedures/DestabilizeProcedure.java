package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class DestabilizeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure Destabilize!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		String tag = "";
		if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("stevenuniverseworld:light")).contains(entity.getType()) == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"kill");
				}
			}
		} else if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("stevenuniverseworld:diamond_gem"))
				.contains(entity.getType()) == true) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 40);
		}
	}
}
