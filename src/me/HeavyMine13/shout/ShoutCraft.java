package me.HeavyMine13.shout;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ShoutCraft extends JavaPlugin
{
  public void onEnable()
  {
	    Logger log = getLogger();
	    log.info(" You are running Version 2.0 Alert, By HeavyMine13! Have Fun!");
  }

  public void onDisable()
  {
  }

  public boolean onCommand(CommandSender sender, Command cmd, String currentAlias, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("alert"))
    if(args.length < 1) {
            sender.sendMessage("Not enough arguments!");
            return false;
         }
    {
      if (sender.hasPermission("Alert.Shout"))
      {
        StringBuilder message = new StringBuilder();
        if (args.length > 0) {
          message.append(args[0]);
          for (int i = 1; i < args.length; i++) {
            message.append(" ");
            message.append(args[i]);
          }
        }
        
        Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + 
          " [Alert] " + ChatColor.YELLOW + message );
      }
      else {
        StringBuilder message = new StringBuilder();
        if (args.length > 0) {
          message.append(args[0]);
          for (int i = 1; i < args.length; i++) {
            message.append(" ");
            message.append(args[i]);
          }
    }
}
        }


      return true;
  }
}
