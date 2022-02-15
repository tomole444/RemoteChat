package me.tomle.remotechat.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class remoteCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        try{
            if(sender.hasPermission("remotechat.remote")) {
                Player p = Bukkit.getPlayer(args[0]);
                ArrayList<String> message = new ArrayList<>();
                for (int i = 1; i < args.length; i++) {
                    message.add(args[i]);
                }
                p.chat(String.join(" ", message));
            }else{
                Player sendp = (Player) sender;
                sendp.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You don't have the Permission \"remotechat.remote\"");
            }
        }catch (Exception e){
            if(sender instanceof Player p){
                p.sendMessage("This Player is currently not online");
            }else{
                System.out.println("This Player is currently not online");
            }
        }
        return true;
    }
}
