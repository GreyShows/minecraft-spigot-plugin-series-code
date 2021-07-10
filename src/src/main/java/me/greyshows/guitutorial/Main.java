package me.greyshows.guitutorial;

import me.greyshows.guitutorial.Commands.OpenGUI;
import me.greyshows.guitutorial.Events.OnInventoryClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();
        registerEvents();

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands() {
        getCommand("gui").setExecutor(new OpenGUI());
    }

    public void registerEvents() {
        getServer().getPluginManager().registerEvents(new OnInventoryClickEvent(), this);
    }

}
