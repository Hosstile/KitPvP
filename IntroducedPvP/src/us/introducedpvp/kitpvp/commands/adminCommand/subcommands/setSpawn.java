package us.introducedpvp.kitpvp.commands.adminCommand.subcommands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import us.introducedpvp.kitpvp.Interfaces.Messages;
import us.introducedpvp.kitpvp.executors.SubCommand;
import us.introducedpvp.kitpvp.files.SpawnLocation;
import us.introducedpvp.kitpvp.utilities.utils;

public class setSpawn extends SubCommand{

	public setSpawn(SubCommand parent) {
		super(parent);

	}

	@Override
	public void execute(CommandSender player, String[] args) {
		
		Player p = (Player) player;
		
		if(!p.isOnGround()) {
			
			p.sendMessage(utils.translate(Messages.prefix + "&4&lYou must set spawn on a solid surface!"));
			return;
		}
		
		p.sendMessage(utils.translate(Messages.prefix + "&cYou have set spawn!"));


		SpawnLocation.spawnlocation.set("Spawn.Location.x", p.getLocation().getX());
		SpawnLocation.spawnlocation.set("Spawn.Location.y", p.getLocation().getY());
		SpawnLocation.spawnlocation.set("Spawn.Location.z", p.getLocation().getZ());
		SpawnLocation.spawnlocation.set("Spawn.Location.yaw", p.getLocation().getYaw());
		SpawnLocation.spawnlocation.set("Spawn.Location.pitch", p.getLocation().getPitch());
		SpawnLocation.spawnlocation.set("Spawn.Location.world", p.getLocation().getWorld().getName());
		
		
		SpawnLocation.savespawnlocation();
		
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getUsage() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getPermission() {
		// TODO Auto-generated method stub
		return "kp.setspawn";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "setspawn";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
