package us.introducedpvp.kitpvp.commands.store;

import us.introducedpvp.kitpvp.commands.store.subcommand.openStore;
import us.introducedpvp.kitpvp.commands.store.subcommand.sellStore;
import us.introducedpvp.kitpvp.executors.Command;

public class StoreCMD extends Command{

	public StoreCMD(us.introducedpvp.IntroducedPvP IntroducedPvP) {
		super(IntroducedPvP, "kpstore");
		// TODO Auto-generated constructor stub
		this.registerSubCommand("sell", new sellStore(this));
		this.registerSubCommand("buy", new openStore(this));
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
		return "kitpvp.store";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "store";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
