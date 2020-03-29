package us.introducedpvp.kitpvp.commands.adminCommand.subcommands;

import org.bukkit.command.CommandSender;

import us.introducedpvp.kitpvp.executors.SubCommand;
import us.introducedpvp.kitpvp.management.Manager;
import us.introducedpvp.kitpvp.utilities.utils;

public class kickall extends SubCommand{

	public kickall(SubCommand parent) {
		super(parent);
	}

	@Override
	public void execute(CommandSender player, String[] args) {
		player.sendMessage(utils.translate("&4&lEXECUTE&8: &ckicking all players&7."));
		Manager.kickPlayers();
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
		return "kickall";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
