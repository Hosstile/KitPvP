package us.introducedpvp.kitpvp.commands.maincommand;

import us.introducedpvp.kitpvp.commands.maincommand.subcommands.kits;
import us.introducedpvp.kitpvp.executors.Command;

public class KitPvP extends Command {

	public KitPvP(us.introducedpvp.IntroducedPvP IntroducedPvP) {
		
		super(IntroducedPvP, "kitpvp");
		
		this.registerSubCommand("kits", new kits(this));
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
		return "kitpvp.use";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "kitpvp";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
