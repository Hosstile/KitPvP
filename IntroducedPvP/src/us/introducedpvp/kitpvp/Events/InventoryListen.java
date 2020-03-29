package us.introducedpvp.kitpvp.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import us.introducedpvp.kitpvp.GUIS.KitSelection;

public class InventoryListen implements Listener {

	@EventHandler
	public void onClick(PlayerInteractEvent e) {

		Player p = e.getPlayer();
		if (((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
				&& (p.getItemInHand().getType().equals(Material.CHEST)))) {

			KitSelection.openInventory(p);
			e.setCancelled(true);
			return;

		}

	}
}
