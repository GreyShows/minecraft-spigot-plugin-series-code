package me.greyshows.guitutorial.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class OnInventoryClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "GUI TUTORIAL")) {
            Player player = (Player) e.getWhoClicked();

            switch(e.getCurrentItem().getType()) {
                case TNT:
                    player.closeInventory();
                    player.setHealth(0.0);
                    player.sendMessage(ChatColor.DARK_RED + "Well this is what you wanted right?");
                    break;
                case COOKED_BEEF:
                    player.closeInventory();
                    player.setFoodLevel(25);
                    player.sendMessage("You got your food good luck out there!");
                    break;
                case NETHERITE_SWORD:
                    player.closeInventory();
                    player.getInventory().addItem(new ItemStack(Material.NETHERITE_SWORD));
                    player.sendMessage("You got your sword now kill those mobs!");
                    break;
            }

            e.setCancelled(true);
        }
    }
}
