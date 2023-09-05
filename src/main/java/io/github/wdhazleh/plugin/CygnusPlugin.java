package io.github.wdhazleh.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class CygnusPlugin extends JavaPlugin {
	/**
	 * Plugin startup Logic
	 */
    @Override
    public void onEnable() {
        //getLogger().info("onEnable is called!");
        System.out.println("Cygnus plugin has launched successfully!");
    }
    /**
     * Plugin shutdown Logic
     */
    @Override
    public void onDisable() {
        //getLogger().info("onDisable is called!");
        System.out.println("Cygnus plugin disabled.");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(label.equalsIgnoreCase("cygnus")) {
    		// Handle console input
    		if(!(sender instanceof Player)) {
    			sender.sendMessage(ChatColor.RED + "You need to be a player to run this command");
    			return true;
    		} else {
        		if(args[0].equalsIgnoreCase("sort")) {
        			if(args.length == 2) {
        				sender.sendMessage("Sorting using the " + args[1] + " comparator");
        			} else if(args[2].equals("reverse")) {
        				sender.sendMessage("Sorting using the " + args[1] + "comparator in reverse");
        			} else {
        				sender.sendMessage(ChatColor.RED + "Error.");
        			}
        		}
        		return true;
    		}
    	}
    	
    	return false;
    }
}
