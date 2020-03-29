package us.introducedpvp.kitpvp.commands.maincommand.subcommands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import us.introducedpvp.kitpvp.GameManager.Game;
import us.introducedpvp.kitpvp.executors.SubCommand;

public class leave extends SubCommand{

	public leave(SubCommand parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(CommandSender player, String[] args) {
		Player p = (Player) player;
		
		Game.removePlayer(p);
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
		return "kitpvp.leave";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "leave";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
