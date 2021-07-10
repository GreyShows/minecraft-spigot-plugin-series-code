package me.greyshows.guitutorial.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class OpenGUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, ChatColor.BLUE + "GUI TUTORIAL");

            ItemStack die = new ItemStack(Material.TNT);
            ItemStack food = new ItemStack(Material.COOKED_BEEF);
            ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);

            ItemMeta die_meta = die.getItemMeta();
            die_meta.setDisplayName(ChatColor.RED + "Die");
            ArrayList<String> die_lore = new ArrayList<>();
            die_lore.add(ChatColor.GREEN + "Click to die");
            die_meta.setLore(die_lore);
            die.setItemMeta(die_meta);

            ItemMeta food_meta = food.getItemMeta();
            food_meta.setDisplayName(ChatColor.AQUA + "Eat");
            ArrayList<String> food_lore = new ArrayList<>();
            food_lore.add(ChatColor.GREEN + "Click to Eat");
            food_meta.setLore(food_lore);
            food.setItemMeta(food_meta);

            ItemMeta sword_meta = sword.getItemMeta();
            sword_meta.setDisplayName(ChatColor.AQUA + "Sword");
            ArrayList<String> sword_lore = new ArrayList<>();
            sword_lore.add(ChatColor.GREEN + "Click to get a Sword");
            sword_meta.setLore(sword_lore);
            sword.setItemMeta(sword_meta);

            ItemStack[] menu_items = {die, food, sword};

            gui.setItem(0, die);
            gui.setItem(4, food);
            gui.setItem(8, sword);


            player.openInventory(gui);
        }

        return true;
    }
}
