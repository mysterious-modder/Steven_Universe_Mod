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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure StevenStress!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double Vida = 0;
		Vida = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1);
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d((entity.getPosX()), (entity.getPosY()), (entity.getPosZ())), Vector2f.ZERO,
							(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon stevenuniverseworld:pink_steven_future");
		}
		if (((Entity) world
				.getEntitiesWithinAABB(PinkStevenFutureEntity.CustomEntity.class,
						new AxisAlignedBB((entity.getPosX()) - (2 / 2d), (entity.getPosY()) - (2 / 2d), (entity.getPosZ()) - (2 / 2d),
								(entity.getPosX()) + (2 / 2d), (entity.getPosY()) + (2 / 2d), (entity.getPosZ()) + (2 / 2d)),
						null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) instanceof LivingEntity)
			((LivingEntity) ((Entity) world
					.getEntitiesWithinAABB(PinkStevenFutureEntity.CustomEntity.class,
							new AxisAlignedBB((entity.getPosX()) - (2 / 2d), (entity.getPosY()) - (2 / 2d), (entity.getPosZ()) - (2 / 2d),
									(entity.getPosX()) + (2 / 2d), (entity.getPosY()) + (2 / 2d), (entity.getPosZ()) + (2 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null))).setHealth((float) Vida);
	}
}
