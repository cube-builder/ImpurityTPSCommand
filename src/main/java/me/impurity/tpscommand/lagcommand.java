package me.impurity.tpscommand;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import me.impurity.tpscommand.Utils;

public class lagcommand  implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("[§r§bImpurity§r] §6TPS: " + Utils.getTps());
        return true;

    }
}