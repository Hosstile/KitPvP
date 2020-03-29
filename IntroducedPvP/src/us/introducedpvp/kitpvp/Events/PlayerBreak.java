package us.introducedpvp.kitpvp.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import us.introducedpvp.kitpvp.GameManager.Game;

public class PlayerBreak implements Listener{
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		
		if(Game.kitpvpPlayers.containsKey(e.getPlayer().getUniqueId())) {
			
			e.setCancelled(true); return;
			
		} else {
			return;
		}
		
	}

}
