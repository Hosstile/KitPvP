package us.introducedpvp.kitpvp.commands.adminCommand;

import us.introducedpvp.kitpvp.commands.adminCommand.subcommands.kickall;
import us.introducedpvp.kitpvp.executors.Command;

public class kp extends Command {

	public kp(us.introducedpvp.IntroducedPvP IntroducedPvP) {
		super(IntroducedPvP, "kp");
		// TODO Auto-generated constructor stub
		this.registerSubCommand("kickall", new kickall(this));
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
		return "kp";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
