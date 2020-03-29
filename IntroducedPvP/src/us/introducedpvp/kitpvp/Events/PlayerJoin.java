package us.introducedpvp.kitpvp.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import us.introducedpvp.kitpvp.GameManager.Game;
import us.introducedpvp.kitpvp.utilities.utils;

public class PlayerJoin implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {

		e.setJoinMessage(utils.translate("&b&l+ &8&l| &7 " + e.getPlayer().getName()));

		Player p = (Player) e.getPlayer();

		p.getInventory().addItem(Game.kitselect);
		
		Game.addPlayer(p);
		return;

	}

}
