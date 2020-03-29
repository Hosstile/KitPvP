package us.introducedpvp.kitpvp.management;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import us.introducedpvp.kitpvp.Interfaces.Messages;
import us.introducedpvp.kitpvp.utilities.utils;

public class Manager {

	public static void kickPlayers() {

		for (Player all : Bukkit.getOnlinePlayers()) {

			all.kickPlayer(utils.translate(Messages.prefix + "&cInstance has closed, please try rejoin"));
			return;
		}

	}

	public static void whitelist() {

		Bukkit.setWhitelist(true);
		return;

	}

	public static void whitelistADD(Player p) {
		Bukkit.getWhitelistedPlayers().add(p.getPlayer());
		return;
	}

}
