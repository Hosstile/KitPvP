package us.introducedpvp.kitpvp.GUIS;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import us.introducedpvp.kitpvp.Interfaces.Messages;
import us.introducedpvp.kitpvp.utilities.utils;

public class StoreBuy {
	
	public static Inventory inv = Bukkit.createInventory(null, 27, utils.translate("&b&lIntroducedPvP &7&l- &f&lBUY-STORE"));
	
	
	public static void openInventory(Player p) {
		p.openInventory(inv);
		p.sendMessage(utils.translate(Messages.prefix + "&7Opening in-game store!"));
		return;
	}

}
