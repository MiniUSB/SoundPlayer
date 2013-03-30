package me.miniusb.unusedSounds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(sender.hasPermission("unusedsounds.cathiss")){
            if(commandLabel.equalsIgnoreCase("cathiss") ) {
                if(Bukkit.getPlayer(args[0]) == null) {
                sender.sendMessage(ChatColor.RED + "[UnusedSounds] That player is not online!");
                return true;
                }else{
                Player player = Bukkit.getPlayer(args[0]);
                player.getWorld().playSound(player.getLocation(), Sound.CAT_HISS, 1, 1);
                player.sendMessage(ChatColor.AQUA + "[UnusedSounds] Played sound 'cathiss' for" + player);
                }
              }
              }
        return false;
            }
          }
