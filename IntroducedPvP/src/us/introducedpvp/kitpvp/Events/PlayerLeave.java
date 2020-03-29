package us.introducedpvp.kitpvp.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import us.introducedpvp.kitpvp.GameManager.Game;
import us.introducedpvp.kitpvp.utilities.utils;

public class PlayerLeave implements Listener{
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		
		e.setQuitMessage(utils.translate("&b&l- &8&l| &7 " + e.getPlayer().getName()));
		
		Player p = (Player) e.getPlayer();
		
		p.getInventory().clear();
		Game.removePlayer(p);
		return;
		
	}

}
