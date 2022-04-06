package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class StevenStressProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency world for procedure StevenStress!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure StevenStress!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d((entity.getPosX()), (entity.getPosY()), (entity.getPosZ())), Vector2f.ZERO,
							(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon stevenuniverseworld:pink_steven_future");
		}
	}
}
