package us.introducedpvp.kitpvp.commands.maincommand.subcommands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import us.introducedpvp.kitpvp.executors.SubCommand;
import us.introducedpvp.kitpvp.utilities.utils;

public class kits extends SubCommand {

	public kits(SubCommand parent) {
		super(parent);
	}

	@Override
	public void execute(CommandSender player, String[] args) {
	
		Player p = (Player) player;
		
		p.sendMessage("");
		p.sendMessage(utils.translate("     &f&l< " + "&b&lKitPvP" + " &f&l>     "));
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage(utils.translate("&f&lKits&7: &3PVP&8, &3DAILY&8, &3ARCHER&8, &3FISHERMAN"));
		p.sendMessage("");
		return;
		
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
		return "";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "kits";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
