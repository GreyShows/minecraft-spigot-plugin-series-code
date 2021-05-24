package me.GreyShows.TutorialPlugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener{

	@EventHandler
	public void OnPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.DARK_BLUE + "Welcome! There is " + player.getServer().getOnlinePlayers().size() + " player(s) online.");
	}
	
}
