package us.introducedpvp.kitpvp.GUIS;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import us.introducedpvp.kitpvp.Interfaces.Messages;
import us.introducedpvp.kitpvp.utilities.utils;

public class KitSelection {
	
	public static Inventory inv = Bukkit.createInventory(null, 27, utils.translate(" &f&l< &b&lKit Selector &f&l> "));
	
	
	public static void openInventory(Player p) {
		p.openInventory(inv);
		p.sendMessage(utils.translate(Messages.prefix + "&7Opening kit selector."));
		return;
	}

}
