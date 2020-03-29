package us.introducedpvp.kitpvp.GameManager;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import us.introducedpvp.kitpvp.Interfaces.Messages;
import us.introducedpvp.kitpvp.files.SpawnLocation;
import us.introducedpvp.kitpvp.utilities.ItemBuilder;
import us.introducedpvp.kitpvp.utilities.utils;

public class Game {

	public static ItemStack kitselect = new ItemBuilder(Material.CHEST).setName(utils.translate("&bKits")).toItemStack();
	
	public static HashMap<UUID, Player> kitpvpPlayers = new HashMap<UUID, Player>();

	public static void addPlayer(Player p) {

		if (kitpvpPlayers.get(p.getUniqueId()) != null) {

			p.sendMessage(utils.translate(Messages.prefix + "&4&lERROR&8: &7You're already connected!"));
			return;

		}

	

      int x = SpawnLocation.spawnlocation.getInt("Spawn.Location.x");
      int y = SpawnLocation.spawnlocation.getInt("Spawn.Location.y");
      int z = SpawnLocation.spawnlocation.getInt("Spawn.Location.z");
      float yaw = SpawnLocation.spawnlocation.getInt("Spawn.Location.yaw");
      float pitch = SpawnLocation.spawnlocation.getInt("Spawn.Location.pitch");
      World w = Bukkit.getWorld(SpawnLocation.spawnlocation.getString("Spawn.Location.world"));
		
      final Location l = new Location(w,x,y,z,yaw,pitch);
      
      p.teleport(l);
      p.sendMessage(utils.translate(Messages.prefix + "&bAutomatically &7teleporting you to the spawn!"));
		
		kitpvpPlayers.put(p.getUniqueId(), p);
		p.sendMessage(utils.translate(Messages.prefix + "&7Connected to kitpvp."));
		return;
	}

	public static void removePlayer(Player p) {

		if ((kitpvpPlayers.get(p.getUniqueId()) == null)) {

			p.sendMessage(utils.translate(Messages.prefix + "&4&lERROR&8: &7You're already un-connected!"));
			return;

		}

		kitpvpPlayers.remove(p.getUniqueId());
		p.sendMessage(utils.translate(Messages.prefix + "&7Un-connected from kitpvp."));
		return;
	}

}
