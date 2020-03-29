package us.introducedpvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import us.introducedpvp.kitpvp.Events.InventoryListen;
import us.introducedpvp.kitpvp.Events.PlayerBreak;
import us.introducedpvp.kitpvp.Events.PlayerJoin;
import us.introducedpvp.kitpvp.Events.PlayerLeave;
import us.introducedpvp.kitpvp.commands.adminCommand.kp;
import us.introducedpvp.kitpvp.commands.maincommand.KitPvP;
import us.introducedpvp.kitpvp.commands.store.StoreCMD;
import us.introducedpvp.kitpvp.files.SpawnLocation;

public class IntroducedPvP extends JavaPlugin {

	public IntroducedPvP inst;
	
	public void onEnable() {
		inst = this;
		handler();
		
	}
	
	public void onDisable() {
		inst = null;
		
	}
	
	private void handler() {
		
		registerCommands();
		registerEvents();
		registerCfg();
		
	}
	
	private void registerCfg() {
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		SpawnLocation.init(getDataFolder());
		
	}

	private void registerEvents() {
		org.bukkit.plugin.PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new InventoryListen(), this);
		pm.registerEvents(new PlayerLeave(), this);
		pm.registerEvents(new PlayerJoin(), this);
		pm.registerEvents(new PlayerBreak(), this);
		
	}

	private void registerCommands() {

		getCommand("kitpvp").setExecutor(new KitPvP(this));
		getCommand("kp").setExecutor(new kp(this));
		getCommand("kpstore").setExecutor(new StoreCMD(this));
		
	}
	
}
