package net.mcreator.stevenuniverseworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.item.WhiteDiamondStaffItem;
import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;
import java.util.HashMap;

public class WhiteControlProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
			Entity entity = event.getTarget();
			PlayerEntity sourceentity = event.getPlayer();
			if (event.getHand() != sourceentity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

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
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == WhiteDiamondStaffItem.block
				|| ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == WhiteDiamondStaffItem.block) {
			if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation("stevenuniverseworld:light")).contains(entity.getType())
					|| EntityTypeTags.getCollection().getTagByID(new ResourceLocation("stevenuniverseworld:diamond_gem"))
							.contains(entity.getType())) == true) {
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
		}
	}
}
