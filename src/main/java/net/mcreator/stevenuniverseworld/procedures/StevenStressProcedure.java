package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.stevenuniverseworld.entity.PinkStevenFutureEntity;
import net.mcreator.stevenuniverseworld.entity.GarnetEntity;
import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class StevenStressProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency world for procedure StevenStress!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency x for procedure StevenStress!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency y for procedure StevenStress!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency z for procedure StevenStress!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure StevenStress!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double Vida = 0;
		Vida = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1);
		if ((((Entity) world
				.getEntitiesWithinAABB(GarnetEntity.CustomEntity.class,
						new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"say I'll be fine");
				}
			}
		} else {
			if (!entity.world.isRemote())
				entity.remove();
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d((entity.getPosX()), (entity.getPosY()), (entity.getPosZ())),
								Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
										.withFeedbackDisabled(),
						"summon stevenuniverseworld:pink_steven_future");
			}
			if (((Entity) world
					.getEntitiesWithinAABB(PinkStevenFutureEntity.CustomEntity.class,
							new AxisAlignedBB((entity.getPosX()) - (10 / 2d), (entity.getPosY()) - (10 / 2d), (entity.getPosZ()) - (10 / 2d),
									(entity.getPosX()) + (10 / 2d), (entity.getPosY()) + (10 / 2d), (entity.getPosZ()) + (10 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) instanceof LivingEntity)
				((LivingEntity) ((Entity) world
						.getEntitiesWithinAABB(PinkStevenFutureEntity.CustomEntity.class,
								new AxisAlignedBB((entity.getPosX()) - (10 / 2d), (entity.getPosY()) - (10 / 2d), (entity.getPosZ()) - (10 / 2d),
										(entity.getPosX()) + (10 / 2d), (entity.getPosY()) + (10 / 2d), (entity.getPosZ()) + (10 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)))
								.setHealth((float) Vida);
		}
	}
}
