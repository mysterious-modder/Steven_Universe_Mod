package net.mcreator.stevenuniverseworld.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.stevenuniverseworld.StevenuniverseworldMod;

import java.util.Map;

public class SapphireLukyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StevenuniverseworldMod.LOGGER.warn("Failed to load dependency entity for procedure SapphireLuky!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
			if (((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null) instanceof LivingEntity)
				((LivingEntity) ((entity instanceof TameableEntity) ? ((TameableEntity) entity).getOwner() : null))
						.addPotionEffect(new EffectInstance(Effects.LUCK, (int) 5, (int) 4));
		}
	}
}
