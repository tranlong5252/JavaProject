package net.minefs.tranlong5252.cmd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hello implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("hello")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                sender.sendMessage(ChatColor.YELLOW + "Hello world, " + ChatColor.GREEN + player.getDisplayName());
            } else {
                sender.sendMessage(ChatColor.YELLOW + "Hello world " + sender.getName());
            }
            return true;
        }
        return false;
    }
}
