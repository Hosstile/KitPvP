package us.introducedpvp.kitpvp.utilities;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class utils {

	public static String translate(String args) {

		return ChatColor.translateAlternateColorCodes('&', args);

	}

	public static void createHologram(Location l, String name) {
		ArmorStand am = (ArmorStand) l.getWorld().spawnEntity(l, EntityType.ARMOR_STAND);

		am.setArms(false);
		am.setGravity(false);
		am.setVisible(false);
		am.setCustomName(name);
		am.setCustomNameVisible(true);
	}

	public static void removeArmorStand(World world, String name) {
		for (Entity entity : world.getEntities()) {
			world.getEntitiesByClass(ArmorStand.class).forEach(Entity::remove);

		}
	}

}
