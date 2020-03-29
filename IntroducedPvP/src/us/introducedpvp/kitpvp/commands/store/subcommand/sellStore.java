package us.introducedpvp.kitpvp.commands.store.subcommand;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import us.introducedpvp.kitpvp.GUIS.StoreBuy;
import us.introducedpvp.kitpvp.GUIS.StoreSell;
import us.introducedpvp.kitpvp.executors.SubCommand;

public class sellStore extends SubCommand{

	public sellStore(SubCommand parent) {
		super(parent);

	}

	@Override
	public void execute(CommandSender player, String[] args) {
	Player p = (Player) player;
	
	StoreSell.openInventory(p);
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
		return "kitpvp.buystore";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "buy";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
