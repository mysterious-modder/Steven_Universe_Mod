package net.mcreator.stevenuniverseworld.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.item.PinkDiamondItem;
import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class DestabilizeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure Destabilize!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Destabilize!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		String tag = "";
		if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("stevenuniverseworld:light")).contains(entity.getType()) == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"kill");
				}
			}
		} else {
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PinkDiamondItem.block);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
		}
	}
}
