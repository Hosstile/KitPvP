package us.introducedpvp;

import org.bukkit.plugin.java.JavaPlugin;

import us.introducedpvp.kitpvp.commands.adminCommand.kp;
import us.introducedpvp.kitpvp.commands.maincommand.KitPvP;

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
		
	}

	private void registerEvents() {
		// TODO Auto-generated method stub
		
	}

	private void registerCommands() {

		getCommand("kitpvp").setExecutor(new KitPvP(this));
		getCommand("kp").setExecutor(new kp(this));
		
	}
	
}
