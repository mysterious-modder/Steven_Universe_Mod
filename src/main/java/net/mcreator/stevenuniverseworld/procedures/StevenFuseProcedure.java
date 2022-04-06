package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.entity.StevenUniverseEntity;
import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class StevenFuseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency world for procedure StevenFuse!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency x for procedure StevenFuse!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency y for procedure StevenFuse!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency z for procedure StevenFuse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure StevenFuse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((((Entity) world
				.getEntitiesWithinAABB(StevenUniverseEntity.CustomEntity.class,
						new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) == true) {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
