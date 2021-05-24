package me.GreyShows.TutorialPlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (player.hasPermission("tutorialplugin.fly")) {
				
				if (player.getAllowFlight()) {
					player.setAllowFlight(false);
					player.sendMessage(ChatColor.DARK_RED + "Flight has been disabled!");
				} else {
					player.setAllowFlight(true);
					player.sendMessage(ChatColor.DARK_GREEN + "Flight has been enabled!");
				}
			} else {
				player.sendMessage(ChatColor.DARK_RED + "You do not have permission to use this command!");
			}
		}
		return false;
	}

}
