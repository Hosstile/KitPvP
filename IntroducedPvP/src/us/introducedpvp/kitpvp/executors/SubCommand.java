package us.introducedpvp.kitpvp.executors;

import org.bukkit.command.CommandSender;

import us.introducedpvp.IntroducedPvP;

public abstract class SubCommand {

	private SubCommand parent;

	public SubCommand(SubCommand parent) {
		this.parent = parent;
	}

	public SubCommand getParent() {
		return this.parent;
	}

	public IntroducedPvP getIntroducedPvP() {
		if (this instanceof Command) {
			return ((Command) this).getIntroducedPvP();
		}
		return null;
	}

	public abstract void execute(CommandSender player, String args[]);

	public abstract String getDescription();

	public abstract String getUsage();

	public abstract String getPermission();

	public abstract String getName();

	public abstract boolean consoleUse();

}