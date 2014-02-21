 package io.github.thejojo1001;

 import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

 public class HealPlugin extends JavaPlugin {

	 @Override
     public void onEnable() {
         getLogger().info("Heal Plugin has been enabled!");
     }	
	
	 @Override
     public void onDisable() {
    	 
     }
 
     public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		
    	 if (cmd.getName().equalsIgnoreCase("heal") && sender instanceof Player) {
    		 
    	     Player player = (Player) sender;
    	     
    	     player.setHealth(20.0); 
    	     player.sendMessage("Healed");
    	     
    	 return true;
    	 }
    	 
    	 return false;
    	 
     }
 
 }
 
