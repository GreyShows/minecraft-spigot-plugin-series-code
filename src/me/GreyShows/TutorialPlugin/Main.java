package me.GreyShows.TutorialPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.GreyShows.TutorialPlugin.commands.FlyCommand;
import me.GreyShows.TutorialPlugin.events.OnPlayerJoin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		registerCommands();
		registerEvents();
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "Plugin Enabled!");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "Plugin Disabled!");
	}
	
	public void registerCommands() {
		getCommand("fly").setExecutor(new FlyCommand());
	}
	
	public void registerEvents() {
		getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
	}

}
